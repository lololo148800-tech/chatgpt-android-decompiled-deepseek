package p959q8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: q8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18640b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18640b f59380Z = new C18640b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18640b f59381o0 = new C18640b(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59382Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18640b(int i10, int i11) {
        super(i10);
        this.f59382Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f59382Y) {
            case 0:
                return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
            default:
                return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
        }
    }
}
