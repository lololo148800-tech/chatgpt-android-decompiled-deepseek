package p999s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import io.sentry.android.core.AbstractC15256t;
import p880m.AbstractC17123a;
import p913o2.AbstractC17803d;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: s.O0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19311O0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f61182a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f61183b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f61184c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f61185d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f61186e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f61187f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f61188g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m20394a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC17123a.f54741j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                AbstractC15256t.m16465c("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m20395b(Context context, int i10) {
        ColorStateList colorStateListM20397d = m20397d(context, i10);
        if (colorStateListM20397d != null && colorStateListM20397d.isStateful()) {
            return colorStateListM20397d.getColorForState(f61183b, colorStateListM20397d.getDefaultColor());
        }
        ThreadLocal threadLocal = f61182a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        int iM20396c = m20396c(context, i10);
        return AbstractC18861b.m20169g(iM20396c, Math.round(Color.alpha(iM20396c) * f10));
    }

    /* JADX INFO: renamed from: c */
    public static int m20396c(Context context, int i10) {
        int[] iArr = f61188g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m20397d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f61188g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC17803d.m19556c(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
