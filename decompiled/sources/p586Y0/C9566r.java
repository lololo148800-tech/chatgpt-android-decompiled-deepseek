package p586Y0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p069Cf.C1650i;
import p076Cm.InterfaceC1725c;
import p349O0.C5997d;
import p440S0.AbstractC6977c;
import p440S0.C6976b;
import p440S0.C6980f;
import p440S0.C6983i;

/* JADX INFO: renamed from: Y0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9566r implements InterfaceC9542A, List, RandomAccess, InterfaceC1725c {

    /* JADX INFO: renamed from: Y */
    public C9565q f28774Y;

    public C9566r() {
        C6983i c6983i = C6983i.f22327Z;
        C9565q c9565q = new C9565q(c6983i);
        if (AbstractC9562n.f28758a.m12621z() != null) {
            C9565q c9565q2 = new C9565q(c6983i);
            c9565q2.f28702a = 1;
            c9565q.f28703b = c9565q2;
        }
        this.f28774Y = c9565q;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean add(Object obj) {
        int i10;
        AbstractC6977c abstractC6977c;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        do {
            Object obj2 = AbstractC9567s.f28775a;
            synchronized (obj2) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i10 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            AbstractC6977c abstractC6977cMo7338m = abstractC6977c.mo7338m(obj);
            z6 = false;
            if (abstractC6977cMo7338m.equals(abstractC6977c)) {
                return false;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                synchronized (obj2) {
                    try {
                        int i11 = c9565q4.f28772d;
                        if (i11 == i10) {
                            c9565q4.f28771c = abstractC6977cMo7338m;
                            c9565q4.f28773e++;
                            c9565q4.f28772d = i11 + 1;
                            z6 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return m10105r(new C1650i(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC9556h abstractC9556hM10087k;
        C9565q c9565q = this.f28774Y;
        AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (AbstractC9562n.f28759b) {
            abstractC9556hM10087k = AbstractC9562n.m10087k();
            C9565q c9565q2 = (C9565q) AbstractC9562n.m10100x(c9565q, this, abstractC9556hM10087k);
            synchronized (AbstractC9567s.f28775a) {
                c9565q2.f28771c = C6983i.f22327Z;
                c9565q2.f28772d++;
                c9565q2.f28773e++;
            }
        }
        AbstractC9562n.m10091o(abstractC9556hM10087k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return m10103m().f28771c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return m10103m().f28771c.containsAll(collection);
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: f */
    public final AbstractC9544C mo6345f() {
        return this.f28774Y;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return m10103m().f28771c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return m10103m().f28771c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return m10103m().f28771c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        return null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return m10103m().f28771c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C9572x(this, 0);
    }

    /* JADX INFO: renamed from: m */
    public final C9565q m10103m() {
        C9565q c9565q = this.f28774Y;
        AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C9565q) AbstractC9562n.m10097u(c9565q, this);
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        abstractC9544C.f28703b = this.f28774Y;
        this.f28774Y = (C9565q) abstractC9544C;
    }

    /* JADX INFO: renamed from: q */
    public final int m10104q() {
        C9565q c9565q = this.f28774Y;
        AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C9565q) AbstractC9562n.m10085i(c9565q)).f28773e;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10105r(InterfaceC1436k interfaceC1436k) {
        int i10;
        AbstractC6977c abstractC6977c;
        Object objInvoke;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        do {
            Object obj = AbstractC9567s.f28775a;
            synchronized (obj) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i10 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            C6980f c6980fMo7340q = abstractC6977c.mo7340q();
            objInvoke = interfaceC1436k.invoke(c6980fMo7340q);
            AbstractC6977c abstractC6977cM7373m = c6980fMo7340q.m7373m();
            if (AbstractC16544l.m18089b(abstractC6977cM7373m, abstractC6977c)) {
                break;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                synchronized (obj) {
                    int i11 = c9565q4.f28772d;
                    if (i11 == i10) {
                        c9565q4.f28771c = abstractC6977cM7373m;
                        c9565q4.f28772d = i11 + 1;
                        z6 = true;
                        c9565q4.f28773e++;
                    } else {
                        z6 = false;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        AbstractC6977c abstractC6977c;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        Object obj = get(i10);
        do {
            Object obj2 = AbstractC9567s.f28775a;
            synchronized (obj2) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i11 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            AbstractC6977c abstractC6977cMo7342s = abstractC6977c.mo7342s(i10);
            if (AbstractC16544l.m18089b(abstractC6977cMo7342s, abstractC6977c)) {
                break;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                synchronized (obj2) {
                    int i12 = c9565q4.f28772d;
                    if (i12 == i11) {
                        c9565q4.f28771c = abstractC6977cMo7342s;
                        z6 = true;
                        c9565q4.f28773e++;
                        c9565q4.f28772d = i12 + 1;
                    } else {
                        z6 = false;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005c */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i10;
        AbstractC6977c abstractC6977c;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        do {
            Object obj = AbstractC9567s.f28775a;
            synchronized (obj) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i10 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            AbstractC6977c abstractC6977cMo7341r = abstractC6977c.mo7341r(new C6976b(0, collection));
            z6 = false;
            if (AbstractC16544l.m18089b(abstractC6977cMo7341r, abstractC6977c)) {
                return false;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                synchronized (obj) {
                    try {
                        int i11 = c9565q4.f28772d;
                        if (i11 == i10) {
                            c9565q4.f28771c = abstractC6977cMo7341r;
                            c9565q4.f28773e++;
                            c9565q4.f28772d = i11 + 1;
                            z6 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return m10105r(new C6976b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        AbstractC6977c abstractC6977c;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        Object obj2 = get(i10);
        do {
            Object obj3 = AbstractC9567s.f28775a;
            synchronized (obj3) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i11 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            AbstractC6977c abstractC6977cMo7343t = abstractC6977c.mo7343t(i10, obj);
            if (abstractC6977cMo7343t.equals(abstractC6977c)) {
                break;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                synchronized (obj3) {
                    int i12 = c9565q4.f28772d;
                    if (i12 == i11) {
                        c9565q4.f28771c = abstractC6977cMo7343t;
                        c9565q4.f28772d = i12 + 1;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return m10103m().f28771c.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= size()) {
            return new C9546E(this, i10, i11);
        }
        C5997d.m6443b0("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    public final String toString() {
        C9565q c9565q = this.f28774Y;
        AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C9565q) AbstractC9562n.m10085i(c9565q)).f28771c + ")@" + hashCode();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean addAll(Collection collection) {
        int i10;
        AbstractC6977c abstractC6977c;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        do {
            Object obj = AbstractC9567s.f28775a;
            synchronized (obj) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i10 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            AbstractC6977c abstractC6977cMo7339p = abstractC6977c.mo7339p(collection);
            z6 = false;
            if (AbstractC16544l.m18089b(abstractC6977cMo7339p, abstractC6977c)) {
                return false;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                synchronized (obj) {
                    try {
                        int i11 = c9565q4.f28772d;
                        if (i11 == i10) {
                            c9565q4.f28771c = abstractC6977cMo7339p;
                            c9565q4.f28773e++;
                            c9565q4.f28772d = i11 + 1;
                            z6 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C9572x(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC16543k.m18087b(this, objArr);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void add(int i10, Object obj) {
        int i11;
        AbstractC6977c abstractC6977c;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        do {
            Object obj2 = AbstractC9567s.f28775a;
            synchronized (obj2) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i11 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            AbstractC6977c abstractC6977cMo7337j = abstractC6977c.mo7337j(i10, obj);
            if (abstractC6977cMo7337j.equals(abstractC6977c)) {
                return;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                synchronized (obj2) {
                    try {
                        int i12 = c9565q4.f28772d;
                        if (i12 == i11) {
                            c9565q4.f28771c = abstractC6977cMo7337j;
                            z6 = true;
                            c9565q4.f28773e++;
                            c9565q4.f28772d = i12 + 1;
                        } else {
                            z6 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        AbstractC6977c abstractC6977c;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        do {
            Object obj2 = AbstractC9567s.f28775a;
            synchronized (obj2) {
                C9565q c9565q = this.f28774Y;
                AbstractC16544l.m18092e(c9565q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C9565q c9565q2 = (C9565q) AbstractC9562n.m10085i(c9565q);
                i10 = c9565q2.f28772d;
                abstractC6977c = c9565q2.f28771c;
            }
            AbstractC16544l.m18091d(abstractC6977c);
            int iIndexOf = abstractC6977c.indexOf(obj);
            AbstractC6977c abstractC6977cMo7342s = iIndexOf != -1 ? abstractC6977c.mo7342s(iIndexOf) : abstractC6977c;
            z6 = false;
            if (AbstractC16544l.m18089b(abstractC6977cMo7342s, abstractC6977c)) {
                return false;
            }
            C9565q c9565q3 = this.f28774Y;
            AbstractC16544l.m18092e(c9565q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC9562n.f28759b) {
                try {
                    abstractC9556hM10087k = AbstractC9562n.m10087k();
                    C9565q c9565q4 = (C9565q) AbstractC9562n.m10100x(c9565q3, this, abstractC9556hM10087k);
                    synchronized (obj2) {
                        try {
                            int i11 = c9565q4.f28772d;
                            if (i11 == i10) {
                                c9565q4.f28771c = abstractC6977cMo7342s;
                                c9565q4.f28773e++;
                                c9565q4.f28772d = i11 + 1;
                                z6 = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return true;
    }
}
