package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11976l0 extends AbstractC11957g1 {

    /* JADX INFO: renamed from: Z */
    public static final Unsafe f36289Z;

    /* JADX INFO: renamed from: o0 */
    public static final long f36290o0;

    /* JADX INFO: renamed from: p0 */
    public static final long f36291p0;

    /* JADX INFO: renamed from: q0 */
    public static final long f36292q0;

    /* JADX INFO: renamed from: r0 */
    public static final long f36293r0;

    /* JADX INFO: renamed from: s0 */
    public static final long f36294s0;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C11972k0());
        }
        try {
            f36291p0 = unsafe.objectFieldOffset(AbstractC11984n0.class.getDeclaredField("o0"));
            f36290o0 = unsafe.objectFieldOffset(AbstractC11984n0.class.getDeclaredField("Z"));
            f36292q0 = unsafe.objectFieldOffset(AbstractC11984n0.class.getDeclaredField("Y"));
            f36293r0 = unsafe.objectFieldOffset(C11980m0.class.getDeclaredField("a"));
            f36294s0 = unsafe.objectFieldOffset(C11980m0.class.getDeclaredField("b"));
            f36289Z = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: B */
    public final void mo13421B(C11980m0 c11980m0, Thread thread) {
        f36289Z.putObject(c11980m0, f36293r0, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: H */
    public final boolean mo13422H(AbstractC11984n0 abstractC11984n0, C11952f0 c11952f0, C11952f0 c11952f1) {
        return AbstractC11996q0.m13519a(f36289Z, abstractC11984n0, f36290o0, c11952f0, c11952f1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: L */
    public final boolean mo13423L(AbstractC11984n0 abstractC11984n0, Object obj, Object obj2) {
        return AbstractC11996q0.m13519a(f36289Z, abstractC11984n0, f36292q0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: N */
    public final boolean mo13424N(AbstractC11984n0 abstractC11984n0, C11980m0 c11980m0, C11980m0 c11980m1) {
        return AbstractC11996q0.m13519a(f36289Z, abstractC11984n0, f36291p0, c11980m0, c11980m1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: e */
    public final C11952f0 mo13425e(AbstractC11984n0 abstractC11984n0) {
        C11952f0 c11952f0;
        C11952f0 c11952f1 = C11952f0.f36260d;
        do {
            c11952f0 = abstractC11984n0.f36305Z;
            if (c11952f1 == c11952f0) {
                break;
            }
        } while (!mo13422H(abstractC11984n0, c11952f0, c11952f1));
        return c11952f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: r */
    public final C11980m0 mo13426r(AbstractC11984n0 abstractC11984n0) {
        C11980m0 c11980m0;
        C11980m0 c11980m1 = C11980m0.f36296c;
        do {
            c11980m0 = abstractC11984n0.f36306o0;
            if (c11980m1 == c11980m0) {
                break;
            }
        } while (!mo13424N(abstractC11984n0, c11980m0, c11980m1));
        return c11980m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: z */
    public final void mo13427z(C11980m0 c11980m0, C11980m0 c11980m1) {
        f36289Z.putObject(c11980m0, f36294s0, c11980m1);
    }
}
