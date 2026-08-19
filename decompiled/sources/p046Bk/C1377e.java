package p046Bk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1139z0.C21585H;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19132W1;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1377e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3664Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3665Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f3666o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377e(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, boolean z6) {
        super(1);
        this.f3664Y = c1383g0;
        this.f3665Z = interfaceC19201o2;
        this.f3666o0 = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3664Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3665Z;
        InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) ((InterfaceC19132W1) interfaceC19201o2);
        UiComponentConfig.InputCheckbox config = inputCheckboxComponent.f40941Y;
        AbstractC16544l.m18094g(config, "config");
        InputCheckboxComponent inputCheckboxComponent2 = new InputCheckboxComponent(config, this.f3666o0);
        C21585H c21585h = inputCheckboxComponent.twoStateViewController;
        AbstractC16544l.m18094g(c21585h, "<set-?>");
        inputCheckboxComponent2.twoStateViewController = c21585h;
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, inputCheckboxComponent2), null, null, null, false, null, false, null, null, null, false, 16382);
        return C17296C.f55119a;
    }
}
