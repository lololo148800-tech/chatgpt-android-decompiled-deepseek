package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C12002r2 extends AbstractC11969j1 {
    private static final C12002r2 zzb;
    private int zzd;
    private int zze;

    static {
        C12002r2 c12002r2 = new C12002r2();
        zzb = c12002r2;
        AbstractC11969j1.m13476k(C12002r2.class, c12002r2);
    }

    /* JADX INFO: renamed from: n */
    public static C12002r2 m13522n() {
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
            return new C11877H1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C11905R0.f36179i});
        }
        if (i11 == 3) {
            return new C12002r2();
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
