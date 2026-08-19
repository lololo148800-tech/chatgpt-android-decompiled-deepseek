package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.X1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11924X1 extends AbstractC11969j1 {
    private static final C11924X1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C11924X1 c11924x1 = new C11924X1();
        zzb = c11924x1;
        AbstractC11969j1.m13476k(C11924X1.class, c11924x1);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13362n(C11924X1 c11924x1, C11970j2 c11970j2) {
        c11924x1.zzf = c11970j2;
        c11924x1.zze = 2;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13363o(C11924X1 c11924x1, C12010t2 c12010t2) {
        c11924x1.zzf = c12010t2;
        c11924x1.zze = 3;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13364p(C11924X1 c11924x1, int i10) {
        c11924x1.zzg = i10 - 1;
        c11924x1.zzd |= 1;
    }

    /* JADX INFO: renamed from: q */
    public static C11921W1 m13365q() {
        return (C11921W1) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C11905R0.f36173c, C11970j2.class, C12010t2.class, C11978l2.class});
        }
        if (i11 == 3) {
            return new C11924X1();
        }
        if (i11 == 4) {
            return new C11921W1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
