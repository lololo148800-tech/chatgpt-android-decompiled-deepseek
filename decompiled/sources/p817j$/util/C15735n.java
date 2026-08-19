package p817j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: j$.util.n */
/* JADX INFO: loaded from: classes4.dex */
class C15735n extends C15731l implements List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* JADX INFO: renamed from: b */
    final List f49004b;

    C15735n(List list) {
        super(list);
        this.f49004b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f49004b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f49004b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f49004b.get(i10);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f49004b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f49004b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p817j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p817j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C15733m(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C15733m(this, i10);
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new C15735n(this.f49004b.subList(i10, i11));
    }

    private Object readResolve() {
        List list = this.f49004b;
        return list instanceof RandomAccess ? new C16021t(list) : this;
    }
}
