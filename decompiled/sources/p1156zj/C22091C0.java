package p1156zj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: zj.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22091C0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69828Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC22180o0 f69829Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22091C0(AbstractC22180o0 abstractC22180o0, int i10) {
        super(1);
        this.f69828Y = i10;
        this.f69829Z = abstractC22180o0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f69828Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                action.f42521b = C22150e0.m22383i((C22150e0) this.f69829Z, false, null, 127);
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.f42521b = C22162i0.m22385p((C22162i0) this.f69829Z, null, false, 767);
                break;
            case 2:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.f42521b = C22168k0.m22391p((C22168k0) this.f69829Z, null, false, 1535);
                break;
            case 3:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                action4.f42521b = C22171l0.m22396i((C22171l0) this.f69829Z, null);
                break;
            default:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                action5.f42521b = C22150e0.m22383i((C22150e0) this.f69829Z, false, null, 223);
                break;
        }
        return C17296C.f55119a;
    }
}
