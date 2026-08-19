package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.C19221t2;

/* JADX INFO: renamed from: Bk.L0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1337L0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC1391k0 f3531Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19221t2 f3532Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337L0(AbstractC1391k0 abstractC1391k0, C19221t2 c19221t2) {
        super(1);
        this.f3531Y = abstractC1391k0;
        this.f3532Z = c19221t2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        action.f42521b = C1383g0.m2047a((C1383g0) this.f3531Y, null, null, null, null, false, new C1387i0(this.f3532Z), false, null, null, null, false, 16255);
        return C17296C.f55119a;
    }
}
