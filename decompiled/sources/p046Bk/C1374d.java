package p046Bk;

import com.withpersona.sdk2.inquiry.p689ui.network.LocationData;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p100Dk.AbstractC2090q;
import p100Dk.C2089p;
import p729ej.C13430u;
import p994rk.AbstractC19121T;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19150c;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1374d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3644Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3645Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC2090q f3646o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374d(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, AbstractC2090q abstractC2090q) {
        super(1);
        this.f3644Y = c1383g0;
        this.f3645Z = interfaceC19201o2;
        this.f3646o0 = abstractC2090q;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3644Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3645Z;
        Boolean bool = Boolean.FALSE;
        InputAddressComponent inputAddressComponent = (InputAddressComponent) ((InterfaceC19150c) interfaceC19201o2);
        inputAddressComponent.getClass();
        InputAddressComponent inputAddressComponentM14579a = InputAddressComponent.m14579a(inputAddressComponent, null, null, null, null, null, null, null, null, null, bool, 1023);
        AbstractC19121T.m20304a(inputAddressComponentM14579a, inputAddressComponent);
        C2089p c2089p = (C2089p) this.f3646o0;
        String str = c2089p.f6432a.f41017b;
        InputAddressComponent inputAddressComponentM14579a2 = InputAddressComponent.m14579a(inputAddressComponentM14579a, str == null ? "" : str, null, null, null, null, null, null, null, null, null, 2045);
        AbstractC19121T.m20304a(inputAddressComponentM14579a2, inputAddressComponentM14579a);
        LocationData locationData = c2089p.f6432a;
        String str2 = locationData.f41018c;
        InputAddressComponent inputAddressComponentM14579a3 = InputAddressComponent.m14579a(inputAddressComponentM14579a2, null, str2 == null ? "" : str2, null, null, null, null, null, null, null, null, 2043);
        AbstractC19121T.m20304a(inputAddressComponentM14579a3, inputAddressComponentM14579a2);
        String str3 = locationData.f41019d;
        InputAddressComponent inputAddressComponentM14579a4 = InputAddressComponent.m14579a(inputAddressComponentM14579a3, null, null, str3 == null ? "" : str3, null, null, null, null, null, null, null, 2039);
        AbstractC19121T.m20304a(inputAddressComponentM14579a4, inputAddressComponentM14579a3);
        String str4 = locationData.f41020e;
        InputAddressComponent inputAddressComponentM14579a5 = InputAddressComponent.m14579a(inputAddressComponentM14579a4, null, null, null, str4 == null ? "" : str4, null, null, null, null, null, null, 2031);
        AbstractC19121T.m20304a(inputAddressComponentM14579a5, inputAddressComponentM14579a4);
        String str5 = locationData.f41021f;
        InputAddressComponent inputAddressComponentM14579a6 = InputAddressComponent.m14579a(inputAddressComponentM14579a5, null, null, null, null, str5 == null ? "" : str5, null, null, null, null, null, 2015);
        AbstractC19121T.m20304a(inputAddressComponentM14579a6, inputAddressComponentM14579a5);
        InputAddressComponent inputAddressComponentM14579a7 = InputAddressComponent.m14579a(inputAddressComponentM14579a6, null, null, null, null, null, null, null, null, null, null, 1791);
        AbstractC19121T.m20304a(inputAddressComponentM14579a7, inputAddressComponentM14579a6);
        InputAddressComponent inputAddressComponentM14579a8 = InputAddressComponent.m14579a(inputAddressComponentM14579a7, null, null, null, null, null, null, null, null, bool, null, 1535);
        AbstractC19121T.m20304a(inputAddressComponentM14579a8, inputAddressComponentM14579a7);
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, inputAddressComponentM14579a8), null, null, null, false, null, false, null, null, null, false, 16382);
        return C17296C.f55119a;
    }
}
