package p301M;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.C10808o;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.Worker;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import leakcanary.KeyedWeakReference;
import mm.C17296C;
import p001A.C0017I0;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p025An.C0624m;
import p030B2.RunnableC0758g0;
import p038Ba.AbstractC0865o;
import p084D4.C1914g;
import p084D4.C1938s;
import p084D4.RunnableC1910e;
import p1009s9.C19506i;
import p1060v9.AbstractC20502t;
import p110E4.C2307e;
import p153Fn.AbstractC2923a;
import p153Fn.C2929g;
import p164G8.C3012f;
import p164G8.RunnableC3011e;
import p277L.ExecutorC4828a;
import p310M9.C5310d;
import p310M9.C5311e;
import p401Qb.C6584a;
import p444S4.AbstractC7009o;
import p444S4.C7002h;
import p444S4.C7011q;
import p470T4.RunnableC7256u;
import p495U4.C7555a;
import p499U9.AbstractC7584n;
import p499U9.AbstractC7590t;
import p501Ub.C7609k;
import p501Ub.EnumC7610l;
import p501Ub.ExecutorC7613o;
import p501Ub.RunnableC7614p;
import p523V9.AbstractC7873E0;
import p523V9.C8058c0;
import p523V9.C8074e0;
import p523V9.C8129l;
import p523V9.C8137m;
import p523V9.C8153o;
import p523V9.C8174q4;
import p523V9.C8177r;
import p523V9.C8182r4;
import p523V9.C8232x6;
import p523V9.EnumC7893G4;
import p523V9.EnumC7909I4;
import p566X4.AbstractC9050h;
import p571X9.AbstractC9233X;
import p571X9.C9173M4;
import p571X9.C9192Q;
import p571X9.C9203S;
import p571X9.C9255a3;
import p571X9.C9269d;
import p571X9.C9275e;
import p571X9.C9299i;
import p571X9.EnumC9357r3;
import p571X9.EnumC9369t3;
import p594Y9.C9788P4;
import p594Y9.C9862c;
import p594Y9.C9869d;
import p594Y9.C9887f3;
import p594Y9.C9891g0;
import p594Y9.C9896h;
import p594Y9.C9897h0;
import p594Y9.EnumC9960r3;
import p594Y9.EnumC9972t3;
import p604Yk.C10077b;
import p610Z1.AbstractC10141h;
import p610Z1.C10142i;
import p615Z6.C10252z0;
import p619Zb.C10273f;
import p639a5.C10502a;
import p658b5.C11242m;
import p658b5.C11245p;
import p674c5.C11661n;
import p674c5.RunnableC11660m;
import p697d5.C13018a;
import p697d5.C13027j;
import p704dc.C13065f;
import p746fa.AbstractC13600i;
import p746fa.C13597f;
import p746fa.C13599h;
import p746fa.C13602k;
import p746fa.C13603l;
import p746fa.C13606o;
import p746fa.InterfaceC13593b;
import p746fa.InterfaceC13594c;
import p746fa.InterfaceC13595d;
import p746fa.InterfaceC13596e;
import p746fa.InterfaceC13598g;
import p747fb.InterfaceFutureC13608b;
import p748fc.C13610b;
import p771go.C14205d;
import p817j$.util.DesugarCollections;
import p868l9.C16833a;
import p972qm.C18777j;

