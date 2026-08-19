package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import p351O2.C6102p;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10963i extends AbstractC10937P {

    /* JADX INFO: renamed from: h */
    public static final Logger f33052h = Logger.getLogger(C10963i.class.getName());

    /* JADX INFO: renamed from: i */
    public static final boolean f33053i = AbstractC10982r0.f33091f;

    /* JADX INFO: renamed from: c */
    public C10930I f33054c;

    /* JADX INFO: renamed from: d */
    public final byte[] f33055d;

    /* JADX INFO: renamed from: e */
    public final int f33056e;

    /* JADX INFO: renamed from: f */
    public int f33057f;

    /* JADX INFO: renamed from: g */
    public final C6102p f33058g;

    public C10963i(C6102p c6102p, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f33055d = new byte[iMax];
        this.f33056e = iMax;
        this.f33058g = c6102p;
    }

    /* JADX INFO: renamed from: A */
    public static int m11616A(int i10, AbstractC10947a abstractC10947a, InterfaceC10948a0 interfaceC10948a0) {
        return abstractC10947a.m11522b(interfaceC10948a0) + (m11626K(i10) * 2);
    }

    /* JADX INFO: renamed from: B */
    public static int m11617B(int i10, int i11) {
        return m11618C(i11) + m11626K(i10);
    }

    /* JADX INFO: renamed from: C */
    public static int m11618C(int i10) {
        if (i10 >= 0) {
            return m11628M(i10);
        }
        return 10;
    }

    /* JADX INFO: renamed from: D */
    public static int m11619D(int i10, long j10) {
        return m11630O(j10) + m11626K(i10);
    }

    /* JADX INFO: renamed from: E */
    public static int m11620E(int i10) {
        return m11626K(i10) + 4;
    }

    /* JADX INFO: renamed from: F */
    public static int m11621F(int i10) {
        return m11626K(i10) + 8;
    }

    /* JADX INFO: renamed from: G */
    public static int m11622G(int i10, int i11) {
        return m11628M((i11 >> 31) ^ (i11 << 1)) + m11626K(i10);
    }

    /* JADX INFO: renamed from: H */
    public static int m11623H(int i10, long j10) {
        return m11630O((j10 >> 63) ^ (j10 << 1)) + m11626K(i10);
    }

    /* JADX INFO: renamed from: I */
    public static int m11624I(int i10, String str) {
        return m11625J(str) + m11626K(i10);
    }

    /* JADX INFO: renamed from: J */
    public static int m11625J(String str) {
        int length;
        try {
            length = AbstractC10988u0.m11720b(str);
        } catch (C10986t0 unused) {
            length = str.getBytes(AbstractC10993x.f33099a).length;
        }
        return m11628M(length) + length;
    }

    /* JADX INFO: renamed from: K */
    public static int m11626K(int i10) {
        return m11628M(i10 << 3);
    }

    /* JADX INFO: renamed from: L */
    public static int m11627L(int i10, int i11) {
        return m11628M(i11) + m11626K(i10);
    }

    /* JADX INFO: renamed from: M */
    public static int m11628M(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: N */
    public static int m11629N(int i10, long j10) {
        return m11630O(j10) + m11626K(i10);
    }

    /* JADX INFO: renamed from: O */
    public static int m11630O(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* JADX INFO: renamed from: s */
    public static int m11631s(int i10) {
        return m11626K(i10) + 1;
    }

    /* JADX INFO: renamed from: t */
    public static int m11632t(int i10, C10957f c10957f) {
        return m11633u(c10957f) + m11626K(i10);
    }

    /* JADX INFO: renamed from: u */
    public static int m11633u(C10957f c10957f) {
        int size = c10957f.size();
        return m11628M(size) + size;
    }

    /* JADX INFO: renamed from: v */
    public static int m11634v(int i10) {
        return m11626K(i10) + 8;
    }

    /* JADX INFO: renamed from: w */
    public static int m11635w(int i10, int i11) {
        return m11618C(i11) + m11626K(i10);
    }

    /* JADX INFO: renamed from: x */
    public static int m11636x(int i10) {
        return m11626K(i10) + 4;
    }

    /* JADX INFO: renamed from: y */
    public static int m11637y(int i10) {
        return m11626K(i10) + 8;
    }

    /* JADX INFO: renamed from: z */
    public static int m11638z(int i10) {
        return m11626K(i10) + 4;
    }

    /* JADX INFO: renamed from: P */
    public final void m11639P() {
        this.f33058g.write(this.f33055d, 0, this.f33057f);
        this.f33057f = 0;
    }

    /* JADX INFO: renamed from: Q */
    public final void m11640Q(int i10) {
        if (this.f33056e - this.f33057f < i10) {
            m11639P();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11641R(byte b) {
        if (this.f33057f == this.f33056e) {
            m11639P();
        }
        int i10 = this.f33057f;
        this.f33057f = i10 + 1;
        this.f33055d[i10] = b;
    }

    /* JADX INFO: renamed from: S */
    public final void m11642S(byte[] bArr, int i10, int i11) {
        int i12 = this.f33057f;
        int i13 = this.f33056e;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f33055d;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f33057f += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f33057f = i13;
        m11639P();
        if (i16 > i13) {
            this.f33058g.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f33057f = i16;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m11643T(int i10, boolean z6) {
        m11640Q(11);
        m11661p(i10, 0);
        byte b = z6 ? (byte) 1 : (byte) 0;
        int i11 = this.f33057f;
        this.f33057f = i11 + 1;
        this.f33055d[i11] = b;
    }

    /* JADX INFO: renamed from: U */
    public final void m11644U(int i10, C10957f c10957f) {
        m11654e0(i10, 2);
        m11645V(c10957f);
    }

    /* JADX INFO: renamed from: V */
    public final void m11645V(C10957f c10957f) {
        m11656g0(c10957f.size());
        mo11473m(c10957f.f33031Z, c10957f.m11581i(), c10957f.size());
    }

    /* JADX INFO: renamed from: W */
    public final void m11646W(int i10, int i11) {
        m11640Q(14);
        m11661p(i10, 5);
        m11659n(i11);
    }

    /* JADX INFO: renamed from: X */
    public final void m11647X(int i10) {
        m11640Q(4);
        m11659n(i10);
    }

    /* JADX INFO: renamed from: Y */
    public final void m11648Y(int i10, long j10) {
        m11640Q(18);
        m11661p(i10, 1);
        m11660o(j10);
    }

    /* JADX INFO: renamed from: Z */
    public final void m11649Z(long j10) {
        m11640Q(8);
        m11660o(j10);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11650a0(int i10, int i11) {
        m11640Q(20);
        m11661p(i10, 0);
        if (i11 >= 0) {
            m11662q(i11);
        } else {
            m11663r(i11);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11651b0(int i10) {
        if (i10 >= 0) {
            m11656g0(i10);
        } else {
            m11658i0(i10);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11652c0(int i10, String str) throws C10961h {
        m11654e0(i10, 2);
        m11653d0(str);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m11653d0(String str) throws C10961h {
        try {
            int length = str.length() * 3;
            int iM11628M = m11628M(length);
            int i10 = iM11628M + length;
            int i11 = this.f33056e;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iMo11471g = AbstractC10988u0.f33098a.mo11471g(str, bArr, 0, length);
                m11656g0(iMo11471g);
                m11642S(bArr, 0, iMo11471g);
                return;
            }
            if (i10 > i11 - this.f33057f) {
                m11639P();
            }
            int iM11628M2 = m11628M(str.length());
            int i12 = this.f33057f;
            byte[] bArr2 = this.f33055d;
            try {
                try {
                    if (iM11628M2 == iM11628M) {
                        int i13 = i12 + iM11628M2;
                        this.f33057f = i13;
                        int iMo11471g2 = AbstractC10988u0.f33098a.mo11471g(str, bArr2, i13, i11 - i13);
                        this.f33057f = i12;
                        m11662q((iMo11471g2 - i12) - iM11628M2);
                        this.f33057f = iMo11471g2;
                    } else {
                        int iM11720b = AbstractC10988u0.m11720b(str);
                        m11662q(iM11720b);
                        this.f33057f = AbstractC10988u0.f33098a.mo11471g(str, bArr2, this.f33057f, iM11720b);
                    }
                } catch (C10986t0 e10) {
                    this.f33057f = i12;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new C10961h(e11);
            }
        } catch (C10986t0 e12) {
            f33052h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(AbstractC10993x.f33099a);
            try {
                m11656g0(bytes.length);
                mo11473m(bytes, 0, bytes.length);
            } catch (C10961h e13) {
                throw e13;
            } catch (IndexOutOfBoundsException e14) {
                throw new C10961h(e14);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11654e0(int i10, int i11) {
        m11656g0((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11655f0(int i10, int i11) {
        m11640Q(20);
        m11661p(i10, 0);
        m11662q(i11);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11656g0(int i10) {
        m11640Q(5);
        m11662q(i10);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11657h0(int i10, long j10) {
        m11640Q(20);
        m11661p(i10, 0);
        m11663r(j10);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m11658i0(long j10) {
        m11640Q(10);
        m11663r(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10937P
    /* JADX INFO: renamed from: m */
    public final void mo11473m(byte[] bArr, int i10, int i11) {
        m11642S(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: n */
    public final void m11659n(int i10) {
        int i11 = this.f33057f;
        int i12 = i11 + 1;
        this.f33057f = i12;
        byte[] bArr = this.f33055d;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f33057f = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f33057f = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f33057f = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    /* JADX INFO: renamed from: o */
    public final void m11660o(long j10) {
        int i10 = this.f33057f;
        int i11 = i10 + 1;
        this.f33057f = i11;
        byte[] bArr = this.f33055d;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f33057f = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f33057f = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f33057f = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f33057f = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f33057f = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f33057f = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f33057f = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: p */
    public final void m11661p(int i10, int i11) {
        m11662q((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: q */
    public final void m11662q(int i10) {
        boolean z6 = f33053i;
        byte[] bArr = this.f33055d;
        if (z6) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f33057f;
                this.f33057f = i11 + 1;
                AbstractC10982r0.m11704m(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f33057f;
            this.f33057f = i12 + 1;
            AbstractC10982r0.m11704m(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f33057f;
            this.f33057f = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f33057f;
        this.f33057f = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    /* JADX INFO: renamed from: r */
    public final void m11663r(long j10) {
        boolean z6 = f33053i;
        byte[] bArr = this.f33055d;
        if (z6) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f33057f;
                this.f33057f = i10 + 1;
                AbstractC10982r0.m11704m(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.f33057f;
            this.f33057f = i11 + 1;
            AbstractC10982r0.m11704m(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i12 = this.f33057f;
            this.f33057f = i12 + 1;
            bArr[i12] = (byte) ((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        int i13 = this.f33057f;
        this.f33057f = i13 + 1;
        bArr[i13] = (byte) j10;
    }
}
