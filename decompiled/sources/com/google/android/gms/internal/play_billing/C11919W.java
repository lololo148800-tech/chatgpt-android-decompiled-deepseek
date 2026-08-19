package com.google.android.gms.internal.play_billing;

import p817j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.W */
/* JADX INFO: loaded from: classes.dex */
public final class C11919W extends AbstractC11857B {

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f36204o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f36205p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f36206q0;

    public C11919W(Object[] objArr, int i10, int i11) {
        this.f36204o0 = objArr;
        this.f36205p0 = i10;
        this.f36206q0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC11957g1.m13447i(i10, this.f36206q0);
        Object obj = this.f36204o0[i10 + i10 + this.f36205p0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: p */
    public final boolean mo13214p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36206q0;
    }
}
