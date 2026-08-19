package p964qe;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p492U1.C7543h;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9101A4;
import p860l0.C16780t0;

/* JADX INFO: renamed from: qe.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18694g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59512Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f59513Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18694g(int i10, float f10) {
        super(1);
        this.f59512Y = i10;
        this.f59513Z = f10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59512Y) {
            case 0:
                InterfaceC7537b offset = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(offset, "$this$offset");
                return new C7543h(AbstractC9101A4.m9631a(AbstractC2119a.m3195i(this.f59513Z), 0));
            default:
                C16780t0 DraggableAnchors = (C16780t0) obj;
                AbstractC16544l.m18094g(DraggableAnchors, "$this$DraggableAnchors");
                DraggableAnchors.m18545a(0, 0.0f);
                DraggableAnchors.m18545a(1, -this.f59513Z);
                return C17296C.f55119a;
        }
    }
}
