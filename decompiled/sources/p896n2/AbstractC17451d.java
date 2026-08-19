package p896n2;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: n2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17451d {

    /* JADX INFO: renamed from: a */
    public static final Class f55793a;

    /* JADX INFO: renamed from: b */
    public static final Field f55794b;

    /* JADX INFO: renamed from: c */
    public static final Field f55795c;

    /* JADX INFO: renamed from: d */
    public static final Method f55796d;

    /* JADX INFO: renamed from: e */
    public static final Method f55797e;

    /* JADX INFO: renamed from: f */
    public static final Method f55798f;

    /* JADX INFO: renamed from: g */
    public static final Handler f55799g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f55793a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f55794b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f55795c = declaredField2;
        Class cls2 = f55793a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f55796d = declaredMethod;
        Class cls3 = f55793a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f55797e = declaredMethod2;
        Class cls4 = f55793a;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 == 26 || i10 == 27) && cls4 != null) {
            try {
                Class<?> cls5 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f55798f = method;
    }
}
