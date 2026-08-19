package vn;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: vn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C20648e implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final Object f65526Y;

    /* JADX INFO: renamed from: Z */
    public boolean f65527Z = true;

    public C20648e(Object obj) {
        this.f65526Y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65527Z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f65527Z) {
            throw new NoSuchElementException();
        }
        this.f65527Z = false;
        return this.f65526Y;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
