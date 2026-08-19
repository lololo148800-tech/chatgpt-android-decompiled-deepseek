package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.s1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12191s1 implements Iterator {

    /* JADX INFO: renamed from: Y */
    public Iterator f37101Y;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37101Y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f37101Y.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
