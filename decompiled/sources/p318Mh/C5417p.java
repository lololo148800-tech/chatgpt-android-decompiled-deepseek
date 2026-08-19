package p318Mh;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p040Bd.C0961M1;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Mh.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C5417p extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C5417p f17702Z = new C5417p(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5417p f17703o0 = new C5417p(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5417p f17704p0 = new C5417p(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C5417p f17705q0 = new C5417p(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17706Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5417p(int i10, int i11) {
        super(i10);
        this.f17706Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f17706Y) {
            case 0:
                return AbstractC11153a0.m12382e("com.openai.navigation.destinations.Destination.Conversation.EntryPoint", EnumC5421r.values(), new String[]{"voice", "camera", "gallery", "whisper", "default"}, new Annotation[][]{null, null, null, null, null});
            case 1:
                return new C0961M1(EnumC5425t.f17730q0, C5427u.f17737Y);
            case 2:
                return AbstractC11153a0.m12383f("com.openai.navigation.destinations.Destination.Subscription.EntryPoint", EnumC5424s0.values());
            default:
                return AbstractC11153a0.m12383f("com.openai.navigation.destinations.NavAnimation", EnumC5368I0.values());
        }
    }
}
