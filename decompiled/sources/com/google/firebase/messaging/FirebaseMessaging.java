package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A.C0083q0;
import p001A.C0099y0;
import p001A.C0100z;
import p009A7.ThreadFactoryC0394d;
import p1037ub.InterfaceC20182b;
import p1060v9.AbstractC20502t;
import p1104xb.InterfaceC21170a;
import p110E4.C2307e;
import p1125yb.InterfaceC21398d;
import p117Eb.C2364B;
import p117Eb.C2380j;
import p117Eb.C2381k;
import p117Eb.C2382l;
import p117Eb.C2384n;
import p117Eb.C2388r;
import p117Eb.C2393w;
import p117Eb.RunnableC2394x;
import p127El.ExecutorC2575a;
import p523V9.AbstractC7845A4;
import p523V9.AbstractC7853B4;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC7861C4;
import p615Z6.C10252z0;
import p692d0.C12966e;
import p720e6.C13287b;
import p746fa.C13606o;
import p832jb.C16187g;
import p852kb.InterfaceC16365a;
import p985r9.C18892b;
import p985r9.C18894d;
import p985r9.C18902l;
import p985r9.C18903m;
import p985r9.ExecutorC18898h;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: k */
    public static C13287b f36849k;

    /* JADX INFO: renamed from: m */
    public static ScheduledThreadPoolExecutor f36851m;

    /* JADX INFO: renamed from: a */
    public final C16187g f36852a;

    /* JADX INFO: renamed from: b */
    public final Context f36853b;

    /* JADX INFO: renamed from: c */
    public final C10252z0 f36854c;

    /* JADX INFO: renamed from: d */
    public final C2380j f36855d;

    /* JADX INFO: renamed from: e */
    public final C2307e f36856e;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f36857f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f36858g;

    /* JADX INFO: renamed from: h */
    public final C2388r f36859h;

    /* JADX INFO: renamed from: i */
    public boolean f36860i;

    /* JADX INFO: renamed from: j */
    public static final long f36848j = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: l */
    public static InterfaceC21170a f36850l = new C2382l(0);

    public FirebaseMessaging(C16187g c16187g, InterfaceC21170a interfaceC21170a, InterfaceC21170a interfaceC21170a2, InterfaceC21398d interfaceC21398d, InterfaceC21170a interfaceC21170a3, InterfaceC20182b interfaceC20182b) {
        final int i10 = 0;
        final int i11 = 1;
        c16187g.m17794a();
        Context context = c16187g.f50235a;
        final C2388r c2388r = new C2388r();
        c2388r.f7420b = 0;
        c2388r.f7421c = context;
        c16187g.m17794a();
        C18892b c18892b = new C18892b(c16187g.f50235a);
        final C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30454Y = c16187g;
        c10252z0.f30455Z = c2388r;
        c10252z0.f30456o0 = c18892b;
        c10252z0.f30457p0 = interfaceC21170a;
        c10252z0.f30458q0 = interfaceC21170a2;
        c10252z0.f30459r0 = interfaceC21398d;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0394d("Firebase-Messaging-Task", 1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0394d("Firebase-Messaging-Init", 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0394d("Firebase-Messaging-File-Io", 1));
        this.f36860i = false;
        f36850l = interfaceC21170a3;
        this.f36852a = c16187g;
        this.f36856e = new C2307e(this, interfaceC20182b);
        c16187g.m17794a();
        final Context context2 = c16187g.f50235a;
        this.f36853b = context2;
        C2381k c2381k = new C2381k();
        this.f36859h = c2388r;
        this.f36854c = c10252z0;
        this.f36855d = new C2380j(executorServiceNewSingleThreadExecutor);
        this.f36857f = scheduledThreadPoolExecutor;
        this.f36858g = threadPoolExecutor;
        c16187g.m17794a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c2381k);
        } else {
            AbstractC15256t.m16482t("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: Eb.m

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ FirebaseMessaging f7410Z;

            {
                this.f7410Z = this;
            }

            /* JADX INFO: renamed from: a */
            private final void m3480a() {
                FirebaseMessaging firebaseMessaging = this.f7410Z;
                if (firebaseMessaging.f36856e.m3402n() && firebaseMessaging.m13713i(firebaseMessaging.m13708d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.f36860i) {
                            firebaseMessaging.m13712h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13606o c13606oM8116d;
                int i12;
                switch (i10) {
                    case 0:
                        m3480a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f7410Z;
                        Context context3 = firebaseMessaging.f36853b;
                        AbstractC7853B4.m8111c(context3);
                        boolean zM13711g = firebaseMessaging.m13711g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesM8134b = AbstractC7861C4.m8134b(context3);
                            if (!sharedPreferencesM8134b.contains("proxy_retention") || sharedPreferencesM8134b.getBoolean("proxy_retention", false) != zM13711g) {
                                C18892b c18892b2 = (C18892b) firebaseMessaging.f36854c.f30456o0;
                                if (c18892b2.f60233c.m12899h() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zM13711g);
                                    C18903m c18903mM20216n = C18903m.m20216n(c18892b2.f60232b);
                                    synchronized (c18903mM20216n) {
                                        i12 = c18903mM20216n.f60267a;
                                        c18903mM20216n.f60267a = i12 + 1;
                                    }
                                    c13606oM8116d = c18903mM20216n.m20230o(new C18902l(i12, 4, bundle, 0));
                                } else {
                                    c13606oM8116d = AbstractC7854B5.m8116d(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c13606oM8116d.m15126e(new ExecutorC2575a(1), new C0099y0(context3, zM13711g, 2));
                            }
                        }
                        if (firebaseMessaging.m13711g()) {
                            firebaseMessaging.m13709e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0394d("Firebase-Messaging-Topics-Io", 1));
        int i12 = C2364B.f7338j;
        AbstractC7854B5.m8115c(scheduledThreadPoolExecutor2, new Callable() { // from class: Eb.A
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2396z c2396z;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C2388r c2388r2 = c2388r;
                C10252z0 c10252z1 = c10252z0;
                synchronized (C2396z.class) {
                    try {
                        WeakReference weakReference = C2396z.f7454d;
                        c2396z = weakReference != null ? (C2396z) weakReference.get() : null;
                        if (c2396z == null) {
                            C2396z c2396z2 = new C2396z(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            c2396z2.m3574b();
                            C2396z.f7454d = new WeakReference(c2396z2);
                            c2396z = c2396z2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new C2364B(firebaseMessaging, c2388r2, c2396z, c10252z1, context3, scheduledThreadPoolExecutor3);
            }
        }).m15126e(scheduledThreadPoolExecutor, new C2384n(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: Eb.m

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ FirebaseMessaging f7410Z;

            {
                this.f7410Z = this;
            }

            /* JADX INFO: renamed from: a */
            private final void m3480a() {
                FirebaseMessaging firebaseMessaging = this.f7410Z;
                if (firebaseMessaging.f36856e.m3402n() && firebaseMessaging.m13713i(firebaseMessaging.m13708d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.f36860i) {
                            firebaseMessaging.m13712h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13606o c13606oM8116d;
                int i13;
                switch (i11) {
                    case 0:
                        m3480a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f7410Z;
                        Context context3 = firebaseMessaging.f36853b;
                        AbstractC7853B4.m8111c(context3);
                        boolean zM13711g = firebaseMessaging.m13711g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesM8134b = AbstractC7861C4.m8134b(context3);
                            if (!sharedPreferencesM8134b.contains("proxy_retention") || sharedPreferencesM8134b.getBoolean("proxy_retention", false) != zM13711g) {
                                C18892b c18892b2 = (C18892b) firebaseMessaging.f36854c.f30456o0;
                                if (c18892b2.f60233c.m12899h() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zM13711g);
                                    C18903m c18903mM20216n = C18903m.m20216n(c18892b2.f60232b);
                                    synchronized (c18903mM20216n) {
                                        i13 = c18903mM20216n.f60267a;
                                        c18903mM20216n.f60267a = i13 + 1;
                                    }
                                    c13606oM8116d = c18903mM20216n.m20230o(new C18902l(i13, 4, bundle, 0));
                                } else {
                                    c13606oM8116d = AbstractC7854B5.m8116d(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c13606oM8116d.m15126e(new ExecutorC2575a(1), new C0099y0(context3, zM13711g, 2));
                            }
                        }
                        if (firebaseMessaging.m13711g()) {
                            firebaseMessaging.m13709e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m13705b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36851m == null) {
                    f36851m = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0394d("TAG", 1));
                }
                f36851m.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C13287b m13706c(Context context) {
        try {
            if (f36849k == null) {
                f36849k = new C13287b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f36849k;
    }

    public static synchronized FirebaseMessaging getInstance(C16187g c16187g) {
        FirebaseMessaging firebaseMessaging;
        c16187g.m17794a();
        firebaseMessaging = (FirebaseMessaging) c16187g.f50238d.mo12555a(FirebaseMessaging.class);
        AbstractC20502t.m21158i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX INFO: renamed from: a */
    public final String m13707a() {
        C13606o c13606oM15128g;
        C2393w c2393wM13708d = m13708d();
        if (!m13713i(c2393wM13708d)) {
            return c2393wM13708d.f7442a;
        }
        String strM3487d = C2388r.m3487d(this.f36852a);
        C2380j c2380j = this.f36855d;
        synchronized (c2380j) {
            c13606oM15128g = (C13606o) ((C12966e) c2380j.f7406b).get(strM3487d);
            if (c13606oM15128g == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strM3487d);
                }
                C10252z0 c10252z0 = this.f36854c;
                c13606oM15128g = c10252z0.m10858w(c10252z0.m10835W(C2388r.m3487d((C16187g) c10252z0.f30454Y), Separators.STAR, new Bundle())).m15133l(this.f36858g, new C0083q0(this, strM3487d, c2393wM13708d, 1)).m15128g((ExecutorService) c2380j.f7405a, new C0100z(c2380j, 9, strM3487d));
                ((C12966e) c2380j.f7406b).put(strM3487d, c13606oM15128g);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strM3487d);
            }
        }
        try {
            return (String) AbstractC7854B5.m8113a(c13606oM15128g);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2393w m13708d() {
        C2393w c2393wM3570b;
        C13287b c13287bM13706c = m13706c(this.f36853b);
        C16187g c16187g = this.f36852a;
        c16187g.m17794a();
        String strM17795c = "[DEFAULT]".equals(c16187g.f50236b) ? "" : c16187g.m17795c();
        String strM3487d = C2388r.m3487d(this.f36852a);
        synchronized (c13287bM13706c) {
            c2393wM3570b = C2393w.m3570b(((SharedPreferences) c13287bM13706c.f42000Z).getString(strM17795c + "|T|" + strM3487d + "|*", null));
        }
        return c2393wM3570b;
    }

    /* JADX INFO: renamed from: e */
    public final void m13709e() {
        C13606o c13606oM8116d;
        int i10;
        C18892b c18892b = (C18892b) this.f36854c.f30456o0;
        if (c18892b.f60233c.m12899h() >= 241100000) {
            C18903m c18903mM20216n = C18903m.m20216n(c18892b.f60232b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c18903mM20216n) {
                i10 = c18903mM20216n.f60267a;
                c18903mM20216n.f60267a = i10 + 1;
            }
            c13606oM8116d = c18903mM20216n.m20230o(new C18902l(i10, 5, bundle, 1)).m15127f(ExecutorC18898h.f60246o0, C18894d.f60240o0);
        } else {
            c13606oM8116d = AbstractC7854B5.m8116d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        c13606oM8116d.m15126e(this.f36857f, new C2384n(this, 1));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m13710f(boolean z6) {
        this.f36860i = z6;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m13711g() {
        Context context = this.f36853b;
        AbstractC7853B4.m8111c(context);
        if (!(Build.VERSION.SDK_INT >= 29)) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            AbstractC15256t.m16465c("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "GMS core is set for proxying");
        }
        C16187g c16187g = this.f36852a;
        c16187g.m17794a();
        if (c16187g.f50238d.mo12555a(InterfaceC16365a.class) != null) {
            return true;
        }
        return AbstractC7845A4.m8093a() && f36850l != null;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m13712h(long j10) {
        m13705b(new RunnableC2394x(this, Math.min(Math.max(30L, 2 * j10), f36848j)), j10);
        this.f36860i = true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13713i(C2393w c2393w) {
        if (c2393w != null) {
            String strM3494b = this.f36859h.m3494b();
            if (System.currentTimeMillis() <= c2393w.f7444c + C2393w.f7441d && strM3494b.equals(c2393w.f7443b)) {
                return false;
            }
        }
        return true;
    }
}
