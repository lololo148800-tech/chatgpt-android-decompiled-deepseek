package p117Eb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p001A.C0072l;
import p724ea.C13354a;

/* JADX INFO: renamed from: Eb.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2367E {

    /* JADX INFO: renamed from: a */
    public static final long f7357a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    public static final Object f7358b = new Object();

    /* JADX INFO: renamed from: c */
    public static C13354a f7359c;

    /* JADX INFO: renamed from: a */
    public static void m3464a(Context context) {
        if (f7359c == null) {
            C13354a c13354a = new C13354a(context);
            f7359c = c13354a;
            synchronized (c13354a.f42379a) {
                c13354a.f42385g = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3465b(Intent intent) {
        synchronized (f7358b) {
            try {
                if (f7359c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f7359c.m14943c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3466c(Context context, ServiceConnectionC2370H serviceConnectionC2370H, Intent intent) {
        synchronized (f7358b) {
            try {
                m3464a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f7359c.m14941a(f7357a);
                }
                serviceConnectionC2370H.m3470b(intent).m15122a(new C0072l(intent, 22));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static ComponentName m3467d(Context context, Intent intent) {
        synchronized (f7358b) {
            try {
                m3464a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f7359c.m14941a(f7357a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
