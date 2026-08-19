package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11958g2 extends AbstractC11969j1 {
    private static final C11958g2 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C11958g2 c11958g2 = new C11958g2();
        zzb = c11958g2;
        AbstractC11969j1.m13476k(C11958g2.class, c11958g2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C11958g2();
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
