package p273Kl;

import java.net.URI;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.C1342O;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: Kl.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4764c {

    /* JADX INFO: renamed from: a */
    public static final C1342O f15545a = new C1342O(10);

    /* JADX INFO: renamed from: a */
    public static final boolean m5434a(URI uri) {
        if (uri.getHost() == null) {
            return false;
        }
        String host = uri.getHost();
        AbstractC16544l.m18093f(host, "getHost(...)");
        if (!AbstractC21329w.m21725l(host, ".livekit.cloud", false)) {
            String host2 = uri.getHost();
            AbstractC16544l.m18093f(host2, "getHost(...)");
            if (!AbstractC21329w.m21725l(host2, ".livekit.run", false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m5435b(String str) {
        return str != null && ("av1".equalsIgnoreCase(str) || "vp9".equalsIgnoreCase(str));
    }
}
