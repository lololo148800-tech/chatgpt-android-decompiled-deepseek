package p725eb;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p523V9.AbstractC8020X;

/* JADX INFO: renamed from: eb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13357b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: Y */
    public final int[] f42396Y;

    /* JADX INFO: renamed from: Z */
    public final int f42397Z;

    /* JADX INFO: renamed from: o0 */
    public final int f42398o0;

    public C13357b(int i10, int i11, int[] iArr) {
        this.f42396Y = iArr;
        this.f42397Z = i10;
        this.f42398o0 = i11;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f42397Z;
            while (i10 < this.f42398o0) {
                if (this.f42396Y[i10] != iIntValue) {
                    i10++;
                } else if (i10 != -1) {
                    return true;
                }
            }
            i10 = -1;
            if (i10 != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13357b)) {
            return super.equals(obj);
        }
        C13357b c13357b = (C13357b) obj;
        int size = size();
        if (c13357b.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f42396Y[this.f42397Z + i10] != c13357b.f42396Y[c13357b.f42397Z + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        AbstractC8020X.m8353c(i10, size());
        return Integer.valueOf(this.f42396Y[this.f42397Z + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f42397Z; i11 < this.f42398o0; i11++) {
            i10 = (i10 * 31) + this.f42396Y[i11];
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f42397Z;
            int i11 = i10;
            while (i11 < this.f42398o0) {
                if (this.f42396Y[i11] != iIntValue) {
                    i11++;
                } else if (i11 >= 0) {
                    return i11 - i10;
                }
            }
            i11 = -1;
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f42398o0;
            do {
                i11--;
                i10 = this.f42397Z;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
            } while (this.f42396Y[i11] != iIntValue);
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        AbstractC8020X.m8353c(i10, size());
        int i11 = this.f42397Z + i10;
        int[] iArr = this.f42396Y;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42398o0 - this.f42397Z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        AbstractC8020X.m8355e(i10, i11, size());
        if (i10 == i11) {
            return Collections.emptyList();
        }
        int i12 = this.f42397Z;
        return new C13357b(i10 + i12, i12 + i11, this.f42396Y);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f42396Y;
        int i10 = this.f42397Z;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f42398o0) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }
}
