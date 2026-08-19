package p001A;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.javax.sip.C10808o;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p007A5.C0376k;
import p053C.C1487v;
import p105E.C2224c;
import p228J.AbstractC3810L;
import p228J.C3809K;
import p228J.C3847l0;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.C5226h;
import p301M.C5231m;
import p301M.C5233o;
import p301M.RunnableC5220b;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8449B;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p720e6.C13288c;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0033Q0 extends AbstractC0025M0 {

    /* JADX INFO: renamed from: b */
    public final C0017I0 f162b;

    /* JADX INFO: renamed from: c */
    public final Handler f163c;

    /* JADX INFO: renamed from: d */
    public final ExecutorC4836i f164d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorServiceC4831d f165e;

    /* JADX INFO: renamed from: f */
    public C0085r0 f166f;

    /* JADX INFO: renamed from: g */
    public C10808o f167g;

    /* JADX INFO: renamed from: h */
    public C10145l f168h;

    /* JADX INFO: renamed from: i */
    public C10142i f169i;

    /* JADX INFO: renamed from: j */
    public C5222d f170j;

    /* JADX INFO: renamed from: o */
    public final ScheduledExecutorServiceC4831d f175o;

    /* JADX INFO: renamed from: q */
    public ArrayList f177q;

    /* JADX INFO: renamed from: r */
    public C5233o f178r;

    /* JADX INFO: renamed from: s */
    public final C2224c f179s;

    /* JADX INFO: renamed from: t */
    public final C13288c f180t;

    /* JADX INFO: renamed from: u */
    public final C0095w0 f181u;

    /* JADX INFO: renamed from: v */
    public final C0376k f182v;

    /* JADX INFO: renamed from: a */
    public final Object f161a = new Object();

    /* JADX INFO: renamed from: k */
    public List f171k = null;

    /* JADX INFO: renamed from: l */
    public boolean f172l = false;

    /* JADX INFO: renamed from: m */
    public boolean f173m = false;

    /* JADX INFO: renamed from: n */
    public boolean f174n = false;

    /* JADX INFO: renamed from: p */
    public final Object f176p = new Object();

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f183w = new AtomicBoolean(false);

    public C0033Q0(C3847l0 c3847l0, C3847l0 c3847l1, C0017I0 c0017i0, ExecutorC4836i executorC4836i, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, Handler handler) {
        this.f162b = c0017i0;
        this.f163c = handler;
        this.f164d = executorC4836i;
        this.f165e = scheduledExecutorServiceC4831d;
        C2224c c2224c = new C2224c();
        c2224c.f6808a = c3847l1.m4578e(TextureViewIsClosedQuirk.class);
        c2224c.f6809b = c3847l0.m4578e(PreviewOrientationIncorrectQuirk.class);
        c2224c.f6810c = c3847l0.m4578e(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f179s = c2224c;
        this.f181u = new C0095w0(c3847l0.m4578e(CaptureSessionStuckQuirk.class) || c3847l0.m4578e(IncorrectCaptureStateQuirk.class));
        this.f180t = new C13288c(7, c3847l1);
        this.f182v = new C0376k(1, c3847l1);
        this.f175o = scheduledExecutorServiceC4831d;
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: a */
    public final void mo160a(C0033Q0 c0033q0) {
        Objects.requireNonNull(this.f166f);
        this.f166f.mo160a(c0033q0);
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: b */
    public final void mo161b(C0033Q0 c0033q0) {
        Objects.requireNonNull(this.f166f);
        this.f166f.mo161b(c0033q0);
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: c */
    public final void mo162c(C0033Q0 c0033q0) {
        synchronized (this.f176p) {
            this.f179s.m3265b(this.f177q);
        }
        m176l("onClosed()");
        m179o(c0033q0);
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: d */
    public final void mo163d(C0033Q0 c0033q0) {
        C0033Q0 c0033q1;
        Objects.requireNonNull(this.f166f);
        m181q();
        this.f181u.m360D();
        C0017I0 c0017i0 = this.f162b;
        Iterator it = c0017i0.m82t().iterator();
        while (it.hasNext() && (c0033q1 = (C0033Q0) it.next()) != this) {
            c0033q1.m181q();
            c0033q1.f181u.m360D();
        }
        synchronized (c0017i0.f65Z) {
            ((LinkedHashSet) c0017i0.f68q0).remove(this);
        }
        this.f166f.mo163d(c0033q0);
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: e */
    public final void mo164e(C0033Q0 c0033q0) {
        C0033Q0 c0033q1;
        C0033Q0 c0033q2;
        C0033Q0 c0033q3;
        m176l("Session onConfigured()");
        C13288c c13288c = this.f180t;
        ArrayList arrayListM80q = this.f162b.m80q();
        ArrayList arrayListM79p = this.f162b.m79p();
        if (((CaptureSessionOnClosedNotCalledQuirk) c13288c.f42001Y) != null) {
            LinkedHashSet<C0033Q0> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayListM80q.iterator();
            while (it.hasNext() && (c0033q3 = (C0033Q0) it.next()) != c0033q0) {
                linkedHashSet.add(c0033q3);
            }
            for (C0033Q0 c0033q4 : linkedHashSet) {
                c0033q4.getClass();
                c0033q4.mo163d(c0033q4);
            }
        }
        Objects.requireNonNull(this.f166f);
        C0017I0 c0017i0 = this.f162b;
        synchronized (c0017i0.f65Z) {
            ((LinkedHashSet) c0017i0.f66o0).add(this);
            ((LinkedHashSet) c0017i0.f68q0).remove(this);
        }
        Iterator it2 = c0017i0.m82t().iterator();
        while (it2.hasNext() && (c0033q2 = (C0033Q0) it2.next()) != this) {
            c0033q2.m181q();
            c0033q2.f181u.m360D();
        }
        this.f166f.mo164e(c0033q0);
        if (((CaptureSessionOnClosedNotCalledQuirk) c13288c.f42001Y) != null) {
            LinkedHashSet<C0033Q0> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = arrayListM79p.iterator();
            while (it3.hasNext() && (c0033q1 = (C0033Q0) it3.next()) != c0033q0) {
                linkedHashSet2.add(c0033q1);
            }
            for (C0033Q0 c0033q5 : linkedHashSet2) {
                c0033q5.getClass();
                c0033q5.mo162c(c0033q5);
            }
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: f */
    public final void mo165f(C0033Q0 c0033q0) {
        Objects.requireNonNull(this.f166f);
        this.f166f.mo165f(c0033q0);
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: g */
    public final void mo166g(C0033Q0 c0033q0) {
        C10145l c10145l;
        synchronized (this.f161a) {
            try {
                if (this.f174n) {
                    c10145l = null;
                } else {
                    this.f174n = true;
                    AbstractC4941g.m5558Q(this.f168h, "Need to call openCaptureSession before using this API.");
                    c10145l = this.f168h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c10145l != null) {
            c10145l.f30070Z.mo5766a(new RunnableC0027N0(this, c0033q0, 1), AbstractC8577W2.m9240b());
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: h */
    public final void mo167h(C0033Q0 c0033q0, Surface surface) {
        Objects.requireNonNull(this.f166f);
        this.f166f.mo167h(c0033q0, surface);
    }

    /* JADX INFO: renamed from: i */
    public final int m173i(ArrayList arrayList, C0084r c0084r) {
        CameraCaptureSession.CaptureCallback captureCallbackM368e = this.f181u.m368e(c0084r);
        AbstractC4941g.m5558Q(this.f167g, "Need to call openCaptureSession before using this API.");
        return ((C15384c) this.f167g.f32040Z).mo1474l(arrayList, this.f164d, captureCallbackM368e);
    }

    /* JADX INFO: renamed from: j */
    public final void m174j() {
        if (!this.f183w.compareAndSet(false, true)) {
            m176l("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f182v.f1278Z) {
            try {
                m176l("Call abortCaptures() before closing session.");
                AbstractC4941g.m5558Q(this.f167g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((C15384c) this.f167g.f32040Z).f47967Z).abortCaptures();
            } catch (Exception e10) {
                m176l("Exception when calling abortCaptures()" + e10);
            }
        }
        m176l("Session call close()");
        this.f181u.m371h().mo5766a(new RunnableC0029O0(this, 1), this.f164d);
    }

    /* JADX INFO: renamed from: k */
    public final void m175k(CameraCaptureSession cameraCaptureSession) {
        if (this.f167g == null) {
            this.f167g = new C10808o(cameraCaptureSession, this.f163c);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m176l(String str) {
        AbstractC8072d6.m8486c("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    /* JADX INFO: renamed from: m */
    public final void m177m(List list) {
        synchronized (this.f161a) {
            m181q();
            if (!list.isEmpty()) {
                int i10 = 0;
                do {
                    try {
                        ((AbstractC3810L) list.get(i10)).m4510d();
                        i10++;
                    } catch (C3809K e10) {
                        for (int i11 = i10 - 1; i11 >= 0; i11--) {
                            ((AbstractC3810L) list.get(i11)).m4508b();
                        }
                        throw e10;
                    }
                } while (i10 < list.size());
            }
            this.f171k = list;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m178n() {
        boolean z6;
        synchronized (this.f161a) {
            z6 = this.f168h != null;
        }
        return z6;
    }

    /* JADX INFO: renamed from: o */
    public final void m179o(C0033Q0 c0033q0) {
        C10145l c10145l;
        synchronized (this.f161a) {
            try {
                if (this.f172l) {
                    c10145l = null;
                } else {
                    this.f172l = true;
                    AbstractC4941g.m5558Q(this.f168h, "Need to call openCaptureSession before using this API.");
                    c10145l = this.f168h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m181q();
        this.f181u.m360D();
        if (c10145l != null) {
            c10145l.f30070Z.mo5766a(new RunnableC0027N0(this, c0033q0, 0), AbstractC8577W2.m9240b());
        }
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceFutureC13608b m180p(CameraDevice cameraDevice, C1487v c1487v, List list) {
        InterfaceFutureC13608b interfaceFutureC13608bM5780d;
        synchronized (this.f176p) {
            try {
                ArrayList<C0033Q0> arrayListM79p = this.f162b.m79p();
                ArrayList arrayList = new ArrayList();
                for (C0033Q0 c0033q0 : arrayListM79p) {
                    arrayList.add(AbstractC16347a.m17947b(new C5226h(c0033q0.f181u.m371h(), c0033q0.f175o, 1500L, 1)));
                }
                C5233o c5233o = new C5233o(new ArrayList(arrayList), false, AbstractC8577W2.m9240b());
                this.f178r = c5233o;
                C5222d c5222dM5765c = C5222d.m5765c(c5233o);
                C0031P0 c0031p0 = new C0031P0(this, cameraDevice, c1487v, list);
                ExecutorC4836i executorC4836i = this.f164d;
                c5222dM5765c.getClass();
                interfaceFutureC13608bM5780d = AbstractC5229k.m5780d(AbstractC5229k.m5782f(c5222dM5765c, c0031p0, executorC4836i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceFutureC13608bM5780d;
    }

    /* JADX INFO: renamed from: q */
    public final void m181q() {
        synchronized (this.f161a) {
            try {
                List list = this.f171k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3810L) it.next()).m4508b();
                    }
                    this.f171k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m182r(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackM368e = this.f181u.m368e(captureCallback);
        AbstractC4941g.m5558Q(this.f167g, "Need to call openCaptureSession before using this API.");
        return ((C15384c) this.f167g.f32040Z).mo1475w(captureRequest, this.f164d, captureCallbackM368e);
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceFutureC13608b m183s(ArrayList arrayList) {
        InterfaceFutureC13608b interfaceFutureC13608bM184t;
        synchronized (this.f176p) {
            this.f177q = arrayList;
            interfaceFutureC13608bM184t = m184t(arrayList);
        }
        return interfaceFutureC13608bM184t;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceFutureC13608b m184t(ArrayList arrayList) {
        synchronized (this.f161a) {
            try {
                if (this.f173m) {
                    return new C5231m(new CancellationException("Opener is disabled"), 1);
                }
                C5222d c5222dM5765c = C5222d.m5765c(AbstractC8449B.m9061b(arrayList, this.f164d, this.f165e));
                C0100z c0100z = new C0100z(this, 4, arrayList);
                ExecutorC4836i executorC4836i = this.f164d;
                c5222dM5765c.getClass();
                RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c5222dM5765c, c0100z, executorC4836i);
                this.f170j = runnableC5220bM5782f;
                return AbstractC5229k.m5780d(runnableC5220bM5782f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m185u() {
        boolean zM186v;
        synchronized (this.f176p) {
            try {
                if (m178n()) {
                    this.f179s.m3265b(this.f177q);
                } else {
                    C5233o c5233o = this.f178r;
                    if (c5233o != null) {
                        c5233o.cancel(true);
                    }
                }
                zM186v = m186v();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM186v;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m186v() {
        boolean z6;
        C5222d c5222d = null;
        try {
            synchronized (this.f161a) {
                try {
                    if (!this.f173m) {
                        C5222d c5222d2 = this.f170j;
                        c5222d = c5222d2 != null ? c5222d2 : null;
                        this.f173m = true;
                    }
                    z6 = !m178n();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c5222d != null) {
                c5222d.cancel(true);
            }
            return z6;
        } catch (Throwable th3) {
            if (c5222d != null) {
                c5222d.cancel(true);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: w */
    public final C10808o m187w() {
        this.f167g.getClass();
        return this.f167g;
    }
}
