package p1125yb;

import p1148zb.C21830a;
import p746fa.C13599h;

/* JADX INFO: renamed from: yb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21401g implements InterfaceC21403i {

    /* JADX INFO: renamed from: a */
    public final C13599h f67942a;

    public C21401g(C13599h c13599h) {
        this.f67942a = c13599h;
    }

    @Override // p1125yb.InterfaceC21403i
    /* JADX INFO: renamed from: a */
    public final boolean mo21790a(C21830a c21830a) {
        int i10 = c21830a.f69281b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.f67942a.m15116d(c21830a.f69280a);
        return true;
    }

    @Override // p1125yb.InterfaceC21403i
    /* JADX INFO: renamed from: b */
    public final boolean mo21791b(Exception exc) {
        return false;
    }
}
