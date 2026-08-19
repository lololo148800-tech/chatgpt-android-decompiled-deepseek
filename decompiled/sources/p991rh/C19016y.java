package p991rh;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: rh.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C19016y extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C19016y f60596Z = new C19016y(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19016y f60597o0 = new C19016y(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60598Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19016y(int i10, int i11) {
        super(i10);
        this.f60598Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f60598Y) {
            case 0:
                return AbstractC11153a0.m12382e("com.openai.files.api.FileServiceResponseStatus", EnumC18986A.values(), new String[]{"success", "retry", "error"}, new Annotation[][]{null, null, null});
            default:
                return AbstractC11153a0.m12382e("com.openai.files.api.FileServiceUseCase", EnumC18991F.values(), new String[]{"ace_upload", "my_files", "multimodal", "dalle_agent"}, new Annotation[][]{null, null, null, null});
        }
    }
}
