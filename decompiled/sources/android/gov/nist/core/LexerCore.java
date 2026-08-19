package android.gov.nist.core;

import android.gov.nist.javax.sip.Utils;
import java.text.ParseException;
import java.util.Map;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LexerCore extends StringTokenizer {
    public static final int ALPHA = 4099;
    static final char ALPHADIGIT_VALID_CHARS = 65533;
    static final char ALPHA_VALID_CHARS = 65535;
    public static final int AND = 38;

    /* JADX INFO: renamed from: AT */
    public static final int f31985AT = 64;
    public static final int BACKSLASH = 92;
    public static final int BACK_QUOTE = 96;
    public static final int BAR = 124;
    public static final int COLON = 58;
    public static final int DIGIT = 4098;
    static final char DIGIT_VALID_CHARS = 65534;
    public static final int DOLLAR = 36;
    public static final int DOT = 46;
    public static final int DOUBLEQUOTE = 34;
    public static final int END = 4096;
    public static final int EQUALS = 61;
    public static final int EXCLAMATION = 33;
    public static final int GREATER_THAN = 62;
    public static final int HAT = 94;

    /* JADX INFO: renamed from: HT */
    public static final int f31986HT = 9;

    /* JADX INFO: renamed from: ID */
    public static final int f31987ID = 4095;
    public static final int ID_NO_WHITESPACE = 4093;
    public static final int IPV6 = 4100;
    public static final int LESS_THAN = 60;
    public static final int LPAREN = 40;
    public static final int L_CURLY = 123;
    public static final int L_SQUARE_BRACKET = 91;
    public static final int MINUS = 45;
    public static final int NULL = 0;
    public static final int PERCENT = 37;
    public static final int PLUS = 43;
    public static final int POUND = 35;
    public static final int QUESTION = 63;
    public static final int QUOTE = 39;
    public static final int RPAREN = 41;
    public static final int R_CURLY = 125;
    public static final int R_SQUARE_BRACKET = 93;
    public static final int SAFE = 4094;
    public static final int SEMICOLON = 59;
    public static final int SLASH = 47;

    /* JADX INFO: renamed from: SP */
    public static final int f31988SP = 32;
    public static final int STAR = 42;
    public static final int START = 2048;
    public static final int TILDE = 126;
    public static final int UNDERSCORE = 95;
    public static final int WHITESPACE = 4097;
    protected static final ConcurrentHashMap<Integer, String> globalSymbolTable = new ConcurrentHashMap<>();
    protected static final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> lexerTables = new ConcurrentHashMap<>();
    protected Map<String, Integer> currentLexer;
    protected String currentLexerName;
    protected Token currentMatch;

    public LexerCore() {
        this.currentLexer = new ConcurrentHashMap();
        this.currentLexerName = "charLexer";
    }

    public static String charAsString(char c9) {
        return String.valueOf(c9);
    }

    public static final boolean isTokenChar(char c9) {
        return StringTokenizer.isAlphaDigit(c9) || c9 == '!' || c9 == '%' || c9 == '\'' || c9 == '~' || c9 == '*' || c9 == '+' || c9 == '-' || c9 == '.' || c9 == '_' || c9 == '`';
    }

    public void SPorHT() {
        try {
            char cLookAhead = lookAhead(0);
            while (true) {
                if (cLookAhead != ' ' && cLookAhead != '\t') {
                    return;
                }
                consume(1);
                cLookAhead = lookAhead(0);
            }
        } catch (ParseException unused) {
        }
    }

    public void addKeyword(String str, int i10) {
        String upperCase = Utils.toUpperCase(str);
        Integer numValueOf = Integer.valueOf(i10);
        this.currentLexer.put(upperCase, numValueOf);
        globalSymbolTable.putIfAbsent(numValueOf, upperCase);
    }

    public String byteStringNoComma() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                char cLookAhead = lookAhead(0);
                if (cLookAhead == '\n' || cLookAhead == ',') {
                    break;
                    break;
                }
                consume(1);
                sb2.append(cLookAhead);
            } catch (ParseException unused) {
            }
        }
        return sb2.toString();
    }

    public String byteStringNoSemicolon() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                char cLookAhead = lookAhead(0);
                if (cLookAhead == 0 || cLookAhead == '\n' || cLookAhead == ';' || cLookAhead == ',') {
                    break;
                    break;
                    break;
                    break;
                }
                consume(1);
                sb2.append(cLookAhead);
            } catch (ParseException unused) {
                return sb2.toString();
            }
        }
        return sb2.toString();
    }

    public String byteStringNoSlash() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                char cLookAhead = lookAhead(0);
                if (cLookAhead == 0 || cLookAhead == '\n' || cLookAhead == '/') {
                    break;
                    break;
                    break;
                }
                consume(1);
                sb2.append(cLookAhead);
            } catch (ParseException unused) {
                return sb2.toString();
            }
        }
        return sb2.toString();
    }

    public String comment() throws ParseException {
        StringBuilder sb2 = new StringBuilder();
        if (lookAhead(0) != '(') {
            return null;
        }
        consume(1);
        while (true) {
            char nextChar = getNextChar();
            if (nextChar == ')') {
                return sb2.toString();
            }
            if (nextChar == 0) {
                throw new ParseException(((Object) this.buffer) + " :unexpected EOL", this.ptr);
            }
            if (nextChar == '\\') {
                sb2.append(nextChar);
                char nextChar2 = getNextChar();
                if (nextChar2 == 0) {
                    throw new ParseException(((Object) this.buffer) + " : unexpected EOL", this.ptr);
                }
                sb2.append(nextChar2);
            } else {
                sb2.append(nextChar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032 A[Catch: ParseException -> 0x0036, LOOP:0: B:24:0x0001->B:20:0x0032, LOOP_END, TRY_LEAVE, TryCatch #0 {ParseException -> 0x0036, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0011, B:9:0x0013, B:18:0x002d, B:13:0x001c, B:14:0x0021, B:15:0x0026, B:20:0x0032), top: B:24:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0036 A[SYNTHETIC] */
    public void consumeValidChars(char[] cArr) {
        while (hasMoreChars()) {
            try {
                char cLookAhead = lookAhead(0);
                boolean zIsAlphaDigit = false;
                for (char c9 : cArr) {
                    switch (c9) {
                        case 65533:
                            zIsAlphaDigit = StringTokenizer.isAlphaDigit(cLookAhead);
                            break;
                        case 65534:
                            zIsAlphaDigit = StringTokenizer.isDigit(cLookAhead);
                            break;
                        case 65535:
                            zIsAlphaDigit = StringTokenizer.isAlpha(cLookAhead);
                            break;
                        default:
                            zIsAlphaDigit = cLookAhead == c9;
                            break;
                    }
                    if (zIsAlphaDigit) {
                        if (zIsAlphaDigit) {
                            return;
                        } else {
                            consume(1);
                        }
                    }
                }
                if (zIsAlphaDigit) {
                    return;
                } else {
                    consume(1);
                }
            } catch (ParseException unused) {
                return;
            }
        }
    }

    public ParseException createParseException() {
        return new ParseException(getBuffer(), this.ptr);
    }

    public String getBuffer() {
        return String.valueOf(this.buffer);
    }

    public String getNextId() {
        return ttoken();
    }

    public String getNextIdNoWhiteSpace() {
        return ttokenNoWhiteSpace();
    }

    public String getNextIp() {
        return tIpv6address();
    }

    public Token getNextToken() {
        return this.currentMatch;
    }

    public int getPtr() {
        return this.ptr;
    }

    public String getRest() {
        int i10 = this.ptr;
        int i11 = this.bufferLen;
        if (i10 > i11) {
            return null;
        }
        return i10 == i11 ? "" : String.valueOf(this.buffer, i10, i11 - i10);
    }

    public String getString(char c9) throws ParseException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char cLookAhead = lookAhead(0);
            if (cLookAhead == 0) {
                throw new ParseException(((Object) this.buffer) + "unexpected EOL", this.ptr);
            }
            if (cLookAhead == c9) {
                consume(1);
                return sb2.toString();
            }
            if (cLookAhead == '\\') {
                consume(1);
                char cLookAhead2 = lookAhead(0);
                if (cLookAhead2 == 0) {
                    throw new ParseException(((Object) this.buffer) + "unexpected EOL", this.ptr);
                }
                consume(1);
                sb2.append(cLookAhead2);
            } else {
                consume(1);
                sb2.append(cLookAhead);
            }
        }
    }

    public String lookupToken(int i10) {
        return i10 > 2048 ? globalSymbolTable.get(Integer.valueOf(i10)) : Character.valueOf((char) i10).toString();
    }

    public int markInputPosition() {
        return this.ptr;
    }

    public Token match(int i10) throws ParseException {
        if (Debug.parserDebug) {
            Debug.println("match " + i10);
        }
        if (i10 <= 2048 || i10 >= 4096) {
            if (i10 > 4096) {
                char cLookAhead = lookAhead(0);
                if (i10 == 4098) {
                    if (!StringTokenizer.isDigit(cLookAhead)) {
                        throw new ParseException(((Object) this.buffer) + "\nExpecting DIGIT", this.ptr);
                    }
                    Token token = new Token();
                    this.currentMatch = token;
                    token.tokenValue = String.valueOf(cLookAhead);
                    this.currentMatch.tokenType = i10;
                    consume(1);
                } else if (i10 == 4099) {
                    if (!StringTokenizer.isAlpha(cLookAhead)) {
                        throw new ParseException(((Object) this.buffer) + "\nExpecting ALPHA", this.ptr);
                    }
                    Token token2 = new Token();
                    this.currentMatch = token2;
                    token2.tokenValue = String.valueOf(cLookAhead);
                    this.currentMatch.tokenType = i10;
                    consume(1);
                } else if (i10 == 4100) {
                    String nextIp = getNextIp();
                    Token token3 = new Token();
                    this.currentMatch = token3;
                    token3.tokenValue = nextIp;
                    token3.tokenType = IPV6;
                }
            } else {
                char c9 = (char) i10;
                char cLookAhead2 = lookAhead(0);
                if (cLookAhead2 != c9) {
                    throw new ParseException(((Object) this.buffer) + "\nExpecting  >>>" + c9 + "<<< got >>>" + cLookAhead2 + "<<<", this.ptr);
                }
                consume(1);
            }
        } else if (i10 == 4095) {
            if (!startsId()) {
                throw new ParseException(((Object) this.buffer) + "\nID expected", this.ptr);
            }
            String nextId = getNextId();
            Token token4 = new Token();
            this.currentMatch = token4;
            token4.tokenValue = nextId;
            token4.tokenType = 4095;
        } else if (i10 == 4094) {
            if (!startsSafeToken()) {
                throw new ParseException(((Object) this.buffer) + "\nID expected", this.ptr);
            }
            String strTtokenSafe = ttokenSafe();
            Token token5 = new Token();
            this.currentMatch = token5;
            token5.tokenValue = strTtokenSafe;
            token5.tokenType = 4094;
        } else if (i10 != 4093) {
            String nextId2 = getNextId();
            Integer num = this.currentLexer.get(Utils.toUpperCase(nextId2));
            if (num == null || num.intValue() != i10) {
                throw new ParseException(((Object) this.buffer) + "\nUnexpected Token : " + nextId2, this.ptr);
            }
            Token token6 = new Token();
            this.currentMatch = token6;
            token6.tokenValue = nextId2;
            token6.tokenType = i10;
        } else {
            if (!startsIdNoWhiteSpace()) {
                throw new ParseException(((Object) this.buffer) + "\nID no white space expected", this.ptr);
            }
            String nextIdNoWhiteSpace = getNextIdNoWhiteSpace();
            Token token7 = new Token();
            this.currentMatch = token7;
            token7.tokenValue = nextIdNoWhiteSpace;
            token7.tokenType = ID_NO_WHITESPACE;
        }
        return this.currentMatch;
    }

    public String number() {
        int i10 = this.ptr;
        try {
            if (StringTokenizer.isDigit(lookAhead(0))) {
                consume(1);
                while (StringTokenizer.isDigit(lookAhead(0))) {
                    consume(1);
                }
                return String.valueOf(this.buffer, i10, this.ptr - i10);
            }
            throw new ParseException(((Object) this.buffer) + ": Unexpected token at " + lookAhead(0), this.ptr);
        } catch (ParseException unused) {
            return String.valueOf(this.buffer, i10, this.ptr - i10);
        }
    }

    public String peekNextId() {
        int i10 = this.ptr;
        String strTtoken = ttoken();
        this.savedPtr = this.ptr;
        this.ptr = i10;
        return strTtoken;
    }

    public Token peekNextToken() {
        return peekNextToken(1)[0];
    }

    public String quotedString() throws ParseException {
        int i10 = this.ptr + 1;
        if (lookAhead(0) != '\"') {
            return null;
        }
        consume(1);
        while (true) {
            char nextChar = getNextChar();
            if (nextChar == '\"') {
                return String.valueOf(this.buffer, i10, (this.ptr - i10) - 1);
            }
            if (nextChar == 0) {
                throw new ParseException(String.valueOf(this.buffer) + " :unexpected EOL", this.ptr);
            }
            if (nextChar == '\\') {
                consume(1);
            }
        }
    }

    public void rewindInputPosition(int i10) {
        this.ptr = i10;
    }

    public void selectLexer(String str) {
        this.currentLexerName = str;
    }

    public boolean startsId() {
        try {
            return isTokenChar(lookAhead(0));
        } catch (ParseException unused) {
            return false;
        }
    }

    public boolean startsIdNoWhiteSpace() {
        try {
            char cLookAhead = lookAhead(0);
            return (cLookAhead == ' ' || cLookAhead == '\t' || cLookAhead == '\n') ? false : true;
        } catch (ParseException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x003e A[FALL_THROUGH, RETURN] */
    public boolean startsSafeToken() {
        try {
            char cLookAhead = lookAhead(0);
            if (!StringTokenizer.isAlphaDigit(cLookAhead) && cLookAhead != '\'' && cLookAhead != '=' && cLookAhead != '[' && cLookAhead != '*' && cLookAhead != '+' && cLookAhead != ':' && cLookAhead != ';' && cLookAhead != '?' && cLookAhead != '@') {
                switch (cLookAhead) {
                    default:
                        switch (cLookAhead) {
                            default:
                                switch (cLookAhead) {
                                    default:
                                        switch (cLookAhead) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                break;
                                            default:
                                                return false;
                                        }
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        return true;
                                }
                            case '-':
                            case '.':
                            case '/':
                                return true;
                        }
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                        return true;
                }
            }
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public String tIpv6address() {
        try {
            char[] cArr = this.buffer;
            int i10 = this.ptr;
            HostPort hostPort = new HostNameParser(String.valueOf(cArr, i10, cArr.length - i10)).hostPort(true);
            consume(hostPort.getHost().hostname.length());
            return hostPort.getHost().hostname;
        } catch (ParseException unused) {
            return null;
        }
    }

    public String ttoken() {
        int i10 = this.ptr;
        while (hasMoreChars() && isTokenChar(lookAhead(0))) {
            try {
                consume(1);
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0041 A[Catch: ParseException -> 0x004f, FALL_THROUGH, TryCatch #0 {ParseException -> 0x004f, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0014, B:22:0x0034, B:23:0x0037, B:24:0x003a, B:25:0x003d, B:27:0x0041, B:28:0x0045), top: B:32:0x0002 }] */
    public String ttokenGenValue() {
        int i10 = this.ptr;
        while (hasMoreChars()) {
            try {
                char cLookAhead = lookAhead(0);
                if (StringTokenizer.isAlphaDigit(cLookAhead)) {
                    consume(1);
                } else {
                    if (cLookAhead != '\'' && cLookAhead != ':' && cLookAhead != '[' && cLookAhead != '*' && cLookAhead != '+' && cLookAhead != '?' && cLookAhead != '@') {
                        switch (cLookAhead) {
                            default:
                                switch (cLookAhead) {
                                    default:
                                        switch (cLookAhead) {
                                            default:
                                                switch (cLookAhead) {
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~':
                                                        break;
                                                    default:
                                                        return String.valueOf(this.buffer, i10, this.ptr - i10);
                                                }
                                            case ']':
                                            case '^':
                                            case '_':
                                            case '`':
                                                consume(1);
                                                break;
                                        }
                                    case '-':
                                    case '.':
                                    case '/':
                                        consume(1);
                                        break;
                                }
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                                consume(1);
                                break;
                        }
                    }
                    consume(1);
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String ttokenNoWhiteSpace() {
        char cLookAhead;
        int i10 = this.ptr;
        while (hasMoreChars() && (cLookAhead = lookAhead(0)) != ' ' && cLookAhead != '\n' && cLookAhead != '\t') {
            try {
                consume(1);
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045 A[Catch: ParseException -> 0x0053, FALL_THROUGH, TryCatch #0 {ParseException -> 0x0053, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0014, B:24:0x0038, B:25:0x003b, B:26:0x003e, B:27:0x0041, B:29:0x0045, B:30:0x0049), top: B:34:0x0002 }] */
    public String ttokenSafe() {
        int i10 = this.ptr;
        while (hasMoreChars()) {
            try {
                char cLookAhead = lookAhead(0);
                if (StringTokenizer.isAlphaDigit(cLookAhead)) {
                    consume(1);
                } else {
                    if (cLookAhead != '\'' && cLookAhead != '[' && cLookAhead != '*' && cLookAhead != '+' && cLookAhead != ':' && cLookAhead != ';' && cLookAhead != '?' && cLookAhead != '@') {
                        switch (cLookAhead) {
                            default:
                                switch (cLookAhead) {
                                    default:
                                        switch (cLookAhead) {
                                            default:
                                                switch (cLookAhead) {
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~':
                                                        break;
                                                    default:
                                                        return String.valueOf(this.buffer, i10, this.ptr - i10);
                                                }
                                            case ']':
                                            case '^':
                                            case '_':
                                            case '`':
                                                consume(1);
                                                break;
                                        }
                                    case '-':
                                    case '.':
                                    case '/':
                                        consume(1);
                                        break;
                                }
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                                consume(1);
                                break;
                        }
                    }
                    consume(1);
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String charAsString(int i10) {
        return String.valueOf(this.buffer, this.ptr, i10 - 1);
    }

    public Token[] peekNextToken(int i10) throws ParseException {
        int i11 = this.ptr;
        Token[] tokenArr = new Token[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            Token token = new Token();
            if (startsId()) {
                String strTtoken = ttoken();
                token.tokenValue = strTtoken;
                String upperCase = Utils.toUpperCase(strTtoken);
                if (this.currentLexer.containsKey(upperCase)) {
                    token.tokenType = this.currentLexer.get(upperCase).intValue();
                } else {
                    token.tokenType = 4095;
                }
            } else {
                char nextChar = getNextChar();
                token.tokenValue = String.valueOf(nextChar);
                if (StringTokenizer.isAlpha(nextChar)) {
                    token.tokenType = 4099;
                } else if (StringTokenizer.isDigit(nextChar)) {
                    token.tokenType = 4098;
                } else {
                    token.tokenType = nextChar;
                }
            }
            tokenArr[i12] = token;
        }
        this.savedPtr = this.ptr;
        this.ptr = i11;
        return tokenArr;
    }

    public LexerCore(String str, String str2) {
        super(str2);
        this.currentLexerName = str;
    }
}
