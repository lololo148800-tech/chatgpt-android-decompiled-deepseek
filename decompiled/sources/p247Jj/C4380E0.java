package p247Jj;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4380E0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4431g0 f14248Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4380E0(C4431g0 c4431g0) {
        super(1);
        this.f14248Y = c4431g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C4431g0 c4431g0 = this.f14248Y;
        String str = c4431g0.f14421u0;
        NextStep.CancelDialog cancelDialog = c4431g0.f14425y0;
        action.m14964a(new C4435i0(str, c4431g0.f14422v0, c4431g0.f14424x0, cancelDialog != null ? cancelDialog.getTitle() : null, cancelDialog != null ? cancelDialog.getPrompt() : null, cancelDialog != null ? cancelDialog.getBtnResume() : null, cancelDialog != null ? cancelDialog.getBtnSubmit() : null, false));
        return C17296C.f55119a;
    }
}
