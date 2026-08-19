package p063C9;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Method;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: C9.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1618d {

    /* JADX INFO: renamed from: a */
    public static final Method f4577a;

    /* JADX INFO: renamed from: b */
    public static final Method f4578b;

    /* JADX INFO: renamed from: c */
    public static final Method f4579c;

    /* JADX INFO: renamed from: d */
    public static final Method f4580d;

    /* JADX INFO: renamed from: e */
    public static Boolean f4581e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f4577a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f4578b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f4579c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                AbstractC15256t.m16483u("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e11) {
                AbstractC15256t.m16483u("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method4 = null;
            }
        } else {
            method4 = null;
        }
        f4580d = method4;
        f4581e = null;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m2474a(Context context) {
        Boolean bool = f4581e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z6 = AbstractC17803d.m19554a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f4581e = Boolean.valueOf(z6);
        return z6;
    }
}
