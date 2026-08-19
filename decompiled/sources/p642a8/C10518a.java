package p642a8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: a8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10518a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C10518a f31171Z = new C10518a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10518a f31172o0 = new C10518a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10518a f31173p0 = new C10518a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10518a f31174q0 = new C10518a(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C10518a f31175r0 = new C10518a(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C10518a f31176s0 = new C10518a(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C10518a f31177t0 = new C10518a(0, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C10518a f31178u0 = new C10518a(0, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C10518a f31179v0 = new C10518a(0, 8);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31180Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10518a(int i10, int i11) {
        super(i10);
        this.f31180Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f31180Y) {
            case 0:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
            case 1:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
            case 2:
                return "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
            case 3:
                return "Last known exit reason has no trace information attached, cannot report fatal ANR.";
            case 4:
                return "RUM feature received a log event where mandatory message field is either missing or has a wrong type.";
            case 5:
                return "RUM feature received a log event with stacktrace where mandatory message field is either missing or has a wrong type.";
            case 6:
                return "No last known RUM view event found, skipping fatal ANR reporting.";
            case 7:
                return "Couldn't get historical exit reasons";
            default:
                return "Developer mode enabled, setting RUM sample rate to 100%.";
        }
    }
}
