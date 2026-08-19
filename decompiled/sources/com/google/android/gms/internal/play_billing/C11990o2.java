package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11990o2 extends AbstractC11969j1 {
    private static final C11990o2 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC11985n1 zze = C11874G1.f36130q0;
    private String zzg = "";

    static {
        C11990o2 c11990o2 = new C11990o2();
        zzb = c11990o2;
        AbstractC11969j1.m13476k(C11990o2.class, c11990o2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C11990o2();
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
