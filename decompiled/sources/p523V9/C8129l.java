package p523V9;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: V9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8129l extends AbstractC7944N {

    /* JADX INFO: renamed from: Z */
    public final C8225x f25463Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8177r f25464o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8129l(C8177r c8177r, C8225x c8225x) {
        super(0);
        this.f25464o0 = c8177r;
        c8225x.getClass();
        this.f25463Z = c8225x;
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
        return this.f25463Z.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f25463Z.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f25463Z.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25463Z.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f25463Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8113j(this, this.f25463Z.entrySet().iterator(), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f25463Z.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25463Z.size();
    }
}
