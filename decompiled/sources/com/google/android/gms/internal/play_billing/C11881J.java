package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.J */
/* JADX INFO: loaded from: classes.dex */
public final class C11881J extends AbstractC11940c0 {

    /* JADX INFO: renamed from: Y */
    public final Object f36148Y;

    /* JADX INFO: renamed from: Z */
    public boolean f36149Z;

    public C11881J(Object obj) {
        this.f36148Y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f36149Z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f36149Z) {
            throw new NoSuchElementException();
        }
        this.f36149Z = true;
        return this.f36148Y;
    }
}
