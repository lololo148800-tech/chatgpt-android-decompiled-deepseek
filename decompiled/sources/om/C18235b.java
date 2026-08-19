package om;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
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

/* JADX INFO: renamed from: om.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18235b extends AbstractC17673g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: p0 */
    public static final C18235b f58102p0;

    /* JADX INFO: renamed from: Y */
    public Object[] f58103Y;

    /* JADX INFO: renamed from: Z */
    public int f58104Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f58105o0;

    static {
        C18235b c18235b = new C18235b(0);
        c18235b.f58105o0 = true;
        f58102p0 = c18235b;
    }

    public C18235b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f58103Y = new Object[i10];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m19748r();
        int i10 = this.f58104Z;
        ((AbstractList) this).modCount++;
        m19749s(i10, 1);
        this.f58103Y[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19748r();
        int size = elements.size();
        m19746p(this.f58104Z, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m19748r();
        m19751u(0, this.f58104Z);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!AbstractC9734G4.m10322a(this.f58103Y, 0, this.f58104Z, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: f */
    public final int mo7371f() {
        return this.f58104Z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f58104Z;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        return this.f58103Y[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f58103Y;
        int i10 = this.f58104Z;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f58104Z; i10++) {
            if (AbstractC16544l.m18089b(this.f58103Y[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f58104Z == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: j */
    public final Object mo7372j(int i10) {
        m19748r();
        int i11 = this.f58104Z;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        return m19750t(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f58104Z - 1; i10 >= 0; i10--) {
            if (AbstractC16544l.m18089b(this.f58103Y[i10], obj)) {
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
    public final void m19746p(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        m19749s(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f58103Y[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m19747q(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        m19749s(i10, 1);
        this.f58103Y[i10] = obj;
    }

    /* JADX INFO: renamed from: r */
    public final void m19748r() {
        if (this.f58105o0) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m19748r();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo7372j(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19748r();
        return m19752v(0, this.f58104Z, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19748r();
        return m19752v(0, this.f58104Z, elements, true) > 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m19749s(int i10, int i11) {
        int i12 = this.f58104Z + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f58103Y;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            this.f58103Y = objArrCopyOf;
        }
        Object[] objArr2 = this.f58103Y;
        AbstractC17678l.m19304k(i10 + i11, i10, this.f58104Z, objArr2, objArr2);
        this.f58104Z += i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m19748r();
        int i11 = this.f58104Z;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f58103Y;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        AbstractC9381v3.m9954b(i10, i11, this.f58104Z);
        return new C18234a(this.f58103Y, i10, i11 - i10, null, this);
    }

    /* JADX INFO: renamed from: t */
    public final Object m19750t(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f58103Y;
        Object obj = objArr[i10];
        AbstractC17678l.m19304k(i10, i10 + 1, this.f58104Z, objArr, objArr);
        Object[] objArr2 = this.f58103Y;
        int i11 = this.f58104Z - 1;
        AbstractC16544l.m18094g(objArr2, "<this>");
        objArr2[i11] = null;
        this.f58104Z--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        int length = array.length;
        int i10 = this.f58104Z;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f58103Y, 0, i10, array.getClass());
            AbstractC16544l.m18093f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC17678l.m19304k(0, 0, i10, this.f58103Y, array);
        AbstractC9393x3.m9975e(this.f58104Z, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC9734G4.m10323b(this.f58103Y, 0, this.f58104Z, this);
    }

    /* JADX INFO: renamed from: u */
    public final void m19751u(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f58103Y;
        AbstractC17678l.m19304k(i10, i10 + i11, this.f58104Z, objArr, objArr);
        Object[] objArr2 = this.f58103Y;
        int i12 = this.f58104Z;
        AbstractC9734G4.m10324c(objArr2, i12 - i11, i12);
        this.f58104Z -= i11;
    }

    /* JADX INFO: renamed from: v */
    public final int m19752v(int i10, int i11, Collection collection, boolean z6) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f58103Y[i14]) == z6) {
                Object[] objArr = this.f58103Y;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f58103Y;
        AbstractC17678l.m19304k(i10 + i13, i11 + i10, this.f58104Z, objArr2, objArr2);
        Object[] objArr3 = this.f58103Y;
        int i16 = this.f58104Z;
        AbstractC9734G4.m10324c(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f58104Z -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f58104Z;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        return new C9572x(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        m19748r();
        int i11 = this.f58104Z;
        if (i10 >= 0 && i10 <= i11) {
            int size = elements.size();
            m19746p(i10, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC17678l.m19310q(this.f58103Y, 0, this.f58104Z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m19748r();
        int i11 = this.f58104Z;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            m19749s(i10, 1);
            this.f58103Y[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
    }
}
