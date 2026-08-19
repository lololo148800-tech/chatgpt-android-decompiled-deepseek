package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11998q2 extends AbstractC11969j1 {
    private static final C11998q2 zzb;
    private int zzd;
    private C11930Z1 zze;

    static {
        C11998q2 c11998q2 = new C11998q2();
        zzb = c11998q2;
        AbstractC11969j1.m13476k(C11998q2.class, c11998q2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13520n(C11998q2 c11998q2, C11930Z1 c11930z1) {
        c11998q2.zze = c11930z1;
        c11998q2.zzd |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static C11994p2 m13521o() {
        return (C11994p2) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C11998q2();
        }
        if (i11 == 4) {
            return new C11994p2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
