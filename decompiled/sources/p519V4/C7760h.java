package p519V4;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p025An.AbstractC0563B;
import p025An.C0631p0;
import p277L.ExecutorC4833f;
import p301M.RunnableC5232n;
import p444S4.C7011q;
import p470T4.C7246k;
import p501Ub.ExecutorC7613o;
import p566X4.AbstractC9045c;
import p566X4.AbstractC9050h;
import p566X4.C9043a;
import p566X4.InterfaceC9047e;
import p571X9.AbstractC9306j0;
import p613Z4.C10165l;
import p658b5.C11239j;
import p658b5.C11245p;
import p674c5.AbstractC11658k;
import p674c5.C11665r;
import p674c5.InterfaceC11663p;
import p674c5.RunnableC11664q;
import p719e5.C13285a;
import p720e6.C13288c;

/* JADX INFO: renamed from: V4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7760h implements InterfaceC9047e, InterfaceC11663p {

    /* JADX INFO: renamed from: A0 */
    public static final String f24474A0 = C7011q.m7409f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: Y */
    public final Context f24475Y;

    /* JADX INFO: renamed from: Z */
    public final int f24476Z;

    /* JADX INFO: renamed from: o0 */
    public final C11239j f24477o0;

    /* JADX INFO: renamed from: p0 */
    public final C7762j f24478p0;

    /* JADX INFO: renamed from: q0 */
    public final C13288c f24479q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f24480r0;

    /* JADX INFO: renamed from: s0 */
    public int f24481s0;

    /* JADX INFO: renamed from: t0 */
    public final ExecutorC7613o f24482t0;

    /* JADX INFO: renamed from: u0 */
    public final ExecutorC4833f f24483u0;

    /* JADX INFO: renamed from: v0 */
    public PowerManager.WakeLock f24484v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f24485w0;

    /* JADX INFO: renamed from: x0 */
    public final C7246k f24486x0;

    /* JADX INFO: renamed from: y0 */
    public final AbstractC0563B f24487y0;

    /* JADX INFO: renamed from: z0 */
    public volatile C0631p0 f24488z0;

    public C7760h(Context context, int i10, C7762j c7762j, C7246k c7246k) {
        this.f24475Y = context;
        this.f24476Z = i10;
        this.f24478p0 = c7762j;
        this.f24477o0 = c7246k.f22979a;
        this.f24486x0 = c7246k;
        C10165l c10165l = c7762j.f24496q0.f23005j;
        C13285a c13285a = c7762j.f24493Z;
        this.f24482t0 = c13285a.f41990a;
        this.f24483u0 = c13285a.f41993d;
        this.f24487y0 = c13285a.f41991b;
        this.f24479q0 = new C13288c(c10165l);
        this.f24485w0 = false;
        this.f24481s0 = 0;
        this.f24480r0 = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m8022a(C7760h c7760h) {
        C11239j c11239j = c7760h.f24477o0;
        int i10 = c7760h.f24481s0;
        String str = c11239j.f34012a;
        String str2 = f24474A0;
        if (i10 >= 2) {
            C7011q.m7408d().m7410a(str2, "Already stopped work for " + str);
            return;
        }
        c7760h.f24481s0 = 2;
        C7011q.m7408d().m7410a(str2, "Stopping work for WorkSpec " + str);
        Context context = c7760h.f24475Y;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C7755c.m8017e(intent, c11239j);
        C7762j c7762j = c7760h.f24478p0;
        int i11 = c7760h.f24476Z;
        RunnableC5232n runnableC5232n = new RunnableC5232n(c7762j, intent, i11, 1);
        ExecutorC4833f executorC4833f = c7760h.f24483u0;
        executorC4833f.execute(runnableC5232n);
        if (!c7762j.f24495p0.m7646g(str)) {
            C7011q.m7408d().m7410a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        C7011q.m7408d().m7410a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C7755c.m8017e(intent2, c11239j);
        executorC4833f.execute(new RunnableC5232n(c7762j, intent2, i11, 1));
    }

    /* JADX INFO: renamed from: c */
    public static void m8023c(C7760h c7760h) {
        if (c7760h.f24481s0 != 0) {
            C7011q.m7408d().m7410a(f24474A0, "Already started work for " + c7760h.f24477o0);
            return;
        }
        c7760h.f24481s0 = 1;
        C7011q.m7408d().m7410a(f24474A0, "onAllConstraintsMet for " + c7760h.f24477o0);
        if (!c7760h.f24478p0.f24495p0.m7649j(c7760h.f24486x0, null)) {
            c7760h.m8024d();
            return;
        }
        C11665r c11665r = c7760h.f24478p0.f24494o0;
        C11239j c11239j = c7760h.f24477o0;
        synchronized (c11665r.f35325d) {
            C7011q.m7408d().m7410a(C11665r.f35321e, "Starting timer for " + c11239j);
            c11665r.m13021a(c11239j);
            RunnableC11664q runnableC11664q = new RunnableC11664q(c11665r, c11239j);
            c11665r.f35323b.put(c11239j, runnableC11664q);
            c11665r.f35324c.put(c11239j, c7760h);
            c11665r.f35322a.f2050a.postDelayed(runnableC11664q, 600000L);
        }
    }

    @Override // p566X4.InterfaceC9047e
    /* JADX INFO: renamed from: b */
    public final void mo7909b(C11245p c11245p, AbstractC9045c abstractC9045c) {
        boolean z6 = abstractC9045c instanceof C9043a;
        ExecutorC7613o executorC7613o = this.f24482t0;
        if (z6) {
            executorC7613o.execute(new RunnableC7759g(this, 1));
        } else {
            executorC7613o.execute(new RunnableC7759g(this, 0));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8024d() {
        synchronized (this.f24480r0) {
            try {
                if (this.f24488z0 != null) {
                    this.f24488z0.mo1275e(null);
                }
                this.f24478p0.f24494o0.m13021a(this.f24477o0);
                PowerManager.WakeLock wakeLock = this.f24484v0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C7011q.m7408d().m7410a(f24474A0, "Releasing wakelock " + this.f24484v0 + "for WorkSpec " + this.f24477o0);
                    this.f24484v0.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8025e() {
        String str = this.f24477o0.f34012a;
        Context context = this.f24475Y;
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, " (");
        sbM9895n.append(this.f24476Z);
        sbM9895n.append(Separators.RPAREN);
        this.f24484v0 = AbstractC11658k.m13020a(context, sbM9895n.toString());
        C7011q c7011qM7408d = C7011q.m7408d();
        String str2 = f24474A0;
        c7011qM7408d.m7410a(str2, "Acquiring wakelock " + this.f24484v0 + "for WorkSpec " + str);
        this.f24484v0.acquire();
        C11245p c11245pM12646p = this.f24478p0.f24496q0.f22998c.mo12356t().m12646p(str);
        if (c11245pM12646p == null) {
            this.f24482t0.execute(new RunnableC7759g(this, 0));
            return;
        }
        boolean zM12623b = c11245pM12646p.m12623b();
        this.f24485w0 = zM12623b;
        if (zM12623b) {
            this.f24488z0 = AbstractC9050h.m9609a(this.f24479q0, c11245pM12646p, this.f24487y0, this);
            return;
        }
        C7011q.m7408d().m7410a(str2, "No constraints for " + str);
        this.f24482t0.execute(new RunnableC7759g(this, 1));
    }

    /* JADX INFO: renamed from: f */
    public final void m8026f(boolean z6) {
        C7011q c7011qM7408d = C7011q.m7408d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        C11239j c11239j = this.f24477o0;
        sb2.append(c11239j);
        sb2.append(", ");
        sb2.append(z6);
        c7011qM7408d.m7410a(f24474A0, sb2.toString());
        m8024d();
        int i10 = this.f24476Z;
        C7762j c7762j = this.f24478p0;
        ExecutorC4833f executorC4833f = this.f24483u0;
        Context context = this.f24475Y;
        if (z6) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C7755c.m8017e(intent, c11239j);
            executorC4833f.execute(new RunnableC5232n(c7762j, intent, i10, 1));
        }
        if (this.f24485w0) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executorC4833f.execute(new RunnableC5232n(c7762j, intent2, i10, 1));
        }
    }
}
