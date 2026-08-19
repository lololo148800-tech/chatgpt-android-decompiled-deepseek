package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C15410n implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException();
    }
}
