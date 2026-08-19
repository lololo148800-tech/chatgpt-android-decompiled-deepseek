package p001A;

import android.content.SharedPreferences;
import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.p650ui.platform.AndroidComposeView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0203S;
import p028B.C0709p;
import p049Bm.InterfaceC1436k;
import p083D3.C1865c;
import p083D3.C1868f;
import p109E3.C2268I;
import p109E3.C2271L;
import p117Eb.C2369G;
import p117Eb.C2392v;
import p155G.C2951c;
import p166Ga.C3029c;
import p167Gb.C3032c;
import p178H.C3119L;
import p178H.C3131Y;
import p178H.C3142e0;
import p178H.InterfaceC3122O;
import p178H.InterfaceC3127U;
import p182H3.C3206g;
import p202I.C3530f;
import p202I.C3535k;
import p203I0.C3563t;
import p221Ii.C3725d;
import p239Ja.C4301d;
import p239Ja.C4309l;
import p260K6.C4547b;
import p283L5.AbstractC4941g;
import p304M2.C5280c;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p826j6.C16137F;

/* JADX INFO: renamed from: A.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0000A implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f0Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1Z;

    public /* synthetic */ RunnableC0000A(C3530f c3530f, InterfaceC3127U interfaceC3127U) {
        this.f0Y = 20;
        this.f1Z = c3530f;
    }

    /* JADX INFO: renamed from: a */
    private final void m0a() {
        C2392v c2392v = (C2392v) this.f1Z;
        synchronized (((ArrayDeque) c2392v.f7439q0)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) c2392v.f7436Z).edit();
            String str = (String) c2392v.f7437o0;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) c2392v.f7439q0).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) c2392v.f7438p0);
            }
            editorEdit.putString(str, sb2.toString()).commit();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m1b() {
        C3119L c3119l = (C3119L) this.f1Z;
        synchronized (c3119l.f9397G0) {
            try {
                c3119l.f9399I0 = null;
                InterfaceC3127U interfaceC3127U = c3119l.f9398H0;
                if (interfaceC3127U != null) {
                    c3119l.f9398H0 = null;
                    c3119l.mo3949f(interfaceC3127U);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m2c() {
        C3206g c3206g = (C3206g) this.f1Z;
        synchronized (c3206g.f9679a) {
            try {
                if (c3206g.f9691m) {
                    return;
                }
                long j10 = c3206g.f9690l - 1;
                c3206g.f9690l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    c3206g.m4072b(new IllegalStateException());
                } else {
                    c3206g.m4071a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f0Y) {
            case 0:
                C0018J c0018j = (C0018J) this.f1Z;
                c0018j.f76G0 = false;
                c0018j.f75F0 = false;
                c0018j.m126v("OpenCameraConfigAndClose is done, state: ".concat(AbstractC0010F.m25i(c0018j.f89T0)), null);
                int iM24h = AbstractC0010F.m24h(c0018j.f89T0);
                if (iM24h == 1 || iM24h == 4) {
                    AbstractC4941g.m5559R(null, c0018j.f102y0.isEmpty());
                    c0018j.m127w();
                    return;
                } else {
                    if (iM24h != 6) {
                        c0018j.m126v("OpenCameraConfigAndClose finished while in state: ".concat(AbstractC0010F.m25i(c0018j.f89T0)), null);
                        return;
                    }
                    int i10 = c0018j.f100w0;
                    if (i10 == 0) {
                        c0018j.m102L(false);
                        return;
                    } else {
                        c0018j.m126v("OpenCameraConfigAndClose in error: ".concat(C0018J.m88x(i10)), null);
                        c0018j.f97t0.m53b();
                        return;
                    }
                }
            case 1:
                ((CameraDevice) this.f1Z).close();
                return;
            case 2:
                RunnableC0014H runnableC0014H = (RunnableC0014H) this.f1Z;
                if (runnableC0014H.f54Z) {
                    return;
                }
                AbstractC4941g.m5559R(null, ((C0016I) runnableC0014H.f56p0).f63f.f89T0 == 7 || ((C0016I) runnableC0014H.f56p0).f63f.f89T0 == 6);
                if (((C0016I) runnableC0014H.f56p0).m54c()) {
                    ((C0016I) runnableC0014H.f56p0).f63f.m101K(true);
                    return;
                } else {
                    ((C0016I) runnableC0014H.f56p0).f63f.m102L(true);
                    return;
                }
            case 3:
                ((C0047Y) this.f1Z).f229i.mo172c();
                return;
            case 4:
                ((InterfaceC3122O) this.f1Z).clear();
                return;
            case 5:
                C0087s0 c0087s0 = (C0087s0) this.f1Z;
                synchronized (c0087s0.f339a) {
                    if (c0087s0.f340b.isEmpty()) {
                        return;
                    }
                    try {
                        c0087s0.m286j(c0087s0.f340b);
                        c0087s0.f340b.clear();
                        return;
                    } catch (Throwable th2) {
                        c0087s0.f340b.clear();
                        throw th2;
                    }
                }
            case 6:
                for (C0033Q0 c0033q0 : (LinkedHashSet) this.f1Z) {
                    c0033q0.getClass();
                    c0033q0.mo162c(c0033q0);
                }
                return;
            case 7:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f1Z;
                androidComposeView.f32759E1 = false;
                MotionEvent motionEvent = androidComposeView.f32821y1;
                AbstractC16544l.m18091d(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.m11335G(motionEvent);
                return;
            case 8:
                C0203S c0203s = (C0203S) this.f1Z;
                Trace.beginSection("measureAndLayout");
                try {
                    c0203s.f765d.m11345s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c0203s.m641n();
                        Trace.endSection();
                        c0203s.f761J = false;
                        return;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 9:
                ((C0709p) this.f1Z).f2055b.onCameraAccessPrioritiesChanged();
                return;
            case 10:
                C1868f c1868f = (C1868f) this.f1Z;
                c1868f.m2748D(c1868f.m2777y(), 1028, new C1865c(4));
                c1868f.f5369r0.m10693d();
                return;
            case 11:
                C2268I c2268i = (C2268I) this.f1Z;
                if (c2268i.f6988k0 >= 300000) {
                    ((C2271L) c2268i.f6997s.f42001Y).f7017c2 = true;
                    c2268i.f6988k0 = 0L;
                    return;
                }
                return;
            case 12:
                m0a();
                return;
            case 13:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                C2369G c2369g = (C2369G) this.f1Z;
                sb2.append(c2369g.f7361a.getAction());
                sb2.append(" finishing.");
                AbstractC15256t.m16482t("FirebaseMessaging", sb2.toString());
                c2369g.f7362b.m15116d(null);
                return;
            case 14:
                C2951c c2951c = (C2951c) this.f1Z;
                C10142i c10142i = c2951c.f8833g;
                if (c10142i != null) {
                    c10142i.m10747a(null);
                    c2951c.f8833g = null;
                    return;
                }
                return;
            case 15:
                C3029c c3029c = (C3029c) this.f1Z;
                c3029c.f9118c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c3029c.f9120e;
                C5280c c5280c = sideSheetBehavior.f36685i;
                if (c5280c != null && c5280c.m5811f()) {
                    c3029c.m3905f(c3029c.f9117b);
                    return;
                } else {
                    if (sideSheetBehavior.f36684h == 2) {
                        sideSheetBehavior.m13648r(c3029c.f9117b);
                        return;
                    }
                    return;
                }
            case 16:
                m1b();
                return;
            case 17:
                ((C3142e0) this.f1Z).m4018n();
                return;
            case 18:
                m2c();
                return;
            case 19:
                C3535k c3535k = (C3535k) ((C2392v) ((C3131Y) this.f1Z).f9418b).f7436Z;
                if (c3535k != null) {
                    c3535k.f10695g.m4220b();
                    return;
                }
                return;
            case 20:
                ((C3530f) this.f1Z).getClass();
                throw null;
            case 21:
                C3563t.setRippleState$lambda$2((C3563t) this.f1Z);
                return;
            case 22:
                C3725d c3725d = (C3725d) this.f1Z;
                InterfaceC1436k onViewReadyListener = c3725d.getOnViewReadyListener();
                if (onViewReadyListener != null) {
                    onViewReadyListener.invoke(c3725d.f11306T0.f11282a);
                    return;
                }
                return;
            case 23:
                C0006D c0006d = (C0006D) this.f1Z;
                if (c0006d.f21c.f89T0 == 4) {
                    c0006d.f21c.m102L(false);
                    return;
                }
                return;
            case 24:
                C3032c c3032c = (C3032c) this.f1Z;
                if (((C0018J) c3032c.f9127Z).f89T0 == 9) {
                    ((C0018J) c3032c.f9127Z).m94D();
                    return;
                }
                return;
            case 25:
                ((C10145l) this.f1Z).cancel(true);
                return;
            case 26:
                ((C4301d) this.f1Z).m5051t(true);
                return;
            case 27:
                C4309l c4309l = (C4309l) this.f1Z;
                boolean zIsPopupShowing = c4309l.f14002h.isPopupShowing();
                c4309l.m5065t(zIsPopupShowing);
                c4309l.f14007m = zIsPopupShowing;
                return;
            case 28:
                CountDownLatch completionLatch = (CountDownLatch) this.f1Z;
                AbstractC16544l.m18094g(completionLatch, "$completionLatch");
                completionLatch.countDown();
                return;
            default:
                C4547b this$0 = (C4547b) this.f1Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                InterfaceC1436k onViewReadyListener2 = this$0.getOnViewReadyListener();
                if (onViewReadyListener2 == null) {
                    return;
                }
                onViewReadyListener2.invoke((C16137F) this$0.f14864R0.f18432c);
                return;
        }
    }

    public /* synthetic */ RunnableC0000A(Object obj, int i10) {
        this.f0Y = i10;
        this.f1Z = obj;
    }
}
