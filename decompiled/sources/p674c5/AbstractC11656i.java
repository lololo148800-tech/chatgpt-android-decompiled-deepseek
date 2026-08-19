package p674c5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p444S4.AbstractC6993A;
import p444S4.C6995a;
import p444S4.C7011q;

/* JADX INFO: renamed from: c5.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11656i {

    /* JADX INFO: renamed from: a */
    public static final String f35301a;

    static {
        String strM7409f = C7011q.m7409f("ProcessUtils");
        AbstractC16544l.m18093f(strM7409f, "tagWithPrefix(\"ProcessUtils\")");
        f35301a = strM7409f;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m13019a(Context context, C6995a c6995a) {
        String strM13006a;
        Object next;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(c6995a, ahZQMZ.KfOr);
        if (Build.VERSION.SDK_INT >= 28) {
            strM13006a = C11648a.f35286a.m13006a();
        } else {
            strM13006a = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC6993A.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                AbstractC16544l.m18091d(objInvoke);
                if (objInvoke instanceof String) {
                    strM13006a = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strM13006a = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (C7011q.m7408d().f22422a <= 3) {
                    Log.d(f35301a, "Unable to check ActivityThread for processName", th2);
                }
            }
        }
        return AbstractC16544l.m18089b(strM13006a, context.getApplicationInfo().processName);
    }
}
