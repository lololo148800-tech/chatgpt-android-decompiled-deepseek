package p586Y0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import p076Cm.InterfaceC1725c;
import p349O0.C5997d;
import p440S0.AbstractC6977c;
import p440S0.C6980f;
import p530Vi.AbstractC8301I;
import p909nm.AbstractC17657B;

/* JADX INFO: renamed from: Y0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C9546E implements List, InterfaceC1725c {

    /* JADX INFO: renamed from: Y */
    public final C9566r f28707Y;

    /* JADX INFO: renamed from: Z */
    public final int f28708Z;

    /* JADX INFO: renamed from: o0 */
    public int f28709o0;

    /* JADX INFO: renamed from: p0 */
    public int f28710p0;

    public C9546E(C9566r c9566r, int i10, int i11) {
        this.f28707Y = c9566r;
        this.f28708Z = i10;
        this.f28709o0 = c9566r.m10104q();
        this.f28710p0 = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m10039f();
        int i10 = this.f28708Z + this.f28710p0;
        C9566r c9566r = this.f28707Y;
        c9566r.add(i10, obj);
        this.f28710p0++;
        this.f28709o0 = c9566r.m10104q();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f28710p0, collection);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0070 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clear() {
        int i10;
        AbstractC6977c abstractC6977c;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        if (this.f28710p0 > 0) {
            m10039f();
            C9566r c9566r = this.f28707Y;
            int i11 = this.f28708Z;
            int i12 = this.f28710p0 + i11;
            c9566r.getClass();
            do {
                Object obj = AbstractC9567s.f28775a;
                synchronized (obj) {
                    C9565q c9565q = c9566r.f28774Y;
                    AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                    i10 = c9565q2.f28772d;
                    abstractC6977c = c9565q2.f28771c;
                }
                AbstractC16544l.m18091d(abstractC6977c);
                C6980f c6980fMo7340q = abstractC6977c.mo7340q();
                c6980fMo7340q.subList(i11, i12).clear();
                AbstractC6977c abstractC6977cM7373m = c6980fMo7340q.m7373m();
                if (AbstractC16544l.m18089b(abstractC6977cM7373m, abstractC6977c)) {
                    break;
                }
                C9565q c9565q3 = c9566r.f28774Y;
                AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AbstractC9562n.f28759b) {
                    abstractC9556hM10087k = AbstractC9562n.m10087k();
                    C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, c9566r, abstractC9556hM10087k);
                    synchronized (obj) {
                        try {
                            int i13 = c9565q4.f28772d;
                            if (i13 == i10) {
                                c9565q4.f28771c = abstractC6977cM7373m;
                                c9565q4.f28772d = i13 + 1;
                                z6 = true;
                                c9565q4.f28773e++;
                            } else {
                                z6 = false;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                AbstractC9562n.m10091o(abstractC9556hM10087k, c9566r);
            } while (!z6);
            this.f28710p0 = 0;
            this.f28709o0 = this.f28707Y.m10104q();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10039f() {
        if (this.f28707Y.m10104q() != this.f28709o0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m10039f();
        AbstractC9567s.m10106a(i10, this.f28710p0);
        return this.f28707Y.get(this.f28708Z + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m10039f();
        int i10 = this.f28710p0;
        int i11 = this.f28708Z;
        Iterator it = AbstractC8301I.m8929t(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iMo4199a = ((AbstractC17657B) it).mo4199a();
            if (AbstractC16544l.m18089b(obj, this.f28707Y.get(iMo4199a))) {
                return iMo4199a - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f28710p0 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m10039f();
        int i10 = this.f28710p0;
        int i11 = this.f28708Z;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (AbstractC16544l.m18089b(obj, this.f28707Y.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z6 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z6) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006e */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection collection) {
        int i10;
        AbstractC6977c abstractC6977c;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        m10039f();
        C9566r c9566r = this.f28707Y;
        int i11 = this.f28708Z;
        int i12 = this.f28710p0 + i11;
        int size = c9566r.size();
        do {
            Object obj = AbstractC9567s.f28775a;
            synchronized (obj) {
                C9565q c9565q = c9566r.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i10 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            C6980f c6980fMo7340q = abstractC6977c.mo7340q();
            c6980fMo7340q.subList(i11, i12).retainAll(collection);
            AbstractC6977c abstractC6977cM7373m = c6980fMo7340q.m7373m();
            if (AbstractC16544l.m18089b(abstractC6977cM7373m, abstractC6977c)) {
                break;
            }
            C9565q c9565q3 = c9566r.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, c9566r, abstractC9556hM10087k);
                synchronized (obj) {
                    try {
                        int i13 = c9565q4.f28772d;
                        if (i13 == i10) {
                            c9565q4.f28771c = abstractC6977cM7373m;
                            c9565q4.f28772d = i13 + 1;
                            c9565q4.f28773e++;
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, c9566r);
        } while (!z6);
        int size2 = size - c9566r.size();
        if (size2 > 0) {
            this.f28709o0 = this.f28707Y.m10104q();
            this.f28710p0 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC9567s.m10106a(i10, this.f28710p0);
        m10039f();
        int i11 = i10 + this.f28708Z;
        C9566r c9566r = this.f28707Y;
        Object obj2 = c9566r.set(i11, obj);
        this.f28709o0 = c9566r.m10104q();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f28710p0;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f28710p0)) {
            C5997d.m6443b0("fromIndex or toIndex are out of bounds");
            throw null;
        }
        m10039f();
        int i12 = this.f28708Z;
        return new C9546E(this.f28707Y, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        m10039f();
        C16558z c16558z = new C16558z();
        c16558z.f51287Y = i10 - 1;
        return new C9545D(c16558z, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC16543k.m18087b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m10039f();
        int i11 = i10 + this.f28708Z;
        C9566r c9566r = this.f28707Y;
        boolean zAddAll = c9566r.addAll(i11, collection);
        if (zAddAll) {
            this.f28710p0 = collection.size() + this.f28710p0;
            this.f28709o0 = c9566r.m10104q();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        m10039f();
        int i11 = this.f28708Z + i10;
        C9566r c9566r = this.f28707Y;
        Object objRemove = c9566r.remove(i11);
        this.f28710p0--;
        this.f28709o0 = c9566r.m10104q();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        m10039f();
        int i11 = this.f28708Z + i10;
        C9566r c9566r = this.f28707Y;
        c9566r.add(i11, obj);
        this.f28710p0++;
        this.f28709o0 = c9566r.m10104q();
    }
}
