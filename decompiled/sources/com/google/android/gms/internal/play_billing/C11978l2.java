package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11978l2 extends AbstractC11969j1 {
    private static final C11978l2 zzb;
    private InterfaceC11985n1 zzd = C11874G1.f36130q0;

    static {
        C11978l2 c11978l2 = new C11978l2();
        zzb = c11978l2;
        AbstractC11969j1.m13476k(C11978l2.class, c11978l2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C11974k2.class});
        }
        if (i11 == 3) {
            return new C11978l2();
        }
        if (i11 == 4) {
            return new C11934a2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
