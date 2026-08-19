package p758g0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;

/* JADX INFO: renamed from: g0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13761f0 {

    /* JADX INFO: renamed from: a */
    public final C13783q0 f43447a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f43448b = C5997d.m6430Q(null, C5975S.f19448r0);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13771k0 f43449c;

    public C13761f0(C13771k0 c13771k0, C13783q0 c13783q0, String str) {
        this.f43449c = c13771k0;
        this.f43447a = c13783q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C13759e0 m15259a(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        C6002f0 c6002f0 = this.f43448b;
        C13759e0 c13759e0 = (C13759e0) c6002f0.getValue();
        C13771k0 c13771k0 = this.f43449c;
        if (c13759e0 == null) {
            Object objInvoke = interfaceC1436k2.invoke(c13771k0.m15272c());
            Object objInvoke2 = interfaceC1436k2.invoke(c13771k0.m15272c());
            C13783q0 c13783q0 = this.f43447a;
            AbstractC13784r abstractC13784r = (AbstractC13784r) c13783q0.f43526a.invoke(objInvoke2);
            abstractC13784r.mo15286d();
            C13767i0 c13767i0 = new C13767i0(c13771k0, objInvoke, abstractC13784r, c13783q0);
            c13759e0 = new C13759e0(this, c13767i0, interfaceC1436k, interfaceC1436k2);
            c6002f0.setValue(c13759e0);
            c13771k0.f43497i.add(c13767i0);
        }
        c13759e0.f43440o0 = (AbstractC16546n) interfaceC1436k2;
        c13759e0.f43439Z = (AbstractC16546n) interfaceC1436k;
        c13759e0.m15258c(c13771k0.m15275f());
        return c13759e0;
    }
}
