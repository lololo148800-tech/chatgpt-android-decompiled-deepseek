package kotlin.jvm.internal;

import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3763k;
import p225Im.InterfaceC3764l;
import p225Im.InterfaceC3772t;
import p298Lm.AbstractC5202t;

/* JADX INFO: renamed from: kotlin.jvm.internal.q */
/* JADX INFO: loaded from: classes3.dex */
public class C16549q extends AbstractC16550r implements InterfaceC3764l {
    public C16549q(Class cls, String str, String str2, int i10) {
        super(AbstractC16535c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC16535c
    public final InterfaceC3755c computeReflected() {
        return AbstractC16526C.f51263a.mo5697f(this);
    }

    /* JADX INFO: renamed from: g */
    public void mo4450g(Object obj, Object obj2) {
        ((AbstractC5202t) getSetter()).call(obj, obj2);
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
        return ((InterfaceC3764l) getReflected()).getGetter();
    }

    @Override // p225Im.InterfaceC3765m
    public final InterfaceC3763k getSetter() {
        return ((InterfaceC3764l) getReflected()).getSetter();
    }
}
