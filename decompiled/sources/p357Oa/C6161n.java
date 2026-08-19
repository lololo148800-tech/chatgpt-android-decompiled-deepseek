package p357Oa;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p025An.C0644w;
import p334Na.C5698e;
import p477Tb.C7296c;
import p746fa.C13599h;

/* JADX INFO: renamed from: Oa.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6161n {

    /* JADX INFO: renamed from: n */
    public static final HashMap f20049n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f20050a;

    /* JADX INFO: renamed from: b */
    public final C7296c f20051b;

    /* JADX INFO: renamed from: g */
    public boolean f20056g;

    /* JADX INFO: renamed from: h */
    public final Intent f20057h;

    /* JADX INFO: renamed from: l */
    public ServiceConnectionC6160m f20061l;

    /* JADX INFO: renamed from: m */
    public InterfaceC6154g f20062m;

    /* JADX INFO: renamed from: d */
    public final ArrayList f20053d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f20054e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f20055f = new Object();

    /* JADX INFO: renamed from: j */
    public final C6157j f20059j = new C6157j(this, 0);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f20060k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f20052c = "AppUpdateService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f20058i = new WeakReference(null);

    public C6161n(Context context, C7296c c7296c, Intent intent) {
        this.f20050a = context;
        this.f20051b = c7296c;
        this.f20057h = intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m6716b(C6161n c6161n, C5698e c5698e) {
        InterfaceC6154g interfaceC6154g = c6161n.f20062m;
        ArrayList<AbstractRunnableC6156i> arrayList = c6161n.f20053d;
        C7296c c7296c = c6161n.f20051b;
        if (interfaceC6154g != null || c6161n.f20056g) {
            if (!c6161n.f20056g) {
                c5698e.run();
                return;
            } else {
                c7296c.m7758K("Waiting to bind to the service.", new Object[0]);
                arrayList.add(c5698e);
                return;
            }
        }
        c7296c.m7758K("Initiate binding to the service.", new Object[0]);
        arrayList.add(c5698e);
        ServiceConnectionC6160m serviceConnectionC6160m = new ServiceConnectionC6160m(c6161n, 0);
        c6161n.f20061l = serviceConnectionC6160m;
        c6161n.f20056g = true;
        if (c6161n.f20050a.bindService(c6161n.f20057h, serviceConnectionC6160m, 1)) {
            return;
        }
        c7296c.m7758K("Failed to bind to the service.", new Object[0]);
        c6161n.f20056g = false;
        for (AbstractRunnableC6156i abstractRunnableC6156i : arrayList) {
            C0644w c0644w = new C0644w("Failed to bind to the service.");
            C13599h c13599h = abstractRunnableC6156i.f20040Y;
            if (c13599h != null) {
                c13599h.m15115c(c0644w);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m6717a() {
        Handler handler;
        HashMap map = f20049n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f20052c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f20052c, 10);
                    handlerThread.start();
                    map.put(this.f20052c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f20052c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m6718c(C13599h c13599h) {
        synchronized (this.f20055f) {
            this.f20054e.remove(c13599h);
        }
        m6717a().post(new C6158k(this, 0));
    }

    /* JADX INFO: renamed from: d */
    public final void m6719d() {
        HashSet hashSet = this.f20054e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C13599h) it.next()).m15115c(new RemoteException(String.valueOf(this.f20052c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
