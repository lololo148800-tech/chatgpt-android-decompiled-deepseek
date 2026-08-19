package p046Bk;

import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p994rk.C19218t;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.A0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1315A0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3476Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f3477Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1360X0 f3478o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC1391k0 f3479p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1315A0(int i10, AbstractC1391k0 abstractC1391k0, C1360X0 c1360x0, C13421l c13421l) {
        super(2);
        this.f3476Y = i10;
        this.f3477Z = c13421l;
        this.f3478o0 = c1360x0;
        this.f3479p0 = abstractC1391k0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3476Y) {
            case 0:
                C19218t createReusablePersonaComponent = (C19218t) obj;
                InterfaceC19201o2 buttonClicked = (InterfaceC19201o2) obj2;
                AbstractC16544l.m18094g(createReusablePersonaComponent, "createReusablePersonaComponent");
                AbstractC16544l.m18094g(buttonClicked, "buttonClicked");
                this.f3477Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f3478o0, new C1421z0(this.f3479p0, createReusablePersonaComponent, buttonClicked)));
                break;
            default:
                InputAddressComponent component = (InputAddressComponent) obj;
                String addressId = (String) obj2;
                AbstractC16544l.m18094g(component, "component");
                AbstractC16544l.m18094g(addressId, "addressId");
                this.f3477Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f3478o0, new C1339M0(this.f3479p0, component, addressId)));
                break;
        }
        return C17296C.f55119a;
    }
}
