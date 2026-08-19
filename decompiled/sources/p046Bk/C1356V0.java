package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p100Dk.AbstractC2099z;
import p100Dk.C2096w;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bk.V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1356V0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3588Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC2099z f3589Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356V0(C1383g0 c1383g0, AbstractC2099z abstractC2099z) {
        super(1);
        this.f3588Y = c1383g0;
        this.f3589Z = abstractC2099z;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3588Y;
        action.f42521b = new C1383g0(c1383g0.f3676Y, c1383g0.f3677Z, ((C2096w) this.f3589Z).f6444a, c1383g0.f3679p0, null, 16304);
        return C17296C.f55119a;
    }
}
