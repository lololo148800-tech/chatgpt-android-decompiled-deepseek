package p330N4;

import java.util.ArrayList;
import p692d0.C12966e;

/* JADX INFO: renamed from: N4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5675z extends AbstractC5674y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12966e f18428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC5635A f18429b;

    public C5675z(ViewTreeObserverOnPreDrawListenerC5635A viewTreeObserverOnPreDrawListenerC5635A, C12966e c12966e) {
        this.f18429b = viewTreeObserverOnPreDrawListenerC5635A;
        this.f18428a = c12966e;
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: e */
    public final void mo6070e(AbstractC5673x abstractC5673x) {
        ((ArrayList) this.f18428a.get(this.f18429b.f18305Z)).remove(abstractC5673x);
        abstractC5673x.m6106w(this);
    }
}
