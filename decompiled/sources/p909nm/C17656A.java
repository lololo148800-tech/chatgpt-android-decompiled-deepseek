package p909nm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p1091wn.C21023d;

/* JADX INFO: renamed from: nm.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C17656A implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56444Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Iterator f56445Z;

    /* JADX INFO: renamed from: o0 */
    public int f56446o0;

    public C17656A(Iterator iterator) {
        AbstractC16544l.m18094g(iterator, "iterator");
        this.f56445Z = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f56444Y) {
            case 0:
                return this.f56445Z.hasNext();
            case 1:
                break;
            default:
                return this.f56446o0 > 0 && this.f56445Z.hasNext();
        }
        while (true) {
            int i10 = this.f56446o0;
            it = this.f56445Z;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f56446o0--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f56444Y) {
            case 0:
                int i10 = this.f56446o0;
                this.f56446o0 = i10 + 1;
                if (i10 >= 0) {
                    return new C17692z(i10, this.f56445Z.next());
                }
                AbstractC17681o.m19388q();
                throw null;
            case 1:
                break;
            default:
                int i11 = this.f56446o0;
                if (i11 == 0) {
                    throw new NoSuchElementException();
                }
                this.f56446o0 = i11 - 1;
                return this.f56445Z.next();
        }
        while (true) {
            int i12 = this.f56446o0;
            it = this.f56445Z;
            if (i12 > 0 && it.hasNext()) {
                it.next();
                this.f56446o0--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f56444Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C17656A(C21023d c21023d, byte b) {
        this.f56446o0 = c21023d.f66895c;
        this.f56445Z = c21023d.f66894b.iterator();
    }

    public C17656A(C21023d c21023d) {
        this.f56445Z = c21023d.f66894b.iterator();
        this.f56446o0 = c21023d.f66895c;
    }
}
