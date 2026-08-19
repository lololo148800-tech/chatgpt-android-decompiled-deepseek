package p582Xk;

import java.util.Collections;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1111xl.C21296a;
import p225Im.C3743B;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p225Im.InterfaceC3778z;
import p409Qk.C6752c;
import p544W9.AbstractC8443A;
import p556Wk.InterfaceC8888B;
import sl.C19666a;

/* JADX INFO: renamed from: Xk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9526c implements InterfaceC8888B {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1426a f28667a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f28668b;

    /* JADX INFO: renamed from: c */
    public final C19666a f28669c;

    public C9526c(String str, InterfaceC1426a createConfiguration, InterfaceC1436k interfaceC1436k) {
        InterfaceC3777y interfaceC3777yM18076d;
        AbstractC16544l.m18094g(createConfiguration, "createConfiguration");
        this.f28667a = createConfiguration;
        this.f28668b = interfaceC1436k;
        C16527D c16527d = AbstractC16526C.f51263a;
        InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(C9527d.class);
        try {
            C3743B c3743b = C3743B.f11391c;
            InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C9526c.class);
            EnumC3744C enumC3744C = EnumC3744C.f11394Y;
            InterfaceC3778z interfaceC3778zMo5705n = c16527d.mo5705n(interfaceC3756dMo5693b2);
            c16527d.mo5703l(interfaceC3778zMo5705n, Collections.singletonList(AbstractC16526C.m18075c(Object.class)));
            interfaceC3777yM18076d = AbstractC16526C.m18076d(C9527d.class, AbstractC8443A.m9046b(c16527d.mo5704m(interfaceC3778zMo5705n, Collections.emptyList(), false)));
        } catch (Throwable unused) {
            interfaceC3777yM18076d = null;
        }
        this.f28669c = new C19666a(str, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18076d));
    }

    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: a */
    public final Object mo2503a(InterfaceC1436k interfaceC1436k) {
        Object objInvoke = this.f28667a.invoke();
        interfaceC1436k.invoke(objInvoke);
        return new C9527d(this.f28669c, objInvoke, this.f28668b);
    }

    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: c */
    public final void mo2505c(Object obj, C6752c scope) {
        C9527d plugin = (C9527d) obj;
        AbstractC16544l.m18094g(plugin, "plugin");
        AbstractC16544l.m18094g(scope, "scope");
        C9525b c9525b = new C9525b(plugin.f28670Y, scope, plugin.f28671Z);
        plugin.f28672o0.invoke(c9525b);
        plugin.f28673p0 = c9525b.f28666d;
        for (C9528e c9528e : c9525b.f28665c) {
            c9528e.getClass();
            c9528e.f28674a.mo9566a(scope, c9528e.f28675b);
        }
    }

    @Override // p556Wk.InterfaceC8888B
    public final C19666a getKey() {
        return this.f28669c;
    }
}
