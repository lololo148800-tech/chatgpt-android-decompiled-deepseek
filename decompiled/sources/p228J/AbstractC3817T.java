package p228J;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: J.T */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3817T {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11562a = 0;

    static {
        C3828c c3828c = InterfaceC3818U.f11563l;
    }

    /* JADX INFO: renamed from: a */
    public static int m4553a(InterfaceC3818U interfaceC3818U) {
        return ((Integer) interfaceC3818U.mo36M(InterfaceC3818U.f11565n, -1)).intValue();
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m4554b(InterfaceC3818U interfaceC3818U) {
        List list = (List) interfaceC3818U.mo36M(InterfaceC3818U.f11572u, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m4555c(InterfaceC3818U interfaceC3818U) {
        return ((Integer) interfaceC3818U.mo36M(InterfaceC3818U.f11566o, -1)).intValue();
    }

    /* JADX INFO: renamed from: d */
    public static int m4556d(InterfaceC3818U interfaceC3818U) {
        return ((Integer) interfaceC3818U.mo36M(InterfaceC3818U.f11564m, 0)).intValue();
    }

    /* JADX INFO: renamed from: e */
    public static void m4557e(InterfaceC3818U interfaceC3818U) {
        boolean zMo4543G = interfaceC3818U.mo4543G();
        boolean z6 = interfaceC3818U.mo4542C() != null;
        if (zMo4543G && z6) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC3818U.mo4551s() != null) {
            if (zMo4543G || z6) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
