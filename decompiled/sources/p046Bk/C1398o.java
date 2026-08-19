package p046Bk;

import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19201o2;
import sk.C19664c;

/* JADX INFO: renamed from: Bk.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C1398o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3732Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3733Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19664c f3734o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398o(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, C19664c c19664c) {
        super(1);
        this.f3732Y = c1383g0;
        this.f3733Z = interfaceC19201o2;
        this.f3734o0 = c19664c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3732Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3733Z;
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) interfaceC19201o2;
        governmentIdNfcScanComponent.getClass();
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentM14578a = GovernmentIdNfcScanComponent.m14578a(governmentIdNfcScanComponent, null, null, null, null, this.f3734o0, 31);
        governmentIdNfcScanComponentM14578a.cardAccessNumberController = governmentIdNfcScanComponent.cardAccessNumberController;
        governmentIdNfcScanComponentM14578a.documentNumberController = governmentIdNfcScanComponent.documentNumberController;
        governmentIdNfcScanComponentM14578a.dateOfBirthController = governmentIdNfcScanComponent.dateOfBirthController;
        governmentIdNfcScanComponentM14578a.expirationDateController = governmentIdNfcScanComponent.expirationDateController;
        governmentIdNfcScanComponentM14578a.nfcDataController = governmentIdNfcScanComponent.nfcDataController;
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, governmentIdNfcScanComponentM14578a), null, null, null, false, null, false, null, null, null, false, 16382);
        return C17296C.f55119a;
    }
}
