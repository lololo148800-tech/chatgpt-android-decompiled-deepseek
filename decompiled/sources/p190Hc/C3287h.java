package p190Hc;

import fo.AbstractC13707d;
import io.sentry.hints.C15370i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.AbstractC17631e;
import ni.AbstractC17640n;
import ni.C17629c;
import ni.C17632f;
import ni.C17636j;
import ni.C17641o;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p086D6.C1970n;
import p092Dc.C2004u;
import p092Dc.C2005v;
import p092Dc.C2006w;
import p092Dc.C2007x;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1081wc.C20884c;
import p1149zc.AbstractC21864z;
import p118Ec.C2398b;
import p118Ec.C2399c;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p432Rh.C6906s;
import p451Sb.C7102a;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p905nd.C17589q;
import p948pi.AbstractC18425h;
import p948pi.C18422e;
import p948pi.C18423f;
import p948pi.C18424g;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3287h implements InterfaceC19018a {

    /* JADX INFO: renamed from: Y */
    public final C2004u f10019Y;

    /* JADX INFO: renamed from: Z */
    public final C2006w f10020Z;

    /* JADX INFO: renamed from: o0 */
    public final C6906s f10021o0;

    /* JADX INFO: renamed from: p0 */
    public final C17629c f10022p0;

    /* JADX INFO: renamed from: q0 */
    public final C3430e f10023q0;

    /* JADX INFO: renamed from: r0 */
    public final C2153Q0 f10024r0;

    /* JADX INFO: renamed from: s0 */
    public final C2217y0 f10025s0;

    public C3287h(AbstractC21864z auth, C2004u userComponentFactory, C2006w loggedOutComponentFactory, C6906s persistentCookieStorage, C17629c appCoroutineScope) {
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(userComponentFactory, "userComponentFactory");
        AbstractC16544l.m18094g(loggedOutComponentFactory, "loggedOutComponentFactory");
        AbstractC16544l.m18094g(persistentCookieStorage, "persistentCookieStorage");
        AbstractC16544l.m18094g(appCoroutineScope, "appCoroutineScope");
        this.f10019Y = userComponentFactory;
        this.f10020Z = loggedOutComponentFactory;
        this.f10021o0 = persistentCookieStorage;
        this.f10022p0 = appCoroutineScope;
        this.f10023q0 = AbstractC8168p6.m8749b("UserComponentManager", null);
        C2153Q0 c2153q0 = ((C17589q) auth).f56308o;
        InterfaceC3283d interfaceC3283dM4161e = m4161e((AbstractC18425h) c2153q0.getValue());
        m4162f(null, interfaceC3283dM4161e);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(interfaceC3283dM4161e);
        this.f10024r0 = c2153q0M3204c;
        this.f10025s0 = new C2217y0(c2153q0M3204c);
        AbstractC2124C.m3226y(new C1970n(c2153q0, 5, new C3284e(this, null)), appCoroutineScope);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: d */
    public static final Object m4157d(C3287h c3287h, InterfaceC3283d interfaceC3283d, AbstractC19687c abstractC19687c) {
        C3285f c3285f;
        C3287h c3287h2;
        InterfaceC3283d interfaceC3283d2;
        c3287h.getClass();
        if (abstractC19687c instanceof C3285f) {
            c3285f = (C3285f) abstractC19687c;
            int i10 = c3285f.f10016q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3285f.f10016q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3285f = new C3285f(c3287h, abstractC19687c);
            }
        } else {
            c3285f = new C3285f(c3287h, abstractC19687c);
        }
        Object obj = c3285f.f10014o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3285f.f10016q0;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC3283d = c3285f.f10013Z;
                c3287h = c3285f.f10012Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3283d2 = c3285f.f10013Z;
                c3287h2 = c3285f.f10012Y;
                AbstractC9233X.m9807c(obj);
            }
            AbstractC8160o6.m8726a(c3287h2.f10023q0, "Closed UserReleaseCompletable for " + interfaceC3283d2.mo3171g(), null, 6);
            AbstractC13707d.f43256c.m15194i(interfaceC3283d2, "UserComponentManager called close for " + interfaceC3283d2.mo3171g());
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC8160o6.m8726a(c3287h.f10023q0, "Closing UserComponent for " + interfaceC3283d.mo3171g(), null, 6);
        AbstractC17631e abstractC17631eMo3169a = interfaceC3283d.mo3169a();
        c3285f.f10012Y = c3287h;
        c3285f.f10013Z = interfaceC3283d;
        c3285f.f10016q0 = 1;
        if (abstractC17631eMo3169a.m19232a(c3285f) == enumC19250a) {
            return enumC19250a;
        }
        AbstractC8160o6.m8726a(c3287h.f10023q0, "Closed UserCoroutineScope for " + interfaceC3283d.mo3171g(), null, 6);
        AbstractC17640n abstractC17640nMo3170f = interfaceC3283d.mo3170f();
        c3285f.f10012Y = c3287h;
        c3285f.f10013Z = interfaceC3283d;
        c3285f.f10016q0 = 2;
        if (abstractC17640nMo3170f.m19236a(c3285f) == enumC19250a) {
            return enumC19250a;
        }
        InterfaceC3283d interfaceC3283d3 = interfaceC3283d;
        c3287h2 = c3287h;
        interfaceC3283d2 = interfaceC3283d3;
        AbstractC8160o6.m8726a(c3287h2.f10023q0, "Closed UserReleaseCompletable for " + interfaceC3283d2.mo3171g(), null, 6);
        AbstractC13707d.f43256c.m15194i(interfaceC3283d2, "UserComponentManager called close for " + interfaceC3283d2.mo3171g());
        return C17296C.f55119a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: a */
    public final Object mo4158a(InterfaceC18770c interfaceC18770c) {
        return C17296C.f55119a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: b */
    public final C3516e mo4159b() {
        return AbstractC0593T.f1824a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: c */
    public final Object mo4160c(InterfaceC18770c interfaceC18770c) {
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC3283d m4161e(AbstractC18425h abstractC18425h) {
        boolean z6 = abstractC18425h instanceof C18422e;
        C3430e c3430e = this.f10023q0;
        C17629c parentScope = this.f10022p0;
        if (z6) {
            AbstractC8160o6.m8726a(c3430e, "Creating new UserComponent for " + abstractC18425h, null, 6);
            C18422e c18422e = (C18422e) abstractC18425h;
            AbstractC16544l.m18094g(parentScope, "parentScope");
            C17641o c17641o = new C17641o(parentScope);
            C2004u c2004u = this.f10019Y;
            c2004u.getClass();
            c18422e.getClass();
            C2005v c2005v = new C2005v(c2004u.f6132a, c18422e, c17641o);
            return c2005v;
        }
        if (!(AbstractC16544l.m18089b(abstractC18425h, C18423f.f58786a) ? true : AbstractC16544l.m18089b(abstractC18425h, C18424g.f58787a))) {
            throw new C0644w();
        }
        AbstractC8160o6.m8726a(c3430e, "Creating new LoggedOutComponent for " + abstractC18425h, null, 6);
        AbstractC16544l.m18094g(parentScope, "parentScope");
        C17636j c17636j = new C17636j(parentScope);
        C2006w c2006w = this.f10020Z;
        c2006w.getClass();
        abstractC18425h.getClass();
        C2007x c2007x = new C2007x(c2006w.f6150a, new C15370i(6), new C7102a(26), new C20884c(), abstractC18425h, c17636j);
        C2399c c2399c = (C2399c) c2007x.f6164n.get();
        if (c2399c.f7464c.getAndSet(true)) {
            throw new IllegalArgumentException("Initialize may only be called once!");
        }
        AbstractC0575H.m1156D(c2399c.f7463b, null, null, new C2398b(c2399c, null), 3);
        return c2007x;
    }

    /* JADX INFO: renamed from: f */
    public final void m4162f(InterfaceC3283d interfaceC3283d, InterfaceC3283d interfaceC3283d2) {
        if ((interfaceC3283d instanceof C2005v) && (interfaceC3283d2 instanceof C2007x)) {
            AbstractC0575H.m1156D(this.f10022p0, null, null, new C3286g(this, null), 3);
        }
        C17632f.f56419a.m19234a(interfaceC3283d2);
    }
}
