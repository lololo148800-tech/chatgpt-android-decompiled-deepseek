package p046Bk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxGroupComponent;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19161e2;
import p994rk.InterfaceC19201o2;
import sk.C19665d;

/* JADX INFO: renamed from: Bk.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C1406s extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3748Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3749Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Set f3750o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406s(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, Set set, C1420z c1420z) {
        super(1);
        this.f3748Y = c1383g0;
        this.f3749Z = interfaceC19201o2;
        this.f3750o0 = set;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3748Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3749Z;
        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((InterfaceC19161e2) interfaceC19201o2);
        inputCheckboxGroupComponent.getClass();
        Set newValue = this.f3750o0;
        AbstractC16544l.m18094g(newValue, "newValue");
        UiComponentConfig.InputCheckboxGroup config = inputCheckboxGroupComponent.f40945Y;
        AbstractC16544l.m18094g(config, "config");
        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(config, newValue);
        C19665d c19665d = inputCheckboxGroupComponent.stringSetController;
        AbstractC16544l.m18094g(c19665d, "<set-?>");
        inputCheckboxGroupComponent2.stringSetController = c19665d;
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, inputCheckboxGroupComponent2), C1420z.m2048a(newValue.isEmpty(), c1383g0.f3678o0, interfaceC19201o2.getName(), null), null, null, false, null, false, null, null, null, false, 16378);
        return C17296C.f55119a;
    }
}
