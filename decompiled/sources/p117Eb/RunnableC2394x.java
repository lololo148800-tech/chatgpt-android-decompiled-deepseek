package p117Eb;

import android.javax.sip.C10808o;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p009A7.ThreadFactoryC0394d;
import p1009s9.C19506i;
import p109E3.C2285i;
import p301M.RunnableC5228j;
import p501Ub.EnumC7610l;
import p523V9.C8058c0;
import p523V9.C8177r;
import p523V9.C8225x;
import p523V9.C8232x6;
import p523V9.EnumC7909I4;
import p571X9.C9173M4;
import p571X9.C9192Q;
import p571X9.C9299i;
import p571X9.C9323m;
import p571X9.EnumC9369t3;
import p594Y9.C9788P4;
import p594Y9.C9891g0;
import p594Y9.C9896h;
import p594Y9.C9920l;
import p594Y9.EnumC9972t3;
import p604Yk.C10077b;

/* JADX INFO: renamed from: Eb.x */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2394x implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7445Y;

    /* JADX INFO: renamed from: Z */
    public final long f7446Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f7447o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f7448p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f7449q0;

    public /* synthetic */ RunnableC2394x(C8232x6 c8232x6, C8058c0 c8058c0, long j10, C10808o c10808o) {
        this.f7445Y = 1;
        EnumC7909I4 enumC7909I4 = EnumC7909I4.UNKNOWN_EVENT;
        this.f7447o0 = c8232x6;
        this.f7448p0 = c8058c0;
        this.f7446Z = j10;
        this.f7449q0 = c10808o;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3571a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f7448p0).f36853b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: b */
    public boolean m3572b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f7448p0).m13707a() == null) {
                AbstractC15256t.m16465c("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                AbstractC15256t.m16482t("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            AbstractC15256t.m16482t("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            AbstractC15256t.m16482t("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7445Y) {
            case 0:
                C2391u c2391uM3503y = C2391u.m3503y();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f7448p0;
                boolean zM3505B = c2391uM3503y.m3505B(firebaseMessaging.f36853b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f7447o0;
                if (zM3505B) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f36860i = true;
                        }
                        if (!firebaseMessaging.f36859h.m3498j()) {
                            firebaseMessaging.m13710f(false);
                            if (!C2391u.m3503y().m3505B(firebaseMessaging.f36853b)) {
                                return;
                            }
                        } else if (!C2391u.m3503y().m3504A(firebaseMessaging.f36853b) || m3571a()) {
                            if (m3572b()) {
                                firebaseMessaging.m13710f(false);
                            } else {
                                firebaseMessaging.m13712h(this.f7446Z);
                            }
                            if (!C2391u.m3503y().m3505B(firebaseMessaging.f36853b)) {
                                return;
                            }
                        } else {
                            C2285i c2285i = new C2285i();
                            c2285i.f7061b = this;
                            c2285i.m3378a();
                            if (!C2391u.m3503y().m3505B(firebaseMessaging.f36853b)) {
                                return;
                            }
                        }
                    } catch (IOException e10) {
                        AbstractC15256t.m16465c("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.m13710f(false);
                        if (!C2391u.m3503y().m3505B(firebaseMessaging.f36853b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (C2391u.m3503y().m3505B(firebaseMessaging.f36853b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
            case 1:
                C8232x6 c8232x6 = (C8232x6) this.f7447o0;
                HashMap map = c8232x6.f25709j;
                EnumC7909I4 enumC7909I4 = EnumC7909I4.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                if (!map.containsKey(enumC7909I4)) {
                    C8225x c8225x = new C8225x();
                    C8177r c8177r = new C8177r();
                    if (!c8225x.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    c8177r.f25620o0 = c8225x;
                    map.put(enumC7909I4, c8177r);
                }
                C8177r c8177r2 = (C8177r) map.get(enumC7909I4);
                Long lValueOf = Long.valueOf(this.f7446Z);
                C8225x c8225x2 = c8177r2.f25620o0;
                C8058c0 c8058c0 = (C8058c0) this.f7448p0;
                Collection collection = (Collection) c8225x2.get(c8058c0);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c8225x2.put(c8058c0, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (c8232x6.m8872d(enumC7909I4, jElapsedRealtime)) {
                    c8232x6.f25708i.put(enumC7909I4, Long.valueOf(jElapsedRealtime));
                    EnumC7610l.f24056Y.execute(new RunnableC5228j(c8232x6, (C10808o) this.f7449q0));
                    return;
                }
                return;
            case 2:
                C9173M4 c9173m4 = (C9173M4) this.f7447o0;
                HashMap map2 = c9173m4.f27962j;
                EnumC9369t3 enumC9369t3 = EnumC9369t3.AGGREGATED_ON_DEVICE_FACE_DETECTION;
                if (!map2.containsKey(enumC9369t3)) {
                    C9323m c9323m = new C9323m();
                    C9299i c9299i = new C9299i();
                    if (!c9323m.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    c9299i.f28088o0 = c9323m;
                    map2.put(enumC9369t3, c9299i);
                }
                C9299i c9299i2 = (C9299i) map2.get(enumC9369t3);
                Long lValueOf2 = Long.valueOf(this.f7446Z);
                C9323m c9323m2 = c9299i2.f28088o0;
                C9192Q c9192q = (C9192Q) this.f7448p0;
                Collection collection2 = (Collection) c9323m2.get(c9192q);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(lValueOf2)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c9299i2.f28089p0++;
                    c9323m2.put(c9192q, arrayList2);
                } else if (collection2.add(lValueOf2)) {
                    c9299i2.f28089p0++;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (c9173m4.m9728d(enumC9369t3, jElapsedRealtime2)) {
                    c9173m4.f27961i.put(enumC9369t3, Long.valueOf(jElapsedRealtime2));
                    EnumC7610l.f24056Y.execute(new RunnableC5228j(c9173m4, 16, (C19506i) this.f7449q0));
                    return;
                }
                return;
            default:
                C9788P4 c9788p4 = (C9788P4) this.f7447o0;
                HashMap map3 = c9788p4.f29310j;
                EnumC9972t3 enumC9972t3 = EnumC9972t3.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
                if (!map3.containsKey(enumC9972t3)) {
                    C9920l c9920l = new C9920l();
                    C9896h c9896h = new C9896h();
                    if (!c9920l.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    c9896h.f29410o0 = c9920l;
                    map3.put(enumC9972t3, c9896h);
                }
                C9896h c9896h2 = (C9896h) map3.get(enumC9972t3);
                Long lValueOf3 = Long.valueOf(this.f7446Z);
                C9920l c9920l2 = c9896h2.f29410o0;
                C9891g0 c9891g0 = (C9891g0) this.f7448p0;
                Collection collection3 = (Collection) c9920l2.get(c9891g0);
                if (collection3 == null) {
                    ArrayList arrayList3 = new ArrayList(3);
                    if (!arrayList3.add(lValueOf3)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c9896h2.f29411p0++;
                    c9920l2.put(c9891g0, arrayList3);
                } else if (collection3.add(lValueOf3)) {
                    c9896h2.f29411p0++;
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                if (c9788p4.m10406d(enumC9972t3, jElapsedRealtime3)) {
                    c9788p4.f29309i.put(enumC9972t3, Long.valueOf(jElapsedRealtime3));
                    EnumC7610l.f24056Y.execute(new RunnableC5228j(c9788p4, 17, (C10077b) this.f7449q0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC2394x(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f7445Y = i10;
        this.f7447o0 = obj;
        this.f7448p0 = obj2;
        this.f7446Z = j10;
        this.f7449q0 = obj3;
    }

    public RunnableC2394x(FirebaseMessaging firebaseMessaging, long j10) {
        this.f7445Y = 0;
        this.f7449q0 = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0394d("firebase-iid-executor", 1));
        this.f7448p0 = firebaseMessaging;
        this.f7446Z = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f36853b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f7447o0 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
