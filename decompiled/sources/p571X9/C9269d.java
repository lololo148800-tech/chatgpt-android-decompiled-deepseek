package p571X9;

import java.util.Collection;
import java.util.Iterator;
import p523V9.AbstractC7944N;
import p523V9.C8113j;

/* JADX INFO: renamed from: X9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9269d extends AbstractC7944N {

    /* JADX INFO: renamed from: Z */
    public final C9323m f28055Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9299i f28056o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9269d(C9299i c9299i, C9323m c9323m) {
        super(1);
        this.f28056o0 = c9299i;
        c9323m.getClass();
        this.f28055Z = c9323m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C8113j c8113j = (C8113j) it;
            if (!c8113j.hasNext()) {
                return;
            }
            c8113j.next();
            c8113j.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f28055Z.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f28055Z.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f28055Z.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f28055Z.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f28055Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8113j(this, this.f28055Z.entrySet().iterator(), 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f28055Z.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f28056o0.f28089p0 -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28055Z.size();
    }
}
