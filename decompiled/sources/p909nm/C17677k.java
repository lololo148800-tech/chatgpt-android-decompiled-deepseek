package p909nm;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9381v3;
import p571X9.AbstractC9393x3;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: nm.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C17677k extends AbstractC17673g {

    /* JADX INFO: renamed from: p0 */
    public static final Object[] f56473p0 = new Object[0];

    /* JADX INFO: renamed from: Y */
    public int f56474Y;

    /* JADX INFO: renamed from: Z */
    public Object[] f56475Z;

    /* JADX INFO: renamed from: o0 */
    public int f56476o0;

    public C17677k(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f56473p0;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Illegal Capacity: "));
            }
            objArr = new Object[i10];
        }
        this.f56475Z = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f56476o0;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        m19277w();
        m19270p(this.f56476o0 + 1);
        int iM19276v = m19276v(this.f56474Y + i10);
        int i12 = this.f56476o0;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iM19276v == 0) {
                Object[] objArr = this.f56475Z;
                AbstractC16544l.m18094g(objArr, "<this>");
                iM19276v = objArr.length;
            }
            int i13 = iM19276v - 1;
            int i14 = this.f56474Y;
            if (i14 == 0) {
                Object[] objArr2 = this.f56475Z;
                AbstractC16544l.m18094g(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f56474Y;
            if (i13 >= i15) {
                Object[] objArr3 = this.f56475Z;
                objArr3[length] = objArr3[i15];
                AbstractC17678l.m19304k(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f56475Z;
                AbstractC17678l.m19304k(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f56475Z;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC17678l.m19304k(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f56475Z[i13] = obj;
            this.f56474Y = length;
        } else {
            int iM19276v2 = m19276v(i12 + this.f56474Y);
            if (iM19276v < iM19276v2) {
                Object[] objArr6 = this.f56475Z;
                AbstractC17678l.m19304k(iM19276v + 1, iM19276v, iM19276v2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f56475Z;
                AbstractC17678l.m19304k(1, 0, iM19276v2, objArr7, objArr7);
                Object[] objArr8 = this.f56475Z;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC17678l.m19304k(iM19276v + 1, iM19276v, objArr8.length - 1, objArr8, objArr8);
            }
            this.f56475Z[iM19276v] = obj;
        }
        this.f56476o0++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        int i11 = this.f56476o0;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f56476o0) {
            return addAll(elements);
        }
        m19277w();
        m19270p(elements.size() + this.f56476o0);
        int iM19276v = m19276v(this.f56476o0 + this.f56474Y);
        int iM19276v2 = m19276v(this.f56474Y + i10);
        int size = elements.size();
        if (i10 < ((this.f56476o0 + 1) >> 1)) {
            int i12 = this.f56474Y;
            int length = i12 - size;
            if (iM19276v2 < i12) {
                Object[] objArr = this.f56475Z;
                AbstractC17678l.m19304k(length, i12, objArr.length, objArr, objArr);
                if (size >= iM19276v2) {
                    Object[] objArr2 = this.f56475Z;
                    AbstractC17678l.m19304k(objArr2.length - size, 0, iM19276v2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f56475Z;
                    AbstractC17678l.m19304k(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f56475Z;
                    AbstractC17678l.m19304k(0, size, iM19276v2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f56475Z;
                AbstractC17678l.m19304k(length, i12, iM19276v2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f56475Z;
                length += objArr6.length;
                int i13 = iM19276v2 - i12;
                int length2 = objArr6.length - length;
                if (length2 >= i13) {
                    AbstractC17678l.m19304k(length, i12, iM19276v2, objArr6, objArr6);
                } else {
                    AbstractC17678l.m19304k(length, i12, i12 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f56475Z;
                    AbstractC17678l.m19304k(0, this.f56474Y + length2, iM19276v2, objArr7, objArr7);
                }
            }
            this.f56474Y = length;
            m19269m(m19274t(iM19276v2 - size), elements);
        } else {
            int i14 = iM19276v2 + size;
            if (iM19276v2 < iM19276v) {
                int i15 = size + iM19276v;
                Object[] objArr8 = this.f56475Z;
                if (i15 <= objArr8.length) {
                    AbstractC17678l.m19304k(i14, iM19276v2, iM19276v, objArr8, objArr8);
                } else if (i14 >= objArr8.length) {
                    AbstractC17678l.m19304k(i14 - objArr8.length, iM19276v2, iM19276v, objArr8, objArr8);
                } else {
                    int length3 = iM19276v - (i15 - objArr8.length);
                    AbstractC17678l.m19304k(0, length3, iM19276v, objArr8, objArr8);
                    Object[] objArr9 = this.f56475Z;
                    AbstractC17678l.m19304k(i14, iM19276v2, length3, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f56475Z;
                AbstractC17678l.m19304k(size, 0, iM19276v, objArr10, objArr10);
                Object[] objArr11 = this.f56475Z;
                if (i14 >= objArr11.length) {
                    AbstractC17678l.m19304k(i14 - objArr11.length, iM19276v2, objArr11.length, objArr11, objArr11);
                } else {
                    AbstractC17678l.m19304k(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f56475Z;
                    AbstractC17678l.m19304k(i14, iM19276v2, objArr12.length - size, objArr12, objArr12);
                }
            }
            m19269m(iM19276v2, elements);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        m19277w();
        m19270p(this.f56476o0 + 1);
        int length = this.f56474Y;
        if (length == 0) {
            Object[] objArr = this.f56475Z;
            AbstractC16544l.m18094g(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f56474Y = i10;
        this.f56475Z[i10] = obj;
        this.f56476o0++;
    }

    public final void addLast(Object obj) {
        m19277w();
        m19270p(mo7371f() + 1);
        this.f56475Z[m19276v(mo7371f() + this.f56474Y)] = obj;
        this.f56476o0 = mo7371f() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m19277w();
            m19275u(this.f56474Y, m19276v(mo7371f() + this.f56474Y));
        }
        this.f56474Y = 0;
        this.f56476o0 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: f */
    public final int mo7371f() {
        return this.f56476o0;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f56475Z[this.f56474Y];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iMo7371f = mo7371f();
        if (i10 < 0 || i10 >= iMo7371f) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, iMo7371f, ", size: "));
        }
        return this.f56475Z[m19276v(this.f56474Y + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iM19276v = m19276v(mo7371f() + this.f56474Y);
        int length = this.f56474Y;
        if (length < iM19276v) {
            while (length < iM19276v) {
                if (AbstractC16544l.m18089b(obj, this.f56475Z[length])) {
                    i10 = this.f56474Y;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM19276v) {
            return -1;
        }
        int length2 = this.f56475Z.length;
        while (length < length2) {
            if (AbstractC16544l.m18089b(obj, this.f56475Z[length])) {
                i10 = this.f56474Y;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iM19276v; i11++) {
            if (AbstractC16544l.m18089b(obj, this.f56475Z[i11])) {
                length = i11 + this.f56475Z.length;
                i10 = this.f56474Y;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo7371f() == 0;
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: j */
    public final Object mo7372j(int i10) {
        int i11 = this.f56476o0;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        if (i10 == AbstractC17681o.m19381j(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        m19277w();
        int iM19276v = m19276v(this.f56474Y + i10);
        Object[] objArr = this.f56475Z;
        Object obj = objArr[iM19276v];
        if (i10 < (this.f56476o0 >> 1)) {
            int i12 = this.f56474Y;
            if (iM19276v >= i12) {
                AbstractC17678l.m19304k(i12 + 1, i12, iM19276v, objArr, objArr);
            } else {
                AbstractC17678l.m19304k(1, 0, iM19276v, objArr, objArr);
                Object[] objArr2 = this.f56475Z;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f56474Y;
                AbstractC17678l.m19304k(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f56475Z;
            int i14 = this.f56474Y;
            objArr3[i14] = null;
            this.f56474Y = m19272r(i14);
        } else {
            int iM19276v2 = m19276v(AbstractC17681o.m19381j(this) + this.f56474Y);
            if (iM19276v <= iM19276v2) {
                Object[] objArr4 = this.f56475Z;
                AbstractC17678l.m19304k(iM19276v, iM19276v + 1, iM19276v2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f56475Z;
                AbstractC17678l.m19304k(iM19276v, iM19276v + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f56475Z;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC17678l.m19304k(0, 1, iM19276v2 + 1, objArr6, objArr6);
            }
            this.f56475Z[iM19276v2] = null;
        }
        this.f56476o0--;
        return obj;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f56475Z[m19276v(AbstractC17681o.m19381j(this) + this.f56474Y)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iM19276v = m19276v(this.f56476o0 + this.f56474Y);
        int i11 = this.f56474Y;
        if (i11 < iM19276v) {
            length = iM19276v - 1;
            if (i11 <= length) {
                while (!AbstractC16544l.m18089b(obj, this.f56475Z[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f56474Y;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iM19276v) {
            for (int i12 = iM19276v - 1; -1 < i12; i12--) {
                if (AbstractC16544l.m18089b(obj, this.f56475Z[i12])) {
                    length = i12 + this.f56475Z.length;
                    i10 = this.f56474Y;
                    return length - i10;
                }
            }
            Object[] objArr = this.f56475Z;
            AbstractC16544l.m18094g(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f56474Y;
            if (i13 <= length) {
                while (!AbstractC16544l.m18089b(obj, this.f56475Z[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i10 = this.f56474Y;
                return length - i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m19269m(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f56475Z.length;
        while (i10 < length && it.hasNext()) {
            this.f56475Z[i10] = it.next();
            i10++;
        }
        int i11 = this.f56474Y;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f56475Z[i12] = it.next();
        }
        this.f56476o0 = collection.size() + mo7371f();
    }

    /* JADX INFO: renamed from: p */
    public final void m19270p(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f56475Z;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f56473p0) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f56475Z = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        AbstractC17678l.m19304k(0, this.f56474Y, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f56475Z;
        int length2 = objArr3.length;
        int i12 = this.f56474Y;
        AbstractC17678l.m19304k(length2 - i12, 0, i12, objArr3, objArr2);
        this.f56474Y = 0;
        this.f56475Z = objArr2;
    }

    /* JADX INFO: renamed from: q */
    public final Object m19271q() {
        if (isEmpty()) {
            return null;
        }
        return this.f56475Z[this.f56474Y];
    }

    /* JADX INFO: renamed from: r */
    public final int m19272r(int i10) {
        Object[] objArr = this.f56475Z;
        AbstractC16544l.m18094g(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo7372j(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iM19276v;
        AbstractC16544l.m18094g(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f56475Z.length != 0) {
            int iM19276v2 = m19276v(this.f56476o0 + this.f56474Y);
            int i10 = this.f56474Y;
            if (i10 < iM19276v2) {
                iM19276v = i10;
                while (i10 < iM19276v2) {
                    Object obj = this.f56475Z[i10];
                    if (elements.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f56475Z[iM19276v] = obj;
                        iM19276v++;
                    }
                    i10++;
                }
                AbstractC17678l.m19311r(this.f56475Z, null, iM19276v, iM19276v2);
            } else {
                int length = this.f56475Z.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f56475Z;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f56475Z[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iM19276v = m19276v(i11);
                for (int i12 = 0; i12 < iM19276v2; i12++) {
                    Object[] objArr2 = this.f56475Z;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f56475Z[iM19276v] = obj3;
                        iM19276v = m19272r(iM19276v);
                    }
                }
                z6 = z10;
            }
            if (z6) {
                m19277w();
                this.f56476o0 = m19274t(iM19276v - this.f56474Y);
            }
        }
        return z6;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m19277w();
        Object[] objArr = this.f56475Z;
        int i10 = this.f56474Y;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f56474Y = m19272r(i10);
        this.f56476o0 = mo7371f() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m19277w();
        int iM19276v = m19276v(AbstractC17681o.m19381j(this) + this.f56474Y);
        Object[] objArr = this.f56475Z;
        Object obj = objArr[iM19276v];
        objArr[iM19276v] = null;
        this.f56476o0 = mo7371f() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        AbstractC9381v3.m9954b(i10, i11, this.f56476o0);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f56476o0) {
            clear();
            return;
        }
        if (i12 == 1) {
            mo7372j(i10);
            return;
        }
        m19277w();
        if (i10 < this.f56476o0 - i11) {
            int iM19276v = m19276v((i10 - 1) + this.f56474Y);
            int iM19276v2 = m19276v((i11 - 1) + this.f56474Y);
            while (i10 > 0) {
                int i13 = iM19276v + 1;
                int iMin = Math.min(i10, Math.min(i13, iM19276v2 + 1));
                Object[] objArr = this.f56475Z;
                int i14 = iM19276v2 - iMin;
                int i15 = iM19276v - iMin;
                AbstractC17678l.m19304k(i14 + 1, i15 + 1, i13, objArr, objArr);
                iM19276v = m19274t(i15);
                iM19276v2 = m19274t(i14);
                i10 -= iMin;
            }
            int iM19276v3 = m19276v(this.f56474Y + i12);
            m19275u(this.f56474Y, iM19276v3);
            this.f56474Y = iM19276v3;
        } else {
            int iM19276v4 = m19276v(this.f56474Y + i11);
            int iM19276v5 = m19276v(this.f56474Y + i10);
            int i16 = this.f56476o0;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f56475Z;
                i11 = Math.min(i16, Math.min(objArr2.length - iM19276v4, objArr2.length - iM19276v5));
                Object[] objArr3 = this.f56475Z;
                int i17 = iM19276v4 + i11;
                AbstractC17678l.m19304k(iM19276v5, iM19276v4, i17, objArr3, objArr3);
                iM19276v4 = m19276v(i17);
                iM19276v5 = m19276v(iM19276v5 + i11);
            }
            int iM19276v6 = m19276v(this.f56476o0 + this.f56474Y);
            m19275u(m19274t(iM19276v6 - i12), iM19276v6);
        }
        this.f56476o0 -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iM19276v;
        AbstractC16544l.m18094g(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f56475Z.length != 0) {
            int iM19276v2 = m19276v(this.f56476o0 + this.f56474Y);
            int i10 = this.f56474Y;
            if (i10 < iM19276v2) {
                iM19276v = i10;
                while (i10 < iM19276v2) {
                    Object obj = this.f56475Z[i10];
                    if (elements.contains(obj)) {
                        this.f56475Z[iM19276v] = obj;
                        iM19276v++;
                    } else {
                        z6 = true;
                    }
                    i10++;
                }
                AbstractC17678l.m19311r(this.f56475Z, null, iM19276v, iM19276v2);
            } else {
                int length = this.f56475Z.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f56475Z;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f56475Z[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iM19276v = m19276v(i11);
                for (int i12 = 0; i12 < iM19276v2; i12++) {
                    Object[] objArr2 = this.f56475Z;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f56475Z[iM19276v] = obj3;
                        iM19276v = m19272r(iM19276v);
                    } else {
                        z10 = true;
                    }
                }
                z6 = z10;
            }
            if (z6) {
                m19277w();
                this.f56476o0 = m19274t(iM19276v - this.f56474Y);
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: s */
    public final Object m19273s() {
        if (isEmpty()) {
            return null;
        }
        return this.f56475Z[m19276v(AbstractC17681o.m19381j(this) + this.f56474Y)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iMo7371f = mo7371f();
        if (i10 < 0 || i10 >= iMo7371f) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, iMo7371f, ", size: "));
        }
        int iM19276v = m19276v(this.f56474Y + i10);
        Object[] objArr = this.f56475Z;
        Object obj2 = objArr[iM19276v];
        objArr[iM19276v] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final int m19274t(int i10) {
        return i10 < 0 ? i10 + this.f56475Z.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo7371f()]);
    }

    /* JADX INFO: renamed from: u */
    public final void m19275u(int i10, int i11) {
        if (i10 < i11) {
            AbstractC17678l.m19311r(this.f56475Z, null, i10, i11);
            return;
        }
        Object[] objArr = this.f56475Z;
        Arrays.fill(objArr, i10, objArr.length, (Object) null);
        AbstractC17678l.m19311r(this.f56475Z, null, 0, i11);
    }

    /* JADX INFO: renamed from: v */
    public final int m19276v(int i10) {
        Object[] objArr = this.f56475Z;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    /* JADX INFO: renamed from: w */
    public final void m19277w() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        int length = array.length;
        int i10 = this.f56476o0;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iM19276v = m19276v(this.f56476o0 + this.f56474Y);
        int i11 = this.f56474Y;
        if (i11 < iM19276v) {
            AbstractC17678l.m19308o(i11, iM19276v, 2, this.f56475Z, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f56475Z;
            AbstractC17678l.m19304k(0, this.f56474Y, objArr.length, objArr, array);
            Object[] objArr2 = this.f56475Z;
            AbstractC17678l.m19304k(objArr2.length - this.f56474Y, 0, iM19276v, objArr2, array);
        }
        AbstractC9393x3.m9975e(this.f56476o0, array);
        return array;
    }

    public C17677k() {
        this.f56475Z = f56473p0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m19277w();
        m19270p(elements.size() + mo7371f());
        m19269m(m19276v(mo7371f() + this.f56474Y), elements);
        return true;
    }
}
