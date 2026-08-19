package om;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9381v3;
import p571X9.AbstractC9393x3;
import p586Y0.C9572x;
import p594Y9.AbstractC9734G4;
import p909nm.AbstractC17673g;
import p909nm.AbstractC17678l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: om.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18234a extends AbstractC17673g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: Y */
    public Object[] f58097Y;

    /* JADX INFO: renamed from: Z */
    public final int f58098Z;

    /* JADX INFO: renamed from: o0 */
    public int f58099o0;

    /* JADX INFO: renamed from: p0 */
    public final C18234a f58100p0;

    /* JADX INFO: renamed from: q0 */
    public final C18235b f58101q0;

    public C18234a(Object[] backing, int i10, int i11, C18234a c18234a, C18235b root) {
        AbstractC16544l.m18094g(backing, "backing");
        AbstractC16544l.m18094g(root, "root");
        this.f58097Y = backing;
        this.f58098Z = i10;
        this.f58099o0 = i11;
        this.f58100p0 = c18234a;
        this.f58101q0 = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m19741s();
        m19740r();
        m19739q(this.f58098Z + this.f58099o0, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19741s();
        m19740r();
        int size = elements.size();
        m19738p(this.f58098Z + this.f58099o0, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m19741s();
        m19740r();
        m19743u(this.f58098Z, this.f58099o0);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m19740r();
        if (obj != this) {
            if (obj instanceof List) {
                if (AbstractC9734G4.m10322a(this.f58097Y, this.f58098Z, this.f58099o0, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: f */
    public final int mo7371f() {
        m19740r();
        return this.f58099o0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m19740r();
        int i11 = this.f58099o0;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        return this.f58097Y[this.f58098Z + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m19740r();
        Object[] objArr = this.f58097Y;
        int i10 = this.f58099o0;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f58098Z + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m19740r();
        for (int i10 = 0; i10 < this.f58099o0; i10++) {
            if (AbstractC16544l.m18089b(this.f58097Y[this.f58098Z + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m19740r();
        return this.f58099o0 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: j */
    public final Object mo7372j(int i10) {
        m19741s();
        m19740r();
        int i11 = this.f58099o0;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        return m19742t(this.f58098Z + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m19740r();
        for (int i10 = this.f58099o0 - 1; i10 >= 0; i10--) {
            if (AbstractC16544l.m18089b(this.f58097Y[this.f58098Z + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: p */
    public final void m19738p(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        C18235b c18235b = this.f58101q0;
        C18234a c18234a = this.f58100p0;
        if (c18234a != null) {
            c18234a.m19738p(i10, collection, i11);
        } else {
            C18235b c18235b2 = C18235b.f58102p0;
            c18235b.m19746p(i10, collection, i11);
        }
        this.f58097Y = c18235b.f58103Y;
        this.f58099o0 += i11;
    }

    /* JADX INFO: renamed from: q */
    public final void m19739q(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        C18235b c18235b = this.f58101q0;
        C18234a c18234a = this.f58100p0;
        if (c18234a != null) {
            c18234a.m19739q(i10, obj);
        } else {
            C18235b c18235b2 = C18235b.f58102p0;
            c18235b.m19747q(i10, obj);
        }
        this.f58097Y = c18235b.f58103Y;
        this.f58099o0++;
    }

    /* JADX INFO: renamed from: r */
    public final void m19740r() {
        if (((AbstractList) this.f58101q0).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m19741s();
        m19740r();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo7372j(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19741s();
        m19740r();
        return m19744v(this.f58098Z, this.f58099o0, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19741s();
        m19740r();
        return m19744v(this.f58098Z, this.f58099o0, elements, true) > 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m19741s() {
        if (this.f58101q0.f58105o0) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m19741s();
        m19740r();
        int i11 = this.f58099o0;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f58097Y;
        int i12 = this.f58098Z;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        AbstractC9381v3.m9954b(i10, i11, this.f58099o0);
        return new C18234a(this.f58097Y, this.f58098Z + i10, i11 - i10, this, this.f58101q0);
    }

    /* JADX INFO: renamed from: t */
    public final Object m19742t(int i10) {
        Object objM19750t;
        ((AbstractList) this).modCount++;
        C18234a c18234a = this.f58100p0;
        if (c18234a != null) {
            objM19750t = c18234a.m19742t(i10);
        } else {
            C18235b c18235b = C18235b.f58102p0;
            objM19750t = this.f58101q0.m19750t(i10);
        }
        this.f58099o0--;
        return objM19750t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        m19740r();
        int length = array.length;
        int i10 = this.f58099o0;
        int i11 = this.f58098Z;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f58097Y, i11, i10 + i11, array.getClass());
            AbstractC16544l.m18093f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC17678l.m19304k(0, i11, i10 + i11, this.f58097Y, array);
        AbstractC9393x3.m9975e(this.f58099o0, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m19740r();
        return AbstractC9734G4.m10323b(this.f58097Y, this.f58098Z, this.f58099o0, this);
    }

    /* JADX INFO: renamed from: u */
    public final void m19743u(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        C18234a c18234a = this.f58100p0;
        if (c18234a != null) {
            c18234a.m19743u(i10, i11);
        } else {
            C18235b c18235b = C18235b.f58102p0;
            this.f58101q0.m19751u(i10, i11);
        }
        this.f58099o0 -= i11;
    }

    /* JADX INFO: renamed from: v */
    public final int m19744v(int i10, int i11, Collection collection, boolean z6) {
        int iM19752v;
        C18234a c18234a = this.f58100p0;
        if (c18234a != null) {
            iM19752v = c18234a.m19744v(i10, i11, collection, z6);
        } else {
            C18235b c18235b = C18235b.f58102p0;
            iM19752v = this.f58101q0.m19752v(i10, i11, collection, z6);
        }
        if (iM19752v > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f58099o0 -= iM19752v;
        return iM19752v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        m19740r();
        int i11 = this.f58099o0;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        return new C9572x(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m19741s();
        m19740r();
        int i11 = this.f58099o0;
        if (i10 >= 0 && i10 <= i11) {
            m19739q(this.f58098Z + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19741s();
        m19740r();
        int i11 = this.f58099o0;
        if (i10 >= 0 && i10 <= i11) {
            int size = elements.size();
            m19738p(this.f58098Z + i10, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m19740r();
        Object[] objArr = this.f58097Y;
        int i10 = this.f58099o0;
        int i11 = this.f58098Z;
        return AbstractC17678l.m19310q(objArr, i11, i10 + i11);
    }
}
