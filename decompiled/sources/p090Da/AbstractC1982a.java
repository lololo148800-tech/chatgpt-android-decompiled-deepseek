package p090Da;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: Da.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1982a {

    /* JADX INFO: renamed from: a */
    public static final int[] f5854a = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final String f5855b = AbstractC1982a.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m3155a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f5854a, 0)) != 0) {
            AbstractC15256t.m16482t(f5855b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3156b(int[] iArr) {
        boolean z6 = false;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z6 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z10 = true;
            }
        }
        return z6 && z10;
    }
}
