package androidx.glance.appwidget.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import p232J3.C4206F;
import p351O2.C6102p;
import p523V9.AbstractC8186s0;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C11048j extends AbstractC8186s0 {

    /* JADX INFO: renamed from: f */
    public static final Logger f33321f = Logger.getLogger(C11048j.class.getName());

    /* JADX INFO: renamed from: g */
    public static final boolean f33322g = AbstractC11041f0.f33297e;

    /* JADX INFO: renamed from: a */
    public C11012H f33323a;

    /* JADX INFO: renamed from: b */
    public final byte[] f33324b;

    /* JADX INFO: renamed from: c */
    public final int f33325c;

    /* JADX INFO: renamed from: d */
    public int f33326d;

    /* JADX INFO: renamed from: e */
    public final C6102p f33327e;

    public C11048j(C6102p c6102p, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f33324b = new byte[iMax];
        this.f33325c = iMax;
        this.f33327e = c6102p;
    }

    /* JADX INFO: renamed from: A */
    public static int m12045A(int i10) {
        return m12047C(i10 << 3);
    }

    /* JADX INFO: renamed from: B */
    public static int m12046B(int i10, int i11) {
        return m12047C(i11) + m12045A(i10);
    }

    /* JADX INFO: renamed from: C */
    public static int m12047C(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: D */
    public static int m12048D(int i10, long j10) {
        return m12049E(j10) + m12045A(i10);
    }

    /* JADX INFO: renamed from: E */
    public static int m12049E(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: j */
    public static int m12050j(int i10) {
        return m12045A(i10) + 1;
    }

    /* JADX INFO: renamed from: k */
    public static int m12051k(int i10, C11042g c11042g) {
        return m12052l(c11042g) + m12045A(i10);
    }

    /* JADX INFO: renamed from: l */
    public static int m12052l(C11042g c11042g) {
        int size = c11042g.size();
        return m12047C(size) + size;
    }

    /* JADX INFO: renamed from: m */
    public static int m12053m(int i10) {
        return m12045A(i10) + 8;
    }

    /* JADX INFO: renamed from: n */
    public static int m12054n(int i10, int i11) {
        return m12049E(i11) + m12045A(i10);
    }

    /* JADX INFO: renamed from: o */
    public static int m12055o(int i10) {
        return m12045A(i10) + 4;
    }

    /* JADX INFO: renamed from: p */
    public static int m12056p(int i10) {
        return m12045A(i10) + 8;
    }

    /* JADX INFO: renamed from: q */
    public static int m12057q(int i10) {
        return m12045A(i10) + 4;
    }

    /* JADX INFO: renamed from: r */
    public static int m12058r(int i10, AbstractC11030a abstractC11030a, InterfaceC11026W interfaceC11026W) {
        return abstractC11030a.mo11976a(interfaceC11026W) + (m12045A(i10) * 2);
    }

    /* JADX INFO: renamed from: s */
    public static int m12059s(int i10, int i11) {
        return m12049E(i11) + m12045A(i10);
    }

    /* JADX INFO: renamed from: t */
    public static int m12060t(int i10, long j10) {
        return m12049E(j10) + m12045A(i10);
    }

    /* JADX INFO: renamed from: u */
    public static int m12061u(int i10) {
        return m12045A(i10) + 4;
    }

    /* JADX INFO: renamed from: v */
    public static int m12062v(int i10) {
        return m12045A(i10) + 8;
    }

    /* JADX INFO: renamed from: w */
    public static int m12063w(int i10, int i11) {
        return m12047C((i11 >> 31) ^ (i11 << 1)) + m12045A(i10);
    }

    /* JADX INFO: renamed from: x */
    public static int m12064x(int i10, long j10) {
        return m12049E((j10 >> 63) ^ (j10 << 1)) + m12045A(i10);
    }

    /* JADX INFO: renamed from: y */
    public static int m12065y(int i10, String str) {
        return m12066z(str) + m12045A(i10);
    }

    /* JADX INFO: renamed from: z */
    public static int m12066z(String str) {
        int length;
        try {
            length = AbstractC11047i0.m12044a(str);
        } catch (C11045h0 unused) {
            length = str.getBytes(AbstractC11063y.f33343a).length;
        }
        return m12047C(length) + length;
    }

    /* JADX INFO: renamed from: F */
    public final void m12067F() {
        this.f33327e.write(this.f33324b, 0, this.f33326d);
        this.f33326d = 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m12068G(int i10) {
        if (this.f33325c - this.f33326d < i10) {
            m12067F();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m12069H(byte[] bArr, int i10, int i11) {
        int i12 = this.f33326d;
        int i13 = this.f33325c;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f33324b;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f33326d += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f33326d = i13;
        m12067F();
        if (i16 > i13) {
            this.f33327e.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f33326d = i16;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m12070I(int i10, boolean z6) {
        m12068G(11);
        m12086g(i10, 0);
        byte b = z6 ? (byte) 1 : (byte) 0;
        int i11 = this.f33326d;
        this.f33326d = i11 + 1;
        this.f33324b[i11] = b;
    }

    /* JADX INFO: renamed from: J */
    public final void m12071J(int i10, C11042g c11042g) {
        m12079R(i10, 2);
        m12081T(c11042g.size());
        mo8769d(c11042g.f33303Z, c11042g.mo12002m(), c11042g.size());
    }

    /* JADX INFO: renamed from: K */
    public final void m12072K(int i10, int i11) {
        m12068G(14);
        m12086g(i10, 5);
        m12084e(i11);
    }

    /* JADX INFO: renamed from: L */
    public final void m12073L(int i10) {
        m12068G(4);
        m12084e(i10);
    }

    /* JADX INFO: renamed from: M */
    public final void m12074M(int i10, long j10) {
        m12068G(18);
        m12086g(i10, 1);
        m12085f(j10);
    }

    /* JADX INFO: renamed from: N */
    public final void m12075N(long j10) {
        m12068G(8);
        m12085f(j10);
    }

    /* JADX INFO: renamed from: O */
    public final void m12076O(int i10, int i11) {
        m12068G(20);
        m12086g(i10, 0);
        if (i11 >= 0) {
            m12087h(i11);
        } else {
            m12088i(i11);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m12077P(int i10) {
        if (i10 >= 0) {
            m12081T(i10);
        } else {
            m12083V(i10);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m12078Q(int i10, String str) {
        m12079R(i10, 2);
        try {
            int length = str.length() * 3;
            int iM12047C = m12047C(length);
            int i11 = iM12047C + length;
            int i12 = this.f33325c;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int iM12025c = AbstractC11047i0.f33320a.m12025c(str, bArr, 0, length);
                m12081T(iM12025c);
                m12069H(bArr, 0, iM12025c);
                return;
            }
            if (i11 > i12 - this.f33326d) {
                m12067F();
            }
            int iM12047C2 = m12047C(str.length());
            int i13 = this.f33326d;
            byte[] bArr2 = this.f33324b;
            try {
                if (iM12047C2 == iM12047C) {
                    int i14 = i13 + iM12047C2;
                    this.f33326d = i14;
                    int iM12025c2 = AbstractC11047i0.f33320a.m12025c(str, bArr2, i14, i12 - i14);
                    this.f33326d = i13;
                    m12087h((iM12025c2 - i13) - iM12047C2);
                    this.f33326d = iM12025c2;
                } else {
                    int iM12044a = AbstractC11047i0.m12044a(str);
                    m12087h(iM12044a);
                    this.f33326d = AbstractC11047i0.f33320a.m12025c(str, bArr2, this.f33326d, iM12044a);
                }
            } catch (C11045h0 e10) {
                this.f33326d = i13;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new C4206F(e11);
            }
        } catch (C11045h0 e12) {
            f33321f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(AbstractC11063y.f33343a);
            try {
                m12081T(bytes.length);
                mo8769d(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e13) {
                throw new C4206F(e13);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m12079R(int i10, int i11) {
        m12081T((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: S */
    public final void m12080S(int i10, int i11) {
        m12068G(20);
        m12086g(i10, 0);
        m12087h(i11);
    }

    /* JADX INFO: renamed from: T */
    public final void m12081T(int i10) {
        m12068G(5);
        m12087h(i10);
    }

    /* JADX INFO: renamed from: U */
    public final void m12082U(int i10, long j10) {
        m12068G(20);
        m12086g(i10, 0);
        m12088i(j10);
    }

    /* JADX INFO: renamed from: V */
    public final void m12083V(long j10) {
        m12068G(10);
        m12088i(j10);
    }

    @Override // p523V9.AbstractC8186s0
    /* JADX INFO: renamed from: d */
    public final void mo8769d(byte[] bArr, int i10, int i11) {
        m12069H(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public final void m12084e(int i10) {
        int i11 = this.f33326d;
        int i12 = i11 + 1;
        this.f33326d = i12;
        byte[] bArr = this.f33324b;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f33326d = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f33326d = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f33326d = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    /* JADX INFO: renamed from: f */
    public final void m12085f(long j10) {
        int i10 = this.f33326d;
        int i11 = i10 + 1;
        this.f33326d = i11;
        byte[] bArr = this.f33324b;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f33326d = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f33326d = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f33326d = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f33326d = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f33326d = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f33326d = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f33326d = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: g */
    public final void m12086g(int i10, int i11) {
        m12087h((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: h */
    public final void m12087h(int i10) {
        boolean z6 = f33322g;
        byte[] bArr = this.f33324b;
        if (z6) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f33326d;
                this.f33326d = i11 + 1;
                AbstractC11041f0.m12013j(bArr, i11, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f33326d;
            this.f33326d = i12 + 1;
            AbstractC11041f0.m12013j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f33326d;
            this.f33326d = i13 + 1;
            bArr[i13] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f33326d;
        this.f33326d = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    /* JADX INFO: renamed from: i */
    public final void m12088i(long j10) {
        boolean z6 = f33322g;
        byte[] bArr = this.f33324b;
        if (z6) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f33326d;
                this.f33326d = i10 + 1;
                AbstractC11041f0.m12013j(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            int i11 = this.f33326d;
            this.f33326d = i11 + 1;
            AbstractC11041f0.m12013j(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i12 = this.f33326d;
            this.f33326d = i12 + 1;
            bArr[i12] = (byte) ((((int) j10) | 128) & 255);
            j10 >>>= 7;
        }
        int i13 = this.f33326d;
        this.f33326d = i13 + 1;
        bArr[i13] = (byte) j10;
    }
}
