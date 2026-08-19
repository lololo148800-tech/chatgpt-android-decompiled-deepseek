package p449S9;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: S9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7073i extends AbstractC7036E implements ListIterator {

    /* JADX INFO: renamed from: Y */
    public final int f22546Y;

    /* JADX INFO: renamed from: Z */
    public int f22547Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC7081m f22548o0;

    public C7073i(AbstractC7081m abstractC7081m, int i10) {
        int size = abstractC7081m.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC7057a.m7469n(i10, size, "index"));
        }
        this.f22546Y = size;
        this.f22547Z = i10;
        this.f22548o0 = abstractC7081m;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7478a(int i10) {
        return this.f22548o0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f22547Z < this.f22546Y;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22547Z > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f22547Z;
        this.f22547Z = i10 + 1;
        return m7478a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22547Z;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f22547Z - 1;
        this.f22547Z = i10;
        return m7478a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22547Z - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
