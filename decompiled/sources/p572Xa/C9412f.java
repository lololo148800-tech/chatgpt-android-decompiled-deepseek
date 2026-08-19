package p572Xa;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p475T9.AbstractC7289l;
import p594Y9.AbstractC9888f4;

/* JADX INFO: renamed from: Xa.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9412f extends AbstractC7289l implements ListIterator {

    /* JADX INFO: renamed from: Z */
    public final int f28383Z;

    /* JADX INFO: renamed from: o0 */
    public int f28384o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC9414h f28385p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9412f(AbstractC9414h abstractC9414h, int i10) {
        super(5);
        int size = abstractC9414h.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC9888f4.m10540c(i10, size, "index"));
        }
        this.f28383Z = size;
        this.f28384o0 = i10;
        this.f28385p0 = abstractC9414h;
    }

    /* JADX INFO: renamed from: a */
    public final Object m9992a(int i10) {
        return this.f28385p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f28384o0 < this.f28383Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28384o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f28384o0;
        this.f28384o0 = i10 + 1;
        return m9992a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28384o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f28384o0 - 1;
        this.f28384o0 = i10;
        return m9992a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28384o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
