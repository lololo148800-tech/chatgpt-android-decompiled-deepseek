package p040Bd;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3756d;
import p559Wn.C8969a;
import p559Wn.C8974f;

/* JADX INFO: renamed from: Bd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1063d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C1063d f2898Z = new C1063d(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1063d f2899o0 = new C1063d(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1063d f2900p0 = new C1063d(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C1063d f2901q0 = new C1063d(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C1063d f2902r0 = new C1063d(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C1063d f2903s0 = new C1063d(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C1063d f2904t0 = new C1063d(0, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C1063d f2905u0 = new C1063d(0, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C1063d f2906v0 = new C1063d(0, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C1063d f2907w0 = new C1063d(0, 9);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2908Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1063d(int i10, int i11) {
        super(i10);
        this.f2908Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f2908Y) {
            case 0:
                C16527D c16527d = AbstractC16526C.f51263a;
                return new C8974f("com.openai.feature.conversations.api.message.AdaVisualization", c16527d.mo5693b(AbstractC1098i.class), new InterfaceC3756d[]{c16527d.mo5693b(C1056c.class), c16527d.mo5693b(C1091h.class)}, new KSerializer[]{C1042a.f2868a, C1077f.f2930a}, new Annotation[0]);
            case 1:
                return new C0961M1(EnumC0973O1.f2752q0, C0955L1.f2717Y);
            case 2:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.message.ApiConversationMessageAuthorRole", EnumC1066d2.values(), new String[]{"user", "assistant", "system", "critic", "tool"}, new Annotation[][]{null, null, null, null, null});
            case 3:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.message.ApiConversationMessageStatus", EnumC1101i2.values(), new String[]{"in_progress", "finished_successfully", "finished_partial_completion"}, new Annotation[][]{null, null, null});
            case 4:
                return new C8969a("com.openai.feature.conversations.api.message.ApiMultimodalTextContentPart.Unsupported", C1022W3.INSTANCE, new Annotation[0]);
            case 5:
                return new C8969a("com.openai.feature.conversations.api.message.ApiSystemErrorContent", C1082f4.INSTANCE, new Annotation[0]);
            case 6:
                return new C0961M1(EnumC1117k4.f3029q0, C1123l4.f3036Y);
            case 7:
                return new C8969a("com.openai.feature.conversations.api.message.ApiUnsupportedContent", C1129m4.INSTANCE, new Annotation[0]);
            case 8:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.message.ContentReferenceStatus", EnumC1159r4.values(), new String[]{"loading", "done"}, new Annotation[][]{null, null});
            default:
                return AbstractC11153a0.m12382e("com.openai.feature.conversations.api.message.MessageFinishType", EnumC0940I4.values(), new String[]{"max_tokens", "interrupted", "unknown", "stop", "content_filter"}, new Annotation[][]{null, null, null, null, null});
        }
    }
}
