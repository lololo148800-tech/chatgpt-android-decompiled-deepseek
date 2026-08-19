package kotlin.jvm.internal;

import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3761i;
import p225Im.InterfaceC3762j;
import p225Im.InterfaceC3770r;

/* JADX INFO: renamed from: kotlin.jvm.internal.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16547o extends AbstractC16550r implements InterfaceC3762j {
    @Override // kotlin.jvm.internal.AbstractC16535c
    public InterfaceC3755c computeReflected() {
        return AbstractC16526C.f51263a.mo5696e(this);
    }

    @Override // p225Im.InterfaceC3771s
    public Object getDelegate() {
        return ((InterfaceC3762j) getReflected()).getDelegate();
    }

    @Override // p049Bm.InterfaceC1426a
    public Object invoke() {
        return get();
    }

    @Override // p225Im.InterfaceC3776x
    public InterfaceC3770r getGetter() {
        return ((InterfaceC3762j) getReflected()).getGetter();
    }

    @Override // p225Im.InterfaceC3765m
    public InterfaceC3761i getSetter() {
        return ((InterfaceC3762j) getReflected()).getSetter();
    }
}
