package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p001A.AbstractC0010F;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p232J3.C4206F;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15513a implements Closeable {

    /* JADX INFO: renamed from: A0 */
    public int[] f48441A0;

    /* JADX INFO: renamed from: Y */
    public final Reader f48442Y;

    /* JADX INFO: renamed from: u0 */
    public long f48450u0;

    /* JADX INFO: renamed from: v0 */
    public int f48451v0;

    /* JADX INFO: renamed from: w0 */
    public String f48452w0;

    /* JADX INFO: renamed from: x0 */
    public int[] f48453x0;

    /* JADX INFO: renamed from: z0 */
    public String[] f48455z0;

    /* JADX INFO: renamed from: Z */
    public boolean f48443Z = false;

    /* JADX INFO: renamed from: o0 */
    public final char[] f48444o0 = new char[1024];

    /* JADX INFO: renamed from: p0 */
    public int f48445p0 = 0;

    /* JADX INFO: renamed from: q0 */
    public int f48446q0 = 0;

    /* JADX INFO: renamed from: r0 */
    public int f48447r0 = 0;

    /* JADX INFO: renamed from: s0 */
    public int f48448s0 = 0;

    /* JADX INFO: renamed from: t0 */
    public int f48449t0 = 0;

    /* JADX INFO: renamed from: y0 */
    public int f48454y0 = 1;

    public C15513a(Reader reader) {
        int[] iArr = new int[32];
        this.f48453x0 = iArr;
        iArr[0] = 6;
        this.f48455z0 = new String[32];
        this.f48441A0 = new int[32];
        this.f48442Y = reader;
    }

    /* JADX INFO: renamed from: C0 */
    public final EnumC15514b m16695C0() throws IOException {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        switch (iM16716m) {
            case 1:
                return EnumC15514b.BEGIN_OBJECT;
            case 2:
                return EnumC15514b.END_OBJECT;
            case 3:
                return EnumC15514b.BEGIN_ARRAY;
            case 4:
                return EnumC15514b.END_ARRAY;
            case 5:
            case 6:
                return EnumC15514b.BOOLEAN;
            case 7:
                return EnumC15514b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC15514b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC15514b.NAME;
            case 15:
            case 16:
                return EnumC15514b.NUMBER;
            case 17:
                return EnumC15514b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m16696E() {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + m16695C0() + m16707W());
        }
        int i10 = this.f48454y0;
        this.f48454y0 = i10 - 1;
        int[] iArr = this.f48441A0;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f48449t0 = 0;
    }

    /* JADX INFO: renamed from: E0 */
    public final long m16697E0() throws IOException {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 15) {
            this.f48449t0 = 0;
            int[] iArr = this.f48441A0;
            int i10 = this.f48454y0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f48450u0;
        }
        if (iM16716m == 16) {
            this.f48452w0 = new String(this.f48444o0, this.f48445p0, this.f48451v0);
            this.f48445p0 += this.f48451v0;
        } else {
            if (iM16716m != 8 && iM16716m != 9 && iM16716m != 10) {
                throw new IllegalStateException("Expected a long but was " + m16695C0() + m16707W());
            }
            if (iM16716m == 10) {
                this.f48452w0 = m16718v0();
            } else {
                this.f48452w0 = m16717r0(iM16716m == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f48452w0);
                this.f48449t0 = 0;
                int[] iArr2 = this.f48441A0;
                int i11 = this.f48454y0 - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f48449t0 = 11;
        double d10 = Double.parseDouble(this.f48452w0);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f48452w0 + m16707W());
        }
        this.f48452w0 = null;
        this.f48449t0 = 0;
        int[] iArr3 = this.f48441A0;
        int i12 = this.f48454y0 - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m16698H0(int i10) {
        int i11 = this.f48454y0;
        int[] iArr = this.f48453x0;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f48453x0 = Arrays.copyOf(iArr, i12);
            this.f48441A0 = Arrays.copyOf(this.f48441A0, i12);
            this.f48455z0 = (String[]) Arrays.copyOf(this.f48455z0, i12);
        }
        int[] iArr2 = this.f48453x0;
        int i13 = this.f48454y0;
        this.f48454y0 = i13 + 1;
        iArr2[i13] = i10;
    }

    /* JADX INFO: renamed from: J0 */
    public final char m16699J0() throws C4206F {
        int i10;
        if (this.f48445p0 == this.f48446q0 && !m16703S(1)) {
            m16708W0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f48445p0;
        int i12 = i11 + 1;
        this.f48445p0 = i12;
        char[] cArr = this.f48444o0;
        char c9 = cArr[i11];
        if (c9 == '\n') {
            this.f48447r0++;
            this.f48448s0 = i12;
        } else if (c9 != '\"' && c9 != '\'' && c9 != '/' && c9 != '\\') {
            if (c9 == 'b') {
                return '\b';
            }
            if (c9 == 'f') {
                return '\f';
            }
            if (c9 == 'n') {
                return '\n';
            }
            if (c9 == 'r') {
                return '\r';
            }
            if (c9 == 't') {
                return '\t';
            }
            if (c9 != 'u') {
                m16708W0("Invalid escape sequence");
                throw null;
            }
            if (i11 + 5 > this.f48446q0 && !m16703S(4)) {
                m16708W0("Unterminated escape sequence");
                throw null;
            }
            int i13 = this.f48445p0;
            int i14 = i13 + 4;
            char c10 = 0;
            while (i13 < i14) {
                char c11 = cArr[i13];
                char c12 = (char) (c10 << 4);
                if (c11 >= '0' && c11 <= '9') {
                    i10 = c11 - '0';
                } else if (c11 >= 'a' && c11 <= 'f') {
                    i10 = c11 - 'W';
                } else {
                    if (c11 < 'A' || c11 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f48445p0, 4)));
                    }
                    i10 = c11 - '7';
                }
                c10 = (char) (i10 + c12);
                i13++;
            }
            this.f48445p0 += 4;
            return c10;
        }
        return c9;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m16700N0(char c9) throws C4206F {
        do {
            int i10 = this.f48445p0;
            int i11 = this.f48446q0;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c10 = this.f48444o0[i10];
                if (c10 == c9) {
                    this.f48445p0 = i12;
                    return;
                }
                if (c10 == '\\') {
                    this.f48445p0 = i12;
                    m16699J0();
                    i10 = this.f48445p0;
                    i11 = this.f48446q0;
                } else {
                    if (c10 == '\n') {
                        this.f48447r0++;
                        this.f48448s0 = i12;
                    }
                    i10 = i12;
                }
            }
            this.f48445p0 = i10;
        } while (m16703S(1));
        m16708W0("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: O */
    public final double m16701O() throws IOException {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 15) {
            this.f48449t0 = 0;
            int[] iArr = this.f48441A0;
            int i10 = this.f48454y0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f48450u0;
        }
        if (iM16716m == 16) {
            this.f48452w0 = new String(this.f48444o0, this.f48445p0, this.f48451v0);
            this.f48445p0 += this.f48451v0;
        } else if (iM16716m == 8 || iM16716m == 9) {
            this.f48452w0 = m16717r0(iM16716m == 8 ? '\'' : '\"');
        } else if (iM16716m == 10) {
            this.f48452w0 = m16718v0();
        } else if (iM16716m != 11) {
            throw new IllegalStateException("Expected a double but was " + m16695C0() + m16707W());
        }
        this.f48449t0 = 11;
        double d10 = Double.parseDouble(this.f48452w0);
        if (!this.f48443Z && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new C4206F("JSON forbids NaN and infinities: " + d10 + m16707W());
        }
        this.f48452w0 = null;
        this.f48449t0 = 0;
        int[] iArr2 = this.f48441A0;
        int i11 = this.f48454y0 - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    /* JADX INFO: renamed from: P */
    public final void m16702P() {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + m16695C0() + m16707W());
        }
        int i10 = this.f48454y0;
        int i11 = i10 - 1;
        this.f48454y0 = i11;
        this.f48455z0[i11] = null;
        int[] iArr = this.f48441A0;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f48449t0 = 0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m16703S(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f48448s0;
        int i14 = this.f48445p0;
        this.f48448s0 = i13 - i14;
        int i15 = this.f48446q0;
        char[] cArr = this.f48444o0;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f48446q0 = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f48446q0 = 0;
        }
        this.f48445p0 = 0;
        do {
            int i17 = this.f48446q0;
            int i18 = this.f48442Y.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f48446q0 + i18;
            this.f48446q0 = i11;
            if (this.f48447r0 == 0 && (i12 = this.f48448s0) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f48445p0++;
                this.f48448s0 = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m16704S0() throws IOException {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 5) {
            this.f48449t0 = 0;
            int[] iArr = this.f48441A0;
            int i10 = this.f48454y0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM16716m != 6) {
            throw new IllegalStateException("Expected a boolean but was " + m16695C0() + m16707W());
        }
        this.f48449t0 = 0;
        int[] iArr2 = this.f48441A0;
        int i11 = this.f48454y0 - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m16705T(char c9) throws C4206F {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m16715k();
        return false;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m16706V0() {
        char c9;
        do {
            if (this.f48445p0 >= this.f48446q0 && !m16703S(1)) {
                return;
            }
            int i10 = this.f48445p0;
            int i11 = i10 + 1;
            this.f48445p0 = i11;
            c9 = this.f48444o0[i10];
            if (c9 == '\n') {
                this.f48447r0++;
                this.f48448s0 = i11;
                return;
            }
        } while (c9 != '\r');
    }

    /* JADX INFO: renamed from: W */
    public final String m16707W() {
        StringBuilder sbM21e = AbstractC0010F.m21e(" at line ", this.f48447r0 + 1, " column ", (this.f48445p0 - this.f48448s0) + 1, " path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f48454y0;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f48453x0[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f48441A0[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f48455z0[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sbM21e.append(sb2.toString());
        return sbM21e.toString();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m16708W0(String str) throws C4206F {
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(str);
        sbM9893l.append(m16707W());
        throw new C4206F(sbM9893l.toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m16709a() {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 3) {
            m16698H0(1);
            this.f48441A0[this.f48454y0 - 1] = 0;
            this.f48449t0 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m16695C0() + m16707W());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final String m16710a0() {
        String strM16717r0;
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 14) {
            strM16717r0 = m16718v0();
        } else if (iM16716m == 12) {
            strM16717r0 = m16717r0('\'');
        } else {
            if (iM16716m != 13) {
                throw new IllegalStateException("Expected a name but was " + m16695C0() + m16707W());
            }
            strM16717r0 = m16717r0('\"');
        }
        this.f48449t0 = 0;
        this.f48455z0[this.f48454y0 - 1] = strM16717r0;
        return strM16717r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f48449t0 = 0;
        this.f48453x0[0] = 8;
        this.f48454y0 = 1;
        this.f48442Y.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m16711e() {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 1) {
            m16698H0(3);
            this.f48449t0 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m16695C0() + m16707W());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m16712e0() {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m != 7) {
            throw new IllegalStateException("Expected null but was " + m16695C0() + m16707W());
        }
        this.f48449t0 = 0;
        int[] iArr = this.f48441A0;
        int i10 = this.f48454y0 - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    /* JADX INFO: renamed from: g0 */
    public final int m16713g0() throws IOException {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 15) {
            long j10 = this.f48450u0;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f48450u0 + m16707W());
            }
            this.f48449t0 = 0;
            int[] iArr = this.f48441A0;
            int i11 = this.f48454y0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iM16716m == 16) {
            this.f48452w0 = new String(this.f48444o0, this.f48445p0, this.f48451v0);
            this.f48445p0 += this.f48451v0;
        } else {
            if (iM16716m != 8 && iM16716m != 9 && iM16716m != 10) {
                throw new IllegalStateException("Expected an int but was " + m16695C0() + m16707W());
            }
            if (iM16716m == 10) {
                this.f48452w0 = m16718v0();
            } else {
                this.f48452w0 = m16717r0(iM16716m == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f48452w0);
                this.f48449t0 = 0;
                int[] iArr2 = this.f48441A0;
                int i13 = this.f48454y0 - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f48449t0 = 11;
        double d10 = Double.parseDouble(this.f48452w0);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f48452w0 + m16707W());
        }
        this.f48452w0 = null;
        this.f48449t0 = 0;
        int[] iArr3 = this.f48441A0;
        int i15 = this.f48454y0 - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public final boolean hasNext() throws IOException {
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        return (iM16716m == 2 || iM16716m == 4) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final void m16715k() throws C4206F {
        if (this.f48443Z) {
            return;
        }
        m16708W0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0190  */
    /* JADX WARN: Code duplicated, block: B:125:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1 A[PHI: r2 r4
      0x01a1: PHI (r2v46 int) = (r2v45 int), (r2v48 int) binds: [B:118:0x0188, B:125:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x0188, B:125:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x0216  */
    /* JADX WARN: Code duplicated, block: B:171:0x0218  */
    /* JADX WARN: Code duplicated, block: B:183:0x0239 A[DONT_INVERT, PHI: r1
      0x0239: PHI (r1v65 int) = (r1v64 int), (r1v68 int) binds: [B:169:0x0214, B:175:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x023b  */
    /* JADX WARN: Code duplicated, block: B:197:0x025e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0264  */
    /* JADX WARN: Code duplicated, block: B:202:0x0269  */
    /* JADX WARN: Code duplicated, block: B:207:0x0279 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:208:0x027a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0284  */
    /* JADX WARN: Code duplicated, block: B:212:0x028c  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:231:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:233:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:275:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX INFO: renamed from: m */
    public final int m16716m() throws IOException {
        int iM16714j0;
        int i10;
        int iM16714j1;
        int i11;
        String str;
        String str2;
        int i12;
        char c9;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z6;
        char c10;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr = this.f48453x0;
        int i21 = 1;
        int i22 = this.f48454y0 - 1;
        int i23 = iArr[i22];
        char[] cArr = this.f48444o0;
        if (i23 == 1) {
            iArr[i22] = 2;
        } else if (i23 == 2) {
            int iM16714j2 = m16714j0(true);
            if (iM16714j2 != 44) {
                if (iM16714j2 != 59) {
                    if (iM16714j2 == 93) {
                        this.f48449t0 = 4;
                        return 4;
                    }
                    m16708W0("Unterminated array");
                    throw null;
                }
                m16715k();
            }
        } else {
            if (i23 == 3 || i23 == 5) {
                iArr[i22] = 4;
                if (i23 == 5 && (iM16714j0 = m16714j0(true)) != 44) {
                    if (iM16714j0 != 59) {
                        if (iM16714j0 == 125) {
                            this.f48449t0 = 2;
                            return 2;
                        }
                        m16708W0("Unterminated object");
                        throw null;
                    }
                    m16715k();
                }
                int iM16714j3 = m16714j0(true);
                if (iM16714j3 == 34) {
                    this.f48449t0 = 13;
                    return 13;
                }
                if (iM16714j3 == 39) {
                    m16715k();
                    this.f48449t0 = 12;
                    return 12;
                }
                if (iM16714j3 == 125) {
                    if (i23 != 5) {
                        this.f48449t0 = 2;
                        return 2;
                    }
                    m16708W0("Expected name");
                    throw null;
                }
                m16715k();
                this.f48445p0--;
                if (m16705T((char) iM16714j3)) {
                    this.f48449t0 = 14;
                    return 14;
                }
                m16708W0("Expected name");
                throw null;
            }
            if (i23 != 4) {
                if (i23 == 6) {
                    if (this.f48443Z) {
                        m16714j0(true);
                        int i24 = this.f48445p0;
                        int i25 = i24 - 1;
                        this.f48445p0 = i25;
                        if ((i24 + 4 <= this.f48446q0 || m16703S(5)) && cArr[i25] == ')' && cArr[i24] == ']' && cArr[i24 + 1] == '}' && cArr[i24 + 2] == '\'' && cArr[i24 + 3] == '\n') {
                            this.f48445p0 += 5;
                        }
                    }
                    this.f48453x0[this.f48454y0 - 1] = 7;
                } else if (i23 == 7) {
                    i10 = 0;
                    if (m16714j0(false) == -1) {
                        this.f48449t0 = 17;
                        return 17;
                    }
                    m16715k();
                    this.f48445p0--;
                } else {
                    i10 = 0;
                    if (i23 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iM16714j1 = m16714j0(true);
                if (iM16714j1 != 34) {
                    this.f48449t0 = 9;
                    return 9;
                }
                if (iM16714j1 != 39) {
                    m16715k();
                    this.f48449t0 = 8;
                    return 8;
                }
                if (iM16714j1 != 44 || iM16714j1 == 59) {
                    i11 = 1;
                } else {
                    if (iM16714j1 == 91) {
                        this.f48449t0 = 3;
                        return 3;
                    }
                    if (iM16714j1 != 93) {
                        if (iM16714j1 == 123) {
                            this.f48449t0 = 1;
                            return 1;
                        }
                        int i26 = this.f48445p0 - 1;
                        this.f48445p0 = i26;
                        char c11 = cArr[i26];
                        if (c11 == 't' || c11 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i12 = 5;
                        } else {
                            if (c11 != 'f' && c11 != 'F') {
                                if (c11 != 'n' && c11 != 'N') {
                                    i12 = i10;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i12 = 7;
                                if (i12 != 0) {
                                    return i12;
                                }
                                i13 = this.f48445p0;
                                i14 = this.f48446q0;
                                i15 = i10;
                                i16 = i15;
                                int i27 = i16;
                                z6 = true;
                                long j10 = 0;
                                while (true) {
                                    if (i13 + i16 != i14) {
                                        c10 = cArr[i13 + i16];
                                        if (c10 != '+') {
                                            if (c10 != 'E' || c10 == 'e') {
                                                i17 = i14;
                                                i18 = 6;
                                                if (i15 != 2 || i15 == 4) {
                                                    i15 = 5;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                }
                                            } else if (c10 == '-') {
                                                i17 = i14;
                                                i18 = 6;
                                                if (i15 == 0) {
                                                    i15 = 1;
                                                    i27 = 1;
                                                } else {
                                                    if (i15 != 5) {
                                                    }
                                                    i15 = i18;
                                                }
                                                i16++;
                                                i14 = i17;
                                                i21 = 1;
                                            } else if (c10 == '.') {
                                                i17 = i14;
                                                i18 = 6;
                                                if (i15 == 2) {
                                                    i15 = 3;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                }
                                            } else if (c10 >= '0' && c10 <= '9') {
                                                if (i15 == i21 || i15 == 0) {
                                                    i17 = i14;
                                                    i18 = 6;
                                                    j10 = -(c10 - '0');
                                                    i15 = 2;
                                                } else if (i15 != 2) {
                                                    i17 = i14;
                                                    if (i15 == 3) {
                                                        i18 = 6;
                                                        i15 = 4;
                                                    } else {
                                                        i18 = 6;
                                                        if (i15 == 5 || i15 == 6) {
                                                            i15 = 7;
                                                        }
                                                    }
                                                } else if (j10 != 0) {
                                                    i17 = i14;
                                                    long j11 = (10 * j10) - ((long) (c10 - '0'));
                                                    z6 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                    j10 = j11;
                                                    i18 = 6;
                                                }
                                                i16++;
                                                i14 = i17;
                                                i21 = 1;
                                            } else if (!m16705T(c10)) {
                                                i20 = 2;
                                                if (i15 != 2) {
                                                    if (i15 != i20 || i15 == 4 || i15 == 7) {
                                                        this.f48451v0 = i16;
                                                        i19 = 16;
                                                        this.f48449t0 = 16;
                                                    }
                                                } else if (z6 || ((j10 == Long.MIN_VALUE && i27 == 0) || (j10 == 0 && i27 != 0))) {
                                                    i20 = 2;
                                                    if (i15 != i20) {
                                                    }
                                                    this.f48451v0 = i16;
                                                    i19 = 16;
                                                    this.f48449t0 = 16;
                                                } else {
                                                    if (i27 == 0) {
                                                        j10 = -j10;
                                                    }
                                                    this.f48450u0 = j10;
                                                    this.f48445p0 += i16;
                                                    i19 = 15;
                                                    this.f48449t0 = 15;
                                                }
                                            }
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (m16705T(cArr[this.f48445p0])) {
                                                m16708W0("Expected value");
                                                throw null;
                                            }
                                            m16715k();
                                            this.f48449t0 = 10;
                                            return 10;
                                        }
                                        i17 = i14;
                                        i18 = 6;
                                        if (i15 != 5) {
                                        }
                                        i15 = i18;
                                        i16++;
                                        i14 = i17;
                                        i21 = 1;
                                    } else if (i16 != cArr.length) {
                                        if (!m16703S(i16 + 1)) {
                                            int i28 = this.f48445p0;
                                            i14 = this.f48446q0;
                                            i13 = i28;
                                            c10 = cArr[i13 + i16];
                                            if (c10 != '+') {
                                                if (c10 != 'E') {
                                                    i17 = i14;
                                                    i18 = 6;
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                } else {
                                                    i17 = i14;
                                                    i18 = 6;
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                }
                                                if (i19 != 0) {
                                                    return i19;
                                                }
                                                if (m16705T(cArr[this.f48445p0])) {
                                                    m16708W0("Expected value");
                                                    throw null;
                                                }
                                                m16715k();
                                                this.f48449t0 = 10;
                                                return 10;
                                            }
                                            i17 = i14;
                                            i18 = 6;
                                            if (i15 != 5) {
                                            }
                                            i15 = i18;
                                            i16++;
                                            i14 = i17;
                                            i21 = 1;
                                        }
                                        i20 = 2;
                                        if (i15 != 2) {
                                            if (i15 != i20) {
                                            }
                                            this.f48451v0 = i16;
                                            i19 = 16;
                                            this.f48449t0 = 16;
                                        } else {
                                            if (z6) {
                                            }
                                            i20 = 2;
                                            if (i15 != i20) {
                                            }
                                            this.f48451v0 = i16;
                                            i19 = 16;
                                            this.f48449t0 = 16;
                                        }
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        if (m16705T(cArr[this.f48445p0])) {
                                            m16708W0("Expected value");
                                            throw null;
                                        }
                                        m16715k();
                                        this.f48449t0 = 10;
                                        return 10;
                                    }
                                    i19 = 0;
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (m16705T(cArr[this.f48445p0])) {
                                        m16708W0("Expected value");
                                        throw null;
                                    }
                                    m16715k();
                                    this.f48449t0 = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i12 = 6;
                        }
                        int length = str.length();
                        int i29 = 1;
                        while (true) {
                            if (i29 >= length) {
                                if ((this.f48445p0 + length >= this.f48446q0 && !m16703S(length + 1)) || !m16705T(cArr[this.f48445p0 + length])) {
                                    this.f48445p0 += length;
                                    this.f48449t0 = i12;
                                    break;
                                }
                                break;
                            }
                            if ((this.f48445p0 + i29 < this.f48446q0 || m16703S(i29 + 1)) && ((c9 = cArr[this.f48445p0 + i29]) == str.charAt(i29) || c9 == str2.charAt(i29))) {
                                i29++;
                            }
                            i12 = i10;
                            break;
                        }
                        if (i12 != 0) {
                            return i12;
                        }
                        i13 = this.f48445p0;
                        i14 = this.f48446q0;
                        i15 = i10;
                        i16 = i15;
                        int i210 = i16;
                        z6 = true;
                        long j12 = 0;
                        while (true) {
                            if (i13 + i16 != i14) {
                                c10 = cArr[i13 + i16];
                                if (c10 != '+') {
                                    if (c10 != 'E') {
                                        i17 = i14;
                                        i18 = 6;
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                        i14 = i17;
                                        i21 = 1;
                                    } else {
                                        i17 = i14;
                                        i18 = 6;
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                        i14 = i17;
                                        i21 = 1;
                                    }
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (m16705T(cArr[this.f48445p0])) {
                                        m16708W0("Expected value");
                                        throw null;
                                    }
                                    m16715k();
                                    this.f48449t0 = 10;
                                    return 10;
                                }
                                i17 = i14;
                                i18 = 6;
                                if (i15 != 5) {
                                }
                                i15 = i18;
                                i16++;
                                i14 = i17;
                                i21 = 1;
                            } else if (i16 != cArr.length) {
                                if (!m16703S(i16 + 1)) {
                                    int i211 = this.f48445p0;
                                    i14 = this.f48446q0;
                                    i13 = i211;
                                    c10 = cArr[i13 + i16];
                                    if (c10 != '+') {
                                        if (c10 != 'E') {
                                            i17 = i14;
                                            i18 = 6;
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                            i14 = i17;
                                            i21 = 1;
                                        } else {
                                            i17 = i14;
                                            i18 = 6;
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                            i14 = i17;
                                            i21 = 1;
                                        }
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        if (m16705T(cArr[this.f48445p0])) {
                                            m16708W0("Expected value");
                                            throw null;
                                        }
                                        m16715k();
                                        this.f48449t0 = 10;
                                        return 10;
                                    }
                                    i17 = i14;
                                    i18 = 6;
                                    if (i15 != 5) {
                                    }
                                    i15 = i18;
                                    i16++;
                                    i14 = i17;
                                    i21 = 1;
                                }
                                i20 = 2;
                                if (i15 != 2) {
                                    if (i15 != i20) {
                                    }
                                    this.f48451v0 = i16;
                                    i19 = 16;
                                    this.f48449t0 = 16;
                                } else {
                                    if (z6) {
                                    }
                                    i20 = 2;
                                    if (i15 != i20) {
                                    }
                                    this.f48451v0 = i16;
                                    i19 = 16;
                                    this.f48449t0 = 16;
                                }
                                if (i19 != 0) {
                                    return i19;
                                }
                                if (m16705T(cArr[this.f48445p0])) {
                                    m16708W0("Expected value");
                                    throw null;
                                }
                                m16715k();
                                this.f48449t0 = 10;
                                return 10;
                            }
                            i19 = 0;
                            if (i19 != 0) {
                                return i19;
                            }
                            if (m16705T(cArr[this.f48445p0])) {
                                m16708W0("Expected value");
                                throw null;
                            }
                            m16715k();
                            this.f48449t0 = 10;
                            return 10;
                        }
                    }
                    i11 = 1;
                    if (i23 == 1) {
                        this.f48449t0 = 4;
                        return 4;
                    }
                }
                if (i23 == i11 && i23 != 2) {
                    m16708W0("Unexpected value");
                    throw null;
                }
                m16715k();
                this.f48445p0 -= i11;
                this.f48449t0 = 7;
                return 7;
            }
            iArr[i22] = 5;
            int iM16714j4 = m16714j0(true);
            if (iM16714j4 != 58) {
                if (iM16714j4 != 61) {
                    m16708W0("Expected ':'");
                    throw null;
                }
                m16715k();
                if (this.f48445p0 < this.f48446q0 || m16703S(1)) {
                    int i30 = this.f48445p0;
                    if (cArr[i30] == '>') {
                        this.f48445p0 = i30 + 1;
                    }
                }
            }
        }
        i10 = 0;
        iM16714j1 = m16714j0(true);
        if (iM16714j1 != 34) {
            this.f48449t0 = 9;
            return 9;
        }
        if (iM16714j1 != 39) {
            m16715k();
            this.f48449t0 = 8;
            return 8;
        }
        if (iM16714j1 != 44) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        if (i23 == i11) {
        }
        m16715k();
        this.f48445p0 -= i11;
        this.f48449t0 = 7;
        return 7;
    }

    /* JADX INFO: renamed from: r0 */
    public final String m16717r0(char c9) throws C4206F {
        int i10;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f48445p0;
            int i12 = this.f48446q0;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f48444o0;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c10 = cArr[i11];
                        if (c10 == c9) {
                            this.f48445p0 = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c10 == '\\') {
                            this.f48445p0 = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(m16699J0());
                            i11 = this.f48445p0;
                            i12 = this.f48446q0;
                        } else {
                            if (c10 == '\n') {
                                this.f48447r0++;
                                this.f48448s0 = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f48445p0 = i11;
        } while (m16703S(1));
        m16708W0("Unterminated string");
        throw null;
    }

    public final String toString() {
        return C15513a.class.getSimpleName() + m16707W();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: v0 */
    public final String m16718v0() throws C4206F {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f48445p0;
                int i13 = i12 + i11;
                int i14 = this.f48446q0;
                char[] cArr = this.f48444o0;
                if (i13 < i14) {
                    char c9 = cArr[i12 + i11];
                    if (c9 != '\t' && c9 != '\n' && c9 != '\f' && c9 != '\r' && c9 != ' ') {
                        if (c9 != '#') {
                            if (c9 != ',') {
                                if (c9 != '/' && c9 != '=') {
                                    if (c9 != '{' && c9 != '}' && c9 != ':') {
                                        if (c9 != ';') {
                                            switch (c9) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m16715k();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.f48445p0, i11);
                    this.f48445p0 += i11;
                    if (!m16703S(1)) {
                    }
                } else if (!m16703S(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.f48445p0, i10);
                } else {
                    sb2.append(cArr, this.f48445p0, i10);
                    string = sb2.toString();
                }
                this.f48445p0 += i10;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m16719x() {
        String str;
        int iM16716m = this.f48449t0;
        if (iM16716m == 0) {
            iM16716m = m16716m();
        }
        if (iM16716m == 10) {
            str = m16718v0();
        } else if (iM16716m == 8) {
            str = m16717r0('\'');
        } else if (iM16716m == 9) {
            str = m16717r0('\"');
        } else if (iM16716m == 11) {
            str = this.f48452w0;
            this.f48452w0 = null;
        } else if (iM16716m == 15) {
            str = Long.toString(this.f48450u0);
        } else {
            if (iM16716m != 16) {
                throw new IllegalStateException("Expected a string but was " + m16695C0() + m16707W());
            }
            str = new String(this.f48444o0, this.f48445p0, this.f48451v0);
            this.f48445p0 += this.f48451v0;
        }
        this.f48449t0 = 0;
        int[] iArr = this.f48441A0;
        int i10 = this.f48454y0 - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m16714j0(boolean z6) throws IOException {
        int i10 = this.f48445p0;
        int i11 = this.f48446q0;
        while (true) {
            if (i10 == i11) {
                this.f48445p0 = i10;
                if (!m16703S(1)) {
                    if (!z6) {
                        return -1;
                    }
                    throw new EOFException(QzvfuIgrngtl.LIBQCNZZu + m16707W());
                }
                i10 = this.f48445p0;
                i11 = this.f48446q0;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f48444o0;
            char c9 = cArr[i10];
            if (c9 == '\n') {
                this.f48447r0++;
                this.f48448s0 = i12;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 == '/') {
                    this.f48445p0 = i12;
                    if (i12 == i11) {
                        this.f48445p0 = i10;
                        boolean zM16703S = m16703S(2);
                        this.f48445p0++;
                        if (!zM16703S) {
                            return c9;
                        }
                    }
                    m16715k();
                    int i13 = this.f48445p0;
                    char c10 = cArr[i13];
                    if (c10 == '*') {
                        this.f48445p0 = i13 + 1;
                        while (true) {
                            if (this.f48445p0 + 2 > this.f48446q0 && !m16703S(2)) {
                                m16708W0("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f48445p0;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f48445p0 + 2;
                                        i11 = this.f48446q0;
                                        break;
                                    }
                                    if (cArr[this.f48445p0 + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f48447r0++;
                                this.f48448s0 = i14 + 1;
                            }
                            this.f48445p0++;
                        }
                    } else {
                        if (c10 != '/') {
                            return c9;
                        }
                        this.f48445p0 = i13 + 1;
                        m16706V0();
                        i10 = this.f48445p0;
                        i11 = this.f48446q0;
                    }
                } else {
                    if (c9 != '#') {
                        this.f48445p0 = i12;
                        return c9;
                    }
                    this.f48445p0 = i12;
                    m16715k();
                    m16706V0();
                    i10 = this.f48445p0;
                    i11 = this.f48446q0;
                }
            }
            i10 = i12;
        }
    }
}
