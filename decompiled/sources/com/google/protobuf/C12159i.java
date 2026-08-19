package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C12159i extends AbstractC12141c implements InterfaceC12145d0, RandomAccess, InterfaceC12126V0 {

    /* JADX INFO: renamed from: p0 */
    public static final C12159i f37032p0;

    /* JADX INFO: renamed from: Z */
    public boolean[] f37033Z;

    /* JADX INFO: renamed from: o0 */
    public int f37034o0;

    static {
        C12159i c12159i = new C12159i(new boolean[0], 0);
        f37032p0 = c12159i;
        c12159i.f37021Y = false;
    }

    public C12159i(boolean[] zArr, int i10) {
        this.f37033Z = zArr;
        this.f37034o0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m13936f();
        if (i10 < 0 || i10 > (i11 = this.f37034o0)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37034o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        boolean[] zArr = this.f37033Z;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f37033Z, i10, zArr2, i10 + 1, this.f37034o0 - i10);
            this.f37033Z = zArr2;
        }
        this.f37033Z[i10] = zBooleanValue;
        this.f37034o0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m13936f();
        Charset charset = AbstractC12175n0.f37050a;
        collection.getClass();
        if (!(collection instanceof C12159i)) {
            return super.addAll(collection);
        }
        C12159i c12159i = (C12159i) collection;
        int i10 = c12159i.f37034o0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37034o0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f37033Z;
        if (i12 > zArr.length) {
            this.f37033Z = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c12159i.f37033Z, 0, this.f37033Z, this.f37034o0, c12159i.f37034o0);
        this.f37034o0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.InterfaceC12172m0
    /* JADX INFO: renamed from: b */
    public final InterfaceC12172m0 mo13855b(int i10) {
        if (i10 >= this.f37034o0) {
            return new C12159i(Arrays.copyOf(this.f37033Z, i10), this.f37034o0);
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
        if (!(obj instanceof C12159i)) {
            return super.equals(obj);
        }
        C12159i c12159i = (C12159i) obj;
        if (this.f37034o0 != c12159i.f37034o0) {
            return false;
        }
        boolean[] zArr = c12159i.f37033Z;
        for (int i10 = 0; i10 < this.f37034o0; i10++) {
            if (this.f37033Z[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m13997m(i10);
        return Boolean.valueOf(this.f37033Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f37034o0; i11++) {
            int i12 = i10 * 31;
            boolean z6 = this.f37033Z[i11];
            Charset charset = AbstractC12175n0.f37050a;
            i10 = i12 + (z6 ? 1231 : 1237);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f37034o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f37033Z[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m13996j(boolean z6) {
        m13936f();
        int i10 = this.f37034o0;
        boolean[] zArr = this.f37033Z;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f37033Z = zArr2;
        }
        boolean[] zArr3 = this.f37033Z;
        int i11 = this.f37034o0;
        this.f37034o0 = i11 + 1;
        zArr3[i11] = z6;
    }

    /* JADX INFO: renamed from: m */
    public final void m13997m(int i10) {
        if (i10 < 0 || i10 >= this.f37034o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37034o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13936f();
        m13997m(i10);
        boolean[] zArr = this.f37033Z;
        boolean z6 = zArr[i10];
        int i11 = this.f37034o0;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f37034o0--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m13936f();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f37033Z;
        System.arraycopy(zArr, i11, zArr, i10, this.f37034o0 - i11);
        this.f37034o0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m13936f();
        m13997m(i10);
        boolean[] zArr = this.f37033Z;
        boolean z6 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37034o0;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13996j(((Boolean) obj).booleanValue());
        return true;
    }
}
