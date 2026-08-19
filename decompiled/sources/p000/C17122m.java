package p000;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p124Ei.AbstractC2511g1;
import p349O0.InterfaceC5982V0;
import p492U1.C7540e;
import p492U1.C7543h;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9101A4;
import p774h1.C14336N;
import p774h1.C14343V;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes.dex */
public final class C17122m extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54730Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5982V0 f54731Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17122m(InterfaceC5982V0 interfaceC5982V0, int i10) {
        super(1);
        this.f54730Y = i10;
        this.f54731Z = interfaceC5982V0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f54730Y) {
            case 0:
                C14336N graphicsLayer = (C14336N) obj;
                AbstractC16544l.m18094g(graphicsLayer, "$this$graphicsLayer");
                InterfaceC5982V0 interfaceC5982V0 = this.f54731Z;
                graphicsLayer.m15655g(((Number) interfaceC5982V0.getValue()).floatValue());
                graphicsLayer.m15656h(((Number) interfaceC5982V0.getValue()).floatValue());
                return C17296C.f55119a;
            case 1:
                C14336N graphicsLayer2 = (C14336N) obj;
                AbstractC16544l.m18094g(graphicsLayer2, "$this$graphicsLayer");
                InterfaceC5982V0 interfaceC5982V1 = this.f54731Z;
                graphicsLayer2.m15649a(AbstractC2511g1.m3592d(interfaceC5982V1) <= 0.66999996f ? 0.0f : (AbstractC2511g1.m3592d(interfaceC5982V1) - 0.66999996f) / 0.33f);
                graphicsLayer2.m15660n(C14343V.f45023b);
                float fMax = Math.max(0.66999996f, AbstractC2511g1.m3592d(interfaceC5982V1));
                graphicsLayer2.m15655g(fMax);
                graphicsLayer2.m15656h(fMax);
                return C17296C.f55119a;
            case 2:
                C21660F drawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
                drawWithContent.m22080a();
                AbstractC14376f.m15850p(drawWithContent, ((C14365u) this.f54731Z.getValue()).f45062a, 0L, 0L, 0.0f, 126);
                return C17296C.f55119a;
            default:
                InterfaceC7537b offset = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(offset, "$this$offset");
                return new C7543h(AbstractC9101A4.m9631a(0, offset.mo7866k0(((C7540e) this.f54731Z.getValue()).f23894Y)));
        }
    }
}
