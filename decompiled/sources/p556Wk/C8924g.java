package p556Wk;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p071Ch.C1661A;
import p071Ch.C1670a;
import p409Qk.C6752c;
import p754fl.C13696f;
import p972qm.InterfaceC18770c;
import sl.C19666a;

/* JADX INFO: renamed from: Wk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C8924g implements InterfaceC8888B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27296a;

    public /* synthetic */ C8924g(int i10) {
        this.f27296a = i10;
    }

    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: a */
    public final Object mo2503a(InterfaceC1436k interfaceC1436k) {
        switch (this.f27296a) {
            case 0:
                return new C8926h(interfaceC1436k);
            default:
                interfaceC1436k.invoke(new C8912a(6));
                return new C8905T();
        }
    }

    @Override // p556Wk.InterfaceC8888B
    /* JADX INFO: renamed from: c */
    public final void mo2505c(Object obj, C6752c scope) {
        switch (this.f27296a) {
            case 0:
                C8926h plugin = (C8926h) obj;
                AbstractC16544l.m18094g(plugin, "plugin");
                AbstractC16544l.m18094g(scope, "scope");
                scope.f21671r0.m21471f(C13696f.f43209g, new C1670a(plugin, (InterfaceC18770c) null, 3));
                break;
            default:
                C8905T plugin2 = (C8905T) obj;
                AbstractC16544l.m18094g(plugin2, "plugin");
                AbstractC16544l.m18094g(scope, "scope");
                scope.f21671r0.m21471f(C13696f.f43213k, new C1661A(plugin2, scope, null, 4));
                break;
        }
    }

    @Override // p556Wk.InterfaceC8888B
    public final C19666a getKey() {
        switch (this.f27296a) {
            case 0:
                return C8926h.f27298c;
            default:
                return C8905T.f27255c;
        }
    }
}
