package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11891M0 extends AbstractC11969j1 {
    private static final C11891M0 zzb;
    private int zzd;
    private C11903Q0 zze;
    private C11903Q0 zzf;
    private int zzg;

    static {
        C11891M0 c11891m0 = new C11891M0();
        zzb = c11891m0;
        AbstractC11969j1.m13476k(C11891M0.class, c11891m0);
    }

    /* JADX INFO: renamed from: n */
    public static C11888L0 m13304n() {
        return (C11888L0) zzb.m13480f();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13305o(C11891M0 c11891m0, C11903Q0 c11903q0) {
        c11891m0.zze = c11903q0;
        c11891m0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C11905R0.f36172b});
        }
        if (i11 == 3) {
            return new C11891M0();
        }
        if (i11 == 4) {
            return new C11888L0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
