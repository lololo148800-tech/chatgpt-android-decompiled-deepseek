package p228J;

import android.util.Range;
import p001A.C0028O;
import p001A.C0065h0;
import p326N.InterfaceC5569k;

/* JADX INFO: renamed from: J.E0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3800E0 extends InterfaceC5569k, InterfaceC3816S {

    /* JADX INFO: renamed from: A */
    public static final C3828c f11490A;

    /* JADX INFO: renamed from: B */
    public static final C3828c f11491B;

    /* JADX INFO: renamed from: D */
    public static final C3828c f11492D;

    /* JADX INFO: renamed from: G */
    public static final C3828c f11493G;

    /* JADX INFO: renamed from: H */
    public static final C3828c f11494H;

    /* JADX INFO: renamed from: J */
    public static final C3828c f11495J;

    /* JADX INFO: renamed from: v */
    public static final C3828c f11496v = new C3828c("camerax.core.useCase.defaultSessionConfig", C3865u0.class, null);

    /* JADX INFO: renamed from: w */
    public static final C3828c f11497w = new C3828c("camerax.core.useCase.defaultCaptureConfig", C3799E.class, null);

    /* JADX INFO: renamed from: x */
    public static final C3828c f11498x = new C3828c("camerax.core.useCase.sessionConfigUnpacker", C0065h0.class, null);

    /* JADX INFO: renamed from: y */
    public static final C3828c f11499y = new C3828c("camerax.core.useCase.captureConfigUnpacker", C0028O.class, null);

    /* JADX INFO: renamed from: z */
    public static final C3828c f11500z;

    static {
        Class cls = Integer.TYPE;
        f11500z = new C3828c("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f11490A = new C3828c("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        f11491B = new C3828c("camerax.core.useCase.zslDisabled", cls2, null);
        f11492D = new C3828c("camerax.core.useCase.highResolutionDisabled", cls2, null);
        f11493G = new C3828c("camerax.core.useCase.captureType", EnumC3804G0.class, null);
        f11494H = new C3828c("camerax.core.useCase.previewStabilizationMode", cls, null);
        f11495J = new C3828c("camerax.core.useCase.videoStabilizationMode", cls, null);
    }

    /* JADX INFO: renamed from: D */
    EnumC3804G0 mo31D();

    /* JADX INFO: renamed from: E */
    int mo32E();

    /* JADX INFO: renamed from: K */
    int mo35K();

    /* JADX INFO: renamed from: Q */
    boolean mo38Q();

    /* JADX INFO: renamed from: i */
    Range mo43i();

    /* JADX INFO: renamed from: l */
    C3865u0 mo45l();

    /* JADX INFO: renamed from: m */
    int mo46m();

    /* JADX INFO: renamed from: n */
    C0065h0 mo47n();

    /* JADX INFO: renamed from: p */
    boolean mo48p();

    /* JADX INFO: renamed from: u */
    C3865u0 mo50u();
}
