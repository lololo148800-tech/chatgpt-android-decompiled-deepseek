package p854kf;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p025An.C0644w;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p1111xl.C21296a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p749fd.C13628m;
import p871lf.C16931o;
import p871lf.C16937u;
import p871lf.C16940x;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: kf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16390h {

    /* JADX INFO: renamed from: a */
    public final C16385c f50899a;

    /* JADX INFO: renamed from: b */
    public final C16391i f50900b;

    /* JADX INFO: renamed from: c */
    public final C1970n f50901c;

    public C16390h(C16385c c16385c, C16391i c16391i) {
        this.f50899a = c16385c;
        this.f50900b = c16391i;
        this.f50901c = c16391i.f64176f;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m17971a(String str, boolean z6, AbstractC19687c abstractC19687c) {
        C16386d c16386d;
        C16390h c16390h;
        AbstractC21955Q1 abstractC21955Q1M6734a;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C16386d) {
            c16386d = (C16386d) abstractC19687c;
            int i10 = c16386d.f50889p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16386d.f50889p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16386d = new C16386d(this, abstractC19687c);
            }
        } else {
            c16386d = new C16386d(this, abstractC19687c);
        }
        Object objM9690b = c16386d.f50887Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16386d.f50889p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c16390h = (C16390h) c16386d.f50886Y;
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c16386d.f50886Y;
                AbstractC9233X.m9807c(objM9690b);
            }
            abstractC21955Q1M6734a = abstractC21955Q1;
            if (abstractC21955Q1M6734a instanceof C21952P1) {
                return new C21952P1(c17296c);
            }
            if ((abstractC21955Q1M6734a instanceof C21929J1) && !(abstractC21955Q1M6734a instanceof AbstractC21933K1)) {
                throw new C0644w();
            }
            return abstractC21955Q1M6734a;
        }
        AbstractC9233X.m9807c(objM9690b);
        C16937u c16937u = new C16937u(str, z6);
        c16386d.f50886Y = this;
        c16386d.f50889p0 = 1;
        C16385c c16385c = this.f50899a;
        InterfaceC3777y interfaceC3777yM18075c = null;
        C16384b c16384b = new C16384b(c16937u, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C16931o.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C16931o.class);
        } catch (Throwable unused) {
        }
        objM9690b = AbstractC9144I.m9690b(c16385c.f50885a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c16384b, c16386d);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        c16390h = this;
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            abstractC21955Q1M6734a = new C21952P1(((C6223B) abstractC6224C).f20258a);
        } else if (abstractC6224C instanceof C6248v) {
            abstractC21955Q1M6734a = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            abstractC21955Q1M6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (abstractC21955Q1M6734a instanceof C21952P1) {
            C16931o c16931o = (C16931o) ((C21952P1) abstractC21955Q1M6734a).f69511a;
            c16386d.f50886Y = abstractC21955Q1M6734a;
            c16386d.f50889p0 = 2;
            c16390h.getClass();
            Object objM21029b = c16390h.f50900b.m21029b(new C13628m(c16931o, 29), c16386d);
            if (objM21029b != EnumC19250a.f61036Y) {
                objM21029b = c17296c;
            }
            if (objM21029b == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q1 = abstractC21955Q1M6734a;
            abstractC21955Q1M6734a = abstractC21955Q1;
        }
        if (abstractC21955Q1M6734a instanceof C21952P1) {
            return new C21952P1(c17296c);
        }
        if (abstractC21955Q1M6734a instanceof C21929J1) {
            return abstractC21955Q1M6734a;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m17972b(String str, AbstractC19687c abstractC19687c) {
        C16387e c16387e;
        C16390h c16390h;
        AbstractC21955Q1 abstractC21955Q1M6734a;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C16387e) {
            c16387e = (C16387e) abstractC19687c;
            int i10 = c16387e.f50893p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16387e.f50893p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16387e = new C16387e(this, abstractC19687c);
            }
        } else {
            c16387e = new C16387e(this, abstractC19687c);
        }
        Object objM9690b = c16387e.f50891Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16387e.f50893p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c16390h = (C16390h) c16387e.f50890Y;
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c16387e.f50890Y;
                AbstractC9233X.m9807c(objM9690b);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM9690b);
        c16387e.f50890Y = this;
        c16387e.f50893p0 = 1;
        C16385c c16385c = this.f50899a;
        InterfaceC3777y interfaceC3777yM18075c = null;
        C16383a c16383a = new C16383a(str, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C16931o.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C16931o.class);
        } catch (Throwable unused) {
        }
        objM9690b = AbstractC9144I.m9690b(c16385c.f50885a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c16383a, c16387e);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        c16390h = this;
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            abstractC21955Q1M6734a = new C21952P1(((C6223B) abstractC6224C).f20258a);
        } else if (abstractC6224C instanceof C6248v) {
            abstractC21955Q1M6734a = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            abstractC21955Q1M6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (!(abstractC21955Q1M6734a instanceof C21952P1)) {
            return abstractC21955Q1M6734a;
        }
        C16931o c16931o = (C16931o) ((C21952P1) abstractC21955Q1M6734a).f69511a;
        c16387e.f50890Y = abstractC21955Q1M6734a;
        c16387e.f50893p0 = 2;
        c16390h.getClass();
        Object objM21029b = c16390h.f50900b.m21029b(new C13628m(c16931o, 29), c16387e);
        if (objM21029b != EnumC19250a.f61036Y) {
            objM21029b = C17296C.f55119a;
        }
        if (objM21029b == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6734a;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Comparable m17973c(AbstractC19687c abstractC19687c) {
        C16388f c16388f;
        if (abstractC19687c instanceof C16388f) {
            c16388f = (C16388f) abstractC19687c;
            int i10 = c16388f.f50896o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16388f.f50896o0 = i10 - Integer.MIN_VALUE;
            } else {
                c16388f = new C16388f(this, abstractC19687c);
            }
        } else {
            c16388f = new C16388f(this, abstractC19687c);
        }
        Object objM3221t = c16388f.f50894Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16388f.f50896o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            c16388f.f50896o0 = 1;
            objM3221t = AbstractC2124C.m3221t(this.f50900b.f64176f, c16388f);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM3221t);
        }
        return ((C16940x) objM3221t).f54389b;
    }
}
