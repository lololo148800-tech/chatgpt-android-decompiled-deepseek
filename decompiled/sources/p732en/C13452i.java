package p732en;

import java.util.ListIterator;

/* JADX INFO: renamed from: en.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C13452i implements ListIterator {

    /* JADX INFO: renamed from: Y */
    public ListIterator f42589Y;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f42589Y.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f42589Y.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f42589Y.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f42589Y.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f42589Y.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f42589Y.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
