package p909nm;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p030B2.C0742X;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: nm.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17669c extends C0742X implements ListIterator {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC17671e f56467p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17669c(AbstractC17671e abstractC17671e, int i10) {
        super(abstractC17671e, 8);
        this.f56467p0 = abstractC17671e;
        int iMo1316f = abstractC17671e.mo1316f();
        if (i10 < 0 || i10 > iMo1316f) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, iMo1316f, ", size: "));
        }
        this.f2107Z = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2107Z > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2107Z;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2107Z - 1;
        this.f2107Z = i10;
        return this.f56467p0.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2107Z - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
