package kotlin.jvm.internal;

import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3774v;
import p225Im.InterfaceC3775w;
import p298Lm.AbstractC5202t;

/* JADX INFO: renamed from: kotlin.jvm.internal.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C16554v extends AbstractC16555w implements InterfaceC3775w {
    @Override // kotlin.jvm.internal.AbstractC16535c
    public final InterfaceC3755c computeReflected() {
        return AbstractC16526C.f51263a.mo5700i(this);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractC5202t) getGetter()).call(obj, obj2);
    }

    @Override // p225Im.InterfaceC3776x
    public final InterfaceC3774v getGetter() {
        return ((InterfaceC3775w) getReflected()).getGetter();
    }
}
