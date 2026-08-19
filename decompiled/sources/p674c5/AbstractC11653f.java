package p674c5;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: c5.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11653f {
    /* JADX INFO: renamed from: a */
    public static final Network m13016a(ConnectivityManager connectivityManager) {
        AbstractC16544l.m18094g(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
