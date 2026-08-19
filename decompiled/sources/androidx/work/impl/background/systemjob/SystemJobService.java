package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import io.sentry.C15358g1;
import java.util.Arrays;
import java.util.HashMap;
import p444S4.C7011q;
import p470T4.C7241f;
import p470T4.C7246k;
import p470T4.C7253r;
import p470T4.InterfaceC7238c;
import p519V4.RunnableC7757e;
import p539W4.AbstractC8427c;
import p539W4.AbstractC8428d;
import p539W4.AbstractC8429e;
import p658b5.C11239j;
import p658b5.C11241l;
import p658b5.C11248s;
import p719e5.C13285a;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC7238c {

    /* JADX INFO: renamed from: q0 */
    public static final String f33725q0 = C7011q.m7409f("SystemJobService");

    /* JADX INFO: renamed from: Y */
    public C7253r f33726Y;

    /* JADX INFO: renamed from: Z */
    public final HashMap f33727Z = new HashMap();

    /* JADX INFO: renamed from: o0 */
    public final C11248s f33728o0 = new C11248s(13);

    /* JADX INFO: renamed from: p0 */
    public C11241l f33729p0;

    /* JADX INFO: renamed from: a */
    public static C11239j m12359a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C11239j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p470T4.InterfaceC7238c
    /* JADX INFO: renamed from: d */
    public final void mo7639d(C11239j c11239j, boolean z6) {
        JobParameters jobParameters;
        C7011q.m7408d().m7410a(f33725q0, c11239j.f34012a + " executed on JobScheduler");
        synchronized (this.f33727Z) {
            jobParameters = (JobParameters) this.f33727Z.remove(c11239j);
        }
        this.f33728o0.m12672u(c11239j);
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C7253r c7253rM7690f = C7253r.m7690f(getApplicationContext());
            this.f33726Y = c7253rM7690f;
            C7241f c7241f = c7253rM7690f.f23001f;
            this.f33729p0 = new C11241l(c7241f, c7253rM7690f.f22999d);
            c7241f.m7641a(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            C7011q.m7408d().m7414g(f33725q0, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C7253r c7253r = this.f33726Y;
        if (c7253r != null) {
            c7253r.f23001f.m7647h(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C15358g1 c15358g1;
        if (this.f33726Y == null) {
            C7011q.m7408d().m7410a(f33725q0, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C11239j c11239jM12359a = m12359a(jobParameters);
        if (c11239jM12359a == null) {
            C7011q.m7408d().m7411b(f33725q0, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f33727Z) {
            try {
                if (this.f33727Z.containsKey(c11239jM12359a)) {
                    C7011q.m7408d().m7410a(f33725q0, "Job is already being executed by SystemJobService: " + c11239jM12359a);
                    return false;
                }
                C7011q.m7408d().m7410a(f33725q0, "onStartJob for " + c11239jM12359a);
                this.f33727Z.put(c11239jM12359a, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    c15358g1 = new C15358g1(8);
                    if (AbstractC8427c.m9033b(jobParameters) != null) {
                        c15358g1.f47946Z = Arrays.asList(AbstractC8427c.m9033b(jobParameters));
                    }
                    if (AbstractC8427c.m9032a(jobParameters) != null) {
                        c15358g1.f47945Y = Arrays.asList(AbstractC8427c.m9032a(jobParameters));
                    }
                    if (i10 >= 28) {
                        AbstractC8428d.m9034a(jobParameters);
                    }
                } else {
                    c15358g1 = null;
                }
                C11241l c11241l = this.f33729p0;
                ((C13285a) c11241l.f34017Z).m14897a(new RunnableC7757e((C7241f) c11241l.f34016Y, this.f33728o0.m12674w(c11239jM12359a), c15358g1));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f33726Y == null) {
            C7011q.m7408d().m7410a(f33725q0, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C11239j c11239jM12359a = m12359a(jobParameters);
        if (c11239jM12359a == null) {
            C7011q.m7408d().m7411b(f33725q0, "WorkSpec id not found!");
            return false;
        }
        C7011q.m7408d().m7410a(f33725q0, "onStopJob for " + c11239jM12359a);
        synchronized (this.f33727Z) {
            this.f33727Z.remove(c11239jM12359a);
        }
        C7246k c7246kM12672u = this.f33728o0.m12672u(c11239jM12359a);
        if (c7246kM12672u != null) {
            int iM9035a = Build.VERSION.SDK_INT >= 31 ? AbstractC8429e.m9035a(jobParameters) : -512;
            C11241l c11241l = this.f33729p0;
            c11241l.getClass();
            c11241l.m12592M(c7246kM12672u, iM9035a);
        }
        return !this.f33726Y.f23001f.m7645f(c11239jM12359a.f34012a);
    }
}
