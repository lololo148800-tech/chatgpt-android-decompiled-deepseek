package p495U4;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p028B.C0707n;
import p221Ii.RunnableC3724c;
import p470T4.C7246k;
import p658b5.C11241l;

/* JADX INFO: renamed from: U4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7558d {

    /* JADX INFO: renamed from: a */
    public final C0707n f23949a;

    /* JADX INFO: renamed from: b */
    public final C11241l f23950b;

    /* JADX INFO: renamed from: c */
    public final long f23951c;

    /* JADX INFO: renamed from: d */
    public final Object f23952d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f23953e;

    public C7558d(C0707n runnableScheduler, C11241l c11241l) {
        AbstractC16544l.m18094g(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f23949a = runnableScheduler;
        this.f23950b = c11241l;
        this.f23951c = millis;
        this.f23952d = new Object();
        this.f23953e = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m7912a(C7246k token) {
        Runnable runnable;
        AbstractC16544l.m18094g(token, "token");
        synchronized (this.f23952d) {
            runnable = (Runnable) this.f23953e.remove(token);
        }
        if (runnable != null) {
            this.f23949a.f2050a.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7913b(C7246k c7246k) {
        RunnableC3724c runnableC3724c = new RunnableC3724c(this, 20, c7246k);
        synchronized (this.f23952d) {
        }
        C0707n c0707n = this.f23949a;
        c0707n.f2050a.postDelayed(runnableC3724c, this.f23951c);
    }
}
