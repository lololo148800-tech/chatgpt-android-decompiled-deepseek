package android.gov.nist.core;

import java.text.ParseException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class StringTokenizer {
    protected char[] buffer;
    protected int bufferLen;
    protected int ptr;
    protected int savedPtr;

    public StringTokenizer() {
    }

    public static String getSDPFieldName(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(Separators.EQUALS));
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static boolean isAlpha(char c9) {
        if (c9 <= 127) {
            return (c9 >= 'a' && c9 <= 'z') || (c9 >= 'A' && c9 <= 'Z');
        }
        return Character.isLowerCase(c9) || Character.isUpperCase(c9);
    }

    public static boolean isAlphaDigit(char c9) {
        if (c9 <= 127) {
            return (c9 >= 'a' && c9 <= 'z') || (c9 >= 'A' && c9 <= 'Z') || (c9 <= '9' && c9 >= '0');
        }
        return Character.isLowerCase(c9) || Character.isUpperCase(c9) || Character.isDigit(c9);
    }

    public static boolean isDigit(char c9) {
        if (c9 <= 127) {
            return c9 <= '9' && c9 >= '0';
        }
        return Character.isDigit(c9);
    }

    public static boolean isHexDigit(char c9) {
        return (c9 >= 'A' && c9 <= 'F') || (c9 >= 'a' && c9 <= 'f') || isDigit(c9);
    }

    public void consume() {
        this.ptr = this.savedPtr;
    }

    public String getLine() {
        int i10;
        int i11;
        int i12 = this.ptr;
        while (true) {
            i10 = this.ptr;
            i11 = this.bufferLen;
            if (i10 >= i11 || this.buffer[i10] == '\n') {
                break;
            }
            this.ptr = i10 + 1;
        }
        if (i10 < i11 && this.buffer[i10] == '\n') {
            this.ptr = i10 + 1;
        }
        return String.valueOf(this.buffer, i12, this.ptr - i12);
    }

    public Vector<String> getLines() {
        Vector<String> vector = new Vector<>();
        while (hasMoreChars()) {
            vector.addElement(getLine());
        }
        return vector;
    }

    public char getNextChar() throws ParseException {
        int i10 = this.ptr;
        if (i10 < this.bufferLen) {
            char[] cArr = this.buffer;
            this.ptr = i10 + 1;
            return cArr[i10];
        }
        throw new ParseException(((Object) this.buffer) + " getNextChar: End of buffer", this.ptr);
    }

    public String getNextToken(char c9) throws ParseException {
        int i10 = this.ptr;
        while (true) {
            char cLookAhead = lookAhead(0);
            if (cLookAhead == c9) {
                return String.valueOf(this.buffer, i10, this.ptr - i10);
            }
            if (cLookAhead == 0) {
                throw new ParseException("EOL reached", 0);
            }
            consume(1);
        }
    }

    public boolean hasMoreChars() {
        return this.ptr < this.bufferLen;
    }

    public char lookAhead() {
        return lookAhead(0);
    }

    public String nextToken() {
        char c9;
        int i10 = this.ptr;
        do {
            int i11 = this.ptr;
            if (i11 >= this.bufferLen) {
                break;
            }
            c9 = this.buffer[i11];
            this.ptr = i11 + 1;
        } while (c9 != '\n');
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String peekLine() {
        int i10 = this.ptr;
        String line = getLine();
        this.ptr = i10;
        return line;
    }

    public StringTokenizer(String str) {
        this.buffer = str.toCharArray();
        this.bufferLen = str.length();
        this.ptr = 0;
    }

    public void consume(int i10) {
        this.ptr += i10;
    }

    public char lookAhead(int i10) {
        try {
            return this.buffer[this.ptr + i10];
        } catch (IndexOutOfBoundsException unused) {
            return (char) 0;
        }
    }
}
