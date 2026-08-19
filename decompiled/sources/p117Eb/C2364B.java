package p117Eb;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p523V9.AbstractC7854B5;
import p615Z6.C10252z0;
import p692d0.C12966e;
import p746fa.C13599h;
import p746fa.C13606o;

/* JADX INFO: renamed from: Eb.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2364B {

    /* JADX INFO: renamed from: i */
    public static final long f7337i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f7338j = 0;

    /* JADX INFO: renamed from: a */
    public final Context f7339a;

    /* JADX INFO: renamed from: b */
    public final C2388r f7340b;

    /* JADX INFO: renamed from: c */
    public final C10252z0 f7341c;

    /* JADX INFO: renamed from: d */
    public final FirebaseMessaging f7342d;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f7344f;

    /* JADX INFO: renamed from: h */
    public final C2396z f7346h;

    /* JADX INFO: renamed from: e */
    public final C12966e f7343e = new C12966e(0);

    /* JADX INFO: renamed from: g */
    public boolean f7345g = false;

    public C2364B(FirebaseMessaging firebaseMessaging, C2388r c2388r, C2396z c2396z, C10252z0 c10252z0, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f7342d = firebaseMessaging;
        this.f7340b = c2388r;
        this.f7346h = c2396z;
        this.f7341c = c10252z0;
        this.f7339a = context;
        this.f7344f = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m3451a(C13606o c13606o) throws IOException {
        try {
            AbstractC7854B5.m8114b(c13606o, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3452d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: renamed from: b */
    public final void m3453b(String str) throws IOException {
        String strM13707a = this.f7342d.m13707a();
        C10252z0 c10252z0 = this.f7341c;
        c10252z0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        m3451a(c10252z0.m10858w(c10252z0.m10835W(strM13707a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: c */
    public final void m3454c(String str) throws IOException {
        String strM13707a = this.f7342d.m13707a();
        C10252z0 c10252z0 = this.f7341c;
        c10252z0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        m3451a(c10252z0.m10858w(c10252z0.m10835W(strM13707a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: e */
    public final void m3455e(C2395y c2395y) {
        synchronized (this.f7343e) {
            try {
                String str = c2395y.f7453c;
                if (this.f7343e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f7343e.get(str);
                    C13599h c13599h = (C13599h) arrayDeque.poll();
                    if (c13599h != null) {
                        c13599h.m15114b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f7343e.remove(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m3456f(boolean z6) {
        this.f7345g = z6;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX INFO: renamed from: g */
    public final boolean m3457g() throws IOException {
        C2395y c2395yM3573a;
        byte b;
        while (true) {
            synchronized (this) {
                try {
                    c2395yM3573a = this.f7346h.m3573a();
                    if (c2395yM3573a == null) {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                String str = c2395yM3573a.f7452b;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals(TokenNames.f32020U)) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(TokenNames.f32018S)) {
                    b = 0;
                } else {
                    b = -1;
                }
                String str2 = c2395yM3573a.f7451a;
                if (b == 0) {
                    m3453b(str2);
                    if (m3452d()) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (b == 1) {
                    m3454c(str2);
                    if (m3452d()) {
                        Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                    }
                } else if (m3452d()) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + c2395yM3573a + Separators.DOT);
                }
                this.f7346h.m3575c(c2395yM3573a);
                m3455e(c2395yM3573a);
            } catch (IOException e10) {
                if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                    AbstractC15256t.m16465c("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    AbstractC15256t.m16465c("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
        if (m3452d()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m3458h(long j10) {
        long jMin = Math.min(Math.max(30L, 2 * j10), f7337i);
        this.f7344f.schedule(new RunnableC2366D(this, this.f7339a, this.f7340b, jMin), j10, TimeUnit.SECONDS);
        m3456f(true);
    }
}
