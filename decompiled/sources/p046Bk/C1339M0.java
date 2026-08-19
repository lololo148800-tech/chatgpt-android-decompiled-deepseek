package p046Bk;

import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19121T;
import p994rk.AbstractC19213r2;

/* JADX INFO: renamed from: Bk.M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1339M0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC1391k0 f3537Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InputAddressComponent f3538Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3539o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339M0(AbstractC1391k0 abstractC1391k0, InputAddressComponent inputAddressComponent, String str) {
        super(1);
        this.f3537Y = abstractC1391k0;
        this.f3538Z = inputAddressComponent;
        this.f3539o0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = (C1383g0) this.f3537Y;
        List list = c1383g0.f3676Y;
        InputAddressComponent inputAddressComponent = this.f3538Z;
        inputAddressComponent.getClass();
        InputAddressComponent inputAddressComponentM14579a = InputAddressComponent.m14579a(inputAddressComponent, null, null, null, null, null, null, null, this.f3539o0, null, null, 1791);
        AbstractC19121T.m20304a(inputAddressComponentM14579a, inputAddressComponent);
        InputAddressComponent inputAddressComponentM14579a2 = InputAddressComponent.m14579a(inputAddressComponentM14579a, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535);
        AbstractC19121T.m20304a(inputAddressComponentM14579a2, inputAddressComponentM14579a);
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, inputAddressComponent, inputAddressComponentM14579a2), null, null, null, false, null, false, null, null, null, false, 16382);
        return C17296C.f55119a;
    }
}
