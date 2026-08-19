package p117Eb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A.C0072l;
import p001A.RunnableC0000A;
import p037B9.C0850a;
import p746fa.C13606o;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: renamed from: Eb.H */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2370H implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f7363a;

    /* JADX INFO: renamed from: b */
    public final Intent f7364b;

    /* JADX INFO: renamed from: c */
    public final ScheduledThreadPoolExecutor f7365c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f7366d;

    /* JADX INFO: renamed from: e */
    public BinderC2368F f7367e;

    /* JADX INFO: renamed from: f */
    public boolean f7368f;

    public ServiceConnectionC2370H(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7366d = new ArrayDeque();
        this.f7368f = false;
        Context applicationContext = context.getApplicationContext();
        this.f7363a = applicationContext;
        this.f7364b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f7365c = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3469a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f7366d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC2368F binderC2368F = this.f7367e;
                if (binderC2368F == null || !binderC2368F.isBinderAlive()) {
                    m3471c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f7367e.m3468a((C2369G) this.f7366d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C13606o m3470b(Intent intent) {
        C2369G c2369g;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c2369g = new C2369G(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f7365c;
            c2369g.f7362b.f42961a.m15123b(scheduledThreadPoolExecutor, new C0072l(scheduledThreadPoolExecutor.schedule(new RunnableC0000A(c2369g, 13), 20L, TimeUnit.SECONDS), 24));
            this.f7366d.add(c2369g);
            m3469a();
        } catch (Throwable th2) {
            throw th2;
        }
        return c2369g.f7362b.f42961a;
    }

    /* JADX INFO: renamed from: c */
    public final void m3471c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f7368f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f7368f) {
            return;
        }
        this.f7368f = true;
        try {
            C0850a c0850aM1909a = C0850a.m1909a();
            Context context = this.f7363a;
            if (c0850aM1909a.m1911c(context, context.getClass().getName(), this.f7364b, this, 65, null)) {
                return;
            } else {
                AbstractC15256t.m16465c("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f7366d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((C2369G) arrayDeque.poll()).f7362b.m15116d(null);
                }
            }
        } catch (SecurityException e10) {
            AbstractC15256t.m16466d("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f7368f = false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m3469a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(FpwNpGDhomXHZ.JAhaBVTUUA, 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f7368f = false;
            if (iBinder instanceof BinderC2368F) {
                this.f7367e = (BinderC2368F) iBinder;
                m3469a();
                return;
            }
            AbstractC15256t.m16465c("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f7366d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((C2369G) arrayDeque.poll()).f7362b.m15116d(null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
