package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11986n2 extends AbstractC11969j1 {
    private static final C11986n2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C11954f2 zzg;
    private C11958g2 zzh;

    static {
        C11986n2 c11986n2 = new C11986n2();
        zzb = c11986n2;
        AbstractC11969j1.m13476k(C11986n2.class, c11986n2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13499n(C11986n2 c11986n2, C11918V1 c11918v1) {
        c11986n2.zzf = c11918v1;
        c11986n2.zze = 2;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13500o(C11986n2 c11986n2, C11924X1 c11924x1) {
        c11986n2.zzf = c11924x1;
        c11986n2.zze = 3;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13501p(C11986n2 c11986n2, C11938b2 c11938b2) {
        c11938b2.getClass();
        c11986n2.zzf = c11938b2;
        c11986n2.zze = 7;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m13502q(C11986n2 c11986n2, C11954f2 c11954f2) {
        c11954f2.getClass();
        c11986n2.zzg = c11954f2;
        c11986n2.zzd |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m13503r(C11986n2 c11986n2, C11998q2 c11998q2) {
        c11986n2.zzf = c11998q2;
        c11986n2.zze = 8;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m13504s(C11986n2 c11986n2, C12002r2 c12002r2) {
        c11986n2.zzf = c12002r2;
        c11986n2.zze = 4;
    }

    /* JADX INFO: renamed from: t */
    public static C11982m2 m13505t() {
        return (C11982m2) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C11918V1.class, C11924X1.class, C12002r2.class, C11946d2.class, "zzh", C11938b2.class, C11998q2.class});
        }
        if (i11 == 3) {
            return new C11986n2();
        }
        if (i11 == 4) {
            return new C11982m2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
