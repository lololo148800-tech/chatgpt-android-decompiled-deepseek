package p247Jj;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.B0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4374B0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4425d0 f14242Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4374B0(C4425d0 c4425d0) {
        super(1);
        this.f14242Y = c4425d0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C4425d0 c4425d0 = this.f14242Y;
        String str = c4425d0.f14383u0;
        NextStep.CancelDialog cancelDialog = c4425d0.f14387y0;
        action.m14964a(new C4435i0(str, c4425d0.f14384v0, c4425d0.f14386x0, cancelDialog != null ? cancelDialog.getTitle() : null, cancelDialog != null ? cancelDialog.getPrompt() : null, cancelDialog != null ? cancelDialog.getBtnResume() : null, cancelDialog != null ? cancelDialog.getBtnSubmit() : null, false));
        return C17296C.f55119a;
    }
}
