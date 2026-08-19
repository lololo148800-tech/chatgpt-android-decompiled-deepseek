package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y */
/* JADX INFO: loaded from: classes.dex */
public final class C12027y extends AbstractC11940c0 implements ListIterator {

    /* JADX INFO: renamed from: Y */
    public final int f36361Y;

    /* JADX INFO: renamed from: Z */
    public int f36362Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC11857B f36363o0;

    public C12027y(AbstractC11857B abstractC11857B, int i10) {
        int size = abstractC11857B.size();
        AbstractC11957g1.m13457u(i10, size);
        this.f36361Y = size;
        this.f36362Z = i10;
        this.f36363o0 = abstractC11857B;
    }

    /* JADX INFO: renamed from: a */
    public final Object m13563a(int i10) {
        return this.f36363o0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f36362Z < this.f36361Y;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36362Z > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f36362Z;
        this.f36362Z = i10 + 1;
        return m13563a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36362Z;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f36362Z - 1;
        this.f36362Z = i10;
        return m13563a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36362Z - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
