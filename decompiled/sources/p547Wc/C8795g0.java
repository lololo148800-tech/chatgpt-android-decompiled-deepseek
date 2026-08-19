package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p774h1.C14328F;
import p860l0.C16780t0;

/* JADX INFO: renamed from: Wc.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8795g0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26908Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC21098s f26909Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8795g0(InterfaceC21098s interfaceC21098s, int i10) {
        super(1);
        this.f26908Y = i10;
        this.f26909Z = interfaceC21098s;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f26908Y) {
            case 0:
                C16780t0 DraggableAnchors = (C16780t0) obj;
                AbstractC16544l.m18094g(DraggableAnchors, "$this$DraggableAnchors");
                DraggableAnchors.m18545a(0, 0.0f);
                DraggableAnchors.m18545a(1, -AbstractC21075b0.m21565f(this.f26909Z).f43589d);
                break;
            default:
                float[] fArr = ((C14328F) obj).f44968a;
                InterfaceC21098s interfaceC21098s = this.f26909Z;
                if (interfaceC21098s.mo21522h()) {
                    AbstractC21075b0.m21568i(interfaceC21098s).mo21525n(interfaceC21098s, fArr);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
