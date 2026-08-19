package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11874G1 extends AbstractC11911T0 implements RandomAccess {

    /* JADX INFO: renamed from: p0 */
    public static final Object[] f36129p0;

    /* JADX INFO: renamed from: q0 */
    public static final C11874G1 f36130q0;

    /* JADX INFO: renamed from: Z */
    public Object[] f36131Z;

    /* JADX INFO: renamed from: o0 */
    public int f36132o0;

    static {
        Object[] objArr = new Object[0];
        f36129p0 = objArr;
        f36130q0 = new C11874G1(objArr, 0, false);
    }

    public C11874G1(Object[] objArr, int i10, boolean z6) {
        super(z6);
        this.f36131Z = objArr;
        this.f36132o0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m13347f();
        if (i10 < 0 || i10 > (i11 = this.f36132o0)) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("Index:", i10, this.f36132o0, ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f36131Z;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f36131Z, 0, objArr2, 0, i10);
            System.arraycopy(this.f36131Z, i10, objArr2, i12, this.f36132o0 - i10);
            this.f36131Z = objArr2;
        }
        this.f36131Z[i10] = obj;
        this.f36132o0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11985n1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ InterfaceC11985n1 mo13266e(int i10) {
        if (i10 >= this.f36132o0) {
            return new C11874G1(i10 == 0 ? f36129p0 : Arrays.copyOf(this.f36131Z, i10), this.f36132o0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m13267m(i10);
        return this.f36131Z[i10];
    }

    /* JADX INFO: renamed from: m */
    public final void m13267m(int i10) {
        if (i10 < 0 || i10 >= this.f36132o0) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("Index:", i10, this.f36132o0, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11911T0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13347f();
        m13267m(i10);
        Object[] objArr = this.f36131Z;
        Object obj = objArr[i10];
        int i11 = this.f36132o0;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f36132o0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m13347f();
        m13267m(i10);
        Object[] objArr = this.f36131Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36132o0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13347f();
        int i10 = this.f36132o0;
        int length = this.f36131Z.length;
        if (i10 == length) {
            this.f36131Z = Arrays.copyOf(this.f36131Z, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f36131Z;
        int i11 = this.f36132o0;
        this.f36132o0 = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
