package p129En;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import mm.C17309l;
import p005A3.C0326m;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p026Ao.InterfaceC0677k;
import p032B4.C0806a;
import p060C6.C1606c;
import p060C6.C1611h;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p080D0.C1837w0;
import p1006s6.C19452b;
import p1006s6.C19457g;
import p103Dn.InterfaceC2186j;
import p1071w0.AbstractC20740b0;
import p1071w0.C20750g0;
import p112E6.C2344c;
import p1140z1.AbstractC21690f;
import p136F6.AbstractC2674a;
import p185H6.C3249e;
import p185H6.C3251g;
import p185H6.C3253i;
import p209I6.C3640r;
import p209I6.C3645w;
import p235J6.C4265b;
import p235J6.C4268e;
import p235J6.C4270g;
import p235J6.C4271h;
import p235J6.C4272i;
import p235J6.C4273j;
import p235J6.InterfaceC4267d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p350O1.C6046D;
import p350O1.C6065n;
import p427Rc.C6845b;
import p523V9.AbstractC7841A0;
import p571X9.AbstractC9166L3;
import p571X9.AbstractC9233X;
import p773h0.C14248C;
import p894n0.C17398d;
import p894n0.C17399e;
import p894n0.C17402h;
import p894n0.C17403i;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17405k;
import p909nm.C17689w;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.InterfaceC17833A;
import p917o6.InterfaceC17842J;
import p942p6.C18301e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: En.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C2602m implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8064Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f8065Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f8066o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f8067p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f8068q0;

    public C2602m(InterfaceC2186j interfaceC2186j, C0326m c0326m, C17852e c17852e, C18301e c18301e, long j10) {
        this.f8064Y = 1;
        this.f8065Z = interfaceC2186j;
        this.f8066o0 = c0326m;
        this.f8067p0 = c17852e;
        this.f8068q0 = c18301e;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01df  */
    /* JADX WARN: Code duplicated, block: B:130:0x0280  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C2601l c2601l;
        C2602m c2602m;
        C3251g c3251g;
        C3253i c3253i;
        C3640r c3640r;
        C17853f c17853fM4353a;
        boolean z6 = false;
        C17853f c17853fM1843b = null;
        boolean z10 = true;
        Object obj2 = this.f8065Z;
        Object obj3 = this.f8067p0;
        Object obj4 = this.f8068q0;
        C17296C c17296c = C17296C.f55119a;
        Object obj5 = this.f8066o0;
        switch (this.f8064Y) {
            case 0:
                if (interfaceC18770c instanceof C2601l) {
                    c2601l = (C2601l) interfaceC18770c;
                    int i10 = c2601l.f8063r0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2601l.f8063r0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c2601l = new C2601l(this, interfaceC18770c);
                    }
                } else {
                    c2601l = new C2601l(this, interfaceC18770c);
                }
                Object obj6 = c2601l.f8061p0;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2601l.f8063r0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj6);
                    InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) ((C16525B) obj5).f51262Y;
                    if (interfaceC0627n0 != null) {
                        interfaceC0627n0.mo1275e(new C2606q());
                        c2601l.f8058Y = this;
                        c2601l.f8059Z = obj;
                        c2601l.f8060o0 = interfaceC0627n0;
                        c2601l.f8063r0 = 1;
                        if (interfaceC0627n0.mo1272P(c2601l) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    c2602m = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC0627n0 interfaceC0627n1 = c2601l.f8060o0;
                    obj = c2601l.f8059Z;
                    c2602m = c2601l.f8058Y;
                    AbstractC9233X.m9807c(obj6);
                }
                ((C16525B) c2602m.f8066o0).f51262Y = AbstractC0575H.m1156D((InterfaceC0571F) c2602m.f8067p0, null, EnumC0573G.f1793p0, new C2600k((C2604o) c2602m.f8068q0, (InterfaceC2186j) c2602m.f8065Z, obj, null), 1);
                return c17296c;
            case 1:
                if (interfaceC18770c instanceof C3251g) {
                    c3251g = (C3251g) interfaceC18770c;
                    int i12 = c3251g.f9893Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c3251g.f9893Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c3251g = new C3251g(this, interfaceC18770c);
                    }
                } else {
                    c3251g = new C3251g(this, interfaceC18770c);
                }
                Object obj7 = c3251g.f9892Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c3251g.f9893Z;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj7);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj7);
                UUID uuid = ((C17852e) obj3).f56922b;
                ((C0326m) obj5).getClass();
                C0806a c0806aM19598a = ((C17853f) obj).m19598a();
                c0806aM19598a.f2237c = uuid;
                C18301e c18301e = (C18301e) obj4;
                if (c18301e != null) {
                    int i14 = AbstractC2674a.f8212a;
                    System.currentTimeMillis();
                    ArrayList arrayList = c18301e.f58417b;
                    c0806aM19598a.m1842a(new C3249e());
                }
                C17853f c17853fM1843b2 = c0806aM19598a.m1843b();
                c3251g.f9893Z = 1;
                return ((InterfaceC2186j) obj2).mo395a(c17853fM1843b2, c3251g) == enumC19250a2 ? enumC19250a2 : c17296c;
            case 2:
                if (interfaceC18770c instanceof C3253i) {
                    c3253i = (C3253i) interfaceC18770c;
                    int i15 = c3253i.f9903Z;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c3253i.f9903Z = i15 - Integer.MIN_VALUE;
                    } else {
                        c3253i = new C3253i(this, interfaceC18770c);
                    }
                } else {
                    c3253i = new C3253i(this, interfaceC18770c);
                }
                Object obj8 = c3253i.f9902Y;
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i16 = c3253i.f9903Z;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj8);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj8);
                InterfaceC0677k payload = (InterfaceC0677k) obj;
                C16525B c16525b = (C16525B) obj5;
                if (c16525b.f51262Y == null) {
                    c16525b.f51262Y = new C2344c();
                }
                Object obj9 = c16525b.f51262Y;
                AbstractC16544l.m18091d(obj9);
                AbstractC16544l.m18094g(payload, "payload");
                Object objM8091c = AbstractC7841A0.m8091c(new C19452b(payload));
                AbstractC16544l.m18092e(objM8091c, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                LinkedHashMap linkedHashMapM3434b = ((C2344c) obj9).m3434b((Map) objM8091c);
                Object obj10 = c16525b.f51262Y;
                AbstractC16544l.m18091d(obj10);
                LinkedHashSet linkedHashSet = ((C2344c) obj10).f7277d;
                Object obj11 = c16525b.f51262Y;
                AbstractC16544l.m18091d(obj11);
                boolean z11 = !((C2344c) obj11).f7278e;
                Object obj12 = c16525b.f51262Y;
                AbstractC16544l.m18091d(obj12);
                if (!((C2344c) obj12).f7279f) {
                    C0806a c0806aM19598a2 = AbstractC9166L3.m9718c(linkedHashSet, null, (C17867t) obj4, (InterfaceC17842J) obj3, new C19457g(linkedHashMapM3434b)).m19598a();
                    c0806aM19598a2.f2235a = z11;
                    c17853fM1843b = c0806aM19598a2.m1843b();
                }
                if (c17853fM1843b == null) {
                    return c17296c;
                }
                c3253i.f9903Z = 1;
                return ((InterfaceC2186j) obj2).mo395a(c17853fM1843b, c3253i) == enumC19250a3 ? enumC19250a3 : c17296c;
            case 3:
                if (interfaceC18770c instanceof C3640r) {
                    c3640r = (C3640r) interfaceC18770c;
                    int i17 = c3640r.f11094Z;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c3640r.f11094Z = i17 - Integer.MIN_VALUE;
                    } else {
                        c3640r = new C3640r(this, interfaceC18770c);
                    }
                } else {
                    c3640r = new C3640r(this, interfaceC18770c);
                }
                Object obj13 = c3640r.f11093Y;
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i18 = c3640r.f11094Z;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj13);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj13);
                InterfaceC4267d interfaceC4267d = (InterfaceC4267d) obj;
                C17852e c17852e = (C17852e) obj5;
                if (interfaceC4267d instanceof C4273j) {
                    Map map = ((C4273j) interfaceC4267d).f13934b;
                    InterfaceC17833A interfaceC17833AMo4141d = c17852e.f56923c.mo4141d(C17867t.f56959e);
                    AbstractC16544l.m18091d(interfaceC17833AMo4141d);
                    C17867t c17867t = (C17867t) interfaceC17833AMo4141d;
                    C2344c c2344c = (C2344c) obj3;
                    C17309l c17309l = map.keySet().contains("hasNext") ? new C17309l(c2344c.m3434b(map), c2344c.f7277d) : new C17309l(map, null);
                    Map map2 = (Map) c17309l.f55136Y;
                    Set set = (Set) c17309l.f55137Z;
                    AbstractC16544l.m18094g(map2, "<this>");
                    c17853fM4353a = AbstractC9166L3.m9718c(set, c17852e.f56922b, c17867t, c17852e.f56921a, new C19457g(map2));
                    if (!c2344c.f7278e) {
                        c2344c.f7274a.clear();
                        c2344c.f7276c.clear();
                        c2344c.f7278e = true;
                        c2344c.f7279f = false;
                    }
                } else {
                    C3645w c3645w = (C3645w) obj4;
                    if (interfaceC4267d instanceof C4272i) {
                        c17853fM4353a = C3645w.m4353a(c3645w, c17852e, new C1611h(c17852e.f56921a.name(), ((C4272i) interfaceC4267d).f13932b));
                    } else {
                        if (!(interfaceC4267d instanceof C4270g)) {
                            if (!(interfaceC4267d instanceof C4265b) && !(interfaceC4267d instanceof C4271h) && !(interfaceC4267d instanceof C4268e)) {
                                throw new C0644w();
                            }
                            throw new IllegalStateException(("Unexpected event " + interfaceC4267d).toString());
                        }
                        c17853fM4353a = C3645w.m4353a(c3645w, c17852e, new C1606c("Network error while executing ".concat(c17852e.f56921a.name()), ((C4270g) interfaceC4267d).f13929a));
                    }
                }
                c3640r.f11094Z = 1;
                return ((InterfaceC2186j) obj2).mo395a(c17853fM4353a, c3640r) == enumC19250a4 ? enumC19250a4 : c17296c;
            case 4:
                return m3617b(((Boolean) obj).booleanValue(), interfaceC18770c);
            case 5:
                InterfaceC17405k interfaceC17405k = (InterfaceC17405k) obj;
                C16558z c16558z = (C16558z) obj4;
                C16558z c16558z2 = (C16558z) obj3;
                C16558z c16558z3 = (C16558z) obj5;
                if (interfaceC17405k instanceof C17409o) {
                    c16558z3.f51287Y++;
                } else if ((interfaceC17405k instanceof C17410p) || (interfaceC17405k instanceof C17408n)) {
                    c16558z3.f51287Y--;
                } else if (interfaceC17405k instanceof C17402h) {
                    c16558z2.f51287Y++;
                } else if (interfaceC17405k instanceof C17403i) {
                    c16558z2.f51287Y--;
                } else if (interfaceC17405k instanceof C17398d) {
                    c16558z.f51287Y++;
                } else if (interfaceC17405k instanceof C17399e) {
                    c16558z.f51287Y--;
                }
                boolean z12 = c16558z3.f51287Y > 0;
                boolean z13 = c16558z2.f51287Y > 0;
                boolean z14 = c16558z.f51287Y > 0;
                C14248C c14248c = (C14248C) obj2;
                if (c14248c.f44711A0 != z12) {
                    c14248c.f44711A0 = z12;
                    z6 = true;
                }
                if (c14248c.f44712B0 != z13) {
                    c14248c.f44712B0 = z13;
                    z6 = true;
                }
                if (c14248c.f44713C0 != z14) {
                    c14248c.f44713C0 = z14;
                } else {
                    z10 = z6;
                }
                if (z10) {
                    AbstractC21690f.m22209n(c14248c);
                }
                return c17296c;
            default:
                C20750g0 c20750g0 = (C20750g0) obj5;
                if (((Boolean) obj).booleanValue() && c20750g0.m21292b()) {
                    C1837w0 c1837w0 = (C1837w0) obj4;
                    AbstractC20740b0.m21274o((C6046D) obj3, c20750g0, c1837w0.m2686j(), (C6065n) obj2, c1837w0.f5306b);
                } else {
                    AbstractC20740b0.m21270k(c20750g0);
                }
                return c17296c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:28:0x008f, B:30:0x0095, B:33:0x00af), top: B:43:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:28:0x008f->B:48:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m3617b(boolean z6, InterfaceC18770c interfaceC18770c) throws Throwable {
        C6845b c6845b;
        C16556x c16556x;
        C16525B c16525b;
        InterfaceC1758z interfaceC1758z;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        Iterator it;
        InterfaceC4814a interfaceC4814a3;
        Object next;
        if (interfaceC18770c instanceof C6845b) {
            c6845b = (C6845b) interfaceC18770c;
            int i10 = c6845b.f21957t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6845b.f21957t0 = i10 - Integer.MIN_VALUE;
            } else {
                c6845b = new C6845b(this, interfaceC18770c);
            }
        } else {
            c6845b = new C6845b(this, interfaceC18770c);
        }
        Object obj = c6845b.f21955r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6845b.f21957t0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                C4816c c4816c = (C4816c) this.f8067p0;
                c6845b.f21951Z = c4816c;
                c16556x = (C16556x) this.f8068q0;
                c6845b.f21952o0 = c16556x;
                C16525B c16525b2 = (C16525B) this.f8066o0;
                c6845b.f21953p0 = c16525b2;
                InterfaceC1758z interfaceC1758z2 = (InterfaceC1758z) this.f8065Z;
                c6845b.f21954q0 = interfaceC1758z2;
                c6845b.f21950Y = z6;
                c6845b.f21957t0 = 1;
                if (c4816c.m5448e(null, c6845b) == enumC19250a) {
                    return enumC19250a;
                }
                c16525b = c16525b2;
                interfaceC1758z = interfaceC1758z2;
                interfaceC4814a = c4816c;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c6845b.f21954q0;
                    interfaceC1758z = (InterfaceC1758z) c6845b.f21953p0;
                    c16525b = (C16525B) c6845b.f21952o0;
                    interfaceC4814a2 = c6845b.f21951Z;
                    try {
                        AbstractC9233X.m9807c(obj);
                        interfaceC4814a2 = interfaceC4814a2;
                        while (it.hasNext()) {
                            next = it.next();
                            c6845b.f21951Z = interfaceC4814a2;
                            c6845b.f21952o0 = c16525b;
                            c6845b.f21953p0 = interfaceC1758z;
                            c6845b.f21954q0 = it;
                            c6845b.f21957t0 = 2;
                            if (((C1757y) interfaceC1758z).f5030p0.mo2523o(next, c6845b) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                        c16525b.f51262Y = C17689w.f56480Y;
                        interfaceC4814a3 = interfaceC4814a2;
                        ((C4816c) interfaceC4814a3).m5450g(null);
                        return C17296C.f55119a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        throw th;
                    }
                }
                z6 = c6845b.f21950Y;
                interfaceC1758z = (InterfaceC1758z) c6845b.f21954q0;
                c16525b = (C16525B) c6845b.f21953p0;
                c16556x = (C16556x) c6845b.f21952o0;
                InterfaceC4814a interfaceC4814a4 = c6845b.f21951Z;
                AbstractC9233X.m9807c(obj);
                interfaceC4814a = interfaceC4814a4;
            }
            c16556x.f51285Y = z6;
            interfaceC4814a3 = interfaceC4814a;
            if (z6) {
                it = ((Iterable) c16525b.f51262Y).iterator();
                interfaceC4814a2 = interfaceC4814a;
                while (it.hasNext()) {
                    next = it.next();
                    c6845b.f21951Z = interfaceC4814a2;
                    c6845b.f21952o0 = c16525b;
                    c6845b.f21953p0 = interfaceC1758z;
                    c6845b.f21954q0 = it;
                    c6845b.f21957t0 = 2;
                    if (((C1757y) interfaceC1758z).f5030p0.mo2523o(next, c6845b) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                c16525b.f51262Y = C17689w.f56480Y;
                interfaceC4814a3 = interfaceC4814a2;
            }
            ((C4816c) interfaceC4814a3).m5450g(null);
            return C17296C.f55119a;
        } catch (Throwable th3) {
            th = th3;
            interfaceC4814a2 = interfaceC4814a;
            ((C4816c) interfaceC4814a2).m5450g(null);
            throw th;
        }
    }

    public C2602m(InterfaceC2186j interfaceC2186j, C17852e c17852e, C2344c c2344c, C3645w c3645w) {
        this.f8064Y = 3;
        this.f8065Z = interfaceC2186j;
        this.f8066o0 = c17852e;
        this.f8067p0 = c2344c;
        this.f8068q0 = c3645w;
    }

    public C2602m(InterfaceC2186j interfaceC2186j, InterfaceC17842J interfaceC17842J, C17867t c17867t, C0326m c0326m, C16525B c16525b) {
        this.f8064Y = 2;
        this.f8065Z = interfaceC2186j;
        this.f8067p0 = interfaceC17842J;
        this.f8068q0 = c17867t;
        this.f8066o0 = c16525b;
    }

    public C2602m(C4816c c4816c, C16556x c16556x, C16525B c16525b, InterfaceC1758z interfaceC1758z) {
        this.f8064Y = 4;
        this.f8067p0 = c4816c;
        this.f8068q0 = c16556x;
        this.f8066o0 = c16525b;
        this.f8065Z = interfaceC1758z;
    }

    public /* synthetic */ C2602m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8064Y = i10;
        this.f8066o0 = obj;
        this.f8067p0 = obj2;
        this.f8068q0 = obj3;
        this.f8065Z = obj4;
    }
}
