package p849k7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: k7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16350c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C16350c f50731Z = new C16350c(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C16350c f50732o0 = new C16350c(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C16350c f50733p0 = new C16350c(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C16350c f50734q0 = new C16350c(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C16350c f50735r0 = new C16350c(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C16350c f50736s0 = new C16350c(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C16350c f50737t0 = new C16350c(0, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C16350c f50738u0 = new C16350c(0, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C16350c f50739v0 = new C16350c(0, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C16350c f50740w0 = new C16350c(0, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C16350c f50741x0 = new C16350c(0, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C16350c f50742y0 = new C16350c(0, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C16350c f50743z0 = new C16350c(0, 12);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50744Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16350c(int i10, int i11) {
        super(i10);
        this.f50744Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f50744Y) {
            case 0:
                return "Unable to read your application's version name";
            case 1:
                return "Unable to launch a synchronize local time with an NTP server.";
            case 2:
                return "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
            case 3:
                return "Failed to read Build ID information, de-obfuscation may not work properly.";
            case 4:
                return "Thread was unable to set its own interrupted state";
            case 5:
                return "Trying to shut down Kronos when it is already not running";
            case 6:
                return "Unable to remove shutdown hook, Runtime is already shutting down";
            case 7:
                return "Security Manager denied removing shutdown hook ";
            case 8:
                return "Unable to add shutdown hook, Runtime is already shutting down";
            case 9:
                return "Shutdown hook was rejected";
            case 10:
                return "Security Manager denied adding shutdown hook ";
            case 11:
                return "No need to write last RUM view event: NDK crash reports feature is not enabled and API is below 30.";
            default:
                return "Cannot generate SHA-256 hash.";
        }
    }
}
