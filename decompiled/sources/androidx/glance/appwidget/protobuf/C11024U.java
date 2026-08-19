package androidx.glance.appwidget.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.U */
/* JADX INFO: loaded from: classes.dex */
public final class C11024U extends AbstractC11032b implements RandomAccess {

    /* JADX INFO: renamed from: p0 */
    public static final C11024U f33269p0 = new C11024U(new Object[0], 0, false);

    /* JADX INFO: renamed from: Z */
    public Object[] f33270Z;

    /* JADX INFO: renamed from: o0 */
    public int f33271o0;

    public C11024U(Object[] objArr, int i10, boolean z6) {
        this.f33285Y = z6;
        this.f33270Z = objArr;
        this.f33271o0 = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m11980f();
        int i10 = this.f33271o0;
        Object[] objArr = this.f33270Z;
        if (i10 == objArr.length) {
            this.f33270Z = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f33270Z;
        int i11 = this.f33271o0;
        this.f33271o0 = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m11920i(i10);
        return this.f33270Z[i10];
    }

    /* JADX INFO: renamed from: i */
    public final void m11920i(int i10) {
        if (i10 < 0 || i10 >= this.f33271o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f33271o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public final C11024U m11921j(int i10) {
        if (i10 >= this.f33271o0) {
            return new C11024U(Arrays.copyOf(this.f33270Z, i10), this.f33271o0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11032b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m11980f();
        m11920i(i10);
        Object[] objArr = this.f33270Z;
        Object obj = objArr[i10];
        int i11 = this.f33271o0;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f33271o0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m11980f();
        m11920i(i10);
        Object[] objArr = this.f33270Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33271o0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m11980f();
        if (i10 >= 0 && i10 <= (i11 = this.f33271o0)) {
            Object[] objArr = this.f33270Z;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f33270Z, i10, objArr2, i10 + 1, this.f33271o0 - i10);
                this.f33270Z = objArr2;
            }
            this.f33270Z[i10] = obj;
            this.f33271o0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
        sbM11057o.append(this.f33271o0);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }
}
