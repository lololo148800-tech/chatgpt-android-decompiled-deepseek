package p544W9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p475T9.AbstractC7289l;
import p594Y9.AbstractC9954q3;

/* JADX INFO: renamed from: W9.R4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8549R4 extends AbstractC7289l implements ListIterator {

    /* JADX INFO: renamed from: Z */
    public final int f26376Z;

    /* JADX INFO: renamed from: o0 */
    public int f26377o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC8561T4 f26378p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8549R4(AbstractC8561T4 abstractC8561T4, int i10) {
        super(3);
        int size = abstractC8561T4.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC9954q3.m10613d(i10, size, "index"));
        }
        this.f26376Z = size;
        this.f26377o0 = i10;
        this.f26378p0 = abstractC8561T4;
    }

    /* JADX INFO: renamed from: a */
    public final Object m9210a(int i10) {
        return this.f26378p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26377o0 < this.f26376Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26377o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26377o0;
        this.f26377o0 = i10 + 1;
        return m9210a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26377o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26377o0 - 1;
        this.f26377o0 = i10;
        return m9210a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26377o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
