package com.google.protobuf;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.protobuf.r1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12188r1 implements ListIterator {

    /* JADX INFO: renamed from: Y */
    public ListIterator f37097Y;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f37097Y.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37097Y.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f37097Y.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37097Y.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f37097Y.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37097Y.previousIndex();
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
