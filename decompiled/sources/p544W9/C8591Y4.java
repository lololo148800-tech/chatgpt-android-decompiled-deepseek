package p544W9;

import java.util.Iterator;
import p523V9.C7936M;

/* JADX INFO: renamed from: W9.Y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8591Y4 extends AbstractC8567U4 {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f26416o0;

    /* JADX INFO: renamed from: p0 */
    public final transient C8597Z4 f26417p0;

    public C8591Y4(C7936M c7936m, C8597Z4 c8597z4) {
        this.f26416o0 = c7936m;
        this.f26417p0 = c8597z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f26416o0.get(obj) != null;
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: f */
    public final int mo9224f(Object[] objArr) {
        return this.f26417p0.mo9224f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f26417p0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f26416o0.getClass();
        return 1;
    }
}
