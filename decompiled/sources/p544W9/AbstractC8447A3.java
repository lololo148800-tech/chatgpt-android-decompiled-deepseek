package p544W9;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p306M4.AbstractC5295a;

/* JADX INFO: renamed from: W9.A3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8447A3 {

    /* JADX INFO: renamed from: a */
    public static long f26293a;

    /* JADX INFO: renamed from: b */
    public static Method f26294b;

    /* JADX INFO: renamed from: c */
    public static Method f26295c;

    /* JADX INFO: renamed from: b */
    public static void m9050b(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9051c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC5295a.m5835a();
        }
        try {
            if (f26294b == null) {
                f26293a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f26294b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f26294b.invoke(null, Long.valueOf(f26293a))).booleanValue();
        } catch (Exception e10) {
            m9050b("isTagEnabled", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9052e(int i10, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC5295a.m5836b(i10, m9053f(str));
            return;
        }
        String strM9053f = m9053f(str);
        try {
            if (f26295c == null) {
                f26295c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f26295c.invoke(null, Long.valueOf(f26293a), strM9053f, Integer.valueOf(i10));
        } catch (Exception e10) {
            m9050b("traceCounter", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m9053f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo9054a();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo9055d();
}
