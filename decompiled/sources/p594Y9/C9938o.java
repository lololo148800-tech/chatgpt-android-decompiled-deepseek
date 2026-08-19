package p594Y9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p475T9.AbstractC7289l;

/* JADX INFO: renamed from: Y9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9938o extends AbstractC7289l implements ListIterator {

    /* JADX INFO: renamed from: Z */
    public final int f29483Z;

    /* JADX INFO: renamed from: o0 */
    public int f29484o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC9950q f29485p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9938o(AbstractC9950q abstractC9950q, int i10) {
        super(6);
        int size = abstractC9950q.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC10003y4.m10645d(i10, size, "index"));
        }
        this.f29483Z = size;
        this.f29484o0 = i10;
        this.f29485p0 = abstractC9950q;
    }

    /* JADX INFO: renamed from: a */
    public final Object m10600a(int i10) {
        return this.f29485p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f29484o0 < this.f29483Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29484o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f29484o0;
        this.f29484o0 = i10 + 1;
        return m10600a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29484o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f29484o0 - 1;
        this.f29484o0 = i10;
        return m10600a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29484o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
