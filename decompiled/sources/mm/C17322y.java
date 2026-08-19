package mm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0742X;
import p076Cm.InterfaceC1723a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: mm.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C17322y implements Collection, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final long[] f55154Y;

    public /* synthetic */ C17322y(long[] jArr) {
        this.f55154Y = jArr;
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

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C17321x)) {
            return false;
        }
        return AbstractC17678l.m19301h(this.f55154Y, ((C17321x) obj).f55153Y);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof C17321x) {
                if (AbstractC17678l.m19301h(this.f55154Y, ((C17321x) obj).f55153Y)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C17322y) {
            return AbstractC16544l.m18089b(this.f55154Y, ((C17322y) obj).f55154Y);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f55154Y);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f55154Y.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0742X(this.f55154Y, 6);
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
        return this.f55154Y.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f55154Y) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        return AbstractC16543k.m18087b(this, array);
    }
}
