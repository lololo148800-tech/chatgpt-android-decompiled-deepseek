package p449S9;

/* JADX INFO: renamed from: S9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7077k extends AbstractC7081m {

    /* JADX INFO: renamed from: o0 */
    public final transient AbstractC7081m f22556o0;

    public C7077k(AbstractC7081m abstractC7081m) {
        this.f22556o0 = abstractC7081m;
    }

    @Override // p449S9.AbstractC7081m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f22556o0.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC7081m abstractC7081m = this.f22556o0;
        AbstractC7057a.m7460e(i10, abstractC7081m.size());
        return abstractC7081m.get((abstractC7081m.size() - 1) - i10);
    }

    @Override // p449S9.AbstractC7081m, java.util.List
    public final int indexOf(Object obj) {
        AbstractC7081m abstractC7081m = this.f22556o0;
        int iLastIndexOf = abstractC7081m.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC7081m.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p449S9.AbstractC7081m, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC7081m abstractC7081m = this.f22556o0;
        int iIndexOf = abstractC7081m.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC7081m.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // p449S9.AbstractC7081m
    /* JADX INFO: renamed from: q */
    public final AbstractC7081m mo7489q() {
        return this.f22556o0;
    }

    @Override // p449S9.AbstractC7081m, java.util.List
    /* JADX INFO: renamed from: r */
    public final AbstractC7081m subList(int i10, int i11) {
        AbstractC7081m abstractC7081m = this.f22556o0;
        AbstractC7057a.m7468m(i10, i11, abstractC7081m.size());
        return abstractC7081m.subList(abstractC7081m.size() - i11, abstractC7081m.size() - i10).mo7489q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22556o0.size();
    }
}
