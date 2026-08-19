package p924od;

import gd.C13955k0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import ni.C17641o;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1111xl.C21296a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p359Oc.C6165a;
import p359Oc.C6166b;
import p359Oc.C6168d;
import p359Oc.EnumC6167c;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p947pd.C18363c;
import p947pd.C18365e;
import p947pd.C18366f;
import p947pd.C18367g;
import p947pd.C18370j;
import p947pd.C18373m;
import p947pd.C18376p;
import p947pd.C18379s;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: od.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18075e {

    /* JADX INFO: renamed from: a */
    public final C18367g f57644a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13849E f57645b;

    /* JADX INFO: renamed from: c */
    public final C3430e f57646c = AbstractC8168p6.m8749b("ComplianceRepository", null);

    /* JADX INFO: renamed from: d */
    public final C2153Q0 f57647d;

    /* JADX INFO: renamed from: e */
    public final C2153Q0 f57648e;

    public C18075e(C18367g c18367g, C17641o c17641o, InterfaceC13849E interfaceC13849E) {
        this.f57644a = c18367g;
        this.f57645b = interfaceC13849E;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(null);
        this.f57647d = c2153q0M3204c;
        this.f57648e = c2153q0M3204c;
        AbstractC0575H.m1156D(c17641o, null, null, new C18071a(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19694a(EnumC6167c enumC6167c, AbstractC19687c abstractC19687c) {
        C18073c c18073c;
        InterfaceC3777y interfaceC3777yM18075c;
        C18075e c18075e;
        if (abstractC19687c instanceof C18073c) {
            c18073c = (C18073c) abstractC19687c;
            int i10 = c18073c.f57639p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18073c.f57639p0 = i10 - Integer.MIN_VALUE;
            } else {
                c18073c = new C18073c(this, abstractC19687c);
            }
        } else {
            c18073c = new C18073c(this, abstractC19687c);
        }
        Object objM9690b = c18073c.f57637Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18073c.f57639p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            if (!((C14005w2) this.f57645b).m15481a(C13955k0.f44009c)) {
                return new C21952P1(C17296C.f55119a);
            }
            if (AbstractC18072b.f57635a[enumC6167c.ordinal()] != 1) {
                throw new C0644w();
            }
            c18073c.f57636Y = this;
            c18073c.f57639p0 = 1;
            C18367g c18367g = this.f57644a;
            C18365e c18365e = new C18365e(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C18363c.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C18363c.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            objM9690b = AbstractC9144I.m9690b(c18367g.f58640a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c18365e, c18073c);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c18075e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18075e = c18073c.f57636Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM9690b).m6735b();
        if (abstractC21955Q1M6735b instanceof AbstractC21933K1) {
            AbstractC8160o6.m8731f(c18075e.f57646c, "Error logging compliance", ((AbstractC21933K1) abstractC21955Q1M6735b).f69485a, null, 4);
        }
        if (abstractC21955Q1M6735b instanceof C21952P1) {
            c18075e.f57647d.setValue(null);
        }
        return abstractC21955Q1M6735b;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m19695b(AbstractC19687c abstractC19687c) {
        C18074d c18074d;
        InterfaceC3777y interfaceC3777yM18075c;
        C18075e c18075e;
        Object objM6734a;
        C6168d c6168d;
        C18373m c18373m;
        String str;
        String str2;
        if (abstractC19687c instanceof C18074d) {
            c18074d = (C18074d) abstractC19687c;
            int i10 = c18074d.f57643p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18074d.f57643p0 = i10 - Integer.MIN_VALUE;
            } else {
                c18074d = new C18074d(this, abstractC19687c);
            }
        } else {
            c18074d = new C18074d(this, abstractC19687c);
        }
        Object objM9690b = c18074d.f57641Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18074d.f57643p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            if (!((C14005w2) this.f57645b).m15481a(C13955k0.f44009c)) {
                return new C21952P1(null);
            }
            c18074d.f57640Y = this;
            c18074d.f57643p0 = 1;
            C18367g c18367g = this.f57644a;
            C18366f c18366f = new C18366f(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C18370j.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C18370j.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            objM9690b = AbstractC9144I.m9690b(c18367g.f58640a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c18366f, c18074d);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c18075e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18075e = c18074d.f57640Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            C18370j c18370j = (C18370j) ((C6223B) abstractC6224C).f20258a;
            c18075e.getClass();
            C18376p c18376p = c18370j.f58642a;
            if (!c18376p.f58648a || (c18373m = c18376p.f58649b) == null) {
                c6168d = null;
            } else {
                EnumC6167c enumC6167c = EnumC6167c.f20076Y;
                String str3 = c18373m.f58644a;
                if (str3 == null || (str = c18373m.f58645b) == null) {
                    c6168d = null;
                } else {
                    C6165a c6165a = new C6165a();
                    C18379s c18379s = c18373m.f58646c;
                    c6168d = new C6168d(str3, str, c6165a, c18379s != null ? c18379s.f58651a : null, (c18379s == null || (str2 = c18379s.f58652b) == null) ? null : new C6166b(str2), c18379s != null ? c18379s.f58653c : false);
                }
            }
            objM6734a = new C21952P1(c6168d);
        } else if (abstractC6224C instanceof C6248v) {
            objM6734a = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (objM6734a instanceof AbstractC21933K1) {
            AbstractC8160o6.m8731f(c18075e.f57646c, "Error fetching compliance status", ((AbstractC21933K1) objM6734a).f69485a, null, 4);
        }
        if (objM6734a instanceof C21952P1) {
            c18075e.f57647d.setValue((C6168d) ((C21952P1) objM6734a).f69511a);
        }
        return objM6734a;
    }
}
