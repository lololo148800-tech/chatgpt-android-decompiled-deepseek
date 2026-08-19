package p1156zj;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p173Gj.EnumC3098e;
import p729ej.C13430u;

/* JADX INFO: renamed from: zj.A0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22087A0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69814Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22107K0 f69815Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22087A0(C22107K0 c22107k0, int i10) {
        super(1);
        this.f69814Y = i10;
        this.f69815Z = c22107k0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f69814Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                this.f69815Z.getClass();
                action.m14964a(new C22204w0(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj2 = action2.f42521b;
                C22177n0 c22177n0 = obj2 instanceof C22177n0 ? (C22177n0) obj2 : null;
                if (c22177n0 != null) {
                    this.f69815Z.f69887m.getClass();
                    action2.f42521b = C22177n0.m22397i(c22177n0, null, EnumC3098e.f9323o0, null, false, false, null, 16255);
                }
                break;
            default:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                Object obj3 = action3.f42521b;
                C22177n0 c22177n1 = obj3 instanceof C22177n0 ? (C22177n0) obj3 : null;
                if (c22177n1 != null) {
                    this.f69815Z.f69887m.getClass();
                    action3.f42521b = C22177n0.m22397i(c22177n1, null, EnumC3098e.f9323o0, null, false, false, null, 16255);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
