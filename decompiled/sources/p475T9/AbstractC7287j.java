package p475T9;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import p571X9.AbstractC9201R3;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: renamed from: T9.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7287j extends AbstractC7284g implements List, RandomAccess, p817j$.util.List {

    /* JADX INFO: renamed from: Z */
    public static final C7285h f23091Z = new C7285h(C7288k.f23092q0, 0);

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj2 = get(i10);
                        Object obj3 = list.get(i10);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                C7285h c7285hListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c7285hListIterator.hasNext()) {
                    if (it.hasNext() && ((next = c7285hListIterator.next()) == (next2 = it.next()) || (next != null && next.equals(next2)))) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p475T9.AbstractC7284g
    /* JADX INFO: renamed from: p */
    public int mo7739p(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q */
    public AbstractC7287j subList(int i10, int i11) {
        AbstractC9201R3.m9768c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C7288k.f23092q0 : new C7286i(this, i10, i12);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p817j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        p817j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p817j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        p817j$.util.List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C7285h listIterator(int i10) {
        int size = size();
        if (i10 >= 0 && i10 <= size) {
            if (isEmpty()) {
                return f23091Z;
            }
            return new C7285h(this, i10);
        }
        throw new IndexOutOfBoundsException(AbstractC9201R3.m9769d(i10, size, WGTYqNchEpHca.ywgIfsigwCC));
    }
}
