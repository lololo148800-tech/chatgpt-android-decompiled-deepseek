package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p594Y9.AbstractC9762L2;
import p594Y9.AbstractC9768M2;

/* JADX INFO: renamed from: V9.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7864D extends AbstractC8233y implements List, RandomAccess {

    /* JADX INFO: renamed from: Z */
    public static final C7848B f24770Z = new C7848B(C7896H.f24841q0, 0);

    /* JADX INFO: renamed from: q */
    public static C7896H m8142q(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        return new C7896H(2, objArr);
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
    public final boolean contains(Object obj) {
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
                        if (AbstractC9762L2.m10365b(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                C7848B c7848bListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c7848bListIterator.hasNext()) {
                    if (it.hasNext() && AbstractC9762L2.m10365b(c7848bListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: f */
    public int mo8143f(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
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

    @Override // java.util.List
    /* JADX INFO: renamed from: p */
    public AbstractC7864D subList(int i10, int i11) {
        AbstractC9768M2.m10372c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C7896H.f24841q0 : new C7856C(this, i10, i12);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C7848B listIterator(int i10) {
        int size = size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC9768M2.m10373d(i10, size, "index"));
        }
        return isEmpty() ? f24770Z : new C7848B(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
