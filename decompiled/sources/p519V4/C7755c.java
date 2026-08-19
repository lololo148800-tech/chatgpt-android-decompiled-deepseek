package p519V4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import cn.UfGr.EhBykzn;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p233J4.C4262h;
import p301M.RunnableC5232n;
import p444S4.C6998d;
import p444S4.C7011q;
import p444S4.C7012r;
import p470T4.C7246k;
import p470T4.InterfaceC7238c;
import p523V9.AbstractC7873E0;
import p571X9.AbstractC9306j0;
import p658b5.C11236g;
import p658b5.C11237h;
import p658b5.C11238i;
import p658b5.C11239j;
import p658b5.C11241l;
import p658b5.C11245p;
import p658b5.C11248s;

/* JADX INFO: renamed from: V4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7755c implements InterfaceC7238c {

    /* JADX INFO: renamed from: r0 */
    public static final String f24456r0 = C7011q.m7409f("CommandHandler");

    /* JADX INFO: renamed from: Y */
    public final Context f24457Y;

    /* JADX INFO: renamed from: Z */
    public final HashMap f24458Z = new HashMap();

    /* JADX INFO: renamed from: o0 */
    public final Object f24459o0 = new Object();

    /* JADX INFO: renamed from: p0 */
    public final C7012r f24460p0;

    /* JADX INFO: renamed from: q0 */
    public final C11248s f24461q0;

    public C7755c(Context context, C7012r c7012r, C11248s c11248s) {
        this.f24457Y = context;
        this.f24460p0 = c7012r;
        this.f24461q0 = c11248s;
    }

    /* JADX INFO: renamed from: c */
    public static C11239j m8016c(Intent intent) {
        return new C11239j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* JADX INFO: renamed from: e */
    public static void m8017e(Intent intent, C11239j c11239j) {
        intent.putExtra("KEY_WORKSPEC_ID", c11239j.f34012a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c11239j.f34013b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8018a() {
        boolean z6;
        synchronized (this.f24459o0) {
            z6 = !this.f24458Z.isEmpty();
        }
        return z6;
    }

    @Override // p470T4.InterfaceC7238c
    /* JADX INFO: renamed from: d */
    public final void mo7639d(C11239j c11239j, boolean z6) {
        synchronized (this.f24459o0) {
            try {
                C7760h c7760h = (C7760h) this.f24458Z.remove(c11239j);
                this.f24461q0.m12672u(c11239j);
                if (c7760h != null) {
                    c7760h.m8026f(z6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8019b(Intent intent, int i10, C7762j c7762j) throws Throwable {
        List<C7246k> listM12673v;
        InterfaceC15154Q interfaceC15154QMo16291v;
        ArrayList arrayList;
        boolean z6;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C7011q.m7408d().m7410a(f24456r0, "Handling constraints changed " + intent);
            C7758f c7758f = new C7758f(this.f24457Y, this.f24460p0, i10, c7762j);
            ArrayList<C11245p> arrayListM12642l = c7762j.f24496q0.f22998c.mo12356t().m12642l();
            String str = AbstractC7756d.f24462a;
            Iterator it = arrayListM12642l.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                C6998d c6998d = ((C11245p) it.next()).f34050j;
                z10 |= c6998d.f22395d;
                z11 |= c6998d.f22393b;
                z12 |= c6998d.f22396e;
                if (c6998d.f22392a != 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z13 |= z6;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f33720a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c7758f.f24468a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            ArrayList<C11245p> arrayList2 = new ArrayList(arrayListM12642l.size());
            c7758f.f24469b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C11245p c11245p : arrayListM12642l) {
                if (jCurrentTimeMillis >= c11245p.m12622a() && (!c11245p.m12623b() || c7758f.f24471d.m14913N(c11245p))) {
                    arrayList2.add(c11245p);
                }
            }
            for (C11245p c11245p2 : arrayList2) {
                String str3 = c11245p2.f34041a;
                C11239j c11239jM8151b = AbstractC7873E0.m8151b(c11245p2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                m8017e(intent3, c11239jM8151b);
                C7011q.m7408d().m7410a(C7758f.f24467e, AbstractC10763a.m11054l("Creating a delay_met command for workSpec with id (", str3, Separators.RPAREN));
                c7762j.f24493Z.f41993d.execute(new RunnableC5232n(c7762j, intent3, c7758f.f24470c, 1));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C7011q.m7408d().m7410a(f24456r0, "Handling reschedule " + intent + ", " + i10);
            c7762j.f24496q0.m7692h();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                C11239j c11239jM8016c = m8016c(intent);
                String str4 = f24456r0;
                C7011q.m7408d().m7410a(str4, "Handling schedule work for " + c11239jM8016c);
                WorkDatabase workDatabase = c7762j.f24496q0.f22998c;
                workDatabase.m12340c();
                try {
                    C11245p c11245pM12646p = workDatabase.mo12356t().m12646p(c11239jM8016c.f34012a);
                    if (c11245pM12646p == null) {
                        C7011q.m7408d().m7414g(str4, "Skipping scheduling " + c11239jM8016c + " because it's no longer in the DB");
                    } else if (c11245pM12646p.f34042b.m7415a()) {
                        C7011q.m7408d().m7414g(str4, "Skipping scheduling " + c11239jM8016c + "because it is finished.");
                    } else {
                        long jM12622a = c11245pM12646p.m12622a();
                        boolean zM12623b = c11245pM12646p.m12623b();
                        Context context2 = this.f24457Y;
                        if (!zM12623b) {
                            C7011q.m7408d().m7410a(str4, "Setting up Alarms for " + c11239jM8016c + "at " + jM12622a);
                            AbstractC7754b.m8015b(context2, workDatabase, c11239jM8016c, jM12622a);
                        } else {
                            C7011q.m7408d().m7410a(str4, "Opportunistically setting an alarm for " + c11239jM8016c + "at " + jM12622a);
                            AbstractC7754b.m8015b(context2, workDatabase, c11239jM8016c, jM12622a);
                            Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                            intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                            c7762j.f24493Z.f41993d.execute(new RunnableC5232n(c7762j, intent4, i10, 1));
                        }
                        workDatabase.m12352o();
                    }
                    return;
                } finally {
                    workDatabase.m12348k();
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.f24459o0) {
                    try {
                        C11239j c11239jM8016c2 = m8016c(intent);
                        C7011q c7011qM7408d = C7011q.m7408d();
                        String str5 = f24456r0;
                        c7011qM7408d.m7410a(str5, "Handing delay met for " + c11239jM8016c2);
                        if (!this.f24458Z.containsKey(c11239jM8016c2)) {
                            C7760h c7760h = new C7760h(this.f24457Y, i10, c7762j, this.f24461q0.m12674w(c11239jM8016c2));
                            this.f24458Z.put(c11239jM8016c2, c7760h);
                            c7760h.m8025e();
                        } else {
                            C7011q.m7408d().m7410a(str5, "WorkSpec " + c11239jM8016c2 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                C11248s c11248s = this.f24461q0;
                if (zContainsKey) {
                    int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    arrayList = new ArrayList(1);
                    C7246k c7246kM12672u = c11248s.m12672u(new C11239j(string, i11));
                    if (c7246kM12672u != null) {
                        listM12673v = arrayList;
                        arrayList.add(c7246kM12672u);
                        listM12673v = arrayList;
                    }
                } else {
                    listM12673v = c11248s.m12673v(string);
                }
                listM12673v = arrayList;
                for (C7246k workSpecId : listM12673v) {
                    C7011q.m7408d().m7410a(f24456r0, AbstractC9306j0.m9889h("Handing stopWork work for ", string));
                    C11241l c11241l = c7762j.f24501v0;
                    c11241l.getClass();
                    AbstractC16544l.m18094g(workSpecId, "workSpecId");
                    c11241l.m12592M(workSpecId, -512);
                    WorkDatabase workDatabase2 = c7762j.f24496q0.f22998c;
                    String str6 = AbstractC7754b.f24455a;
                    C11238i c11238iMo12353p = workDatabase2.mo12353p();
                    C11239j c11239j = workSpecId.f22979a;
                    C11236g c11236gM12566l0 = c11238iMo12353p.m12566l0(c11239j);
                    if (c11236gM12566l0 != null) {
                        AbstractC7754b.m8014a(this.f24457Y, c11239j, c11236gM12566l0.f34005c);
                        C7011q.m7408d().m7410a(AbstractC7754b.f24455a, "Removing SystemIdInfo for workSpecId (" + c11239j + Separators.RPAREN);
                        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
                        if (interfaceC15154QM16332f != null) {
                            interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao");
                        } else {
                            interfaceC15154QMo16291v = null;
                        }
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11238iMo12353p.f34008Y;
                        workDatabase_Impl.m12339b();
                        C11237h c11237h = (C11237h) c11238iMo12353p.f34010o0;
                        C4262h c4262hM1928a = c11237h.m1928a();
                        String str7 = c11239j.f34012a;
                        if (str7 == null) {
                            c4262hM1928a.mo3426s0(1);
                        } else {
                            c4262hM1928a.mo3422c(1, str7);
                        }
                        c4262hM1928a.mo3420V(2, c11239j.f34013b);
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
                        } catch (Throwable th3) {
                            workDatabase_Impl.m12348k();
                            if (interfaceC15154QMo16291v != null) {
                                interfaceC15154QMo16291v.mo16271b();
                            }
                            c11237h.m1942o(c4262hM1928a);
                            throw th3;
                        }
                    }
                    c7762j.mo7639d(c11239j, false);
                }
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                C11239j c11239jM8016c3 = m8016c(intent);
                boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                C7011q.m7408d().m7410a(f24456r0, EhBykzn.RMDnG + intent + ", " + i10);
                mo7639d(c11239jM8016c3, z14);
                return;
            }
            C7011q.m7408d().m7414g(f24456r0, "Ignoring intent " + intent);
            return;
        }
        C7011q.m7408d().m7411b(f24456r0, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
    }
}
