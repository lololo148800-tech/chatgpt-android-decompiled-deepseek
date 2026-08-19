package p045Bj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22177n0;
import p140Fa.C2685e;
import p173Gj.EnumC3098e;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1303a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3439Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2685e f3440Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1303a(int i10, C2685e c2685e) {
        super(1);
        this.f3439Y = i10;
        this.f3440Z = c2685e;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3439Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22177n0 c22177n0 = obj2 instanceof C22177n0 ? (C22177n0) obj2 : null;
                if (c22177n0 != null) {
                    this.f3440Z.getClass();
                    action.f42521b = C22177n0.m22397i(c22177n0, null, EnumC3098e.f9323o0, null, false, false, null, 16255);
                }
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj3 = action2.f42521b;
                C22177n0 c22177n1 = obj3 instanceof C22177n0 ? (C22177n0) obj3 : null;
                if (c22177n1 != null) {
                    this.f3440Z.getClass();
                    action2.f42521b = C22177n0.m22397i(c22177n1, null, EnumC3098e.f9323o0, null, false, false, null, 16255);
                }
                break;
            default:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                Object obj4 = action3.f42521b;
                C22177n0 c22177n2 = obj4 instanceof C22177n0 ? (C22177n0) obj4 : null;
                if (c22177n2 != null) {
                    this.f3440Z.getClass();
                    action3.f42521b = C22177n0.m22397i(c22177n2, null, EnumC3098e.f9323o0, null, false, false, null, 16255);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
