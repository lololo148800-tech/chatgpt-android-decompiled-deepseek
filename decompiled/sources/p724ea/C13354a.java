package p724ea;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.EnumC15375i1;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p003A1.RunnableC0153B;
import p025An.C0644w;
import p063C9.AbstractC1617c;
import p063C9.AbstractC1618d;
import p063C9.C1615a;
import p1060v9.AbstractC20502t;
import p115E9.C2361c;
import p617Z9.C10261a;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: ea.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13354a {

    /* JADX INFO: renamed from: n */
    public static final long f42376n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o */
    public static volatile ScheduledExecutorService f42377o = null;

    /* JADX INFO: renamed from: p */
    public static final Object f42378p = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f42379a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f42380b;

    /* JADX INFO: renamed from: c */
    public int f42381c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f42382d;

    /* JADX INFO: renamed from: e */
    public long f42383e;

    /* JADX INFO: renamed from: f */
    public final HashSet f42384f;

    /* JADX INFO: renamed from: g */
    public boolean f42385g;

    /* JADX INFO: renamed from: h */
    public C10261a f42386h;

    /* JADX INFO: renamed from: i */
    public final C1615a f42387i;

    /* JADX INFO: renamed from: j */
    public final String f42388j;

    /* JADX INFO: renamed from: k */
    public final HashMap f42389k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f42390l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f42391m;

    public C13354a(Context context) {
        WorkSource workSource;
        String packageName = context.getPackageName();
        this.f42379a = new Object();
        this.f42381c = 0;
        this.f42384f = new HashSet();
        this.f42385g = true;
        this.f42387i = C1615a.f4568a;
        this.f42389k = new HashMap();
        this.f42390l = new AtomicInteger(0);
        AbstractC20502t.m21154e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f42386h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f42388j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f42388j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C0644w(sb2.toString());
        }
        this.f42380b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (AbstractC1618d.m2474a(context)) {
            int i10 = AbstractC1617c.f4576a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() == null || packageName == null) {
                workSource = null;
            } else {
                try {
                    ApplicationInfo applicationInfo = C2361c.m3449a(context).f7317Y.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        AbstractC15256t.m16465c("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        workSource = null;
                    } else {
                        int i11 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method = AbstractC1618d.f4578b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i11), packageName);
                            } catch (Exception e10) {
                                AbstractC15256t.m16485w("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method2 = AbstractC1618d.f4577a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i11));
                                } catch (Exception e11) {
                                    AbstractC15256t.m16485w("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    AbstractC15256t.m16465c("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f42380b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    String string = e12.toString();
                    AbstractC15256t.m16463a("WakeLock", EnumC15375i1.ERROR, string, null);
                    Log.wtf("WakeLock", string);
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f42377o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f42378p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f42377o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f42377o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f42391m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m14941a(long j10) {
        this.f42390l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f42376n), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f42379a) {
            try {
                if (!m14942b()) {
                    this.f42386h = C10261a.f30477Y;
                    this.f42380b.acquire();
                    this.f42387i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f42381c++;
                if (this.f42385g) {
                    TextUtils.isEmpty(null);
                }
                C13355b c13355b = (C13355b) this.f42389k.get(null);
                if (c13355b == null) {
                    c13355b = new C13355b();
                    this.f42389k.put(null, c13355b);
                }
                c13355b.f42392a++;
                this.f42387i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f42383e) {
                    this.f42383e = j11;
                    ScheduledFuture scheduledFuture = this.f42382d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f42382d = this.f42391m.schedule(new RunnableC0153B(this, 17), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14942b() {
        boolean z6;
        synchronized (this.f42379a) {
            z6 = this.f42381c > 0;
        }
        return z6;
    }

    /* JADX INFO: renamed from: c */
    public final void m14943c() {
        if (this.f42390l.decrementAndGet() < 0) {
            AbstractC15256t.m16465c("WakeLock", String.valueOf(this.f42388j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f42379a) {
            try {
                if (this.f42385g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f42389k.containsKey(null)) {
                    C13355b c13355b = (C13355b) this.f42389k.get(null);
                    if (c13355b != null) {
                        int i10 = c13355b.f42392a - 1;
                        c13355b.f42392a = i10;
                        if (i10 == 0) {
                            this.f42389k.remove(null);
                        }
                    }
                } else {
                    AbstractC15256t.m16482t("WakeLock", String.valueOf(this.f42388j).concat(" counter does not exist"));
                }
                m14945e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14944d() {
        HashSet hashSet = this.f42384f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() > 0) {
            throw AbstractC14376f.m15860z(0, arrayList);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14945e() {
        synchronized (this.f42379a) {
            try {
                if (m14942b()) {
                    if (this.f42385g) {
                        int i10 = this.f42381c - 1;
                        this.f42381c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f42381c = 0;
                    }
                    m14944d();
                    Iterator it = this.f42389k.values().iterator();
                    while (it.hasNext()) {
                        ((C13355b) it.next()).f42392a = 0;
                    }
                    this.f42389k.clear();
                    ScheduledFuture scheduledFuture = this.f42382d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f42382d = null;
                        this.f42383e = 0L;
                    }
                    if (this.f42380b.isHeld()) {
                        try {
                            try {
                                this.f42380b.release();
                                if (this.f42386h != null) {
                                    this.f42386h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                AbstractC15256t.m16466d("WakeLock", String.valueOf(this.f42388j).concat(" failed to release!"), e10);
                                if (this.f42386h != null) {
                                    this.f42386h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f42386h != null) {
                                this.f42386h = null;
                            }
                            throw th2;
                        }
                    } else {
                        AbstractC15256t.m16465c("WakeLock", String.valueOf(this.f42388j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
