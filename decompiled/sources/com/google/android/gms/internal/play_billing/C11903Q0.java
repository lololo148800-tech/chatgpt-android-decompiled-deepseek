package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11903Q0 extends AbstractC11969j1 {
    private static final C11903Q0 zzb;
    private int zzd;
    private String zze = "";

    static {
        C11903Q0 c11903q0 = new C11903Q0();
        zzb = c11903q0;
        AbstractC11969j1.m13476k(C11903Q0.class, c11903q0);
    }

    /* JADX INFO: renamed from: n */
    public static C11900P0 m13321n() {
        return (C11900P0) zzb.m13480f();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13322o(C11903Q0 c11903q0, String str) {
        c11903q0.zzd |= 1;
        c11903q0.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C11903Q0();
        }
        if (i11 == 4) {
            return new C11900P0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
