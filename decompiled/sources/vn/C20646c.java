package vn;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: vn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C20646c implements Iterator {

    /* JADX INFO: renamed from: Y */
    public static final C20646c f65522Y = new C20646c();

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
