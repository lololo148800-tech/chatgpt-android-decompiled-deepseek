package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11954f2 extends AbstractC11969j1 {
    private static final C11954f2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        C11954f2 c11954f2 = new C11954f2();
        zzb = c11954f2;
        AbstractC11969j1.m13476k(C11954f2.class, c11954f2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13416n(C11954f2 c11954f2, int i10) {
        c11954f2.zzd |= 4;
        c11954f2.zzg = i10;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13417o(C11954f2 c11954f2, long j10) {
        c11954f2.zzd |= 8;
        c11954f2.zzh = j10;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13418p(C11954f2 c11954f2, String str) {
        str.getClass();
        c11954f2.zzd |= 2;
        c11954f2.zzf = str;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m13419q(C11954f2 c11954f2, String str) {
        str.getClass();
        c11954f2.zzd |= 1;
        c11954f2.zze = str;
    }

    /* JADX INFO: renamed from: r */
    public static C11950e2 m13420r() {
        return (C11950e2) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C11954f2();
        }
        if (i11 == 4) {
            return new C11950e2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
