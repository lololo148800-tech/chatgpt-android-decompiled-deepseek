package ve;

import java.util.Set;
import mm.C17296C;
import ni.C17627a;
import ni.C17628b;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p1083we.C20921g;
import p1155zi.C21941M1;
import p193Hf.C3330S;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17665J;
import p948pi.C18418a;
import p948pi.C18422e;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ve.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C20592p implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final C18418a f65343Y;

    /* JADX INFO: renamed from: Z */
    public final C20577a f65344Z;

    /* JADX INFO: renamed from: o0 */
    public final C17627a f65345o0;

    /* JADX INFO: renamed from: p0 */
    public final C20921g f65346p0;

    /* JADX INFO: renamed from: q0 */
    public final C3430e f65347q0 = AbstractC8168p6.m8749b("AccountUserInitializer", null);

    /* JADX INFO: renamed from: r0 */
    public final C1970n f65348r0;

    public C20592p(C17628b c17628b, C18418a c18418a, C20577a c20577a, C17627a c17627a, C20921g c20921g) {
        this.f65343Y = c18418a;
        this.f65344Z = c20577a;
        this.f65345o0 = c17627a;
        this.f65346p0 = c20921g;
        c17628b.m19237b(new C20585i(this, null));
        this.f65348r0 = c20577a.f64176f;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C18422e c18422e = this.f65343Y.f58773a;
        C17296C c17296c = C17296C.f55119a;
        if (c18422e.f58783b) {
            return c17296c;
        }
        AbstractC0575H.m1156D(this.f65345o0, null, null, new C20586j(this, null), 3);
        return c17296c;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m21189c(AbstractC19687c abstractC19687c) {
        C20587k c20587k;
        C20592p c20592p;
        AbstractC6224C c6223b;
        if (abstractC19687c instanceof C20587k) {
            c20587k = (C20587k) abstractC19687c;
            int i10 = c20587k.f65326p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20587k.f65326p0 = i10 - Integer.MIN_VALUE;
            } else {
                c20587k = new C20587k(this, abstractC19687c);
            }
        } else {
            c20587k = new C20587k(this, abstractC19687c);
        }
        Object objM21454a = c20587k.f65324Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20587k.f65326p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c20592p = c20587k.f65323Y;
                AbstractC9233X.m9807c(objM21454a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM21454a);
            }
            c6223b = new C6223B(C17296C.f55119a);
            return c6223b.m6735b();
        }
        AbstractC9233X.m9807c(objM21454a);
        c20587k.f65323Y = this;
        c20587k.f65326p0 = 1;
        objM21454a = this.f65346p0.m21454a(c20587k);
        if (objM21454a == enumC19250a) {
            return enumC19250a;
        }
        c20592p = this;
        c6223b = (AbstractC6224C) objM21454a;
        if (c6223b instanceof C6223B) {
            C20584h c20584h = (C20584h) ((C6223B) c6223b).f20258a;
            C20577a c20577a = c20592p.f65344Z;
            C20588l c20588l = new C20588l(c20584h, 0);
            c20587k.f65323Y = null;
            c20587k.f65326p0 = 2;
            if (c20577a.m21029b(c20588l, c20587k) == enumC19250a) {
                return enumC19250a;
            }
            c6223b = new C6223B(C17296C.f55119a);
        } else if (!(c6223b instanceof C6248v) && !(c6223b instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        return c6223b.m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m21190d(boolean z6, AbstractC19687c abstractC19687c) {
        C20589m c20589m;
        C20592p c20592p;
        AbstractC6224C c6223b;
        if (abstractC19687c instanceof C20589m) {
            c20589m = (C20589m) abstractC19687c;
            int i10 = c20589m.f65332p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20589m.f65332p0 = i10 - Integer.MIN_VALUE;
            } else {
                c20589m = new C20589m(this, abstractC19687c);
            }
        } else {
            c20589m = new C20589m(this, abstractC19687c);
        }
        Object objM21456c = c20589m.f65330Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20589m.f65332p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c20592p = c20589m.f65329Y;
                AbstractC9233X.m9807c(objM21456c);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM21456c);
            }
            c6223b = new C6223B(C17296C.f55119a);
            return c6223b.m6735b();
        }
        AbstractC9233X.m9807c(objM21456c);
        c20589m.f65329Y = this;
        c20589m.f65332p0 = 1;
        objM21456c = this.f65346p0.m21456c(z6, c20589m);
        if (objM21456c == enumC19250a) {
            return enumC19250a;
        }
        c20592p = this;
        c6223b = (AbstractC6224C) objM21456c;
        if (c6223b instanceof C6223B) {
            boolean zBooleanValue = ((Boolean) ((C6223B) c6223b).f20258a).booleanValue();
            C20577a c20577a = c20592p.f65344Z;
            C3330S c3330s = new C3330S(zBooleanValue, 9);
            c20589m.f65329Y = null;
            c20589m.f65332p0 = 2;
            if (c20577a.m21029b(c3330s, c20589m) == enumC19250a) {
                return enumC19250a;
            }
            c6223b = new C6223B(C17296C.f55119a);
        } else if (!(c6223b instanceof C6248v) && !(c6223b instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        return c6223b.m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m21191e(C20584h c20584h, AbstractC19687c abstractC19687c) {
        C20590n c20590n;
        C20592p c20592p;
        AbstractC6224C c6223b;
        if (abstractC19687c instanceof C20590n) {
            c20590n = (C20590n) abstractC19687c;
            int i10 = c20590n.f65336p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20590n.f65336p0 = i10 - Integer.MIN_VALUE;
            } else {
                c20590n = new C20590n(this, abstractC19687c);
            }
        } else {
            c20590n = new C20590n(this, abstractC19687c);
        }
        Object objM21455b = c20590n.f65334Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20590n.f65336p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c20592p = c20590n.f65333Y;
                AbstractC9233X.m9807c(objM21455b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM21455b);
            }
            c6223b = new C6223B(C17296C.f55119a);
            return c6223b.m6735b();
        }
        AbstractC9233X.m9807c(objM21455b);
        c20590n.f65333Y = this;
        c20590n.f65336p0 = 1;
        objM21455b = this.f65346p0.m21455b(c20584h, c20590n);
        if (objM21455b == enumC19250a) {
            return enumC19250a;
        }
        c20592p = this;
        c6223b = (AbstractC6224C) objM21455b;
        if (c6223b instanceof C6223B) {
            C20584h c20584h2 = (C20584h) ((C6223B) c6223b).f20258a;
            C20577a c20577a = c20592p.f65344Z;
            C20588l c20588l = new C20588l(c20584h2, 1);
            c20590n.f65333Y = null;
            c20590n.f65336p0 = 2;
            if (c20577a.m21029b(c20588l, c20590n) == enumC19250a) {
                return enumC19250a;
            }
            c6223b = new C6223B(C17296C.f55119a);
        } else if (!(c6223b instanceof C6248v) && !(c6223b instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        return c6223b.m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m21192f(EnumC20582f enumC20582f, boolean z6, AbstractC19687c abstractC19687c) {
        C20591o c20591o;
        C20592p c20592p;
        if (abstractC19687c instanceof C20591o) {
            c20591o = (C20591o) abstractC19687c;
            int i10 = c20591o.f65342r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20591o.f65342r0 = i10 - Integer.MIN_VALUE;
            } else {
                c20591o = new C20591o(this, abstractC19687c);
            }
        } else {
            c20591o = new C20591o(this, abstractC19687c);
        }
        Object objM3221t = c20591o.f65340p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20591o.f65342r0;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c20591o.f65339o0;
                enumC20582f = c20591o.f65338Z;
                c20592p = c20591o.f65337Y;
                AbstractC9233X.m9807c(objM3221t);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
        }
        AbstractC9233X.m9807c(objM3221t);
        C20577a c20577a = this.f65344Z;
        c20591o.f65337Y = this;
        c20591o.f65338Z = enumC20582f;
        c20591o.f65339o0 = z6;
        c20591o.f65342r0 = 1;
        objM3221t = AbstractC2124C.m3221t(c20577a.f64176f, c20591o);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c20592p = this;
        C20584h c20584h = (C20584h) objM3221t;
        if (c20584h == null) {
            return new C21941M1(new IllegalStateException("Customizations not found"));
        }
        Set set = c20584h.f65318d;
        C20584h c20584hM21188a = C20584h.m21188a(c20584h, false, null, null, z6 ? AbstractC17665J.m19263c(set, enumC20582f) : AbstractC17665J.m19267g(set, enumC20582f), 7);
        c20591o.f65337Y = null;
        c20591o.f65338Z = null;
        c20591o.f65342r0 = 2;
        objM3221t = c20592p.m21191e(c20584hM21188a, c20591o);
        return objM3221t == enumC19250a ? enumC19250a : objM3221t;
    }
}
