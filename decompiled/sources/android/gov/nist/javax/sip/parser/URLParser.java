package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.HostNameParser;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StringTokenizer;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.address.TelURLImpl;
import android.gov.nist.javax.sip.address.TelephoneNumber;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.io.PrintStream;
import java.text.ParseException;
import p160G5.p161rK.TVCuK;

/* JADX INFO: loaded from: classes.dex */
public class URLParser extends Parser {
    public URLParser(String str) {
        this.lexer = new Lexer("sip_urlLexer", str);
    }

    private String base_phone_number() {
        StringBuilder sb2 = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("base_phone_number");
        }
        int i10 = 0;
        while (this.lexer.hasMoreChars()) {
            try {
                char cLookAhead = this.lexer.lookAhead(0);
                if (!StringTokenizer.isDigit(cLookAhead) && cLookAhead != '-' && cLookAhead != '.' && cLookAhead != '(' && cLookAhead != ')') {
                    if (i10 > 0) {
                        break;
                    }
                    throw createParseException("unexpected " + cLookAhead);
                }
                this.lexer.consume(1);
                sb2.append(cLookAhead);
                i10++;
            } catch (Throwable th2) {
                if (ParserCore.debug) {
                    dbg_leave("base_phone_number");
                }
                throw th2;
            }
        }
        String string = sb2.toString();
        if (ParserCore.debug) {
            dbg_leave("base_phone_number");
        }
        return string;
    }

    private final TelephoneNumber global_phone_number(boolean z6) {
        if (ParserCore.debug) {
            dbg_enter("global_phone_number");
        }
        try {
            TelephoneNumber telephoneNumber = new TelephoneNumber();
            telephoneNumber.setGlobal(true);
            this.lexer.match(43);
            telephoneNumber.setPhoneNumber(base_phone_number());
            if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == ';' && z6) {
                this.lexer.consume(1);
                telephoneNumber.setParameters(tel_parameters());
            }
            return telephoneNumber;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("global_phone_number");
            }
        }
    }

    public static boolean isMark(char c9) {
        if (c9 == '!' || c9 == '_' || c9 == '~' || c9 == '-' || c9 == '.') {
            return true;
        }
        switch (c9) {
            case '\'':
            case '(':
            case ')':
            case '*':
                return true;
            default:
                return false;
        }
    }

    public static boolean isReserved(char c9) {
        return c9 == '$' || c9 == '&' || c9 == '/' || c9 == '=' || c9 == '+' || c9 == ',' || c9 == ':' || c9 == ';' || c9 == '?' || c9 == '@';
    }

    public static boolean isReservedNoSlash(char c9) {
        return c9 == '$' || c9 == '&' || c9 == '+' || c9 == ',' || c9 == ':' || c9 == ';' || c9 == '?' || c9 == '@';
    }

    public static boolean isUnreserved(char c9) {
        return StringTokenizer.isAlphaDigit(c9) || isMark(c9);
    }

    public static boolean isUserUnreserved(char c9) {
        return c9 == '#' || c9 == '$' || c9 == '&' || c9 == '/' || c9 == ';' || c9 == '=' || c9 == '?' || c9 == '+' || c9 == ',';
    }

    private String local_number() {
        StringBuilder sb2 = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("local_number");
        }
        int i10 = 0;
        while (this.lexer.hasMoreChars()) {
            try {
                char cLookAhead = this.lexer.lookAhead(0);
                if (cLookAhead != '*' && cLookAhead != '#' && cLookAhead != '-' && cLookAhead != '.' && cLookAhead != '(' && cLookAhead != ')' && !StringTokenizer.isHexDigit(cLookAhead)) {
                    if (i10 > 0) {
                        break;
                    }
                    throw createParseException("unexepcted " + cLookAhead);
                }
                this.lexer.consume(1);
                sb2.append(cLookAhead);
                i10++;
            } catch (Throwable th2) {
                if (ParserCore.debug) {
                    dbg_leave("local_number");
                }
                throw th2;
            }
        }
        String string = sb2.toString();
        if (ParserCore.debug) {
            dbg_leave("local_number");
        }
        return string;
    }

    private TelephoneNumber local_phone_number(boolean z6) {
        if (ParserCore.debug) {
            dbg_enter("local_phone_number");
        }
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.setGlobal(false);
        try {
            telephoneNumber.setPhoneNumber(local_number());
            if (this.lexer.hasMoreChars() && this.lexer.peekNextToken().getTokenType() == 59 && z6) {
                this.lexer.consume(1);
                telephoneNumber.setParameters(tel_parameters());
            }
            return telephoneNumber;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("local_phone_number");
            }
        }
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"sip:alice@example.com", "sips:alice@examples.com", "sip:3Zqkv5dajqaaas0tCjCxT0xH2ZEuEMsFl0xoasip%3A%2B3519116786244%40siplab.domain.com@213.0.115.163:7070"};
        for (int i10 = 0; i10 < 3; i10++) {
            GenericURI genericURI = new URLParser(strArr2[i10]).parse();
            PrintStream printStream = System.out;
            printStream.println("uri type returned ".concat(genericURI.getClass().getName()));
            printStream.println(strArr2[i10] + " is SipUri? " + genericURI.isSipURI() + Separators.GREATER_THAN + genericURI.encode());
        }
    }

    private NameValue phone_context() throws ParseException {
        String tokenValue;
        this.lexer.match(61);
        char cLookAhead = this.lexer.lookAhead(0);
        if (cLookAhead == '+') {
            this.lexer.consume(1);
            tokenValue = "+" + base_phone_number();
        } else {
            if (!StringTokenizer.isAlphaDigit(cLookAhead)) {
                throw new ParseException("Invalid phone-context:" + cLookAhead, -1);
            }
            tokenValue = this.lexer.match(4095).getTokenValue();
        }
        return new NameValue("phone-context", tokenValue, false);
    }

    private NameValueList tel_parameters() throws ParseException {
        NameValue nameValue;
        NameValueList nameValueList = new NameValueList();
        while (true) {
            String strParamNameOrValue = paramNameOrValue();
            if (strParamNameOrValue.equalsIgnoreCase("phone-context")) {
                nameValue = phone_context();
            } else if (this.lexer.lookAhead(0) == '=') {
                this.lexer.consume(1);
                nameValue = new NameValue(strParamNameOrValue, paramNameOrValue(), false);
            } else {
                nameValue = new NameValue(strParamNameOrValue, "", true);
            }
            nameValueList.set(nameValue);
            if (this.lexer.lookAhead(0) != ';') {
                return nameValueList;
            }
            this.lexer.consume(1);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: IfRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:514)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:517)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:173)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private android.gov.nist.core.NameValue uriParam() {
        /*
            r8 = this;
            boolean r0 = android.gov.nist.core.ParserCore.debug
            java.lang.String r1 = "uriParam"
            if (r0 == 0) goto L9
            r8.dbg_enter(r1)
        L9:
            java.lang.String r2 = ""
            java.lang.String r3 = r8.paramNameOrValue()     // Catch: java.lang.Throwable -> L25
            android.gov.nist.core.LexerCore r4 = r8.lexer     // Catch: java.lang.Throwable -> L25
            r5 = 0
            char r4 = r4.lookAhead(r5)     // Catch: java.lang.Throwable -> L25
            r6 = 61
            r7 = 1
            if (r4 != r6) goto L27
            android.gov.nist.core.LexerCore r2 = r8.lexer     // Catch: java.lang.Throwable -> L25
            r2.consume(r7)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r8.paramNameOrValue()     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r0 = move-exception
            goto L48
        L27:
            r5 = r7
        L28:
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L3d
            if (r2 == 0) goto L36
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L3d
        L36:
            if (r0 == 0) goto L3b
            r8.dbg_leave(r1)
        L3b:
            r0 = 0
            return r0
        L3d:
            android.gov.nist.core.NameValue r4 = new android.gov.nist.core.NameValue     // Catch: java.lang.Throwable -> L25
            r4.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L47
            r8.dbg_leave(r1)
        L47:
            return r4
        L48:
            boolean r2 = android.gov.nist.core.ParserCore.debug
            if (r2 == 0) goto L4f
            r8.dbg_leave(r1)
        L4f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.gov.nist.javax.sip.parser.URLParser.uriParam():android.gov.nist.core.NameValue");
    }

    public String escaped() {
        boolean z6 = ParserCore.debug;
        if (z6) {
            dbg_enter("escaped");
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char cLookAhead = this.lexer.lookAhead(0);
            char cLookAhead2 = this.lexer.lookAhead(1);
            char cLookAhead3 = this.lexer.lookAhead(2);
            if (cLookAhead != '%' || !StringTokenizer.isHexDigit(cLookAhead2) || !StringTokenizer.isHexDigit(cLookAhead3)) {
                throw createParseException("escaped");
            }
            this.lexer.consume(3);
            sb2.append(cLookAhead);
            sb2.append(cLookAhead2);
            sb2.append(cLookAhead3);
            String string = sb2.toString();
            if (z6) {
                dbg_leave("escaped");
            }
            return string;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("escaped");
            }
            throw th2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x003b. Please report as an issue. */
    public String hvalue() {
        StringBuilder sb2 = new StringBuilder();
        while (this.lexer.hasMoreChars()) {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead != '!' && cLookAhead != '\"' && cLookAhead != '$' && cLookAhead != ':' && cLookAhead != '?' && cLookAhead != '[' && cLookAhead != ']' && cLookAhead != '_' && cLookAhead != '~') {
                switch (cLookAhead) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                    default:
                        switch (cLookAhead) {
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                if (!StringTokenizer.isAlphaDigit(cLookAhead)) {
                                    if (cLookAhead == '%') {
                                        sb2.append(escaped());
                                    }
                                }
                                break;
                        }
                        break;
                }
                return sb2.toString();
            }
            this.lexer.consume(1);
            sb2.append(cLookAhead);
        }
        return sb2.toString();
    }

    public boolean isEscaped() {
        try {
            return this.lexer.lookAhead(0) == '%' && StringTokenizer.isHexDigit(this.lexer.lookAhead(1)) && StringTokenizer.isHexDigit(this.lexer.lookAhead(2));
        } catch (Exception unused) {
            return false;
        }
    }

    public String mark() {
        boolean z6 = ParserCore.debug;
        if (z6) {
            dbg_enter("mark");
        }
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (!isMark(cLookAhead)) {
                throw createParseException("mark");
            }
            this.lexer.consume(1);
            String str = new String(new char[]{cLookAhead});
            if (z6) {
                dbg_leave("mark");
            }
            return str;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("mark");
            }
            throw th2;
        }
    }

    public String paramNameOrValue() {
        int ptr = this.lexer.getPtr();
        while (this.lexer.hasMoreChars()) {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead != '$' && cLookAhead != '&' && cLookAhead != '+' && cLookAhead != '/' && cLookAhead != ':' && cLookAhead != '[' && cLookAhead != ']' && !isUnreserved(cLookAhead)) {
                if (!isEscaped()) {
                    break;
                }
                this.lexer.consume(3);
            } else {
                this.lexer.consume(1);
            }
        }
        return this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
    }

    public GenericURI parse() {
        return uriReference(true);
    }

    public final TelephoneNumber parseTelephoneNumber(boolean z6) {
        TelephoneNumber telephoneNumberLocal_phone_number;
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("telephone_subscriber");
        }
        this.lexer.selectLexer("charLexer");
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead == '+') {
                telephoneNumberLocal_phone_number = global_phone_number(z6);
            } else {
                if (!StringTokenizer.isHexDigit(cLookAhead) && cLookAhead != '#' && cLookAhead != '*' && cLookAhead != '-' && cLookAhead != '.' && cLookAhead != '(' && cLookAhead != ')') {
                    throw createParseException("unexpected char " + cLookAhead);
                }
                telephoneNumberLocal_phone_number = local_phone_number(z6);
            }
            if (z10) {
                dbg_leave("telephone_subscriber");
            }
            return telephoneNumberLocal_phone_number;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("telephone_subscriber");
            }
            throw th2;
        }
    }

    public String password() {
        int ptr = this.lexer.getPtr();
        while (true) {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead == '$' || cLookAhead == '&' || cLookAhead == '=' || cLookAhead == '+' || cLookAhead == ',' || isUnreserved(cLookAhead)) {
                this.lexer.consume(1);
            } else {
                if (!isEscaped()) {
                    return this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
                }
                this.lexer.consume(3);
            }
        }
    }

    public String peekScheme() {
        return this.lexer.getString(':');
    }

    public NameValue qheader() throws ParseException {
        String nextToken = this.lexer.getNextToken('=');
        this.lexer.consume(1);
        return new NameValue(nextToken, hvalue(), false);
    }

    public String reserved() throws ParseException {
        char cLookAhead = this.lexer.lookAhead(0);
        if (!isReserved(cLookAhead)) {
            throw createParseException("reserved");
        }
        this.lexer.consume(1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cLookAhead);
        return sb2.toString();
    }

    public SipUri sipURL(boolean z6) {
        String str;
        String strPassword;
        if (ParserCore.debug) {
            dbg_enter("sipURL");
        }
        SipUri sipUri = new SipUri();
        int tokenType = this.lexer.peekNextToken().getTokenType();
        int i10 = TokenTypes.SIPS;
        if (tokenType == 2136) {
            str = "sips";
        } else {
            i10 = TokenTypes.SIP;
            str = "sip";
        }
        try {
            this.lexer.match(i10);
            this.lexer.match(58);
            sipUri.setScheme(str);
            int iMarkInputPosition = this.lexer.markInputPosition();
            String strUser = user();
            if (this.lexer.lookAhead() == ':') {
                this.lexer.consume(1);
                strPassword = password();
            } else {
                strPassword = null;
            }
            if (this.lexer.lookAhead() == '@') {
                this.lexer.consume(1);
                sipUri.setUser(strUser);
                if (strPassword != null) {
                    sipUri.setUserPassword(strPassword);
                }
            } else {
                this.lexer.rewindInputPosition(iMarkInputPosition);
            }
            sipUri.setHostPort(new HostNameParser(getLexer()).hostPort(false));
            this.lexer.selectLexer("charLexer");
            while (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == ';' && z6) {
                this.lexer.consume(1);
                NameValue nameValueUriParam = uriParam();
                if (nameValueUriParam != null) {
                    sipUri.setUriParameter(nameValueUriParam);
                }
            }
            if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == '?') {
                this.lexer.consume(1);
                while (this.lexer.hasMoreChars()) {
                    sipUri.setQHeader(qheader());
                    if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) != '&') {
                        break;
                    }
                    this.lexer.consume(1);
                }
            }
            return sipUri;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("sipURL");
            }
        }
    }

    public TelURLImpl telURL(boolean z6) throws ParseException {
        this.lexer.match(TokenTypes.TEL);
        this.lexer.match(58);
        TelephoneNumber telephoneNumber = parseTelephoneNumber(z6);
        TelURLImpl telURLImpl = new TelURLImpl();
        telURLImpl.setTelephoneNumber(telephoneNumber);
        return telURLImpl;
    }

    public String unreserved() throws ParseException {
        char cLookAhead = this.lexer.lookAhead(0);
        if (!isUnreserved(cLookAhead)) {
            throw createParseException("unreserved");
        }
        this.lexer.consume(1);
        return String.valueOf(cLookAhead);
    }

    public String uric() {
        boolean z6 = ParserCore.debug;
        if (z6) {
            dbg_enter("uric");
        }
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (isUnreserved(cLookAhead)) {
                this.lexer.consume(1);
                String strCharAsString = LexerCore.charAsString(cLookAhead);
                if (z6) {
                    dbg_leave("uric");
                }
                return strCharAsString;
            }
            if (isReserved(cLookAhead)) {
                this.lexer.consume(1);
                String strCharAsString2 = LexerCore.charAsString(cLookAhead);
                if (z6) {
                    dbg_leave("uric");
                }
                return strCharAsString2;
            }
            if (!isEscaped()) {
                if (z6) {
                    dbg_leave("uric");
                }
                return null;
            }
            String strCharAsString3 = this.lexer.charAsString(3);
            this.lexer.consume(3);
            if (z6) {
                dbg_leave("uric");
            }
            return strCharAsString3;
        } catch (Exception unused) {
            if (ParserCore.debug) {
                dbg_leave("uric");
            }
            return null;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("uric");
            }
            throw th2;
        }
    }

    public String uricNoSlash() {
        boolean z6 = ParserCore.debug;
        if (z6) {
            dbg_enter("uricNoSlash");
        }
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (isEscaped()) {
                String strCharAsString = this.lexer.charAsString(3);
                this.lexer.consume(3);
                if (z6) {
                    dbg_leave("uricNoSlash");
                }
                return strCharAsString;
            }
            if (isUnreserved(cLookAhead)) {
                this.lexer.consume(1);
                String strCharAsString2 = LexerCore.charAsString(cLookAhead);
                if (z6) {
                    dbg_leave("uricNoSlash");
                }
                return strCharAsString2;
            }
            if (!isReservedNoSlash(cLookAhead)) {
                if (z6) {
                    dbg_leave("uricNoSlash");
                }
                return null;
            }
            this.lexer.consume(1);
            String strCharAsString3 = LexerCore.charAsString(cLookAhead);
            if (z6) {
                dbg_leave("uricNoSlash");
            }
            return strCharAsString3;
        } catch (ParseException unused) {
            if (ParserCore.debug) {
                dbg_leave("uricNoSlash");
            }
            return null;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("uricNoSlash");
            }
            throw th2;
        }
    }

    public String uricString() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String strUric = uric();
            if (strUric != null) {
                sb2.append(strUric);
            } else {
                if (this.lexer.lookAhead(0) != '[') {
                    return sb2.toString();
                }
                sb2.append(new HostNameParser(getLexer()).hostPort(false).toString());
            }
        }
    }

    public String urlString() {
        char cLookAhead;
        StringBuilder sb2 = new StringBuilder();
        this.lexer.selectLexer("charLexer");
        while (this.lexer.hasMoreChars() && (cLookAhead = this.lexer.lookAhead(0)) != ' ' && cLookAhead != '\t' && cLookAhead != '\n' && cLookAhead != '>' && cLookAhead != '<') {
            this.lexer.consume(0);
            sb2.append(cLookAhead);
        }
        return sb2.toString();
    }

    public String user() {
        if (ParserCore.debug) {
            dbg_enter("user");
        }
        try {
            int ptr = this.lexer.getPtr();
            while (this.lexer.hasMoreChars()) {
                char cLookAhead = this.lexer.lookAhead(0);
                if (!isUnreserved(cLookAhead) && !isUserUnreserved(cLookAhead)) {
                    if (!isEscaped()) {
                        break;
                    }
                    this.lexer.consume(3);
                } else {
                    this.lexer.consume(1);
                }
            }
            return this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
        } finally {
            if (ParserCore.debug) {
                dbg_leave("user");
            }
        }
    }

    public GenericURI uriReference(boolean z6) throws ParseException {
        GenericURI genericURISipURL;
        boolean z10 = ParserCore.debug;
        String str = lZYtIbClQJm.AmpsewojprVidlK;
        if (z10) {
            dbg_enter(str);
        }
        Token[] tokenArrPeekNextToken = this.lexer.peekNextToken(2);
        Token token = tokenArrPeekNextToken[0];
        Token token2 = tokenArrPeekNextToken[1];
        try {
            if (token.getTokenType() == 2051 || token.getTokenType() == 2136) {
                if (token2.getTokenType() != 58) {
                    throw createParseException("Expecting ':'");
                }
                genericURISipURL = sipURL(z6);
            } else if (token.getTokenType() != 2105) {
                try {
                    genericURISipURL = new GenericURI(uricString());
                } catch (ParseException e10) {
                    throw createParseException(e10.getMessage());
                }
            } else {
                if (token2.getTokenType() != 58) {
                    throw createParseException("Expecting ':'");
                }
                genericURISipURL = telURL(z6);
            }
            if (z10) {
                dbg_leave(str);
            }
            return genericURISipURL;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave(str);
            }
            throw th2;
        }
    }

    public URLParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer(TVCuK.bQSXFws);
    }
}
