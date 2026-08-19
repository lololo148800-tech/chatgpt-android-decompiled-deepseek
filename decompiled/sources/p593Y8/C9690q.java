package p593Y8;

import fo.C13711h;
import java.util.HashMap;
import p001A.RunnableC0066i;
import p522V8.C7834a;
import p522V8.C7836c;
import p522V8.EnumC7837d;
import p522V8.InterfaceC7838e;
import p561X.C8990d;
import p615Z6.C10252z0;
import p701d9.C13046a;

/* JADX INFO: renamed from: Y8.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9690q {

    /* JADX INFO: renamed from: a */
    public final C9682i f29206a;

    /* JADX INFO: renamed from: b */
    public final String f29207b;

    /* JADX INFO: renamed from: c */
    public final C7836c f29208c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7838e f29209d;

    /* JADX INFO: renamed from: e */
    public final C9691r f29210e;

    public C9690q(C9682i c9682i, String str, C7836c c7836c, InterfaceC7838e interfaceC7838e, C9691r c9691r) {
        this.f29206a = c9682i;
        this.f29207b = str;
        this.f29208c = c7836c;
        this.f29209d = interfaceC7838e;
        this.f29210e = c9691r;
    }

    /* JADX INFO: renamed from: a */
    public final void m10281a(C7834a c7834a) {
        C8990d c8990d = new C8990d(1);
        C9682i c9682i = this.f29206a;
        String str = this.f29207b;
        InterfaceC7838e interfaceC7838e = this.f29209d;
        C7836c c7836c = this.f29208c;
        C9691r c9691r = this.f29210e;
        EnumC7837d enumC7837d = c7834a.f24727b;
        C13711h c13711hM10270a = C9682i.m10270a();
        c13711hM10270a.m15184G(c9682i.f29188a);
        c13711hM10270a.f43261p0 = enumC7837d;
        c13711hM10270a.f43260o0 = c9682i.f29189b;
        C9682i c9682iM15193g = c13711hM10270a.m15193g();
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30459r0 = new HashMap();
        c10252z0.f30457p0 = Long.valueOf(c9691r.f29212a.getTime());
        c10252z0.f30458q0 = Long.valueOf(c9691r.f29213b.getTime());
        c10252z0.f30454Y = str;
        c10252z0.f30456o0 = new C9685l(c7836c, (byte[]) interfaceC7838e.mo22421apply(c7834a.f24726a));
        c10252z0.f30455Z = null;
        C9681h c9681hM10846f = c10252z0.m10846f();
        C13046a c13046a = (C13046a) c9691r.f29214c;
        c13046a.getClass();
        c13046a.f41462b.execute(new RunnableC0066i(c13046a, c9682iM15193g, c8990d, c9681hM10846f));
    }
}
