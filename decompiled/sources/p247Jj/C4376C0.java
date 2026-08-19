package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4376C0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4425d0 f14245Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4376C0(C4425d0 c4425d0) {
        super(1);
        this.f14245Y = c4425d0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        action.f42521b = C4425d0.m5197g(this.f14245Y, new C4407S0());
        return C17296C.f55119a;
    }
}
