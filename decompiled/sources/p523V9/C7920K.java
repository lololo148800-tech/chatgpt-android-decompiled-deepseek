package p523V9;

import java.util.Iterator;

/* JADX INFO: renamed from: V9.K */
/* JADX INFO: loaded from: classes.dex */
public final class C7920K extends AbstractC7872E {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f25138o0;

    /* JADX INFO: renamed from: p0 */
    public final transient C7928L f25139p0;

    public C7920K(C7936M c7936m, C7928L c7928l) {
        this.f25138o0 = c7936m;
        this.f25139p0 = c7928l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25138o0.get(obj) != null;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: f */
    public final int mo8143f(int i10, Object[] objArr) {
        return this.f25139p0.mo8143f(i10, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f25139p0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f25138o0.getClass();
        return 1;
    }
}
