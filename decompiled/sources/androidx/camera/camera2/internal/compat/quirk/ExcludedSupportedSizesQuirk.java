package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p228J.InterfaceC3839h0;

/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements InterfaceC3839h0 {
    /* JADX INFO: renamed from: b */
    public static boolean m11176b() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11177c() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }
}
