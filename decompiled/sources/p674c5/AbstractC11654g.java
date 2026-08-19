package p674c5;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: c5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11654g {
    /* JADX INFO: renamed from: a */
    public static final void m13017a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC16544l.m18094g(connectivityManager, "<this>");
        AbstractC16544l.m18094g(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
