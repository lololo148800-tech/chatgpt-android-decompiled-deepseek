package com.google.android.gms.internal.play_billing;

import p817j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.S */
/* JADX INFO: loaded from: classes.dex */
public final class C11907S extends AbstractC11857B {

    /* JADX INFO: renamed from: q0 */
    public static final C11907S f36188q0 = new C11907S(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f36189o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f36190p0;

    public C11907S(int i10, Object[] objArr) {
        this.f36189o0 = objArr;
        this.f36190p0 = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11857B, com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: f */
    public final int mo13223f(Object[] objArr) {
        Object[] objArr2 = this.f36189o0;
        int i10 = this.f36190p0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC11957g1.m13447i(i10, this.f36190p0);
        Object obj = this.f36189o0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: i */
    public final int mo13212i() {
        return this.f36190p0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: j */
    public final int mo13213j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: p */
    public final boolean mo13214p() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: q */
    public final Object[] mo13215q() {
        return this.f36189o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36190p0;
    }
}
