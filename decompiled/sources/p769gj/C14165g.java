package p769gj;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: gj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14165g implements InterfaceC14161c {

    /* JADX INFO: renamed from: Y */
    public final Object f44541Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f44542Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1426a f44543o0;

    /* JADX INFO: renamed from: p0 */
    public final C14168j f44544p0;

    public C14165g(Object wrapped, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(wrapped, "wrapped");
        this.f44541Y = wrapped;
        this.f44542Z = false;
        this.f44543o0 = interfaceC1426a;
        this.f44544p0 = new C14168j(AbstractC16526C.f51263a.mo5693b(C14165g.class), C14163e.f44536Z, C14164f.f44540Y, 4);
    }

    @Override // p769gj.InterfaceC14161c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14147A mo1134a() {
        return this.f44544p0;
    }
}
