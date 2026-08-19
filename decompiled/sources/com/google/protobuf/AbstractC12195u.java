package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import p232J3.C4206F;

/* JADX INFO: renamed from: com.google.protobuf.u */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12195u extends AbstractC12153g {

    /* JADX INFO: renamed from: d */
    public static final Logger f37108d = Logger.getLogger(AbstractC12195u.class.getName());

    /* JADX INFO: renamed from: e */
    public static final boolean f37109e = AbstractC12209y1.f37126e;

    /* JADX INFO: renamed from: c */
    public C12211z0 f37110c;

    /* JADX INFO: renamed from: b0 */
    public static int m14128b0(int i10) {
        return m14146t0(i10) + 1;
    }

    /* JADX INFO: renamed from: c0 */
    public static int m14129c0(int i10, AbstractC12171m abstractC12171m) {
        return m14130d0(abstractC12171m) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: d0 */
    public static int m14130d0(AbstractC12171m abstractC12171m) {
        int size = abstractC12171m.size();
        return m14148v0(size) + size;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m14131e0(int i10) {
        return m14146t0(i10) + 8;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m14132f0(int i10, int i11) {
        return m14138l0(i11) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: g0 */
    public static int m14133g0(int i10) {
        return m14146t0(i10) + 4;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m14134h0(int i10) {
        return m14146t0(i10) + 8;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m14135i0(int i10) {
        return m14146t0(i10) + 4;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m14136j0(int i10, InterfaceC12091G0 interfaceC12091G0, InterfaceC12134Z0 interfaceC12134Z0) {
        return ((AbstractC12138b) interfaceC12091G0).getSerializedSize(interfaceC12134Z0) + (m14146t0(i10) * 2);
    }

    /* JADX INFO: renamed from: k0 */
    public static int m14137k0(int i10, int i11) {
        return m14138l0(i11) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: l0 */
    public static int m14138l0(int i10) {
        if (i10 >= 0) {
            return m14148v0(i10);
        }
        return 10;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m14139m0(int i10, long j10) {
        return m14150x0(j10) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: n0 */
    public static int m14140n0(int i10) {
        return m14146t0(i10) + 4;
    }

    /* JADX INFO: renamed from: o0 */
    public static int m14141o0(int i10) {
        return m14146t0(i10) + 8;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m14142p0(int i10, int i11) {
        return m14148v0((i11 >> 31) ^ (i11 << 1)) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: q0 */
    public static int m14143q0(int i10, long j10) {
        return m14150x0((j10 >> 63) ^ (j10 << 1)) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: r0 */
    public static int m14144r0(int i10, String str) {
        return m14145s0(str) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: s0 */
    public static int m14145s0(String str) {
        int length;
        try {
            length = AbstractC12077B1.m13721b(str);
        } catch (C12074A1 unused) {
            length = str.getBytes(AbstractC12175n0.f37050a).length;
        }
        return m14148v0(length) + length;
    }

    /* JADX INFO: renamed from: t0 */
    public static int m14146t0(int i10) {
        return m14148v0(i10 << 3);
    }

    /* JADX INFO: renamed from: u0 */
    public static int m14147u0(int i10, int i11) {
        return m14148v0(i11) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: v0 */
    public static int m14148v0(int i10) {
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

    /* JADX INFO: renamed from: w0 */
    public static int m14149w0(int i10, long j10) {
        return m14150x0(j10) + m14146t0(i10);
    }

    /* JADX INFO: renamed from: x0 */
    public static int m14150x0(long j10) {
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

    /* JADX INFO: renamed from: A0 */
    public abstract void mo14092A0(int i10, boolean z6);

    /* JADX INFO: renamed from: B0 */
    public abstract void mo14093B0(int i10, byte[] bArr);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo14094C0(int i10, AbstractC12171m abstractC12171m);

    /* JADX INFO: renamed from: D0 */
    public abstract void mo14095D0(AbstractC12171m abstractC12171m);

    /* JADX INFO: renamed from: E0 */
    public abstract void mo14096E0(int i10, int i11);

    /* JADX INFO: renamed from: F0 */
    public abstract void mo14097F0(int i10);

    /* JADX INFO: renamed from: G0 */
    public abstract void mo14098G0(int i10, long j10);

    /* JADX INFO: renamed from: H0 */
    public abstract void mo14099H0(long j10);

    /* JADX INFO: renamed from: I0 */
    public abstract void mo14100I0(int i10, int i11);

    /* JADX INFO: renamed from: J0 */
    public abstract void mo14101J0(int i10);

    /* JADX INFO: renamed from: K0 */
    public abstract void mo14102K0(int i10, InterfaceC12091G0 interfaceC12091G0, InterfaceC12134Z0 interfaceC12134Z0);

    /* JADX INFO: renamed from: L0 */
    public abstract void mo14103L0(InterfaceC12091G0 interfaceC12091G0);

    /* JADX INFO: renamed from: M0 */
    public abstract void mo14104M0(int i10, InterfaceC12091G0 interfaceC12091G0);

    /* JADX INFO: renamed from: N0 */
    public abstract void mo14105N0(int i10, AbstractC12171m abstractC12171m);

    /* JADX INFO: renamed from: O0 */
    public abstract void mo14106O0(int i10, String str);

    /* JADX INFO: renamed from: P0 */
    public abstract void mo14107P0(String str);

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo14108Q0(int i10, int i11);

    /* JADX INFO: renamed from: R0 */
    public abstract void mo14109R0(int i10, int i11);

    /* JADX INFO: renamed from: S0 */
    public abstract void mo14110S0(int i10);

    /* JADX INFO: renamed from: T0 */
    public abstract void mo14111T0(int i10, long j10);

    /* JADX INFO: renamed from: U0 */
    public abstract void mo14112U0(long j10);

    /* JADX INFO: renamed from: y0 */
    public final void m14151y0(String str, C12074A1 c12074a1) throws C4206F {
        f37108d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c12074a1);
        byte[] bytes = str.getBytes(AbstractC12175n0.f37050a);
        try {
            mo14110S0(bytes.length);
            mo13995a0(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(e10);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public abstract void mo14115z0(byte b);
}
