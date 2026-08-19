package p984r8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: r8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18888b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18888b f60213Z = new C18888b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18888b f60214o0 = new C18888b(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60215Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18888b(int i10, int i11) {
        super(i10);
        this.f60215Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f60215Y) {
            case 0:
                return "Max number of telemetry events per session reached, rejecting.";
            default:
                return "GlobalTracer class exists in the runtime classpath, but there is an error invoking isRegistered method";
        }
    }
}
