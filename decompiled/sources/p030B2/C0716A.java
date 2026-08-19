package p030B2;

import java.util.ArrayList;
import java.util.Iterator;
import p076Cm.InterfaceC1723a;
import p1091wn.C21036q;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import sl.C19676k;

/* JADX INFO: renamed from: B2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0716A implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2072Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f2073Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f2074o0;

    public C0716A(C19676k c19676k) {
        this.f2072Y = 1;
        this.f2074o0 = c19676k;
        this.f2073Z = c19676k.f62364Y.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2072Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f2073Z.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2072Y) {
            case 0:
                Object next = this.f2073Z.next();
                Iterator it = (Iterator) C0741W.f2105Y.invoke(next);
                ArrayList arrayList = (ArrayList) this.f2074o0;
                if (it == null || !it.hasNext()) {
                    while (!this.f2073Z.hasNext() && !arrayList.isEmpty()) {
                        this.f2073Z = (Iterator) AbstractC17680n.m19351a0(arrayList);
                        AbstractC17686t.m19397E(arrayList);
                    }
                } else {
                    arrayList.add(this.f2073Z);
                    this.f2073Z = it;
                }
                return next;
            case 1:
                return ((C19676k) this.f2074o0).f62365Z.invoke(this.f2073Z.next());
            default:
                return ((C21036q) this.f2074o0).f66918b.invoke(this.f2073Z.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2072Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                this.f2073Z.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0716A(C0742X c0742x) {
        this.f2072Y = 0;
        this.f2074o0 = new ArrayList();
        this.f2073Z = c0742x;
    }

    public C0716A(C21036q c21036q) {
        this.f2072Y = 2;
        this.f2074o0 = c21036q;
        this.f2073Z = c21036q.f66917a.iterator();
    }
}
