package p674c5;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.javax.sip.C10808o;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p030B2.AbstractC0719B0;
import p110E4.C2315m;
import p444S4.C6995a;
import p444S4.C7011q;
import p444S4.EnumC7019y;
import p470T4.AbstractC7245j;
import p470T4.C7253r;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC8151n5;
import p539W4.C8426b;
import p571X9.AbstractC9190P3;
import p658b5.C11233d;
import p658b5.C11238i;
import p658b5.C11239j;
import p658b5.C11242m;
import p658b5.C11245p;
import p658b5.C11246q;

/* JADX INFO: renamed from: c5.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11651d implements Runnable {

    /* JADX INFO: renamed from: q0 */
    public static final String f35294q0 = C7011q.m7409f("ForceStopRunnable");

    /* JADX INFO: renamed from: r0 */
    public static final long f35295r0 = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: Y */
    public final Context f35296Y;

    /* JADX INFO: renamed from: Z */
    public final C7253r f35297Z;

    /* JADX INFO: renamed from: o0 */
    public final C10808o f35298o0;

    /* JADX INFO: renamed from: p0 */
    public int f35299p0 = 0;

    public RunnableC11651d(Context context, C7253r c7253r) {
        this.f35296Y = context.getApplicationContext();
        this.f35297Z = c7253r;
        this.f35298o0 = c7253r.f23002g;
    }

    /* JADX INFO: renamed from: c */
    public static void m13010c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f35295r0;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0210  */
    /* JADX WARN: Code duplicated, block: B:112:0x022c  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m13011a() {
        boolean z6;
        C10808o c10808o = this.f35298o0;
        C7253r c7253r = this.f35297Z;
        WorkDatabase workDatabase = c7253r.f22998c;
        String str = C8426b.f26243r0;
        Context context = this.f35296Y;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListM9029f = C8426b.m9029f(context, jobScheduler);
        C11238i c11238iMo12353p = workDatabase.mo12353p();
        c11238iMo12353p.getClass();
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11238iMo12353p.f34008Y;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM8212b.getCount());
            while (cursorM8212b.moveToNext()) {
                arrayList.add(cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0));
            }
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
            HashSet hashSet = new HashSet(arrayListM9029f != null ? arrayListM9029f.size() : 0);
            if (arrayListM9029f != null && !arrayListM9029f.isEmpty()) {
                for (JobInfo jobInfo : arrayListM9029f) {
                    C11239j c11239jM9030g = C8426b.m9030g(jobInfo);
                    if (c11239jM9030g != null) {
                        hashSet.add(c11239jM9030g.f34012a);
                    } else {
                        C8426b.m9027b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        C7011q.m7408d().m7410a(C8426b.f26243r0, "Reconciling jobs");
                        z6 = true;
                        break;
                    }
                } else {
                    z6 = false;
                    break;
                }
            }
            if (z6) {
                workDatabase.m12340c();
                try {
                    C11246q c11246qMo12356t = workDatabase.mo12356t();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        c11246qMo12356t.m12651u(-1L, (String) it2.next());
                    }
                    workDatabase.m12352o();
                    workDatabase.m12348k();
                } catch (Throwable th2) {
                    workDatabase.m12348k();
                    throw th2;
                }
            }
            WorkDatabase workDatabase2 = c7253r.f22998c;
            C11246q c11246qMo12356t2 = workDatabase2.mo12356t();
            C11242m c11242mMo12355s = workDatabase2.mo12355s();
            workDatabase2.m12340c();
            try {
                ArrayList<C11245p> arrayListM12641k = c11246qMo12356t2.m12641k();
                boolean zIsEmpty = arrayListM12641k.isEmpty();
                if (!zIsEmpty) {
                    for (C11245p c11245p : arrayListM12641k) {
                        EnumC7019y enumC7019y = EnumC7019y.f22432Y;
                        String str2 = c11245p.f34041a;
                        c11246qMo12356t2.m12628D(enumC7019y, str2);
                        c11246qMo12356t2.m12629E(-512, str2);
                        c11246qMo12356t2.m12651u(-1L, str2);
                    }
                }
                c11242mMo12355s.m12617v();
                workDatabase2.m12352o();
                workDatabase2.m12348k();
                boolean z10 = !zIsEmpty || z6;
                Long lM12497A = ((WorkDatabase) c7253r.f23002g.f32040Z).mo12349l().m12497A("reschedule_needed");
                String str3 = f35294q0;
                if (lM12497A != null && lM12497A.longValue() == 1) {
                    C7011q.m7408d().m7410a(str3, "Rescheduling Workers.");
                    c7253r.m7692h();
                    C10808o c10808o2 = c7253r.f23002g;
                    c10808o2.getClass();
                    ((WorkDatabase) c10808o2.f32040Z).mo12349l().m12499C(new C11233d("reschedule_needed", 0L));
                    return;
                }
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    int i11 = i10 >= 31 ? 570425344 : 536870912;
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                    intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
                    if (i10 < 30) {
                        if (broadcast == null) {
                            m13010c(context);
                            C7011q.m7408d().m7410a(str3, "Application was force-stopped, rescheduling.");
                            c7253r.m7692h();
                            c7253r.f22997b.f22379c.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            c10808o.getClass();
                            ((WorkDatabase) c10808o.f32040Z).mo12349l().m12499C(new C11233d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                            return;
                        }
                        if (z10) {
                            C7011q.m7408d().m7410a(str3, "Found unfinished work, scheduling it.");
                            AbstractC7245j.m7655b(c7253r.f22997b, c7253r.f22998c, c7253r.f23000e);
                        }
                    }
                    if (broadcast != null) {
                        broadcast.cancel();
                    }
                    List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                        Long lM12497A2 = ((WorkDatabase) c10808o.f32040Z).mo12349l().m12497A("last_force_stop_ms");
                        long jLongValue = lM12497A2 != null ? lM12497A2.longValue() : 0L;
                        for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                            ApplicationExitInfo applicationExitInfoM1508c = AbstractC0719B0.m1508c(historicalProcessExitReasons.get(i12));
                            if (applicationExitInfoM1508c.getReason() == 10 && applicationExitInfoM1508c.getTimestamp() >= jLongValue) {
                                C7011q.m7408d().m7410a(str3, "Application was force-stopped, rescheduling.");
                                c7253r.m7692h();
                                c7253r.f22997b.f22379c.getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                c10808o.getClass();
                                ((WorkDatabase) c10808o.f32040Z).mo12349l().m12499C(new C11233d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                return;
                            }
                        }
                    }
                    if (z10) {
                        C7011q.m7408d().m7410a(str3, "Found unfinished work, scheduling it.");
                        AbstractC7245j.m7655b(c7253r.f22997b, c7253r.f22998c, c7253r.f23000e);
                    }
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    if (C7011q.m7408d().f22422a <= 5) {
                        AbstractC15256t.m16483u(str3, "Ignoring exception", e);
                    }
                } catch (SecurityException e11) {
                    e = e11;
                    if (C7011q.m7408d().f22422a <= 5) {
                        AbstractC15256t.m16483u(str3, "Ignoring exception", e);
                    }
                }
            } catch (Throwable th3) {
                workDatabase2.m12348k();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13012b() {
        C6995a c6995a = this.f35297Z.f22997b;
        c6995a.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f35294q0;
        if (zIsEmpty) {
            C7011q.m7408d().m7410a(str, "The default process name was not specified.");
            return true;
        }
        boolean zM13019a = AbstractC11656i.m13019a(this.f35296Y, c6995a);
        C7011q.m7408d().m7410a(str, "Is default app process = " + zM13019a);
        return zM13019a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f35296Y;
        String str = f35294q0;
        C7253r c7253r = this.f35297Z;
        try {
            if (!m13012b()) {
                c7253r.m7691g();
                return;
            }
            while (true) {
                try {
                    AbstractC9190P3.m9752b(context);
                    C7011q.m7408d().m7410a(str, "Performing cleanup operations.");
                    try {
                        m13011a();
                        c7253r.m7691g();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i10 = this.f35299p0 + 1;
                        this.f35299p0 = i10;
                        if (i10 >= 3) {
                            String str2 = AbstractC8151n5.m8695c(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            C7011q.m7408d().m7412c(str, str2, e10);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
                            c7253r.f22997b.getClass();
                            throw illegalStateException;
                        }
                        long j10 = ((long) i10) * 300;
                        String str3 = "Retrying after " + j10;
                        if (C7011q.m7408d().f22422a <= 3) {
                            Log.d(str, str3, e10);
                        }
                        try {
                            Thread.sleep(((long) this.f35299p0) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    C7011q.m7408d().m7411b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    c7253r.f22997b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th2) {
            c7253r.m7691g();
            throw th2;
        }
    }
}
