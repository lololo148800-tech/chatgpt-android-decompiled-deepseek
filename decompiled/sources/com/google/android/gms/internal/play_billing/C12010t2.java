package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C12010t2 extends AbstractC11969j1 {
    private static final C12010t2 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        C12010t2 c12010t2 = new C12010t2();
        zzb = c12010t2;
        AbstractC11969j1.m13476k(C12010t2.class, c12010t2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13525n(C12010t2 c12010t2) {
        c12010t2.zzd |= 2;
        c12010t2.zzf = true;
    }

    /* JADX INFO: renamed from: o */
    public static C12006s2 m13526o() {
        return (C12006s2) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C12010t2();
        }
        if (i11 == 4) {
            return new C12006s2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
