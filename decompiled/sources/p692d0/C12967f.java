package p692d0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1724b;
import p076Cm.InterfaceC1728f;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: d0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12967f implements Collection, Set, InterfaceC1724b, InterfaceC1728f {

    /* JADX INFO: renamed from: Y */
    public int[] f41175Y = AbstractC13253a.f41865a;

    /* JADX INFO: renamed from: Z */
    public Object[] f41176Z = AbstractC13253a.f41867c;

    /* JADX INFO: renamed from: o0 */
    public int f41177o0;

    public C12967f(int i10) {
        if (i10 > 0) {
            AbstractC12978q.m14673b(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iM14674c;
        int i11 = this.f41177o0;
        if (obj == null) {
            iM14674c = AbstractC12978q.m14674c(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iM14674c = AbstractC12978q.m14674c(this, obj, iHashCode);
        }
        if (iM14674c >= 0) {
            return false;
        }
        int i12 = ~iM14674c;
        int[] iArr = this.f41175Y;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f41176Z;
            AbstractC12978q.m14673b(this, i13);
            if (i11 != this.f41177o0) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f41175Y;
            if (iArr2.length != 0) {
                AbstractC17678l.m19307n(0, iArr.length, 6, iArr, iArr2);
                AbstractC17678l.m19308o(0, objArr.length, 6, objArr, this.f41176Z);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f41175Y;
            int i14 = i12 + 1;
            AbstractC17678l.m19303j(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f41176Z;
            AbstractC17678l.m19304k(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f41177o0;
        if (i11 == i15) {
            int[] iArr4 = this.f41175Y;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f41176Z[i12] = obj;
                this.f41177o0 = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        int size = elements.size() + this.f41177o0;
        int i10 = this.f41177o0;
        int[] iArr = this.f41175Y;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f41176Z;
            AbstractC12978q.m14673b(this, size);
            int i11 = this.f41177o0;
            if (i11 > 0) {
                AbstractC17678l.m19307n(0, i11, 6, iArr, this.f41175Y);
                AbstractC17678l.m19308o(0, this.f41177o0, 6, objArr, this.f41176Z);
            }
        }
        if (this.f41177o0 != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f41177o0 != 0) {
            this.f41175Y = AbstractC13253a.f41865a;
            this.f41176Z = AbstractC13253a.f41867c;
            this.f41177o0 = 0;
        }
        if (this.f41177o0 != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC12978q.m14674c(this, null, 0) : AbstractC12978q.m14674c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f41177o0 == ((Set) obj).size()) {
            try {
                int i10 = this.f41177o0;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) obj).contains(this.f41176Z[i11])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m14659f(int i10) {
        int i11 = this.f41177o0;
        Object[] objArr = this.f41176Z;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f41175Y;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    AbstractC17678l.m19303j(i10, i13, i11, iArr, iArr);
                    Object[] objArr2 = this.f41176Z;
                    AbstractC17678l.m19304k(i10, i13, i11, objArr2, objArr2);
                }
                this.f41176Z[i12] = null;
            } else {
                AbstractC12978q.m14673b(this, i11 > 8 ? i11 + (i11 >> 1) : 8);
                if (i10 > 0) {
                    AbstractC17678l.m19307n(0, i10, 6, iArr, this.f41175Y);
                    AbstractC17678l.m19308o(0, i10, 6, objArr, this.f41176Z);
                }
                if (i10 < i12) {
                    int i14 = i10 + 1;
                    AbstractC17678l.m19303j(i10, i14, i11, iArr, this.f41175Y);
                    AbstractC17678l.m19304k(i10, i14, i11, objArr, this.f41176Z);
                }
            }
            if (i11 != this.f41177o0) {
                throw new ConcurrentModificationException();
            }
            this.f41177o0 = i12;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f41175Y;
        int i10 = this.f41177o0;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f41177o0 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C12962a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM14674c = obj == null ? AbstractC12978q.m14674c(this, null, 0) : AbstractC12978q.m14674c(this, obj, obj.hashCode());
        if (iM14674c < 0) {
            return false;
        }
        m14659f(iM14674c);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        boolean z6 = false;
        for (int i10 = this.f41177o0 - 1; -1 < i10; i10--) {
            if (!AbstractC17680n.m19333J(elements, this.f41176Z[i10])) {
                m14659f(i10);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f41177o0;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC17678l.m19310q(this.f41176Z, 0, this.f41177o0);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f41177o0 * 14);
        sb2.append('{');
        int i10 = this.f41177o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f41176Z[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        int i10 = this.f41177o0;
        if (array.length < i10) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i10);
        } else if (array.length > i10) {
            array[i10] = null;
        }
        AbstractC17678l.m19304k(0, 0, this.f41177o0, this.f41176Z, array);
        return array;
    }
}
