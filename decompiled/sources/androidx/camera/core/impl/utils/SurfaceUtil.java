package androidx.camera.core.impl.utils;

import android.view.Surface;
import p140Fa.C2685e;

/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    /* JADX INFO: renamed from: a */
    public static C2685e m11191a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        C2685e c2685e = new C2685e();
        int i10 = iArrNativeGetSurfaceInfo[0];
        int i11 = iArrNativeGetSurfaceInfo[1];
        int i12 = iArrNativeGetSurfaceInfo[2];
        return c2685e;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
