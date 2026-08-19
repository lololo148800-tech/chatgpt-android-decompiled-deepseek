package p523V9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p475T9.AbstractC7289l;
import p594Y9.AbstractC9768M2;

/* JADX INFO: renamed from: V9.B */
/* JADX INFO: loaded from: classes.dex */
public final class C7848B extends AbstractC7289l implements ListIterator {

    /* JADX INFO: renamed from: Z */
    public final int f24741Z;

    /* JADX INFO: renamed from: o0 */
    public int f24742o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC7864D f24743p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7848B(AbstractC7864D abstractC7864D, int i10) {
        super(2);
        int size = abstractC7864D.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC9768M2.m10373d(i10, size, "index"));
        }
        this.f24741Z = size;
        this.f24742o0 = i10;
        this.f24743p0 = abstractC7864D;
    }

    /* JADX INFO: renamed from: a */
    public final Object m8105a(int i10) {
        return this.f24743p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24742o0 < this.f24741Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24742o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24742o0;
        this.f24742o0 = i10 + 1;
        return m8105a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24742o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24742o0 - 1;
        this.f24742o0 = i10;
        return m8105a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24742o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
