package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11946d2 extends AbstractC11969j1 {
    private static final C11946d2 zzb;
    private int zzd;
    private int zzf;
    private C11930Z1 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private InterfaceC11981m1 zzg = C11973k1.f36285q0;
    private InterfaceC11985n1 zzh = C11874G1.f36130q0;

    static {
        C11946d2 c11946d2 = new C11946d2();
        zzb = c11946d2;
        AbstractC11969j1.m13476k(C11946d2.class, c11946d2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", C11905R0.f36176f, "zzg", C11905R0.f36175e, "zzh", C11990o2.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C11946d2();
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
