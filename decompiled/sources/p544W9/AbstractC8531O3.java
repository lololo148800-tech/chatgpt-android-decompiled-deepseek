package p544W9;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p327N0.C5571a;
import p327N0.C5572b;
import p327N0.C5573c;
import p349O0.C6021p;
import p419R4.InterfaceC6808b;
import p492U1.C7542g;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9200R2;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: W9.O3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8531O3 {
    /* JADX INFO: renamed from: a */
    public static final C5572b m9193a(Activity activity, C6021p c6021p) {
        Rect rectM9764a;
        int i10;
        c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a);
        InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
        InterfaceC6808b.f21850a.getClass();
        AbstractC16544l.m18094g(activity, "activity");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            rectM9764a = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
            AbstractC16544l.m18093f(rectM9764a, "activity.windowManager.currentWindowMetrics.bounds");
        } else if (i11 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rectM9764a = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e10) {
                AbstractC15256t.m16484v("R2", e10);
                rectM9764a = AbstractC9200R2.m9764a(activity);
            } catch (NoSuchFieldException e11) {
                AbstractC15256t.m16484v("R2", e11);
                rectM9764a = AbstractC9200R2.m9764a(activity);
            } catch (NoSuchMethodException e12) {
                AbstractC15256t.m16484v("R2", e12);
                rectM9764a = AbstractC9200R2.m9764a(activity);
            } catch (InvocationTargetException e13) {
                AbstractC15256t.m16484v("R2", e13);
                rectM9764a = AbstractC9200R2.m9764a(activity);
            }
        } else if (i11 >= 28) {
            rectM9764a = AbstractC9200R2.m9764a(activity);
        } else if (i11 >= 24) {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i12 = rect.bottom + dimensionPixelSize;
                if (i12 == point.y) {
                    rect.bottom = i12;
                } else {
                    int i13 = rect.right + dimensionPixelSize;
                    if (i13 == point.x) {
                        rect.right = i13;
                    }
                }
            }
            rectM9764a = rect;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            AbstractC16544l.m18093f(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int i14 = point2.x;
            if (i14 == 0 || (i10 = point2.y) == 0) {
                defaultDisplay2.getRectSize(rect2);
            } else {
                rect2.right = i14;
                rect2.bottom = i10;
            }
            rectM9764a = rect2;
        }
        long jMo7868s = interfaceC7537b.mo7868s(AbstractC14334L.m15619H(new Rect(rectM9764a.left, rectM9764a.top, rectM9764a.right, rectM9764a.bottom)).m15319f());
        Set set = C5573c.f18072Z;
        Set set2 = C5571a.f18067Z;
        float fM7877b = C7542g.m7877b(jMo7868s);
        float f10 = 0;
        if (Float.compare(fM7877b, f10) < 0) {
            throw new IllegalArgumentException("Width must not be negative");
        }
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Must support at least one size class");
        }
        List list = C5573c.f18073o0;
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            int i17 = ((C5573c) list.get(i16)).f18074Y;
            if (set.contains(new C5573c(i17))) {
                if (Float.compare(fM7877b, AbstractC8543Q3.m9204b(i17)) >= 0) {
                    i15 = i17;
                    break;
                }
                i15 = i17;
            }
        }
        Set set3 = C5571a.f18067Z;
        float fM7876a = C7542g.m7876a(jMo7868s);
        if (Float.compare(fM7876a, f10) < 0) {
            throw new IllegalArgumentException("Width must not be negative");
        }
        if (set2.isEmpty()) {
            throw new IllegalArgumentException("Must support at least one size class");
        }
        List list2 = C5571a.f18068o0;
        int size2 = list2.size();
        int i18 = 2;
        for (int i19 = 0; i19 < size2; i19++) {
            int i20 = ((C5571a) list2.get(i19)).f18069Y;
            if (set2.contains(new C5571a(i20))) {
                if (Float.compare(fM7876a, AbstractC8537P3.m9200a(i20)) >= 0) {
                    i18 = i20;
                    break;
                }
                i18 = i20;
            }
        }
        return new C5572b(i15, i18);
    }
}
