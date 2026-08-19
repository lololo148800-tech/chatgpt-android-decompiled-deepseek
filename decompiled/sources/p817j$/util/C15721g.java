package p817j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: j$.util.g */
/* JADX INFO: loaded from: classes4.dex */
class C15721g extends C15712f implements List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* JADX INFO: renamed from: c */
    final List f48977c;

    C15721g(List list) {
        super(list);
        this.f48977c = list;
    }

    C15721g(List list, Object obj) {
        super(list, obj);
        this.f48977c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f48956b) {
            zEquals = this.f48977c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f48956b) {
            iHashCode = this.f48977c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj;
        synchronized (this.f48956b) {
            obj = this.f48977c.get(i10);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2;
        synchronized (this.f48956b) {
            obj2 = this.f48977c.set(i10, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        synchronized (this.f48956b) {
            this.f48977c.add(i10, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        Object objRemove;
        synchronized (this.f48956b) {
            objRemove = this.f48977c.remove(i10);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f48956b) {
            iIndexOf = this.f48977c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f48956b) {
            iLastIndexOf = this.f48977c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        boolean zAddAll;
        synchronized (this.f48956b) {
            zAddAll = this.f48977c.addAll(i10, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f48977c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return this.f48977c.listIterator(i10);
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        C15721g c15721g;
        synchronized (this.f48956b) {
            c15721g = new C15721g(this.f48977c.subList(i10, i11), this.f48956b);
        }
        return c15721g;
    }

    @Override // java.util.List, p817j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f48956b) {
            List list = this.f48977c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, p817j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.f48956b) {
            AbstractC15666Q.m17270r(this.f48977c, comparator);
        }
    }

    private Object readResolve() {
        List list = this.f48977c;
        return list instanceof RandomAccess ? new C15725i(list) : this;
    }
}
