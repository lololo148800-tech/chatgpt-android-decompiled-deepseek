package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import mo.C17342i;
import p001A.C0017I0;

/* JADX INFO: renamed from: s.q */
/* JADX INFO: loaded from: classes.dex */
public final class C19372q {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f61352b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C19372q f61353c;

    /* JADX INFO: renamed from: a */
    public C19301J0 f61354a;

    /* JADX INFO: renamed from: a */
    public static synchronized C19372q m20473a() {
        try {
            if (f61353c == null) {
                m20475d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61353c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m20474c(int i10, PorterDuff.Mode mode) {
        return C19301J0.m20378h(i10, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m20475d() {
        if (f61353c == null) {
            C19372q c19372q = new C19372q();
            f61353c = c19372q;
            c19372q.f61354a = C19301J0.m20377d();
            f61353c.f61354a.m20389m(new C0017I0(7));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m20476e(Drawable drawable, C17342i c17342i, int[] iArr) {
        PorterDuff.Mode mode = C19301J0.f61150h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = c17342i.f55253b;
        if (z6 || c17342i.f55252a) {
            PorterDuffColorFilter porterDuffColorFilterM20378h = null;
            ColorStateList colorStateList = z6 ? (ColorStateList) c17342i.f55254c : null;
            PorterDuff.Mode mode2 = c17342i.f55252a ? (PorterDuff.Mode) c17342i.f55255d : C19301J0.f61150h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM20378h = C19301J0.m20378h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM20378h);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m20477b(Context context, int i10) {
        return this.f61354a.m20384f(context, i10);
    }
}
