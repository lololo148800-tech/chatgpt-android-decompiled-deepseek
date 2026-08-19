package p766g8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: g8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13825b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C13825b f43842Z = new C13825b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13825b f43843o0 = new C13825b(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13825b f43844p0 = new C13825b(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C13825b f43845q0 = new C13825b(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C13825b f43846r0 = new C13825b(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C13825b f43847s0 = new C13825b(0, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43848Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13825b(int i10, int i11) {
        super(i10);
        this.f43848Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f43848Y) {
            case 0:
                return "We could not find a valid target for the SCROLL or SWIPE event. The DecorView was empty and either transparent or not clickable for this Activity.";
            case 1:
                return "We could not find a valid target for the TAP event. The DecorView was empty and either transparent or not clickable for this Activity.";
            case 2:
                return "Received null KeyEvent";
            case 3:
                return "Error processing MotionEvent";
            case 4:
                return "Received null MotionEvent";
            default:
                return "Wrapped Window.Callback failed processing event";
        }
    }
}
