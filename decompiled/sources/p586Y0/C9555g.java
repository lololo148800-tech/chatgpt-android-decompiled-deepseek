package p586Y0;

import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p030B2.C0794y0;
import p030B2.InterfaceC0783t;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Y0.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9555g implements InterfaceC9553e, InterfaceC0783t {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC16546n f28737Y;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C9555g(InterfaceC1436k interfaceC1436k) {
        this.f28737Y = (AbstractC16546n) interfaceC1436k;
    }

    @Override // p586Y0.InterfaceC9553e
    public void dispose() {
        AbstractC16546n abstractC16546n = this.f28737Y;
        synchronized (AbstractC9562n.f28759b) {
            AbstractC9562n.f28764g = AbstractC17680n.m19357g0((Iterable) AbstractC9562n.f28764g, abstractC16546n);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p030B2.InterfaceC0783t
    /* JADX INFO: renamed from: l */
    public C0794y0 mo1773l(View view, C0794y0 c0794y0) {
        ?? r6 = this.f28737Y;
        AbstractC16544l.m18094g(view, "<anonymous parameter 0>");
        r6.invoke(c0794y0);
        return c0794y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C9555g(InterfaceC1439n interfaceC1439n) {
        this.f28737Y = (AbstractC16546n) interfaceC1439n;
    }
}
