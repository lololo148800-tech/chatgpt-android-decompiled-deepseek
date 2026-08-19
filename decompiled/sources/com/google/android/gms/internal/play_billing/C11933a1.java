package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p232J3.C4206F;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11933a1 extends AbstractC11957g1 {

    /* JADX INFO: renamed from: r0 */
    public static final Logger f36232r0 = Logger.getLogger(C11933a1.class.getName());

    /* JADX INFO: renamed from: s0 */
    public static final boolean f36233s0 = AbstractC11906R1.f36185e;

    /* JADX INFO: renamed from: Z */
    public C12021w1 f36234Z;

    /* JADX INFO: renamed from: o0 */
    public final byte[] f36235o0;

    /* JADX INFO: renamed from: p0 */
    public final int f36236p0;

    /* JADX INFO: renamed from: q0 */
    public int f36237q0;

    public C11933a1(int i10, byte[] bArr) {
        super(11);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Array range is invalid. Buffer.length=", length, i10, ", offset=0, length="));
        }
        this.f36235o0 = bArr;
        this.f36237q0 = 0;
        this.f36236p0 = i10;
    }

    /* JADX INFO: renamed from: V */
    public static int m13382V(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m13383k0(int i10, AbstractC11908S0 abstractC11908S0, InterfaceC11880I1 interfaceC11880I1) {
        int iM13386n0 = m13386n0(i10 << 3);
        return abstractC11908S0.mo13345a(interfaceC11880I1) + iM13386n0 + iM13386n0;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m13384l0(AbstractC11908S0 abstractC11908S0, InterfaceC11880I1 interfaceC11880I1) {
        int iMo13345a = abstractC11908S0.mo13345a(interfaceC11880I1);
        return m13386n0(iMo13345a) + iMo13345a;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m13385m0(String str) {
        int length;
        try {
            length = AbstractC11912T1.m13352c(str);
        } catch (C11909S1 unused) {
            length = str.getBytes(AbstractC11989o1.f36309a).length;
        }
        return m13386n0(length) + length;
    }

    /* JADX INFO: renamed from: n0 */
    public static int m13386n0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: W */
    public final void m13387W(int i10, byte[] bArr) throws C4206F {
        try {
            System.arraycopy(bArr, 0, this.f36235o0, this.f36237q0, i10);
            this.f36237q0 += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(this.f36237q0, this.f36236p0, i10, e10);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m13388X(int i10, C11929Z0 c11929z0) throws C4206F {
        m13398h0((i10 << 3) | 2);
        m13398h0(c11929z0.mo13368j());
        m13387W(c11929z0.mo13368j(), c11929z0.f36229Z);
    }

    /* JADX INFO: renamed from: Y */
    public final void m13389Y(int i10, int i11) throws C4206F {
        m13398h0((i10 << 3) | 5);
        m13390Z(i11);
    }

    /* JADX INFO: renamed from: Z */
    public final void m13390Z(int i10) throws C4206F {
        int i11 = this.f36237q0;
        try {
            byte[] bArr = this.f36235o0;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            this.f36237q0 = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(i11, this.f36236p0, 4, e10);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m13391a0(int i10, long j10) throws C4206F {
        m13398h0((i10 << 3) | 1);
        m13392b0(j10);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m13392b0(long j10) throws C4206F {
        int i10 = this.f36237q0;
        try {
            byte[] bArr = this.f36235o0;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            this.f36237q0 = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(i10, this.f36236p0, 8, e10);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m13393c0(int i10, int i11) throws C4206F {
        m13398h0(i10 << 3);
        m13394d0(i11);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m13394d0(int i10) throws C4206F {
        if (i10 >= 0) {
            m13398h0(i10);
        } else {
            m13400j0(i10);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13395e0(int i10, String str) {
        m13398h0((i10 << 3) | 2);
        int i11 = this.f36237q0;
        try {
            int iM13386n0 = m13386n0(str.length() * 3);
            int iM13386n1 = m13386n0(str.length());
            byte[] bArr = this.f36235o0;
            int i12 = this.f36236p0;
            if (iM13386n1 == iM13386n0) {
                int i13 = i11 + iM13386n1;
                this.f36237q0 = i13;
                int iM13351b = AbstractC11912T1.m13351b(str, bArr, i13, i12 - i13);
                this.f36237q0 = i11;
                m13398h0((iM13351b - i11) - iM13386n1);
                this.f36237q0 = iM13351b;
            } else {
                m13398h0(AbstractC11912T1.m13352c(str));
                int i14 = this.f36237q0;
                this.f36237q0 = AbstractC11912T1.m13351b(str, bArr, i14, i12 - i14);
            }
        } catch (C11909S1 e10) {
            this.f36237q0 = i11;
            f36232r0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(AbstractC11989o1.f36309a);
            try {
                int length = bytes.length;
                m13398h0(length);
                m13387W(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new C4206F(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new C4206F(e12);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m13396f0(int i10, int i11) throws C4206F {
        m13398h0((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m13397g0(int i10, int i11) throws C4206F {
        m13398h0(i10 << 3);
        m13398h0(i11);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m13398h0(int i10) throws C4206F {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f36235o0;
            if (i11 == 0) {
                int i12 = this.f36237q0;
                this.f36237q0 = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f36237q0;
                    this.f36237q0 = i13 + 1;
                    bArr[i13] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C4206F(this.f36237q0, this.f36236p0, 1, e10);
                }
            }
            throw new C4206F(this.f36237q0, this.f36236p0, 1, e10);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m13399i0(int i10, long j10) throws C4206F {
        m13398h0(i10 << 3);
        m13400j0(j10);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m13400j0(long j10) throws C4206F {
        byte[] bArr = this.f36235o0;
        boolean z6 = f36233s0;
        int i10 = this.f36236p0;
        if (!z6 || i10 - this.f36237q0 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i11 = this.f36237q0;
                    this.f36237q0 = i11 + 1;
                    bArr[i11] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C4206F(this.f36237q0, i10, 1, e10);
                }
            }
            int i12 = this.f36237q0;
            this.f36237q0 = i12 + 1;
            bArr[i12] = (byte) j10;
            return;
        }
        while (true) {
            int i13 = (int) j10;
            if ((j10 & (-128)) == 0) {
                int i14 = this.f36237q0;
                this.f36237q0 = i14 + 1;
                AbstractC11906R1.f36183c.mo13317d(bArr, AbstractC11906R1.f36186f + ((long) i14), (byte) i13);
                return;
            }
            int i15 = this.f36237q0;
            this.f36237q0 = i15 + 1;
            AbstractC11906R1.f36183c.mo13317d(bArr, AbstractC11906R1.f36186f + i15, (byte) ((i13 | 128) & 255));
            j10 >>>= 7;
        }
    }
}
