package p499U9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p475T9.AbstractC7289l;
import p594Y9.AbstractC9777O;

/* JADX INFO: renamed from: U9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7572b extends AbstractC7289l implements ListIterator {

    /* JADX INFO: renamed from: Z */
    public final int f23975Z;

    /* JADX INFO: renamed from: o0 */
    public int f23976o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC7574d f23977p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7572b(AbstractC7574d abstractC7574d, int i10) {
        super(1);
        int size = abstractC7574d.size();
        AbstractC9777O.m10385c(i10, size);
        this.f23975Z = size;
        this.f23976o0 = i10;
        this.f23977p0 = abstractC7574d;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7921a(int i10) {
        return this.f23977p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23976o0 < this.f23975Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23976o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23976o0;
        this.f23976o0 = i10 + 1;
        return m7921a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23976o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23976o0 - 1;
        this.f23976o0 = i10;
        return m7921a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23976o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
