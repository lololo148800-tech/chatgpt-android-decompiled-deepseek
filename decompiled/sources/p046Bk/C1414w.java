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
import p994rk.InterfaceC19150c;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C1414w extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3783Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3784Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3785o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414w(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, String str, C1420z c1420z) {
        super(1);
        this.f3783Y = c1383g0;
        this.f3784Z = interfaceC19201o2;
        this.f3785o0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3783Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3784Z;
        InputAddressComponent inputAddressComponent = (InputAddressComponent) ((InterfaceC19150c) interfaceC19201o2);
        inputAddressComponent.getClass();
        String str = this.f3785o0;
        InputAddressComponent inputAddressComponentM14579a = InputAddressComponent.m14579a(inputAddressComponent, null, null, str == null ? "" : str, null, null, null, null, null, null, null, 2039);
        AbstractC19121T.m20304a(inputAddressComponentM14579a, inputAddressComponent);
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, inputAddressComponentM14579a), C1420z.m2048a(str.length() == 0, c1383g0.f3678o0, interfaceC19201o2.getName(), "city"), null, null, false, null, false, null, null, null, false, 16378);
        return C17296C.f55119a;
    }
}
