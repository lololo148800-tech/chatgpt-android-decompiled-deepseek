package p037B9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.android.core.AbstractC15256t;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p1060v9.AbstractC20502t;
import p1060v9.ServiceConnectionC20479B;
import p115E9.C2361c;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: B9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0850a {

    /* JADX INFO: renamed from: b */
    public static final Object f2362b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile C0850a f2363c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f2364a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static C0850a m1909a() {
        if (f2363c == null) {
            synchronized (f2362b) {
                try {
                    if (f2363c == null) {
                        f2363c = new C0850a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C0850a c0850a = f2363c;
        AbstractC20502t.m21157h(c0850a);
        return c0850a;
    }

    /* JADX INFO: renamed from: b */
    public final void m1910b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ServiceConnectionC20479B)) {
            ConcurrentHashMap concurrentHashMap = this.f2364a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1911c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C2361c.m3449a(context).f7317Y.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    AbstractC15256t.m16482t("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof ServiceConnectionC20479B) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f2364a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            AbstractC15256t.m16482t("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th2) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th2;
        }
    }
}
