package p571X9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p437Rn.C6951i;
import p437Rn.C6960r;
import p437Rn.C6967y;
import p437Rn.InterfaceC6958p;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: renamed from: X9.m3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9327m3 {
    /* JADX INFO: renamed from: a */
    public static final C6960r m9921a(List list) {
        C17689w c17689w = C17689w.f56480Y;
        C6960r c6960r = new C6960r(c17689w, c17689w);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c6960r = m9922b((C6960r) listIterator.previous(), c6960r);
            }
        }
        return m9923c(c6960r, c17689w);
    }

    /* JADX INFO: renamed from: b */
    public static final C6960r m9922b(C6960r c6960r, C6960r c6960r2) {
        boolean zIsEmpty = c6960r.f22260b.isEmpty();
        List list = c6960r.f22259a;
        if (zIsEmpty) {
            return new C6960r(AbstractC17680n.m19361k0(c6960r2.f22259a, list), c6960r2.f22260b);
        }
        List list2 = c6960r.f22260b;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m9922b((C6960r) it.next(), c6960r2));
        }
        return new C6960r(list, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static final C6960r m9923c(C6960r c6960r, List list) {
        C6960r c6960r2;
        List listM9974d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(list);
        ArrayList arrayListM19323D1 = null;
        for (InterfaceC6958p interfaceC6958p : c6960r.f22259a) {
            if (interfaceC6958p instanceof C6951i) {
                if (arrayListM19323D1 != null) {
                    arrayListM19323D1.addAll(((C6951i) interfaceC6958p).f22244a);
                } else {
                    arrayListM19323D1 = AbstractC17680n.m19323D0(((C6951i) interfaceC6958p).f22244a);
                }
            } else if (interfaceC6958p instanceof C6967y) {
                arrayListM19323D0.add(interfaceC6958p);
            } else {
                if (arrayListM19323D1 != null) {
                    arrayList.add(new C6951i(arrayListM19323D1));
                    arrayListM19323D1 = null;
                }
                arrayList.add(interfaceC6958p);
            }
        }
        List list2 = c6960r.f22260b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C6960r c6960rM9923c = m9923c((C6960r) it.next(), arrayListM19323D0);
            if (c6960rM9923c.f22259a.isEmpty()) {
                List listM9974d2 = c6960rM9923c.f22260b;
                if (listM9974d2.isEmpty()) {
                    listM9974d2 = AbstractC9393x3.m9974d(c6960rM9923c);
                }
                listM9974d = listM9974d2;
            } else {
                listM9974d = AbstractC9393x3.m9974d(c6960rM9923c);
            }
            AbstractC17686t.m19398v(listM9974d, arrayList2);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List listM9974d3 = arrayList2;
        if (zIsEmpty) {
            listM9974d3 = AbstractC9393x3.m9974d(new C6960r(arrayListM19323D0, C17689w.f56480Y));
        }
        List list3 = listM9974d3;
        if (arrayListM19323D1 == null) {
            return new C6960r(arrayList, list3);
        }
        List<C6960r> list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                InterfaceC6958p interfaceC6958p2 = (InterfaceC6958p) AbstractC17680n.m19343S(((C6960r) it2.next()).f22259a);
                if (interfaceC6958p2 != null && (interfaceC6958p2 instanceof C6951i)) {
                    ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list4, 10));
                    for (C6960r c6960r3 : list4) {
                        InterfaceC6958p interfaceC6958p3 = (InterfaceC6958p) AbstractC17680n.m19343S(c6960r3.f22259a);
                        boolean z6 = interfaceC6958p3 instanceof C6951i;
                        List list5 = c6960r3.f22259a;
                        List list6 = c6960r3.f22260b;
                        if (z6) {
                            c6960r2 = new C6960r(AbstractC17680n.m19361k0(AbstractC17680n.m19336L(list5, 1), AbstractC9393x3.m9974d(new C6951i(AbstractC17680n.m19361k0(((C6951i) interfaceC6958p3).f22244a, arrayListM19323D1)))), list6);
                        } else if (interfaceC6958p3 == null) {
                            c6960r2 = new C6960r(AbstractC9393x3.m9974d(new C6951i(arrayListM19323D1)), list6);
                        } else {
                            c6960r2 = new C6960r(AbstractC17680n.m19361k0(list5, AbstractC9393x3.m9974d(new C6951i(arrayListM19323D1))), list6);
                        }
                        arrayList3.add(c6960r2);
                    }
                    return new C6960r(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new C6951i(arrayListM19323D1));
        return new C6960r(arrayList, list3);
    }
}
