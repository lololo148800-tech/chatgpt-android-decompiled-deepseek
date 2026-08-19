package p902n8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: n8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17516c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C17516c f56019Z = new C17516c(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C17516c f56020o0 = new C17516c(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C17516c f56021p0 = new C17516c(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C17516c f56022q0 = new C17516c(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C17516c f56023r0 = new C17516c(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C17516c f56024s0 = new C17516c(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C17516c f56025t0 = new C17516c(0, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C17516c f56026u0 = new C17516c(0, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C17516c f56027v0 = new C17516c(0, 8);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56028Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17516c(int i10, int i11) {
        super(i10);
        this.f56028Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f56028Y) {
            case 0:
                return "Activity stopped but window was not tracked";
            case 1:
                return "Trying to disable JankStats instance which was already disabled before, this shouldn't happen.";
            case 2:
                return "Failed to disable JankStats tracking";
            case 3:
                return "Failed to disable JankStats tracking";
            case 4:
                return "Unable to attach JankStatsListener to window";
            case 5:
                return "Unable to attach JankStatsListener to window, decorView is null or not hardware accelerated";
            case 6:
                return "Unable to create JankStats";
            case 7:
                return "Unable to detach JankStatsListener to window, most probably because it wasn't attached";
            default:
                return "Unable to attach JankStats to the current window";
        }
    }
}
