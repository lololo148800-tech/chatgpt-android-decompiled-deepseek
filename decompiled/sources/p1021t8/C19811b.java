package p1021t8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: t8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19811b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C19811b f62847Z = new C19811b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19811b f62848o0 = new C19811b(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C19811b f62849p0 = new C19811b(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62850Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19811b(int i10, int i11) {
        super(i10);
        this.f62850Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f62850Y) {
            case 0:
                return "You're trying to create an AndroidTracer instance, but either the SDK was not initialized or the Tracing feature was not registered/initialized. No tracing data will be sent.";
            case 1:
                return "You're trying to bundle the traces with a RUM context, but the RUM feature was not registered/initialized. No RUM context will be attached to your traces in this case.";
            default:
                return "Default service name is missing during AndroidTracer.Builder creation, did you initialize SDK?";
        }
    }
}
