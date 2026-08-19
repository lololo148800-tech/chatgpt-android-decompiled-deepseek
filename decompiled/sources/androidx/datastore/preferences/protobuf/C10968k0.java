package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10968k0 implements ListIterator {

    /* JADX INFO: renamed from: Y */
    public ListIterator f33066Y;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f33066Y.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33066Y.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f33066Y.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33066Y.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f33066Y.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33066Y.previousIndex();
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
