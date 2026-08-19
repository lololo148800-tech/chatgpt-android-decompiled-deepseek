package p594Y9;

import bb.C11285J;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p644ab.InterfaceC10532e;

/* JADX INFO: renamed from: Y9.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9968t extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29551Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Collection f29552Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f29553o0;

    public C9968t(List list, InterfaceC9882e5 interfaceC9882e5) {
        list.getClass();
        this.f29552Z = list;
        this.f29553o0 = interfaceC9882e5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        switch (this.f29551Y) {
            case 0:
                ((List) this.f29552Z).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        switch (this.f29551Y) {
            case 0:
                return ((InterfaceC9882e5) this.f29553o0).mo3670t(((List) this.f29552Z).get(i10));
            default:
                return ((InterfaceC10532e) this.f29553o0).mo22421apply(((AbstractCollection) this.f29552Z).get(i10));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.f29551Y) {
            case 0:
                return ((List) this.f29552Z).isEmpty();
            default:
                return ((AbstractCollection) this.f29552Z).isEmpty();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f29551Y) {
            case 0:
                break;
        }
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f29551Y) {
            case 0:
                return new C9962s(this, ((List) this.f29552Z).listIterator(i10), 0);
            default:
                return new C11285J(this, ((AbstractCollection) this.f29552Z).listIterator(i10), 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        switch (this.f29551Y) {
            case 0:
                return ((InterfaceC9882e5) this.f29553o0).mo3670t(((List) this.f29552Z).remove(i10));
            default:
                return ((InterfaceC10532e) this.f29553o0).mo22421apply(((AbstractCollection) this.f29552Z).remove(i10));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        switch (this.f29551Y) {
            case 1:
                ((AbstractCollection) this.f29552Z).subList(i10, i11).clear();
                break;
            default:
                super.removeRange(i10, i11);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f29551Y) {
            case 0:
                return ((List) this.f29552Z).size();
            default:
                return ((AbstractCollection) this.f29552Z).size();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9968t(List list, InterfaceC10532e interfaceC10532e) {
        list.getClass();
        this.f29552Z = (AbstractCollection) list;
        this.f29553o0 = interfaceC10532e;
    }
}
