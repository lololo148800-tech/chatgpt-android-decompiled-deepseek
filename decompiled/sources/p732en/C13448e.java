package p732en;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: en.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C13448e implements Iterator {
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
        throw new UnsupportedOperationException();
    }
}
