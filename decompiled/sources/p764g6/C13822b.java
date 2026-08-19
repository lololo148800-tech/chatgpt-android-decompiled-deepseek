package p764g6;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import io.sentry.internal.debugmeta.C15384c;
import java.io.EOFException;
import java.io.IOException;
import p025An.C0644w;
import p026Ao.C0653B;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p1113xn.C21307a;
import p232J3.C4206F;
import p959q8.C18639a;

/* JADX INFO: renamed from: g6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13822b extends AbstractC13821a {

    /* JADX INFO: renamed from: x0 */
    public static final C0678l f43830x0;

    /* JADX INFO: renamed from: y0 */
    public static final C0678l f43831y0;

    /* JADX INFO: renamed from: z0 */
    public static final C0678l f43832z0;

    /* JADX INFO: renamed from: r0 */
    public final C0657F f43833r0;

    /* JADX INFO: renamed from: s0 */
    public final C0675i f43834s0;

    /* JADX INFO: renamed from: t0 */
    public int f43835t0;

    /* JADX INFO: renamed from: u0 */
    public long f43836u0;

    /* JADX INFO: renamed from: v0 */
    public int f43837v0;

    /* JADX INFO: renamed from: w0 */
    public String f43838w0;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f43830x0 = C18639a.m19996n("'\\");
        f43831y0 = C18639a.m19996n("\"\\");
        f43832z0 = C18639a.m19996n("{}[]:, \n\t\r\f/\\;#=");
        C18639a.m19996n("\n\r");
        C18639a.m19996n("*/");
    }

    public C13822b(C0657F c0657f) {
        this.f43827Z = new int[32];
        this.f43828o0 = new String[32];
        this.f43829p0 = new int[32];
        this.f43835t0 = 0;
        this.f43833r0 = c0657f;
        this.f43834s0 = c0657f.f1922Z;
        m15425S(6);
    }

    /* JADX INFO: renamed from: C0 */
    public final int m15436C0(String str, C15384c c15384c) {
        int length = ((String[]) c15384c.f47967Z).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) c15384c.f47967Z)[i10])) {
                this.f43835t0 = 0;
                this.f43828o0[this.f43826Y - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: D */
    public final void mo15421D() throws C4206F, EOFException {
        int i10 = 0;
        do {
            int iM15445v0 = this.f43835t0;
            if (iM15445v0 == 0) {
                iM15445v0 = m15445v0();
            }
            if (iM15445v0 == 3) {
                m15425S(1);
            } else {
                if (iM15445v0 == 1) {
                    m15425S(3);
                } else if (iM15445v0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new C0644w("Expected a value but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
                    }
                    this.f43826Y--;
                } else if (iM15445v0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new C0644w("Expected a value but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
                    }
                    this.f43826Y--;
                } else {
                    C0675i c0675i = this.f43834s0;
                    if (iM15445v0 == 14 || iM15445v0 == 10) {
                        long jMo1344L0 = this.f43833r0.mo1344L0(f43832z0);
                        if (jMo1344L0 == -1) {
                            jMo1344L0 = c0675i.f1970Z;
                        }
                        c0675i.skip(jMo1344L0);
                    } else if (iM15445v0 == 9 || iM15445v0 == 13) {
                        m15442X0(f43831y0);
                    } else if (iM15445v0 == 8 || iM15445v0 == 12) {
                        m15442X0(f43830x0);
                    } else if (iM15445v0 == 17) {
                        c0675i.skip(this.f43837v0);
                    } else if (iM15445v0 == 18) {
                        throw new C0644w("Expected a value but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
                    }
                }
                this.f43835t0 = 0;
            }
            i10++;
            this.f43835t0 = 0;
        } while (i10 != 0);
        int[] iArr = this.f43829p0;
        int i11 = this.f43826Y - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f43828o0[i11] = "null";
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m15437H0(int i10) throws C4206F {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m15444r0();
        throw null;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m15438J0(boolean z6) throws C4206F, EOFException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            C0657F c0657f = this.f43833r0;
            if (!c0657f.mo1359l(i11)) {
                if (z6) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j10 = i10;
            C0675i c0675i = this.f43834s0;
            byte bM1422T = c0675i.m1422T(j10);
            if (bM1422T != 10 && bM1422T != 32 && bM1422T != 13 && bM1422T != 9) {
                c0675i.skip(j10);
                if (bM1422T == 47) {
                    if (!c0657f.mo1359l(2L)) {
                        return bM1422T;
                    }
                    m15444r0();
                    throw null;
                }
                if (bM1422T != 35) {
                    return bM1422T;
                }
                m15444r0();
                throw null;
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final String m15439N0(C0678l c0678l) throws C4206F, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jMo1344L0 = this.f43833r0.mo1344L0(c0678l);
            if (jMo1344L0 == -1) {
                m15432j0("Unterminated string");
                throw null;
            }
            C0675i c0675i = this.f43834s0;
            if (c0675i.m1422T(jMo1344L0) != 92) {
                if (sb2 == null) {
                    String strM1427Y0 = c0675i.m1427Y0(jMo1344L0, C21307a.f67720a);
                    c0675i.readByte();
                    return strM1427Y0;
                }
                sb2.append(c0675i.m1427Y0(jMo1344L0, C21307a.f67720a));
                c0675i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c0675i.m1427Y0(jMo1344L0, C21307a.f67720a));
            c0675i.readByte();
            sb2.append(m15441W0());
        }
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: O */
    public final double mo15423O() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 16) {
            this.f43835t0 = 0;
            int[] iArr = this.f43829p0;
            int i10 = this.f43826Y - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f43836u0;
        }
        if (iM15445v0 == 17) {
            long j10 = this.f43837v0;
            C0675i c0675i = this.f43834s0;
            c0675i.getClass();
            this.f43838w0 = c0675i.m1427Y0(j10, C21307a.f67720a);
        } else if (iM15445v0 == 9) {
            this.f43838w0 = m15439N0(f43831y0);
        } else if (iM15445v0 == 8) {
            this.f43838w0 = m15439N0(f43830x0);
        } else if (iM15445v0 == 10) {
            this.f43838w0 = m15440V0();
        } else if (iM15445v0 != 11) {
            throw new C0644w("Expected a double but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
        }
        this.f43835t0 = 11;
        try {
            double d10 = Double.parseDouble(this.f43838w0);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new C4206F("JSON forbids NaN and infinities: " + d10 + " at path " + m15422E());
            }
            this.f43838w0 = null;
            this.f43835t0 = 0;
            int[] iArr2 = this.f43829p0;
            int i11 = this.f43826Y - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new C0644w("Expected a double but was " + this.f43838w0 + " at path " + m15422E());
        }
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: P */
    public final int mo15424P() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        switch (iM15445v0) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: S0 */
    public final boolean mo15426S0() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 5) {
            this.f43835t0 = 0;
            int[] iArr = this.f43829p0;
            int i10 = this.f43826Y - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM15445v0 == 6) {
            this.f43835t0 = 0;
            int[] iArr2 = this.f43829p0;
            int i11 = this.f43826Y - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new C0644w("Expected a boolean but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: T */
    public final int mo15427T(C15384c c15384c) throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 < 12 || iM15445v0 > 15) {
            return -1;
        }
        if (iM15445v0 == 15) {
            return m15436C0(this.f43838w0, c15384c);
        }
        int iMo1342G0 = this.f43833r0.mo1342G0((C0653B) c15384c.f47968o0);
        if (iMo1342G0 != -1) {
            this.f43835t0 = 0;
            this.f43828o0[this.f43826Y - 1] = ((String[]) c15384c.f47967Z)[iMo1342G0];
            return iMo1342G0;
        }
        String str = this.f43828o0[this.f43826Y - 1];
        String strM15443a0 = m15443a0();
        int iM15436C0 = m15436C0(strM15443a0, c15384c);
        if (iM15436C0 == -1) {
            this.f43835t0 = 15;
            this.f43838w0 = strM15443a0;
            this.f43828o0[this.f43826Y - 1] = str;
        }
        return iM15436C0;
    }

    /* JADX INFO: renamed from: V0 */
    public final String m15440V0() {
        long jMo1344L0 = this.f43833r0.mo1344L0(f43832z0);
        C0675i c0675i = this.f43834s0;
        if (jMo1344L0 == -1) {
            return c0675i.m1428Z0();
        }
        c0675i.getClass();
        return c0675i.m1427Y0(jMo1344L0, C21307a.f67720a);
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: W */
    public final void mo15428W() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 14) {
            long jMo1344L0 = this.f43833r0.mo1344L0(f43832z0);
            C0675i c0675i = this.f43834s0;
            if (jMo1344L0 == -1) {
                jMo1344L0 = c0675i.f1970Z;
            }
            c0675i.skip(jMo1344L0);
        } else if (iM15445v0 == 13) {
            m15442X0(f43831y0);
        } else if (iM15445v0 == 12) {
            m15442X0(f43830x0);
        } else if (iM15445v0 != 15) {
            throw new C0644w("Expected a name but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
        }
        this.f43835t0 = 0;
        this.f43828o0[this.f43826Y - 1] = "null";
    }

    /* JADX INFO: renamed from: W0 */
    public final char m15441W0() throws C4206F, EOFException {
        int i10;
        C0657F c0657f = this.f43833r0;
        if (!c0657f.mo1359l(1L)) {
            m15432j0("Unterminated escape sequence");
            throw null;
        }
        C0675i c0675i = this.f43834s0;
        byte b = c0675i.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            m15432j0("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!c0657f.mo1359l(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m15422E());
        }
        char c9 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bM1422T = c0675i.m1422T(i11);
            char c10 = (char) (c9 << 4);
            if (bM1422T >= 48 && bM1422T <= 57) {
                i10 = bM1422T - 48;
            } else if (bM1422T >= 97 && bM1422T <= 102) {
                i10 = bM1422T - 87;
            } else {
                if (bM1422T < 65 || bM1422T > 70) {
                    m15432j0("\\u".concat(c0675i.m1427Y0(4L, C21307a.f67720a)));
                    throw null;
                }
                i10 = bM1422T - 55;
            }
            c9 = (char) (i10 + c10);
        }
        c0675i.skip(4L);
        return c9;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m15442X0(C0678l c0678l) throws C4206F, EOFException {
        while (true) {
            long jMo1344L0 = this.f43833r0.mo1344L0(c0678l);
            if (jMo1344L0 == -1) {
                m15432j0("Unterminated string");
                throw null;
            }
            C0675i c0675i = this.f43834s0;
            if (c0675i.m1422T(jMo1344L0) != 92) {
                c0675i.skip(jMo1344L0 + 1);
                return;
            } else {
                c0675i.skip(jMo1344L0 + 1);
                m15441W0();
            }
        }
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: a */
    public final void mo15429a() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 3) {
            m15425S(1);
            this.f43829p0[this.f43826Y - 1] = 0;
            this.f43835t0 = 0;
        } else {
            throw new C0644w("Expected BEGIN_ARRAY but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final String m15443a0() throws C4206F, EOFException {
        String strM15439N0;
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 14) {
            strM15439N0 = m15440V0();
        } else if (iM15445v0 == 13) {
            strM15439N0 = m15439N0(f43831y0);
        } else if (iM15445v0 == 12) {
            strM15439N0 = m15439N0(f43830x0);
        } else {
            if (iM15445v0 != 15) {
                throw new C0644w("Expected a name but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
            }
            strM15439N0 = this.f43838w0;
        }
        this.f43835t0 = 0;
        this.f43828o0[this.f43826Y - 1] = strM15439N0;
        return strM15439N0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f43835t0 = 0;
        this.f43827Z[0] = 8;
        this.f43826Y = 1;
        this.f43834s0.m1429a();
        this.f43833r0.close();
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: e */
    public final void mo15430e() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 1) {
            m15425S(3);
            this.f43835t0 = 0;
        } else {
            throw new C0644w("Expected BEGIN_OBJECT but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
        }
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: g0 */
    public final int mo15431g0() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 16) {
            long j10 = this.f43836u0;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f43835t0 = 0;
                int[] iArr = this.f43829p0;
                int i11 = this.f43826Y - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new C0644w("Expected an int but was " + this.f43836u0 + " at path " + m15422E());
        }
        if (iM15445v0 == 17) {
            long j11 = this.f43837v0;
            C0675i c0675i = this.f43834s0;
            c0675i.getClass();
            this.f43838w0 = c0675i.m1427Y0(j11, C21307a.f67720a);
        } else if (iM15445v0 == 9 || iM15445v0 == 8) {
            String strM15439N0 = iM15445v0 == 9 ? m15439N0(f43831y0) : m15439N0(f43830x0);
            this.f43838w0 = strM15439N0;
            try {
                int i12 = Integer.parseInt(strM15439N0);
                this.f43835t0 = 0;
                int[] iArr2 = this.f43829p0;
                int i13 = this.f43826Y - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iM15445v0 != 11) {
            throw new C0644w("Expected an int but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
        }
        this.f43835t0 = 11;
        try {
            double d10 = Double.parseDouble(this.f43838w0);
            int i14 = (int) d10;
            if (i14 != d10) {
                throw new C0644w("Expected an int but was " + this.f43838w0 + " at path " + m15422E());
            }
            this.f43838w0 = null;
            this.f43835t0 = 0;
            int[] iArr3 = this.f43829p0;
            int i15 = this.f43826Y - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new C0644w("Expected an int but was " + this.f43838w0 + " at path " + m15422E());
        }
    }

    @Override // p764g6.AbstractC13821a
    public final boolean hasNext() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        return (iM15445v0 == 2 || iM15445v0 == 4 || iM15445v0 == 18) ? false : true;
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: k */
    public final void mo15433k() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 != 4) {
            throw new C0644w("Expected END_ARRAY but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
        }
        int i10 = this.f43826Y;
        this.f43826Y = i10 - 1;
        int[] iArr = this.f43829p0;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f43835t0 = 0;
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: m */
    public final void mo15434m() throws C4206F, EOFException {
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 != 2) {
            throw new C0644w("Expected END_OBJECT but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
        }
        int i10 = this.f43826Y;
        int i11 = i10 - 1;
        this.f43826Y = i11;
        this.f43828o0[i11] = null;
        int[] iArr = this.f43829p0;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f43835t0 = 0;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m15444r0() throws C4206F {
        m15432j0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String toString() {
        return "JsonReader(" + this.f43833r0 + Separators.RPAREN;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01df  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:176:0x0201  */
    /* JADX WARN: Code duplicated, block: B:178:0x0208  */
    /* JADX WARN: Code duplicated, block: B:180:0x020d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0215  */
    /* JADX WARN: Code duplicated, block: B:185:0x021c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0234  */
    /* JADX WARN: Code duplicated, block: B:196:0x0239  */
    /* JADX WARN: Code duplicated, block: B:231:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x00b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /* JADX INFO: renamed from: v0 */
    public final int m15445v0() throws C4206F, EOFException {
        int iM15438J0;
        byte bM1422T;
        C0657F c0657f;
        int i10;
        String str;
        String str2;
        int length;
        int i11;
        int i12;
        char cM1422T;
        char c9;
        int i13;
        int i14;
        int i15;
        int i16;
        byte bM1422T2;
        char c10;
        int[] iArr = this.f43827Z;
        int i17 = this.f43826Y - 1;
        int i18 = iArr[i17];
        C0675i c0675i = this.f43834s0;
        if (i18 == 1) {
            iArr[i17] = 2;
        } else if (i18 == 2) {
            int iM15438J1 = m15438J0(true);
            c0675i.readByte();
            if (iM15438J1 != 44) {
                if (iM15438J1 == 59) {
                    m15444r0();
                    throw null;
                }
                if (iM15438J1 == 93) {
                    this.f43835t0 = 4;
                    return 4;
                }
                m15432j0("Unterminated array");
                throw null;
            }
        } else {
            if (i18 == 3 || i18 == 5) {
                iArr[i17] = 4;
                if (i18 == 5) {
                    int iM15438J2 = m15438J0(true);
                    c0675i.readByte();
                    if (iM15438J2 != 44) {
                        if (iM15438J2 == 59) {
                            m15444r0();
                            throw null;
                        }
                        if (iM15438J2 == 125) {
                            this.f43835t0 = 2;
                            return 2;
                        }
                        m15432j0("Unterminated object");
                        throw null;
                    }
                }
                int iM15438J3 = m15438J0(true);
                if (iM15438J3 == 34) {
                    c0675i.readByte();
                    this.f43835t0 = 13;
                    return 13;
                }
                if (iM15438J3 == 39) {
                    c0675i.readByte();
                    m15444r0();
                    throw null;
                }
                if (iM15438J3 != 125) {
                    m15444r0();
                    throw null;
                }
                if (i18 == 5) {
                    m15432j0("Expected name");
                    throw null;
                }
                c0675i.readByte();
                this.f43835t0 = 2;
                return 2;
            }
            if (i18 != 4) {
                if (i18 == 6) {
                    iArr[i17] = 7;
                } else {
                    if (i18 == 7) {
                        if (m15438J0(false) == -1) {
                            this.f43835t0 = 18;
                            return 18;
                        }
                        m15444r0();
                        throw null;
                    }
                    if (i18 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iM15438J0 = m15438J0(true);
                if (iM15438J0 != 34) {
                    c0675i.readByte();
                    this.f43835t0 = 9;
                    return 9;
                }
                if (iM15438J0 != 39) {
                    m15444r0();
                    throw null;
                }
                if (iM15438J0 != 44 && iM15438J0 != 59) {
                    if (iM15438J0 != 91) {
                        c0675i.readByte();
                        this.f43835t0 = 3;
                        return 3;
                    }
                    if (iM15438J0 != 93) {
                        if (iM15438J0 != 123) {
                            c0675i.readByte();
                            this.f43835t0 = 1;
                            return 1;
                        }
                        bM1422T = c0675i.m1422T(0L);
                        c0657f = this.f43833r0;
                        if (bM1422T != 116 || bM1422T == 84) {
                            i10 = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (bM1422T != 102 && bM1422T != 70) {
                                if (bM1422T != 110 && bM1422T != 78) {
                                    i10 = 0;
                                    break;
                                }
                                i10 = 7;
                                str2 = "null";
                                str = "NULL";
                                if (i10 != 0) {
                                    return i10;
                                }
                                long j10 = 0;
                                boolean z6 = true;
                                c9 = 0;
                                i13 = 0;
                                boolean z10 = false;
                                while (true) {
                                    i14 = i13 + 1;
                                    if (c0657f.mo1359l(i14)) {
                                        bM1422T2 = c0675i.m1422T(i13);
                                        if (bM1422T2 != 43) {
                                            if (bM1422T2 != 69 || bM1422T2 == 101) {
                                                if (c9 != 2 || c9 == 4) {
                                                    c9 = 5;
                                                    i13 = i14;
                                                } else {
                                                    i16 = 0;
                                                }
                                            } else if (bM1422T2 == 45) {
                                                c10 = 6;
                                                if (c9 == 0) {
                                                    c9 = 1;
                                                    z10 = true;
                                                } else {
                                                    if (c9 != 5) {
                                                        i16 = 0;
                                                    }
                                                    c9 = c10;
                                                }
                                                i13 = i14;
                                            } else if (bM1422T2 != 46) {
                                                if (bM1422T2 >= 48 && bM1422T2 <= 57) {
                                                    if (c9 == 1 || c9 == 0) {
                                                        j10 = -(bM1422T2 - 48);
                                                        c9 = 2;
                                                    } else {
                                                        if (c9 == 2) {
                                                            if (j10 != 0) {
                                                                long j11 = (10 * j10) - ((long) (bM1422T2 - 48));
                                                                z6 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                                j10 = j11;
                                                            }
                                                        } else if (c9 == 3) {
                                                            c9 = 4;
                                                        } else if (c9 == 5 || c9 == 6) {
                                                            c9 = 7;
                                                        }
                                                        i13 = i14;
                                                    }
                                                    i13 = i14;
                                                } else if (!m15437H0(bM1422T2)) {
                                                }
                                                i16 = 0;
                                            } else if (c9 == 2) {
                                                c9 = 3;
                                                i13 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            if (i16 != 0) {
                                                return i16;
                                            }
                                            if (m15437H0(c0675i.m1422T(0L))) {
                                                m15444r0();
                                                throw null;
                                            }
                                            m15432j0("Expected value");
                                            throw null;
                                        }
                                        c10 = 6;
                                        if (c9 != 5) {
                                            i16 = 0;
                                            if (i16 != 0) {
                                                return i16;
                                            }
                                            if (m15437H0(c0675i.m1422T(0L))) {
                                                m15432j0("Expected value");
                                                throw null;
                                            }
                                            m15444r0();
                                            throw null;
                                        }
                                        c9 = c10;
                                        i13 = i14;
                                    }
                                    if (c9 == 2 || !z6 || ((j10 == Long.MIN_VALUE && !z10) || (j10 == 0 && z10))) {
                                        if (c9 != 2 || c9 == 4 || c9 == 7) {
                                            this.f43837v0 = i13;
                                            i15 = 17;
                                            this.f43835t0 = 17;
                                        } else {
                                            i16 = 0;
                                        }
                                        if (i16 != 0) {
                                            return i16;
                                        }
                                        if (m15437H0(c0675i.m1422T(0L))) {
                                            m15432j0("Expected value");
                                            throw null;
                                        }
                                        m15444r0();
                                        throw null;
                                    }
                                    if (!z10) {
                                        j10 = -j10;
                                    }
                                    this.f43836u0 = j10;
                                    c0675i.skip(i13);
                                    i15 = 16;
                                    this.f43835t0 = 16;
                                    i16 = i15;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (m15437H0(c0675i.m1422T(0L))) {
                                        m15432j0("Expected value");
                                        throw null;
                                    }
                                    m15444r0();
                                    throw null;
                                }
                            }
                            i10 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        length = str2.length();
                        i11 = 1;
                        while (true) {
                            if (i11 >= length) {
                                if (c0657f.mo1359l(length + 1) || !m15437H0(c0675i.m1422T(length))) {
                                    c0675i.skip(length);
                                    this.f43835t0 = i10;
                                    break;
                                }
                            } else {
                                i12 = i11 + 1;
                                if (!c0657f.mo1359l(i12) && ((cM1422T = c0675i.m1422T(i11)) == str2.charAt(i11) || cM1422T == str.charAt(i11))) {
                                    i11 = i12;
                                }
                            }
                            i10 = 0;
                            break;
                        }
                        if (i10 != 0) {
                            return i10;
                        }
                        long j12 = 0;
                        boolean z11 = true;
                        c9 = 0;
                        i13 = 0;
                        boolean z12 = false;
                        while (true) {
                            i14 = i13 + 1;
                            if (c0657f.mo1359l(i14)) {
                                bM1422T2 = c0675i.m1422T(i13);
                                if (bM1422T2 != 43) {
                                    if (bM1422T2 != 69) {
                                        if (c9 != 2) {
                                        }
                                        c9 = 5;
                                        i13 = i14;
                                    } else {
                                        if (c9 != 2) {
                                        }
                                        c9 = 5;
                                        i13 = i14;
                                    }
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (m15437H0(c0675i.m1422T(0L))) {
                                        m15432j0("Expected value");
                                        throw null;
                                    }
                                    m15444r0();
                                    throw null;
                                }
                                c10 = 6;
                                if (c9 != 5) {
                                    i16 = 0;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (m15437H0(c0675i.m1422T(0L))) {
                                        m15432j0("Expected value");
                                        throw null;
                                    }
                                    m15444r0();
                                    throw null;
                                }
                                c9 = c10;
                                i13 = i14;
                            }
                            if (c9 == 2) {
                                if (c9 != 2) {
                                }
                                this.f43837v0 = i13;
                                i15 = 17;
                                this.f43835t0 = 17;
                            } else {
                                if (c9 != 2) {
                                }
                                this.f43837v0 = i13;
                                i15 = 17;
                                this.f43835t0 = 17;
                            }
                            i16 = i15;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m15437H0(c0675i.m1422T(0L))) {
                                m15432j0("Expected value");
                                throw null;
                            }
                            m15444r0();
                            throw null;
                        }
                    }
                    if (i18 == 1) {
                        c0675i.readByte();
                        this.f43835t0 = 4;
                        return 4;
                    }
                }
                if (i18 != 1 || i18 == 2) {
                    m15444r0();
                    throw null;
                }
                m15432j0("Unexpected value");
                throw null;
            }
            iArr[i17] = 5;
            int iM15438J4 = m15438J0(true);
            c0675i.readByte();
            if (iM15438J4 != 58) {
                if (iM15438J4 != 61) {
                    m15432j0("Expected ':'");
                    throw null;
                }
                m15444r0();
                throw null;
            }
        }
        iM15438J0 = m15438J0(true);
        if (iM15438J0 != 34) {
            c0675i.readByte();
            this.f43835t0 = 9;
            return 9;
        }
        if (iM15438J0 != 39) {
            m15444r0();
            throw null;
        }
        if (iM15438J0 != 44) {
            if (iM15438J0 != 91) {
                c0675i.readByte();
                this.f43835t0 = 3;
                return 3;
            }
            if (iM15438J0 != 93) {
                if (iM15438J0 != 123) {
                    c0675i.readByte();
                    this.f43835t0 = 1;
                    return 1;
                }
                bM1422T = c0675i.m1422T(0L);
                c0657f = this.f43833r0;
                if (bM1422T != 116) {
                    i10 = 5;
                    str2 = "true";
                    str = "TRUE";
                    length = str2.length();
                    i11 = 1;
                    while (true) {
                        if (i11 >= length) {
                            if (c0657f.mo1359l(length + 1)) {
                            }
                            c0675i.skip(length);
                            this.f43835t0 = i10;
                            break;
                        }
                        i12 = i11 + 1;
                        if (!c0657f.mo1359l(i12)) {
                            i11 = i12;
                        }
                    }
                    if (i10 != 0) {
                        return i10;
                    }
                    long j13 = 0;
                    boolean z13 = true;
                    c9 = 0;
                    i13 = 0;
                    boolean z14 = false;
                    while (true) {
                        i14 = i13 + 1;
                        if (c0657f.mo1359l(i14)) {
                            bM1422T2 = c0675i.m1422T(i13);
                            if (bM1422T2 != 43) {
                                if (bM1422T2 != 69) {
                                    if (c9 != 2) {
                                    }
                                    c9 = 5;
                                    i13 = i14;
                                } else {
                                    if (c9 != 2) {
                                    }
                                    c9 = 5;
                                    i13 = i14;
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (m15437H0(c0675i.m1422T(0L))) {
                                    m15432j0("Expected value");
                                    throw null;
                                }
                                m15444r0();
                                throw null;
                            }
                            c10 = 6;
                            if (c9 != 5) {
                                i16 = 0;
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (m15437H0(c0675i.m1422T(0L))) {
                                    m15432j0("Expected value");
                                    throw null;
                                }
                                m15444r0();
                                throw null;
                            }
                            c9 = c10;
                            i13 = i14;
                        }
                        if (c9 == 2) {
                            if (c9 != 2) {
                            }
                            this.f43837v0 = i13;
                            i15 = 17;
                            this.f43835t0 = 17;
                        } else {
                            if (c9 != 2) {
                            }
                            this.f43837v0 = i13;
                            i15 = 17;
                            this.f43835t0 = 17;
                        }
                        i16 = i15;
                        if (i16 != 0) {
                            return i16;
                        }
                        if (m15437H0(c0675i.m1422T(0L))) {
                            m15432j0("Expected value");
                            throw null;
                        }
                        m15444r0();
                        throw null;
                    }
                }
                i10 = 5;
                str2 = "true";
                str = "TRUE";
                length = str2.length();
                i11 = 1;
                while (true) {
                    if (i11 >= length) {
                        if (c0657f.mo1359l(length + 1)) {
                        }
                        c0675i.skip(length);
                        this.f43835t0 = i10;
                        break;
                    }
                    i12 = i11 + 1;
                    if (!c0657f.mo1359l(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != 0) {
                    return i10;
                }
                long j14 = 0;
                boolean z15 = true;
                c9 = 0;
                i13 = 0;
                boolean z16 = false;
                while (true) {
                    i14 = i13 + 1;
                    if (c0657f.mo1359l(i14)) {
                        bM1422T2 = c0675i.m1422T(i13);
                        if (bM1422T2 != 43) {
                            if (bM1422T2 != 69) {
                                if (c9 != 2) {
                                }
                                c9 = 5;
                                i13 = i14;
                            } else {
                                if (c9 != 2) {
                                }
                                c9 = 5;
                                i13 = i14;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m15437H0(c0675i.m1422T(0L))) {
                                m15432j0("Expected value");
                                throw null;
                            }
                            m15444r0();
                            throw null;
                        }
                        c10 = 6;
                        if (c9 != 5) {
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m15437H0(c0675i.m1422T(0L))) {
                                m15432j0("Expected value");
                                throw null;
                            }
                            m15444r0();
                            throw null;
                        }
                        c9 = c10;
                        i13 = i14;
                    }
                    if (c9 == 2) {
                        if (c9 != 2) {
                        }
                        this.f43837v0 = i13;
                        i15 = 17;
                        this.f43835t0 = 17;
                    } else {
                        if (c9 != 2) {
                        }
                        this.f43837v0 = i13;
                        i15 = 17;
                        this.f43835t0 = 17;
                    }
                    i16 = i15;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (m15437H0(c0675i.m1422T(0L))) {
                        m15432j0("Expected value");
                        throw null;
                    }
                    m15444r0();
                    throw null;
                }
                i10 = 0;
                if (i10 != 0) {
                    return i10;
                }
                long j15 = 0;
                boolean z17 = true;
                c9 = 0;
                i13 = 0;
                boolean z18 = false;
                while (true) {
                    i14 = i13 + 1;
                    if (c0657f.mo1359l(i14)) {
                        bM1422T2 = c0675i.m1422T(i13);
                        if (bM1422T2 != 43) {
                            if (bM1422T2 != 69) {
                                if (c9 != 2) {
                                }
                                c9 = 5;
                                i13 = i14;
                            } else {
                                if (c9 != 2) {
                                }
                                c9 = 5;
                                i13 = i14;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m15437H0(c0675i.m1422T(0L))) {
                                m15432j0("Expected value");
                                throw null;
                            }
                            m15444r0();
                            throw null;
                        }
                        c10 = 6;
                        if (c9 != 5) {
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m15437H0(c0675i.m1422T(0L))) {
                                m15432j0("Expected value");
                                throw null;
                            }
                            m15444r0();
                            throw null;
                        }
                        c9 = c10;
                        i13 = i14;
                    }
                    if (c9 == 2) {
                        if (c9 != 2) {
                        }
                        this.f43837v0 = i13;
                        i15 = 17;
                        this.f43835t0 = 17;
                    } else {
                        if (c9 != 2) {
                        }
                        this.f43837v0 = i13;
                        i15 = 17;
                        this.f43835t0 = 17;
                    }
                    i16 = i15;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (m15437H0(c0675i.m1422T(0L))) {
                        m15432j0("Expected value");
                        throw null;
                    }
                    m15444r0();
                    throw null;
                }
            }
            if (i18 == 1) {
                c0675i.readByte();
                this.f43835t0 = 4;
                return 4;
            }
        }
        if (i18 != 1) {
        }
        m15444r0();
        throw null;
    }

    @Override // p764g6.AbstractC13821a
    /* JADX INFO: renamed from: x */
    public final String mo15435x() throws C4206F, EOFException {
        String strM1427Y0;
        int iM15445v0 = this.f43835t0;
        if (iM15445v0 == 0) {
            iM15445v0 = m15445v0();
        }
        if (iM15445v0 == 10) {
            strM1427Y0 = m15440V0();
        } else if (iM15445v0 == 9) {
            strM1427Y0 = m15439N0(f43831y0);
        } else if (iM15445v0 == 8) {
            strM1427Y0 = m15439N0(f43830x0);
        } else if (iM15445v0 == 11) {
            strM1427Y0 = this.f43838w0;
            this.f43838w0 = null;
        } else if (iM15445v0 == 16) {
            strM1427Y0 = Long.toString(this.f43836u0);
        } else {
            if (iM15445v0 != 17) {
                throw new C0644w("Expected a string but was " + AbstractC12107L1.m13809A(mo15424P()) + " at path " + m15422E());
            }
            long j10 = this.f43837v0;
            C0675i c0675i = this.f43834s0;
            c0675i.getClass();
            strM1427Y0 = c0675i.m1427Y0(j10, C21307a.f67720a);
        }
        this.f43835t0 = 0;
        int[] iArr = this.f43829p0;
        int i10 = this.f43826Y - 1;
        iArr[i10] = iArr[i10] + 1;
        return strM1427Y0;
    }
}
