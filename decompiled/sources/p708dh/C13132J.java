package p708dh;

import af.C10564U;
import gh.C14135c;
import gh.C14141i;
import gh.C14142j;
import gh.C14143k;
import gh.C14146n;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import ni.C17627a;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p072Ci.C1699d;
import p072Ci.EnumC1711p;
import p086D6.C1970n;
import p1081wc.C20860F;
import p1081wc.InterfaceC20904w;
import p1111xl.C21296a;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p193Hf.C3330S;
import p201Hn.C3516e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p404Qe.C6665a;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p948pi.C18418a;
import p948pi.C18422e;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C13132J implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final C14146n f41690Y;

    /* JADX INFO: renamed from: Z */
    public final C13169w f41691Z;

    /* JADX INFO: renamed from: o0 */
    public final C18418a f41692o0;

    /* JADX INFO: renamed from: p0 */
    public final C17627a f41693p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC20904w f41694q0;

    /* JADX INFO: renamed from: r0 */
    public final C1970n f41695r0;

    public C13132J(C14146n c14146n, C13169w c13169w, C18418a c18418a, C17627a c17627a, InterfaceC20904w interfaceC20904w) {
        this.f41690Y = c14146n;
        this.f41691Z = c13169w;
        this.f41692o0 = c18418a;
        this.f41693p0 = c17627a;
        this.f41694q0 = interfaceC20904w;
        this.f41695r0 = c13169w.f64176f;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C18422e c18422e = this.f41692o0.f58773a;
        C17296C c17296c = C17296C.f55119a;
        if (c18422e.f58783b) {
            return c17296c;
        }
        AbstractC0575H.m1156D(this.f41693p0, null, null, new C13172z(this, null), 3);
        return c17296c;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m14806c(String str, AbstractC19687c abstractC19687c) {
        C13170x c13170x;
        if (abstractC19687c instanceof C13170x) {
            c13170x = (C13170x) abstractC19687c;
            int i10 = c13170x.f41808o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13170x.f41808o0 = i10 - Integer.MIN_VALUE;
            } else {
                c13170x = new C13170x(this, abstractC19687c);
            }
        } else {
            c13170x = new C13170x(this, abstractC19687c);
        }
        Object objM9690b = c13170x.f41806Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13170x.f41808o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c13170x.f41808o0 = 1;
            C14146n c14146n = this.f41690Y;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C14142j c14142j = new C14142j(str, null, false);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c14146n.f44506a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c14142j, c13170x);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        return ((AbstractC6224C) objM9690b).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public final Object m14807d(AbstractC19687c abstractC19687c) {
        C13171y c13171y;
        InterfaceC3777y interfaceC3777yM18075c;
        C13132J c13132j;
        C1699d c1699d;
        if (abstractC19687c instanceof C13171y) {
            c13171y = (C13171y) abstractC19687c;
            int i10 = c13171y.f41812p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13171y.f41812p0 = i10 - Integer.MIN_VALUE;
            } else {
                c13171y = new C13171y(this, abstractC19687c);
            }
        } else {
            c13171y = new C13171y(this, abstractC19687c);
        }
        Object objM9690b = c13171y.f41810Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13171y.f41812p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c13132j = (C13132J) c13171y.f41809Y;
                AbstractC9233X.m9807c(objM9690b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1699d = (C1699d) c13171y.f41809Y;
                AbstractC9233X.m9807c(objM9690b);
            }
            return new C21952P1(c1699d);
        }
        AbstractC9233X.m9807c(objM9690b);
        c13171y.f41809Y = this;
        c13171y.f41812p0 = 1;
        C14146n c14146n = this.f41690Y;
        C14143k c14143k = new C14143k(2, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C14135c.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C14135c.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        objM9690b = AbstractC9144I.m9690b(c14146n.f44506a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c14143k, c13171y);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (!(abstractC6224C instanceof C6223B)) {
            if (abstractC6224C instanceof C6248v) {
                return C21929J1.f69476a;
            }
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        Object obj = ((C6223B) abstractC6224C).f20258a;
        C14141i c14141i = ((C14135c) obj).f44476a;
        Boolean bool = c14141i.f44484a;
        Boolean bool2 = c14141i.f44485b;
        Boolean bool3 = c14141i.f44486c;
        Boolean bool4 = c14141i.f44487d;
        Boolean bool5 = c14141i.f44488e;
        String str = c14141i.f44489f;
        String str2 = str != null ? str : null;
        C14135c c14135c = (C14135c) obj;
        C14141i c14141i2 = c14135c.f44476a;
        C1699d c1699d2 = new C1699d(bool, bool2, bool3, bool4, bool5, str2, c14141i2.f44490g, c14141i2.f44491h, c14135c.f44477b.keySet(), AbstractC17680n.m19328G0(c14135c.f44478c), c14135c.f44476a.f44492i);
        C13169w c13169w = c13132j.f41691Z;
        C10564U c10564u = new C10564U(c1699d2, 18);
        c13171y.f41809Y = c1699d2;
        c13171y.f41812p0 = 2;
        if (c13169w.m21029b(c10564u, c13171y) == enumC19250a) {
            return enumC19250a;
        }
        c1699d = c1699d2;
        return new C21952P1(c1699d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m14808e(boolean z6, AbstractC19687c abstractC19687c) {
        C13123A c13123a;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13123A) {
            c13123a = (C13123A) abstractC19687c;
            int i10 = c13123a.f41649q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13123a.f41649q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13123a = new C13123A(this, abstractC19687c);
            }
        } else {
            c13123a = new C13123A(this, abstractC19687c);
        }
        Object objM15501a = c13123a.f41647o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13123a.f41649q0;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c13123a.f41646Z;
                c13132j = (C13132J) c13123a.f41645Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13123a.f41645Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        Boolean boolValueOf = Boolean.valueOf(z6);
        c13123a.f41645Y = this;
        c13123a.f41646Z = z6;
        c13123a.f41649q0 = 1;
        objM15501a = this.f41690Y.m15501a("sunshine", boolValueOf, c13123a);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C3330S c3330s = new C3330S(z6, 2);
        c13123a.f41645Y = abstractC21955Q1M6735b;
        c13123a.f41649q0 = 2;
        if (c13169w.m21029b(c3330s, c13123a) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m14809f(boolean z6, AbstractC19687c abstractC19687c) {
        C13124B c13124b;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13124B) {
            c13124b = (C13124B) abstractC19687c;
            int i10 = c13124b.f41654q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13124b.f41654q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13124b = new C13124B(this, abstractC19687c);
            }
        } else {
            c13124b = new C13124B(this, abstractC19687c);
        }
        Object objM15501a = c13124b.f41652o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13124b.f41654q0;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c13124b.f41651Z;
                c13132j = (C13132J) c13124b.f41650Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13124b.f41650Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        Boolean boolValueOf = Boolean.valueOf(z6);
        c13124b.f41650Y = this;
        c13124b.f41651Z = z6;
        c13124b.f41654q0 = 1;
        objM15501a = this.f41690Y.m15501a("memory_in_search", boolValueOf, c13124b);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C3330S c3330s = new C3330S(z6, 3);
        c13124b.f41650Y = abstractC21955Q1M6735b;
        c13124b.f41654q0 = 2;
        if (c13169w.m21029b(c3330s, c13124b) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m14810g(EnumC1711p enumC1711p, AbstractC19687c abstractC19687c) {
        C13125C c13125c;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13125C) {
            c13125c = (C13125C) abstractC19687c;
            int i10 = c13125c.f41659q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13125c.f41659q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13125c = new C13125C(this, abstractC19687c);
            }
        } else {
            c13125c = new C13125C(this, abstractC19687c);
        }
        Object objM15501a = c13125c.f41657o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13125c.f41659q0;
        if (i11 != 0) {
            if (i11 == 1) {
                enumC1711p = c13125c.f41656Z;
                c13132j = (C13132J) c13125c.f41655Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13125c.f41655Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        String str = enumC1711p.f4896Y;
        c13125c.f41655Y = this;
        c13125c.f41656Z = enumC1711p;
        c13125c.f41659q0 = 1;
        objM15501a = this.f41690Y.m15501a("preferred_weather_unit", str, c13125c);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C10564U c10564u = new C10564U(enumC1711p, 19);
        c13125c.f41655Y = abstractC21955Q1M6735b;
        c13125c.f41656Z = null;
        c13125c.f41659q0 = 2;
        if (c13169w.m21029b(c10564u, c13125c) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m14811h(boolean z6, AbstractC19687c abstractC19687c) {
        C13126D c13126d;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13126D) {
            c13126d = (C13126D) abstractC19687c;
            int i10 = c13126d.f41664q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13126d.f41664q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13126d = new C13126D(this, abstractC19687c);
            }
        } else {
            c13126d = new C13126D(this, abstractC19687c);
        }
        Object objM15501a = c13126d.f41662o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13126d.f41664q0;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c13126d.f41661Z;
                c13132j = (C13132J) c13126d.f41660Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13126d.f41660Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        Boolean boolValueOf = Boolean.valueOf(z6);
        c13126d.f41660Y = this;
        c13126d.f41661Z = z6;
        c13126d.f41664q0 = 1;
        objM15501a = this.f41690Y.m15501a("training_allowed", boolValueOf, c13126d);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C3330S c3330s = new C3330S(z6, 4);
        c13126d.f41660Y = abstractC21955Q1M6735b;
        c13126d.f41664q0 = 2;
        if (c13169w.m21029b(c3330s, c13126d) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m14812i(boolean z6, AbstractC19687c abstractC19687c) {
        C13127E c13127e;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13127E) {
            c13127e = (C13127E) abstractC19687c;
            int i10 = c13127e.f41669q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13127e.f41669q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13127e = new C13127E(this, abstractC19687c);
            }
        } else {
            c13127e = new C13127E(this, abstractC19687c);
        }
        Object objM15501a = c13127e.f41667o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13127e.f41669q0;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c13127e.f41666Z;
                c13132j = (C13132J) c13127e.f41665Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13127e.f41665Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        Boolean boolValueOf = Boolean.valueOf(z6);
        c13127e.f41665Y = this;
        c13127e.f41666Z = z6;
        c13127e.f41669q0 = 1;
        objM15501a = this.f41690Y.m15501a("video_training_allowed", boolValueOf, c13127e);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C3330S c3330s = new C3330S(z6, 5);
        c13127e.f41665Y = abstractC21955Q1M6735b;
        c13127e.f41669q0 = 2;
        if (c13169w.m21029b(c3330s, c13127e) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m14813j(String str, AbstractC19687c abstractC19687c) {
        C13128F c13128f;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13128F) {
            c13128f = (C13128F) abstractC19687c;
            int i10 = c13128f.f41674q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13128f.f41674q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13128f = new C13128F(this, abstractC19687c);
            }
        } else {
            c13128f = new C13128F(this, abstractC19687c);
        }
        Object objM15501a = c13128f.f41672o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13128f.f41674q0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = c13128f.f41671Z;
                c13132j = (C13132J) c13128f.f41670Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13128f.f41670Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        c13128f.f41670Y = this;
        c13128f.f41671Z = str;
        c13128f.f41674q0 = 1;
        objM15501a = this.f41690Y.m15501a("voice_name", str, c13128f);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C6665a c6665a = new C6665a(str, 9);
        c13128f.f41670Y = abstractC21955Q1M6735b;
        c13128f.f41671Z = null;
        c13128f.f41674q0 = 2;
        if (c13169w.m21029b(c6665a, c13128f) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m14814k(boolean z6, AbstractC19687c abstractC19687c) {
        C13129G c13129g;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13129G) {
            c13129g = (C13129G) abstractC19687c;
            int i10 = c13129g.f41679q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13129g.f41679q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13129g = new C13129G(this, abstractC19687c);
            }
        } else {
            c13129g = new C13129G(this, abstractC19687c);
        }
        Object objM15501a = c13129g.f41677o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13129g.f41679q0;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c13129g.f41676Z;
                c13132j = (C13132J) c13129g.f41675Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13129g.f41675Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        InterfaceC20904w interfaceC20904w = this.f41694q0;
        C17690x c17690x = C17690x.f56481Y;
        if (z6) {
            interfaceC20904w.mo21447a(C20860F.f66376m, c17690x);
        } else if (!z6) {
            interfaceC20904w.mo21447a(C20860F.f66375l, c17690x);
        }
        Boolean boolValueOf = Boolean.valueOf(z6);
        c13129g.f41675Y = this;
        c13129g.f41676Z = z6;
        c13129g.f41679q0 = 1;
        objM15501a = this.f41690Y.m15501a("voice_background_enabled", boolValueOf, c13129g);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C3330S c3330s = new C3330S(z6, 6);
        c13129g.f41675Y = abstractC21955Q1M6735b;
        c13129g.f41679q0 = 2;
        if (c13169w.m21029b(c3330s, c13129g) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m14815l(String str, AbstractC19687c abstractC19687c) {
        C13130H c13130h;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13130H) {
            c13130h = (C13130H) abstractC19687c;
            int i10 = c13130h.f41684q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13130h.f41684q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13130h = new C13130H(this, abstractC19687c);
            }
        } else {
            c13130h = new C13130H(this, abstractC19687c);
        }
        Object objM15501a = c13130h.f41682o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13130h.f41684q0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = c13130h.f41681Z;
                c13132j = (C13132J) c13130h.f41680Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13130h.f41680Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        c13130h.f41680Y = this;
        c13130h.f41681Z = str;
        c13130h.f41684q0 = 1;
        objM15501a = this.f41690Y.m15501a("voice_main_language", str, c13130h);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C6665a c6665a = new C6665a(str, 10);
        c13130h.f41680Y = abstractC21955Q1M6735b;
        c13130h.f41681Z = null;
        c13130h.f41684q0 = 2;
        if (c13169w.m21029b(c6665a, c13130h) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m14816m(boolean z6, AbstractC19687c abstractC19687c) {
        C13131I c13131i;
        C13132J c13132j;
        AbstractC21955Q1 abstractC21955Q1;
        if (abstractC19687c instanceof C13131I) {
            c13131i = (C13131I) abstractC19687c;
            int i10 = c13131i.f41689q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13131i.f41689q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13131i = new C13131I(this, abstractC19687c);
            }
        } else {
            c13131i = new C13131I(this, abstractC19687c);
        }
        Object objM15501a = c13131i.f41687o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13131i.f41689q0;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c13131i.f41686Z;
                c13132j = (C13132J) c13131i.f41685Y;
                AbstractC9233X.m9807c(objM15501a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c13131i.f41685Y;
                AbstractC9233X.m9807c(objM15501a);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM15501a);
        Boolean boolValueOf = Boolean.valueOf(z6);
        c13131i.f41685Y = this;
        c13131i.f41686Z = z6;
        c13131i.f41689q0 = 1;
        objM15501a = this.f41690Y.m15501a("voice_training_allowed", boolValueOf, c13131i);
        if (objM15501a == enumC19250a) {
            return enumC19250a;
        }
        c13132j = this;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM15501a).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C13169w c13169w = c13132j.f41691Z;
        C3330S c3330s = new C3330S(z6, 7);
        c13131i.f41685Y = abstractC21955Q1M6735b;
        c13131i.f41689q0 = 2;
        if (c13169w.m21029b(c3330s, c13131i) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6735b;
        return abstractC21955Q1;
    }
}
