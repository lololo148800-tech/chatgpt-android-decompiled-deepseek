package p594Y9;

import java.util.Collection;
import java.util.Iterator;
import p523V9.AbstractC7944N;
import p523V9.C8113j;

/* JADX INFO: renamed from: Y9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9862c extends AbstractC7944N {

    /* JADX INFO: renamed from: Z */
    public final C9920l f29371Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9896h f29372o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9862c(C9896h c9896h, C9920l c9920l) {
        super(2);
        this.f29372o0 = c9896h;
        c9920l.getClass();
        this.f29371Z = c9920l;
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
        return this.f29371Z.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f29371Z.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f29371Z.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f29371Z.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29371Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8113j(this, this.f29371Z.entrySet().iterator(), 7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f29371Z.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f29372o0.f29411p0 -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29371Z.size();
    }
}
