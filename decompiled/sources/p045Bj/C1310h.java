package p045Bj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22177n0;
import p1156zj.EnumC22169k1;
import p523V9.AbstractC8215v5;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1310h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3460Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22177n0 f3461Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1310h(C22177n0 c22177n0, int i10) {
        super(1);
        this.f3460Y = i10;
        this.f3461Z = c22177n0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3460Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                C22177n0 c22177n0 = this.f3461Z;
                if (c22177n0.f70235q0 == EnumC22169k1.f70148o0) {
                    action.f42521b = C22177n0.m22397i(c22177n0, EnumC22169k1.f70147Z, null, null, false, false, null, 16375);
                }
                return C17296C.f55119a;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                C22177n0 c22177n1 = this.f3461Z;
                if (c22177n1.f70235q0 == EnumC22169k1.f70148o0) {
                    action2.f42521b = C22177n0.m22397i(c22177n1, EnumC22169k1.f70147Z, null, null, false, false, null, 16375);
                }
                return C17296C.f55119a;
            case 2:
                C17296C it = (C17296C) obj;
                AbstractC16544l.m18094g(it, "it");
                return AbstractC8215v5.m8840b(new C1310h(this.f3461Z, 1));
            default:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.f42521b = C22177n0.m22397i(this.f3461Z, EnumC22169k1.f70146Y, null, null, false, false, null, 16375);
                return C17296C.f55119a;
        }
    }
}
