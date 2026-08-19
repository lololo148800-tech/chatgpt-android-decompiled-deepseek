package kotlin.jvm.internal;

import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3770r;
import p225Im.InterfaceC3771s;

/* JADX INFO: renamed from: kotlin.jvm.internal.t */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16552t extends AbstractC16555w implements InterfaceC3771s {
    @Override // kotlin.jvm.internal.AbstractC16535c
    public final InterfaceC3755c computeReflected() {
        return AbstractC16526C.f51263a.mo5698g(this);
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return get();
    }

    @Override // p225Im.InterfaceC3776x
    public final InterfaceC3770r getGetter() {
        return ((InterfaceC3771s) getReflected()).getGetter();
    }
}
