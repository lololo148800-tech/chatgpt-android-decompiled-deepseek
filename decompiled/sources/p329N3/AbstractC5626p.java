package p329N3;

import android.view.Surface;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: N3.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5626p {
    /* JADX INFO: renamed from: a */
    public static void m6035a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            AbstractC20800b.m21325m("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
