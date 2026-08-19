package p594Y9;

import bb.C11285J;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import p644ab.InterfaceC10532e;

/* JADX INFO: renamed from: Y9.u */
/* JADX INFO: loaded from: classes.dex */
public final class C9974u extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29563Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Collection f29564Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f29565o0;

    public C9974u(List list, InterfaceC9882e5 interfaceC9882e5) {
        list.getClass();
        this.f29564Z = list;
        this.f29565o0 = interfaceC9882e5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        switch (this.f29563Y) {
            case 0:
                ((List) this.f29564Z).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f29563Y) {
            case 0:
                return new C9962s(this, ((List) this.f29564Z).listIterator(i10), 1);
            default:
                return new C11285J(this, ((AbstractCollection) this.f29564Z).listIterator(i10), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        switch (this.f29563Y) {
            case 1:
                ((AbstractCollection) this.f29564Z).subList(i10, i11).clear();
                break;
            default:
                super.removeRange(i10, i11);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f29563Y) {
            case 0:
                return ((List) this.f29564Z).size();
            default:
                return ((AbstractCollection) this.f29564Z).size();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9974u(List list, InterfaceC10532e interfaceC10532e) {
        list.getClass();
        this.f29564Z = (AbstractCollection) list;
        this.f29565o0 = interfaceC10532e;
    }
}
