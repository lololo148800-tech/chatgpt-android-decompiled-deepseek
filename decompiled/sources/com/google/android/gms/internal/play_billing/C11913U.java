package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.U */
/* JADX INFO: loaded from: classes.dex */
public final class C11913U extends AbstractC11872G {

    /* JADX INFO: renamed from: o0 */
    public final transient C11922X f36194o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f36195p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f36196q0;

    public C11913U(C11922X c11922x, Object[] objArr, int i10) {
        this.f36194o0 = c11922x;
        this.f36195p0 = objArr;
        this.f36196q0 = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f36194o0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: f */
    public final int mo13223f(Object[] objArr) {
        return mo13224m().mo13223f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo13224m().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G
    /* JADX INFO: renamed from: s */
    public final AbstractC11857B mo13265s() {
        return new C11910T(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36196q0;
    }
}
