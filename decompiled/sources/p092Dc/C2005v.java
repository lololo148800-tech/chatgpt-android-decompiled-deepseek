package p092Dc;

import kotlin.jvm.internal.AbstractC16544l;
import ni.AbstractC17631e;
import ni.AbstractC17640n;
import ni.C17641o;
import ni.C17642p;
import p016Ae.C0453o;
import p041Be.C1223P;
import p071Ch.C1664D;
import p148Fi.C2763F0;
import p190Hc.InterfaceC3283d;
import p215Ic.C3686c;
import p217Ie.C3709e;
import p248Jk.C4471b;
import p248Jk.C4472c;
import p248Jk.C4474e;
import p248Jk.InterfaceC4478i;
import p576Xe.C9474G;
import p873lh.C16951b;
import p876lm.InterfaceC17068a;
import p948pi.AbstractC18425h;
import p948pi.C18422e;

/* JADX INFO: renamed from: Dc.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C2005v implements InterfaceC3283d {

    /* JADX INFO: renamed from: a */
    public final C18422e f6133a;

    /* JADX INFO: renamed from: b */
    public final C17641o f6134b;

    /* JADX INFO: renamed from: c */
    public final C1998o f6135c;

    /* JADX INFO: renamed from: d */
    public final C2005v f6136d = this;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4478i f6137e;

    /* JADX INFO: renamed from: f */
    public final C4474e f6138f;

    /* JADX INFO: renamed from: g */
    public final C4474e f6139g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4478i f6140h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4478i f6141i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4478i f6142j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4478i f6143k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4478i f6144l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4478i f6145m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC4478i f6146n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4478i f6147o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC4478i f6148p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC4478i f6149q;

    public C2005v(C1998o c1998o, C18422e c18422e, C17641o c17641o) {
        this.f6135c = c1998o;
        this.f6133a = c18422e;
        this.f6134b = c17641o;
        InterfaceC4478i appCoroutineScope = c1998o.f6042f;
        AbstractC16544l.m18094g(appCoroutineScope, "appCoroutineScope");
        this.f6137e = C4472c.m5205a(new C16951b(appCoroutineScope, 5));
        this.f6138f = C4474e.m5206a(c18422e);
        C4474e c4474eM5206a = C4474e.m5206a(c17641o);
        this.f6139g = c4474eM5206a;
        InterfaceC4478i interfaceC4478iM5205a = C4472c.m5205a(new C3686c(c1998o.f6040e, c4474eM5206a, this.f6138f, this.f6137e, 3));
        this.f6140h = interfaceC4478iM5205a;
        InterfaceC4478i interfaceC4478iM5205a2 = C4472c.m5205a(new C0453o(interfaceC4478iM5205a, 28));
        this.f6141i = interfaceC4478iM5205a2;
        C4474e authSession = this.f6138f;
        AbstractC16544l.m18094g(authSession, "authSession");
        this.f6142j = C4472c.m5205a(new C1989f(C4472c.m5205a(new C2763F0(authSession, interfaceC4478iM5205a2, 5)), this.f6139g, this.f6137e, new C2000q(this, 1)));
        InterfaceC4478i dependencies = this.f6140h;
        AbstractC16544l.m18094g(dependencies, "dependencies");
        this.f6143k = C4472c.m5205a(new C1223P(dependencies, 21));
        InterfaceC4478i requester = c1998o.f6037c0;
        AbstractC16544l.m18094g(requester, "requester");
        InterfaceC4478i interfaceC4478iM5205a3 = C4472c.m5205a(new C1223P(requester, 25));
        InterfaceC4478i store = this.f6143k;
        C4471b authSessionProvider = c1998o.f6023R;
        C4474e coroutineScope = this.f6139g;
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        this.f6144l = C4472c.m5205a(new C3709e(store, authSessionProvider, interfaceC4478iM5205a3, coroutineScope));
        InterfaceC4478i dependencies2 = this.f6140h;
        AbstractC16544l.m18094g(dependencies2, "dependencies");
        this.f6145m = C4472c.m5205a(new C1223P(dependencies2, 17));
        InterfaceC4478i dependencies3 = this.f6140h;
        AbstractC16544l.m18094g(dependencies3, "dependencies");
        this.f6146n = C4472c.m5205a(new C1223P(dependencies3, 18));
        InterfaceC4478i requester2 = c1998o.f6037c0;
        AbstractC16544l.m18094g(requester2, "requester");
        InterfaceC4478i interfaceC4478iM5205a4 = C4472c.m5205a(new C1223P(requester2, 23));
        InterfaceC4478i store2 = this.f6145m;
        InterfaceC4478i legacyStore = this.f6146n;
        C4471b authSessionProvider2 = c1998o.f6023R;
        C4474e coroutineScope2 = this.f6139g;
        AbstractC16544l.m18094g(store2, "store");
        AbstractC16544l.m18094g(legacyStore, "legacyStore");
        AbstractC16544l.m18094g(authSessionProvider2, "authSessionProvider");
        AbstractC16544l.m18094g(coroutineScope2, "coroutineScope");
        InterfaceC4478i interfaceC4478iM5205a5 = C4472c.m5205a(new C1664D((InterfaceC17068a) store2, (InterfaceC17068a) legacyStore, authSessionProvider2, interfaceC4478iM5205a4, coroutineScope2));
        this.f6147o = interfaceC4478iM5205a5;
        InterfaceC4478i store3 = this.f6141i;
        C4474e coroutineScope3 = this.f6139g;
        InterfaceC4478i userRepository = this.f6144l;
        AbstractC16544l.m18094g(store3, "store");
        AbstractC16544l.m18094g(coroutineScope3, "coroutineScope");
        AbstractC16544l.m18094g(userRepository, "userRepository");
        this.f6148p = C4472c.m5205a(new C9474G(store3, coroutineScope3, userRepository, interfaceC4478iM5205a5));
        InterfaceC4478i requester3 = c1998o.f6037c0;
        AbstractC16544l.m18094g(requester3, "requester");
        this.f6149q = C4472c.m5205a(new C16951b(requester3, 9));
    }

    @Override // p190Hc.InterfaceC3283d
    /* JADX INFO: renamed from: a */
    public final AbstractC17631e mo3169a() {
        return this.f6134b;
    }

    @Override // p190Hc.InterfaceC3283d
    /* JADX INFO: renamed from: f */
    public final AbstractC17640n mo3170f() {
        return (C17642p) this.f6137e.get();
    }

    @Override // p190Hc.InterfaceC3283d
    /* JADX INFO: renamed from: g */
    public final AbstractC18425h mo3171g() {
        return this.f6133a;
    }
}
