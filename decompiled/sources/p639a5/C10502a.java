package p639a5;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p025An.InterfaceC0627n0;
import p301M.RunnableC5232n;
import p444S4.C7002h;
import p444S4.C7011q;
import p468T2.RunnableC7216h;
import p470T4.C7241f;
import p470T4.C7246k;
import p470T4.C7253r;
import p470T4.InterfaceC7238c;
import p523V9.AbstractC7873E0;
import p566X4.AbstractC9045c;
import p566X4.C9044b;
import p566X4.InterfaceC9047e;
import p658b5.C11239j;
import p658b5.C11245p;
import p674c5.RunnableC11657j;
import p719e5.C13285a;
import p720e6.C13288c;

/* JADX INFO: renamed from: a5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10502a implements InterfaceC9047e, InterfaceC7238c {

    /* JADX INFO: renamed from: v0 */
    public static final String f31110v0 = C7011q.m7409f("SystemFgDispatcher");

    /* JADX INFO: renamed from: Y */
    public final C7253r f31111Y;

    /* JADX INFO: renamed from: Z */
    public final C13285a f31112Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f31113o0 = new Object();

    /* JADX INFO: renamed from: p0 */
    public C11239j f31114p0;

    /* JADX INFO: renamed from: q0 */
    public final LinkedHashMap f31115q0;

    /* JADX INFO: renamed from: r0 */
    public final HashMap f31116r0;

    /* JADX INFO: renamed from: s0 */
    public final HashMap f31117s0;

    /* JADX INFO: renamed from: t0 */
    public final C13288c f31118t0;

    /* JADX INFO: renamed from: u0 */
    public SystemForegroundService f31119u0;

    public C10502a(Context context) {
        C7253r c7253rM7690f = C7253r.m7690f(context);
        this.f31111Y = c7253rM7690f;
        this.f31112Z = c7253rM7690f.f22999d;
        this.f31114p0 = null;
        this.f31115q0 = new LinkedHashMap();
        this.f31117s0 = new HashMap();
        this.f31116r0 = new HashMap();
        this.f31118t0 = new C13288c(c7253rM7690f.f23005j);
        c7253rM7690f.f23001f.m7641a(this);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m10960c(Context context, C11239j c11239j, C7002h c7002h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c11239j.f34012a);
        intent.putExtra("KEY_GENERATION", c11239j.f34013b);
        intent.putExtra("KEY_NOTIFICATION_ID", c7002h.f22409a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c7002h.f22410b);
        intent.putExtra("KEY_NOTIFICATION", c7002h.f22411c);
        return intent;
    }

    @Override // p566X4.InterfaceC9047e
    /* JADX INFO: renamed from: b */
    public final void mo7909b(C11245p c11245p, AbstractC9045c abstractC9045c) {
        if (abstractC9045c instanceof C9044b) {
            C7011q.m7408d().m7410a(f31110v0, "Constraints unmet for WorkSpec " + c11245p.f34041a);
            C11239j c11239jM8151b = AbstractC7873E0.m8151b(c11245p);
            C7253r c7253r = this.f31111Y;
            c7253r.getClass();
            C7246k c7246k = new C7246k(c11239jM8151b);
            C7241f processor = c7253r.f23001f;
            AbstractC16544l.m18094g(processor, "processor");
            c7253r.f22999d.m14897a(new RunnableC11657j(processor, c7246k, true, -512));
        }
    }

    @Override // p470T4.InterfaceC7238c
    /* JADX INFO: renamed from: d */
    public final void mo7639d(C11239j c11239j, boolean z6) {
        Map.Entry entry;
        synchronized (this.f31113o0) {
            try {
                InterfaceC0627n0 interfaceC0627n0 = ((C11245p) this.f31116r0.remove(c11239j)) != null ? (InterfaceC0627n0) this.f31117s0.remove(c11239j) : null;
                if (interfaceC0627n0 != null) {
                    interfaceC0627n0.mo1275e(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C7002h c7002h = (C7002h) this.f31115q0.remove(c11239j);
        if (c11239j.equals(this.f31114p0)) {
            if (this.f31115q0.size() > 0) {
                Iterator it = this.f31115q0.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f31114p0 = (C11239j) entry.getKey();
                if (this.f31119u0 != null) {
                    C7002h c7002h2 = (C7002h) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f31119u0;
                    systemForegroundService.f33732Z.post(new RunnableC10503b(systemForegroundService, c7002h2.f22409a, c7002h2.f22411c, c7002h2.f22410b));
                    SystemForegroundService systemForegroundService2 = this.f31119u0;
                    systemForegroundService2.f33732Z.post(new RunnableC7216h(systemForegroundService2, c7002h2.f22409a, 1));
                }
            } else {
                this.f31114p0 = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.f31119u0;
        if (c7002h == null || systemForegroundService3 == null) {
            return;
        }
        C7011q.m7408d().m7410a(f31110v0, "Removing Notification (id: " + c7002h.f22409a + ", workSpecId: " + c11239j + ", notificationType: " + c7002h.f22410b);
        systemForegroundService3.f33732Z.post(new RunnableC7216h(systemForegroundService3, c7002h.f22409a, 1));
    }

    /* JADX INFO: renamed from: e */
    public final void m10961e(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C11239j c11239j = new C11239j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C7011q c7011qM7408d = C7011q.m7408d();
        StringBuilder sb2 = new StringBuilder("Notifying with (id:");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType :");
        c7011qM7408d.m7410a(f31110v0, AbstractC10763a.m11056n(sb2, intExtra2, Separators.RPAREN));
        if (notification == null || this.f31119u0 == null) {
            return;
        }
        C7002h c7002h = new C7002h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f31115q0;
        linkedHashMap.put(c11239j, c7002h);
        if (this.f31114p0 == null) {
            this.f31114p0 = c11239j;
            SystemForegroundService systemForegroundService = this.f31119u0;
            systemForegroundService.f33732Z.post(new RunnableC10503b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f31119u0;
        systemForegroundService2.f33732Z.post(new RunnableC5232n(systemForegroundService2, intExtra, notification, 2));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((C7002h) ((Map.Entry) it.next()).getValue()).f22410b;
        }
        C7002h c7002h2 = (C7002h) linkedHashMap.get(this.f31114p0);
        if (c7002h2 != null) {
            SystemForegroundService systemForegroundService3 = this.f31119u0;
            systemForegroundService3.f33732Z.post(new RunnableC10503b(systemForegroundService3, c7002h2.f22409a, c7002h2.f22411c, i10));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10962f() {
        this.f31119u0 = null;
        synchronized (this.f31113o0) {
            try {
                Iterator it = this.f31117s0.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0627n0) it.next()).mo1275e(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31111Y.f23001f.m7647h(this);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m10959a(Context context, C11239j c11239j, C7002h c7002h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(HJrCuD.YRJtFKRJf);
        intent.putExtra("KEY_NOTIFICATION_ID", c7002h.f22409a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c7002h.f22410b);
        intent.putExtra("KEY_NOTIFICATION", c7002h.f22411c);
        intent.putExtra("KEY_WORKSPEC_ID", c11239j.f34012a);
        intent.putExtra("KEY_GENERATION", c11239j.f34013b);
        return intent;
    }
}
