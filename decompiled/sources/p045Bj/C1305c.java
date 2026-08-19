package p045Bj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.AbstractC22180o0;
import p1156zj.C22171l0;
import p1156zj.C22177n0;
import p125Ej.InterfaceC2564h;
import p523V9.AbstractC8215v5;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1305c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C1305c f3443Z = new C1305c(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1305c f3444o0 = new C1305c(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1305c f3445p0 = new C1305c(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3446Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1305c(int i10, int i11) {
        super(i10);
        this.f3446Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3446Y) {
            case 0:
                return AbstractC8215v5.m8840b(new C1304b((InterfaceC2564h) obj, 0));
            case 1:
                return AbstractC8215v5.m8840b(new C1304b((InterfaceC2564h) obj, 1));
            case 2:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                AbstractC22180o0 abstractC22180o0 = (AbstractC22180o0) action.f42521b;
                if (abstractC22180o0 instanceof C22177n0) {
                    action.f42521b = C22177n0.m22397i((C22177n0) abstractC22180o0, null, null, null, false, false, null, 15871);
                }
                return C17296C.f55119a;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.f42521b = new C22171l0();
                return C17296C.f55119a;
        }
    }
}
