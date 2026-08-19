package android.gov.nist.core;

import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class HostNameParser extends ParserCore {
    private static boolean stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    private static final char[] VALID_DOMAIN_LABEL_CHAR = {65533, '-', '.', '_'};

    public HostNameParser(String str) {
        this.lexer = new LexerCore("charLexer", str);
    }

    private boolean isIPv6Address(String str) {
        int iIndexOf = str.indexOf(Separators.COMMA);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        int iIndexOf3 = str.indexOf(59);
        if (iIndexOf2 == -1 || (iIndexOf3 != -1 && iIndexOf2 > iIndexOf3)) {
            iIndexOf2 = iIndexOf3;
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        String strSubstring = str.substring(0, iIndexOf2);
        int iIndexOf4 = strSubstring.indexOf(58);
        return (iIndexOf4 == -1 || strSubstring.indexOf(58, iIndexOf4 + 1) == -1) ? false : true;
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"foo.bar.com:1234", "proxima.chaplin.bt.co.uk", "129.6.55.181:2345", ":1234", "foo.bar.com:         1234", "foo.bar.com     :      1234   ", "MIK_S:1234"};
        for (int i10 = 0; i10 < 7; i10++) {
            try {
                HostPort hostPort = new HostNameParser(strArr2[i10]).hostPort(true);
                System.out.println("[" + hostPort.encode() + "]");
            } catch (ParseException e10) {
                System.out.println("exception text = " + e10.getMessage());
            }
        }
    }

    public void consumeDomainLabel() {
        if (ParserCore.debug) {
            dbg_enter("domainLabel");
        }
        try {
            this.lexer.consumeValidChars(VALID_DOMAIN_LABEL_CHAR);
        } finally {
            if (ParserCore.debug) {
                dbg_leave("domainLabel");
            }
        }
    }

    public Host host() {
        String strSubstring;
        boolean z6 = ParserCore.debug;
        if (z6) {
            dbg_enter("host");
        }
        try {
            if (this.lexer.lookAhead(0) == '[') {
                strSubstring = ipv6Reference();
            } else if (isIPv6Address(this.lexer.getRest())) {
                int ptr = this.lexer.getPtr();
                this.lexer.consumeValidChars(new char[]{65533, ':'});
                strSubstring = "[" + this.lexer.getBuffer().substring(ptr, this.lexer.getPtr()) + "]";
            } else {
                int ptr2 = this.lexer.getPtr();
                consumeDomainLabel();
                strSubstring = this.lexer.getBuffer().substring(ptr2, this.lexer.getPtr());
            }
            if (strSubstring.length() != 0) {
                Host host = new Host(strSubstring);
                if (z6) {
                    dbg_leave("host");
                }
                return host;
            }
            throw new ParseException(this.lexer.getBuffer() + ": Missing host name", this.lexer.getPtr());
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("host");
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:5:0x0009, B:7:0x0017, B:10:0x0020, B:12:0x0028, B:47:0x00a2, B:48:0x00cd, B:35:0x005c, B:37:0x0064, B:38:0x0069, B:40:0x0077, B:41:0x0099, B:42:0x009a), top: B:58:0x0009, inners: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00a2, please report this as an issue */
    public HostPort hostPort(boolean z6) {
        char cLookAhead;
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("hostPort");
        }
        try {
            Host host = host();
            HostPort hostPort = new HostPort();
            hostPort.setHost(host);
            if (z6) {
                this.lexer.SPorHT();
            }
            if (this.lexer.hasMoreChars() && (cLookAhead = this.lexer.lookAhead(0)) != '\t' && cLookAhead != '\n' && cLookAhead != '\r' && cLookAhead != ' ') {
                if (cLookAhead != '%') {
                    if (cLookAhead != ',' && cLookAhead != '/') {
                        if (cLookAhead == ':') {
                            this.lexer.consume(1);
                            if (z6) {
                                this.lexer.SPorHT();
                            }
                            try {
                                hostPort.setPort(Integer.parseInt(this.lexer.number()));
                            } catch (NumberFormatException unused) {
                                throw new ParseException(this.lexer.getBuffer() + " :Error parsing port ", this.lexer.getPtr());
                            }
                        } else if (cLookAhead != ';' && cLookAhead != '>' && cLookAhead != '?') {
                            if (z6) {
                                throw new ParseException(this.lexer.getBuffer() + " Illegal character in hostname:" + this.lexer.lookAhead(0), this.lexer.getPtr());
                            }
                        }
                    }
                } else if (!stripAddressScopeZones) {
                    if (z6) {
                        throw new ParseException(this.lexer.getBuffer() + " Illegal character in hostname:" + this.lexer.lookAhead(0), this.lexer.getPtr());
                    }
                }
            }
            if (z10) {
                dbg_leave("hostPort");
            }
            return hostPort;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("hostPort");
            }
            throw th2;
        }
    }

    public String ipv6Reference() {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("ipv6Reference");
        }
        try {
            if (stripAddressScopeZones) {
                while (this.lexer.hasMoreChars()) {
                    char cLookAhead = this.lexer.lookAhead(0);
                    if (!StringTokenizer.isHexDigit(cLookAhead) && cLookAhead != '.' && cLookAhead != ':' && cLookAhead != '[') {
                        if (cLookAhead != ']') {
                            if (cLookAhead != '%') {
                                break;
                            }
                            this.lexer.consume(1);
                            String rest = this.lexer.getRest();
                            if (rest == null || rest.length() == 0 || (iIndexOf = rest.indexOf(93)) == -1) {
                                break;
                                break;
                                break;
                            }
                            this.lexer.consume(iIndexOf + 1);
                            sb2.append("]");
                            String string = sb2.toString();
                            if (ParserCore.debug) {
                                dbg_leave("ipv6Reference");
                            }
                            return string;
                        }
                        this.lexer.consume(1);
                        sb2.append(cLookAhead);
                        String string2 = sb2.toString();
                        if (ParserCore.debug) {
                            dbg_leave("ipv6Reference");
                        }
                        return string2;
                    }
                    this.lexer.consume(1);
                    sb2.append(cLookAhead);
                }
            } else {
                while (this.lexer.hasMoreChars()) {
                    char cLookAhead2 = this.lexer.lookAhead(0);
                    if (!StringTokenizer.isHexDigit(cLookAhead2) && cLookAhead2 != '.' && cLookAhead2 != ':' && cLookAhead2 != '[') {
                        if (cLookAhead2 != ']') {
                            break;
                        }
                        this.lexer.consume(1);
                        sb2.append(cLookAhead2);
                        String string3 = sb2.toString();
                        if (ParserCore.debug) {
                            dbg_leave("ipv6Reference");
                        }
                        return string3;
                    }
                    this.lexer.consume(1);
                    sb2.append(cLookAhead2);
                }
            }
            throw new ParseException(this.lexer.getBuffer() + ": Illegal Host name ", this.lexer.getPtr());
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("ipv6Reference");
            }
            throw th2;
        }
    }

    public HostNameParser(LexerCore lexerCore) {
        this.lexer = lexerCore;
        lexerCore.selectLexer("charLexer");
    }
}
