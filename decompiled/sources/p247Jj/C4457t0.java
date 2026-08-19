package p247Jj;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4457t0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC4433h0 f14582Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f14583Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4457t0(AbstractC4433h0 abstractC4433h0, boolean z6) {
        super(1);
        this.f14582Y = abstractC4433h0;
        this.f14583Z = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        AbstractC4433h0 abstractC4433h0 = this.f14582Y;
        String strMo5190a = abstractC4433h0.mo5190a();
        String strMo5191e = abstractC4433h0.mo5191e();
        StepStyle styles = abstractC4433h0.getStyles();
        NextStep.CancelDialog cancelDialogMo5194b = abstractC4433h0.mo5194b();
        String title = cancelDialogMo5194b != null ? cancelDialogMo5194b.getTitle() : null;
        NextStep.CancelDialog cancelDialogMo5194b2 = abstractC4433h0.mo5194b();
        String prompt = cancelDialogMo5194b2 != null ? cancelDialogMo5194b2.getPrompt() : null;
        NextStep.CancelDialog cancelDialogMo5194b3 = abstractC4433h0.mo5194b();
        String btnResume = cancelDialogMo5194b3 != null ? cancelDialogMo5194b3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialogMo5194b4 = abstractC4433h0.mo5194b();
        action.m14964a(new C4435i0(strMo5190a, strMo5191e, styles, title, prompt, btnResume, cancelDialogMo5194b4 != null ? cancelDialogMo5194b4.getBtnSubmit() : null, this.f14583Z));
        return C17296C.f55119a;
    }
}
