package p817j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.m */
/* JADX INFO: loaded from: classes4.dex */
final class C15733m implements ListIterator, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    private final ListIterator f49003a;

    C15733m(C15735n c15735n, int i10) {
        this.f49003a = c15735n.f49004b.listIterator(i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f49003a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f49003a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f49003a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f49003a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f49003a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f49003a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, p817j$.util.InterfaceC16026x
    public final void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17269q(this.f49003a, consumer);
    }
}
