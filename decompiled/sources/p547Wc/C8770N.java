package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p860l0.C16780t0;

/* JADX INFO: renamed from: Wc.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C8770N extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ float f26744Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f26745Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8770N(float f10, float f11) {
        super(1);
        this.f26744Y = f10;
        this.f26745Z = f11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C16780t0 DraggableAnchors = (C16780t0) obj;
        AbstractC16544l.m18094g(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.m18545a(EnumC8776U.f26769Y, 0.0f);
        DraggableAnchors.m18545a(EnumC8776U.f26770Z, this.f26744Y);
        DraggableAnchors.m18545a(EnumC8776U.f26771o0, this.f26745Z);
        return C17296C.f55119a;
    }
}
