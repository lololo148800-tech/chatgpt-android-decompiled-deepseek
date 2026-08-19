package p329N3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: renamed from: N3.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5620j {
    /* JADX INFO: renamed from: a */
    public static boolean m6009a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }
}
