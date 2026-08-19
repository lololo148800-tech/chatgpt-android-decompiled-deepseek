package p592Y7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Y7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9666a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C9666a f29142Z = new C9666a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9666a f29143o0 = new C9666a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C9666a f29144p0 = new C9666a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C9666a f29145q0 = new C9666a(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29146Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9666a(int i10, int i11) {
        super(i10);
        this.f29146Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f29146Y) {
            case 0:
                return "A RumMonitor has already been registered for this SDK instance";
            case 1:
                return "SDK instance provided doesn't implement InternalSdkCore.";
            case 2:
                return "You're trying to create a RumMonitor instance, but the RUM application id was empty. No RUM data will be sent.";
            default:
                return "RUM Feature is already enabled in this SDK core, ignoring the call to enable it.";
        }
    }
}
