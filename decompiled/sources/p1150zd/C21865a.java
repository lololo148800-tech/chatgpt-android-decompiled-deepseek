package p1150zd;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p211I8.lPE.sRXLFOsOgS;

/* JADX INFO: renamed from: zd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21865a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C21865a f69336Z = new C21865a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21865a f69337o0 = new C21865a(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69338Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21865a(int i10, int i11) {
        super(i10);
        this.f69338Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69338Y) {
            case 0:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.feedback.MessageFeedbackRating", EnumC21867c.values(), new String[]{"thumbsUp", "thumbsDown"}, new Annotation[][]{null, null});
            default:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.feedback.MessageFeedbackTag", EnumC21875k.values(), new String[]{sRXLFOsOgS.ThfXZo, "false", "not-helpful", "bad-transcription"}, new Annotation[][]{null, null, null, null});
        }
    }
}
