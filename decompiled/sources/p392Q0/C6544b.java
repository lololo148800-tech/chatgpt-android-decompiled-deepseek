package p392Q0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1725c;
import p571X9.AbstractC9294h0;

/* JADX INFO: renamed from: Q0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6544b implements List, InterfaceC1725c {

    /* JADX INFO: renamed from: Y */
    public final Object f21177Y;

    /* JADX INFO: renamed from: Z */
    public final int f21178Z;

    /* JADX INFO: renamed from: o0 */
    public int f21179o0;

    public C6544b(List list, int i10, int i11) {
        this.f21177Y = list;
        this.f21178Z = i10;
        this.f21179o0 = i11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f21179o0;
        this.f21179o0 = i10 + 1;
        this.f21177Y.add(i10, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f21177Y.addAll(i10 + this.f21178Z, collection);
        this.f21179o0 = collection.size() + this.f21179o0;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f21179o0 - 1;
        int i11 = this.f21178Z;
        if (i11 <= i10) {
            while (true) {
                this.f21177Y.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f21179o0 = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f21179o0;
        for (int i11 = this.f21178Z; i11 < i10; i11++) {
            if (AbstractC16544l.m18089b(this.f21177Y.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9294h0.m9872a(i10, this);
        return this.f21177Y.get(i10 + this.f21178Z);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f21179o0;
        int i11 = this.f21178Z;
        for (int i12 = i11; i12 < i10; i12++) {
            if (AbstractC16544l.m18089b(this.f21177Y.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21179o0 == this.f21178Z;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6545c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f21179o0 - 1;
        int i11 = this.f21178Z;
        if (i11 > i10) {
            return -1;
        }
        while (!AbstractC16544l.m18089b(this.f21177Y.get(i10), obj)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C6545c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f21179o0;
        for (int i11 = this.f21178Z; i11 < i10; i11++) {
            ?? r6 = this.f21177Y;
            if (AbstractC16544l.m18089b(r6.get(i11), obj)) {
                r6.remove(i11);
                this.f21179o0--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f21179o0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f21179o0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f21179o0;
        int i11 = i10 - 1;
        int i12 = this.f21178Z;
        if (i12 <= i11) {
            while (true) {
                ?? r6 = this.f21177Y;
                if (!collection.contains(r6.get(i11))) {
                    r6.remove(i11);
                    this.f21179o0--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return i10 != this.f21179o0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC9294h0.m9872a(i10, this);
        return this.f21177Y.set(i10 + this.f21178Z, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21179o0 - this.f21178Z;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        AbstractC9294h0.m9873b(this, i10, i11);
        return new C6544b(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f21177Y.add(i10 + this.f21178Z, obj);
        this.f21179o0++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C6545c(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC16543k.m18087b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f21177Y.addAll(this.f21179o0, collection);
        this.f21179o0 = collection.size() + this.f21179o0;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i10) {
        AbstractC9294h0.m9872a(i10, this);
        Object objRemove = this.f21177Y.remove(i10 + this.f21178Z);
        this.f21179o0--;
        return objRemove;
    }
}
