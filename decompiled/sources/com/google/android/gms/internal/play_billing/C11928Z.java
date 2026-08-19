package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C11928Z extends AbstractC11875H {

    /* JADX INFO: renamed from: r0 */
    public static final C11928Z f36225r0;

    /* JADX INFO: renamed from: q0 */
    public final transient AbstractC11857B f36226q0;

    static {
        C12027y c12027y = AbstractC11857B.f36097Z;
        f36225r0 = new C11928Z(C11907S.f36188q0, C11890M.f36160Y);
    }

    public C11928Z(AbstractC11857B abstractC11857B, Comparator comparator) {
        super(comparator);
        this.f36226q0 = abstractC11857B;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM13372v = m13372v(obj, true);
        AbstractC11857B abstractC11857B = this.f36226q0;
        if (iM13372v == abstractC11857B.size()) {
            return null;
        }
        return abstractC11857B.get(iM13372v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f36226q0, obj, this.f36133o0) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC11887L) {
            collection = ((InterfaceC11887L) collection).m13303a();
        }
        Comparator comparator = this.f36133o0;
        if (!AbstractC11957g1.m13449l(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C12027y c12027yListIterator = this.f36226q0.listIterator(0);
        Iterator it = collection.iterator();
        if (!c12027yListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = c12027yListIterator.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!c12027yListIterator.hasNext()) {
                        return false;
                    }
                    next2 = c12027yListIterator.next();
                } else {
                    if (iCompare != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f36226q0.mo13225r().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        AbstractC11857B abstractC11857B = this.f36226q0;
        if (abstractC11857B.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f36133o0;
        if (!AbstractC11957g1.m13449l(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C12027y c12027yListIterator = abstractC11857B.listIterator(0);
            while (c12027yListIterator.hasNext()) {
                Object next = c12027yListIterator.next();
                Object next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: f */
    public final int mo13223f(Object[] objArr) {
        return this.f36226q0.mo13223f(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11875H, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f36226q0.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM13371u = m13371u(obj, true) - 1;
        if (iM13371u == -1) {
            return null;
        }
        return this.f36226q0.get(iM13371u);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM13372v = m13372v(obj, false);
        AbstractC11857B abstractC11857B = this.f36226q0;
        if (iM13372v == abstractC11857B.size()) {
            return null;
        }
        return abstractC11857B.get(iM13372v);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: i */
    public final int mo13212i() {
        return this.f36226q0.mo13212i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f36226q0.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: j */
    public final int mo13213j() {
        return this.f36226q0.mo13213j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11875H, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        AbstractC11857B abstractC11857B = this.f36226q0;
        return abstractC11857B.get(abstractC11857B.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM13371u = m13371u(obj, false) - 1;
        if (iM13371u == -1) {
            return null;
        }
        return this.f36226q0.get(iM13371u);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11872G, com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: m */
    public final AbstractC11857B mo13224m() {
        return this.f36226q0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: q */
    public final Object[] mo13215q() {
        return this.f36226q0.mo13215q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36226q0.size();
    }

    /* JADX INFO: renamed from: u */
    public final int m13371u(Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f36226q0, obj, this.f36133o0);
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: v */
    public final int m13372v(Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f36226q0, obj, this.f36133o0);
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: w */
    public final C11928Z m13373w(int i10, int i11) {
        AbstractC11857B abstractC11857B = this.f36226q0;
        if (i10 == 0) {
            if (i11 == abstractC11857B.size()) {
                return this;
            }
            i10 = 0;
        }
        Comparator comparator = this.f36133o0;
        if (i10 < i11) {
            return new C11928Z(abstractC11857B.subList(i10, i11), comparator);
        }
        if (C11890M.f36160Y.equals(comparator)) {
            return f36225r0;
        }
        C12027y c12027y = AbstractC11857B.f36097Z;
        return new C11928Z(C11907S.f36188q0, comparator);
    }
}
