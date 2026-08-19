package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p228J.InterfaceC3839h0;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, InterfaceC3839h0 {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* JADX INFO: renamed from: a */
    public final boolean mo11175a() {
        String str = Build.BRAND;
        return ("blu".equalsIgnoreCase(str) && "studio x10".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str) && "itel w6004".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str) && "vivo 1805".equalsIgnoreCase(Build.MODEL)) || ("positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)));
    }
}
