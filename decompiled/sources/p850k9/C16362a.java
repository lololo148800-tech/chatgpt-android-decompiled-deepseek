package p850k9;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.WebrtcBuildVersion;
import p031B3.C0805i;
import p037B9.C0850a;
import p1009s9.C19503f;
import p1009s9.C19504g;
import p1009s9.ServiceConnectionC19498a;
import p1060v9.AbstractC20502t;
import p110E4.C2313k;
import p286L9.AbstractBinderC4965c;
import p286L9.AbstractC4963a;
import p286L9.C4964b;
import p286L9.InterfaceC4966d;

/* JADX INFO: renamed from: k9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16362a {

    /* JADX INFO: renamed from: a */
    public ServiceConnectionC19498a f50818a;

    /* JADX INFO: renamed from: b */
    public InterfaceC4966d f50819b;

    /* JADX INFO: renamed from: c */
    public boolean f50820c;

    /* JADX INFO: renamed from: d */
    public final Object f50821d = new Object();

    /* JADX INFO: renamed from: e */
    public C16363b f50822e;

    /* JADX INFO: renamed from: f */
    public final Context f50823f;

    /* JADX INFO: renamed from: g */
    public final long f50824g;

    public C16362a(Application application) {
        AbstractC20502t.m21157h(application);
        Context applicationContext = application.getApplicationContext();
        this.f50823f = applicationContext != null ? applicationContext : application;
        this.f50820c = false;
        this.f50824g = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static C2313k m17965a(Application application) {
        C16362a c16362a = new C16362a(application);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c16362a.m17969d();
            C2313k c2313kM17967b = c16362a.m17967b();
            m17966e(c2313kM17967b, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            c16362a.m17968c();
            return c2313kM17967b;
        } catch (Throwable th2) {
            try {
                m17966e(null, -1L, th2);
                throw th2;
            } catch (Throwable th3) {
                c16362a.m17968c();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17966e(C2313k c2313k, long j10, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c2313k != null) {
                map.put("limit_ad_tracking", true != c2313k.f7194b ? WebrtcBuildVersion.maint_version : "1");
                String str = c2313k.f7195c;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put(ParameterNames.TAG, "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j10));
            new C0805i(map, 5).start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2313k m17967b() {
        C2313k c2313k;
        AbstractC20502t.m21156g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f50820c) {
                    synchronized (this.f50821d) {
                        C16363b c16363b = this.f50822e;
                        if (c16363b == null || !c16363b.f50828p0) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m17969d();
                        if (!this.f50820c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                AbstractC20502t.m21157h(this.f50818a);
                AbstractC20502t.m21157h(this.f50819b);
                try {
                    C4964b c4964b = (C4964b) this.f50819b;
                    c4964b.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z6 = true;
                    Parcel parcelM5609d = c4964b.m5609d(parcelObtain, 1);
                    String string = parcelM5609d.readString();
                    parcelM5609d.recycle();
                    C4964b c4964b2 = (C4964b) this.f50819b;
                    c4964b2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = AbstractC4963a.f16192a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM5609d2 = c4964b2.m5609d(parcelObtain2, 2);
                    if (parcelM5609d2.readInt() == 0) {
                        z6 = false;
                    }
                    parcelM5609d2.recycle();
                    c2313k = new C2313k(string, z6, 2);
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m17970f();
        return c2313k;
    }

    /* JADX INFO: renamed from: c */
    public final void m17968c() {
        AbstractC20502t.m21156g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f50823f == null || this.f50818a == null) {
                    return;
                }
                try {
                    if (this.f50820c) {
                        C0850a.m1909a().m1910b(this.f50823f, this.f50818a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f50820c = false;
                this.f50819b = null;
                this.f50818a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17969d() {
        AbstractC20502t.m21156g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f50820c) {
                    m17968c();
                }
                Context context = this.f50823f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM20602c = C19503f.f61952b.m20602c(context, 12451000);
                    if (iM20602c != 0 && iM20602c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC19498a serviceConnectionC19498a = new ServiceConnectionC19498a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C0850a.m1909a().m1911c(context, context.getClass().getName(), intent, serviceConnectionC19498a, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f50818a = serviceConnectionC19498a;
                        try {
                            IBinder iBinderM20592a = serviceConnectionC19498a.m20592a(TimeUnit.MILLISECONDS);
                            int i10 = AbstractBinderC4965c.f16194a;
                            IInterface iInterfaceQueryLocalInterface = iBinderM20592a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f50819b = iInterfaceQueryLocalInterface instanceof InterfaceC4966d ? (InterfaceC4966d) iInterfaceQueryLocalInterface : new C4964b(iBinderM20592a);
                            this.f50820c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } catch (Throwable th3) {
                        throw new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C19504g();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17970f() {
        synchronized (this.f50821d) {
            C16363b c16363b = this.f50822e;
            if (c16363b != null) {
                c16363b.f50827o0.countDown();
                try {
                    this.f50822e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f50824g;
            if (j10 > 0) {
                this.f50822e = new C16363b(this, j10);
            }
        }
    }

    public final void finalize() throws Throwable {
        m17968c();
        super.finalize();
    }
}
