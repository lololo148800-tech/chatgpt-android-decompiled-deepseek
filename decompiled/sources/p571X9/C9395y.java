package p571X9;

import java.util.Iterator;
import p523V9.C7936M;

/* JADX INFO: renamed from: X9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C9395y extends AbstractC9359s {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f28352o0;

    /* JADX INFO: renamed from: p0 */
    public final transient C9401z f28353p0;

    public C9395y(C7936M c7936m, C9401z c9401z) {
        this.f28352o0 = c7936m;
        this.f28353p0 = c9401z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f28352o0.get(obj) != null;
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: f */
    public final int mo9926f(Object[] objArr) {
        return this.f28353p0.mo9926f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f28353p0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f28352o0.getClass();
        return 1;
    }
}
