package p071Ch;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p059C5.C1592j;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.C6226E;
import p407Qh.InterfaceC6732b;
import p407Qh.InterfaceC6734d;
import p409Qk.C6752c;
import p556Wk.InterfaceC8888B;
import p754fl.C13696f;
import sl.C19666a;

/* JADX INFO: renamed from: Ch.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C1684o implements InterfaceC8888B, InterfaceC6734d, InterfaceC6732b {

    /* JADX INFO: renamed from: a */
    public final C1692w f4763a;

    /* JADX INFO: renamed from: b */
    public final C6226E f4764b;

    /* JADX INFO: renamed from: c */
    public final C19666a f4765c;

    public C1684o(C1692w c1692w, C6226E c6226e) {
        InterfaceC3777y interfaceC3777yM18075c;
        this.f4763a = c1692w;
        this.f4764b = c6226e;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        this.f4765c = new C19666a("PlayIntegrity", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
    }

    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: a */
    public final Object mo2503a(InterfaceC1436k interfaceC1436k) {
        return C17296C.f55119a;
    }

    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: c */
    public final void mo2505c(Object obj, C6752c scope) {
        C17296C plugin = (C17296C) obj;
        AbstractC16544l.m18094g(plugin, "plugin");
        AbstractC16544l.m18094g(scope, "scope");
        scope.f21671r0.m21471f(C13696f.f43210h, new C1592j(this, scope, null, 1));
    }

    @Override // p556Wk.InterfaceC8888B
    public final C19666a getKey() {
        return this.f4765c;
    }

    @Override // p407Qh.InterfaceC6733c
    /* JADX INFO: renamed from: b */
    public final InterfaceC8888B mo2504b() {
        return this;
    }
}
