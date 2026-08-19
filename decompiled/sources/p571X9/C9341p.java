package p571X9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p475T9.AbstractC7289l;
import p594Y9.AbstractC9846Z3;

/* JADX INFO: renamed from: X9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9341p extends AbstractC7289l implements ListIterator {

    /* JADX INFO: renamed from: Z */
    public final int f28171Z;

    /* JADX INFO: renamed from: o0 */
    public int f28172o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC9353r f28173p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9341p(AbstractC9353r abstractC9353r, int i10) {
        super(4);
        int size = abstractC9353r.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC9846Z3.m10497d(i10, size, "index"));
        }
        this.f28171Z = size;
        this.f28172o0 = i10;
        this.f28173p0 = abstractC9353r;
    }

    /* JADX INFO: renamed from: a */
    public final Object m9936a(int i10) {
        return this.f28173p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f28172o0 < this.f28171Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28172o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f28172o0;
        this.f28172o0 = i10 + 1;
        return m9936a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28172o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f28172o0 - 1;
        this.f28172o0 = i10;
        return m9936a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28172o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
