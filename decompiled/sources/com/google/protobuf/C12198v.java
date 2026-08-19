package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C12198v extends AbstractC12141c implements InterfaceC12148e0, RandomAccess, InterfaceC12126V0 {

    /* JADX INFO: renamed from: p0 */
    public static final C12198v f37111p0;

    /* JADX INFO: renamed from: Z */
    public double[] f37112Z;

    /* JADX INFO: renamed from: o0 */
    public int f37113o0;

    static {
        C12198v c12198v = new C12198v(new double[0], 0);
        f37111p0 = c12198v;
        c12198v.f37021Y = false;
    }

    public C12198v(double[] dArr, int i10) {
        this.f37112Z = dArr;
        this.f37113o0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        m13936f();
        if (i10 < 0 || i10 > (i11 = this.f37113o0)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37113o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        double[] dArr = this.f37112Z;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f37112Z, i10, dArr2, i10 + 1, this.f37113o0 - i10);
            this.f37112Z = dArr2;
        }
        this.f37112Z[i10] = dDoubleValue;
        this.f37113o0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m13936f();
        Charset charset = AbstractC12175n0.f37050a;
        collection.getClass();
        if (!(collection instanceof C12198v)) {
            return super.addAll(collection);
        }
        C12198v c12198v = (C12198v) collection;
        int i10 = c12198v.f37113o0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37113o0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f37112Z;
        if (i12 > dArr.length) {
            this.f37112Z = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c12198v.f37112Z, 0, this.f37112Z, this.f37113o0, c12198v.f37113o0);
        this.f37113o0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.InterfaceC12172m0
    /* JADX INFO: renamed from: b */
    public final InterfaceC12172m0 mo13855b(int i10) {
        if (i10 >= this.f37113o0) {
            return new C12198v(Arrays.copyOf(this.f37112Z, i10), this.f37113o0);
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
        if (!(obj instanceof C12198v)) {
            return super.equals(obj);
        }
        C12198v c12198v = (C12198v) obj;
        if (this.f37113o0 != c12198v.f37113o0) {
            return false;
        }
        double[] dArr = c12198v.f37112Z;
        for (int i10 = 0; i10 < this.f37113o0; i10++) {
            if (Double.doubleToLongBits(this.f37112Z[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m14154m(i10);
        return Double.valueOf(this.f37112Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM14014b = 1;
        for (int i10 = 0; i10 < this.f37113o0; i10++) {
            iM14014b = (iM14014b * 31) + AbstractC12175n0.m14014b(Double.doubleToLongBits(this.f37112Z[i10]));
        }
        return iM14014b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f37113o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f37112Z[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m14153j(double d10) {
        m13936f();
        int i10 = this.f37113o0;
        double[] dArr = this.f37112Z;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f37112Z = dArr2;
        }
        double[] dArr3 = this.f37112Z;
        int i11 = this.f37113o0;
        this.f37113o0 = i11 + 1;
        dArr3[i11] = d10;
    }

    /* JADX INFO: renamed from: m */
    public final void m14154m(int i10) {
        if (i10 < 0 || i10 >= this.f37113o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37113o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13936f();
        m14154m(i10);
        double[] dArr = this.f37112Z;
        double d10 = dArr[i10];
        int i11 = this.f37113o0;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f37113o0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m13936f();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f37112Z;
        System.arraycopy(dArr, i11, dArr, i10, this.f37113o0 - i11);
        this.f37113o0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m13936f();
        m14154m(i10);
        double[] dArr = this.f37112Z;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37113o0;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m14153j(((Double) obj).doubleValue());
        return true;
    }
}
