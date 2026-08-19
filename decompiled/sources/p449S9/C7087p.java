package p449S9;

import java.util.AbstractMap;

/* JADX INFO: renamed from: S9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7087p extends AbstractC7081m {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7089q f22570o0;

    public C7087p(C7089q c7089q) {
        this.f22570o0 = c7089q;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C7089q c7089q = this.f22570o0;
        return new AbstractMap.SimpleImmutableEntry(c7089q.f22572p0.f22575o0.f22596r0.get(i10), c7089q.f22572p0.f22576p0.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22570o0.f22572p0.f22576p0.size();
    }
}
