package p1156zj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p149Fj.C2870d;
import p149Fj.C2871e;
import p149Fj.InterfaceC2872f;
import p729ej.C13430u;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22148d1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f70019Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC22165j0 f70020Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2872f f70021o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22148d1(AbstractC22165j0 abstractC22165j0, InterfaceC2872f interfaceC2872f, int i10) {
        super(1);
        this.f70019Y = i10;
        this.f70020Z = abstractC22165j0;
        this.f70021o0 = interfaceC2872f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f70019Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                AbstractC22165j0 abstractC22165j0 = obj2 instanceof AbstractC22165j0 ? (AbstractC22165j0) obj2 : null;
                if (abstractC22165j0 != null) {
                    action.f42521b = new C22144c0(abstractC22165j0.mo22388l(), abstractC22165j0.mo22381h(), abstractC22165j0.mo22380g(), abstractC22165j0.mo22379f(), AbstractC22120R0.m22355b(action, false), this.f70020Z.mo22389n().mo22349j0(), new C18428A(), ((C2870d) this.f70021o0).f8638a, EnumC22140b.f69987Y);
                }
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj3 = action2.f42521b;
                AbstractC22165j0 abstractC22165j1 = obj3 instanceof AbstractC22165j0 ? (AbstractC22165j0) obj3 : null;
                if (abstractC22165j1 != null) {
                    action2.f42521b = new C22144c0(abstractC22165j1.mo22388l(), abstractC22165j1.mo22381h(), abstractC22165j1.mo22380g(), abstractC22165j1.mo22379f(), AbstractC22120R0.m22355b(action2, false), this.f70020Z.mo22389n().mo22349j0(), new C18428A(), ((C2871e) this.f70021o0).f8639a, EnumC22140b.f69988Z);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
