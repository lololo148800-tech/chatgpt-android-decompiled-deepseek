package p1125yb;

import p1148zb.C21830a;
import p746fa.C13599h;

/* JADX INFO: renamed from: yb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21400f implements InterfaceC21403i {

    /* JADX INFO: renamed from: a */
    public final C21404j f67940a;

    /* JADX INFO: renamed from: b */
    public final C13599h f67941b;

    public C21400f(C21404j c21404j, C13599h c13599h) {
        this.f67940a = c21404j;
        this.f67941b = c13599h;
    }

    @Override // p1125yb.InterfaceC21403i
    /* JADX INFO: renamed from: a */
    public final boolean mo21790a(C21830a c21830a) {
        if (c21830a.f69281b != 4 || this.f67940a.m21793a(c21830a)) {
            return false;
        }
        String str = c21830a.f69282c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f67941b.m15114b(new C21395a(c21830a.f69284e, c21830a.f69285f, str));
        return true;
    }

    @Override // p1125yb.InterfaceC21403i
    /* JADX INFO: renamed from: b */
    public final boolean mo21791b(Exception exc) {
        this.f67941b.m15115c(exc);
        return true;
    }
}
