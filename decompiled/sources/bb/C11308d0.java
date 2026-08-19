package bb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p644ab.InterfaceC10533f;

/* JADX INFO: renamed from: bb.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C11308d0 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: Y */
    public final Set f34224Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC10533f f34225Z;

    public C11308d0(Set set, InterfaceC10533f interfaceC10533f) {
        this.f34224Y = set;
        this.f34225Z = interfaceC10533f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f34225Z.apply(obj)) {
            return this.f34224Y.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f34225Z.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f34224Y.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f34224Y;
        boolean z6 = set instanceof RandomAccess;
        InterfaceC10533f interfaceC10533f = this.f34225Z;
        if (!z6 || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC10533f.getClass();
            while (it.hasNext()) {
                if (interfaceC10533f.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC10533f.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!interfaceC10533f.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC11320m.m12735o(list, interfaceC10533f, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC11320m.m12735o(list, interfaceC10533f, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f34224Y;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f34225Z.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC11320m.m12727g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC11320m.m12730j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f34224Y.iterator();
        InterfaceC10533f interfaceC10533f = this.f34225Z;
        if (interfaceC10533f == null) {
            throw new NullPointerException("predicate");
        }
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (interfaceC10533f.apply(it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f34224Y.iterator();
        it.getClass();
        InterfaceC10533f interfaceC10533f = this.f34225Z;
        interfaceC10533f.getClass();
        return new C11282G(it, interfaceC10533f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f34224Y.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f34224Y.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f34225Z.apply(next) && collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f34224Y.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f34225Z.apply(next) && !collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f34224Y.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f34225Z.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC11320m.m12733m(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC11320m.m12733m(iterator()).toArray(objArr);
    }
}
