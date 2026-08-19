package p1060v9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import p037B9.C0850a;
import p377P9.HandlerC6378d;

/* JADX INFO: renamed from: v9.D */
/* JADX INFO: loaded from: classes.dex */
public final class C20481D {

    /* JADX INFO: renamed from: g */
    public static final Object f65019g = new Object();

    /* JADX INFO: renamed from: h */
    public static C20481D f65020h;

    /* JADX INFO: renamed from: i */
    public static HandlerThread f65021i;

    /* JADX INFO: renamed from: a */
    public final HashMap f65022a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f65023b;

    /* JADX INFO: renamed from: c */
    public volatile HandlerC6378d f65024c;

    /* JADX INFO: renamed from: d */
    public final C0850a f65025d;

    /* JADX INFO: renamed from: e */
    public final long f65026e;

    /* JADX INFO: renamed from: f */
    public final long f65027f;

    public C20481D(Context context, Looper looper) {
        C20480C c20480c = new C20480C(this);
        this.f65023b = context.getApplicationContext();
        HandlerC6378d handlerC6378d = new HandlerC6378d(looper, c20480c);
        Looper.getMainLooper();
        this.f65024c = handlerC6378d;
        this.f65025d = C0850a.m1909a();
        this.f65026e = 5000L;
        this.f65027f = 300000L;
    }

    /* JADX INFO: renamed from: a */
    public static HandlerThread m21129a() {
        synchronized (f65019g) {
            try {
                HandlerThread handlerThread = f65021i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f65021i = handlerThread2;
                handlerThread2.start();
                return f65021i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21130b(String str, ServiceConnection serviceConnection, boolean z6) {
        C20478A c20478a = new C20478A(str, z6);
        AbstractC20502t.m21158i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f65022a) {
            try {
                ServiceConnectionC20479B serviceConnectionC20479B = (ServiceConnectionC20479B) this.f65022a.get(c20478a);
                if (serviceConnectionC20479B == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c20478a.toString()));
                }
                if (!serviceConnectionC20479B.f65011a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c20478a.toString()));
                }
                serviceConnectionC20479B.f65011a.remove(serviceConnection);
                if (serviceConnectionC20479B.f65011a.isEmpty()) {
                    this.f65024c.sendMessageDelayed(this.f65024c.obtainMessage(0, c20478a), this.f65026e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21131c(C20478A c20478a, ServiceConnectionC20505w serviceConnectionC20505w, String str) {
        boolean z6;
        synchronized (this.f65022a) {
            try {
                ServiceConnectionC20479B serviceConnectionC20479B = (ServiceConnectionC20479B) this.f65022a.get(c20478a);
                if (serviceConnectionC20479B == null) {
                    serviceConnectionC20479B = new ServiceConnectionC20479B(this, c20478a);
                    serviceConnectionC20479B.f65011a.put(serviceConnectionC20505w, serviceConnectionC20505w);
                    serviceConnectionC20479B.m21128a(str, null);
                    this.f65022a.put(c20478a, serviceConnectionC20479B);
                } else {
                    this.f65024c.removeMessages(0, c20478a);
                    if (serviceConnectionC20479B.f65011a.containsKey(serviceConnectionC20505w)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c20478a.toString()));
                    }
                    serviceConnectionC20479B.f65011a.put(serviceConnectionC20505w, serviceConnectionC20505w);
                    int i10 = serviceConnectionC20479B.f65012b;
                    if (i10 == 1) {
                        serviceConnectionC20505w.onServiceConnected(serviceConnectionC20479B.f65016f, serviceConnectionC20479B.f65014d);
                    } else if (i10 == 2) {
                        serviceConnectionC20479B.m21128a(str, null);
                    }
                }
                z6 = serviceConnectionC20479B.f65013c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }
}
