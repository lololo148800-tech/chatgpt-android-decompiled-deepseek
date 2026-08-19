package p046Bk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C1392l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3704Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3705Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3706o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392l(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, String str, C1420z c1420z) {
        super(1);
        this.f3704Y = c1383g0;
        this.f3705Z = interfaceC19201o2;
        this.f3706o0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3704Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3705Z;
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) interfaceC19201o2;
        governmentIdNfcScanComponent.getClass();
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentM14578a = GovernmentIdNfcScanComponent.m14578a(governmentIdNfcScanComponent, null, this.f3706o0, null, null, null, 59);
        governmentIdNfcScanComponentM14578a.cardAccessNumberController = governmentIdNfcScanComponent.cardAccessNumberController;
        governmentIdNfcScanComponentM14578a.documentNumberController = governmentIdNfcScanComponent.documentNumberController;
        governmentIdNfcScanComponentM14578a.dateOfBirthController = governmentIdNfcScanComponent.dateOfBirthController;
        governmentIdNfcScanComponentM14578a.expirationDateController = governmentIdNfcScanComponent.expirationDateController;
        governmentIdNfcScanComponentM14578a.nfcDataController = governmentIdNfcScanComponent.nfcDataController;
        ArrayList arrayListM20323f = AbstractC19213r2.m20323f(list, interfaceC19201o2, governmentIdNfcScanComponentM14578a);
        String str = this.f3706o0;
        action.f42521b = C1383g0.m2047a(c1383g0, arrayListM20323f, C1420z.m2048a(str == null || str.length() == 0, c1383g0.f3678o0, interfaceC19201o2.getName(), UiComponentConfig.GovernmentIdNfcScan.dateOfBirthName), null, null, false, null, false, null, null, null, false, 16378);
        return C17296C.f55119a;
    }
}
