package p674c5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: c5.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11652e {
    /* JADX INFO: renamed from: a */
    public static final NetworkCapabilities m13013a(ConnectivityManager connectivityManager, Network network) {
        AbstractC16544l.m18094g(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m13014b(NetworkCapabilities networkCapabilities, int i10) {
        AbstractC16544l.m18094g(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m13015c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC16544l.m18094g(connectivityManager, "<this>");
        AbstractC16544l.m18094g(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
