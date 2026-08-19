package bb;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p523V9.AbstractC7944N;
import p523V9.C8113j;

/* JADX INFO: renamed from: bb.c */
/* JADX INFO: loaded from: classes.dex */
public class C11305c extends AbstractC7944N {

    /* JADX INFO: renamed from: Z */
    public final Map f34219Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11290O f34220o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11305c(C11290O c11290o, Map map) {
        super(3);
        this.f34220o0 = c11290o;
        map.getClass();
        this.f34219Z = map;
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
        return this.f34219Z.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f34219Z.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f34219Z.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f34219Z.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f34219Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8113j(this, this.f34219Z.entrySet().iterator(), 10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f34219Z.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f34220o0.f34182q0 -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34219Z.size();
    }
}
