package p172Gi;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Gi.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C3087t extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C3087t f9294Z = new C3087t(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3087t f9295o0 = new C3087t(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9296Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3087t(int i10, int i11) {
        super(i10);
        this.f9296Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f9296Y) {
            case 0:
                return AbstractC11153a0.m12382e("com.openai.voice.api.model.VoiceFeedbackType", EnumC3089v.values(), new String[]{"thumbs_up", "thumbs_down"}, new Annotation[][]{null, null});
            default:
                return AbstractC11153a0.m12382e("com.openai.voice.api.model.VoiceSystemPromptType", EnumC3064F.values(), new String[]{"default", "onboarding"}, new Annotation[][]{null, null});
        }
    }
}
