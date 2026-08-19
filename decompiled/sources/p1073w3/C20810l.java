package p1073w3;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import p109E3.C2285i;
import p305M3.C5286f;
import p660b6.C11249a;
import p826j6.AbstractC16144M;
import p826j6.C16139H;

/* JADX INFO: renamed from: w3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C20810l {

    /* JADX INFO: renamed from: e */
    public static C20810l f66084e;

    /* JADX INFO: renamed from: a */
    public int f66085a;

    /* JADX INFO: renamed from: b */
    public final Object f66086b;

    /* JADX INFO: renamed from: c */
    public final Object f66087c;

    /* JADX INFO: renamed from: d */
    public final Object f66088d;

    public C20810l(C16139H c16139h, int i10, Consumer consumer, Runnable runnable) {
        this.f66085a = i10;
        this.f66086b = consumer;
        this.f66087c = runnable;
        this.f66088d = c16139h;
    }

    /* JADX INFO: renamed from: a */
    public static void m21335a(C20810l c20810l, int i10) {
        synchronized (c20810l.f66088d) {
            try {
                if (c20810l.f66085a == i10) {
                    return;
                }
                c20810l.f66085a = i10;
                for (WeakReference weakReference : (CopyOnWriteArrayList) c20810l.f66087c) {
                    C5286f c5286f = (C5286f) weakReference.get();
                    if (c5286f != null) {
                        c5286f.m5825a(i10);
                    } else {
                        ((CopyOnWriteArrayList) c20810l.f66087c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C20810l m21336b(Context context) {
        try {
            if (f66084e == null) {
                f66084e = new C20810l(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f66084e;
    }

    /* JADX INFO: renamed from: c */
    public int m21337c() {
        int i10;
        synchronized (this.f66088d) {
            i10 = this.f66085a;
        }
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public void m21338d(Throwable th2) {
        boolean z6 = th2 instanceof TimeoutException;
        C16139H c16139h = (C16139H) this.f66088d;
        if (z6) {
            c16139h.m17707N(114, 28, AbstractC16144M.f50077E);
            AbstractC11988o0.m13513h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            c16139h.m17707N(107, 28, AbstractC16144M.f50077E);
            AbstractC11988o0.m13513h("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f66087c).run();
    }

    public C20810l(C11249a c11249a, C11249a c11249a2, C11249a c11249a3, int i10) {
        this.f66086b = c11249a;
        this.f66087c = c11249a2;
        this.f66088d = c11249a3;
        this.f66085a = i10;
    }

    public C20810l(Context context) {
        this.f66086b = new Handler(Looper.getMainLooper());
        this.f66087c = new CopyOnWriteArrayList();
        this.f66088d = new Object();
        this.f66085a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C2285i(this, 4), intentFilter);
    }
}