/* JADX INFO: renamed from: M.j */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5228j implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16974Y;

    /* JADX INFO: renamed from: Z */
    public Object f16975Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f16976o0;

    public /* synthetic */ RunnableC5228j(C8232x6 c8232x6, C10808o c10808o) {
        this.f16974Y = 15;
        EnumC7909I4 enumC7909I4 = EnumC7909I4.UNKNOWN_EVENT;
        this.f16975Z = c8232x6;
        this.f16976o0 = c10808o;
    }

    /* JADX INFO: renamed from: a */
    private final void m5767a() {
        C11245p c11245pM7643c = ((C10502a) this.f16976o0).f31111Y.f23001f.m7643c((String) this.f16975Z);
        if (c11245pM7643c == null || !c11245pM7643c.m12623b()) {
            return;
        }
        synchronized (((C10502a) this.f16976o0).f31113o0) {
            ((C10502a) this.f16976o0).f31116r0.put(AbstractC7873E0.m8151b(c11245pM7643c), c11245pM7643c);
            C10502a c10502a = (C10502a) this.f16976o0;
            ((C10502a) this.f16976o0).f31117s0.put(AbstractC7873E0.m8151b(c11245pM7643c), AbstractC9050h.m9609a(c10502a.f31118t0, c11245pM7643c, c10502a.f31112Z.f41991b, c10502a));
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m5768b() {
        try {
            ((Runnable) this.f16976o0).run();
            synchronized (((ExecutorC7613o) this.f16975Z).f24065q0) {
                ((ExecutorC7613o) this.f16975Z).m7960c();
            }
        } catch (Throwable th2) {
            synchronized (((ExecutorC7613o) this.f16975Z).f24065q0) {
                ((ExecutorC7613o) this.f16975Z).m7960c();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m5769c() {
        if (((RunnableC11660m) this.f16976o0).f35310Y.f41326Y instanceof C13018a) {
            return;
        }
        try {
            C7002h c7002h = (C7002h) ((C13027j) this.f16975Z).get();
            if (c7002h == null) {
                throw new IllegalStateException("Worker was marked important (" + ((RunnableC11660m) this.f16976o0).f35312o0.f34043c + ") but did not provide ForegroundInfo");
            }
            C7011q.m7408d().m7410a(RunnableC11660m.f35309s0, "Updating notification for " + ((RunnableC11660m) this.f16976o0).f35312o0.f34043c);
            RunnableC11660m runnableC11660m = (RunnableC11660m) this.f16976o0;
            C13027j c13027j = runnableC11660m.f35310Y;
            C11661n c11661n = runnableC11660m.f35314q0;
            Context context = runnableC11660m.f35311Z;
            UUID uuid = runnableC11660m.f35313p0.f22417Z.f33696a;
            c11661n.getClass();
            C13027j c13027j2 = new C13027j();
            c11661n.f35316a.m14897a(new RunnableC7614p(c11661n, c13027j2, uuid, c7002h, context));
            c13027j.m14771m(c13027j2);
        } catch (Throwable th2) {
            ((RunnableC11660m) this.f16976o0).f35310Y.m14770l(th2);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m5770d() {
        if (((C13606o) this.f16975Z).f42985d) {
            ((C13602k) this.f16976o0).f42975p0.m15136o();
            return;
        }
        try {
            ((C13602k) this.f16976o0).f42975p0.m15135n(((C13602k) this.f16976o0).f42974o0.mo253L((C13606o) this.f16975Z));
        } catch (C13597f e10) {
            if (e10.getCause() instanceof Exception) {
                ((C13602k) this.f16976o0).f42975p0.m15134m((Exception) e10.getCause());
            } else {
                ((C13602k) this.f16976o0).f42975p0.m15134m(e10);
            }
        } catch (Exception e11) {
            ((C13602k) this.f16976o0).f42975p0.m15134m(e11);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m5771e() {
        C13602k c13602k = (C13602k) this.f16976o0;
        try {
            C13606o c13606o = (C13606o) c13602k.f42974o0.mo253L((C13606o) this.f16975Z);
            if (c13606o == null) {
                c13602k.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            ExecutorC4828a executorC4828a = AbstractC13600i.f42963b;
            c13606o.m15126e(executorC4828a, c13602k);
            c13606o.m15125d(executorC4828a, c13602k);
            c13606o.f42983b.m338B(new C13603l(executorC4828a, (InterfaceC13593b) c13602k));
            c13606o.m15139r();
        } catch (C13597f e10) {
            if (e10.getCause() instanceof Exception) {
                c13602k.f42975p0.m15134m((Exception) e10.getCause());
            } else {
                c13602k.f42975p0.m15134m(e10);
            }
        } catch (Exception e11) {
            c13602k.f42975p0.m15134m(e11);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m5772f() {
        synchronized (((C13603l) this.f16976o0).f42977Z) {
            ((InterfaceC13594c) ((C13603l) this.f16976o0).f42979p0).mo258t((C13606o) this.f16975Z);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m5773g() {
        synchronized (((C13603l) this.f16976o0).f42977Z) {
            try {
                InterfaceC13595d interfaceC13595d = (InterfaceC13595d) ((C13603l) this.f16976o0).f42979p0;
                if (interfaceC13595d != null) {
                    Exception excM15129h = ((C13606o) this.f16975Z).m15129h();
                    AbstractC20502t.m21157h(excM15129h);
                    interfaceC13595d.onFailure(excM15129h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m5774h() {
        synchronized (((C13603l) this.f16976o0).f42977Z) {
            try {
                InterfaceC13596e interfaceC13596e = (InterfaceC13596e) ((C13603l) this.f16976o0).f42979p0;
                if (interfaceC13596e != null) {
                    interfaceC13596e.onSuccess(((C13606o) this.f16975Z).m15130i());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m5775i() {
        C13603l c13603l = (C13603l) this.f16976o0;
        try {
            C13606o c13606oMo272z = ((InterfaceC13598g) c13603l.f42977Z).mo272z(((C13606o) this.f16975Z).m15130i());
            ExecutorC4828a executorC4828a = AbstractC13600i.f42963b;
            c13606oMo272z.m15126e(executorC4828a, c13603l);
            c13606oMo272z.m15125d(executorC4828a, c13603l);
            c13606oMo272z.f42983b.m338B(new C13603l(executorC4828a, (InterfaceC13593b) c13603l));
            c13606oMo272z.m15139r();
        } catch (C13597f e10) {
            if (e10.getCause() instanceof Exception) {
                c13603l.onFailure((Exception) e10.getCause());
            } else {
                c13603l.onFailure(e10);
            }
        } catch (CancellationException unused) {
            c13603l.mo3916e();
        } catch (Exception e11) {
            c13603l.onFailure(e11);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m5776j() {
        C13606o c13606o = (C13606o) this.f16975Z;
        try {
            c13606o.m15135n(((Callable) this.f16976o0).call());
        } catch (Exception e10) {
            c13606o.m15134m(e10);
        } catch (Throwable th2) {
            c13606o.m15134m(new RuntimeException(th2));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyedWeakReference keyedWeakReference;
        double d10 = 100.0d;
        long j10 = Long.MAX_VALUE;
        int i10 = 3;
        C8153o c8153o = null;
        try {
            switch (this.f16974Y) {
                case 0:
                    InterfaceC5221c interfaceC5221c = (InterfaceC5221c) this.f16976o0;
                    try {
                        interfaceC5221c.onSuccess(AbstractC5229k.m5777a((InterfaceFutureC13608b) this.f16975Z));
                        return;
                    } catch (Error e10) {
                        e = e10;
                        interfaceC5221c.mo3912J(e);
                        return;
                    } catch (RuntimeException e11) {
                        e = e11;
                        interfaceC5221c.mo3912J(e);
                        return;
                    } catch (ExecutionException e12) {
                        Throwable cause = e12.getCause();
                        if (cause == null) {
                            interfaceC5221c.mo3912J(e12);
                            return;
                        } else {
                            interfaceC5221c.mo3912J(cause);
                            return;
                        }
                    }
                case 1:
                    ((C0624m) this.f16976o0).m1253D((C0611f0) this.f16975Z, C17296C.f55119a);
                    return;
                case 2:
                    Object obj = ((WeakReference) this.f16975Z).get();
                    if (obj != null) {
                        ((C3012f) this.f16976o0).getClass();
                        ((RunnableC3011e) obj).run();
                        return;
                    }
                    return;
                case 3:
                    RunnableC1910e runnableC1910e = (RunnableC1910e) this.f16976o0;
                    C1914g c1914g = runnableC1910e.f5585p0;
                    if (c1914g.f5603g == runnableC1910e.f5584o0) {
                        List list = runnableC1910e.f5583Z;
                        c1914g.f5601e = list;
                        c1914g.f5602f = DesugarCollections.unmodifiableList(list);
                        ((C1938s) this.f16975Z).m3111a(c1914g.f5597a);
                        c1914g.m3039a();
                        return;
                    }
                    return;
                case 4:
                    int i11 = 0;
                    while (true) {
                        try {
                            ((Runnable) this.f16975Z).run();
                        } catch (Throwable th2) {
                            AbstractC0575H.m1194w(C18777j.f59682Y, th2);
                        }
                        C2929g c2929g = (C2929g) this.f16976o0;
                        Runnable runnableM3747Z0 = c2929g.m3747Z0();
                        if (runnableM3747Z0 == null) {
                            return;
                        }
                        this.f16975Z = runnableM3747Z0;
                        i11++;
                        if (i11 >= 16 && AbstractC2923a.m3738l(c2929g.f8779o0, c2929g)) {
                            AbstractC2923a.m3737k(c2929g.f8779o0, c2929g, this);
                            return;
                        }
                        break;
                    }
                    break;
                case 5:
                    try {
                        RunnableC5220b runnableC5220b = (RunnableC5220b) this.f16976o0;
                        Object objM5778b = AbstractC5229k.m5778b((InterfaceFutureC13608b) this.f16975Z);
                        C10142i c10142i = runnableC5220b.f16960Z;
                        if (c10142i != null) {
                            c10142i.m10747a(objM5778b);
                        }
                        break;
                    } catch (CancellationException unused) {
                        ((RunnableC5220b) this.f16976o0).cancel(false);
                    } catch (ExecutionException e13) {
                        RunnableC5220b runnableC5220b2 = (RunnableC5220b) this.f16976o0;
                        Throwable cause2 = e13.getCause();
                        C10142i c10142i2 = runnableC5220b2.f16960Z;
                        if (c10142i2 != null) {
                            c10142i2.m10748b(cause2);
                        }
                    }
                    return;
                case 6:
                    C5311e c5311e = (C5311e) this.f16975Z;
                    Context context = (Context) c5311e.f17484Z;
                    String string = C5311e.m5843G(context).getString("app_set_id", null);
                    long j11 = C5311e.m5843G((Context) c5311e.f17484Z).getLong("app_set_id_last_used_time", -1L);
                    long j12 = j11 != -1 ? j11 + 33696000000L : -1L;
                    C13599h c13599h = (C13599h) this.f16976o0;
                    if (string != null && System.currentTimeMillis() <= j12) {
                        try {
                            C5311e.m5844H(context);
                        } catch (C5310d e14) {
                            c13599h.m15113a(e14);
                            return;
                        }
                        break;
                    } else {
                        string = UUID.randomUUID().toString();
                        try {
                            if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                                String strValueOf = String.valueOf(context.getPackageName());
                                AbstractC15256t.m16465c("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                                throw new C5310d("Failed to store the app set ID.");
                            }
                            C5311e.m5844H(context);
                            if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                                String strValueOf2 = String.valueOf(context.getPackageName());
                                AbstractC15256t.m16465c("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                                throw new C5310d("Failed to store the app set ID creation time.");
                            }
                        } catch (C5310d e15) {
                            c13599h.m15113a(e15);
                            return;
                        }
                    }
                    c13599h.m15114b(new C16833a(string));
                    return;
                case 7:
                    try {
                        ((Worker) this.f16976o0).getClass();
                        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                    } catch (Throwable th3) {
                        ((C13027j) this.f16975Z).m14770l(th3);
                        return;
                    }
                case 8:
                    if (((RunnableC7256u) this.f16976o0).f23009B0.f41326Y instanceof C13018a) {
                        return;
                    }
                    try {
                        ((C13027j) this.f16975Z).get();
                        C7011q.m7408d().m7410a(RunnableC7256u.f23007D0, "Starting work for " + ((RunnableC7256u) this.f16976o0).f23013o0.f34043c);
                        RunnableC7256u runnableC7256u = (RunnableC7256u) this.f16976o0;
                        runnableC7256u.f23009B0.m14771m(runnableC7256u.f23014p0.mo7406d());
                        return;
                    } catch (Throwable th4) {
                        ((RunnableC7256u) this.f16976o0).f23009B0.m14770l(th4);
                        return;
                    }
                case 9:
                    String str = (String) this.f16975Z;
                    RunnableC7256u runnableC7256u2 = (RunnableC7256u) this.f16976o0;
                    try {
                        try {
                            AbstractC7009o abstractC7009o = (AbstractC7009o) runnableC7256u2.f23009B0.get();
                            if (abstractC7009o == null) {
                                C7011q.m7408d().m7411b(RunnableC7256u.f23007D0, runnableC7256u2.f23013o0.f34043c + " returned a null result. Treating it as a failure.");
                            } else {
                                C7011q.m7408d().m7410a(RunnableC7256u.f23007D0, runnableC7256u2.f23013o0.f34043c + " returned a " + abstractC7009o + Separators.DOT);
                                runnableC7256u2.f23016r0 = abstractC7009o;
                            }
                        } catch (Throwable th5) {
                            runnableC7256u2.m7699b();
                            throw th5;
                        }
                        break;
                    } catch (InterruptedException e16) {
                        e = e16;
                        C7011q.m7408d().m7412c(RunnableC7256u.f23007D0, str + " failed because it threw an exception/error", e);
                    } catch (CancellationException e17) {
                        C7011q c7011qM7408d = C7011q.m7408d();
                        String str2 = RunnableC7256u.f23007D0;
                        String str3 = str + " was cancelled";
                        if (c7011qM7408d.f22422a <= 4) {
                            Log.i(str2, str3, e17);
                        }
                    } catch (ExecutionException e18) {
                        e = e18;
                        C7011q.m7408d().m7412c(RunnableC7256u.f23007D0, str + " failed because it threw an exception/error", e);
                    }
                    runnableC7256u2.m7699b();
                    return;
                case 10:
                    C7011q c7011qM7408d2 = C7011q.m7408d();
                    String str4 = C7555a.f23927e;
                    StringBuilder sb2 = new StringBuilder("Scheduling work ");
                    C11245p c11245p = (C11245p) this.f16975Z;
                    sb2.append(c11245p.f34041a);
                    c7011qM7408d2.m7410a(str4, sb2.toString());
                    ((C7555a) this.f16976o0).f23928a.mo7652c(c11245p);
                    return;
                case 11:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.f16975Z;
                    while (!((Set) this.f16976o0).isEmpty()) {
                        try {
                            C7609k c7609k = (C7609k) referenceQueue.remove();
                            if (c7609k.f24054a.remove(c7609k)) {
                                c7609k.clear();
                                c7609k.f24055b.getClass();
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                    return;
                case 12:
                    Callable callable = (Callable) this.f16975Z;
                    C13599h c13599h2 = (C13599h) this.f16976o0;
                    try {
                        c13599h2.m15114b(callable.call());
                        return;
                    } catch (C6584a e19) {
                        c13599h2.m15113a(e19);
                        return;
                    } catch (Exception e20) {
                        c13599h2.m15113a(new C6584a(13, e20, "Internal error has occurred when executing ML Kit tasks"));
                        return;
                    }
                case 13:
                    AbstractC0865o abstractC0865o = (AbstractC0865o) this.f16975Z;
                    int iDecrementAndGet = ((AtomicInteger) abstractC0865o.f2432b).decrementAndGet();
                    AbstractC20502t.m21160k(iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        abstractC0865o.mo1941n();
                        ((AtomicBoolean) abstractC0865o.f2433c).set(false);
                    }
                    AbstractC7584n.f24005Y.clear();
                    AbstractC7590t.f24012a.clear();
                    ((C13599h) this.f16976o0).m15114b(null);
                    return;
                case 14:
                    Runnable runnable = (Runnable) this.f16976o0;
                    C2307e c2307e = (C2307e) this.f16975Z;
                    AbstractC20502t.m21160k(((Thread) ((AtomicReference) c2307e.f7161q0).getAndSet(Thread.currentThread())) == null);
                    try {
                        runnable.run();
                        ((AtomicReference) c2307e.f7161q0).set(null);
                        c2307e.mo2432c();
                        return;
                    } catch (Throwable th6) {
                        try {
                            ((AtomicReference) c2307e.f7161q0).set(null);
                            c2307e.mo2432c();
                            throw th6;
                        } catch (Throwable th7) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                throw th6;
                            } catch (Exception unused3) {
                                throw th6;
                            }
                        }
                    }
                case 15:
                    C8232x6 c8232x6 = (C8232x6) this.f16975Z;
                    HashMap map = c8232x6.f25709j;
                    EnumC7909I4 enumC7909I4 = EnumC7909I4.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                    C8177r c8177r = (C8177r) map.get(enumC7909I4);
                    if (c8177r != null) {
                        C8129l c8129l = c8177r.f25594Y;
                        if (c8129l == null) {
                            c8129l = new C8129l(c8177r, c8177r.f25620o0);
                            c8177r.f25594Y = c8129l;
                        }
                        for (Object obj2 : c8129l) {
                            Object arrayList = (Collection) c8177r.f25620o0.get(obj2);
                            if (arrayList == null) {
                                arrayList = new ArrayList(3);
                            }
                            List list2 = (List) arrayList;
                            ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new C8137m(c8177r, obj2, list2, null) : new C8153o(c8177r, obj2, list2, (C8153o) null));
                            Collections.sort(arrayList2);
                            C8174q4 c8174q4 = new C8174q4();
                            Iterator it = arrayList2.iterator();
                            long jLongValue = 0;
                            while (it.hasNext()) {
                                jLongValue = ((Long) it.next()).longValue() + jLongValue;
                            }
                            c8174q4.f25601c = Long.valueOf((jLongValue / ((long) arrayList2.size())) & j10);
                            c8174q4.f25599a = Long.valueOf(C8232x6.m8869a(arrayList2, 100.0d) & j10);
                            c8174q4.f25604f = Long.valueOf(C8232x6.m8869a(arrayList2, 75.0d) & j10);
                            c8174q4.f25603e = Long.valueOf(C8232x6.m8869a(arrayList2, 50.0d) & j10);
                            c8174q4.f25602d = Long.valueOf(C8232x6.m8869a(arrayList2, 25.0d) & j10);
                            c8174q4.f25600b = Long.valueOf(C8232x6.m8869a(arrayList2, 0.0d) & j10);
                            C8182r4 c8182r4 = new C8182r4(c8174q4);
                            int size = arrayList2.size();
                            C10808o c10808o = (C10808o) this.f16976o0;
                            C8058c0 c8058c0 = (C8058c0) obj2;
                            C10252z0 c10252z0 = new C10252z0();
                            c10252z0.f30456o0 = ((C10273f) c10808o.f32040Z).f30516i ? EnumC7893G4.TYPE_THICK : EnumC7893G4.TYPE_THIN;
                            C11242m c11242m = new C11242m();
                            c11242m.f34019Z = Integer.valueOf(size & Integer.MAX_VALUE);
                            c11242m.f34018Y = c8058c0;
                            c11242m.f34020o0 = c8182r4;
                            c10252z0.f30459r0 = new C8074e0(c11242m);
                            EnumC7610l.f24056Y.execute(new RunnableC0758g0(c8232x6, new C0420b(c10252z0, 0), enumC7909I4, c8232x6.m8871c(), 1));
                            j10 = Long.MAX_VALUE;
                        }
                        map.remove(enumC7909I4);
                        return;
                    }
                    return;
                case 16:
                    C9173M4 c9173m4 = (C9173M4) this.f16975Z;
                    HashMap map2 = c9173m4.f27962j;
                    EnumC9369t3 enumC9369t3 = EnumC9369t3.AGGREGATED_ON_DEVICE_FACE_DETECTION;
                    C9299i c9299i = (C9299i) map2.get(enumC9369t3);
                    if (c9299i != null) {
                        C9269d c9269d = c9299i.f28078Y;
                        if (c9269d == null) {
                            c9269d = new C9269d(c9299i, c9299i.f28088o0);
                            c9299i.f28078Y = c9269d;
                        }
                        for (Object obj3 : c9269d) {
                            Object arrayList3 = (Collection) c9299i.f28088o0.get(obj3);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList(3);
                            }
                            List list3 = (List) arrayList3;
                            ArrayList arrayList4 = new ArrayList(list3 instanceof RandomAccess ? new C9275e(c9299i, obj3, list3, null) : new C8153o(c9299i, obj3, list3, (C8153o) null));
                            Collections.sort(arrayList4);
                            C8174q4 c8174q5 = new C8174q4();
                            Iterator it2 = arrayList4.iterator();
                            long jLongValue2 = 0;
                            while (it2.hasNext()) {
                                jLongValue2 += ((Long) it2.next()).longValue();
                            }
                            c8174q5.f25601c = Long.valueOf((jLongValue2 / ((long) arrayList4.size())) & Long.MAX_VALUE);
                            c8174q5.f25599a = Long.valueOf(C9173M4.m9725a(arrayList4, 100.0d) & Long.MAX_VALUE);
                            c8174q5.f25604f = Long.valueOf(C9173M4.m9725a(arrayList4, 75.0d) & Long.MAX_VALUE);
                            c8174q5.f25603e = Long.valueOf(C9173M4.m9725a(arrayList4, 50.0d) & Long.MAX_VALUE);
                            c8174q5.f25602d = Long.valueOf(C9173M4.m9725a(arrayList4, 25.0d) & Long.MAX_VALUE);
                            c8174q5.f25600b = Long.valueOf(C9173M4.m9725a(arrayList4, 0.0d) & Long.MAX_VALUE);
                            C9255a3 c9255a3 = new C9255a3(c8174q5);
                            int size2 = arrayList4.size();
                            C19506i c19506i = (C19506i) this.f16976o0;
                            C9192Q c9192q = (C9192Q) obj3;
                            C0017I0 c0017i0 = new C0017I0();
                            c0017i0.f66o0 = ((C13065f) c19506i.f61960Z).f41505h ? EnumC9357r3.TYPE_THICK : EnumC9357r3.TYPE_THIN;
                            C11242m c11242m2 = new C11242m();
                            c11242m2.f34019Z = Integer.valueOf(size2 & Integer.MAX_VALUE);
                            c11242m2.f34018Y = c9192q;
                            c11242m2.f34020o0 = c9255a3;
                            c0017i0.f69r0 = new C9203S(c11242m2);
                            EnumC7610l.f24056Y.execute(new RunnableC0758g0(c9173m4, new C0420b(c0017i0, 0), enumC9369t3, c9173m4.m9727c(), 3));
                        }
                        map2.remove(enumC9369t3);
                        return;
                    }
                    return;
                case 17:
                    C9788P4 c9788p4 = (C9788P4) this.f16975Z;
                    HashMap map3 = c9788p4.f29310j;
                    EnumC9972t3 enumC9972t3 = EnumC9972t3.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
                    C9896h c9896h = (C9896h) map3.get(enumC9972t3);
                    if (c9896h != null) {
                        C9862c c9862c = c9896h.f29402Y;
                        if (c9862c == null) {
                            c9862c = new C9862c(c9896h, c9896h.f29410o0);
                            c9896h.f29402Y = c9862c;
                        }
                        for (Object obj4 : c9862c) {
                            Object arrayList5 = (Collection) c9896h.f29410o0.get(obj4);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList(i10);
                            }
                            List list4 = (List) arrayList5;
                            ArrayList arrayList6 = new ArrayList(list4 instanceof RandomAccess ? new C9869d(c9896h, obj4, list4, c8153o) : new C8153o(c9896h, obj4, list4, c8153o));
                            Collections.sort(arrayList6);
                            C8174q4 c8174q6 = new C8174q4();
                            Iterator it3 = arrayList6.iterator();
                            long jLongValue3 = 0;
                            while (it3.hasNext()) {
                                jLongValue3 = ((Long) it3.next()).longValue() + jLongValue3;
                            }
                            c8174q6.f25601c = Long.valueOf((jLongValue3 / ((long) arrayList6.size())) & Long.MAX_VALUE);
                            c8174q6.f25599a = Long.valueOf(C9788P4.m10403a(arrayList6, d10) & Long.MAX_VALUE);
                            c8174q6.f25604f = Long.valueOf(C9788P4.m10403a(arrayList6, 75.0d) & Long.MAX_VALUE);
                            c8174q6.f25603e = Long.valueOf(C9788P4.m10403a(arrayList6, 50.0d) & Long.MAX_VALUE);
                            c8174q6.f25602d = Long.valueOf(C9788P4.m10403a(arrayList6, 25.0d) & Long.MAX_VALUE);
                            c8174q6.f25600b = Long.valueOf(C9788P4.m10403a(arrayList6, 0.0d) & Long.MAX_VALUE);
                            C9887f3 c9887f3 = new C9887f3(c8174q6);
                            int size3 = arrayList6.size();
                            C10077b c10077b = (C10077b) this.f16976o0;
                            C9891g0 c9891g0 = (C9891g0) obj4;
                            C10252z0 c10252z1 = new C10252z0();
                            c10252z1.f30456o0 = ((C13610b) c10077b.f29833Z).f42996g.m15474a() ? EnumC9960r3.TYPE_THICK : EnumC9960r3.TYPE_THIN;
                            C13711h c13711h = new C13711h(18, false);
                            c13711h.f43260o0 = Integer.valueOf(size3 & Integer.MAX_VALUE);
                            c13711h.f43259Z = c9891g0;
                            c13711h.f43261p0 = c9887f3;
                            c10252z1.f30459r0 = new C9897h0(c13711h);
                            EnumC7610l.f24056Y.execute(new RunnableC0758g0(c9788p4, new C0420b(c10252z1, 0, (byte) 0), enumC9972t3, c9788p4.m10405c(), 4));
                            d10 = 100.0d;
                            i10 = 3;
                            c8153o = null;
                        }
                        map3.remove(enumC9972t3);
                        return;
                    }
                    return;
                case 18:
                    C13027j c13027j = (C13027j) this.f16975Z;
                    boolean z6 = c13027j.f41326Y instanceof C13018a;
                    C0624m c0624m = (C0624m) this.f16976o0;
                    if (z6) {
                        c0624m.mo1244b(null);
                        return;
                    }
                    try {
                        c0624m.resumeWith(AbstractC10141h.m10740h(c13027j));
                        return;
                    } catch (ExecutionException e21) {
                        Throwable cause3 = e21.getCause();
                        if (cause3 != null) {
                            c0624m.resumeWith(AbstractC9233X.m9806b(cause3));
                            return;
                        } else {
                            AbstractC16544l.m18101n();
                            throw null;
                        }
                    }
                case 19:
                    m5767a();
                    return;
                case 20:
                    m5768b();
                    return;
                case 21:
                    m5769c();
                    return;
                case 22:
                    m5770d();
                    return;
                case 23:
                    m5771e();
                    return;
                case 24:
                    m5772f();
                    return;
                case 25:
                    m5773g();
                    return;
                case 26:
                    m5774h();
                    return;
                case 27:
                    m5775i();
                    return;
                case 28:
                    m5776j();
                    return;
                default:
                    C13711h c13711h2 = (C13711h) this.f16975Z;
                    String str5 = (String) this.f16976o0;
                    synchronized (c13711h2) {
                        do {
                            keyedWeakReference = (KeyedWeakReference) ((ReferenceQueue) c13711h2.f43261p0).poll();
                            if (keyedWeakReference != null) {
                                ((LinkedHashMap) c13711h2.f43260o0).remove(keyedWeakReference.getKey());
                            }
                        } while (keyedWeakReference != null);
                        KeyedWeakReference keyedWeakReference2 = (KeyedWeakReference) ((LinkedHashMap) c13711h2.f43260o0).get(str5);
                        if (keyedWeakReference2 != null) {
                            keyedWeakReference2.setRetainedUptimeMillis(SystemClock.uptimeMillis());
                            Iterator it4 = ((LinkedHashSet) c13711h2.f43259Z).iterator();
                            while (it4.hasNext()) {
                                ((C14205d) it4.next()).getClass();
                            }
                        }
                        break;
                    }
                    return;
            }
        } finally {
            ((RunnableC5220b) this.f16976o0).f16958s0 = null;
        }
        ((RunnableC5220b) this.f16976o0).f16958s0 = null;
    }

    public String toString() {
        switch (this.f16974Y) {
            case 0:
                return RunnableC5228j.class.getSimpleName() + Separators.COMMA + ((InterfaceC5221c) this.f16976o0);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC5228j(Object obj, int i10, Object obj2) {
        this.f16974Y = i10;
        this.f16975Z = obj;
        this.f16976o0 = obj2;
    }

    public /* synthetic */ RunnableC5228j(Object obj, Object obj2, boolean z6, int i10) {
        this.f16974Y = i10;
        this.f16976o0 = obj;
        this.f16975Z = obj2;
    }

    public RunnableC5228j(C13027j futureToObserve, C0624m c0624m) {
        this.f16974Y = 18;
        AbstractC16544l.m18095h(futureToObserve, "futureToObserve");
        this.f16975Z = futureToObserve;
        this.f16976o0 = c0624m;
    }

    public RunnableC5228j(RunnableC3011e runnableC3011e) {
        this.f16974Y = 2;
        C3012f c3012f = C3012f.f9079a;
        this.f16975Z = new WeakReference(runnableC3011e);
        this.f16976o0 = c3012f;
    }
}
