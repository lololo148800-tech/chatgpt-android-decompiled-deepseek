package p692d0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: d0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C12965d implements Collection {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C12966e f41171Y;

    public C12965d(C12966e c12966e) {
        this.f41171Y = c12966e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f41171Y.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41171Y.m14641a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f41171Y.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C12962a(this.f41171Y, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C12966e c12966e = this.f41171Y;
        int iM14641a = c12966e.m14641a(obj);
        if (iM14641a < 0) {
            return false;
        }
        c12966e.m14647g(iM14641a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C12966e c12966e = this.f41171Y;
        int i10 = c12966e.f41154o0;
        int i11 = 0;
        boolean z6 = false;
        while (i11 < i10) {
            if (collection.contains(c12966e.m14649j(i11))) {
                c12966e.m14647g(i11);
                i11--;
                i10--;
                z6 = true;
            }
            i11++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C12966e c12966e = this.f41171Y;
        int i10 = c12966e.f41154o0;
        int i11 = 0;
        boolean z6 = false;
        while (i11 < i10) {
            if (!collection.contains(c12966e.m14649j(i11))) {
                c12966e.m14647g(i11);
                i11--;
                i10--;
                z6 = true;
            }
            i11++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f41171Y.f41154o0;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C12966e c12966e = this.f41171Y;
        int i10 = c12966e.f41154o0;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c12966e.m14649j(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C12966e c12966e = this.f41171Y;
        int i10 = c12966e.f41154o0;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c12966e.m14649j(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
