package p470T4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p001A.RunnableC0066i;
import p221Ii.RunnableC3724c;
import p444S4.C6995a;
import p444S4.C7002h;
import p444S4.C7011q;
import p523V9.AbstractC7873E0;
import p639a5.C10502a;
import p658b5.C11239j;
import p658b5.C11245p;
import p674c5.AbstractC11658k;
import p697d5.C13018a;
import p697d5.C13027j;
import p719e5.C13285a;
import p913o2.AbstractC17801b;
import p999s.C19341c1;

/* JADX INFO: renamed from: T4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7241f {

    /* JADX INFO: renamed from: l */
    public static final String f22960l = C7011q.m7409f("Processor");

    /* JADX INFO: renamed from: b */
    public final Context f22962b;

    /* JADX INFO: renamed from: c */
    public final C6995a f22963c;

    /* JADX INFO: renamed from: d */
    public final C13285a f22964d;

    /* JADX INFO: renamed from: e */
    public final WorkDatabase f22965e;

    /* JADX INFO: renamed from: g */
    public final HashMap f22967g = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f22966f = new HashMap();

    /* JADX INFO: renamed from: i */
    public final HashSet f22969i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final ArrayList f22970j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public PowerManager.WakeLock f22961a = null;

    /* JADX INFO: renamed from: k */
    public final Object f22971k = new Object();

    /* JADX INFO: renamed from: h */
    public final HashMap f22968h = new HashMap();

    public C7241f(Context context, C6995a c6995a, C13285a c13285a, WorkDatabase workDatabase) {
        this.f22962b = context;
        this.f22963c = c6995a;
        this.f22964d = c13285a;
        this.f22965e = workDatabase;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7640e(String str, RunnableC7256u runnableC7256u, int i10) {
        if (runnableC7256u == null) {
            C7011q.m7408d().m7410a(f22960l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        runnableC7256u.f23010C0 = i10;
        runnableC7256u.m7705h();
        runnableC7256u.f23009B0.cancel(true);
        if (runnableC7256u.f23014p0 == null || !(runnableC7256u.f23009B0.f41326Y instanceof C13018a)) {
            C7011q.m7408d().m7410a(RunnableC7256u.f23007D0, "WorkSpec " + runnableC7256u.f23013o0 + " is already done. Not interrupting.");
        } else {
            runnableC7256u.f23014p0.m7407e(i10);
        }
        C7011q.m7408d().m7410a(f22960l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m7641a(InterfaceC7238c interfaceC7238c) {
        synchronized (this.f22971k) {
            this.f22970j.add(interfaceC7238c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final RunnableC7256u m7642b(String str) {
        RunnableC7256u runnableC7256u = (RunnableC7256u) this.f22966f.remove(str);
        boolean z6 = runnableC7256u != null;
        if (!z6) {
            runnableC7256u = (RunnableC7256u) this.f22967g.remove(str);
        }
        this.f22968h.remove(str);
        if (z6) {
            synchronized (this.f22971k) {
                try {
                    if (this.f22966f.isEmpty()) {
                        Context context = this.f22962b;
                        String str2 = C10502a.f31110v0;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f22962b.startService(intent);
                        } catch (Throwable th2) {
                            C7011q.m7408d().m7412c(f22960l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f22961a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f22961a = null;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return runnableC7256u;
    }

    /* JADX INFO: renamed from: c */
    public final C11245p m7643c(String str) {
        synchronized (this.f22971k) {
            try {
                RunnableC7256u runnableC7256uM7644d = m7644d(str);
                if (runnableC7256uM7644d == null) {
                    return null;
                }
                return runnableC7256uM7644d.f23013o0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final RunnableC7256u m7644d(String str) {
        RunnableC7256u runnableC7256u = (RunnableC7256u) this.f22966f.get(str);
        return runnableC7256u == null ? (RunnableC7256u) this.f22967g.get(str) : runnableC7256u;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7645f(String str) {
        boolean zContains;
        synchronized (this.f22971k) {
            zContains = this.f22969i.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7646g(String str) {
        boolean z6;
        synchronized (this.f22971k) {
            z6 = m7644d(str) != null;
        }
        return z6;
    }

    /* JADX INFO: renamed from: h */
    public final void m7647h(InterfaceC7238c interfaceC7238c) {
        synchronized (this.f22971k) {
            this.f22970j.remove(interfaceC7238c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7648i(String str, C7002h c7002h) {
        synchronized (this.f22971k) {
            try {
                C7011q.m7408d().m7413e(f22960l, "Moving WorkSpec (" + str + ") to the foreground");
                RunnableC7256u runnableC7256u = (RunnableC7256u) this.f22967g.remove(str);
                if (runnableC7256u != null) {
                    if (this.f22961a == null) {
                        PowerManager.WakeLock wakeLockM13020a = AbstractC11658k.m13020a(this.f22962b, "ProcessorForegroundLck");
                        this.f22961a = wakeLockM13020a;
                        wakeLockM13020a.acquire();
                    }
                    this.f22966f.put(str, runnableC7256u);
                    Intent intentM10960c = C10502a.m10960c(this.f22962b, AbstractC7873E0.m8151b(runnableC7256u.f23013o0), c7002h);
                    Context context = this.f22962b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC17801b.m19552c(context, intentM10960c);
                    } else {
                        context.startService(intentM10960c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7649j(C7246k c7246k, C15358g1 c15358g1) {
        C11239j c11239j = c7246k.f22979a;
        String str = c11239j.f34012a;
        ArrayList arrayList = new ArrayList();
        C11245p c11245p = (C11245p) this.f22965e.m12351n(new CallableC7240e(this, arrayList, str, 0));
        if (c11245p == null) {
            C7011q.m7408d().m7414g(f22960l, "Didn't find WorkSpec for id " + c11239j);
            this.f22964d.f41993d.execute(new RunnableC3724c(this, 17, c11239j));
            return false;
        }
        synchronized (this.f22971k) {
            try {
                if (m7646g(str)) {
                    Set set = (Set) this.f22968h.get(str);
                    if (((C7246k) set.iterator().next()).f22979a.f34013b == c11239j.f34013b) {
                        set.add(c7246k);
                        C7011q.m7408d().m7410a(f22960l, "Work " + c11239j + " is already enqueued for processing");
                    } else {
                        this.f22964d.f41993d.execute(new RunnableC3724c(this, 17, c11239j));
                    }
                    return false;
                }
                if (c11245p.f34060t != c11239j.f34013b) {
                    this.f22964d.f41993d.execute(new RunnableC3724c(this, 17, c11239j));
                    return false;
                }
                Context context = this.f22962b;
                C6995a c6995a = this.f22963c;
                C13285a c13285a = this.f22964d;
                WorkDatabase workDatabase = this.f22965e;
                C19341c1 c19341c1 = new C19341c1();
                new C15358g1(8);
                c19341c1.f61254Y = context.getApplicationContext();
                c19341c1.f61256o0 = c13285a;
                c19341c1.f61255Z = this;
                c19341c1.f61257p0 = c6995a;
                c19341c1.f61258q0 = workDatabase;
                c19341c1.f61259r0 = c11245p;
                c19341c1.f61260s0 = arrayList;
                RunnableC7256u runnableC7256u = new RunnableC7256u(c19341c1);
                C13027j c13027j = runnableC7256u.f23008A0;
                c13027j.mo5766a(new RunnableC0066i(this, c13027j, runnableC7256u, 16), this.f22964d.f41993d);
                this.f22967g.put(str, runnableC7256u);
                HashSet hashSet = new HashSet();
                hashSet.add(c7246k);
                this.f22968h.put(str, hashSet);
                this.f22964d.f41990a.execute(runnableC7256u);
                C7011q.m7408d().m7410a(f22960l, C7241f.class.getSimpleName() + ": processing " + c11239j);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7650k(C7246k c7246k, int i10) {
        String str = c7246k.f22979a.f34012a;
        synchronized (this.f22971k) {
            try {
                if (this.f22966f.get(str) == null) {
                    Set set = (Set) this.f22968h.get(str);
                    if (set != null && set.contains(c7246k)) {
                        return m7640e(str, m7642b(str), i10);
                    }
                    return false;
                }
                C7011q.m7408d().m7410a(f22960l, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
