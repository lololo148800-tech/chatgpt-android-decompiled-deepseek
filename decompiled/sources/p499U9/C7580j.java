package p499U9;

import java.util.Iterator;

/* JADX INFO: renamed from: U9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7580j extends AbstractC7576f {

    /* JADX INFO: renamed from: o0 */
    public final transient C7582l f23993o0;

    /* JADX INFO: renamed from: p0 */
    public final transient C7581k f23994p0;

    public C7580j(C7582l c7582l, C7581k c7581k) {
        this.f23993o0 = c7582l;
        this.f23994p0 = c7581k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23993o0.get(obj) != null;
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: f */
    public final int mo7917f(Object[] objArr) {
        return this.f23994p0.mo7917f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f23994p0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23993o0.f24004r0;
    }
}
