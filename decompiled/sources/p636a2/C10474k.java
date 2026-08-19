package p636a2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p334Na.AbstractC5695b;
import p349O0.InterfaceC5985X;
import p437Rn.C6959q;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p552Wg.C8847i;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p655b2.C11219c;
import p716e2.C13265b;
import p716e2.C13266c;
import p738f2.C13529a;
import p760g2.C13804a;
import p760g2.C13807d;
import p760g2.C13808e;
import p909nm.C17690x;

/* JADX INFO: renamed from: a2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10474k implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C10481r f31020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C10479p f31021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC5985X f31022c;

    public C10474k(C10481r c10481r, C10479p c10479p, InterfaceC5985X interfaceC5985X) {
        this.f31020a = c10481r;
        this.f31021b = c10479p;
        this.f31022c = interfaceC5985X;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0304  */
    /* JADX WARN: Code duplicated, block: B:118:0x031b  */
    /* JADX WARN: Code duplicated, block: B:175:0x01c3 A[EDGE_INSN: B:175:0x01c3->B:57:0x01c3 BREAK  A[LOOP:4: B:49:0x0198->B:177:0x0198], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x0150 A[LOOP:3: B:45:0x014a->B:47:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:77:0x022e  */
    /* JADX WARN: Code duplicated, block: B:83:0x024e  */
    /* JADX WARN: Code duplicated, block: B:88:0x026a A[LOOP:8: B:86:0x0264->B:88:0x026a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0296  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a2  */
    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M MeasurePolicy, List measurables, long j10) {
        C13266c c13266c;
        C13266c c13266c2;
        Iterator it;
        C10482s state;
        Iterator it2;
        C10482s c10482sM10947c;
        C13265b c13265b;
        HashMap map;
        Iterator it3;
        boolean zHasNext;
        HashMap map2;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        C13807d c13807dMo14865d;
        C13265b c13265b2;
        Iterator it7;
        C13265b c13265b3;
        C13529a c13529a;
        C13804a c13804aM15083h;
        C13529a c13529a2;
        Iterator it8;
        C13265b c13265b4;
        C13807d c13807dMo14865d2;
        C13808e c13808e;
        C13265b c13265b5;
        C13529a c13529a3;
        C13804a c13804aM15083h2;
        Object next;
        C13804a c13804aM15083h3;
        C13265b c13265bM10948a;
        C13265b c13265b6;
        C13807d c13807dMo14865d3;
        AbstractC16544l.m18094g(MeasurePolicy, "$this$MeasurePolicy");
        AbstractC16544l.m18094g(measurables, "measurables");
        EnumC7546k layoutDirection = MeasurePolicy.getLayoutDirection();
        C10481r c10481r = this.f31020a;
        AbstractC16544l.m18094g(layoutDirection, "layoutDirection");
        C10479p constraintSet = this.f31021b;
        AbstractC16544l.m18094g(constraintSet, "constraintSet");
        c10481r.f31049e = MeasurePolicy;
        C10482s c10482sM10947c2 = c10481r.m10947c();
        boolean zM7852g = C7536a.m7852g(j10);
        Object obj = C13266c.f41925g;
        Object obj2 = C13266c.f41924f;
        if (zM7852g) {
            int iM7854i = C7536a.m7854i(j10);
            c13266c = new C13266c(obj2);
            c13266c.f41932d = null;
            c13266c.f41931c = iM7854i;
        } else {
            c13266c = new C13266c(obj);
            int iM7856k = C7536a.m7856k(j10);
            if (iM7856k >= 0) {
                c13266c.f41929a = iM7856k;
            }
        }
        c10482sM10947c2.f31056d.f41891I = c13266c;
        C10482s c10482sM10947c3 = c10481r.m10947c();
        if (C7536a.m7851f(j10)) {
            int iM7853h = C7536a.m7853h(j10);
            c13266c2 = new C13266c(obj2);
            c13266c2.f41932d = null;
            c13266c2.f41931c = iM7853h;
        } else {
            C13266c c13266c3 = new C13266c(obj);
            int iM7855j = C7536a.m7855j(j10);
            if (iM7855j >= 0) {
                c13266c3.f41929a = iM7855j;
            }
            c13266c2 = c13266c3;
        }
        c10482sM10947c3.f31056d.f41892J = c13266c2;
        c10481r.m10947c().f31058f = j10;
        C10482s c10482sM10947c4 = c10481r.m10947c();
        c10482sM10947c4.getClass();
        c10482sM10947c4.f31059g = layoutDirection;
        LinkedHashMap linkedHashMap = c10481r.f31046b;
        linkedHashMap.clear();
        c10481r.f31047c.clear();
        c10481r.f31048d.clear();
        boolean z6 = constraintSet.f31040p0;
        ArrayList arrayList = constraintSet.f31042r0;
        C13808e c13808e2 = c10481r.f31045a;
        if (z6 || measurables.size() != arrayList.size()) {
            C10482s c10482sM10947c5 = c10481r.m10947c();
            HashMap mReferences = c10482sM10947c5.f31053a;
            AbstractC16544l.m18093f(mReferences, "mReferences");
            it = mReferences.entrySet().iterator();
            while (it.hasNext()) {
                c13265b6 = (C13265b) ((Map.Entry) it.next()).getValue();
                if (c13265b6 != null && (c13807dMo14865d3 = c13265b6.mo14865d()) != null) {
                    c13807dMo14865d3.mo15359D();
                }
            }
            mReferences.clear();
            mReferences.put(0, c10482sM10947c5.f31056d);
            c10482sM10947c5.f31060h.clear();
            c10482sM10947c5.f31061i = true;
            c10482sM10947c5.f31054b.clear();
            c10482sM10947c5.f31055c.clear();
            state = c10481r.m10947c();
            AbstractC16544l.m18094g(state, "state");
            it2 = constraintSet.f31037Y.f31028a.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1436k) it2.next()).invoke(state);
            }
            arrayList.clear();
            constraintSet.f31039o0.m10123c(C17296C.f55119a, constraintSet.f31041q0, new C6959q(measurables, state, constraintSet, 9));
            constraintSet.f31040p0 = false;
            AbstractC5695b.m6135b(c10481r.m10947c(), measurables);
            c10482sM10947c = c10481r.m10947c();
            c10482sM10947c.getClass();
            c13808e2.f43711r0.clear();
            c13265b = c10482sM10947c.f31056d;
            c13265b.f41891I.m14870b(c13808e2, 0);
            c13265b.f41892J.m14870b(c13808e2, 1);
            map = c10482sM10947c.f31054b;
            it3 = map.keySet().iterator();
            while (true) {
                zHasNext = it3.hasNext();
                map2 = c10482sM10947c.f31053a;
                if (zHasNext) {
                    break;
                }
                next = it3.next();
                c13804aM15083h3 = ((C13529a) map.get(next)).m15083h();
                if (c13804aM15083h3 == null) {
                    c13265bM10948a = (C13265b) map2.get(next);
                    if (c13265bM10948a == null) {
                        c13265bM10948a = c10482sM10947c.m10948a(next);
                    }
                    c13265bM10948a.f41894L = c13804aM15083h3;
                    c13804aM15083h3.f43668g0 = c13265bM10948a.f41893K;
                }
            }
            for (Object obj3 : map2.keySet()) {
                c13265b5 = (C13265b) map2.get(obj3);
                if (c13265b5 != c13265b) {
                    c13529a3 = c13265b5.f41900c;
                    if (!(c13529a3 instanceof C13529a) && (c13804aM15083h2 = c13529a3.m15083h()) != null) {
                        C13265b c13265bM10948a2 = (C13265b) map2.get(obj3);
                        if (c13265bM10948a2 == null) {
                            c13265bM10948a2 = c10482sM10947c.m10948a(obj3);
                        }
                        c13265bM10948a2.f41894L = c13804aM15083h2;
                        c13804aM15083h2.f43668g0 = c13265bM10948a2.f41893K;
                    }
                }
            }
            it4 = map2.keySet().iterator();
            while (it4.hasNext()) {
                c13265b4 = (C13265b) map2.get(it4.next());
                if (c13265b4 != c13265b) {
                    c13807dMo14865d2 = c13265b4.mo14865d();
                    c13807dMo14865d2.f43672i0 = c13265b4.f41898a.toString();
                    c13807dMo14865d2.f43649U = null;
                    c13808e2.f43711r0.add(c13807dMo14865d2);
                    c13808e = c13807dMo14865d2.f43649U;
                    if (c13808e != null) {
                        c13808e.f43711r0.remove(c13807dMo14865d2);
                        c13807dMo14865d2.mo15359D();
                    }
                    c13807dMo14865d2.f43649U = c13808e2;
                } else {
                    c13265b4.f41894L = c13808e2;
                    c13808e2.f43668g0 = c13265b4.f41893K;
                }
            }
            it5 = map.keySet().iterator();
            while (it5.hasNext()) {
                c13529a2 = (C13529a) map.get(it5.next());
                if (c13529a2.m15083h() != null) {
                    it8 = c13529a2.f42818Q.iterator();
                    while (it8.hasNext()) {
                        c13529a2.m15083h().m15415U(((C13265b) map2.get(it8.next())).mo14865d());
                    }
                    c13529a2.mo14862a();
                } else {
                    c13529a2.mo14862a();
                }
            }
            it6 = map2.keySet().iterator();
            while (it6.hasNext()) {
                c13265b2 = (C13265b) map2.get(it6.next());
                if (c13265b2 != c13265b) {
                    c13529a = c13265b2.f41900c;
                    if ((c13529a instanceof C13529a) || (c13804aM15083h = c13529a.m15083h()) == null) {
                        it7 = it6;
                        c13265b3 = c13265b;
                    } else {
                        for (Object obj4 : c13529a.f42818Q) {
                            C13265b c13265b7 = (C13265b) map2.get(obj4);
                            if (c13265b7 != null) {
                                c13804aM15083h.m15415U(c13265b7.mo14865d());
                            } else {
                                if (obj4 instanceof C13265b) {
                                    c13804aM15083h.m15415U(((C13265b) obj4).mo14865d());
                                } else {
                                    System.out.println("couldn't find reference for " + obj4);
                                }
                                it6 = it6;
                                c13265b = c13265b;
                            }
                            it6 = it6;
                            c13265b = c13265b;
                        }
                        it7 = it6;
                        c13265b3 = c13265b;
                        c13265b2.mo14862a();
                    }
                } else {
                    it7 = it6;
                    c13265b3 = c13265b;
                }
                it6 = it7;
                c13265b = c13265b3;
            }
            for (Object obj5 : map2.keySet()) {
                C13265b c13265b8 = (C13265b) map2.get(obj5);
                c13265b8.mo14862a();
                c13807dMo14865d = c13265b8.mo14865d();
                if (c13807dMo14865d == null && obj5 != null) {
                    c13807dMo14865d.f43675k = obj5.toString();
                }
            }
        } else {
            int size = measurables.size() - 1;
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Object objMo21534t = ((InterfaceC21056J) measurables.get(i10)).mo21534t();
                    if (!AbstractC16544l.m18089b(objMo21534t instanceof C10475l ? (C10475l) objMo21534t : null, arrayList.get(i10))) {
                        C10482s c10482sM10947c6 = c10481r.m10947c();
                        HashMap mReferences2 = c10482sM10947c6.f31053a;
                        AbstractC16544l.m18093f(mReferences2, "mReferences");
                        it = mReferences2.entrySet().iterator();
                        while (it.hasNext()) {
                            c13265b6 = (C13265b) ((Map.Entry) it.next()).getValue();
                            if (c13265b6 != null) {
                                c13807dMo14865d3.mo15359D();
                            }
                        }
                        mReferences2.clear();
                        mReferences2.put(0, c10482sM10947c6.f31056d);
                        c10482sM10947c6.f31060h.clear();
                        c10482sM10947c6.f31061i = true;
                        c10482sM10947c6.f31054b.clear();
                        c10482sM10947c6.f31055c.clear();
                        state = c10481r.m10947c();
                        AbstractC16544l.m18094g(state, "state");
                        it2 = constraintSet.f31037Y.f31028a.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1436k) it2.next()).invoke(state);
                        }
                        arrayList.clear();
                        constraintSet.f31039o0.m10123c(C17296C.f55119a, constraintSet.f31041q0, new C6959q(measurables, state, constraintSet, 9));
                        constraintSet.f31040p0 = false;
                        AbstractC5695b.m6135b(c10481r.m10947c(), measurables);
                        c10482sM10947c = c10481r.m10947c();
                        c10482sM10947c.getClass();
                        c13808e2.f43711r0.clear();
                        c13265b = c10482sM10947c.f31056d;
                        c13265b.f41891I.m14870b(c13808e2, 0);
                        c13265b.f41892J.m14870b(c13808e2, 1);
                        map = c10482sM10947c.f31054b;
                        it3 = map.keySet().iterator();
                        while (true) {
                            zHasNext = it3.hasNext();
                            map2 = c10482sM10947c.f31053a;
                            if (zHasNext) {
                                break;
                                break;
                            }
                            next = it3.next();
                            c13804aM15083h3 = ((C13529a) map.get(next)).m15083h();
                            if (c13804aM15083h3 == null) {
                                c13265bM10948a = (C13265b) map2.get(next);
                                if (c13265bM10948a == null) {
                                    c13265bM10948a = c10482sM10947c.m10948a(next);
                                }
                                c13265bM10948a.f41894L = c13804aM15083h3;
                                c13804aM15083h3.f43668g0 = c13265bM10948a.f41893K;
                            }
                        }
                        while (r10.hasNext()) {
                            c13265b5 = (C13265b) map2.get(obj3);
                            if (c13265b5 != c13265b) {
                                c13529a3 = c13265b5.f41900c;
                                if (!(c13529a3 instanceof C13529a)) {
                                }
                            }
                        }
                        it4 = map2.keySet().iterator();
                        while (it4.hasNext()) {
                            c13265b4 = (C13265b) map2.get(it4.next());
                            if (c13265b4 != c13265b) {
                                c13807dMo14865d2 = c13265b4.mo14865d();
                                c13807dMo14865d2.f43672i0 = c13265b4.f41898a.toString();
                                c13807dMo14865d2.f43649U = null;
                                c13808e2.f43711r0.add(c13807dMo14865d2);
                                c13808e = c13807dMo14865d2.f43649U;
                                if (c13808e != null) {
                                    c13808e.f43711r0.remove(c13807dMo14865d2);
                                    c13807dMo14865d2.mo15359D();
                                }
                                c13807dMo14865d2.f43649U = c13808e2;
                            } else {
                                c13265b4.f41894L = c13808e2;
                                c13808e2.f43668g0 = c13265b4.f41893K;
                            }
                        }
                        it5 = map.keySet().iterator();
                        while (it5.hasNext()) {
                            c13529a2 = (C13529a) map.get(it5.next());
                            if (c13529a2.m15083h() != null) {
                                it8 = c13529a2.f42818Q.iterator();
                                while (it8.hasNext()) {
                                    c13529a2.m15083h().m15415U(((C13265b) map2.get(it8.next())).mo14865d());
                                }
                                c13529a2.mo14862a();
                            } else {
                                c13529a2.mo14862a();
                            }
                        }
                        it6 = map2.keySet().iterator();
                        while (it6.hasNext()) {
                            c13265b2 = (C13265b) map2.get(it6.next());
                            if (c13265b2 != c13265b) {
                                c13529a = c13265b2.f41900c;
                                if (c13529a instanceof C13529a) {
                                    it7 = it6;
                                    c13265b3 = c13265b;
                                } else {
                                    it7 = it6;
                                    c13265b3 = c13265b;
                                }
                            } else {
                                it7 = it6;
                                c13265b3 = c13265b;
                            }
                            it6 = it7;
                            c13265b = c13265b3;
                        }
                        while (r5.hasNext()) {
                            C13265b c13265b9 = (C13265b) map2.get(obj5);
                            c13265b9.mo14862a();
                            c13807dMo14865d = c13265b9.mo14865d();
                            if (c13807dMo14865d == null) {
                            }
                        }
                    } else if (i11 <= size) {
                        i10 = i11;
                    }
                }
            }
            AbstractC5695b.m6135b(c10481r.m10947c(), measurables);
        }
        c13808e2.m15371R(C7536a.m7854i(j10));
        c13808e2.m15366M(C7536a.m7853h(j10));
        c13808e2.f43712s0.m12610L(c13808e2);
        c13808e2.f43702E0 = 257;
        C11219c.f33946p = c13808e2.m15402a0(512);
        c13808e2.m15401Y(c13808e2.f43702E0, 0, 0, 0, 0, 0, 0);
        for (C13807d c13807d : c13808e2.f43711r0) {
            Object obj6 = c13807d.f43668g0;
            if (obj6 instanceof InterfaceC21056J) {
                AbstractC21069X abstractC21069X = (AbstractC21069X) linkedHashMap.get(obj6);
                Integer numValueOf = abstractC21069X == null ? null : Integer.valueOf(abstractC21069X.f66981Y);
                Integer numValueOf2 = abstractC21069X == null ? null : Integer.valueOf(abstractC21069X.f66982Z);
                int iM15387r = c13807d.m15387r();
                if (numValueOf != null && iM15387r == numValueOf.intValue()) {
                    int iM15383l = c13807d.m15383l();
                    if (numValueOf2 != null && iM15383l == numValueOf2.intValue()) {
                    }
                }
                InterfaceC21056J interfaceC21056J = (InterfaceC21056J) obj6;
                int iM15387r2 = c13807d.m15387r();
                int iM15383l2 = c13807d.m15383l();
                if (iM15387r2 < 0 || iM15383l2 < 0) {
                    AbstractC9406z4.m9983b("width(" + iM15387r2 + ") and height(" + iM15383l2 + ") must be >= 0");
                    throw null;
                }
                linkedHashMap.put(obj6, interfaceC21056J.mo21533p(AbstractC9388w4.m9966i(iM15387r2, iM15387r2, iM15383l2, iM15383l2)));
            }
        }
        long jM9643a = AbstractC9113C4.m9643a(c13808e2.m15387r(), c13808e2.m15383l());
        this.f31022c.getValue();
        return MeasurePolicy.mo19936R((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), C17690x.f56481Y, new C8847i(c10481r, 10, measurables));
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
    }
}
