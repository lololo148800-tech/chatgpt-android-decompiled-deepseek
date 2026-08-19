package cg;

import eg.C13380c;
import eg.C13386i;
import eg.C13389l;
import eg.C13402y;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p025An.C0644w;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6226E;
import p364Oh.C6248v;
import p432Rh.C6895h;
import p523V9.AbstractC8230x4;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p707dg.C13107c;
import p707dg.C13110f;
import p707dg.C13113i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: cg.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C11745q {

    /* JADX INFO: renamed from: a */
    public final C6895h f35622a;

    /* JADX INFO: renamed from: b */
    public final C6226E f35623b;

    public C11745q(C6895h c6895h, C6226E c6226e) {
        this.f35622a = c6895h;
        this.f35623b = c6226e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m13035a(AbstractC19687c abstractC19687c) {
        C11729a c11729a;
        if (abstractC19687c instanceof C11729a) {
            c11729a = (C11729a) abstractC19687c;
            int i10 = c11729a.f35570o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11729a.f35570o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11729a = new C11729a(this, abstractC19687c);
            }
        } else {
            c11729a = new C11729a(this, abstractC19687c);
        }
        Object objM9690b = c11729a.f35568Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11729a.f35570o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11730b c11730b = new C11730b(this, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13380c.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C13380c.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11729a.f35570o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11730b, c11729a);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B((C13380c) ((C6223B) abstractC6224C).f20258a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11729a.f35570o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11729a);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m13036b(C13107c c13107c, AbstractC19687c abstractC19687c) {
        C11731c c11731c;
        if (abstractC19687c instanceof C11731c) {
            c11731c = (C11731c) abstractC19687c;
            int i10 = c11731c.f35576o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11731c.f35576o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11731c = new C11731c(this, abstractC19687c);
            }
        } else {
            c11731c = new C11731c(this, abstractC19687c);
        }
        Object objM9690b = c11731c.f35574Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11731c.f35576o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11732d c11732d = new C11732d(this, c13107c, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13386i.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C13386i.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11731c.f35576o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11732d, c11731c);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B((C13386i) ((C6223B) abstractC6224C).f20258a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11731c.f35576o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11731c);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m13037c(AbstractC19687c abstractC19687c) {
        C11733e c11733e;
        if (abstractC19687c instanceof C11733e) {
            c11733e = (C11733e) abstractC19687c;
            int i10 = c11733e.f35583o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11733e.f35583o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11733e = new C11733e(this, abstractC19687c);
            }
        } else {
            c11733e = new C11733e(this, abstractC19687c);
        }
        Object objM9690b = c11733e.f35581Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11733e.f35583o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11734f c11734f = new C11734f(this, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13389l.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C13389l.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11733e.f35583o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11734f, c11733e);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B((C13389l) ((C6223B) abstractC6224C).f20258a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11733e.f35583o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11733e);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m13038d(C13110f c13110f, AbstractC19687c abstractC19687c) {
        C11735g c11735g;
        if (abstractC19687c instanceof C11735g) {
            c11735g = (C11735g) abstractC19687c;
            int i10 = c11735g.f35589o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11735g.f35589o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11735g = new C11735g(this, abstractC19687c);
            }
        } else {
            c11735g = new C11735g(this, abstractC19687c);
        }
        Object objM9690b = c11735g.f35587Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11735g.f35589o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11736h c11736h = new C11736h(this, c13110f, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13402y.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C13402y.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11735g.f35589o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11736h, c11735g);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B((C13402y) ((C6223B) abstractC6224C).f20258a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11735g.f35589o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11735g);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m13039e(C13113i c13113i, AbstractC19687c abstractC19687c) {
        C11737i c11737i;
        if (abstractC19687c instanceof C11737i) {
            c11737i = (C11737i) abstractC19687c;
            int i10 = c11737i.f35596o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11737i.f35596o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11737i = new C11737i(this, abstractC19687c);
            }
        } else {
            c11737i = new C11737i(this, abstractC19687c);
        }
        Object objM9690b = c11737i.f35594Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11737i.f35596o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11738j c11738j = new C11738j(this, c13113i, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13402y.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C13402y.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11737i.f35596o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11738j, c11737i);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B((C13402y) ((C6223B) abstractC6224C).f20258a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11737i.f35596o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11737i);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m13040f(String str, AbstractC19687c abstractC19687c) {
        C11739k c11739k;
        if (abstractC19687c instanceof C11739k) {
            c11739k = (C11739k) abstractC19687c;
            int i10 = c11739k.f35603o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11739k.f35603o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11739k = new C11739k(this, abstractC19687c);
            }
        } else {
            c11739k = new C11739k(this, abstractC19687c);
        }
        Object objM9690b = c11739k.f35601Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11739k.f35603o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11740l c11740l = new C11740l(this, str, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11739k.f35603o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11740l, c11739k);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B(C17296C.f55119a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11739k.f35603o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11739k);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m13041g(String str, AbstractC19687c abstractC19687c) {
        C11741m c11741m;
        if (abstractC19687c instanceof C11741m) {
            c11741m = (C11741m) abstractC19687c;
            int i10 = c11741m.f35610o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11741m.f35610o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11741m = new C11741m(this, abstractC19687c);
            }
        } else {
            c11741m = new C11741m(this, abstractC19687c);
        }
        Object objM9690b = c11741m.f35608Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11741m.f35610o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11742n c11742n = new C11742n(this, str, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11741m.f35610o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11742n, c11741m);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B(C17296C.f55119a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11741m.f35610o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11741m);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m13042h(String str, String str2, AbstractC19687c abstractC19687c) {
        C11743o c11743o;
        if (abstractC19687c instanceof C11743o) {
            c11743o = (C11743o) abstractC19687c;
            int i10 = c11743o.f35617o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11743o.f35617o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11743o = new C11743o(this, abstractC19687c);
            }
        } else {
            c11743o = new C11743o(this, abstractC19687c);
        }
        Object objM9690b = c11743o.f35615Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11743o.f35617o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return (AbstractC6249w) objM9690b;
        }
        AbstractC9233X.m9807c(objM9690b);
        InterfaceC3777y interfaceC3777yM18075c = null;
        C11744p c11744p = new C11744p(str, str2, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c11743o.f35617o0 = 1;
        objM9690b = AbstractC9144I.m9690b(this.f35622a, c21296a, c11744p, c11743o);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B(C17296C.f55119a);
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        c11743o.f35617o0 = 2;
        objM9690b = AbstractC8230x4.m8863a((AbstractC6249w) abstractC6224C, c11743o);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6249w) objM9690b;
    }
}
