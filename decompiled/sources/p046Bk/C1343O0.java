package p046Bk;

import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9393x3;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bk.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1343O0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ GovernmentIdNfcScanComponent f3543Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1360X0 f3544Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3545o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Date f3546p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Date f3547q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C1381f0 f3548r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C1383g0 f3549s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343O0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, C1360X0 c1360x0, String str, Date date, Date date2, C1381f0 c1381f0, C1383g0 c1383g0) {
        super(1);
        this.f3543Y = governmentIdNfcScanComponent;
        this.f3544Z = c1360x0;
        this.f3545o0 = str;
        this.f3546p0 = date;
        this.f3547q0 = date2;
        this.f3548r0 = c1381f0;
        this.f3549s0 = c1383g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String string;
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes = this.f3543Y.f40910Y.getAttributes();
        if (attributes == null || (string = attributes.getRequiredText()) == null) {
            string = this.f3544Z.f3599a.getString(R.string.pi2_retry);
            AbstractC16544l.m18093f(string, "getString(...)");
        }
        if (AbstractC21322p.m21681O(this.f3545o0)) {
            linkedHashMap.put(UiComponentConfig.GovernmentIdNfcScan.documentNumberName, string);
        }
        if (this.f3546p0 == null) {
            linkedHashMap.put(UiComponentConfig.GovernmentIdNfcScan.dateOfBirthName, string);
        }
        if (this.f3547q0 == null) {
            linkedHashMap.put(UiComponentConfig.GovernmentIdNfcScan.expirationDateName, string);
        }
        action.f42521b = C1383g0.m2047a(this.f3549s0, null, AbstractC9393x3.m9974d(new UiComponentError.UiGovernmentIdNfcScanComponentError(this.f3548r0.f3671Y.getName(), null, linkedHashMap, 2, null)), null, null, false, null, false, null, null, null, false, 16347);
        return C17296C.f55119a;
    }
}
