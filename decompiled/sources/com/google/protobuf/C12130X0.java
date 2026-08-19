package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.X0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12130X0 extends AbstractC12141c implements RandomAccess {

    /* JADX INFO: renamed from: p0 */
    public static final C12130X0 f36994p0;

    /* JADX INFO: renamed from: Z */
    public Object[] f36995Z;

    /* JADX INFO: renamed from: o0 */
    public int f36996o0;

    static {
        C12130X0 c12130x0 = new C12130X0(0, new Object[0]);
        f36994p0 = c12130x0;
        c12130x0.f37021Y = false;
    }

    public C12130X0(int i10, Object[] objArr) {
        this.f36995Z = objArr;
        this.f36996o0 = i10;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13936f();
        int i10 = this.f36996o0;
        Object[] objArr = this.f36995Z;
        if (i10 == objArr.length) {
            this.f36995Z = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f36995Z;
        int i11 = this.f36996o0;
        this.f36996o0 = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.InterfaceC12172m0
    /* JADX INFO: renamed from: b */
    public final InterfaceC12172m0 mo13855b(int i10) {
        if (i10 < this.f36996o0) {
            throw new IllegalArgumentException();
        }
        return new C12130X0(this.f36996o0, Arrays.copyOf(this.f36995Z, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m13872j(i10);
        return this.f36995Z[i10];
    }

    /* JADX INFO: renamed from: j */
    public final void m13872j(int i10) {
        if (i10 < 0 || i10 >= this.f36996o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f36996o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13936f();
        m13872j(i10);
        Object[] objArr = this.f36995Z;
        Object obj = objArr[i10];
        int i11 = this.f36996o0;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f36996o0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m13936f();
        m13872j(i10);
        Object[] objArr = this.f36995Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36996o0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m13936f();
        if (i10 >= 0 && i10 <= (i11 = this.f36996o0)) {
            Object[] objArr = this.f36995Z;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f36995Z, i10, objArr2, i10 + 1, this.f36996o0 - i10);
                this.f36995Z = objArr2;
            }
            this.f36995Z[i10] = obj;
            this.f36996o0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
        sbM11057o.append(this.f36996o0);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }
}
