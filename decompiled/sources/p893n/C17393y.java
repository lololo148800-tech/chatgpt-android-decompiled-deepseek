package p893n;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p692d0.C12959L;
import p999s.C19329Y;
import p999s.C19364m;
import p999s.C19366n;
import p999s.C19368o;
import p999s.C19390z;

/* JADX INFO: renamed from: n.y */
/* JADX INFO: loaded from: classes.dex */
public class C17393y {

    /* JADX INFO: renamed from: b */
    public static final Class[] f55581b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f55582c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f55583d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f55584e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f55585f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f55586g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C12959L f55587h = new C12959L(0);

    /* JADX INFO: renamed from: a */
    public final Object[] f55588a = new Object[2];

    /* JADX INFO: renamed from: a */
    public C19364m mo13679a(Context context, AttributeSet attributeSet) {
        return new C19364m(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C19366n mo13680b(Context context, AttributeSet attributeSet) {
        return new C19366n(context, attributeSet, com.openai.chatgpt.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: c */
    public C19368o mo13681c(Context context, AttributeSet attributeSet) {
        return new C19368o(context, attributeSet, com.openai.chatgpt.R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: d */
    public C19390z mo13682d(Context context, AttributeSet attributeSet) {
        return new C19390z(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public C19329Y mo13683e(Context context, AttributeSet attributeSet) {
        return new C19329Y(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m19106f(Context context, String str, String str2) {
        String strConcat;
        C12959L c12959l = f55587h;
        Constructor constructor = (Constructor) c12959l.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f55581b);
            c12959l.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f55588a);
    }
}
