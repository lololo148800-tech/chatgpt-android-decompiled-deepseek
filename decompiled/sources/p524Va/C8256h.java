package p524Va;

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
import p265Kb.C4613f;
import p357Oa.C6157j;
import p357Oa.ServiceConnectionC6160m;
import p500Ua.C7595d;
import p746fa.C13599h;

/* JADX INFO: renamed from: Va.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8256h {

    /* JADX INFO: renamed from: n */
    public static final HashMap f25742n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f25743a;

    /* JADX INFO: renamed from: b */
    public final C4613f f25744b;

    /* JADX INFO: renamed from: g */
    public boolean f25749g;

    /* JADX INFO: renamed from: h */
    public final Intent f25750h;

    /* JADX INFO: renamed from: l */
    public ServiceConnectionC6160m f25754l;

    /* JADX INFO: renamed from: m */
    public InterfaceC8252d f25755m;

    /* JADX INFO: renamed from: d */
    public final ArrayList f25746d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f25747e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f25748f = new Object();

    /* JADX INFO: renamed from: j */
    public final C6157j f25752j = new C6157j(this, 1);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f25753k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f25745c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f25751i = new WeakReference(null);

    public C8256h(Context context, C4613f c4613f, Intent intent) {
        this.f25743a = context;
        this.f25744b = c4613f;
        this.f25750h = intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m8891b(C8256h c8256h, C7595d c7595d) {
        InterfaceC8252d interfaceC8252d = c8256h.f25755m;
        ArrayList<AbstractRunnableC8253e> arrayList = c8256h.f25746d;
        C4613f c4613f = c8256h.f25744b;
        if (interfaceC8252d != null || c8256h.f25749g) {
            if (!c8256h.f25749g) {
                c7595d.run();
                return;
            } else {
                c4613f.m5360c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(c7595d);
                return;
            }
        }
        c4613f.m5360c("Initiate binding to the service.", new Object[0]);
        arrayList.add(c7595d);
        ServiceConnectionC6160m serviceConnectionC6160m = new ServiceConnectionC6160m(c8256h, 2);
        c8256h.f25754l = serviceConnectionC6160m;
        c8256h.f25749g = true;
        if (c8256h.f25743a.bindService(c8256h.f25750h, serviceConnectionC6160m, 1)) {
            return;
        }
        c4613f.m5360c("Failed to bind to the service.", new Object[0]);
        c8256h.f25749g = false;
        for (AbstractRunnableC8253e abstractRunnableC8253e : arrayList) {
            C0644w c0644w = new C0644w("Failed to bind to the service.");
            C13599h c13599h = abstractRunnableC8253e.f25736Y;
            if (c13599h != null) {
                c13599h.m15115c(c0644w);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m8892a() {
        Handler handler;
        HashMap map = f25742n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f25745c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f25745c, 10);
                    handlerThread.start();
                    map.put(this.f25745c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f25745c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m8893c() {
        HashSet hashSet = this.f25747e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C13599h) it.next()).m15115c(new RemoteException(String.valueOf(this.f25745c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
