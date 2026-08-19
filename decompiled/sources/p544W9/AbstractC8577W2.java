package p544W9;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC11112u;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p124Ei.C2550w0;
import p277L.AbstractC4835h;
import p277L.ExecutorC4828a;
import p277L.ExecutorC4833f;
import p277L.ExecutorC4834g;
import p277L.ScheduledExecutorServiceC4831d;
import p339Nf.C5740v;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p482Tg.C7448e;
import p772h.C14215F;
import p772h.InterfaceC14216G;
import p795i.AbstractC14892f;
import p795i.C14889c;

/* JADX INFO: renamed from: W9.W2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8577W2 {
    /* JADX INFO: renamed from: a */
    public static final void m9239a(int i10, int i11, InterfaceC1426a interfaceC1426a, C6021p c6021p, boolean z6) {
        int i12;
        c6021p.m6526U(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC1426a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                z6 = true;
            }
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1426a, c6021p);
            c6021p.m6525T(-971159753);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C14889c(z6, interfaceC5985XM6435V);
                c6021p.m6537c0(objM6514H);
            }
            C14889c c14889c = (C14889c) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6525T(-971159481);
            boolean zM6542f = c6021p.m6542f(c14889c) | c6021p.m6544g(z6);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == c5975s) {
                objM6514H2 = new C2550w0(c14889c, z6, 4);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6454j((InterfaceC1426a) objM6514H2, c6021p);
            InterfaceC14216G interfaceC14216GM16066a = AbstractC14892f.m16066a(c6021p);
            if (interfaceC14216GM16066a == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C14215F c14215fMo10191a = interfaceC14216GM16066a.mo10191a();
            InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c6021p.m6525T(-971159120);
            boolean zM6542f2 = c6021p.m6542f(c14215fMo10191a) | c6021p.m6542f(interfaceC11112u) | c6021p.m6542f(c14889c);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == c5975s) {
                objM6514H3 = new C7448e(c14215fMo10191a, interfaceC11112u, c14889c, 25);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6446d(interfaceC11112u, c14215fMo10191a, (InterfaceC1436k) objM6514H3, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5740v(z6, interfaceC1426a, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorC4828a m9240b() {
        if (ExecutorC4828a.f15721Z != null) {
            return ExecutorC4828a.f15721Z;
        }
        synchronized (ExecutorC4828a.class) {
            try {
                if (ExecutorC4828a.f15721Z == null) {
                    ExecutorC4828a.f15721Z = new ExecutorC4828a(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ExecutorC4828a.f15721Z;
    }

    /* JADX INFO: renamed from: c */
    public static ExecutorC4833f m9241c() {
        if (ExecutorC4833f.f15731o0 != null) {
            return ExecutorC4833f.f15731o0;
        }
        synchronized (ExecutorC4833f.class) {
            try {
                if (ExecutorC4833f.f15731o0 == null) {
                    ExecutorC4833f.f15731o0 = new ExecutorC4833f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ExecutorC4833f.f15731o0;
    }

    /* JADX INFO: renamed from: d */
    public static ExecutorC4834g m9242d() {
        if (ExecutorC4834g.f15734o0 != null) {
            return ExecutorC4834g.f15734o0;
        }
        synchronized (ExecutorC4834g.class) {
            try {
                if (ExecutorC4834g.f15734o0 == null) {
                    ExecutorC4834g.f15734o0 = new ExecutorC4834g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ExecutorC4834g.f15734o0;
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledExecutorServiceC4831d m9243e() {
        if (AbstractC4835h.f15737a != null) {
            return AbstractC4835h.f15737a;
        }
        synchronized (AbstractC4835h.class) {
            try {
                if (AbstractC4835h.f15737a == null) {
                    AbstractC4835h.f15737a = new ScheduledExecutorServiceC4831d(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return AbstractC4835h.f15737a;
    }
}
