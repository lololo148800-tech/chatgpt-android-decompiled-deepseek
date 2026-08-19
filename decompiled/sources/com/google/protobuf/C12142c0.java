package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12142c0 extends AbstractC12141c implements InterfaceC12160i0, RandomAccess, InterfaceC12126V0 {

    /* JADX INFO: renamed from: p0 */
    public static final C12142c0 f37022p0;

    /* JADX INFO: renamed from: Z */
    public int[] f37023Z;

    /* JADX INFO: renamed from: o0 */
    public int f37024o0;

    static {
        C12142c0 c12142c0 = new C12142c0(new int[0], 0);
        f37022p0 = c12142c0;
        c12142c0.f37021Y = false;
    }

    public C12142c0() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m13936f();
        if (i10 < 0 || i10 > (i11 = this.f37024o0)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37024o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        int[] iArr = this.f37023Z;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f37023Z, i10, iArr2, i10 + 1, this.f37024o0 - i10);
            this.f37023Z = iArr2;
        }
        this.f37023Z[i10] = iIntValue;
        this.f37024o0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m13936f();
        Charset charset = AbstractC12175n0.f37050a;
        collection.getClass();
        if (!(collection instanceof C12142c0)) {
            return super.addAll(collection);
        }
        C12142c0 c12142c0 = (C12142c0) collection;
        int i10 = c12142c0.f37024o0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37024o0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f37023Z;
        if (i12 > iArr.length) {
            this.f37023Z = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c12142c0.f37023Z, 0, this.f37023Z, this.f37024o0, c12142c0.f37024o0);
        this.f37024o0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.InterfaceC12172m0
    /* JADX INFO: renamed from: b */
    public final InterfaceC12172m0 mo13855b(int i10) {
        if (i10 >= this.f37024o0) {
            return new C12142c0(Arrays.copyOf(this.f37023Z, i10), this.f37024o0);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12142c0)) {
            return super.equals(obj);
        }
        C12142c0 c12142c0 = (C12142c0) obj;
        if (this.f37024o0 != c12142c0.f37024o0) {
            return false;
        }
        int[] iArr = c12142c0.f37023Z;
        for (int i10 = 0; i10 < this.f37024o0; i10++) {
            if (this.f37023Z[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(m13940p(i10));
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f37024o0; i11++) {
            i10 = (i10 * 31) + this.f37023Z[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f37024o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f37023Z[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m13938j(int i10) {
        m13936f();
        int i11 = this.f37024o0;
        int[] iArr = this.f37023Z;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f37023Z = iArr2;
        }
        int[] iArr3 = this.f37023Z;
        int i12 = this.f37024o0;
        this.f37024o0 = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: m */
    public final void m13939m(int i10) {
        if (i10 < 0 || i10 >= this.f37024o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37024o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m13940p(int i10) {
        m13939m(i10);
        return this.f37023Z[i10];
    }

    /* JADX INFO: renamed from: q */
    public final int m13941q(int i10, int i11) {
        m13936f();
        m13939m(i10);
        int[] iArr = this.f37023Z;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13936f();
        m13939m(i10);
        int[] iArr = this.f37023Z;
        int i11 = iArr[i10];
        int i12 = this.f37024o0;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f37024o0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m13936f();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f37023Z;
        System.arraycopy(iArr, i11, iArr, i10, this.f37024o0 - i11);
        this.f37024o0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Integer.valueOf(m13941q(i10, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37024o0;
    }

    public C12142c0(int[] iArr, int i10) {
        this.f37023Z = iArr;
        this.f37024o0 = i10;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13938j(((Integer) obj).intValue());
        return true;
    }
}
