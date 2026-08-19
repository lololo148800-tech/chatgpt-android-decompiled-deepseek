package p647ak;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: ak.Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10679Y0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31715Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10730t0 f31716Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10679Y0(C10730t0 c10730t0, int i10) {
        super(1);
        this.f31715Y = i10;
        this.f31716Z = c10730t0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31715Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                action.f42521b = new C10701g0(false, false, AbstractC10708i1.m11027a(action, false), this.f31716Z.f31894l);
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.f42521b = new C10701g0(false, false, AbstractC10708i1.m11027a(action2, true), this.f31716Z.f31894l);
                break;
        }
        return C17296C.f55119a;
    }
}
