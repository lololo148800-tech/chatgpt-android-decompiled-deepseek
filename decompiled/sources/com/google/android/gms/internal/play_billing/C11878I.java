package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.I */
/* JADX INFO: loaded from: classes.dex */
public final class C11878I implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final Iterator f36141Y;

    /* JADX INFO: renamed from: Z */
    public boolean f36142Z;

    /* JADX INFO: renamed from: o0 */
    public Object f36143o0;

    public C11878I(Iterator it) {
        it.getClass();
        this.f36141Y = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36142Z || this.f36141Y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f36142Z) {
            return this.f36141Y.next();
        }
        Object obj = this.f36143o0;
        this.f36142Z = false;
        this.f36143o0 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f36142Z) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f36141Y.remove();
    }
}
