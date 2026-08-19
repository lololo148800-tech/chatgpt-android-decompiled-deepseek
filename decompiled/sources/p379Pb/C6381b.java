package p379Pb;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p001A.AbstractC0010F;
import p228J.AbstractC3794B0;
import p571X9.AbstractC9306j0;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Pb.b */
/* JADX INFO: loaded from: classes.dex */
public class C6381b implements Closeable {

    /* JADX INFO: renamed from: A0 */
    public int[] f20775A0;

    /* JADX INFO: renamed from: Y */
    public final Reader f20776Y;

    /* JADX INFO: renamed from: u0 */
    public long f20784u0;

    /* JADX INFO: renamed from: v0 */
    public int f20785v0;

    /* JADX INFO: renamed from: w0 */
    public String f20786w0;

    /* JADX INFO: renamed from: x0 */
    public int[] f20787x0;

    /* JADX INFO: renamed from: z0 */
    public String[] f20789z0;

    /* JADX INFO: renamed from: Z */
    public boolean f20777Z = false;

    /* JADX INFO: renamed from: o0 */
    public final char[] f20778o0 = new char[1024];

    /* JADX INFO: renamed from: p0 */
    public int f20779p0 = 0;

    /* JADX INFO: renamed from: q0 */
    public int f20780q0 = 0;

    /* JADX INFO: renamed from: r0 */
    public int f20781r0 = 0;

    /* JADX INFO: renamed from: s0 */
    public int f20782s0 = 0;

    /* JADX INFO: renamed from: t0 */
    public int f20783t0 = 0;

    /* JADX INFO: renamed from: y0 */
    public int f20788y0 = 1;

    static {
        C6380a.f20774a = new C6380a();
    }

