package p228J;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p178H.AbstractC3137c;
import p490U.C7531b;

/* JADX INFO: renamed from: J.U */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3818U extends InterfaceC3849m0 {

    /* JADX INFO: renamed from: l */
    public static final C3828c f11563l = new C3828c("camerax.core.imageOutput.targetAspectRatio", AbstractC3137c.class, null);

    /* JADX INFO: renamed from: m */
    public static final C3828c f11564m;

    /* JADX INFO: renamed from: n */
    public static final C3828c f11565n;

    /* JADX INFO: renamed from: o */
    public static final C3828c f11566o;

    /* JADX INFO: renamed from: p */
    public static final C3828c f11567p;

    /* JADX INFO: renamed from: q */
    public static final C3828c f11568q;

    /* JADX INFO: renamed from: r */
    public static final C3828c f11569r;

    /* JADX INFO: renamed from: s */
    public static final C3828c f11570s;

    /* JADX INFO: renamed from: t */
    public static final C3828c f11571t;

    /* JADX INFO: renamed from: u */
    public static final C3828c f11572u;

    static {
        Class cls = Integer.TYPE;
        f11564m = new C3828c("camerax.core.imageOutput.targetRotation", cls, null);
        f11565n = new C3828c("camerax.core.imageOutput.appTargetRotation", cls, null);
        f11566o = new C3828c("camerax.core.imageOutput.mirrorMode", cls, null);
        f11567p = new C3828c("camerax.core.imageOutput.targetResolution", Size.class, null);
        f11568q = new C3828c("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f11569r = new C3828c("camerax.core.imageOutput.maxResolution", Size.class, null);
        f11570s = new C3828c("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f11571t = new C3828c("camerax.core.imageOutput.resolutionSelector", C7531b.class, null);
        f11572u = new C3828c("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    /* JADX INFO: renamed from: B */
    int mo4541B();

    /* JADX INFO: renamed from: C */
    Size mo4542C();

    /* JADX INFO: renamed from: G */
    boolean mo4543G();

    /* JADX INFO: renamed from: I */
    int mo4544I();

    /* JADX INFO: renamed from: P */
    Size mo4545P();

    /* JADX INFO: renamed from: S */
    int mo4546S();

    /* JADX INFO: renamed from: f */
    List mo4547f();

    /* JADX INFO: renamed from: g */
    C7531b mo4548g();

    /* JADX INFO: renamed from: j */
    int mo4549j();

    /* JADX INFO: renamed from: r */
    ArrayList mo4550r();

    /* JADX INFO: renamed from: s */
    C7531b mo4551s();

    /* JADX INFO: renamed from: w */
    Size mo4552w();
}
