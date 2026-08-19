package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11857B extends AbstractC12019w implements List, RandomAccess, p817j$.util.List {

    /* JADX INFO: renamed from: Z */
    public static final C12027y f36097Z = new C12027y(C11907S.f36188q0, 0);

    /* JADX INFO: renamed from: t */
    public static C11907S m13221t(int i10, Object[] objArr) {
        return i10 == 0 ? C11907S.f36188q0 : new C11907S(i10, objArr);
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC11857B m13222u(ArrayList arrayList) {
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (array[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        return m13221t(length, array);
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
                C12027y c12027yListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c12027yListIterator.hasNext()) {
                    if (it.hasNext() && ((next = c12027yListIterator.next()) == (next2 = it.next()) || (next != null && next.equals(next2)))) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: f */
    public int mo13223f(Object[] objArr) {
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

    @Override // java.util.List
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

    @Override // java.util.List
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: m */
    public final AbstractC11857B mo13224m() {
        return this;
    }

    /* JADX INFO: renamed from: r */
    public AbstractC11857B mo13225r() {
        return size() <= 1 ? this : new C12031z(this);
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
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC11857B subList(int i10, int i11) {
        AbstractC11957g1.m13430F(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C11907S.f36188q0 : new C11853A(this, i10, i12);
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
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C12027y listIterator(int i10) {
        AbstractC11957g1.m13457u(i10, size());
        return isEmpty() ? f36097Z : new C12027y(this, i10);
    }
}
