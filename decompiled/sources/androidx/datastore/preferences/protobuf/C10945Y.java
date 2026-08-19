package androidx.datastore.preferences.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C10945Y extends AbstractC10949b implements RandomAccess {

    /* JADX INFO: renamed from: p0 */
    public static final C10945Y f33006p0;

    /* JADX INFO: renamed from: Z */
    public Object[] f33007Z;

    /* JADX INFO: renamed from: o0 */
    public int f33008o0;

    static {
        C10945Y c10945y = new C10945Y(0, new Object[0]);
        f33006p0 = c10945y;
        c10945y.f33013Y = false;
    }

    public C10945Y(int i10, Object[] objArr) {
        this.f33007Z = objArr;
        this.f33008o0 = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10949b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m11524f();
        int i10 = this.f33008o0;
        Object[] objArr = this.f33007Z;
        if (i10 == objArr.length) {
            this.f33007Z = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f33007Z;
        int i11 = this.f33008o0;
        this.f33008o0 = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10991w
    /* JADX INFO: renamed from: b */
    public final InterfaceC10991w mo11431b(int i10) {
        if (i10 < this.f33008o0) {
            throw new IllegalArgumentException();
        }
        return new C10945Y(this.f33008o0, Arrays.copyOf(this.f33007Z, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m11516i(i10);
        return this.f33007Z[i10];
    }

    /* JADX INFO: renamed from: i */
    public final void m11516i(int i10) {
        if (i10 < 0 || i10 >= this.f33008o0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
            sbM11057o.append(this.f33008o0);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m11524f();
        m11516i(i10);
        Object[] objArr = this.f33007Z;
        Object obj = objArr[i10];
        int i11 = this.f33008o0;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f33008o0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m11524f();
        m11516i(i10);
        Object[] objArr = this.f33007Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33008o0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m11524f();
        if (i10 >= 0 && i10 <= (i11 = this.f33008o0)) {
            Object[] objArr = this.f33007Z;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f33007Z, i10, objArr2, i10 + 1, this.f33008o0 - i10);
                this.f33007Z = objArr2;
            }
            this.f33007Z[i10] = obj;
            this.f33008o0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index:", ", Size:");
        sbM11057o.append(this.f33008o0);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }
}
