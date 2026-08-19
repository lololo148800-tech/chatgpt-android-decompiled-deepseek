package p1036u9;

import p377P9.HandlerC6378d;

/* JADX INFO: renamed from: u9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C20170p implements InterfaceC20156b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C20159e f63883a;

    public C20170p(C20159e c20159e) {
        this.f63883a = c20159e;
    }

    @Override // p1036u9.InterfaceC20156b
    /* JADX INFO: renamed from: a */
    public final void mo17790a(boolean z6) {
        HandlerC6378d handlerC6378d = this.f63883a.f63870z0;
        handlerC6378d.sendMessage(handlerC6378d.obtainMessage(1, Boolean.valueOf(z6)));
    }
}
