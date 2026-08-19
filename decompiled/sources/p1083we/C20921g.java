package p1083we;

import kotlin.jvm.internal.AbstractC16526C;
import p025An.C0644w;
import p1111xl.C21296a;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p364Oh.C6251y;
import p432Rh.C6889b;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p556Wk.C8915b0;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import ve.C20584h;

/* JADX INFO: renamed from: we.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20921g {

    /* JADX INFO: renamed from: a */
    public final C6889b f66684a;

    /* JADX INFO: renamed from: b */
    public final C3430e f66685b = AbstractC8168p6.m8749b("CustomInstructionsApi", null);

    public C20921g(C6889b c6889b) {
        this.f66684a = c6889b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m21454a(AbstractC19687c abstractC19687c) {
        C20915a c20915a;
        if (abstractC19687c instanceof C20915a) {
            c20915a = (C20915a) abstractC19687c;
            int i10 = c20915a.f66667o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20915a.f66667o0 = i10 - Integer.MIN_VALUE;
            } else {
                c20915a = new C20915a(this, abstractC19687c);
            }
        } else {
            c20915a = new C20915a(this, abstractC19687c);
        }
        Object objM9690b = c20915a.f66665Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20915a.f66667o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C20916b c20916b = new C20916b(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C20930p.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C20930p.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c20915a.f66667o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f66684a, c21296a, c20916b, c20915a);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            C20930p c20930p = (C20930p) ((C6223B) abstractC6224C).f20258a;
            c20930p.getClass();
            return new C6223B(new C20584h(c20930p.f66692a, c20930p.f66693b, c20930p.f66694c, c20930p.f66695d));
        }
        if ((abstractC6224C instanceof C6248v) || (abstractC6224C instanceof AbstractC6249w)) {
            return abstractC6224C;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public final Object m21455b(C20584h c20584h, AbstractC19687c abstractC19687c) {
        C20917c c20917c;
        InterfaceC3777y interfaceC3777yM18075c;
        C20921g c20921g;
        C20921g c20921g2;
        Object c6223b;
        Exception e10;
        InterfaceC3777y interfaceC3777yM18075c2;
        if (abstractC19687c instanceof C20917c) {
            c20917c = (C20917c) abstractC19687c;
            int i10 = c20917c.f66674q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20917c.f66674q0 = i10 - Integer.MIN_VALUE;
            } else {
                c20917c = new C20917c(this, abstractC19687c);
            }
        } else {
            c20917c = new C20917c(this, abstractC19687c);
        }
        Object objM9690b = c20917c.f66672o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20917c.f66674q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            C20918d c20918d = new C20918d(c20584h, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C20930p.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C20930p.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c20917c.f66670Y = this;
            c20917c.f66674q0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f66684a, c21296a, c20918d, c20917c);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c20921g = this;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6223b = c20917c.f66671Z;
                c20921g2 = c20917c.f66670Y;
                try {
                    AbstractC9233X.m9807c(objM9690b);
                    return new C6251y(new C20911B((C20910A) objM9690b));
                } catch (Exception e11) {
                    e10 = e11;
                    AbstractC8160o6.m8731f(c20921g2.f66685b, "Failed to parse error response", e10, null, 4);
                    return c6223b;
                }
            }
            c20921g = c20917c.f66670Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            C20930p c20930p = (C20930p) ((C6223B) abstractC6224C).f20258a;
            c20930p.getClass();
            c6223b = new C6223B(new C20584h(c20930p.f66692a, c20930p.f66693b, c20930p.f66694c, c20930p.f66695d));
            return c6223b;
        }
        if (abstractC6224C instanceof C6248v) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        AbstractC6249w abstractC6249w = (AbstractC6249w) abstractC6224C;
        Throwable th2 = abstractC6249w.f20328a;
        if (!(th2 instanceof C8915b0)) {
            return abstractC6249w;
        }
        try {
            AbstractC14527b abstractC14527b = ((C8915b0) th2).f27285Y;
            InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C20933s.class);
            try {
                interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C20933s.class);
            } catch (Throwable unused2) {
                interfaceC3777yM18075c2 = null;
            }
            C21296a c21296a2 = new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c2);
            c20917c.f66670Y = c20921g;
            c20917c.f66671Z = abstractC6249w;
            c20917c.f66674q0 = 2;
            Object objM7294a = abstractC14527b.mo7303b().m7294a(c21296a2, c20917c);
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (objM7294a == enumC19250a) {
                return enumC19250a;
            }
            c20921g2 = c20921g;
            c6223b = abstractC6249w;
            objM9690b = objM7294a;
            return new C6251y(new C20911B((C20910A) objM9690b));
        } catch (Exception e12) {
            c20921g2 = c20921g;
            c6223b = abstractC6249w;
            e10 = e12;
            AbstractC8160o6.m8731f(c20921g2.f66685b, "Failed to parse error response", e10, null, 4);
            return c6223b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m21456c(boolean z6, AbstractC19687c abstractC19687c) {
        C20919e c20919e;
        if (abstractC19687c instanceof C20919e) {
            c20919e = (C20919e) abstractC19687c;
            int i10 = c20919e.f66680o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20919e.f66680o0 = i10 - Integer.MIN_VALUE;
            } else {
                c20919e = new C20919e(this, abstractC19687c);
            }
        } else {
            c20919e = new C20919e(this, abstractC19687c);
        }
        Object objM9690b = c20919e.f66678Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20919e.f66680o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C20920f c20920f = new C20920f(z6, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C20924j.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C20924j.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c20919e.f66680o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f66684a, c21296a, c20920f, c20919e);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C6223B(Boolean.valueOf(((C20924j) ((C6223B) abstractC6224C).f20258a).f66687a));
        }
        if ((abstractC6224C instanceof C6248v) || (abstractC6224C instanceof AbstractC6249w)) {
            return abstractC6224C;
        }
        throw new C0644w();
    }
}
