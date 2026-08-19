package p447S7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: S7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7025a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C7025a f22459Z = new C7025a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7025a f22460o0 = new C7025a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7025a f22461p0 = new C7025a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C7025a f22462q0 = new C7025a(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22463Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7025a(int i10, int i11) {
        super(i10);
        this.f22463Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f22463Y) {
            case 0:
                return "Cannot read application, session, view IDs data from view event.";
            case 1:
                return "Error while trying to read the NDK crash directory";
            case 2:
                return "Logs feature is not registered, won't report NDK crash info as log.";
            default:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
        }
    }
}
