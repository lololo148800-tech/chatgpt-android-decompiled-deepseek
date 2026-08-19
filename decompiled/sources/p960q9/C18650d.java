package p960q9;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p001A.AbstractC0010F;
import p1003s3.RunnableC19440a;
import p1022t9.AbstractC19824i;
import p980r3.C18871a;

/* JADX INFO: renamed from: q9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18650d {

    /* JADX INFO: renamed from: a */
    public C18871a f59397a;

    /* JADX INFO: renamed from: b */
    public boolean f59398b = false;

    /* JADX INFO: renamed from: c */
    public boolean f59399c = false;

    /* JADX INFO: renamed from: d */
    public boolean f59400d = true;

    /* JADX INFO: renamed from: e */
    public boolean f59401e = false;

    /* JADX INFO: renamed from: f */
    public Executor f59402f;

    /* JADX INFO: renamed from: g */
    public volatile RunnableC19440a f59403g;

    /* JADX INFO: renamed from: h */
    public volatile RunnableC19440a f59404h;

    /* JADX INFO: renamed from: i */
    public final Semaphore f59405i;

    /* JADX INFO: renamed from: j */
    public final Set f59406j;

    public C18650d(Context context, Set set) {
        context.getApplicationContext();
        this.f59405i = new Semaphore(0);
        this.f59406j = set;
    }

    /* JADX INFO: renamed from: a */
    public final void m20012a() {
        if (this.f59403g != null) {
            boolean z6 = this.f59398b;
            if (!z6) {
                if (z6) {
                    m20014c();
                } else {
                    this.f59401e = true;
                }
            }
            if (this.f59404h != null) {
                this.f59403g.getClass();
                this.f59403g = null;
                return;
            }
            this.f59403g.getClass();
            RunnableC19440a runnableC19440a = this.f59403g;
            runnableC19440a.f61643o0.set(true);
            if (runnableC19440a.f61641Y.cancel(false)) {
                this.f59404h = this.f59403g;
            }
            this.f59403g = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20013b() {
        if (this.f59404h != null || this.f59403g == null) {
            return;
        }
        this.f59403g.getClass();
        if (this.f59402f == null) {
            this.f59402f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        RunnableC19440a runnableC19440a = this.f59403g;
        Executor executor = this.f59402f;
        if (runnableC19440a.f61642Z == 1) {
            runnableC19440a.f61642Z = 2;
            executor.execute(runnableC19440a.f61641Y);
            return;
        }
        int iM24h = AbstractC0010F.m24h(runnableC19440a.f61642Z);
        if (iM24h == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iM24h == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    /* JADX INFO: renamed from: c */
    public final void m20014c() {
        m20012a();
        this.f59403g = new RunnableC19440a(this);
        m20013b();
    }

    /* JADX INFO: renamed from: d */
    public final void m20015d() {
        Iterator it = this.f59406j.iterator();
        if (it.hasNext()) {
            ((AbstractC19824i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f59405i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
