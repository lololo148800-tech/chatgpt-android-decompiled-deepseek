package p519V4;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import p277L.ExecutorC4833f;
import p301M.RunnableC5232n;
import p444S4.C6995a;
import p444S4.C7011q;
import p470T4.C7241f;
import p470T4.C7253r;
import p470T4.InterfaceC7238c;
import p658b5.C11239j;
import p658b5.C11241l;
import p658b5.C11248s;
import p674c5.AbstractC11658k;
import p674c5.C11665r;
import p719e5.C13285a;

/* JADX INFO: renamed from: V4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7762j implements InterfaceC7238c {

    /* JADX INFO: renamed from: w0 */
    public static final String f24491w0 = C7011q.m7409f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: Y */
    public final Context f24492Y;

    /* JADX INFO: renamed from: Z */
    public final C13285a f24493Z;

    /* JADX INFO: renamed from: o0 */
    public final C11665r f24494o0;

    /* JADX INFO: renamed from: p0 */
    public final C7241f f24495p0;

    /* JADX INFO: renamed from: q0 */
    public final C7253r f24496q0;

    /* JADX INFO: renamed from: r0 */
    public final C7755c f24497r0;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f24498s0;

    /* JADX INFO: renamed from: t0 */
    public Intent f24499t0;

    /* JADX INFO: renamed from: u0 */
    public SystemAlarmService f24500u0;

    /* JADX INFO: renamed from: v0 */
    public final C11241l f24501v0;

    public C7762j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f24492Y = applicationContext;
        C11248s c11248s = new C11248s(13);
        C7253r c7253rM7690f = C7253r.m7690f(systemAlarmService);
        this.f24496q0 = c7253rM7690f;
        C6995a c6995a = c7253rM7690f.f22997b;
        this.f24497r0 = new C7755c(applicationContext, c6995a.f22379c, c11248s);
        this.f24494o0 = new C11665r(c6995a.f22382f);
        C7241f c7241f = c7253rM7690f.f23001f;
        this.f24495p0 = c7241f;
        C13285a c13285a = c7253rM7690f.f22999d;
        this.f24493Z = c13285a;
        this.f24501v0 = new C11241l(c7241f, c13285a);
        c7241f.m7641a(this);
        this.f24498s0 = new ArrayList();
        this.f24499t0 = null;
    }

    /* JADX INFO: renamed from: b */
    public static void m8028b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8029a(int i10, Intent intent) {
        C7011q c7011qM7408d = C7011q.m7408d();
        String str = f24491w0;
        c7011qM7408d.m7410a(str, "Adding command " + intent + " (" + i10 + Separators.RPAREN);
        m8028b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C7011q.m7408d().m7414g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m8030c()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f24498s0) {
            try {
                boolean zIsEmpty = this.f24498s0.isEmpty();
                this.f24498s0.add(intent);
                if (zIsEmpty) {
                    m8031e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8030c() {
        m8028b();
        synchronized (this.f24498s0) {
            try {
                Iterator it = this.f24498s0.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p470T4.InterfaceC7238c
    /* JADX INFO: renamed from: d */
    public final void mo7639d(C11239j c11239j, boolean z6) {
        ExecutorC4833f executorC4833f = this.f24493Z.f41993d;
        String str = C7755c.f24456r0;
        Intent intent = new Intent(this.f24492Y, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        C7755c.m8017e(intent, c11239j);
        executorC4833f.execute(new RunnableC5232n(this, intent, 0, 1));
    }

    /* JADX INFO: renamed from: e */
    public final void m8031e() {
        m8028b();
        PowerManager.WakeLock wakeLockM13020a = AbstractC11658k.m13020a(this.f24492Y, "ProcessCommand");
        try {
            wakeLockM13020a.acquire();
            this.f24496q0.f22999d.m14897a(new RunnableC7761i(this, 0));
        } finally {
            wakeLockM13020a.release();
        }
    }
}
