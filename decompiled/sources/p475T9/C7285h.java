package p475T9;

import cn.UfGr.EhBykzn;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p571X9.AbstractC9201R3;

/* JADX INFO: renamed from: T9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7285h extends AbstractC7289l implements ListIterator {

    /* JADX INFO: renamed from: Z */
    public final int f23085Z;

    /* JADX INFO: renamed from: o0 */
    public int f23086o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC7287j f23087p0;

    /* JADX INFO: renamed from: a */
    public final Object m7740a(int i10) {
        return this.f23087p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23086o0 < this.f23085Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23086o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23086o0;
        this.f23086o0 = i10 + 1;
        return m7740a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23086o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23086o0 - 1;
        this.f23086o0 = i10;
        return m7740a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23086o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7285h(AbstractC7287j abstractC7287j, int i10) {
        super(0);
        int size = abstractC7287j.size();
        if (i10 >= 0 && i10 <= size) {
            this.f23085Z = size;
            this.f23086o0 = i10;
            this.f23087p0 = abstractC7287j;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC9201R3.m9769d(i10, size, EhBykzn.gKtLOG));
    }
}
