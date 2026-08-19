package p999s;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: s.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19361k0 {

    /* JADX INFO: renamed from: a */
    public static final Method f61318a;

    /* JADX INFO: renamed from: b */
    public static final Method f61319b;

    /* JADX INFO: renamed from: c */
    public static final Method f61320c;

    /* JADX INFO: renamed from: d */
    public static final boolean f61321d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f61318a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f61319b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f61320c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f61321d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
