package p349O0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: O0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C5956I implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19396Y = 0;

    /* JADX INFO: renamed from: Z */
    public final C5943B0 f19397Z;

    /* JADX INFO: renamed from: o0 */
    public final int f19398o0;

    /* JADX INFO: renamed from: p0 */
    public int f19399p0;

    /* JADX INFO: renamed from: q0 */
    public int f19400q0;

    public C5956I(C5943B0 c5943b0, int i10, int i11) {
        this.f19397Z = c5943b0;
        this.f19398o0 = i11;
        this.f19399p0 = i10;
        this.f19400q0 = c5943b0.f19352s0;
        if (c5943b0.f19351r0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19396Y) {
            case 0:
                return this.f19399p0 < this.f19398o0;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19396Y) {
            case 0:
                C5943B0 c5943b0 = this.f19397Z;
                int i10 = c5943b0.f19352s0;
                int i11 = this.f19400q0;
                if (i10 != i11) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.f19399p0;
                this.f19399p0 = C5997d.m6457m(c5943b0.f19346Y, i12) + i12;
                return new C5945C0(c5943b0, i12, i11);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19396Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5956I(C5943B0 c5943b0, int i10, AbstractC5958J abstractC5958J, C5997d c5997d) {
        this.f19397Z = c5943b0;
        this.f19398o0 = i10;
        this.f19399p0 = c5943b0.f19352s0;
    }
}
