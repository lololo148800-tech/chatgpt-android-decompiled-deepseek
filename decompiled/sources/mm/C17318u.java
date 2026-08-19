package mm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0742X;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: mm.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C17318u implements Collection, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final byte[] f55150Y;

    public /* synthetic */ C17318u(byte[] bArr) {
        this.f55150Y = bArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C17317t)) {
            return false;
        }
        byte b = ((C17317t) obj).f55149Y;
        byte[] bArr = this.f55150Y;
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (b == bArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof C17317t) {
                byte b = ((C17317t) obj).f55149Y;
                byte[] bArr = this.f55150Y;
                int length = bArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    if (b == bArr[i10]) {
                        break;
                    }
                    i10++;
                }
                if (i10 >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C17318u) {
            return AbstractC16544l.m18089b(this.f55150Y, ((C17318u) obj).f55150Y);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f55150Y);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f55150Y.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0742X(this.f55150Y, 4);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f55150Y.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f55150Y) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        return AbstractC16543k.m18087b(this, array);
    }
}
