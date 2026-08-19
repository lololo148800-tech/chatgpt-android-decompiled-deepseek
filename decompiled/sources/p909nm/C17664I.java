package p909nm;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9393x3;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: nm.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C17664I extends AbstractC17671e implements RandomAccess {

    /* JADX INFO: renamed from: Y */
    public final Object[] f56453Y;

    /* JADX INFO: renamed from: Z */
    public final int f56454Z;

    /* JADX INFO: renamed from: o0 */
    public int f56455o0;

    /* JADX INFO: renamed from: p0 */
    public int f56456p0;

    public C17664I(int i10, Object[] objArr) {
        this.f56453Y = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.f56454Z = objArr.length;
            this.f56456p0 = i10;
        } else {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM11057o.append(objArr.length);
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f56456p0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int iMo1316f = mo1316f();
        if (i10 < 0 || i10 >= iMo1316f) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, iMo1316f, ", size: "));
        }
        return this.f56453Y[(this.f56455o0 + i10) % this.f56454Z];
    }

    @Override // p909nm.AbstractC17671e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C17663H(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m19260j(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "n shouldn't be negative but it is ").toString());
        }
        if (i10 > this.f56456p0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM11057o.append(this.f56456p0);
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f56455o0;
            int i12 = this.f56454Z;
            int i13 = (i11 + i10) % i12;
            Object[] objArr = this.f56453Y;
            if (i11 > i13) {
                AbstractC17678l.m19311r(objArr, null, i11, i12);
                Arrays.fill(objArr, 0, i13, (Object) null);
            } else {
                AbstractC17678l.m19311r(objArr, null, i11, i13);
            }
            this.f56455o0 = i13;
            this.f56456p0 -= i10;
        }
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1316f()]);
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        AbstractC16544l.m18094g(array, "array");
        int length = array.length;
        int i10 = this.f56456p0;
        if (length < i10) {
            array = Arrays.copyOf(array, i10);
            AbstractC16544l.m18093f(array, "copyOf(...)");
        }
        int i11 = this.f56456p0;
        int i12 = this.f56455o0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f56453Y;
            if (i14 >= i11 || i12 >= this.f56454Z) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        AbstractC9393x3.m9975e(i11, array);
        return array;
    }
}