    public C6381b(Reader reader) {
        int[] iArr = new int[32];
        this.f20787x0 = iArr;
        iArr[0] = 6;
        this.f20789z0 = new String[32];
        this.f20775A0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f20776Y = reader;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m6992C0(boolean z6) throws IOException {
        int i10 = this.f20779p0;
        int i11 = this.f20780q0;
        while (true) {
            if (i10 == i11) {
                this.f20779p0 = i10;
                if (!m6995S(1)) {
                    if (!z6) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m7006v0());
                }
                i10 = this.f20779p0;
                i11 = this.f20780q0;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f20778o0;
            char c9 = cArr[i10];
            if (c9 == '\n') {
                this.f20781r0++;
                this.f20782s0 = i12;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 == '/') {
                    this.f20779p0 = i12;
                    if (i12 == i11) {
                        this.f20779p0 = i10;
                        boolean zM6995S = m6995S(2);
                        this.f20779p0++;
                        if (!zM6995S) {
                            return c9;
                        }
                    }
                    m7003k();
                    int i13 = this.f20779p0;
                    char c10 = cArr[i13];
                    if (c10 == '*') {
                        this.f20779p0 = i13 + 1;
                        while (true) {
                            if (this.f20779p0 + 2 > this.f20780q0 && !m6995S(2)) {
                                m7002a1("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f20779p0;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f20779p0 + 2;
                                        i11 = this.f20780q0;
                                        break;
                                    }
                                    if (cArr[this.f20779p0 + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f20781r0++;
                                this.f20782s0 = i14 + 1;
                            }
                            this.f20779p0++;
                        }
                    } else {
                        if (c10 != '/') {
                            return c9;
                        }
                        this.f20779p0 = i13 + 1;
                        m7000Y0();
                        i10 = this.f20779p0;
                        i11 = this.f20780q0;
                    }
                } else {
                    if (c9 != '#') {
                        this.f20779p0 = i12;
                        return c9;
                    }
                    this.f20779p0 = i12;
                    m7003k();
                    m7000Y0();
                    i10 = this.f20779p0;
                    i11 = this.f20780q0;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: D */
    public void mo5613D() throws IOException {
        int i10 = 0;
        do {
            int iM7004m = this.f20783t0;
            if (iM7004m == 0) {
                iM7004m = m7004m();
            }
            switch (iM7004m) {
                case 1:
                    m6996V0(3);
                    i10++;
                    this.f20783t0 = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f20789z0[this.f20788y0 - 1] = null;
                    }
                    this.f20788y0--;
                    i10--;
                    this.f20783t0 = 0;
                    break;
                case 3:
                    m6996V0(1);
                    i10++;
                    this.f20783t0 = 0;
                    break;
                case 4:
                    this.f20788y0--;
                    i10--;
                    this.f20783t0 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f20783t0 = 0;
                    break;
                case 8:
                    m6999X0('\'');
                    this.f20783t0 = 0;
                    break;
                case 9:
                    m6999X0('\"');
                    this.f20783t0 = 0;
                    break;
                case 10:
                    m7001Z0();
                    this.f20783t0 = 0;
                    break;
                case 12:
                    m6999X0('\'');
                    if (i10 == 0) {
                        this.f20789z0[this.f20788y0 - 1] = "<skipped>";
                    }
                    this.f20783t0 = 0;
                    break;
                case 13:
                    m6999X0('\"');
                    if (i10 == 0) {
                        this.f20789z0[this.f20788y0 - 1] = "<skipped>";
                    }
                    this.f20783t0 = 0;
                    break;
                case 14:
                    m7001Z0();
                    if (i10 == 0) {
                        this.f20789z0[this.f20788y0 - 1] = "<skipped>";
                    }
                    this.f20783t0 = 0;
                    break;
                case 16:
                    this.f20779p0 += this.f20785v0;
                    this.f20783t0 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f20775A0;
        int i11 = this.f20788y0 - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    /* JADX INFO: renamed from: E */
    public void mo5614E() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
        }
        int i10 = this.f20788y0;
        this.f20788y0 = i10 - 1;
        int[] iArr = this.f20775A0;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f20783t0 = 0;
    }

    /* JADX INFO: renamed from: E0 */
    public long mo5615E0() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 15) {
            this.f20783t0 = 0;
            int[] iArr = this.f20775A0;
            int i10 = this.f20788y0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f20784u0;
        }
        if (iM7004m == 16) {
            this.f20786w0 = new String(this.f20778o0, this.f20779p0, this.f20785v0);
            this.f20779p0 += this.f20785v0;
        } else {
            if (iM7004m != 8 && iM7004m != 9 && iM7004m != 10) {
                throw new IllegalStateException("Expected a long but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
            }
            if (iM7004m == 10) {
                this.f20786w0 = m6994J0();
            } else {
                this.f20786w0 = m6993H0(iM7004m == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f20786w0);
                this.f20783t0 = 0;
                int[] iArr2 = this.f20775A0;
                int i11 = this.f20788y0 - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f20783t0 = 11;
        double d10 = Double.parseDouble(this.f20786w0);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f20786w0 + m7006v0());
        }
        this.f20786w0 = null;
        this.f20783t0 = 0;
        int[] iArr3 = this.f20775A0;
        int i12 = this.f20788y0 - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    /* JADX INFO: renamed from: H0 */
    public final String m6993H0(char c9) throws C6383d {
        int i10;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f20779p0;
            int i12 = this.f20780q0;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f20778o0;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c10 = cArr[i11];
                        if (c10 == c9) {
                            this.f20779p0 = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c10 == '\\') {
                            this.f20779p0 = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(m6998W0());
                            i11 = this.f20779p0;
                            i12 = this.f20780q0;
                        } else {
                            if (c10 == '\n') {
                                this.f20781r0++;
                                this.f20782s0 = i14;
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
            this.f20779p0 = i11;
        } while (m6995S(1));
        m7002a1("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: J0 */
    public final String m6994J0() throws C6383d {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f20779p0;
                int i13 = i12 + i11;
                int i14 = this.f20780q0;
                char[] cArr = this.f20778o0;
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
                        m7003k();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.f20779p0, i11);
                    this.f20779p0 += i11;
                    if (!m6995S(1)) {
                    }
                } else if (!m6995S(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.f20779p0, i10);
                } else {
                    sb2.append(cArr, this.f20779p0, i10);
                    string = sb2.toString();
                }
                this.f20779p0 += i10;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public int mo5616N0() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        switch (iM7004m) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: O */
    public double mo5617O() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 15) {
            this.f20783t0 = 0;
            int[] iArr = this.f20775A0;
            int i10 = this.f20788y0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f20784u0;
        }
        if (iM7004m == 16) {
            this.f20786w0 = new String(this.f20778o0, this.f20779p0, this.f20785v0);
            this.f20779p0 += this.f20785v0;
        } else if (iM7004m == 8 || iM7004m == 9) {
            this.f20786w0 = m6993H0(iM7004m == 8 ? '\'' : '\"');
        } else if (iM7004m == 10) {
            this.f20786w0 = m6994J0();
        } else if (iM7004m != 11) {
            throw new IllegalStateException("Expected a double but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
        }
        this.f20783t0 = 11;
        double d10 = Double.parseDouble(this.f20786w0);
        if (!this.f20777Z && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new C6383d("JSON forbids NaN and infinities: " + d10 + m7006v0());
        }
        this.f20786w0 = null;
        this.f20783t0 = 0;
        int[] iArr2 = this.f20775A0;
        int i11 = this.f20788y0 - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    /* JADX INFO: renamed from: P */
    public void mo5618P() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
        }
        int i10 = this.f20788y0;
        int i11 = i10 - 1;
        this.f20788y0 = i11;
        this.f20789z0[i11] = null;
        int[] iArr = this.f20775A0;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f20783t0 = 0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m6995S(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f20782s0;
        int i14 = this.f20779p0;
        this.f20782s0 = i13 - i14;
        int i15 = this.f20780q0;
        char[] cArr = this.f20778o0;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f20780q0 = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f20780q0 = 0;
        }
        this.f20779p0 = 0;
        do {
            int i17 = this.f20780q0;
            int i18 = this.f20776Y.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f20780q0 + i18;
            this.f20780q0 = i11;
            if (this.f20781r0 == 0 && (i12 = this.f20782s0) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f20779p0++;
                this.f20782s0 = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public boolean mo5619S0() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 5) {
            this.f20783t0 = 0;
            int[] iArr = this.f20775A0;
            int i10 = this.f20788y0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM7004m != 6) {
            throw new IllegalStateException("Expected a boolean but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
        }
        this.f20783t0 = 0;
        int[] iArr2 = this.f20775A0;
        int i11 = this.f20788y0 - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    /* JADX INFO: renamed from: T */
    public String mo5620T() {
        return m6997W(false);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m6996V0(int i10) {
        int i11 = this.f20788y0;
        int[] iArr = this.f20787x0;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f20787x0 = Arrays.copyOf(iArr, i12);
            this.f20775A0 = Arrays.copyOf(this.f20775A0, i12);
            this.f20789z0 = (String[]) Arrays.copyOf(this.f20789z0, i12);
        }
        int[] iArr2 = this.f20787x0;
        int i13 = this.f20788y0;
        this.f20788y0 = i13 + 1;
        iArr2[i13] = i10;
    }

    /* JADX INFO: renamed from: W */
    public final String m6997W(boolean z6) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f20788y0;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f20787x0[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f20775A0[i10];
                if (z6 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb2.append('[');
                sb2.append(i13);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f20789z0[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final char m6998W0() throws C6383d {
        int i10;
        if (this.f20779p0 == this.f20780q0 && !m6995S(1)) {
            m7002a1("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f20779p0;
        int i12 = i11 + 1;
        this.f20779p0 = i12;
        char[] cArr = this.f20778o0;
        char c9 = cArr[i11];
        if (c9 == '\n') {
            this.f20781r0++;
            this.f20782s0 = i12;
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
                m7002a1("Invalid escape sequence");
                throw null;
            }
            if (i11 + 5 > this.f20780q0 && !m6995S(4)) {
                m7002a1("Unterminated escape sequence");
                throw null;
            }
            int i13 = this.f20779p0;
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
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f20779p0, 4)));
                    }
                    i10 = c11 - '7';
                }
                c10 = (char) (i10 + c12);
                i13++;
            }
            this.f20779p0 += 4;
            return c10;
        }
        return c9;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m6999X0(char c9) throws C6383d {
        do {
            int i10 = this.f20779p0;
            int i11 = this.f20780q0;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c10 = this.f20778o0[i10];
                if (c10 == c9) {
                    this.f20779p0 = i12;
                    return;
                }
                if (c10 == '\\') {
                    this.f20779p0 = i12;
                    m6998W0();
                    i10 = this.f20779p0;
                    i11 = this.f20780q0;
                } else {
                    if (c10 == '\n') {
                        this.f20781r0++;
                        this.f20782s0 = i12;
                    }
                    i10 = i12;
                }
            }
            this.f20779p0 = i10;
        } while (m6995S(1));
        m7002a1("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m7000Y0() {
        char c9;
        do {
            if (this.f20779p0 >= this.f20780q0 && !m6995S(1)) {
                return;
            }
            int i10 = this.f20779p0;
            int i11 = i10 + 1;
            this.f20779p0 = i11;
            c9 = this.f20778o0[i10];
            if (c9 == '\n') {
                this.f20781r0++;
                this.f20782s0 = i11;
                return;
            }
        } while (c9 != '\r');
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m7001Z0() throws C6383d {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f20779p0;
                if (i11 + i10 < this.f20780q0) {
                    char c9 = this.f20778o0[i11 + i10];
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
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m7003k();
                    }
                    this.f20779p0 += i10;
                    return;
                }
                this.f20779p0 = i11 + i10;
            }
        } while (m6995S(1));
    }

    /* JADX INFO: renamed from: a */
    public void mo5621a() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 3) {
            m6996V0(1);
            this.f20775A0[this.f20788y0 - 1] = 0;
            this.f20783t0 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public String mo5622a0() throws IOException {
        String strM6993H0;
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 14) {
            strM6993H0 = m6994J0();
        } else if (iM7004m == 12) {
            strM6993H0 = m6993H0('\'');
        } else {
            if (iM7004m != 13) {
                throw new IllegalStateException("Expected a name but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
            }
            strM6993H0 = m6993H0('\"');
        }
        this.f20783t0 = 0;
        this.f20789z0[this.f20788y0 - 1] = strM6993H0;
        return strM6993H0;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m7002a1(String str) throws C6383d {
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(str);
        sbM9893l.append(m7006v0());
        throw new C6383d(sbM9893l.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20783t0 = 0;
        this.f20787x0[0] = 8;
        this.f20788y0 = 1;
        this.f20776Y.close();
    }

    /* JADX INFO: renamed from: e */
    public void mo5626e() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 1) {
            m6996V0(3);
            this.f20783t0 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo5627e0() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m != 7) {
            throw new IllegalStateException("Expected null but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
        }
        this.f20783t0 = 0;
        int[] iArr = this.f20775A0;
        int i10 = this.f20788y0 - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    /* JADX INFO: renamed from: g0 */
    public int mo5630g0() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 15) {
            long j10 = this.f20784u0;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f20784u0 + m7006v0());
            }
            this.f20783t0 = 0;
            int[] iArr = this.f20775A0;
            int i11 = this.f20788y0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iM7004m == 16) {
            this.f20786w0 = new String(this.f20778o0, this.f20779p0, this.f20785v0);
            this.f20779p0 += this.f20785v0;
        } else {
            if (iM7004m != 8 && iM7004m != 9 && iM7004m != 10) {
                throw new IllegalStateException("Expected an int but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
            }
            if (iM7004m == 10) {
                this.f20786w0 = m6994J0();
            } else {
                this.f20786w0 = m6993H0(iM7004m == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f20786w0);
                this.f20783t0 = 0;
                int[] iArr2 = this.f20775A0;
                int i13 = this.f20788y0 - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f20783t0 = 11;
        double d10 = Double.parseDouble(this.f20786w0);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f20786w0 + m7006v0());
        }
        this.f20786w0 = null;
        this.f20783t0 = 0;
        int[] iArr3 = this.f20775A0;
        int i15 = this.f20788y0 - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public boolean hasNext() throws IOException {
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        return (iM7004m == 2 || iM7004m == 4 || iM7004m == 17) ? false : true;
    }

    /* JADX INFO: renamed from: j0 */
    public String mo5633j0() {
        return m6997W(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m7003k() throws C6383d {
        if (this.f20777Z) {
            return;
        }
        m7002a1("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0191  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a2 A[PHI: r2 r4
      0x01a2: PHI (r2v51 int) = (r2v50 int), (r2v53 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:170:0x0215  */
    /* JADX WARN: Code duplicated, block: B:171:0x0217  */
    /* JADX WARN: Code duplicated, block: B:183:0x0238 A[DONT_INVERT, PHI: r1
      0x0238: PHI (r1v68 int) = (r1v67 int), (r1v71 int) binds: [B:169:0x0213, B:175:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x023a  */
    /* JADX WARN: Code duplicated, block: B:198:0x025b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0261  */
    /* JADX WARN: Code duplicated, block: B:203:0x0266  */
    /* JADX WARN: Code duplicated, block: B:208:0x0276 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x0277  */
    /* JADX WARN: Code duplicated, block: B:211:0x0281  */
    /* JADX WARN: Code duplicated, block: B:213:0x0289  */
    /* JADX WARN: Code duplicated, block: B:223:0x029f  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:277:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX INFO: renamed from: m */
    public final int m7004m() throws IOException {
        int i10;
        int iM6992C0;
        int i11;
        int iM6992C1;
        int i12;
        String str;
        String str2;
        int i13;
        char c9;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z6;
        char c10;
        int i18;
        int i19;
        int i20;
        int[] iArr = this.f20787x0;
        int i21 = 1;
        int i22 = this.f20788y0 - 1;
        int i23 = iArr[i22];
        char[] cArr = this.f20778o0;
        if (i23 == 1) {
            iArr[i22] = 2;
        } else {
            if (i23 != 2) {
                if (i23 == 3) {
                    i10 = 4;
                } else if (i23 == 5) {
                    i10 = 4;
                } else {
                    if (i23 != 4) {
                        if (i23 == 6) {
                            if (this.f20777Z) {
                                m6992C0(true);
                                int i24 = this.f20779p0;
                                this.f20779p0 = i24 - 1;
                                if (i24 + 4 <= this.f20780q0 || m6995S(5)) {
                                    int i25 = this.f20779p0;
                                    if (cArr[i25] == ')' && cArr[i25 + 1] == ']' && cArr[i25 + 2] == '}' && cArr[i25 + 3] == '\'' && cArr[i25 + 4] == '\n') {
                                        this.f20779p0 = i25 + 5;
                                    }
                                }
                            }
                            this.f20787x0[this.f20788y0 - 1] = 7;
                        } else if (i23 == 7) {
                            i11 = 0;
                            if (m6992C0(false) == -1) {
                                this.f20783t0 = 17;
                                return 17;
                            }
                            m7003k();
                            this.f20779p0--;
                        } else {
                            i11 = 0;
                            if (i23 == 8) {
                                throw new IllegalStateException("JsonReader is closed");
                            }
                        }
                        iM6992C1 = m6992C0(true);
                        if (iM6992C1 != 34) {
                            this.f20783t0 = 9;
                            return 9;
                        }
                        if (iM6992C1 != 39) {
                            m7003k();
                            this.f20783t0 = 8;
                            return 8;
                        }
                        if (iM6992C1 != 44 || iM6992C1 == 59) {
                            i12 = 1;
                        } else {
                            if (iM6992C1 == 91) {
                                this.f20783t0 = 3;
                                return 3;
                            }
                            if (iM6992C1 != 93) {
                                if (iM6992C1 == 123) {
                                    this.f20783t0 = 1;
                                    return 1;
                                }
                                int i26 = this.f20779p0 - 1;
                                this.f20779p0 = i26;
                                char c11 = cArr[i26];
                                if (c11 == 't' || c11 == 'T') {
                                    str = "true";
                                    str2 = "TRUE";
                                    i13 = 5;
                                } else {
                                    if (c11 != 'f' && c11 != 'F') {
                                        if (c11 != 'n' && c11 != 'N') {
                                            i13 = i11;
                                            break;
                                        }
                                        str = "null";
                                        str2 = "NULL";
                                        i13 = 7;
                                        if (i13 != 0) {
                                            return i13;
                                        }
                                        i14 = this.f20779p0;
                                        i15 = this.f20780q0;
                                        i16 = i11;
                                        i17 = i16;
                                        int i27 = i17;
                                        z6 = true;
                                        long j10 = 0;
                                        while (true) {
                                            if (i14 + i17 != i15) {
                                                c10 = cArr[i14 + i17];
                                                if (c10 != '+') {
                                                    if (c10 != 'E' || c10 == 'e') {
                                                        i18 = i15;
                                                        if (i16 != 2 || i16 == 4) {
                                                            i16 = 5;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        }
                                                    } else if (c10 == '-') {
                                                        i18 = i15;
                                                        if (i16 == 0) {
                                                            i16 = 1;
                                                            i27 = 1;
                                                        } else {
                                                            if (i16 != 5) {
                                                            }
                                                            i16 = 6;
                                                        }
                                                        i17++;
                                                        i15 = i18;
                                                        i21 = 1;
                                                    } else if (c10 == '.') {
                                                        i18 = i15;
                                                        if (i16 == 2) {
                                                            i16 = 3;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        }
                                                    } else if (c10 >= '0' && c10 <= '9') {
                                                        if (i16 == i21 || i16 == 0) {
                                                            i18 = i15;
                                                            j10 = -(c10 - '0');
                                                            i16 = 2;
                                                        } else if (i16 != 2) {
                                                            i18 = i15;
                                                            if (i16 == 3) {
                                                                i16 = 4;
                                                            } else if (i16 == 5 || i16 == 6) {
                                                                i16 = 7;
                                                            }
                                                        } else if (j10 != 0) {
                                                            i18 = i15;
                                                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                                                            z6 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                            j10 = j11;
                                                        }
                                                        i17++;
                                                        i15 = i18;
                                                        i21 = 1;
                                                    } else if (!m7005r0(c10)) {
                                                        i20 = 2;
                                                        if (i16 != 2) {
                                                            if (i16 != i20 || i16 == 4 || i16 == 7) {
                                                                this.f20785v0 = i17;
                                                                i19 = 16;
                                                                this.f20783t0 = 16;
                                                            }
                                                        } else if (z6 || ((j10 == Long.MIN_VALUE && i27 == 0) || (j10 == 0 && i27 != 0))) {
                                                            i20 = 2;
                                                            if (i16 != i20) {
                                                            }
                                                            this.f20785v0 = i17;
                                                            i19 = 16;
                                                            this.f20783t0 = 16;
                                                        } else {
                                                            if (i27 == 0) {
                                                                j10 = -j10;
                                                            }
                                                            this.f20784u0 = j10;
                                                            this.f20779p0 += i17;
                                                            i19 = 15;
                                                            this.f20783t0 = 15;
                                                        }
                                                    }
                                                    if (i19 != 0) {
                                                        return i19;
                                                    }
                                                    if (m7005r0(cArr[this.f20779p0])) {
                                                        m7002a1("Expected value");
                                                        throw null;
                                                    }
                                                    m7003k();
                                                    this.f20783t0 = 10;
                                                    return 10;
                                                }
                                                i18 = i15;
                                                if (i16 != 5) {
                                                }
                                                i16 = 6;
                                                i17++;
                                                i15 = i18;
                                                i21 = 1;
                                            } else if (i17 != cArr.length) {
                                                if (!m6995S(i17 + 1)) {
                                                    int i28 = this.f20779p0;
                                                    i15 = this.f20780q0;
                                                    i14 = i28;
                                                    c10 = cArr[i14 + i17];
                                                    if (c10 != '+') {
                                                        if (c10 != 'E') {
                                                            i18 = i15;
                                                            if (i16 != 2) {
                                                            }
                                                            i16 = 5;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        } else {
                                                            i18 = i15;
                                                            if (i16 != 2) {
                                                            }
                                                            i16 = 5;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        }
                                                        if (i19 != 0) {
                                                            return i19;
                                                        }
                                                        if (m7005r0(cArr[this.f20779p0])) {
                                                            m7002a1("Expected value");
                                                            throw null;
                                                        }
                                                        m7003k();
                                                        this.f20783t0 = 10;
                                                        return 10;
                                                    }
                                                    i18 = i15;
                                                    if (i16 != 5) {
                                                    }
                                                    i16 = 6;
                                                    i17++;
                                                    i15 = i18;
                                                    i21 = 1;
                                                }
                                                i20 = 2;
                                                if (i16 != 2) {
                                                    if (i16 != i20) {
                                                    }
                                                    this.f20785v0 = i17;
                                                    i19 = 16;
                                                    this.f20783t0 = 16;
                                                } else {
                                                    if (z6) {
                                                    }
                                                    i20 = 2;
                                                    if (i16 != i20) {
                                                    }
                                                    this.f20785v0 = i17;
                                                    i19 = 16;
                                                    this.f20783t0 = 16;
                                                }
                                                if (i19 != 0) {
                                                    return i19;
                                                }
                                                if (m7005r0(cArr[this.f20779p0])) {
                                                    m7002a1("Expected value");
                                                    throw null;
                                                }
                                                m7003k();
                                                this.f20783t0 = 10;
                                                return 10;
                                            }
                                            i19 = 0;
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (m7005r0(cArr[this.f20779p0])) {
                                                m7002a1("Expected value");
                                                throw null;
                                            }
                                            m7003k();
                                            this.f20783t0 = 10;
                                            return 10;
                                        }
                                    }
                                    str = "false";
                                    str2 = "FALSE";
                                    i13 = 6;
                                }
                                int length = str.length();
                                int i29 = 1;
                                while (true) {
                                    if (i29 >= length) {
                                        if ((this.f20779p0 + length >= this.f20780q0 && !m6995S(length + 1)) || !m7005r0(cArr[this.f20779p0 + length])) {
                                            this.f20779p0 += length;
                                            this.f20783t0 = i13;
                                            break;
                                        }
                                        break;
                                    }
                                    if ((this.f20779p0 + i29 < this.f20780q0 || m6995S(i29 + 1)) && ((c9 = cArr[this.f20779p0 + i29]) == str.charAt(i29) || c9 == str2.charAt(i29))) {
                                        i29++;
                                    }
                                    i13 = i11;
                                    break;
                                }
                                if (i13 != 0) {
                                    return i13;
                                }
                                i14 = this.f20779p0;
                                i15 = this.f20780q0;
                                i16 = i11;
                                i17 = i16;
                                int i210 = i17;
                                z6 = true;
                                long j12 = 0;
                                while (true) {
                                    if (i14 + i17 != i15) {
                                        c10 = cArr[i14 + i17];
                                        if (c10 != '+') {
                                            if (c10 != 'E') {
                                                i18 = i15;
                                                if (i16 != 2) {
                                                }
                                                i16 = 5;
                                                i17++;
                                                i15 = i18;
                                                i21 = 1;
                                            } else {
                                                i18 = i15;
                                                if (i16 != 2) {
                                                }
                                                i16 = 5;
                                                i17++;
                                                i15 = i18;
                                                i21 = 1;
                                            }
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (m7005r0(cArr[this.f20779p0])) {
                                                m7002a1("Expected value");
                                                throw null;
                                            }
                                            m7003k();
                                            this.f20783t0 = 10;
                                            return 10;
                                        }
                                        i18 = i15;
                                        if (i16 != 5) {
                                        }
                                        i16 = 6;
                                        i17++;
                                        i15 = i18;
                                        i21 = 1;
                                    } else if (i17 != cArr.length) {
                                        if (!m6995S(i17 + 1)) {
                                            int i211 = this.f20779p0;
                                            i15 = this.f20780q0;
                                            i14 = i211;
                                            c10 = cArr[i14 + i17];
                                            if (c10 != '+') {
                                                if (c10 != 'E') {
                                                    i18 = i15;
                                                    if (i16 != 2) {
                                                    }
                                                    i16 = 5;
                                                    i17++;
                                                    i15 = i18;
                                                    i21 = 1;
                                                } else {
                                                    i18 = i15;
                                                    if (i16 != 2) {
                                                    }
                                                    i16 = 5;
                                                    i17++;
                                                    i15 = i18;
                                                    i21 = 1;
                                                }
                                                if (i19 != 0) {
                                                    return i19;
                                                }
                                                if (m7005r0(cArr[this.f20779p0])) {
                                                    m7002a1("Expected value");
                                                    throw null;
                                                }
                                                m7003k();
                                                this.f20783t0 = 10;
                                                return 10;
                                            }
                                            i18 = i15;
                                            if (i16 != 5) {
                                            }
                                            i16 = 6;
                                            i17++;
                                            i15 = i18;
                                            i21 = 1;
                                        }
                                        i20 = 2;
                                        if (i16 != 2) {
                                            if (i16 != i20) {
                                            }
                                            this.f20785v0 = i17;
                                            i19 = 16;
                                            this.f20783t0 = 16;
                                        } else {
                                            if (z6) {
                                            }
                                            i20 = 2;
                                            if (i16 != i20) {
                                            }
                                            this.f20785v0 = i17;
                                            i19 = 16;
                                            this.f20783t0 = 16;
                                        }
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        if (m7005r0(cArr[this.f20779p0])) {
                                            m7002a1("Expected value");
                                            throw null;
                                        }
                                        m7003k();
                                        this.f20783t0 = 10;
                                        return 10;
                                    }
                                    i19 = 0;
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (m7005r0(cArr[this.f20779p0])) {
                                        m7002a1("Expected value");
                                        throw null;
                                    }
                                    m7003k();
                                    this.f20783t0 = 10;
                                    return 10;
                                }
                            }
                            i12 = 1;
                            if (i23 == 1) {
                                this.f20783t0 = 4;
                                return 4;
                            }
                        }
                        if (i23 == i12 && i23 != 2) {
                            m7002a1("Unexpected value");
                            throw null;
                        }
                        m7003k();
                        this.f20779p0 -= i12;
                        this.f20783t0 = 7;
                        return 7;
                    }
                    iArr[i22] = 5;
                    int iM6992C2 = m6992C0(true);
                    if (iM6992C2 != 58) {
                        if (iM6992C2 != 61) {
                            m7002a1("Expected ':'");
                            throw null;
                        }
                        m7003k();
                        if (this.f20779p0 < this.f20780q0 || m6995S(1)) {
                            int i30 = this.f20779p0;
                            if (cArr[i30] == '>') {
                                this.f20779p0 = i30 + 1;
                            }
                        }
                    }
                }
                iArr[i22] = i10;
                if (i23 == 5 && (iM6992C0 = m6992C0(true)) != 44) {
                    if (iM6992C0 != 59) {
                        if (iM6992C0 == 125) {
                            this.f20783t0 = 2;
                            return 2;
                        }
                        m7002a1("Unterminated object");
                        throw null;
                    }
                    m7003k();
                }
                int iM6992C3 = m6992C0(true);
                if (iM6992C3 == 34) {
                    this.f20783t0 = 13;
                    return 13;
                }
                if (iM6992C3 == 39) {
                    m7003k();
                    this.f20783t0 = 12;
                    return 12;
                }
                if (iM6992C3 == 125) {
                    if (i23 != 5) {
                        this.f20783t0 = 2;
                        return 2;
                    }
                    m7002a1("Expected name");
                    throw null;
                }
                m7003k();
                this.f20779p0--;
                if (m7005r0((char) iM6992C3)) {
                    this.f20783t0 = 14;
                    return 14;
                }
                m7002a1("Expected name");
                throw null;
            }
            int iM6992C4 = m6992C0(true);
            if (iM6992C4 != 44) {
                if (iM6992C4 != 59) {
                    if (iM6992C4 == 93) {
                        this.f20783t0 = 4;
                        return 4;
                    }
                    m7002a1("Unterminated array");
                    throw null;
                }
                m7003k();
            }
        }
        i11 = 0;
        iM6992C1 = m6992C0(true);
        if (iM6992C1 != 34) {
            this.f20783t0 = 9;
            return 9;
        }
        if (iM6992C1 != 39) {
            m7003k();
            this.f20783t0 = 8;
            return 8;
        }
        if (iM6992C1 != 44) {
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (i23 == i12) {
        }
        m7003k();
        this.f20779p0 -= i12;
        this.f20783t0 = 7;
        return 7;
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m7005r0(char c9) throws C6383d {
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
        m7003k();
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + m7006v0();
    }

    /* JADX INFO: renamed from: v0 */
    final String m7006v0() {
        StringBuilder sbM21e = AbstractC0010F.m21e(" at line ", this.f20781r0 + 1, " column ", (this.f20779p0 - this.f20782s0) + 1, " path ");
        sbM21e.append(mo5620T());
        return sbM21e.toString();
    }

    /* JADX INFO: renamed from: x */
    public String mo5634x() throws IOException {
        String str;
        int iM7004m = this.f20783t0;
        if (iM7004m == 0) {
            iM7004m = m7004m();
        }
        if (iM7004m == 10) {
            str = m6994J0();
        } else if (iM7004m == 8) {
            str = m6993H0('\'');
        } else if (iM7004m == 9) {
            str = m6993H0('\"');
        } else if (iM7004m == 11) {
            str = this.f20786w0;
            this.f20786w0 = null;
        } else if (iM7004m == 15) {
            str = Long.toString(this.f20784u0);
        } else {
            if (iM7004m != 16) {
                throw new IllegalStateException("Expected a string but was " + AbstractC3794B0.m4474I(mo5616N0()) + m7006v0());
            }
            str = new String(this.f20778o0, this.f20779p0, this.f20785v0);
            this.f20779p0 += this.f20785v0;
        }
        this.f20783t0 = 0;
        int[] iArr = this.f20775A0;
        int i10 = this.f20788y0 - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }
}
