package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11973k1 extends AbstractC11911T0 implements RandomAccess, InterfaceC11981m1, InterfaceC11868E1 {

    /* JADX INFO: renamed from: p0 */
    public static final int[] f36284p0;

    /* JADX INFO: renamed from: q0 */
    public static final C11973k1 f36285q0;

    /* JADX INFO: renamed from: Z */
    public int[] f36286Z;

    /* JADX INFO: renamed from: o0 */
    public int f36287o0;

    static {
        int[] iArr = new int[0];
        f36284p0 = iArr;
        f36285q0 = new C11973k1(iArr, 0, false);
    }

    public C11973k1(int[] iArr, int i10, boolean z6) {
        super(z6);
        this.f36286Z = iArr;
        this.f36287o0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m13347f();
        if (i10 < 0 || i10 > (i11 = this.f36287o0)) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("Index:", i10, this.f36287o0, ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f36286Z;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f36286Z, 0, iArr2, 0, i10);
            System.arraycopy(this.f36286Z, i10, iArr2, i12, this.f36287o0 - i10);
            this.f36286Z = iArr2;
        }
        this.f36286Z[i10] = iIntValue;
        this.f36287o0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11911T0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m13347f();
        Charset charset = AbstractC11989o1.f36309a;
        collection.getClass();
        if (!(collection instanceof C11973k1)) {
            return super.addAll(collection);
        }
        C11973k1 c11973k1 = (C11973k1) collection;
        int i10 = c11973k1.f36287o0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f36287o0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f36286Z;
        if (i12 > iArr.length) {
            this.f36286Z = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c11973k1.f36286Z, 0, this.f36286Z, this.f36287o0, c11973k1.f36287o0);
        this.f36287o0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11985n1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ InterfaceC11985n1 mo13266e(int i10) {
        if (i10 >= this.f36287o0) {
            return new C11973k1(i10 == 0 ? f36284p0 : Arrays.copyOf(this.f36286Z, i10), this.f36287o0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11911T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11973k1)) {
            return super.equals(obj);
        }
        C11973k1 c11973k1 = (C11973k1) obj;
        if (this.f36287o0 != c11973k1.f36287o0) {
            return false;
        }
        int[] iArr = c11973k1.f36286Z;
        for (int i10 = 0; i10 < this.f36287o0; i10++) {
            if (this.f36286Z[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m13489r(i10);
        return Integer.valueOf(this.f36286Z[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11911T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f36287o0; i11++) {
            i10 = (i10 * 31) + this.f36286Z[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f36287o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f36286Z[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final int m13486m(int i10) {
        m13489r(i10);
        return this.f36286Z[i10];
    }

    /* JADX INFO: renamed from: p */
    public final void m13487p(int i10) {
        m13347f();
        int i11 = this.f36287o0;
        int length = this.f36286Z.length;
        if (i11 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f36286Z, 0, iArr, 0, this.f36287o0);
            this.f36286Z = iArr;
        }
        int[] iArr2 = this.f36286Z;
        int i12 = this.f36287o0;
        this.f36287o0 = i12 + 1;
        iArr2[i12] = i10;
    }

    /* JADX INFO: renamed from: q */
    public final void m13488q(int i10) {
        int length = this.f36286Z.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f36286Z = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f36286Z = Arrays.copyOf(this.f36286Z, length);
    }

    /* JADX INFO: renamed from: r */
    public final void m13489r(int i10) {
        if (i10 < 0 || i10 >= this.f36287o0) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("Index:", i10, this.f36287o0, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11911T0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m13347f();
        m13489r(i10);
        int[] iArr = this.f36286Z;
        int i11 = iArr[i10];
        int i12 = this.f36287o0;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f36287o0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m13347f();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f36286Z;
        System.arraycopy(iArr, i11, iArr, i10, this.f36287o0 - i11);
        this.f36287o0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m13347f();
        m13489r(i10);
        int[] iArr = this.f36286Z;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36287o0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m13487p(((Integer) obj).intValue());
        return true;
    }
}
