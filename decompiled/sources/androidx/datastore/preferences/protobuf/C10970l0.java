package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10970l0 implements Iterator {

    /* JADX INFO: renamed from: Y */
    public Iterator f33070Y;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33070Y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f33070Y.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
