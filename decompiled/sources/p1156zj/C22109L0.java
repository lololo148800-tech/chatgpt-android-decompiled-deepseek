package p1156zj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: zj.L0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22109L0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C22109L0 f69889Z = new C22109L0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C22109L0 f69890o0 = new C22109L0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C22109L0 f69891p0 = new C22109L0(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C22109L0 f69892q0 = new C22109L0(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C22109L0 f69893r0 = new C22109L0(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C22109L0 f69894s0 = new C22109L0(1, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69895Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22109L0(int i10, int i11) {
        super(i10);
        this.f69895Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f69895Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                action.m14964a(C22201v0.f70382a);
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                ((AbstractC22180o0) action2.f42521b).mo22384b();
                action2.f42521b = new C22171l0();
                break;
            case 2:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                ((AbstractC22180o0) action3.f42521b).mo22384b();
                action3.f42521b = new C22171l0();
                break;
            case 3:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                AbstractC22180o0 abstractC22180o0 = (AbstractC22180o0) action4.f42521b;
                if (abstractC22180o0 instanceof C22177n0) {
                    C22177n0 c22177n0 = (C22177n0) abstractC22180o0;
                    c22177n0.getClass();
                    action4.f42521b = C22177n0.m22397i(c22177n0, null, null, null, false, false, null, 14335);
                }
                break;
            case 4:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                AbstractC22180o0 abstractC22180o1 = (AbstractC22180o0) action5.f42521b;
                if (abstractC22180o1 instanceof C22177n0) {
                    C22177n0 c22177n1 = (C22177n0) abstractC22180o1;
                    c22177n1.getClass();
                    action5.f42521b = C22177n0.m22397i(c22177n1, null, null, null, false, false, null, 15359);
                }
                break;
            case 5:
                C13430u action6 = (C13430u) obj;
                AbstractC16544l.m18094g(action6, "$this$action");
                Object obj2 = action6.f42521b;
                AbstractC22165j0 abstractC22165j0 = obj2 instanceof AbstractC22165j0 ? (AbstractC22165j0) obj2 : null;
                if (abstractC22165j0 != null) {
                    action6.f42521b = abstractC22165j0.mo22390o(true);
                }
                break;
            default:
                C13430u action7 = (C13430u) obj;
                AbstractC16544l.m18094g(action7, "$this$action");
                AbstractC22180o0 abstractC22180o0Mo22377c = ((AbstractC22180o0) action7.f42521b).mo22377c();
                if (abstractC22180o0Mo22377c != null) {
                    abstractC22180o0Mo22377c.f70246Y = true;
                    action7.f42521b = abstractC22180o0Mo22377c;
                } else if (((C22195t0) action7.f42520a).f70341g) {
                    action7.m14964a(C22198u0.f70360a);
                } else {
                    action7.m14964a(C22201v0.f70382a);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
