package p594Y9;

import java.util.Iterator;
import p523V9.C7936M;

/* JADX INFO: renamed from: Y9.B */
/* JADX INFO: loaded from: classes.dex */
public final class C9699B extends AbstractC9956r {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f29226o0;

    /* JADX INFO: renamed from: p0 */
    public final transient C9705C f29227p0;

    public C9699B(C7936M c7936m, C9705C c9705c) {
        this.f29226o0 = c7936m;
        this.f29227p0 = c9705c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29226o0.get(obj) != null;
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: f */
    public final int mo10285f(Object[] objArr) {
        return this.f29227p0.mo10285f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f29227p0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f29226o0.getClass();
        return 1;
    }
}
