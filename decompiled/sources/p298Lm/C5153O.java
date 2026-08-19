package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p225Im.InterfaceC3761i;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Lm.O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5153O extends AbstractC5201s0 implements InterfaceC3761i {

    /* JADX INFO: renamed from: v0 */
    public final C5154P f16802v0;

    public C5153O(C5154P property) {
        AbstractC16544l.m18094g(property, "property");
        this.f16802v0 = property;
    }

    @Override // p225Im.InterfaceC3768p
    /* JADX INFO: renamed from: f */
    public final InterfaceC3776x mo4451f() {
        return this.f16802v0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ((C5153O) this.f16802v0.f16803B0.getValue()).call(obj);
        return C17296C.f55119a;
    }

    @Override // p298Lm.AbstractC5193o0
    /* JADX INFO: renamed from: r */
    public final AbstractC5203t0 mo5743r() {
        return this.f16802v0;
    }
}
