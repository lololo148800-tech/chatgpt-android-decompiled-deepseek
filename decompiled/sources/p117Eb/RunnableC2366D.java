package p117Eb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;

/* JADX INFO: renamed from: Eb.D */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2366D implements Runnable {

    /* JADX INFO: renamed from: r0 */
    public static final Object f7349r0 = new Object();

    /* JADX INFO: renamed from: s0 */
    public static Boolean f7350s0;

    /* JADX INFO: renamed from: t0 */
    public static Boolean f7351t0;

    /* JADX INFO: renamed from: Y */
    public final Context f7352Y;

    /* JADX INFO: renamed from: Z */
    public final C2388r f7353Z;

    /* JADX INFO: renamed from: o0 */
    public final PowerManager.WakeLock f7354o0;

    /* JADX INFO: renamed from: p0 */
    public final C2364B f7355p0;

    /* JADX INFO: renamed from: q0 */
    public final long f7356q0;

    public RunnableC2366D(C2364B c2364b, Context context, C2388r c2388r, long j10) {
        this.f7355p0 = c2364b;
        this.f7352Y = context;
        this.f7356q0 = j10;
        this.f7353Z = c2388r;
        this.f7354o0 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3460a(Context context) {
        boolean zBooleanValue;
        synchronized (f7349r0) {
            try {
                Boolean bool = f7351t0;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m3461b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f7351t0 = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3461b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z6 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z6 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z6;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m3463d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f7352Y.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2364B c2364b = this.f7355p0;
        Context context = this.f7352Y;
        boolean zM3462c = m3462c(context);
        PowerManager.WakeLock wakeLock = this.f7354o0;
        if (zM3462c) {
            wakeLock.acquire(AbstractC2376f.f7391a);
        }
        try {
            c2364b.m3456f(true);
            if (!this.f7353Z.m3498j()) {
                c2364b.m3456f(false);
            } else if (m3460a(context) && !m3463d()) {
                new C2365C(this, this).m3459a();
            } else {
                if (c2364b.m3457g()) {
                    c2364b.m3456f(false);
                } else {
                    c2364b.m3458h(this.f7356q0);
                }
            }
        } catch (IOException e10) {
            AbstractC15256t.m16465c("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            c2364b.m3456f(false);
        } finally {
            if (m3462c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3462c(Context context) {
        boolean zBooleanValue;
        synchronized (f7349r0) {
            try {
                Boolean bool = f7350s0;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m3461b(context, HJrCuD.MqsYSc, bool) : bool.booleanValue());
                f7350s0 = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }
}
