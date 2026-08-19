package p909nm;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18240g;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p229J0.EnumC3898D3;
import p349O0.C6018n0;
import p349O0.C6021p;
import p455Sf.AbstractC7117b;
import p455Sf.C7120e;
import p455Sf.C7121f;
import p537W0.AbstractC8411c;
import p582Xk.HXHG.bQBnquXS;
import p594Y9.AbstractC9787P3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: nm.J */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17665J {
    /* JADX INFO: renamed from: a */
    public static final void m19261a(String title, String str, InterfaceC1426a onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(18555943);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(title) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC9787P3.m10401a(C7120e.f22665Y, AbstractC7117b.f22660a, c10456n, onClick, EnumC3898D3.f11878Z, AbstractC8411c.m8969c(478878353, c6021p, new C7121f(0, title, str)), c6021p, ((i12 >> 3) & 896) | 221238 | ((i12 << 3) & 7168), 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 14, title, str, onClick, interfaceC10459q2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18240g m19262b(C18240g c18240g) {
        c18240g.f58127Y.m19755b();
        return c18240g.size() > 0 ? c18240g : C18240g.f58126Z;
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashSet m19263c(Set set, Object obj) {
        AbstractC16544l.m18094g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC17660E.m19257b(set.size()));
        boolean z6 = false;
        for (Object obj2 : set) {
            boolean z10 = true;
            if (!z6 && AbstractC16544l.m18089b(obj2, obj)) {
                z6 = true;
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: e */
    public static Set m19265e(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC17660E.m19257b(objArr.length));
        AbstractC17678l.m19290M(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: f */
    public static LinkedHashSet m19266f(Set set, Iterable elements) {
        int size;
        AbstractC16544l.m18094g(set, "<this>");
        AbstractC16544l.m18094g(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC17660E.m19257b(size));
        linkedHashSet.addAll(set);
        AbstractC17686t.m19398v(elements, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: g */
    public static LinkedHashSet m19267g(Set set, Object obj) {
        AbstractC16544l.m18094g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC17660E.m19257b(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: h */
    public static Set m19268h(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC16544l.m18093f(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* JADX INFO: renamed from: d */
    public static Set m19264d(Set set, Iterable elements) {
        AbstractC16544l.m18094g(set, bQBnquXS.nvnsH);
        AbstractC16544l.m18094g(elements, "elements");
        Collection<?> collectionM19400x = AbstractC17686t.m19400x(elements);
        if (collectionM19400x.isEmpty()) {
            return AbstractC17680n.m19328G0(set);
        }
        if (!(collectionM19400x instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM19400x);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM19400x).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }
}
