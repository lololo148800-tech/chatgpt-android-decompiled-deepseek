package bb;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: bb.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11306c0 extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC11281F f34221Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC11281F f34222Z;

    public C11306c0(AbstractC11281F abstractC11281F, AbstractC11281F abstractC11281F2) {
        this.f34221Y = abstractC11281F;
        this.f34222Z = abstractC11281F2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f34221Y.contains(obj) && this.f34222Z.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f34221Y.containsAll(collection) && this.f34222Z.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f34222Z, this.f34221Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C11282G(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f34221Y.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f34222Z.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
