package p1083we;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: we.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C20936v extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C20936v f66699Z = new C20936v(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C20936v f66700o0 = new C20936v(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f66701Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20936v(int i10, int i11) {
        super(i10);
        this.f66701Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f66701Y) {
            case 0:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.instructions.api.CustomInstructionsUpdateErrorDetail.Field", EnumC20938x.values(), new String[]{"about_user_message", "about_model_message"}, new Annotation[][]{null, null});
            default:
                return AbstractC11153a0.m12382e(TfazcFv.tJQ, EnumC20940z.values(), new String[]{"content_policy"}, new Annotation[][]{null});
        }
    }
}
