package p466T0;

import java.util.Iterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: T0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7188o implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public Object[] f22841Y = C7187n.f22836e.f22840d;

    /* JADX INFO: renamed from: Z */
    public int f22842Z;

    /* JADX INFO: renamed from: o0 */
    public int f22843o0;

    /* JADX INFO: renamed from: a */
    public final void m7586a(Object[] objArr, int i10, int i11) {
        this.f22841Y = objArr;
        this.f22842Z = i10;
        this.f22843o0 = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22843o0 < this.f22842Z;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
