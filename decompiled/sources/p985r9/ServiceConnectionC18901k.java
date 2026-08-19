package p985r9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import io.sentry.android.core.RunnableC15195M;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p037B9.C0850a;
import p1060v9.AbstractC20502t;
import p109E3.C2292p;
import p189Ha.C3278l;
import p377P9.HandlerC6378d;
import p658b5.C11232c;

/* JADX INFO: renamed from: r9.k */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC18901k implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public int f60255a = 0;

    /* JADX INFO: renamed from: b */
    public final Messenger f60256b;

    /* JADX INFO: renamed from: c */
    public C11232c f60257c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f60258d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f60259e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C18903m f60260f;

    public ServiceConnectionC18901k(C18903m c18903m) {
        this.f60260f = c18903m;
        HandlerC6378d handlerC6378d = new HandlerC6378d(Looper.getMainLooper(), new C3278l(this, 1));
        Looper.getMainLooper();
        this.f60256b = new Messenger(handlerC6378d);
        this.f60258d = new ArrayDeque();
        this.f60259e = new SparseArray();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m20209a(int i10, String str) {
        m20210b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m20210b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f60255a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f60255a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f60255a = 4;
            C0850a.m1909a().m1910b((Context) this.f60260f.f60268b, this);
            C2292p c2292p = new C2292p(str, securityException);
            Iterator it = this.f60258d.iterator();
            while (it.hasNext()) {
                ((C18902l) it.next()).m20214b(c2292p);
            }
            this.f60258d.clear();
            for (int i11 = 0; i11 < this.f60259e.size(); i11++) {
                ((C18902l) this.f60259e.valueAt(i11)).m20214b(c2292p);
            }
            this.f60259e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m20211c() {
        try {
            if (this.f60255a == 2 && this.f60258d.isEmpty() && this.f60259e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f60255a = 3;
                C0850a.m1909a().m1910b((Context) this.f60260f.f60268b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m20212d(C18902l c18902l) {
        try {
            int i10 = this.f60255a;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f60258d.add(c18902l);
                    return true;
                }
                if (i10 != 2) {
                    return false;
                }
                this.f60258d.add(c18902l);
                ((ScheduledExecutorService) this.f60260f.f60269c).execute(new RunnableC18900j(this, 0));
                return true;
            }
            this.f60258d.add(c18902l);
            AbstractC20502t.m21160k(this.f60255a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f60255a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                C0850a c0850aM1909a = C0850a.m1909a();
                Context context = (Context) this.f60260f.f60268b;
                if (c0850aM1909a.m1911c(context, context.getClass().getName(), intent, this, 1, null)) {
                    ((ScheduledExecutorService) this.f60260f.f60269c).schedule(new RunnableC18900j(this, 1), 30L, TimeUnit.SECONDS);
                } else {
                    m20209a(0, "Unable to bind to service");
                }
            } catch (SecurityException e10) {
                m20210b("Unable to bind to service", e10);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f60260f.f60269c).execute(new RunnableC15195M(this, iBinder, false, 12));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f60260f.f60269c).execute(new RunnableC18900j(this, 2));
    }
}
