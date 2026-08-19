package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4469z0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4421b0 f14611Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4469z0(C4421b0 c4421b0) {
        super(1);
        this.f14611Y = c4421b0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        action.f42521b = C4421b0.m5196g(this.f14611Y, new C4407S0());
        return C17296C.f55119a;
    }
}
