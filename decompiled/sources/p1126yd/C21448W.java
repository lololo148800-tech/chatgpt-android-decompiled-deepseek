package p1126yd;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: yd.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C21448W extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C21448W f68033Z = new C21448W(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21448W f68034o0 = new C21448W(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21448W f68035p0 = new C21448W(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C21448W f68036q0 = new C21448W(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68037Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21448W(int i10, int i11) {
        super(i10);
        this.f68037Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f68037Y) {
            case 0:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.conversation.ConversationStreamRequestAction", EnumC21452Y.values(), new String[]{"next", "variant", "continue"}, new Annotation[][]{null, null, null});
            case 1:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.conversation.MessageFeedbackPlacement", EnumC21410C0.values(), new String[]{"left", "right"}, new Annotation[][]{null, null});
            case 2:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.conversation.MessageFeedbackRating", EnumC21414E0.values(), new String[]{"original", "new", "skip", "skip_without_completion"}, new Annotation[][]{null, null, null, null});
            default:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.conversation.MessageFeedbackVersion", EnumC21418G0.values(), new String[]{"skippable_parallel_2_in_stream:a:1.0", "unskippable_parallel_2_in_stream:a:1.0"}, new Annotation[][]{null, null});
        }
    }
}
