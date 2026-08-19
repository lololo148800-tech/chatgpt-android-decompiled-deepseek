package p186H7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: H7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3261a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C3261a f9928Z = new C3261a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3261a f9929o0 = new C3261a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3261a f9930p0 = new C3261a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C3261a f9931q0 = new C3261a(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9932Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3261a(int i10, int i11) {
        super(i10);
        this.f9932Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f9932Y) {
            case 0:
                return "Failed to get all threads dump";
            case 1:
                return "Logs feature is not registered, won't report crash as log.";
            case 2:
                return "RUM feature is not registered, won't report crash as RUM event.";
            default:
                return "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
        }
    }
}
