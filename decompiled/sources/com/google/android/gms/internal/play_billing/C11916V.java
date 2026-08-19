package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.V */
/* JADX INFO: loaded from: classes.dex */
public final class C11916V extends AbstractC11872G {

    /* JADX INFO: renamed from: o0 */
    public final transient C11922X f36198o0;

    /* JADX INFO: renamed from: p0 */
    public final transient C11919W f36199p0;

    public C11916V(C11922X c11922x, C11919W c11919w) {
        this.f36198o0 = c11922x;
        this.f36199p0 = c11919w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f36198o0.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: f */
    public final int mo13223f(Object[] objArr) {
        return this.f36199p0.mo13223f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f36199p0.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G, com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: m */
    public final AbstractC11857B mo13224m() {
        return this.f36199p0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36198o0.f36216r0;
    }
}
