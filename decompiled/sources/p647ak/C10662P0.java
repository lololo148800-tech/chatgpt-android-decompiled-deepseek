package p647ak;

import af.C10564U;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p729ej.C13430u;

/* JADX INFO: renamed from: ak.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10662P0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31652Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10696e1 f31653Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10662P0(C10696e1 c10696e1, int i10) {
        super(1);
        this.f31652Y = i10;
        this.f31653Z = c10696e1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31652Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                this.f31653Z.getClass();
                action.m14964a(new C10736w0(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
                return C17296C.f55119a;
            case 1:
                AbstractC10641F output = (AbstractC10641F) obj;
                AbstractC16544l.m18094g(output, "output");
                return AbstractC8215v5.m8839a(this.f31653Z, new C10564U(output, 4));
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                this.f31653Z.getClass();
                action2.f42521b = new C10683a0(false, false, AbstractC10708i1.m11027a(action2, false));
                return C17296C.f55119a;
        }
    }
}
