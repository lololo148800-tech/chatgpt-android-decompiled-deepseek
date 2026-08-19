package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.Z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11930Z1 extends AbstractC11969j1 {
    private static final C11930Z1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C11930Z1 c11930z1 = new C11930Z1();
        zzb = c11930z1;
        AbstractC11969j1.m13476k(C11930Z1.class, c11930z1);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13376n(C11930Z1 c11930z1, String str) {
        c11930z1.zzd |= 8;
        c11930z1.zzh = str;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13377o(C11930Z1 c11930z1, String str) {
        str.getClass();
        c11930z1.zzd |= 2;
        c11930z1.zzf = str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13378p(C11930Z1 c11930z1, int i10) {
        c11930z1.zzd |= 1;
        c11930z1.zze = i10;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m13379q(C11930Z1 c11930z1, int i10) {
        c11930z1.zzg = i10 - 1;
        c11930z1.zzd |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static C11927Y1 m13380r() {
        return (C11927Y1) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C11905R0.f36174d, "zzh"});
        }
        if (i11 == 3) {
            return new C11930Z1();
        }
        if (i11 == 4) {
            return new C11927Y1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
