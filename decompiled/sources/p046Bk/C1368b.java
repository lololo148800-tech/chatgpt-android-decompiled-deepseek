package p046Bk;

import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p100Dk.AbstractC2085l;
import p100Dk.C2083j;
import p100Dk.C2084k;
import p729ej.C13430u;
import p994rk.AbstractC19121T;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19150c;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1368b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC2085l f3628Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1383g0 f3629Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19201o2 f3630o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368b(AbstractC2085l abstractC2085l, C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2) {
        super(1);
        this.f3628Y = abstractC2085l;
        this.f3629Z = c1383g0;
        this.f3630o0 = interfaceC19201o2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        AbstractC2085l abstractC2085l = this.f3628Y;
        if (abstractC2085l instanceof C2084k) {
            C1383g0 c1383g0 = this.f3629Z;
            List list = c1383g0.f3676Y;
            InterfaceC19201o2 interfaceC19201o2 = this.f3630o0;
            List list2 = ((C2084k) abstractC2085l).f6423a;
            InputAddressComponent inputAddressComponent = (InputAddressComponent) ((InterfaceC19150c) interfaceC19201o2);
            inputAddressComponent.getClass();
            InputAddressComponent inputAddressComponentM14579a = InputAddressComponent.m14579a(inputAddressComponent, null, null, null, null, null, null, list2, null, null, null, 1919);
            AbstractC19121T.m20304a(inputAddressComponentM14579a, inputAddressComponent);
            InputAddressComponent inputAddressComponentM14579a2 = InputAddressComponent.m14579a(inputAddressComponentM14579a, null, null, null, null, null, null, null, null, null, null, 1983);
            AbstractC19121T.m20304a(inputAddressComponentM14579a2, inputAddressComponentM14579a);
            action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, inputAddressComponentM14579a2), null, null, null, false, null, false, null, null, null, false, 16382);
        } else {
            boolean z6 = abstractC2085l instanceof C2083j;
        }
        return C17296C.f55119a;
    }
}
