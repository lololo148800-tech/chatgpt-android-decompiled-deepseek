package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11938b2 extends AbstractC11969j1 {
    private static final C11938b2 zzb;

    static {
        C11938b2 c11938b2 = new C11938b2();
        zzb = c11938b2;
        AbstractC11969j1.m13476k(C11938b2.class, c11938b2);
    }

    /* JADX INFO: renamed from: n */
    public static C11938b2 m13412n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new C11938b2();
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
