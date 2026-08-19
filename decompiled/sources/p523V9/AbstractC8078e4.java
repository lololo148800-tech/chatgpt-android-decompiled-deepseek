package p523V9;

import ge.C14036K0;
import ge.C14109w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p100Dk.AbstractC2082i;
import p100Dk.C2074a;
import p100Dk.C2075b;
import p100Dk.C2076c;
import p100Dk.C2077d;
import p100Dk.C2078e;
import p100Dk.C2079f;
import p100Dk.C2080g;
import p100Dk.C2081h;
import p124Ei.C2463L0;
import p193Hf.C3321N;
import p229J0.AbstractC3984T1;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p637a3.AbstractC10494k;
import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;
import p656b3.AbstractC11226e;
import p656b3.C11223b;
import p656b3.InterfaceC11222a;
import p672c3.C11566C;
import p672c3.C11612j0;
import p672c3.C11627r;
import p672c3.C11628r0;
import p776h3.C14394h;
import p776h3.C14398l;
import p776h3.C14404r;
import p884m3.AbstractC17148g;
import p884m3.C17146e;
import p884m3.C17147f;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: V9.e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8078e4 {
    /* JADX INFO: renamed from: a */
    public static final void m8494a(InterfaceC1426a onDismiss, InterfaceC1426a onConfirm, InterfaceC1426a onSettings, boolean z6, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onConfirm, "onConfirm");
        AbstractC16544l.m18094g(onSettings, "onSettings");
        c6021p.m6526U(-1576993160);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismiss) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onConfirm) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onSettings) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3984T1.m4682a(onDismiss, AbstractC8411c.m8969c(-1509386048, c6021p, new C14036K0(onDismiss, onConfirm, 1)), null, AbstractC8411c.m8969c(248241090, c6021p, new C3321N(14, onDismiss)), null, null, AbstractC8411c.m8969c(737198149, c6021p, new C14109w0(z6, onDismiss, onSettings)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, (i12 & 14) | 1575984, 0, 16308);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(onDismiss, onConfirm, onSettings, z6, i10, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10497n m8495b(ArrayList arrayList) {
        InterfaceC10497n interfaceC10497nMo10952b;
        C10495l c10495l = C10495l.f31097a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC10497n interfaceC10497n = (InterfaceC10497n) it.next();
            if (interfaceC10497n != null && (interfaceC10497nMo10952b = c10495l.mo10952b(interfaceC10497n)) != null) {
                c10495l = interfaceC10497nMo10952b;
            }
        }
        return c10495l;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX INFO: renamed from: c */
    public static final void m8496c(C11628r0 c11628r0) {
        boolean zIsEmpty = c11628r0.f31096c.isEmpty();
        ArrayList<InterfaceC10492i> arrayList = c11628r0.f31096c;
        if (!zIsEmpty) {
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((InterfaceC10492i) it.next()) instanceof C11566C)) {
                            if (arrayList.size() != 1) {
                                C14394h c14394h = new C14394h();
                                AbstractC17686t.m19398v(arrayList, c14394h.f31096c);
                                arrayList.clear();
                                arrayList.add(c14394h);
                            }
                        }
                    }
                }
            }
            for (InterfaceC10492i interfaceC10492i : arrayList) {
                AbstractC16544l.m18092e(interfaceC10492i, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
                ArrayList arrayList2 = ((C11566C) interfaceC10492i).f31096c;
                if (arrayList2.size() != 1) {
                    C14394h c14394h2 = new C14394h();
                    AbstractC17686t.m19398v(arrayList2, c14394h2.f31096c);
                    arrayList2.clear();
                    arrayList2.add(c14394h2);
                }
            }
        } else if (arrayList.size() != 1) {
            C14394h c14394h3 = new C14394h();
            AbstractC17686t.m19398v(arrayList, c14394h3.f31096c);
            arrayList.clear();
            arrayList.add(c14394h3);
        }
        m8497d(c11628r0);
        m8499f(c11628r0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m8497d(AbstractC10494k abstractC10494k) {
        for (InterfaceC10492i interfaceC10492i : abstractC10494k.f31096c) {
            if (interfaceC10492i instanceof AbstractC10494k) {
                m8497d((AbstractC10494k) interfaceC10492i);
            }
        }
        C14398l c14398l = (C14398l) abstractC10494k.mo10956b().mo10954j(null, C11612j0.f35150y0);
        AbstractC17148g abstractC17148g = C17147f.f54817a;
        boolean z6 = (c14398l != null ? c14398l.f45139a : abstractC17148g) instanceof C17147f;
        ArrayList arrayList = abstractC10494k.f31096c;
        C17146e c17146e = C17146e.f54816a;
        if (z6 && (!(arrayList instanceof Collection) || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14398l c14398l2 = (C14398l) ((InterfaceC10492i) it.next()).mo10956b().mo10954j(null, C11612j0.f35128A0);
                if ((c14398l2 != null ? c14398l2.f45139a : null) instanceof C17146e) {
                    abstractC10494k.mo10957c(abstractC10494k.mo10956b().mo10952b(new C14398l(c17146e)));
                    break;
                }
            }
        }
        C14404r c14404r = (C14404r) abstractC10494k.mo10956b().mo10954j(null, C11612j0.f35151z0);
        if (c14404r != null) {
            abstractC17148g = c14404r.f45151a;
        }
        if (abstractC17148g instanceof C17147f) {
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C14404r c14404r2 = (C14404r) ((InterfaceC10492i) it2.next()).mo10956b().mo10954j(null, C11612j0.f35129B0);
                if ((c14404r2 != null ? c14404r2.f45151a : null) instanceof C17146e) {
                    abstractC10494k.mo10957c(abstractC10494k.mo10956b().mo10952b(new C14404r(c17146e)));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Object m8498e(AbstractC2082i abstractC2082i) {
        AbstractC16544l.m18094g(abstractC2082i, "<this>");
        if (abstractC2082i instanceof C2074a) {
            C2074a c2074a = (C2074a) abstractC2082i;
            return AbstractC17659D.m19244f(new C17309l("street_1", c2074a.f6407Y), new C17309l("street_2", c2074a.f6408Z), new C17309l("city", c2074a.f6409o0), new C17309l("subdivision", c2074a.f6410p0), new C17309l("postal_code", c2074a.f6411q0));
        }
        if (abstractC2082i instanceof C2077d) {
            return ((C2077d) abstractC2082i).f6414Y;
        }
        if (abstractC2082i instanceof C2078e) {
            return ((C2078e) abstractC2082i).f6415Y;
        }
        if (abstractC2082i instanceof C2075b) {
            return Boolean.valueOf(((C2075b) abstractC2082i).f6412Y);
        }
        if (abstractC2082i instanceof C2076c) {
            return ((C2076c) abstractC2082i).f6413Y;
        }
        if (abstractC2082i instanceof C2079f) {
            String str = ((C2079f) abstractC2082i).f6416Y;
            return str == null ? "" : str;
        }
        if (abstractC2082i instanceof C2080g) {
            C2080g c2080g = (C2080g) abstractC2082i;
            return AbstractC17659D.m19244f(new C17309l("dg1", c2080g.f6417Y), new C17309l("dg2", c2080g.f6418Z), new C17309l("sod", c2080g.f6419o0));
        }
        if (!(abstractC2082i instanceof C2081h)) {
            throw new C0644w();
        }
        C2081h c2081h = (C2081h) abstractC2082i;
        return AbstractC17659D.m19244f(new C17309l("idb_country", c2081h.f6420Y), new C17309l("idb_type", c2081h.f6421Z), new C17309l("idb_value", c2081h.f6422o0));
    }

    /* JADX INFO: renamed from: f */
    public static final void m8499f(AbstractC10494k abstractC10494k) {
        C11627r c11627r = C11627r.f35238s0;
        int i10 = 0;
        for (Object obj : abstractC10494k.f31096c) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            InterfaceC10492i interfaceC10492i = (InterfaceC10492i) c11627r.invoke((InterfaceC10492i) obj);
            abstractC10494k.f31096c.set(i10, interfaceC10492i);
            if (interfaceC10492i instanceof AbstractC10494k) {
                m8499f((AbstractC10494k) interfaceC10492i);
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final LinkedHashMap m8500g(AbstractC10494k abstractC10494k) {
        ArrayList arrayList = abstractC10494k.f31096c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            InterfaceC10492i interfaceC10492i = (InterfaceC10492i) obj;
            InterfaceC10497n interfaceC10497nMo10956b = interfaceC10492i.mo10956b();
            C17309l c17309l = interfaceC10497nMo10956b.mo10951a(C11627r.f35236q0) ? (C17309l) interfaceC10497nMo10956b.mo10954j(new C17309l(null, C10495l.f31097a), C11612j0.f35148w0) : new C17309l(null, interfaceC10497nMo10956b);
            C11223b c11223b = (C11223b) c17309l.f55136Y;
            InterfaceC10497n interfaceC10497n = (InterfaceC10497n) c17309l.f55137Z;
            InterfaceC11222a interfaceC11222a = c11223b != null ? c11223b.f33979a : null;
            C17309l c17309l2 = interfaceC11222a instanceof AbstractC11226e ? new C17309l(interfaceC11222a, interfaceC10497n) : new C17309l(null, interfaceC10497n);
            if (interfaceC10492i instanceof AbstractC10494k) {
                for (Map.Entry entry : m8500g((AbstractC10494k) interfaceC10492i).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i10 = i11;
        }
        return linkedHashMap;
    }
}
