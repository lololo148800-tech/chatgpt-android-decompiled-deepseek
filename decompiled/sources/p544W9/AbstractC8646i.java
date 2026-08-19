package p544W9;

import ge.AbstractC14074f;
import ge.C14036K0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0781s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1084wg.C20951f;
import p1143z4.C21759A;
import p1143z4.C21760B;
import p1155zi.C22001e2;
import p1155zi.C22020j1;
import p1155zi.C22047q0;
import p1155zi.EnumC22004f1;
import p124Ei.C2452G;
import p204I1.C3582M;
import p204I1.C3585a;
import p220Ih.AbstractC3719a;
import p229J0.AbstractC3984T1;
import p229J0.C3991U3;
import p269Kh.C4676c;
import p269Kh.C4679f;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p328N1.InterfaceC5598n;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p393Q1.C6551c;
import p482Tg.C7448e;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p594Y9.AbstractC9769M3;
import p909nm.C17689w;

/* JADX INFO: renamed from: W9.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8646i {
    /* JADX INFO: renamed from: a */
    public static final void m9317a(C4676c availableModelsAndCategories, List list, String str, ArrayList arrayList, InterfaceC1426a onDismiss, InterfaceC1436k onModelSelect, C6021p c6021p, int i10) {
        Object obj;
        Iterator it;
        Iterator it2;
        boolean z6;
        boolean z10;
        boolean z11;
        AbstractC16544l.m18094g(availableModelsAndCategories, "availableModelsAndCategories");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onModelSelect, "onModelSelect");
        c6021p.m6526U(-1617843581);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(availableModelsAndCategories) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(str != null ? new C22020j1(str) : null) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(arrayList) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onModelSelect) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            List list2 = availableModelsAndCategories.f15224a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                C4684k c4684k = ((C4679f) obj2).f15228a;
                c4684k.getClass();
                if (!AbstractC16544l.m18089b(c4684k.f15236a, AbstractC3719a.f11270c.f15236a)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it3.next();
                List list3 = ((C4679f) next).f15229b;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (str == null ? false : AbstractC16544l.m18089b(((C4688o) it4.next()).f15253b, str)) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                } else {
                    z11 = false;
                    break;
                    break;
                }
                if (z11) {
                    obj = next;
                    break;
                }
            }
            C4679f c4679f = (C4679f) obj;
            C4676c.Companion.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                C4679f c4679f2 = (C4679f) next2;
                List list4 = c4679f2.f15229b;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    it2 = it5;
                } else {
                    Iterator it6 = list4.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            C4688o c4688o = (C4688o) it6.next();
                            if (arrayList.isEmpty()) {
                                it = it6;
                                it2 = it5;
                                z6 = false;
                                break;
                            }
                            Iterator it7 = arrayList.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    it = it6;
                                    it2 = it5;
                                    z6 = false;
                                    break;
                                }
                                it = it6;
                                C22001e2 c22001e2 = (C22001e2) it7.next();
                                it2 = it5;
                                if (AbstractC16544l.m18089b(c22001e2.f69636a, c4688o.f15253b)) {
                                    if (c22001e2.f69637b == EnumC22004f1.REGENERATE) {
                                        z6 = true;
                                        break;
                                    }
                                }
                                it5 = it2;
                                it6 = it;
                            }
                            List list5 = list;
                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                Iterator it8 = list5.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        if (AbstractC16544l.m18089b(((C22047q0) it8.next()).f69735a, c4679f2.f15230c.f15253b)) {
                                            z10 = true;
                                            break;
                                        }
                                    } else {
                                        z10 = false;
                                        break;
                                    }
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                            if (z6 || z10) {
                                arrayList3.add(next2);
                            } else {
                                it5 = it2;
                                it6 = it;
                            }
                        } else {
                            it2 = it5;
                        }
                    }
                }
                it5 = it2;
            }
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C3991U3 c3991u3 = new C3991U3(str, 10);
            c6021p.m6524S(-1892987679);
            boolean zM6542f = c6021p.m6542f(c4679f) | c6021p.m6545h(interfaceC20904w) | ((458752 & i11) == 131072);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C7448e(c4679f, interfaceC20904w, onModelSelect, 24);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9769M3.m10374a(arrayList2, c3991u3, c4679f, onDismiss, (InterfaceC1436k) objM6514H, arrayList3, AbstractC14074f.f44293d, c6021p, ((i11 >> 3) & 7168) | 1572864, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G((Object) availableModelsAndCategories, (Object) list, (Object) str, arrayList, onDismiss, onModelSelect, i10, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C3585a m9318b(String str, C3582M c3582m, long j10, InterfaceC7537b interfaceC7537b, InterfaceC5598n interfaceC5598n, C17689w c17689w, int i10, int i11) {
        int i12 = i11 & 32;
        C17689w c17689w2 = C17689w.f56480Y;
        return new C3585a(new C6551c(str, c3582m, i12 != 0 ? c17689w2 : c17689w, c17689w2, interfaceC5598n, interfaceC7537b), i10, false, j10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9319c(InterfaceC1426a onDismiss, InterfaceC1426a onGetPlus, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onGetPlus, "onGetPlus");
        c6021p.m6526U(-604455512);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismiss) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onGetPlus) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1334474916);
            boolean z6 = (i11 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C20951f(1, onDismiss);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H, AbstractC8411c.m8969c(-123437472, c6021p, new C14036K0(onDismiss, onGetPlus, 0)), null, null, null, AbstractC14074f.f44291b, AbstractC14074f.f44292c, null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1769520, 0, 16284);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(onDismiss, onGetPlus, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21759A m9320d(InterfaceC1436k interfaceC1436k) {
        C21760B c21760b = new C21760B();
        interfaceC1436k.invoke(c21760b);
        boolean z6 = c21760b.f69030b;
        C0781s c0781s = c21760b.f69029a;
        return new C21759A(z6, c21760b.f69031c, c21760b.f69032d, false, c21760b.f69033e, c0781s.f2192b, c0781s.f2193c);
    }
}
