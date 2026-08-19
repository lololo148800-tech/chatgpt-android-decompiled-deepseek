package p692d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: d0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12962a implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public int f41161Y;

    /* JADX INFO: renamed from: Z */
    public int f41162Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f41163o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f41164p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f41165q0;

    public C12962a(int i10) {
        this.f41161Y = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41162Z < this.f41161Y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM14646f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f41162Z;
        switch (this.f41164p0) {
            case 0:
                objM14646f = ((C12966e) this.f41165q0).m14646f(i10);
                break;
            case 1:
                objM14646f = ((C12966e) this.f41165q0).m14649j(i10);
                break;
            default:
                objM14646f = ((C12967f) this.f41165q0).f41176Z[i10];
                break;
        }
        this.f41162Z++;
        this.f41163o0 = true;
        return objM14646f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f41163o0) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f41162Z - 1;
        this.f41162Z = i10;
        switch (this.f41164p0) {
            case 0:
                ((C12966e) this.f41165q0).m14647g(i10);
                break;
            case 1:
                ((C12966e) this.f41165q0).m14647g(i10);
                break;
            default:
                ((C12967f) this.f41165q0).m14659f(i10);
                break;
        }
        this.f41161Y--;
        this.f41163o0 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12962a(C12967f c12967f) {
        this(c12967f.f41177o0);
        this.f41164p0 = 2;
        this.f41165q0 = c12967f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12962a(C12966e c12966e, int i10) {
        this(c12966e.f41154o0);
        this.f41164p0 = i10;
        switch (i10) {
            case 1:
                this.f41165q0 = c12966e;
                this(c12966e.f41154o0);
                break;
            default:
                this.f41165q0 = c12966e;
                break;
        }
    }
}
