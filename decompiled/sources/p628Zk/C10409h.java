package p628Zk;

import kotlin.jvm.internal.AbstractC16544l;
import p041Be.C1217J;
import p049Bm.InterfaceC1436k;
import p409Qk.C6752c;
import p556Wk.InterfaceC8888B;
import p754fl.C13696f;
import p792hl.C14526a;
import p972qm.InterfaceC18770c;
import sl.C19666a;

/* JADX INFO: renamed from: Zk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10409h implements InterfaceC8888B {
    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: a */
    public final Object mo2503a(InterfaceC1436k interfaceC1436k) {
        C10410i c10410i = new C10410i();
        interfaceC1436k.invoke(c10410i);
        return new C10416o(c10410i.f30850b, c10410i.f30849a);
    }

    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: c */
    public final void mo2505c(Object obj, C6752c scope) {
        C10416o plugin = (C10416o) obj;
        AbstractC16544l.m18094g(plugin, "plugin");
        AbstractC16544l.m18094g(scope, "scope");
        InterfaceC18770c interfaceC18770c = null;
        scope.f21671r0.m21471f(C13696f.f43210h, new C10408g(plugin, interfaceC18770c, 0));
        scope.f21673t0.m21471f(C13696f.f43215m, new C10408g(plugin, interfaceC18770c, 1));
        scope.f21674u0.m21471f(C14526a.f45780h, new C1217J(plugin, interfaceC18770c, 10));
    }

    @Override // p556Wk.InterfaceC8888B
    public final C19666a getKey() {
        return C10416o.f30877q0;
    }
}
