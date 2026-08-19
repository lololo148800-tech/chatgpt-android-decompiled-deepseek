package p086D6;

import java.util.Collection;
import java.util.Iterator;
import mm.C17296C;
import p002A0.C0132i;
import p032B4.C0806a;
import p060C6.C1607d;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p826j6.C16137F;
import p900n6.C17509f;
import p909nm.C17690x;
import p917o6.C17851d;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17870w;
import p917o6.C17872y;
import p942p6.EnumC18300d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: D6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1959c implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1961e f5795Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17852e f5796Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f5797o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC2186j f5798p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16137F f5799q0;

    public C1959c(C1961e c1961e, C17852e c17852e, boolean z6, InterfaceC2186j interfaceC2186j, C16137F c16137f) {
        this.f5795Y = c1961e;
        this.f5796Z = c17852e;
        this.f5797o0 = z6;
        this.f5798p0 = interfaceC2186j;
        this.f5799q0 = c16137f;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:1: B:35:0x0093->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        Object obj2;
        Object objMo395a;
        Iterable iterable;
        Iterator it;
        C17853f c17853f = (C17853f) obj;
        Object obj3 = c17853f.f56934d;
        C1961e c1961e = this.f5795Y;
        c1961e.getClass();
        C17296C c17296c = C17296C.f55119a;
        C17852e c17852e = this.f5796Z;
        InterfaceC2186j interfaceC2186j = this.f5798p0;
        if (obj3 != null) {
            Iterable iterable2 = (Iterable) obj3;
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                obj2 = c17853f.f56934d;
                if (obj2 != null) {
                    iterable = (Iterable) obj2;
                    if (iterable instanceof Collection) {
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            if (((C17872y) it.next()).f56969a.equalsIgnoreCase("PersistedQueryNotSupported")) {
                                objMo395a = interfaceC2186j.mo395a(new C17853f(c17852e.f56922b, c17852e.f56921a, null, null, new C1607d("The server does not support auto persisted queries", null), C17690x.f56481Y, C17870w.f56967a, false), interfaceC18770c);
                                if (objMo395a != EnumC19250a.f61036Y) {
                                    return c17296c;
                                }
                            }
                        }
                        C0806a c0806aM19598a = c17853f.m19598a();
                        c0806aM19598a.m1842a(new C17509f());
                        objMo395a = interfaceC2186j.mo395a(c0806aM19598a.m1843b(), interfaceC18770c);
                        if (objMo395a != EnumC19250a.f61036Y) {
                            return c17296c;
                        }
                    } else {
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            if (((C17872y) it.next()).f56969a.equalsIgnoreCase("PersistedQueryNotSupported")) {
                                objMo395a = interfaceC2186j.mo395a(new C17853f(c17852e.f56922b, c17852e.f56921a, null, null, new C1607d("The server does not support auto persisted queries", null), C17690x.f56481Y, C17870w.f56967a, false), interfaceC18770c);
                                if (objMo395a != EnumC19250a.f61036Y) {
                                    return c17296c;
                                }
                            }
                        }
                        C0806a c0806aM19598a2 = c17853f.m19598a();
                        c0806aM19598a2.m1842a(new C17509f());
                        objMo395a = interfaceC2186j.mo395a(c0806aM19598a2.m1843b(), interfaceC18770c);
                        if (objMo395a != EnumC19250a.f61036Y) {
                            return c17296c;
                        }
                    }
                } else {
                    C0806a c0806aM19598a3 = c17853f.m19598a();
                    c0806aM19598a3.m1842a(new C17509f());
                    objMo395a = interfaceC2186j.mo395a(c0806aM19598a3.m1843b(), interfaceC18770c);
                    if (objMo395a != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                }
            } else {
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    if (((C17872y) it2.next()).f56969a.equalsIgnoreCase("PersistedQueryNotFound")) {
                        C17851d c17851dM19597a = c17852e.m19597a();
                        c17851dM19597a.f56914d = this.f5797o0 ? EnumC18300d.f58414Z : c1961e.f5807b;
                        Boolean bool = Boolean.TRUE;
                        c17851dM19597a.f56918h = bool;
                        c17851dM19597a.f56917g = bool;
                        InterfaceC2184i interfaceC2184iM17695n = this.f5799q0.m17695n(c17851dM19597a.m19596a());
                        AbstractC2124C.m3219r(interfaceC2186j);
                        objMo395a = interfaceC2184iM17695n.mo3141d(new C0132i(interfaceC2186j, 2, c1961e), interfaceC18770c);
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        if (objMo395a != enumC19250a) {
                            objMo395a = c17296c;
                        }
                        if (objMo395a != enumC19250a) {
                            objMo395a = c17296c;
                        }
                        if (objMo395a != enumC19250a) {
                            return c17296c;
                        }
                    }
                }
                obj2 = c17853f.f56934d;
                if (obj2 != null) {
                    iterable = (Iterable) obj2;
                    if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            if (((C17872y) it.next()).f56969a.equalsIgnoreCase("PersistedQueryNotSupported")) {
                                objMo395a = interfaceC2186j.mo395a(new C17853f(c17852e.f56922b, c17852e.f56921a, null, null, new C1607d("The server does not support auto persisted queries", null), C17690x.f56481Y, C17870w.f56967a, false), interfaceC18770c);
                                if (objMo395a != EnumC19250a.f61036Y) {
                                    return c17296c;
                                }
                            }
                        }
                        C0806a c0806aM19598a4 = c17853f.m19598a();
                        c0806aM19598a4.m1842a(new C17509f());
                        objMo395a = interfaceC2186j.mo395a(c0806aM19598a4.m1843b(), interfaceC18770c);
                        if (objMo395a != EnumC19250a.f61036Y) {
                            return c17296c;
                        }
                    } else {
                        C0806a c0806aM19598a5 = c17853f.m19598a();
                        c0806aM19598a5.m1842a(new C17509f());
                        objMo395a = interfaceC2186j.mo395a(c0806aM19598a5.m1843b(), interfaceC18770c);
                        if (objMo395a != EnumC19250a.f61036Y) {
                            return c17296c;
                        }
                    }
                } else {
                    C0806a c0806aM19598a6 = c17853f.m19598a();
                    c0806aM19598a6.m1842a(new C17509f());
                    objMo395a = interfaceC2186j.mo395a(c0806aM19598a6.m1843b(), interfaceC18770c);
                    if (objMo395a != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                }
            }
        } else {
            obj2 = c17853f.f56934d;
            if (obj2 != null) {
                iterable = (Iterable) obj2;
                if (iterable instanceof Collection) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((C17872y) it.next()).f56969a.equalsIgnoreCase("PersistedQueryNotSupported")) {
                            objMo395a = interfaceC2186j.mo395a(new C17853f(c17852e.f56922b, c17852e.f56921a, null, null, new C1607d("The server does not support auto persisted queries", null), C17690x.f56481Y, C17870w.f56967a, false), interfaceC18770c);
                            if (objMo395a != EnumC19250a.f61036Y) {
                                return c17296c;
                            }
                        }
                    }
                    C0806a c0806aM19598a7 = c17853f.m19598a();
                    c0806aM19598a7.m1842a(new C17509f());
                    objMo395a = interfaceC2186j.mo395a(c0806aM19598a7.m1843b(), interfaceC18770c);
                    if (objMo395a != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                } else {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((C17872y) it.next()).f56969a.equalsIgnoreCase("PersistedQueryNotSupported")) {
                            objMo395a = interfaceC2186j.mo395a(new C17853f(c17852e.f56922b, c17852e.f56921a, null, null, new C1607d("The server does not support auto persisted queries", null), C17690x.f56481Y, C17870w.f56967a, false), interfaceC18770c);
                            if (objMo395a != EnumC19250a.f61036Y) {
                                return c17296c;
                            }
                        }
                    }
                    C0806a c0806aM19598a8 = c17853f.m19598a();
                    c0806aM19598a8.m1842a(new C17509f());
                    objMo395a = interfaceC2186j.mo395a(c0806aM19598a8.m1843b(), interfaceC18770c);
                    if (objMo395a != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                }
            } else {
                C0806a c0806aM19598a9 = c17853f.m19598a();
                c0806aM19598a9.m1842a(new C17509f());
                objMo395a = interfaceC2186j.mo395a(c0806aM19598a9.m1843b(), interfaceC18770c);
                if (objMo395a != EnumC19250a.f61036Y) {
                    return c17296c;
                }
            }
        }
        return objMo395a;
    }
}
