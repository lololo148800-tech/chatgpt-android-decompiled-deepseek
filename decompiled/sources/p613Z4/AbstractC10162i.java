package p613Z4;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;
import p566X4.C9046d;
import p674c5.AbstractC11652e;
import p674c5.AbstractC11653f;

/* JADX INFO: renamed from: Z4.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10162i {

    /* JADX INFO: renamed from: a */
    public static final String f30097a;

    static {
        String strM7409f = C7011q.m7409f("NetworkStateTracker");
        AbstractC16544l.m18093f(strM7409f, "tagWithPrefix(\"NetworkStateTracker\")");
        f30097a = strM7409f;
    }

    /* JADX INFO: renamed from: a */
    public static final C9046d m10761a(ConnectivityManager connectivityManager) {
        boolean zM13014b;
        AbstractC16544l.m18094g(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilitiesM13013a = AbstractC11652e.m13013a(connectivityManager, AbstractC11653f.m13016a(connectivityManager));
            zM13014b = networkCapabilitiesM13013a != null ? AbstractC11652e.m13014b(networkCapabilitiesM13013a, 16) : false;
        } catch (SecurityException e10) {
            C7011q.m7408d().m7412c(f30097a, "Unable to validate active network", e10);
        }
        return new C9046d(z6, zM13014b, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
