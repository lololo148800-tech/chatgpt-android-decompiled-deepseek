package p909nm;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0386f;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: nm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17667a implements Collection, InterfaceC1723a {
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC16544l.m18089b(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo1316f();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo1316f() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo1316f();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    public final String toString() {
        return AbstractC17680n.m19349Y(this, ", ", "[", "]", 0, null, new C0386f(this, 28), 24);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        return AbstractC16543k.m18087b(this, array);
    }
}
