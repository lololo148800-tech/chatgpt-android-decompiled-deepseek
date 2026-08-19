package p440S0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p076Cm.InterfaceC1723a;
import p415R0.C6783a;
import p909nm.AbstractC17671e;

/* JADX INFO: renamed from: S0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6977c extends AbstractC17671e implements List, Collection, InterfaceC1723a {
    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p909nm.AbstractC17671e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC6977c mo7337j(int i10, Object obj);

    @Override // p909nm.AbstractC17671e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: m */
    public abstract AbstractC6977c mo7338m(Object obj);

    /* JADX INFO: renamed from: p */
    public AbstractC6977c mo7339p(Collection collection) {
        C6980f c6980fMo7340q = mo7340q();
        c6980fMo7340q.addAll(collection);
        return c6980fMo7340q.m7373m();
    }

    /* JADX INFO: renamed from: q */
    public abstract C6980f mo7340q();

    /* JADX INFO: renamed from: r */
    public abstract AbstractC6977c mo7341r(C6976b c6976b);

    /* JADX INFO: renamed from: s */
    public abstract AbstractC6977c mo7342s(int i10);

    @Override // p909nm.AbstractC17671e, java.util.List
    public final List subList(int i10, int i11) {
        return new C6783a(this, i10, i11);
    }

    /* JADX INFO: renamed from: t */
    public abstract AbstractC6977c mo7343t(int i10, Object obj);
}
