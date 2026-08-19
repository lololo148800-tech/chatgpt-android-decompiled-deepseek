package p470T4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.javax.sip.C10808o;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p028B.RunnableC0696c;
import p233J4.C4262h;
import p444S4.AbstractC6993A;
import p444S4.C6995a;
import p444S4.C7011q;
import p501Ub.ExecutorC7613o;
import p539W4.C8426b;
import p613Z4.C10165l;
import p658b5.C11237h;
import p658b5.C11239j;
import p658b5.C11246q;
import p674c5.RunnableC11651d;
import p719e5.C13285a;

/* JADX INFO: renamed from: T4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7253r extends AbstractC6993A {

    /* JADX INFO: renamed from: k */
    public static C7253r f22993k;

    /* JADX INFO: renamed from: l */
    public static C7253r f22994l;

    /* JADX INFO: renamed from: m */
    public static final Object f22995m;

    /* JADX INFO: renamed from: a */
    public final Context f22996a;

    /* JADX INFO: renamed from: b */
    public final C6995a f22997b;

    /* JADX INFO: renamed from: c */
    public final WorkDatabase f22998c;

    /* JADX INFO: renamed from: d */
    public final C13285a f22999d;

    /* JADX INFO: renamed from: e */
    public final List f23000e;

    /* JADX INFO: renamed from: f */
    public final C7241f f23001f;

    /* JADX INFO: renamed from: g */
    public final C10808o f23002g;

    /* JADX INFO: renamed from: h */
    public boolean f23003h = false;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f23004i;

    /* JADX INFO: renamed from: j */
    public final C10165l f23005j;

    static {
        C7011q.m7409f("WorkManagerImpl");
        f22993k = null;
        f22994l = null;
        f22995m = new Object();
    }

    public C7253r(Context context, final C6995a c6995a, C13285a c13285a, final WorkDatabase workDatabase, final List list, C7241f c7241f, C10165l c10165l) {
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && AbstractC7252q.m7688a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        C7011q c7011q = new C7011q(c6995a.f22383g);
        synchronized (C7011q.f22420b) {
            C7011q.f22421c = c7011q;
        }
        this.f22996a = applicationContext;
        this.f22999d = c13285a;
        this.f22998c = workDatabase;
        this.f23001f = c7241f;
        this.f23005j = c10165l;
        this.f22997b = c6995a;
        this.f23000e = list;
        this.f23002g = new C10808o(workDatabase, 29);
        final ExecutorC7613o executorC7613o = c13285a.f41990a;
        String str = AbstractC7245j.f22978a;
        c7241f.m7641a(new InterfaceC7238c() { // from class: T4.i
            @Override // p470T4.InterfaceC7238c
            /* JADX INFO: renamed from: d */
            public final void mo7639d(C11239j c11239j, boolean z6) {
                executorC7613o.execute(new RunnableC0696c(list, c11239j, c6995a, workDatabase, 6));
            }
        });
        c13285a.m14897a(new RunnableC11651d(applicationContext, this));
    }

    /* JADX INFO: renamed from: e */
    public static C7253r m7689e() {
        synchronized (f22995m) {
            try {
                C7253r c7253r = f22993k;
                if (c7253r != null) {
                    return c7253r;
                }
                return f22994l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C7253r m7690f(Context context) {
        C7253r c7253rM7689e;
        synchronized (f22995m) {
            try {
                c7253rM7689e = m7689e();
                if (c7253rM7689e == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7253rM7689e;
    }

    /* JADX INFO: renamed from: g */
    public final void m7691g() {
        synchronized (f22995m) {
            try {
                this.f23003h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f23004i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f23004i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7692h() {
        ArrayList arrayListM9029f;
        String str = C8426b.f26243r0;
        Context context = this.f22996a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListM9029f = C8426b.m9029f(context, jobScheduler)) != null && !arrayListM9029f.isEmpty()) {
            Iterator it = arrayListM9029f.iterator();
            while (it.hasNext()) {
                C8426b.m9027b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f22998c;
        C11246q c11246qMo12356t = workDatabase.mo12356t();
        c11246qMo12356t.getClass();
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) c11246qMo12356t.f34076m;
        C4262h c4262hM1928a = c11237h.m1928a();
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
            AbstractC7245j.m7655b(this.f22997b, workDatabase, this.f23000e);
        } catch (Throwable th2) {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
            throw th2;
        }
    }
}
