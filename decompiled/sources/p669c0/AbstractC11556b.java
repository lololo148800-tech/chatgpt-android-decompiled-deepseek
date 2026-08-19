package p669c0;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: c0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11556b extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f34931a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m12934a(float f10, float f11, boolean z6) {
        if (!z6) {
            return f10;
        }
        return (float) (((1.0d - f34931a) * ((double) f11)) + ((double) f10));
    }

    /* JADX INFO: renamed from: b */
    public static float m12935b(float f10, float f11, boolean z6) {
        if (!z6) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f34931a) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }
}
