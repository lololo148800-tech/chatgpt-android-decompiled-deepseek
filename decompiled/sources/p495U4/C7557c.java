package p495U4;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.text.TextUtils;
import io.sentry.C15358g1;
import java.util.HashMap;
import java.util.HashSet;
import p025An.InterfaceC0627n0;
import p028B.C0707n;
import p301M.RunnableC5228j;
import p444S4.C6995a;
import p444S4.C6998d;
import p444S4.C7011q;
import p444S4.C7012r;
import p444S4.EnumC7019y;
import p470T4.C7241f;
import p470T4.C7246k;
import p470T4.InterfaceC7238c;
import p470T4.InterfaceC7243h;
import p519V4.RunnableC7757e;
import p523V9.AbstractC7873E0;
import p566X4.AbstractC9045c;
import p566X4.AbstractC9050h;
import p566X4.C9043a;
import p566X4.C9044b;
import p566X4.InterfaceC9047e;
import p613Z4.C10165l;
import p658b5.C11239j;
import p658b5.C11241l;
import p658b5.C11245p;
import p658b5.C11248s;
import p674c5.AbstractC11656i;
import p719e5.C13285a;
import p720e6.C13288c;

/* JADX INFO: renamed from: U4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7557c implements InterfaceC7243h, InterfaceC9047e, InterfaceC7238c {

    /* JADX INFO: renamed from: A0 */
    public static final String f23934A0 = C7011q.m7409f("GreedyScheduler");

    /* JADX INFO: renamed from: Y */
    public final Context f23935Y;

    /* JADX INFO: renamed from: o0 */
    public final C7555a f23937o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f23938p0;

    /* JADX INFO: renamed from: s0 */
    public final C7241f f23941s0;

    /* JADX INFO: renamed from: t0 */
    public final C11241l f23942t0;

    /* JADX INFO: renamed from: u0 */
    public final C6995a f23943u0;

    /* JADX INFO: renamed from: w0 */
    public Boolean f23945w0;

    /* JADX INFO: renamed from: x0 */
    public final C13288c f23946x0;

    /* JADX INFO: renamed from: y0 */
    public final C13285a f23947y0;

    /* JADX INFO: renamed from: z0 */
    public final C7558d f23948z0;

    /* JADX INFO: renamed from: Z */
    public final HashMap f23936Z = new HashMap();

    /* JADX INFO: renamed from: q0 */
    public final Object f23939q0 = new Object();

    /* JADX INFO: renamed from: r0 */
    public final C11248s f23940r0 = new C11248s(13);

    /* JADX INFO: renamed from: v0 */
    public final HashMap f23944v0 = new HashMap();

    public C7557c(Context context, C6995a c6995a, C10165l c10165l, C7241f c7241f, C11241l c11241l, C13285a c13285a) {
        this.f23935Y = context;
        C7012r c7012r = c6995a.f22379c;
        C0707n c0707n = c6995a.f22382f;
        this.f23937o0 = new C7555a(this, c0707n, c7012r);
        this.f23948z0 = new C7558d(c0707n, c11241l);
        this.f23947y0 = c13285a;
        this.f23946x0 = new C13288c(c10165l);
        this.f23943u0 = c6995a;
        this.f23941s0 = c7241f;
        this.f23942t0 = c11241l;
    }

    @Override // p470T4.InterfaceC7243h
    /* JADX INFO: renamed from: a */
    public final boolean mo7651a() {
        return false;
    }

    @Override // p566X4.InterfaceC9047e
    /* JADX INFO: renamed from: b */
    public final void mo7909b(C11245p c11245p, AbstractC9045c abstractC9045c) {
        C11239j c11239jM8151b = AbstractC7873E0.m8151b(c11245p);
        boolean z6 = abstractC9045c instanceof C9043a;
        C11241l c11241l = this.f23942t0;
        C7558d c7558d = this.f23948z0;
        String str = f23934A0;
        C11248s c11248s = this.f23940r0;
        if (z6) {
            if (c11248s.m12664e(c11239jM8151b)) {
                return;
            }
            C7011q.m7408d().m7410a(str, "Constraints met: Scheduling work ID " + c11239jM8151b);
            C7246k c7246kM12674w = c11248s.m12674w(c11239jM8151b);
            c7558d.m7913b(c7246kM12674w);
            ((C13285a) c11241l.f34017Z).m14897a(new RunnableC7757e((C7241f) c11241l.f34016Y, c7246kM12674w, (C15358g1) null));
            return;
        }
        C7011q.m7408d().m7410a(str, "Constraints not met: Cancelling work ID " + c11239jM8151b);
        C7246k c7246kM12672u = c11248s.m12672u(c11239jM8151b);
        if (c7246kM12672u != null) {
            c7558d.m7912a(c7246kM12672u);
            int i10 = ((C9044b) abstractC9045c).f27616a;
            c11241l.getClass();
            c11241l.m12592M(c7246kM12672u, i10);
        }
    }

    @Override // p470T4.InterfaceC7243h
    /* JADX INFO: renamed from: c */
    public final void mo7652c(C11245p... c11245pArr) {
        if (this.f23945w0 == null) {
            this.f23945w0 = Boolean.valueOf(AbstractC11656i.m13019a(this.f23935Y, this.f23943u0));
        }
        if (!this.f23945w0.booleanValue()) {
            C7011q.m7408d().m7413e(f23934A0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f23938p0) {
            this.f23941s0.m7641a(this);
            this.f23938p0 = true;
        }
        HashSet<C11245p> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C11245p c11245p : c11245pArr) {
            if (!this.f23940r0.m12664e(AbstractC7873E0.m8151b(c11245p))) {
                long jMax = Math.max(c11245p.m12622a(), m7911g(c11245p));
                this.f23943u0.f22379c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c11245p.f34042b == EnumC7019y.f22432Y) {
                    if (jCurrentTimeMillis < jMax) {
                        C7555a c7555a = this.f23937o0;
                        if (c7555a != null) {
                            HashMap map = c7555a.f23931d;
                            Runnable runnable = (Runnable) map.remove(c11245p.f34041a);
                            C0707n c0707n = c7555a.f23929b;
                            if (runnable != null) {
                                c0707n.f2050a.removeCallbacks(runnable);
                            }
                            RunnableC5228j runnableC5228j = new RunnableC5228j(c7555a, c11245p, false, 10);
                            map.put(c11245p.f34041a, runnableC5228j);
                            c7555a.f23930c.getClass();
                            c0707n.f2050a.postDelayed(runnableC5228j, jMax - System.currentTimeMillis());
                        }
                    } else if (c11245p.m12623b()) {
                        int i10 = Build.VERSION.SDK_INT;
                        C6998d c6998d = c11245p.f34050j;
                        if (c6998d.f22394c) {
                            C7011q.m7408d().m7410a(f23934A0, "Ignoring " + c11245p + ". Requires device idle.");
                        } else if (i10 < 24 || !c6998d.m7400a()) {
                            hashSet.add(c11245p);
                            hashSet2.add(c11245p.f34041a);
                        } else {
                            C7011q.m7408d().m7410a(f23934A0, "Ignoring " + c11245p + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f23940r0.m12664e(AbstractC7873E0.m8151b(c11245p))) {
                        C7011q.m7408d().m7410a(f23934A0, "Starting work for " + c11245p.f34041a);
                        C11248s c11248s = this.f23940r0;
                        c11248s.getClass();
                        C7246k c7246kM12674w = c11248s.m12674w(AbstractC7873E0.m8151b(c11245p));
                        this.f23948z0.m7913b(c7246kM12674w);
                        C11241l c11241l = this.f23942t0;
                        ((C13285a) c11241l.f34017Z).m14897a(new RunnableC7757e((C7241f) c11241l.f34016Y, c7246kM12674w, (C15358g1) null));
                    }
                }
            }
        }
        synchronized (this.f23939q0) {
            try {
                if (!hashSet.isEmpty()) {
                    C7011q.m7408d().m7410a(f23934A0, "Starting tracking for " + TextUtils.join(Separators.COMMA, hashSet2));
                    for (C11245p c11245p2 : hashSet) {
                        C11239j c11239jM8151b = AbstractC7873E0.m8151b(c11245p2);
                        if (!this.f23936Z.containsKey(c11239jM8151b)) {
                            this.f23936Z.put(c11239jM8151b, AbstractC9050h.m9609a(this.f23946x0, c11245p2, this.f23947y0.f41991b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p470T4.InterfaceC7238c
    /* JADX INFO: renamed from: d */
    public final void mo7639d(C11239j c11239j, boolean z6) {
        C7246k c7246kM12672u = this.f23940r0.m12672u(c11239j);
        if (c7246kM12672u != null) {
            this.f23948z0.m7912a(c7246kM12672u);
        }
        m7910f(c11239j);
        if (z6) {
            return;
        }
        synchronized (this.f23939q0) {
            this.f23944v0.remove(c11239j);
        }
    }

    @Override // p470T4.InterfaceC7243h
    /* JADX INFO: renamed from: e */
    public final void mo7653e(String str) {
        Runnable runnable;
        if (this.f23945w0 == null) {
            this.f23945w0 = Boolean.valueOf(AbstractC11656i.m13019a(this.f23935Y, this.f23943u0));
        }
        boolean zBooleanValue = this.f23945w0.booleanValue();
        String str2 = f23934A0;
        if (!zBooleanValue) {
            C7011q.m7408d().m7413e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f23938p0) {
            this.f23941s0.m7641a(this);
            this.f23938p0 = true;
        }
        C7011q.m7408d().m7410a(str2, "Cancelling work ID " + str);
        C7555a c7555a = this.f23937o0;
        if (c7555a != null && (runnable = (Runnable) c7555a.f23931d.remove(str)) != null) {
            c7555a.f23929b.f2050a.removeCallbacks(runnable);
        }
        for (C7246k c7246k : this.f23940r0.m12673v(str)) {
            this.f23948z0.m7912a(c7246k);
            C11241l c11241l = this.f23942t0;
            c11241l.getClass();
            c11241l.m12592M(c7246k, -512);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7910f(C11239j c11239j) {
        InterfaceC0627n0 interfaceC0627n0;
        synchronized (this.f23939q0) {
            interfaceC0627n0 = (InterfaceC0627n0) this.f23936Z.remove(c11239j);
        }
        if (interfaceC0627n0 != null) {
            C7011q.m7408d().m7410a(f23934A0, "Stopping tracking for " + c11239j);
            interfaceC0627n0.mo1275e(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m7911g(C11245p c11245p) {
        long jMax;
        synchronized (this.f23939q0) {
            try {
                C11239j c11239jM8151b = AbstractC7873E0.m8151b(c11245p);
                C7556b c7556b = (C7556b) this.f23944v0.get(c11239jM8151b);
                if (c7556b == null) {
                    int i10 = c11245p.f34051k;
                    this.f23943u0.f22379c.getClass();
                    c7556b = new C7556b(i10, System.currentTimeMillis());
                    this.f23944v0.put(c11239jM8151b, c7556b);
                }
                jMax = (((long) Math.max((c11245p.f34051k - c7556b.f23932a) - 5, 0)) * 30000) + c7556b.f23933b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }
}
