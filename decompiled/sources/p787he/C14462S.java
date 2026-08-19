package p787he;

import bf.AbstractC11372a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.C16379g;
import ke.C16380h;
import ke.C16381i;
import mm.C17296C;
import mm.C17309l;
import ne.C17599a;
import p025An.AbstractC0575H;
import p102Dm.AbstractC2119a;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1042uh.C20263a0;
import p1082wd.C20908a;
import p1087wj.AbstractC20994o;
import p1087wj.C20990k;
import p1087wj.C20991l;
import p1087wj.C20992m;
import p1087wj.C20995p;
import p1098x5.C21122a;
import p1098x5.C21123b;
import p1098x5.C21129h;
import p1126yd.InterfaceC21409C;
import p1149zc.C21858t;
import p1149zc.C21861w;
import p1149zc.InterfaceC21862x;
import p1155zi.C21936L0;
import p1155zi.C22011h0;
import p1155zi.C22020j1;
import p148Fi.C2786R0;
import p216Id.C3694b;
import p403Qd.C6636i;
import p523V9.AbstractC7870D5;
import p571X9.AbstractC9233X;
import p759g1.C13803e;
import p873lh.C16960k;
import p886m5.AbstractC17174i;
import p886m5.C17170e;
import p905nd.C17577e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p925oe.C18098X;
import p925oe.C18102a0;
import p925oe.C18108d0;
import p925oe.C18112f0;
import p925oe.C18120j0;
import p925oe.C18121k;
import p925oe.C18123l;
import p925oe.C18124m;
import p925oe.C18125n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: he.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C14462S implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f45547Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f45548Z;

    public /* synthetic */ C14462S(InterfaceC2186j interfaceC2186j, int i10) {
        this.f45547Y = i10;
        this.f45548Z = interfaceC2186j;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:123:0x022f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0271  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:198:0x0356  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0393  */
    /* JADX WARN: Code duplicated, block: B:236:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:258:0x041f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        C16379g c16379g;
        C16380h c16380h;
        C16381i c16381i;
        C16960k c16960k;
        C17170e c17170e;
        C17577e c17577e;
        C17599a c17599a;
        C18121k c18121k;
        C18123l c18123l;
        C18124m c18124m;
        C18125n c18125n;
        C18112f0 c18112f0;
        Object c21936l0 = null;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC2186j interfaceC2186j = this.f45548Z;
        switch (this.f45547Y) {
            case 0:
                Object objMo395a = interfaceC2186j.mo395a((InterfaceC21409C) obj, interfaceC18770c);
                return objMo395a == EnumC19250a.f61036Y ? objMo395a : c17296c;
            case 1:
                if (interfaceC18770c instanceof C16379g) {
                    c16379g = (C16379g) interfaceC18770c;
                    int i10 = c16379g.f50866Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c16379g.f50866Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c16379g = new C16379g(this, interfaceC18770c);
                    }
                } else {
                    c16379g = new C16379g(this, interfaceC18770c);
                }
                Object obj2 = c16379g.f50865Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c16379g.f50866Z;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj2);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj2);
                if (((List) ((C17309l) obj).f55136Y).isEmpty()) {
                    return c17296c;
                }
                c16379g.f50866Z = 1;
                return interfaceC2186j.mo395a(obj, c16379g) == enumC19250a ? enumC19250a : c17296c;
            case 2:
                if (interfaceC18770c instanceof C16380h) {
                    c16380h = (C16380h) interfaceC18770c;
                    int i12 = c16380h.f50869Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c16380h.f50869Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c16380h = new C16380h(this, interfaceC18770c);
                    }
                } else {
                    c16380h = new C16380h(this, interfaceC18770c);
                }
                Object obj3 = c16380h.f50868Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c16380h.f50869Z;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj3);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj3);
                C20263a0 c20263a0 = ((C20908a) obj).f66645a;
                String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
                c21936l0 = strM12782a != null ? new C21936L0(strM12782a) : null;
                c16380h.f50869Z = 1;
                return interfaceC2186j.mo395a(c21936l0, c16380h) == enumC19250a2 ? enumC19250a2 : c17296c;
            case 3:
                if (interfaceC18770c instanceof C16381i) {
                    c16381i = (C16381i) interfaceC18770c;
                    int i14 = c16381i.f50872Z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c16381i.f50872Z = i14 - Integer.MIN_VALUE;
                    } else {
                        c16381i = new C16381i(this, interfaceC18770c);
                    }
                } else {
                    c16381i = new C16381i(this, interfaceC18770c);
                }
                Object obj4 = c16381i.f50871Y;
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i15 = c16381i.f50872Z;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj4);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj4);
                String str = ((C3694b) obj).f11225j;
                c21936l0 = str != null ? new C21936L0(str) : null;
                c16381i.f50872Z = 1;
                return interfaceC2186j.mo395a(c21936l0, c16381i) == enumC19250a3 ? enumC19250a3 : c17296c;
            case 4:
                if (interfaceC18770c instanceof C16960k) {
                    c16960k = (C16960k) interfaceC18770c;
                    int i16 = c16960k.f54435Z;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c16960k.f54435Z = i16 - Integer.MIN_VALUE;
                    } else {
                        c16960k = new C16960k(this, interfaceC18770c);
                    }
                } else {
                    c16960k = new C16960k(this, interfaceC18770c);
                }
                Object obj5 = c16960k.f54434Y;
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i17 = c16960k.f54435Z;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj5);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj5);
                C2786R0 c2786r0 = (C2786R0) obj;
                c21936l0 = c2786r0 != null ? c2786r0.f8504c : null;
                c16960k.f54435Z = 1;
                return interfaceC2186j.mo395a(c21936l0, c16960k) == enumC19250a4 ? enumC19250a4 : c17296c;
            case 5:
                if (interfaceC18770c instanceof C17170e) {
                    c17170e = (C17170e) interfaceC18770c;
                    int i18 = c17170e.f54854Z;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c17170e.f54854Z = i18 - Integer.MIN_VALUE;
                    } else {
                        c17170e = new C17170e(this, interfaceC18770c);
                    }
                } else {
                    c17170e = new C17170e(this, interfaceC18770c);
                }
                Object obj6 = c17170e.f54853Y;
                EnumC19250a enumC19250a5 = EnumC19250a.f61036Y;
                int i19 = c17170e.f54854Z;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj6);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj6);
                long j10 = ((C13803e) obj).f43598a;
                if (j10 == 9205357640488583168L) {
                    c21936l0 = C21129h.f67131c;
                } else {
                    int i20 = AbstractC17174i.f54858a;
                    if (C13803e.m15333e(j10) >= 0.5d && C13803e.m15331c(j10) >= 0.5d) {
                        float fM15333e = C13803e.m15333e(j10);
                        boolean zIsInfinite = Float.isInfinite(fM15333e);
                        AbstractC7870D5 c21122a = C21123b.f67119b;
                        AbstractC7870D5 c21122a2 = (zIsInfinite || Float.isNaN(fM15333e)) ? c21122a : new C21122a(AbstractC2119a.m3195i(C13803e.m15333e(j10)));
                        float fM15331c = C13803e.m15331c(j10);
                        if (!Float.isInfinite(fM15331c) && !Float.isNaN(fM15331c)) {
                            c21122a = new C21122a(AbstractC2119a.m3195i(C13803e.m15331c(j10)));
                        }
                        c21936l0 = new C21129h(c21122a2, c21122a);
                    }
                }
                if (c21936l0 == null) {
                    return c17296c;
                }
                c17170e.f54854Z = 1;
                return interfaceC2186j.mo395a(c21936l0, c17170e) == enumC19250a5 ? enumC19250a5 : c17296c;
            case 6:
                if (interfaceC18770c instanceof C17577e) {
                    c17577e = (C17577e) interfaceC18770c;
                    int i21 = c17577e.f56231Z;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c17577e.f56231Z = i21 - Integer.MIN_VALUE;
                    } else {
                        c17577e = new C17577e(this, interfaceC18770c);
                    }
                } else {
                    c17577e = new C17577e(this, interfaceC18770c);
                }
                Object obj7 = c17577e.f56230Y;
                EnumC19250a enumC19250a6 = EnumC19250a.f61036Y;
                int i22 = c17577e.f56231Z;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj7);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj7);
                InterfaceC21862x interfaceC21862x = (InterfaceC21862x) obj;
                if ((interfaceC21862x instanceof C21861w) || (interfaceC21862x instanceof C21858t)) {
                    return c17296c;
                }
                c17577e.f56231Z = 1;
                return interfaceC2186j.mo395a(obj, c17577e) == enumC19250a6 ? enumC19250a6 : c17296c;
            case 7:
                if (interfaceC18770c instanceof C17599a) {
                    c17599a = (C17599a) interfaceC18770c;
                    int i23 = c17599a.f56346Z;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c17599a.f56346Z = i23 - Integer.MIN_VALUE;
                    } else {
                        c17599a = new C17599a(this, interfaceC18770c);
                    }
                } else {
                    c17599a = new C17599a(this, interfaceC18770c);
                }
                Object obj8 = c17599a.f56345Y;
                EnumC19250a enumC19250a7 = EnumC19250a.f61036Y;
                int i24 = c17599a.f56346Z;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj8);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj8);
                String str2 = ((C3694b) obj).f11219d;
                c21936l0 = str2 != null ? new C22020j1(str2) : null;
                c17599a.f56346Z = 1;
                return interfaceC2186j.mo395a(c21936l0, c17599a) == enumC19250a7 ? enumC19250a7 : c17296c;
            case 8:
                if (interfaceC18770c instanceof C18121k) {
                    c18121k = (C18121k) interfaceC18770c;
                    int i25 = c18121k.f57804Z;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        c18121k.f57804Z = i25 - Integer.MIN_VALUE;
                    } else {
                        c18121k = new C18121k(this, interfaceC18770c);
                    }
                } else {
                    c18121k = new C18121k(this, interfaceC18770c);
                }
                Object obj9 = c18121k.f57803Y;
                EnumC19250a enumC19250a8 = EnumC19250a.f61036Y;
                int i26 = c18121k.f57804Z;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj9);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj9);
                Set set = ((C18102a0) obj).f57743a;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C22011h0(((C18098X) it.next()).f57738a));
                }
                Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
                c18121k.f57804Z = 1;
                return interfaceC2186j.mo395a(setM19328G0, c18121k) == enumC19250a8 ? enumC19250a8 : c17296c;
            case 9:
                if (interfaceC18770c instanceof C18123l) {
                    c18123l = (C18123l) interfaceC18770c;
                    int i27 = c18123l.f57807Z;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c18123l.f57807Z = i27 - Integer.MIN_VALUE;
                    } else {
                        c18123l = new C18123l(this, interfaceC18770c);
                    }
                } else {
                    c18123l = new C18123l(this, interfaceC18770c);
                }
                Object obj10 = c18123l.f57806Y;
                EnumC19250a enumC19250a9 = EnumC19250a.f61036Y;
                int i28 = c18123l.f57807Z;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj10);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj10);
                List listM19322C0 = AbstractC17680n.m19322C0(((Map) obj).values());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj11 : listM19322C0) {
                    if (((C6636i) obj11).f21380b != null) {
                        arrayList2.add(obj11);
                    }
                }
                c18123l.f57807Z = 1;
                return interfaceC2186j.mo395a(arrayList2, c18123l) == enumC19250a9 ? enumC19250a9 : c17296c;
            case 10:
                if (interfaceC18770c instanceof C18124m) {
                    c18124m = (C18124m) interfaceC18770c;
                    int i29 = c18124m.f57810Z;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        c18124m.f57810Z = i29 - Integer.MIN_VALUE;
                    } else {
                        c18124m = new C18124m(this, interfaceC18770c);
                    }
                } else {
                    c18124m = new C18124m(this, interfaceC18770c);
                }
                Object obj12 = c18124m.f57809Y;
                EnumC19250a enumC19250a10 = EnumC19250a.f61036Y;
                int i30 = c18124m.f57810Z;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj12);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj12);
                Set set2 = ((C18102a0) obj).f57743a;
                c18124m.f57810Z = 1;
                return interfaceC2186j.mo395a(set2, c18124m) == enumC19250a10 ? enumC19250a10 : c17296c;
            case 11:
                if (interfaceC18770c instanceof C18125n) {
                    c18125n = (C18125n) interfaceC18770c;
                    int i31 = c18125n.f57813Z;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        c18125n.f57813Z = i31 - Integer.MIN_VALUE;
                    } else {
                        c18125n = new C18125n(this, interfaceC18770c);
                    }
                } else {
                    c18125n = new C18125n(this, interfaceC18770c);
                }
                Object obj13 = c18125n.f57812Y;
                EnumC19250a enumC19250a11 = EnumC19250a.f61036Y;
                int i32 = c18125n.f57813Z;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj13);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj13);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj14 : (Set) obj) {
                    if (!((C18098X) obj14).f57739b) {
                        arrayList3.add(obj14);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C22011h0(((C18098X) it2.next()).f57738a));
                }
                c18125n.f57813Z = 1;
                return interfaceC2186j.mo395a(arrayList4, c18125n) == enumC19250a11 ? enumC19250a11 : c17296c;
            case 12:
                if (interfaceC18770c instanceof C18112f0) {
                    c18112f0 = (C18112f0) interfaceC18770c;
                    int i33 = c18112f0.f57776Z;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        c18112f0.f57776Z = i33 - Integer.MIN_VALUE;
                    } else {
                        c18112f0 = new C18112f0(this, interfaceC18770c);
                    }
                } else {
                    c18112f0 = new C18112f0(this, interfaceC18770c);
                }
                Object obj15 = c18112f0.f57775Y;
                EnumC19250a enumC19250a12 = EnumC19250a.f61036Y;
                int i34 = c18112f0.f57776Z;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj15);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj15);
                Set set3 = ((C18120j0) obj).f57802b;
                ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(set3, 10));
                Iterator it3 = set3.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C22011h0(((C18108d0) it3.next()).f57761a));
                }
                Set setM19328G1 = AbstractC17680n.m19328G0(arrayList5);
                c18112f0.f57776Z = 1;
                return interfaceC2186j.mo395a(setM19328G1, c18112f0) == enumC19250a12 ? enumC19250a12 : c17296c;
            case 13:
                return m15993b((AbstractC20994o) obj, interfaceC18770c);
            case 14:
                Object objMo395a2 = interfaceC2186j.mo395a(new C20992m(((Number) obj).intValue()), interfaceC18770c);
                return objMo395a2 == EnumC19250a.f61036Y ? objMo395a2 : c17296c;
            default:
                Object objM3217p = AbstractC2124C.m3217p(interfaceC2186j, (InterfaceC2184i) obj, interfaceC18770c);
                return objM3217p == EnumC19250a.f61036Y ? objM3217p : c17296c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m15993b(AbstractC20994o abstractC20994o, InterfaceC18770c interfaceC18770c) {
        C20995p c20995p;
        if (interfaceC18770c instanceof C20995p) {
            c20995p = (C20995p) interfaceC18770c;
            int i10 = c20995p.f66830p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20995p.f66830p0 = i10 - Integer.MIN_VALUE;
            } else {
                c20995p = new C20995p(this, interfaceC18770c);
            }
        } else {
            c20995p = new C20995p(this, interfaceC18770c);
        }
        Object obj = c20995p.f66828Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20995p.f66830p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c20995p.f66827Y = abstractC20994o;
            c20995p.f66830p0 = 1;
            if (this.f45548Z.mo395a(abstractC20994o, c20995p) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC20994o = c20995p.f66827Y;
            AbstractC9233X.m9807c(obj);
        }
        if (abstractC20994o instanceof C20990k ? true : abstractC20994o instanceof C20991l) {
            AbstractC0575H.m1181j(c20995p.getContext(), null);
        }
        return C17296C.f55119a;
    }
}
