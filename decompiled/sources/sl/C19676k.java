package sl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0716A;
import p049Bm.InterfaceC1436k;
import p076Cm.InterfaceC1728f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: sl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C19676k implements Set, InterfaceC1728f {

    /* JADX INFO: renamed from: Y */
    public final Set f62364Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1436k f62365Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f62366o0;

    /* JADX INFO: renamed from: p0 */
    public final int f62367p0;

    public C19676k(Set delegate, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f62364Y = delegate;
        this.f62365Z = interfaceC1436k;
        this.f62366o0 = interfaceC1436k2;
        this.f62367p0 = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f62364Y.add(this.f62366o0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return this.f62364Y.addAll(m20653f(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f62364Y.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f62364Y.contains(this.f62366o0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return this.f62364Y.containsAll(m20653f(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListM20654j = m20654j(this.f62364Y);
        return ((Set) obj).containsAll(arrayListM20654j) && arrayListM20654j.containsAll((Collection) obj);
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m20653f(Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f62366o0.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f62364Y.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f62364Y.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0716A(this);
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m20654j(Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f62365Z.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f62364Y.remove(this.f62366o0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return this.f62364Y.removeAll(AbstractC17680n.m19328G0(m20653f(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return this.f62364Y.retainAll(AbstractC17680n.m19328G0(m20653f(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f62367p0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    public final String toString() {
        return m20654j(this.f62364Y).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        return AbstractC16543k.m18087b(this, array);
    }
}
