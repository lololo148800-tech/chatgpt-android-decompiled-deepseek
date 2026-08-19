package p392Q0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1725c;
import p571X9.AbstractC9294h0;

/* JADX INFO: renamed from: Q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6543a implements List, InterfaceC1725c {

    /* JADX INFO: renamed from: Y */
    public final C6546d f21176Y;

    public C6543a(C6546d c6546d) {
        this.f21176Y = c6546d;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f21176Y.m7099c(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        C6546d c6546d = this.f21176Y;
        return c6546d.m7102g(c6546d.f21184o0, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f21176Y.m7104i();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21176Y.m7105j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C6546d c6546d = this.f21176Y;
        c6546d.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c6546d.m7105j(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9294h0.m9872a(i10, this);
        return this.f21176Y.f21182Y[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f21176Y.m7107l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21176Y.m7108m();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6545c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C6546d c6546d = this.f21176Y;
        int i10 = c6546d.f21184o0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = c6546d.f21182Y;
            while (!AbstractC16544l.m18089b(obj, objArr[i11])) {
                i11--;
                if (i11 < 0) {
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C6545c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f21176Y.m7110o(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C6546d c6546d = this.f21176Y;
        c6546d.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = c6546d.f21184o0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c6546d.m7110o(it.next());
        }
        return i10 != c6546d.f21184o0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C6546d c6546d = this.f21176Y;
        int i10 = c6546d.f21184o0;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(c6546d.f21182Y[i11])) {
                c6546d.m7111p(i11);
            }
        }
        return i10 != c6546d.f21184o0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC9294h0.m9872a(i10, this);
        Object[] objArr = this.f21176Y.f21182Y;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21176Y.f21184o0;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        AbstractC9294h0.m9873b(this, i10, i11);
        return new C6544b(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f21176Y.m7098a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C6545c(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        AbstractC9294h0.m9872a(i10, this);
        return this.f21176Y.m7111p(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC16543k.m18087b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f21176Y.m7102g(i10, collection);
    }
}
