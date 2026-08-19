package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12205x0 extends AbstractC12141c implements InterfaceC12169l0, RandomAccess, InterfaceC12126V0 {

    /* JADX INFO: renamed from: p0 */
    public static final C12205x0 f37117p0;

    /* JADX INFO: renamed from: Z */
    public long[] f37118Z;

    /* JADX INFO: renamed from: o0 */
    public int f37119o0;

    static {
        C12205x0 c12205x0 = new C12205x0(new long[0], 0);
        f37117p0 = c12205x0;
        c12205x0.f37021Y = false;
    }

    public C12205x0() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        m13936f();
        if (i10 < 0 || i10 > (i11 = this.f37119o0)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37119o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        long[] jArr = this.f37118Z;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f37118Z, i10, jArr2, i10 + 1, this.f37119o0 - i10);
            this.f37118Z = jArr2;
        }
        this.f37118Z[i10] = jLongValue;
        this.f37119o0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m13936f();
        Charset charset = AbstractC12175n0.f37050a;
        collection.getClass();
        if (!(collection instanceof C12205x0)) {
            return super.addAll(collection);
        }
        C12205x0 c12205x0 = (C12205x0) collection;
        int i10 = c12205x0.f37119o0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37119o0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f37118Z;
        if (i12 > jArr.length) {
            this.f37118Z = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c12205x0.f37118Z, 0, this.f37118Z, this.f37119o0, c12205x0.f37119o0);
        this.f37119o0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.InterfaceC12172m0
    /* JADX INFO: renamed from: b */
    public final InterfaceC12172m0 mo13855b(int i10) {
        if (i10 >= this.f37119o0) {
            return new C12205x0(Arrays.copyOf(this.f37118Z, i10), this.f37119o0);
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
        if (!(obj instanceof C12205x0)) {
            return super.equals(obj);
        }
        C12205x0 c12205x0 = (C12205x0) obj;
        if (this.f37119o0 != c12205x0.f37119o0) {
            return false;
        }
        long[] jArr = c12205x0.f37118Z;
        for (int i10 = 0; i10 < this.f37119o0; i10++) {
            if (this.f37118Z[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m14168m(i10);
        return Long.valueOf(this.f37118Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM14014b = 1;
        for (int i10 = 0; i10 < this.f37119o0; i10++) {
            iM14014b = (iM14014b * 31) + AbstractC12175n0.m14014b(this.f37118Z[i10]);
        }
        return iM14014b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f37119o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f37118Z[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m14167j(long j10) {
        m13936f();
        int i10 = this.f37119o0;
        long[] jArr = this.f37118Z;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f37118Z = jArr2;
        }
        long[] jArr3 = this.f37118Z;
        int i11 = this.f37119o0;
        this.f37119o0 = i11 + 1;
        jArr3[i11] = j10;
    }

    /* JADX INFO: renamed from: m */
    public final void m14168m(int i10) {
        if (i10 < 0 || i10 >= this.f37119o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f37119o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13936f();
        m14168m(i10);
        long[] jArr = this.f37118Z;
        long j10 = jArr[i10];
        int i11 = this.f37119o0;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f37119o0--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m13936f();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f37118Z;
        System.arraycopy(jArr, i11, jArr, i10, this.f37119o0 - i11);
        this.f37119o0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m13936f();
        m14168m(i10);
        long[] jArr = this.f37118Z;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37119o0;
    }

    public C12205x0(long[] jArr, int i10) {
        this.f37118Z = jArr;
        this.f37119o0 = i10;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m14167j(((Long) obj).longValue());
        return true;
    }
}
