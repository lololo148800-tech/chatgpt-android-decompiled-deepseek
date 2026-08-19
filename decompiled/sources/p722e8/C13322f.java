package p722e8;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: e8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13322f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C13322f f42251Z = new C13322f(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13322f f42252o0 = new C13322f(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13322f f42253p0 = new C13322f(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C13322f f42254q0 = new C13322f(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C13322f f42255r0 = new C13322f(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C13322f f42256s0 = new C13322f(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C13322f f42257t0 = new C13322f(0, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42258Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13322f(int i10, int i11) {
        super(i10);
        this.f42258Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f42258Y) {
            case 0:
                return "Application has multiple active sessions when starting a new session";
            case 1:
                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
            case 2:
                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
            case 3:
                return "An RUM event was detected, but no view is active, its missed type is unknown";
            case 4:
                return "Trying to update global RUM context when StopView event arrived, but the context doesn't reference this view.";
            case 5:
                return C17296C.f55119a;
            default:
                return "Trying to update active action in the global RUM context, but the context doesn't reference this view.";
        }
    }
}
