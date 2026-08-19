package p057C3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import p1016t3.AbstractC19764N;
import p1073w3.AbstractC20800b;
import p1073w3.C20813o;

/* JADX INFO: renamed from: C3.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1553c0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1554d f4283a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1549a0 f4284b;

    /* JADX INFO: renamed from: c */
    public final C20813o f4285c;

    /* JADX INFO: renamed from: d */
    public int f4286d;

    /* JADX INFO: renamed from: e */
    public Object f4287e;

    /* JADX INFO: renamed from: f */
    public final Looper f4288f;

    /* JADX INFO: renamed from: g */
    public boolean f4289g;

    /* JADX INFO: renamed from: h */
    public boolean f4290h;

    /* JADX INFO: renamed from: i */
    public boolean f4291i;

    public C1553c0(InterfaceC1549a0 interfaceC1549a0, AbstractC1554d abstractC1554d, AbstractC19764N abstractC19764N, int i10, C20813o c20813o, Looper looper) {
        this.f4284b = interfaceC1549a0;
        this.f4283a = abstractC1554d;
        this.f4288f = looper;
        this.f4285c = c20813o;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2385a(long j10) {
        boolean z6;
        AbstractC20800b.m21320h(this.f4289g);
        AbstractC20800b.m21320h(this.f4288f.getThread() != Thread.currentThread());
        this.f4285c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z6 = this.f4291i;
            if (z6 || j10 <= 0) {
                break;
            }
            this.f4285c.getClass();
            wait(j10);
            this.f4285c.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z6) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2386b(boolean z6) {
        this.f4290h = z6 | this.f4290h;
        this.f4291i = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: c */
    public final void m2387c() {
        AbstractC20800b.m21320h(!this.f4289g);
        this.f4289g = true;
        C1532J c1532j = (C1532J) this.f4284b;
        synchronized (c1532j) {
            if (!c1532j.f4134L0 && c1532j.f4163v0.getThread().isAlive()) {
                c1532j.f4161t0.m21376a(14, this).m21374b();
                return;
            }
            AbstractC20800b.m21332t("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m2386b(false);
        }
    }
}
