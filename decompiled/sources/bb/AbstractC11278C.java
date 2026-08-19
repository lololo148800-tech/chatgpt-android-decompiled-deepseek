package bb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p499U9.AbstractC7589s;
import p523V9.AbstractC8020X;

/* JADX INFO: renamed from: bb.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11278C extends AbstractC11331x implements List, RandomAccess {

    /* JADX INFO: renamed from: Z */
    public static final C11276A f34162Z = new C11276A(C11294T.f34185q0, 0);

    /* JADX INFO: renamed from: A */
    public static C11294T m12688A(AbstractC11293S abstractC11293S, List list) {
        abstractC11293S.getClass();
        Object[] array = (list instanceof Collection ? list : AbstractC11320m.m12733m(list.iterator())).toArray();
        AbstractC11320m.m12723b(array.length, array);
        Arrays.sort(array, abstractC11293S);
        return m12689r(array.length, array);
    }

    /* JADX INFO: renamed from: r */
    public static C11294T m12689r(int i10, Object[] objArr) {
        return i10 == 0 ? C11294T.f34185q0 : new C11294T(i10, objArr);
    }

    /* JADX INFO: renamed from: s */
    public static C11333z m12690s() {
        return new C11333z(4);
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC11278C m12691t(Collection collection) {
        if (!(collection instanceof AbstractC11331x)) {
            Object[] array = collection.toArray();
            AbstractC11320m.m12723b(array.length, array);
            return m12689r(array.length, array);
        }
        AbstractC11278C abstractC11278CMo12697f = ((AbstractC11331x) collection).mo12697f();
        if (!abstractC11278CMo12697f.mo12687q()) {
            return abstractC11278CMo12697f;
        }
        Object[] array2 = abstractC11278CMo12697f.toArray(AbstractC11331x.f34263Y);
        return m12689r(array2.length, array2);
    }

    /* JADX INFO: renamed from: u */
    public static C11294T m12692u(Object[] objArr) {
        if (objArr.length == 0) {
            return C11294T.f34185q0;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC11320m.m12723b(objArr2.length, objArr2);
        return m12689r(objArr2.length, objArr2);
    }

    /* JADX INFO: renamed from: w */
    public static C11294T m12693w() {
        return C11294T.f34185q0;
    }

    /* JADX INFO: renamed from: x */
    public static C11294T m12694x(Long l4, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l4, l10, l11, l12, l13};
        AbstractC11320m.m12723b(5, objArr);
        return m12689r(5, objArr);
    }

    /* JADX INFO: renamed from: y */
    public static C11294T m12695y(Object obj) {
        Object[] objArr = {obj};
        AbstractC11320m.m12723b(1, objArr);
        return m12689r(1, objArr);
    }

    /* JADX INFO: renamed from: z */
    public static C11294T m12696z(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC11320m.m12723b(2, objArr);
        return m12689r(2, objArr);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public AbstractC11278C subList(int i10, int i11) {
        AbstractC8020X.m8355e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C11294T.f34185q0 : new C11277B(this, i10, i12);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // bb.AbstractC11331x, java.util.AbstractCollection, java.util.Collection, java.util.List
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
                        if (AbstractC7589s.m7931f(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && AbstractC7589s.m7931f(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: i */
    public int mo12698i(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
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
    public Iterator iterator() {
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
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C11276A listIterator(int i10) {
        AbstractC8020X.m8354d(i10, size());
        return isEmpty() ? f34162Z : new C11276A(this, i10);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: f */
    public final AbstractC11278C mo12697f() {
        return this;
    }
}
