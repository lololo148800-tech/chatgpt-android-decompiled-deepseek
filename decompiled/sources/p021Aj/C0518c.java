package p021Aj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.AbstractC22120R0;
import p1156zj.C22144c0;
import p1156zj.C22147d0;
import p1156zj.C22201v0;
import p729ej.C13430u;
import p949pj.C18428A;

/* JADX INFO: renamed from: Aj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0518c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C0518c f1660Z = new C0518c(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0518c f1661o0 = new C0518c(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0518c f1662p0 = new C0518c(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1663Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0518c(int i10, int i11) {
        super(i10);
        this.f1663Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1663Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22144c0 c22144c0 = obj2 instanceof C22144c0 ? (C22144c0) obj2 : null;
                if (c22144c0 != null) {
                    action.f42521b = new C22147d0(c22144c0.f69995Z, c22144c0.f69996o0, c22144c0.f69997p0, c22144c0.f69998q0, AbstractC22120R0.m22355b(action, true), c22144c0.f70000s0, new C18428A(), c22144c0.f70002u0, null, null);
                }
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.m14964a(C22201v0.f70382a);
                break;
            default:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.m14964a(C22201v0.f70382a);
                break;
        }
        return C17296C.f55119a;
    }
}
