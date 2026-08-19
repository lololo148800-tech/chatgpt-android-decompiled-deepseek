package p046Bk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputDateComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p791hj.C14522e;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19229w;

/* JADX INFO: renamed from: Bk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1386i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3694Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3695Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3696o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386i(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, String str, C1420z c1420z) {
        super(1);
        this.f3694Y = c1383g0;
        this.f3695Z = interfaceC19201o2;
        this.f3696o0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3694Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3695Z;
        InputDateComponent inputDateComponent = (InputDateComponent) ((InterfaceC19229w) interfaceC19201o2);
        UiComponentConfig.InputDate config = inputDateComponent.f40958Y;
        AbstractC16544l.m18094g(config, "config");
        String str = this.f3696o0;
        InputDateComponent inputDateComponent2 = new InputDateComponent(config, str);
        C14522e c14522e = inputDateComponent.dateController;
        AbstractC16544l.m18094g(c14522e, "<set-?>");
        inputDateComponent2.dateController = c14522e;
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, inputDateComponent2), C1420z.m2048a(str == null || str.length() == 0, c1383g0.f3678o0, interfaceC19201o2.getName(), null), null, null, false, null, false, null, null, null, false, 16378);
        return C17296C.f55119a;
    }
}
