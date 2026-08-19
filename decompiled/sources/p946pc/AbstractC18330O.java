package p946pc;

import androidx.compose.foundation.layout.AbstractC10842a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kp.AbstractC16648c;
import nc.C17567n;
import om.C18235b;
import p003A1.AbstractC0187M0;
import p042Bf.C1268j;
import p042Bf.C1269k;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p204I1.C3582M;
import p221Ii.C3726e;
import p328N1.C5609y;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.C7548m;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8079e5;
import p537W0.C8410b;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9393x3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: pc.O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18330O {

    /* JADX INFO: renamed from: a */
    public static final C3582M f58513a = new C3582M(0, 0, C5609y.f18158u0, null, null, 16777211);

    /* JADX INFO: renamed from: b */
    public static final long f58514b = AbstractC9119D4.m9650c(8);

    /* JADX INFO: renamed from: c */
    public static final long f58515c = C14365u.f45060j;

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static final void m19852a(C18320E c18320e, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, C17567n c17567n, C6021p c6021p, int i10) {
        int i11;
        Object next;
        List list;
        C18235b c18235b;
        boolean z6;
        InterfaceC10459q interfaceC10459q2;
        C18320E c18320e2 = c18320e;
        C6021p c6021p2 = c6021p;
        AbstractC16544l.m18094g(c18320e2, "<this>");
        c6021p2.m6526U(-750323390);
        if ((i10 & 14) == 0) {
            i11 = (c6021p2.m6542f(c18320e2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i10 & 896) == 0) {
            i12 |= c6021p2.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i12 |= c6021p2.m6545h(c17567n) ? 2048 : 1024;
        }
        int i13 = i12;
        if ((i13 & 5851) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C18333S c18333s = AbstractC18322G.m19850c(AbstractC18322G.m19849b(c18320e2, c6021p2)).f58486f;
            AbstractC16544l.m18091d(c18333s);
            long jM19845d = AbstractC18319D.m19845d(c18320e2, c6021p2);
            c6021p2.m6525T(1157296644);
            boolean zM6542f = c6021p2.m6542f(interfaceC1436k);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                if (interfaceC1436k != null) {
                    C18325J c18325j = new C18325J();
                    interfaceC1436k.invoke(c18325j);
                    objM6514H = c18325j.f58496a;
                } else {
                    objM6514H = null;
                }
                c6021p2.m6537c0(objM6514H);
            }
            boolean z10 = false;
            c6021p2.m6553p(false);
            C18332Q c18332q = (C18332Q) objM6514H;
            c6021p2.m6525T(1157296644);
            boolean zM6542f2 = c6021p2.m6542f(c17567n);
            Object objM6514H2 = c6021p.m6514H();
            Object obj = objM6514H2;
            if (zM6542f2 || objM6514H2 == c5975s) {
                C18327L c18327l = new C18327L();
                c17567n.invoke(c18327l);
                ArrayList arrayList = c18327l.f58505a;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C18325J) it.next()).f58496a);
                }
                c6021p2.m6537c0(arrayList2);
                obj = arrayList2;
            }
            c6021p2.m6553p(false);
            List list2 = (List) obj;
            c6021p2.m6525T(511388516);
            boolean zM6542f3 = c6021p2.m6542f(c18332q) | c6021p2.m6542f(list2);
            Object objM6514H3 = c6021p.m6514H();
            C6021p c6021p3 = c6021p2;
            if (zM6542f3 || objM6514H3 == c5975s) {
                int size = c18332q != null ? c18332q.f58518a.size() : 0;
                Iterator it2 = list2.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int size2 = ((C18332Q) next).f58518a.size();
                        c6021p2 = c6021p2;
                        while (true) {
                            Object next2 = it2.next();
                            int size3 = ((C18332Q) next2).f58518a.size();
                            if (size2 < size3) {
                                size2 = size3;
                                next = next2;
                            }
                            if (!it2.hasNext()) {
                                break;
                            }
                            c18320e2 = c18320e;
                            c6021p2 = c6021p;
                        }
                    }
                } else {
                    next = null;
                }
                C18332Q c18332q2 = (C18332Q) next;
                objM6514H3 = Integer.valueOf(Math.max(size, c18332q2 != null ? c18332q2.f58518a.size() : 0));
                c6021p2.m6537c0(objM6514H3);
                z10 = false;
                c6021p3 = c6021p2;
            }
            c6021p3.m6553p(z10);
            int iIntValue = ((Number) objM6514H3).intValue();
            C3582M c3582mM4280g = AbstractC18319D.m19846e(c18320e2, c6021p3).m4280g(c18333s.f58520a);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p3.m6548k(AbstractC0187M0.f704f);
            C7548m c7548m = c18333s.f58521b;
            AbstractC16544l.m18091d(c7548m);
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC8079e5.m8502b(c10456n), interfaceC7537b.mo7870w(c7548m.f23910a));
            c6021p3.m6525T(1618982084);
            boolean zM6542f4 = c6021p3.m6542f(c18332q) | c6021p3.m6542f(list2) | c6021p3.m6542f(interfaceC10459qM11233k);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f4 || objM6514H4 == c5975s) {
                C18235b c18235bM9972b = AbstractC9393x3.m9972b();
                if (c18332q != null) {
                    Iterable iterable = (Iterable) c18332q.f58518a;
                    char c9 = '\n';
                    ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(new C8410b(new C1268j((Object) c18320e, (Object) c3582mM4280g, interfaceC10459qM11233k, (InterfaceC1440o) it3.next(), 18), true, -1072860392));
                        arrayList3 = arrayList4;
                        list2 = list2;
                        c18235bM9972b = c18235bM9972b;
                        c9 = '\n';
                    }
                    list = list2;
                    c18235b = c18235bM9972b;
                    z6 = true;
                    c18235b.add(arrayList3);
                } else {
                    list = list2;
                    c18235b = c18235bM9972b;
                    z6 = true;
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    Iterable iterable2 = (Iterable) ((C18332Q) it4.next()).f58518a;
                    ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
                    Iterator it5 = iterable2.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(new C8410b(new C18328M(interfaceC10459qM11233k, (InterfaceC1440o) it5.next(), 1), true, -779987087));
                        z6 = true;
                        it4 = it4;
                    }
                    c18235b.add(arrayList5);
                    it4 = it4;
                }
                objM6514H4 = AbstractC9393x3.m9971a(c18235b);
                c6021p3.m6537c0(objM6514H4);
            }
            c6021p3.m6553p(false);
            List list3 = (List) objM6514H4;
            Float f10 = c18333s.f58523d;
            AbstractC16544l.m18091d(f10);
            float fFloatValue = f10.floatValue();
            c6021p3.m6525T(-236203683);
            boolean zM6542f5 = c6021p3.m6542f(c18333s) | c6021p3.m6540e(jM19845d);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f5 || objM6514H5 == c5975s) {
                objM6514H5 = new C3726e(c18333s, jM19845d, 2);
                c6021p3.m6537c0(objM6514H5);
            }
            c6021p3.m6553p(false);
            AbstractC16648c.m18464a(iIntValue, list3, (InterfaceC1436k) objM6514H5, fFloatValue, c10456n, c6021p, ((i13 << 9) & 57344) | 64);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k((Object) c18320e, interfaceC10459q2, (Object) interfaceC1436k, (Object) c17567n, i10, 28);
        }
    }
}
