package p586Y0;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C16558z;
import p076Cm.InterfaceC1723a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17661F;
import p909nm.C17662G;

/* JADX INFO: renamed from: Y0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C9545D implements ListIterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28704Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f28705Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f28706o0;

    public C9545D(C17662G c17662g, int i10) {
        this.f28706o0 = c17662g;
        this.f28705Z = ((List) c17662g.f56449Z).listIterator(AbstractC17680n.m19327G(i10, c17662g));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f28704Y) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.f28705Z;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f28704Y) {
            case 0:
                return ((C16558z) this.f28705Z).f51287Y < ((C9546E) this.f28706o0).f28710p0 - 1;
            case 1:
                return ((ListIterator) this.f28705Z).hasPrevious();
            default:
                return ((ListIterator) this.f28705Z).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f28704Y) {
            case 0:
                return ((C16558z) this.f28705Z).f51287Y >= 0;
            case 1:
                return ((ListIterator) this.f28705Z).hasNext();
            default:
                return ((ListIterator) this.f28705Z).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f28704Y) {
            case 0:
                C16558z c16558z = (C16558z) this.f28705Z;
                int i10 = c16558z.f51287Y + 1;
                C9546E c9546e = (C9546E) this.f28706o0;
                AbstractC9567s.m10106a(i10, c9546e.f28710p0);
                c16558z.f51287Y = i10;
                return c9546e.get(i10);
            case 1:
                return ((ListIterator) this.f28705Z).previous();
            default:
                return ((ListIterator) this.f28705Z).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f28704Y) {
            case 0:
                return ((C16558z) this.f28705Z).f51287Y + 1;
            case 1:
                return AbstractC17681o.m19381j((C17661F) this.f28706o0) - ((ListIterator) this.f28705Z).previousIndex();
            default:
                return AbstractC17681o.m19381j((C17662G) this.f28706o0) - ((ListIterator) this.f28705Z).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f28704Y) {
            case 0:
                C16558z c16558z = (C16558z) this.f28705Z;
                int i10 = c16558z.f51287Y;
                C9546E c9546e = (C9546E) this.f28706o0;
                AbstractC9567s.m10106a(i10, c9546e.f28710p0);
                c16558z.f51287Y = i10 - 1;
                return c9546e.get(i10);
            case 1:
                return ((ListIterator) this.f28705Z).next();
            default:
                return ((ListIterator) this.f28705Z).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f28704Y) {
            case 0:
                return ((C16558z) this.f28705Z).f51287Y;
            case 1:
                return AbstractC17681o.m19381j((C17661F) this.f28706o0) - ((ListIterator) this.f28705Z).nextIndex();
            default:
                return AbstractC17681o.m19381j((C17662G) this.f28706o0) - ((ListIterator) this.f28705Z).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f28704Y) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f28705Z).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f28704Y) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f28705Z).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9545D(C17661F c17661f, int i10) {
        this.f28706o0 = c17661f;
        this.f28705Z = c17661f.f56447Y.listIterator(AbstractC17680n.m19327G(i10, c17661f));
    }

    public C9545D(C16558z c16558z, C9546E c9546e) {
        this.f28705Z = c16558z;
        this.f28706o0 = c9546e;
    }
}
