package com.google.android.gms.internal.play_billing;

import p174Gk.uSfJ.HpucjswO;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11970j2 extends AbstractC11969j1 {
    private static final C11970j2 zzb;
    private int zzd;
    private int zze;

    static {
        C11970j2 c11970j2 = new C11970j2();
        zzb = c11970j2;
        AbstractC11969j1.m13476k(C11970j2.class, c11970j2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13484n(C11970j2 c11970j2, int i10) {
        c11970j2.zze = i10 - 1;
        c11970j2.zzd |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static C11962h2 m13485o() {
        return (C11962h2) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{HpucjswO.VKjvKkpkyNz, "zze", C11905R0.f36177g});
        }
        if (i11 == 3) {
            return new C11970j2();
        }
        if (i11 == 4) {
            return new C11962h2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
