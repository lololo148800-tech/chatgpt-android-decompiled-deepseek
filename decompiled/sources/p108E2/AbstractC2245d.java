package p108E2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: E2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2245d {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m3272a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m3273b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m3274c(EdgeEffect edgeEffect, float f10, float f11) {
        try {
            return edgeEffect.onPullDistance(f10, f11);
        } catch (Throwable unused) {
            edgeEffect.onPull(f10, f11);
            return 0.0f;
        }
    }
}
