package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11932a0 extends AbstractC11872G {

    /* JADX INFO: renamed from: o0 */
    public final transient Object f36231o0;

    public C11932a0(Object obj) {
        this.f36231o0 = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f36231o0.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: f */
    public final int mo13223f(Object[] objArr) {
        objArr[0] = this.f36231o0;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f36231o0.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C11881J(this.f36231o0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G, com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: m */
    public final AbstractC11857B mo13224m() {
        Object[] objArr = {this.f36231o0};
        for (int i10 = 0; i10 < 1; i10++) {
            C12027y c12027y = AbstractC11857B.f36097Z;
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        return AbstractC11857B.m13221t(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC10763a.m11054l("[", this.f36231o0.toString(), "]");
    }
}
