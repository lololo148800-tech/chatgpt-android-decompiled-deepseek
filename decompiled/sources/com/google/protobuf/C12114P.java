package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C12114P extends AbstractC12141c implements InterfaceC12157h0, RandomAccess, InterfaceC12126V0 {

    /* JADX INFO: renamed from: p0 */
    public static final C12114P f36969p0;

    /* JADX INFO: renamed from: Z */
    public float[] f36970Z;

    /* JADX INFO: renamed from: o0 */
    public int f36971o0;

    static {
        C12114P c12114p = new C12114P(new float[0], 0);
        f36969p0 = c12114p;
        c12114p.f37021Y = false;
    }

    public C12114P(float[] fArr, int i10) {
        this.f36970Z = fArr;
        this.f36971o0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        m13936f();
        if (i10 < 0 || i10 > (i11 = this.f36971o0)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f36971o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        float[] fArr = this.f36970Z;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f36970Z, i10, fArr2, i10 + 1, this.f36971o0 - i10);
            this.f36970Z = fArr2;
        }
        this.f36970Z[i10] = fFloatValue;
        this.f36971o0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m13936f();
        Charset charset = AbstractC12175n0.f37050a;
        collection.getClass();
        if (!(collection instanceof C12114P)) {
            return super.addAll(collection);
        }
        C12114P c12114p = (C12114P) collection;
        int i10 = c12114p.f36971o0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f36971o0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f36970Z;
        if (i12 > fArr.length) {
            this.f36970Z = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c12114p.f36970Z, 0, this.f36970Z, this.f36971o0, c12114p.f36971o0);
        this.f36971o0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.InterfaceC12172m0
    /* JADX INFO: renamed from: b */
    public final InterfaceC12172m0 mo13855b(int i10) {
        if (i10 >= this.f36971o0) {
            return new C12114P(Arrays.copyOf(this.f36970Z, i10), this.f36971o0);
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
        if (!(obj instanceof C12114P)) {
            return super.equals(obj);
        }
        C12114P c12114p = (C12114P) obj;
        if (this.f36971o0 != c12114p.f36971o0) {
            return false;
        }
        float[] fArr = c12114p.f36970Z;
        for (int i10 = 0; i10 < this.f36971o0; i10++) {
            if (Float.floatToIntBits(this.f36970Z[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m13857m(i10);
        return Float.valueOf(this.f36970Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f36971o0; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f36970Z[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f36971o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f36970Z[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m13856j(float f10) {
        m13936f();
        int i10 = this.f36971o0;
        float[] fArr = this.f36970Z;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f36970Z = fArr2;
        }
        float[] fArr3 = this.f36970Z;
        int i11 = this.f36971o0;
        this.f36971o0 = i11 + 1;
        fArr3[i11] = f10;
    }

    /* JADX INFO: renamed from: m */
    public final void m13857m(int i10) {
        if (i10 < 0 || i10 >= this.f36971o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f36971o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13936f();
        m13857m(i10);
        float[] fArr = this.f36970Z;
        float f10 = fArr[i10];
        int i11 = this.f36971o0;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f36971o0--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m13936f();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f36970Z;
        System.arraycopy(fArr, i11, fArr, i10, this.f36971o0 - i11);
        this.f36971o0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m13936f();
        m13857m(i10);
        float[] fArr = this.f36970Z;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36971o0;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13856j(((Float) obj).floatValue());
        return true;
    }
}
