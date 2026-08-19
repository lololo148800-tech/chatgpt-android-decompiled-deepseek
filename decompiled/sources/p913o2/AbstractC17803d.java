package p913o2;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p084D4.ExecutorC1912f;
import p817j$.util.Objects;
import p896n2.AbstractC17453f;
import p896n2.AbstractC17466s;
import p896n2.C17469v;
import p955q2.AbstractC18611c;
import p955q2.AbstractC18619k;
import p955q2.C18617i;
import p955q2.C18618j;

/* JADX INFO: renamed from: o2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17803d {

    /* JADX INFO: renamed from: a */
    public static final Object f56790a = null;

    /* JADX INFO: renamed from: a */
    public static int m19554a(Context context, String str) {
        boolean zM19168a = true;
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        C17469v c17469v = new C17469v(context);
        if (i10 >= 24) {
            zM19168a = AbstractC17466s.m19168a(c17469v.f55844a);
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i11 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                num.getClass();
                if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i11), packageName)).intValue() != 0) {
                    zM19168a = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return zM19168a ? 0 : -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m19555b(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                if (iNoteProxyOpNoThrow == 0) {
                    iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC17453f.m19132a(context)) : 1;
                }
            } else {
                iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
            }
            if (iNoteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m19556c(Context context, int i10) {
        ColorStateList colorStateListM19970a;
        ColorStateList colorStateList;
        C18617i c18617i;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C18618j c18618j = new C18618j(resources, theme);
        synchronized (AbstractC18619k.f59301c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC18619k.f59300b.get(c18618j);
                colorStateListM19970a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c18617i = (C18617i) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (c18617i.f59295b.equals(resources.getConfiguration())) {
                        if (theme != null || c18617i.f59296c != 0) {
                            if (theme == null || c18617i.f59296c != theme.hashCode()) {
                            }
                        }
                        colorStateList = c18617i.f59294a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC18619k.f59299a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListM19970a = AbstractC18611c.m19970a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                AbstractC15256t.m16483u("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListM19970a == null) {
            return resources.getColorStateList(i10, theme);
        }
        AbstractC18619k.m19974a(c18618j, i10, colorStateListM19970a, theme);
        return colorStateListM19970a;
    }

    /* JADX INFO: renamed from: d */
    public static Executor m19557d(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? AbstractC17802c.m19553a(context) : new ExecutorC1912f(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: e */
    public static void m19558e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            AbstractC17801b.m19551b(context, broadcastReceiver, intentFilter, 2);
        } else if (i10 >= 26) {
            AbstractC17801b.m19550a(context, broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
