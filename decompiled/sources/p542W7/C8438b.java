package p542W7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: W7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8438b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C8438b f26262Z = new C8438b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8438b f26263o0 = new C8438b(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C8438b f26264p0 = new C8438b(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C8438b f26265q0 = new C8438b(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26266Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8438b(int i10, int i11) {
        super(i10);
        this.f26266Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f26266Y) {
            case 0:
                return "Failed to update intercepted OkHttp request";
            case 1:
                return "You added a TracingInterceptor to your OkHttpClient, but you did not specify any first party hosts. Your requests won't be traced.\nTo set a list of known hosts, you can use the Configuration.Builder::setFirstPartyHosts() method.";
            case 2:
                return "You added a TracingInterceptor to your OkHttpClient, but you didn't register any Tracer. We automatically created a local tracer for you.";
            default:
                return "You added a TracingInterceptor to your OkHttpClient, but you did not enable the TracingFeature. Your requests won't be traced.";
        }
    }
}
