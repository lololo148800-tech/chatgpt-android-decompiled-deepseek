package kotlin.jvm.internal;

import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3772t;
import p225Im.InterfaceC3773u;
import p298Lm.AbstractC5202t;

/* JADX INFO: renamed from: kotlin.jvm.internal.u */
/* JADX INFO: loaded from: classes3.dex */
public class C16553u extends AbstractC16555w implements InterfaceC3773u {
    public C16553u(Class cls, String str, String str2, int i10) {
        super(AbstractC16535c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC16535c
    public final InterfaceC3755c computeReflected() {
        return AbstractC16526C.f51263a.mo5699h(this);
    }

    public Object get(Object obj) {
        return ((AbstractC5202t) getGetter()).call(obj);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p225Im.InterfaceC3776x
    public final InterfaceC3772t getGetter() {
        return ((InterfaceC3773u) getReflected()).getGetter();
    }
}
