package p440S0;

import java.util.ListIterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: S0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6975a implements ListIterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public int f22303Y;

    /* JADX INFO: renamed from: Z */
    public int f22304Z;

    public AbstractC6975a(int i10, int i11) {
        this.f22303Y = i10;
        this.f22304Z = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f22303Y < this.f22304Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22303Y > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22303Y;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22303Y - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
