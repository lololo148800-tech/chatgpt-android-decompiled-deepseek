package p030B2;

import android.view.View;
import android.view.ViewGroup;
import ao.C11200y;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17294A;
import mm.C17317t;
import mm.C17319v;
import mm.C17321x;
import p076Cm.InterfaceC1723a;
import p692d0.C12960M;
import p909nm.AbstractC17671e;

/* JADX INFO: renamed from: B2.X */
/* JADX INFO: loaded from: classes.dex */
public class C0742X implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2106Y;

    /* JADX INFO: renamed from: Z */
    public int f2107Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f2108o0;

    public /* synthetic */ C0742X(Object obj, int i10) {
        this.f2106Y = i10;
        this.f2108o0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2106Y) {
            case 0:
                return this.f2107Z < ((ViewGroup) this.f2108o0).getChildCount();
            case 1:
                return this.f2107Z > 0;
            case 2:
                return this.f2107Z < ((C12960M) this.f2108o0).m14655f();
            case 3:
                return this.f2107Z < ((Object[]) this.f2108o0).length;
            case 4:
                return this.f2107Z < ((byte[]) this.f2108o0).length;
            case 5:
                return this.f2107Z < ((int[]) this.f2108o0).length;
            case 6:
                return this.f2107Z < ((long[]) this.f2108o0).length;
            case 7:
                return this.f2107Z < ((short[]) this.f2108o0).length;
            default:
                return this.f2107Z < ((AbstractC17671e) this.f2108o0).mo1316f();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2106Y) {
            case 0:
                int i10 = this.f2107Z;
                this.f2107Z = i10 + 1;
                View childAt = ((ViewGroup) this.f2108o0).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                C11200y c11200y = (C11200y) this.f2108o0;
                int i11 = this.f2107Z;
                this.f2107Z = i11 - 1;
                return c11200y.f53322e[c11200y.f53320c - i11];
            case 2:
                int i12 = this.f2107Z;
                this.f2107Z = i12 + 1;
                return ((C12960M) this.f2108o0).m14656g(i12);
            case 3:
                try {
                    Object[] objArr = (Object[]) this.f2108o0;
                    int i13 = this.f2107Z;
                    this.f2107Z = i13 + 1;
                    return objArr[i13];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f2107Z--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 4:
                int i14 = this.f2107Z;
                byte[] bArr = (byte[]) this.f2108o0;
                if (i14 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2107Z));
                }
                this.f2107Z = i14 + 1;
                return new C17317t(bArr[i14]);
            case 5:
                int i15 = this.f2107Z;
                int[] iArr = (int[]) this.f2108o0;
                if (i15 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2107Z));
                }
                this.f2107Z = i15 + 1;
                return new C17319v(iArr[i15]);
            case 6:
                int i16 = this.f2107Z;
                long[] jArr = (long[]) this.f2108o0;
                if (i16 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2107Z));
                }
                this.f2107Z = i16 + 1;
                return new C17321x(jArr[i16]);
            case 7:
                int i17 = this.f2107Z;
                short[] sArr = (short[]) this.f2108o0;
                if (i17 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2107Z));
                }
                this.f2107Z = i17 + 1;
                return new C17294A(sArr[i17]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i18 = this.f2107Z;
                this.f2107Z = i18 + 1;
                return ((AbstractC17671e) this.f2108o0).get(i18);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2106Y) {
            case 0:
                int i10 = this.f2107Z - 1;
                this.f2107Z = i10;
                ((ViewGroup) this.f2108o0).removeViewAt(i10);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0742X(Object[] array) {
        this.f2106Y = 3;
        AbstractC16544l.m18094g(array, "array");
        this.f2108o0 = array;
    }

    public C0742X(C11200y c11200y) {
        this.f2106Y = 1;
        this.f2108o0 = c11200y;
        this.f2107Z = c11200y.f53320c;
    }
}
