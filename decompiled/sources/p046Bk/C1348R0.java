package p046Bk;

import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9393x3;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bk.R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1348R0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1381f0 f3565Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ GovernmentIdNfcScanComponent f3566Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1383g0 f3567o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1348R0(C1381f0 c1381f0, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, C1383g0 c1383g0) {
        super(1);
        this.f3565Y = c1381f0;
        this.f3566Z = governmentIdNfcScanComponent;
        this.f3567o0 = c1383g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String scanDocumentError;
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        String name = this.f3565Y.f3671Y.getName();
        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes = this.f3566Z.f40910Y.getAttributes();
        if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
            scanDocumentError = "";
        }
        action.f42521b = C1383g0.m2047a(this.f3567o0, null, AbstractC9393x3.m9974d(new UiComponentError.UiInputComponentError(name, "", scanDocumentError)), null, null, false, null, false, null, null, null, false, 16347);
        return C17296C.f55119a;
    }
}
