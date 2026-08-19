package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import p817j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.T */
/* JADX INFO: loaded from: classes.dex */
public final class C11910T extends AbstractC11857B {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11913U f36191o0;

    public C11910T(C11913U c11913u) {
        this.f36191o0 = c11913u;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C11913U c11913u = this.f36191o0;
        AbstractC11957g1.m13447i(i10, c11913u.f36196q0);
        int i11 = i10 + i10;
        Object[] objArr = c11913u.f36195p0;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: p */
    public final boolean mo13214p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36191o0.f36196q0;
    }
}
