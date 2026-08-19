package p046Bk;

import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19154d;
import p994rk.InterfaceC19201o2;
import sk.C19662a;

/* JADX INFO: renamed from: Bk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1384h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3690Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3691Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Bitmap f3692o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1384h(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, Bitmap bitmap) {
        super(1);
        this.f3690Y = c1383g0;
        this.f3691Z = interfaceC19201o2;
        this.f3692o0 = bitmap;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3690Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3691Z;
        ESignatureComponent eSignatureComponent = (ESignatureComponent) ((InterfaceC19154d) interfaceC19201o2);
        UiComponentConfig.ESignature config = eSignatureComponent.f40906Y;
        AbstractC16544l.m18094g(config, "config");
        ESignatureComponent eSignatureComponent2 = new ESignatureComponent(config, this.f3692o0);
        C19662a c19662a = eSignatureComponent.bitmapController;
        AbstractC16544l.m18094g(c19662a, "<set-?>");
        eSignatureComponent2.bitmapController = c19662a;
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, eSignatureComponent2), null, null, null, false, null, false, null, null, null, false, 16382);
        return C17296C.f55119a;
    }
}
