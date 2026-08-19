package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Lm.T */
/* JADX INFO: loaded from: classes2.dex */
public final class C5157T extends AbstractC5201s0 implements InterfaceC1440o {

    /* JADX INFO: renamed from: v0 */
    public final C5158U f16806v0;

    public C5157T(C5158U property) {
        AbstractC16544l.m18094g(property, "property");
        this.f16806v0 = property;
    }

    @Override // p225Im.InterfaceC3768p
    /* JADX INFO: renamed from: f */
    public final InterfaceC3776x mo4451f() {
        return this.f16806v0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((C5157T) this.f16806v0.f16807A0.getValue()).call(obj, obj2, obj3);
        return C17296C.f55119a;
    }

    @Override // p298Lm.AbstractC5193o0
    /* JADX INFO: renamed from: r */
    public final AbstractC5203t0 mo5743r() {
        return this.f16806v0;
    }
}
