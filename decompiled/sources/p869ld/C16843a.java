package p869ld;

import kotlin.jvm.internal.AbstractC16544l;
import p1081wc.C20887f;
import p1081wc.InterfaceC20904w;
import p374P5.C6358k;
import p571X9.AbstractC9306j0;
import p746fa.InterfaceC13595d;
import p841k.C16281a;
import p841k.InterfaceC16282b;
import p909nm.C17690x;

/* JADX INFO: renamed from: ld.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16843a implements InterfaceC13595d, InterfaceC16282b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6358k f54024Y;

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        C16281a result = (C16281a) obj;
        AbstractC16544l.m18094g(result, "result");
        ((InterfaceC20904w) this.f54024Y.f20695o0).mo21448b(C20887f.f66529d, "Result: " + result.f50448Y, C17690x.f56481Y);
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        ((InterfaceC20904w) this.f54024Y.f20695o0).mo21448b(C20887f.f66529d, AbstractC9306j0.m9889h("Get info failed: ", exc.getMessage()), C17690x.f56481Y);
    }
}
