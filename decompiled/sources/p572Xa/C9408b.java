package p572Xa;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import io.sentry.hints.C15370i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p357Oa.C6157j;
import p357Oa.ServiceConnectionC6160m;
import p425Ra.AbstractC6835h;
import p746fa.C13599h;

/* JADX INFO: renamed from: Xa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9408b {

    /* JADX INFO: renamed from: o */
    public static final HashMap f28366o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f28367a;

    /* JADX INFO: renamed from: b */
    public final C9427u f28368b;

    /* JADX INFO: renamed from: g */
    public boolean f28373g;

    /* JADX INFO: renamed from: h */
    public final Intent f28374h;

    /* JADX INFO: renamed from: i */
    public final C15370i f28375i;

    /* JADX INFO: renamed from: m */
    public ServiceConnectionC6160m f28379m;

    /* JADX INFO: renamed from: n */
    public InterfaceC9425s f28380n;

    /* JADX INFO: renamed from: d */
    public final ArrayList f28370d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f28371e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f28372f = new Object();

    /* JADX INFO: renamed from: k */
    public final C6157j f28377k = new C6157j(this, 2);

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f28378l = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f28369c = "ExpressIntegrityService";

    /* JADX INFO: renamed from: j */
    public final WeakReference f28376j = new WeakReference(null);

    public C9408b(Context context, C9427u c9427u, Intent intent, C15370i c15370i) {
        this.f28367a = context;
        this.f28368b = c9427u;
        this.f28374h = intent;
        this.f28375i = c15370i;
    }

    /* JADX INFO: renamed from: b */
    public static void m9984b(C9408b c9408b, AbstractC6835h abstractC6835h) {
        InterfaceC9425s interfaceC9425s = c9408b.f28380n;
        ArrayList arrayList = c9408b.f28370d;
        C9427u c9427u = c9408b.f28368b;
        if (interfaceC9425s != null || c9408b.f28373g) {
            if (!c9408b.f28373g) {
                abstractC6835h.run();
                return;
            } else {
                c9427u.m10000b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractC6835h);
                return;
            }
        }
        c9427u.m10000b("Initiate binding to the service.", new Object[0]);
        arrayList.add(abstractC6835h);
        ServiceConnectionC6160m serviceConnectionC6160m = new ServiceConnectionC6160m(c9408b, 3);
        c9408b.f28379m = serviceConnectionC6160m;
        c9408b.f28373g = true;
        if (c9408b.f28367a.bindService(c9408b.f28374h, serviceConnectionC6160m, 1)) {
            return;
        }
        c9427u.m10000b("Failed to bind to the service.", new Object[0]);
        c9408b.f28373g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC9428v) it.next()).mo7276a(new C9409c("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m9985a() {
        Handler handler;
        HashMap map = f28366o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f28369c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f28369c, 10);
                    handlerThread.start();
                    map.put(this.f28369c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f28369c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m9986c(C13599h c13599h) {
        synchronized (this.f28372f) {
            this.f28371e.remove(c13599h);
        }
        m9985a().post(new C9407a(this, 1));
    }

    /* JADX INFO: renamed from: d */
    public final void m9987d() {
        HashSet hashSet = this.f28371e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C13599h) it.next()).m15115c(new RemoteException(String.valueOf(this.f28369c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
