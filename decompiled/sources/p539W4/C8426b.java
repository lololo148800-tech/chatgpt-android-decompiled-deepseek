package p539W4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p228J.AbstractC3794B0;
import p233J4.C4262h;
import p444S4.C6995a;
import p444S4.C6997c;
import p444S4.C6998d;
import p444S4.C7011q;
import p444S4.EnumC7019y;
import p470T4.AbstractC7251p;
import p470T4.InterfaceC7243h;
import p520V5.CallableC7776e;
import p523V9.AbstractC7873E0;
import p594Y9.C9895g4;
import p658b5.C11236g;
import p658b5.C11237h;
import p658b5.C11238i;
import p658b5.C11239j;
import p658b5.C11245p;

/* JADX INFO: renamed from: W4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8426b implements InterfaceC7243h {

    /* JADX INFO: renamed from: r0 */
    public static final String f26243r0 = C7011q.m7409f("SystemJobScheduler");

    /* JADX INFO: renamed from: Y */
    public final Context f26244Y;

    /* JADX INFO: renamed from: Z */
    public final JobScheduler f26245Z;

    /* JADX INFO: renamed from: o0 */
    public final C8425a f26246o0;

    /* JADX INFO: renamed from: p0 */
    public final WorkDatabase f26247p0;

    /* JADX INFO: renamed from: q0 */
    public final C6995a f26248q0;

    public C8426b(Context context, WorkDatabase workDatabase, C6995a c6995a) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C8425a c8425a = new C8425a(context, c6995a.f22379c);
        this.f26244Y = context;
        this.f26245Z = jobScheduler;
        this.f26246o0 = c8425a;
        this.f26247p0 = workDatabase;
        this.f26248q0 = c6995a;
    }

    /* JADX INFO: renamed from: b */
    public static void m9027b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            C7011q.m7408d().m7412c(f26243r0, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m9028d(Context context, JobScheduler jobScheduler, String str) {
        ArrayList<JobInfo> arrayListM9029f = m9029f(context, jobScheduler);
        if (arrayListM9029f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : arrayListM9029f) {
            C11239j c11239jM9030g = m9030g(jobInfo);
            if (c11239jM9030g != null && str.equals(c11239jM9030g.f34012a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m9029f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            C7011q.m7408d().m7412c(f26243r0, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static C11239j m9030g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C11239j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p470T4.InterfaceC7243h
    /* JADX INFO: renamed from: a */
    public final boolean mo7651a() {
        return true;
    }

    @Override // p470T4.InterfaceC7243h
    /* JADX INFO: renamed from: c */
    public final void mo7652c(C11245p... c11245pArr) {
        int iIntValue;
        ArrayList arrayListM9028d;
        int iIntValue2;
        WorkDatabase workDatabase = this.f26247p0;
        C9895g4 c9895g4 = new C9895g4(workDatabase);
        for (C11245p c11245p : c11245pArr) {
            workDatabase.m12340c();
            try {
                C11245p c11245pM12646p = workDatabase.mo12356t().m12646p(c11245p.f34041a);
                String str = f26243r0;
                String str2 = c11245p.f34041a;
                if (c11245pM12646p == null) {
                    C7011q.m7408d().m7414g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.m12352o();
                } else {
                    if (c11245pM12646p.f34042b != EnumC7019y.f22432Y) {
                        C7011q.m7408d().m7414g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                        workDatabase.m12352o();
                    } else {
                        C11239j c11239jM8151b = AbstractC7873E0.m8151b(c11245p);
                        C11236g c11236gM12566l0 = workDatabase.mo12353p().m12566l0(c11239jM8151b);
                        WorkDatabase workDatabase2 = (WorkDatabase) c9895g4.f29409Y;
                        C6995a c6995a = this.f26248q0;
                        if (c11236gM12566l0 != null) {
                            iIntValue = c11236gM12566l0.f34005c;
                        } else {
                            c6995a.getClass();
                            Object objM12351n = workDatabase2.m12351n(new CallableC7776e(c9895g4, c6995a.f22384h, 1));
                            AbstractC16544l.m18093f(objM12351n, "workDatabase.runInTransa…            id\n        })");
                            iIntValue = ((Number) objM12351n).intValue();
                        }
                        if (c11236gM12566l0 == null) {
                            workDatabase.mo12353p().m12570o0(new C11236g(c11239jM8151b.f34012a, c11239jM8151b.f34013b, iIntValue));
                        }
                        m9031h(c11245p, iIntValue);
                        if (Build.VERSION.SDK_INT == 23 && (arrayListM9028d = m9028d(this.f26244Y, this.f26245Z, str2)) != null) {
                            int iIndexOf = arrayListM9028d.indexOf(Integer.valueOf(iIntValue));
                            if (iIndexOf >= 0) {
                                arrayListM9028d.remove(iIndexOf);
                            }
                            if (arrayListM9028d.isEmpty()) {
                                c6995a.getClass();
                                Object objM12351n2 = workDatabase2.m12351n(new CallableC7776e(c9895g4, c6995a.f22384h, 1));
                                AbstractC16544l.m18093f(objM12351n2, "workDatabase.runInTransa…            id\n        })");
                                iIntValue2 = ((Number) objM12351n2).intValue();
                            } else {
                                iIntValue2 = ((Integer) arrayListM9028d.get(0)).intValue();
                            }
                            m9031h(c11245p, iIntValue2);
                        }
                        workDatabase.m12352o();
                        workDatabase.m12348k();
                    }
                }
                workDatabase.m12348k();
            } catch (Throwable th2) {
                workDatabase.m12348k();
                throw th2;
            }
        }
    }

    @Override // p470T4.InterfaceC7243h
    /* JADX INFO: renamed from: e */
    public final void mo7653e(String str) {
        Context context = this.f26244Y;
        JobScheduler jobScheduler = this.f26245Z;
        ArrayList arrayListM9028d = m9028d(context, jobScheduler, str);
        if (arrayListM9028d == null || arrayListM9028d.isEmpty()) {
            return;
        }
        Iterator it = arrayListM9028d.iterator();
        while (it.hasNext()) {
            m9027b(jobScheduler, ((Integer) it.next()).intValue());
        }
        C11238i c11238iMo12353p = this.f26247p0.mo12353p();
        c11238iMo12353p.getClass();
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11238iMo12353p.f34008Y;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) c11238iMo12353p.f34011p0;
        C4262h c4262hM1928a = c11237h.m1928a();
        if (str == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3422c(1, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (r11 < 26) goto L20;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9031h(C11245p c11245p, int i10) {
        int i11;
        JobScheduler jobScheduler = this.f26245Z;
        C8425a c8425a = this.f26246o0;
        c8425a.getClass();
        C6998d c6998d = c11245p.f34050j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = c11245p.f34041a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c11245p.f34060t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c11245p.m12624c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i10, c8425a.f26241a).setRequiresCharging(c6998d.f22393b);
        boolean z6 = c6998d.f22394c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z6).setExtras(persistableBundle);
        int i12 = Build.VERSION.SDK_INT;
        int i13 = c6998d.f22392a;
        if (i12 < 30 || i13 != 6) {
            int iM24h = AbstractC0010F.m24h(i13);
            if (iM24h == 0) {
                i11 = 0;
            } else if (iM24h == 1) {
                i11 = 1;
            } else if (iM24h == 2) {
                i11 = 2;
            } else if (iM24h != 3) {
                i11 = 4;
                if (iM24h == 4) {
                }
                C7011q.m7408d().m7410a(C8425a.f26240c, "API version too low. Cannot convert network type value ".concat(AbstractC3794B0.m4475J(i13)));
                i11 = 1;
            } else if (i12 >= 24) {
                i11 = 3;
            } else {
                C7011q.m7408d().m7410a(C8425a.f26240c, "API version too low. Cannot convert network type value ".concat(AbstractC3794B0.m4475J(i13)));
                i11 = 1;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z6) {
            extras.setBackoffCriteria(c11245p.f34053m, c11245p.f34052l == 2 ? 0 : 1);
        }
        long jM12622a = c11245p.m12622a();
        c8425a.f26242b.getClass();
        long jMax = Math.max(jM12622a - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c11245p.f34057q) {
            extras.setImportantWhileForeground(true);
        }
        if (i12 >= 24 && c6998d.m7400a()) {
            for (C6997c c6997c : c6998d.f22399h) {
                boolean z10 = c6997c.f22390b;
                AbstractC7251p.m7672k();
                extras.addTriggerContentUri(AbstractC7251p.m7665d(c6997c.f22389a, z10 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c6998d.f22397f);
            extras.setTriggerContentMaxDelay(c6998d.f22398g);
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            extras.setRequiresBatteryNotLow(c6998d.f22395d);
            extras.setRequiresStorageNotLow(c6998d.f22396e);
        }
        boolean z11 = c11245p.f34051k > 0;
        boolean z12 = jMax > 0;
        if (i14 >= 31 && c11245p.f34057q && !z11 && !z12) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = f26243r0;
        C7011q.m7408d().m7410a(str2, "Scheduling work ID " + str + "Job ID " + i10);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                C7011q.m7408d().m7414g(str2, "Unable to schedule work ID " + str);
                if (c11245p.f34057q && c11245p.f34058r == 1) {
                    c11245p.f34057q = false;
                    C7011q.m7408d().m7410a(str2, "Scheduling a non-expedited job (work ID " + str + Separators.RPAREN);
                    m9031h(c11245p, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList arrayListM9029f = m9029f(this.f26244Y, jobScheduler);
            String str3 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(arrayListM9029f != null ? arrayListM9029f.size() : 0), Integer.valueOf(this.f26247p0.mo12356t().m12642l().size()), Integer.valueOf(this.f26248q0.f22386j));
            C7011q.m7408d().m7411b(str2, str3);
            throw new IllegalStateException(str3, e10);
        } catch (Throwable th2) {
            C7011q.m7408d().m7412c(str2, "Unable to schedule " + c11245p, th2);
        }
    }
}
