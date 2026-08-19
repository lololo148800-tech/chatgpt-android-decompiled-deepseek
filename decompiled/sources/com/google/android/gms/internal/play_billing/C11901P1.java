package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11901P1 extends AbstractC11904Q1 {
    public C11901P1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11904Q1
    /* JADX INFO: renamed from: a */
    public final double mo13314a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f36171a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11904Q1
    /* JADX INFO: renamed from: b */
    public final float mo13315b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f36171a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11904Q1
    /* JADX INFO: renamed from: c */
    public final void mo13316c(Object obj, long j10, boolean z6) {
        if (AbstractC11906R1.f36187g) {
            AbstractC11906R1.m13325b(obj, j10, z6 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC11906R1.m13326c(obj, j10, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11904Q1
    /* JADX INFO: renamed from: d */
    public final void mo13317d(Object obj, long j10, byte b) {
        if (AbstractC11906R1.f36187g) {
            AbstractC11906R1.m13325b(obj, j10, b);
        } else {
            AbstractC11906R1.m13326c(obj, j10, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11904Q1
    /* JADX INFO: renamed from: e */
    public final void mo13318e(Object obj, long j10, double d10) {
        this.f36171a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11904Q1
    /* JADX INFO: renamed from: f */
    public final void mo13319f(Object obj, long j10, float f10) {
        this.f36171a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11904Q1
    /* JADX INFO: renamed from: g */
    public final boolean mo13320g(long j10, Object obj) {
        return AbstractC11906R1.f36187g ? AbstractC11906R1.m13340q(j10, obj) : AbstractC11906R1.m13341r(j10, obj);
    }
}
