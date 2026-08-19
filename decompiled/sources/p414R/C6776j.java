package p414R;

import android.view.Surface;
import p178H.C3145g;
import p228J.C3809K;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.C5231m;
import p301M.InterfaceC5219a;
import p544W9.AbstractC8577W2;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: R.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6776j implements InterfaceC5219a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6778l f21753Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6777k f21754Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f21755o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3145g f21756p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3145g f21757q0;

    public /* synthetic */ C6776j(C6778l c6778l, C6777k c6777k, int i10, C3145g c3145g, C3145g c3145g2) {
        this.f21753Y = c6778l;
        this.f21754Z = c6777k;
        this.f21755o0 = i10;
        this.f21756p0 = c3145g;
        this.f21757q0 = c3145g2;
    }

    @Override // p301M.InterfaceC5219a
    public final InterfaceFutureC13608b apply(Object obj) {
        C6777k c6777k = this.f21754Z;
        Surface surface = (Surface) obj;
        C6778l c6778l = this.f21753Y;
        c6778l.getClass();
        surface.getClass();
        try {
            c6777k.m4510d();
            C6779m c6779m = new C6779m(surface, this.f21755o0, c6778l.f21768g.f11606a, this.f21756p0, this.f21757q0);
            c6779m.f21786v0.f30070Z.mo5766a(new RunnableC6775i(c6777k, 1), AbstractC8577W2.m9240b());
            AbstractC4941g.m5559R("Consumer can only be linked once.", c6777k.f21761r == null);
            c6777k.f21761r = c6779m;
            return AbstractC5229k.m5779c(c6779m);
        } catch (C3809K e10) {
            return new C5231m(e10, 1);
        }
    }
}
