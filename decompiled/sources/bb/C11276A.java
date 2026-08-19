package bb;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p523V9.AbstractC8020X;

/* JADX INFO: renamed from: bb.A */
/* JADX INFO: loaded from: classes.dex */
public final class C11276A extends AbstractC11314g0 implements ListIterator {

    /* JADX INFO: renamed from: Y */
    public final int f34156Y;

    /* JADX INFO: renamed from: Z */
    public int f34157Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC11278C f34158o0;

    public C11276A(AbstractC11278C abstractC11278C, int i10) {
        int size = abstractC11278C.size();
        AbstractC8020X.m8354d(i10, size);
        this.f34156Y = size;
        this.f34157Z = i10;
        this.f34158o0 = abstractC11278C;
    }

    /* JADX INFO: renamed from: a */
    public final Object m12682a(int i10) {
        return this.f34158o0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f34157Z < this.f34156Y;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34157Z > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f34157Z;
        this.f34157Z = i10 + 1;
        return m12682a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34157Z;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f34157Z - 1;
        this.f34157Z = i10;
        return m12682a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34157Z - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
