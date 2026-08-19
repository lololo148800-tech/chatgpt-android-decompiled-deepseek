package p692d0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: d0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12963b implements Set {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C12966e f41166Y;

    public C12963b(C12966e c12966e) {
        this.f41166Y = c12966e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f41166Y.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41166Y.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f41166Y.m14657k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C12966e c12966e = this.f41166Y;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (c12966e.f41154o0 == set.size() && c12966e.m14657k(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C12966e c12966e = this.f41166Y;
        int iHashCode = 0;
        for (int i10 = c12966e.f41154o0 - 1; i10 >= 0; i10--) {
            Object objM14646f = c12966e.m14646f(i10);
            iHashCode += objM14646f == null ? 0 : objM14646f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f41166Y.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C12962a(this.f41166Y, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C12966e c12966e = this.f41166Y;
        int iM14644d = c12966e.m14644d(obj);
        if (iM14644d < 0) {
            return false;
        }
        c12966e.m14647g(iM14644d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f41166Y.m14658l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C12966e c12966e = this.f41166Y;
        int i10 = c12966e.f41154o0;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(c12966e.m14646f(i11))) {
                c12966e.m14647g(i11);
            }
        }
        return i10 != c12966e.f41154o0;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f41166Y.f41154o0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C12966e c12966e = this.f41166Y;
        int i10 = c12966e.f41154o0;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c12966e.m14646f(i11);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C12966e c12966e = this.f41166Y;
        int i10 = c12966e.f41154o0;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c12966e.m14646f(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
