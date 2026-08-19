package tl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p076Cm.InterfaceC1728f;

/* JADX INFO: renamed from: tl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20004d implements Set, InterfaceC1728f {

    /* JADX INFO: renamed from: Y */
    public final C20003c f63324Y = new C20003c();

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object element) {
        AbstractC16544l.m18094g(element, "element");
        C20003c c20003c = this.f63324Y;
        if (c20003c.f63323Y.containsKey(element)) {
            return false;
        }
        c20003c.put(element, C17296C.f55119a);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!add(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f63324Y.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f63324Y.f63323Y.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return elements.containsAll(this.f63324Y.keySet());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f63324Y.f63323Y.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f63324Y.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return (obj == null || this.f63324Y.f63323Y.remove(obj) == null) ? false : true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!remove(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : this.f63324Y.keySet()) {
            if (!elements.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return removeAll(linkedHashSet);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f63324Y.f63323Y.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        return AbstractC16543k.m18087b(this, array);
    }
}
