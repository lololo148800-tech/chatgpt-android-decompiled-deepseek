package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z */
/* JADX INFO: loaded from: classes.dex */
public final class C12031z extends AbstractC11857B {

    /* JADX INFO: renamed from: o0 */
    public final transient AbstractC11857B f36366o0;

    public C12031z(AbstractC11857B abstractC11857B) {
        this.f36366o0 = abstractC11857B;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11857B, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f36366o0.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC11857B abstractC11857B = this.f36366o0;
        AbstractC11957g1.m13447i(i10, abstractC11857B.size());
        return abstractC11857B.get((abstractC11857B.size() - 1) - i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11857B, java.util.List
    public final int indexOf(Object obj) {
        AbstractC11857B abstractC11857B = this.f36366o0;
        int iLastIndexOf = abstractC11857B.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC11857B.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11857B, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC11857B abstractC11857B = this.f36366o0;
        int iIndexOf = abstractC11857B.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC11857B.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: p */
    public final boolean mo13214p() {
        return this.f36366o0.mo13214p();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11857B
    /* JADX INFO: renamed from: r */
    public final AbstractC11857B mo13225r() {
        return this.f36366o0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11857B, java.util.List
    /* JADX INFO: renamed from: s */
    public final AbstractC11857B subList(int i10, int i11) {
        AbstractC11857B abstractC11857B = this.f36366o0;
        AbstractC11957g1.m13430F(i10, i11, abstractC11857B.size());
        return abstractC11857B.subList(abstractC11857B.size() - i11, abstractC11857B.size() - i10).mo13225r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36366o0.size();
    }
}
