package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p103Dn.C2153Q0;
import p508Uj.AbstractC7701i;
import p508Uj.C7700h;
import p729ej.C13430u;
import p813ij.C15026j;
import sk.C19664c;

/* JADX INFO: renamed from: Bk.S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1350S0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1381f0 f3570Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC7701i f3571Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1383g0 f3572o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350S0(C1381f0 c1381f0, AbstractC7701i abstractC7701i, C1383g0 c1383g0) {
        super(1);
        this.f3570Y = c1381f0;
        this.f3571Z = abstractC7701i;
        this.f3572o0 = c1383g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C15026j c15026j = this.f3570Y.f3671Y.nfcDataController;
        C7700h c7700h = (C7700h) this.f3571Z;
        C19664c c19664c = new C19664c(c7700h.f24249Y, c7700h.f24250Z, c7700h.f24251o0);
        C2153Q0 c2153q0 = (C2153Q0) c15026j.f46724Y;
        c2153q0.getClass();
        c2153q0.m3251l(null, c19664c);
        action.f42521b = C1383g0.m2047a(this.f3572o0, null, null, null, null, true, null, false, null, null, null, false, 16287);
        return C17296C.f55119a;
    }
}
