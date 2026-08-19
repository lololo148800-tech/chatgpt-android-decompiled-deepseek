package p523V9;

import bb.InterfaceC11291P;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p594Y9.AbstractC9716D4;
import p594Y9.AbstractC9792Q2;
import p594Y9.AbstractC9874d4;

/* JADX INFO: renamed from: V9.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7944N extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25174Y;

    public /* synthetic */ AbstractC7944N(int i10) {
        this.f25174Y = i10;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f25174Y) {
            case 0:
                return AbstractC9792Q2.m10410b(this, collection);
            case 1:
                return AbstractC9874d4.m10531b(this, collection);
            case 2:
                return AbstractC9716D4.m10310b(this, collection);
            default:
                collection.getClass();
                if (collection instanceof InterfaceC11291P) {
                    collection = ((InterfaceC11291P) collection).m12711h();
                }
                boolean zRemove = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    collection.getClass();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            zRemove = true;
                        }
                    }
                }
                return zRemove;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f25174Y) {
            case 0:
                collection.getClass();
                break;
            case 1:
                collection.getClass();
                break;
            case 2:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
