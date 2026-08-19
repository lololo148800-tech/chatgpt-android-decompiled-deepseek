package p449S9;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: S9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C7100z extends AbstractC7093s {

    /* JADX INFO: renamed from: s0 */
    public static final C7100z f22595s0;

    /* JADX INFO: renamed from: r0 */
    public final transient AbstractC7081m f22596r0;

    static {
        C7073i c7073i = AbstractC7081m.f22562Z;
        f22595s0 = new C7100z(C7098x.f22585q0, C7096v.f22584Y);
    }

    public C7100z(AbstractC7081m abstractC7081m, Comparator comparator) {
        super(comparator);
        this.f22596r0 = abstractC7081m;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM7510y = m7510y(obj, true);
        AbstractC7081m abstractC7081m = this.f22596r0;
        if (iM7510y == abstractC7081m.size()) {
            return null;
        }
        return abstractC7081m.get(iM7510y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f22596r0, obj, this.f22580p0) >= 0) {
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
        if (collection instanceof InterfaceC7095u) {
            collection = ((InterfaceC7095u) collection).m7508a();
        }
        Comparator comparator = this.f22580p0;
        if (!AbstractC7057a.m7464i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C7073i c7073iListIterator = this.f22596r0.listIterator(0);
        Iterator it = collection.iterator();
        if (!c7073iListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = c7073iListIterator.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!c7073iListIterator.hasNext()) {
                        return false;
                    }
                    next2 = c7073iListIterator.next();
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
        return this.f22596r0.mo7489q().listIterator(0);
    }

    @Override // p449S9.AbstractC7085o, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        AbstractC7081m abstractC7081m = this.f22596r0;
        if (abstractC7081m.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f22580p0;
        if (!AbstractC7057a.m7464i(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C7073i c7073iListIterator = abstractC7081m.listIterator(0);
            while (c7073iListIterator.hasNext()) {
                Object next = c7073iListIterator.next();
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

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: f */
    public final int mo7427f(Object[] objArr) {
        return this.f22596r0.mo7427f(objArr);
    }

    @Override // p449S9.AbstractC7093s, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f22596r0.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM7509x = m7509x(obj, true) - 1;
        if (iM7509x == -1) {
            return null;
        }
        return this.f22596r0.get(iM7509x);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM7510y = m7510y(obj, false);
        AbstractC7081m abstractC7081m = this.f22596r0;
        if (iM7510y == abstractC7081m.size()) {
            return null;
        }
        return abstractC7081m.get(iM7510y);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: i */
    public final int mo7472i() {
        return this.f22596r0.mo7472i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f22596r0.listIterator(0);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: j */
    public final int mo7473j() {
        return this.f22596r0.mo7473j();
    }

    @Override // p449S9.AbstractC7093s, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        AbstractC7081m abstractC7081m = this.f22596r0;
        return abstractC7081m.get(abstractC7081m.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM7509x = m7509x(obj, false) - 1;
        if (iM7509x == -1) {
            return null;
        }
        return this.f22596r0.get(iM7509x);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: m */
    public final AbstractC7036E mo7428m() {
        return this.f22596r0.listIterator(0);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: p */
    public final Object[] mo7474p() {
        return this.f22596r0.mo7474p();
    }

    @Override // p449S9.AbstractC7085o
    /* JADX INFO: renamed from: s */
    public final AbstractC7081m mo7429s() {
        return this.f22596r0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22596r0.size();
    }

    /* JADX INFO: renamed from: x */
    public final int m7509x(Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f22596r0, obj, this.f22580p0);
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: y */
    public final int m7510y(Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f22596r0, obj, this.f22580p0);
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: z */
    public final C7100z m7511z(int i10, int i11) {
        AbstractC7081m abstractC7081m = this.f22596r0;
        if (i10 == 0) {
            if (i11 == abstractC7081m.size()) {
                return this;
            }
            i10 = 0;
        }
        Comparator comparator = this.f22580p0;
        return i10 < i11 ? new C7100z(abstractC7081m.subList(i10, i11), comparator) : AbstractC7093s.m7505w(comparator);
    }
}
