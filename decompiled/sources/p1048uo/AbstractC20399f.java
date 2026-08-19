package p1048uo;

import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: uo.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20399f {
    /* JADX INFO: renamed from: a */
    public static boolean m21066a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            return version.major() > 2;
        }
        if (version.minor() != 1) {
            return version.minor() > 1;
        }
        return version.patch() >= 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21067b() {
        return C20401h.f64512d;
    }
}
