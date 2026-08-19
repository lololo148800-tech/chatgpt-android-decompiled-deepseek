package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: S9.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7081m extends AbstractC7071h implements List, RandomAccess, p817j$.util.List {

    /* JADX INFO: renamed from: Z */
    public static final C7073i f22562Z = new C7073i(C7098x.f22585q0, 0);

    /* JADX INFO: renamed from: s */
    public static C7098x m7491s(int i10, Object[] objArr) {
        return i10 == 0 ? C7098x.f22585q0 : new C7098x(i10, objArr);
    }

    /* JADX INFO: renamed from: t */
    public static C7098x m7492t(Object[] objArr) {
        if (objArr.length == 0) {
            return C7098x.f22585q0;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr2[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        return m7491s(length, objArr2);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (AbstractC7057a.m7463h(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                C7073i c7073iListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c7073iListIterator.hasNext()) {
                    if (it.hasNext() && AbstractC7057a.m7463h(c7073iListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: f */
    public int mo7427f(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
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

    public int indexOf(Object obj) {
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

    public int lastIndexOf(Object obj) {
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

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: m */
    public final AbstractC7036E mo7428m() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC7081m mo7489q() {
        return size() <= 1 ? this : new C7077k(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC7081m subList(int i10, int i11) {
        AbstractC7057a.m7468m(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C7098x.f22585q0 : new C7079l(this, i10, i12);
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
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final C7073i listIterator(int i10) {
        int size = size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC7057a.m7469n(i10, size, "index"));
        }
        return isEmpty() ? f22562Z : new C7073i(this, i10);
    }
}
