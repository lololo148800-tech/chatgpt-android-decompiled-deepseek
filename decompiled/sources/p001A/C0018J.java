package p001A;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.lifecycle.C11069E;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p028B.C0694a;
import p028B.C0703j;
import p028B.C0710q;
import p079D.AbstractC1762b;
import p084D4.C1920j;
import p1053v3.p1054lN.IGDwkYw;
import p105E.C2226e;
import p1139z0.C21585H;
import p115E9.AbstractC2359a;
import p140Fa.C2685e;
import p167Gb.C3032c;
import p178H.AbstractC3174u0;
import p178H.C3141e;
import p178H.C3142e0;
import p178H.C3162o0;
import p178H.C3165q;
import p178H.InterfaceC3153k;
import p228J.AbstractC3810L;
import p228J.AbstractC3842j;
import p228J.AbstractC3860s;
import p228J.C3791A;
import p228J.C3793B;
import p228J.C3796C0;
import p228J.C3799E;
import p228J.C3823Z;
import p228J.C3824a;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.C3836g;
import p228J.C3838h;
import p228J.C3847l0;
import p228J.C3863t0;
import p228J.C3865u0;
import p228J.EnumC3804G0;
import p228J.EnumC3868w;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3833e0;
import p228J.InterfaceC3856q;
import p228J.InterfaceC3864u;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p283L5.AbstractC4941g;
import p301M.RunnableC5228j;
import p310M9.C5311e;
import p477Tb.C7296c;
import p514V.C7729c;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8447A3;
import p544W9.AbstractC8577W2;
import p610Z1.C10145l;
import p615Z6.C10252z0;
import p658b5.C11234e;
import p658b5.C11248s;
import p720e6.C13287b;
import p720e6.C13288c;
import p747fb.InterfaceFutureC13608b;
import p813ij.C15026j;
import p817j$.util.DesugarCollections;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0018J implements InterfaceC3870x {

    /* JADX INFO: renamed from: A0 */
    public final C0006D f70A0;

    /* JADX INFO: renamed from: B0 */
    public final C1920j f71B0;

    /* JADX INFO: renamed from: C0 */
    public final C3793B f72C0;

    /* JADX INFO: renamed from: D0 */
    public final boolean f73D0;

    /* JADX INFO: renamed from: E0 */
    public final boolean f74E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f75F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f76G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f77H0;

    /* JADX INFO: renamed from: I0 */
    public C0017I0 f78I0;

    /* JADX INFO: renamed from: J0 */
    public final C0017I0 f79J0;

    /* JADX INFO: renamed from: K0 */
    public final C10252z0 f80K0;

    /* JADX INFO: renamed from: L0 */
    public final HashSet f81L0;

    /* JADX INFO: renamed from: M0 */
    public C13288c f82M0;

    /* JADX INFO: renamed from: N0 */
    public final Object f83N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f84O0;

    /* JADX INFO: renamed from: P0 */
    public final C0089t0 f85P0;

    /* JADX INFO: renamed from: Q0 */
    public final C13287b f86Q0;

    /* JADX INFO: renamed from: R0 */
    public final C0023L0 f87R0;

    /* JADX INFO: renamed from: S0 */
    public final C15384c f88S0;

    /* JADX INFO: renamed from: T0 */
    public volatile int f89T0 = 3;

    /* JADX INFO: renamed from: Y */
    public final C21585H f90Y;

    /* JADX INFO: renamed from: Z */
    public final C0710q f91Z;

    /* JADX INFO: renamed from: o0 */
    public final ExecutorC4836i f92o0;

    /* JADX INFO: renamed from: p0 */
    public final ScheduledExecutorServiceC4831d f93p0;

    /* JADX INFO: renamed from: q0 */
    public final C15384c f94q0;

    /* JADX INFO: renamed from: r0 */
    public final C11234e f95r0;

    /* JADX INFO: renamed from: s0 */
    public final C0088t f96s0;

    /* JADX INFO: renamed from: t0 */
    public final C0016I f97t0;

    /* JADX INFO: renamed from: u0 */
    public final C0022L f98u0;

    /* JADX INFO: renamed from: v0 */
    public CameraDevice f99v0;

    /* JADX INFO: renamed from: w0 */
    public int f100w0;

    /* JADX INFO: renamed from: x0 */
    public C0087s0 f101x0;

    /* JADX INFO: renamed from: y0 */
    public final LinkedHashMap f102y0;

    /* JADX INFO: renamed from: z0 */
    public int f103z0;

    public C0018J(Context context, C0710q c0710q, String str, C0022L c0022l, C1920j c1920j, C3793B c3793b, Executor executor, Handler handler, C0089t0 c0089t0, long j10) throws C3165q {
        C15384c c15384c = new C15384c(8);
        this.f94q0 = c15384c;
        this.f100w0 = 0;
        new AtomicInteger(0);
        this.f102y0 = new LinkedHashMap();
        this.f103z0 = 0;
        this.f75F0 = false;
        this.f76G0 = false;
        this.f77H0 = true;
        this.f81L0 = new HashSet();
        this.f82M0 = AbstractC3860s.f11670a;
        this.f83N0 = new Object();
        this.f84O0 = false;
        this.f88S0 = new C15384c(this);
        this.f91Z = c0710q;
        this.f71B0 = c1920j;
        this.f72C0 = c3793b;
        ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d = new ScheduledExecutorServiceC4831d(handler);
        this.f93p0 = scheduledExecutorServiceC4831d;
        ExecutorC4836i executorC4836i = new ExecutorC4836i(executor);
        this.f92o0 = executorC4836i;
        this.f97t0 = new C0016I(this, executorC4836i, scheduledExecutorServiceC4831d, j10);
        this.f90Y = new C21585H(str);
        ((C11069E) c15384c.f47967Z).m12124k(new C3823Z(EnumC3868w.CLOSED));
        C11234e c11234e = new C11234e(c3793b);
        this.f95r0 = c11234e;
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f65Z = new Object();
        c0017i0.f66o0 = new LinkedHashSet();
        c0017i0.f67p0 = new LinkedHashSet();
        c0017i0.f68q0 = new LinkedHashSet();
        c0017i0.f69r0 = new C0073l0(c0017i0);
        c0017i0.f64Y = executorC4836i;
        this.f79J0 = c0017i0;
        this.f85P0 = c0089t0;
        try {
            C0703j c0703jM1481b = c0710q.m1481b(str);
            C0088t c0088t = new C0088t(c0703jM1481b, scheduledExecutorServiceC4831d, executorC4836i, new C7296c(this, 1), c0022l.f118i);
            this.f96s0 = c0088t;
            this.f98u0 = c0022l;
            c0022l.m148m(c0088t);
            c0022l.f116g.m132l((C11069E) c11234e.f34002o0);
            this.f86Q0 = C13287b.m14899i(c0703jM1481b);
            this.f101x0 = m92B();
            C3847l0 c3847l0 = c0022l.f118i;
            C3847l0 c3847l1 = AbstractC1762b.f5032a;
            C10252z0 c10252z0 = new C10252z0();
            c10252z0.f30454Y = executorC4836i;
            c10252z0.f30455Z = scheduledExecutorServiceC4831d;
            c10252z0.f30456o0 = handler;
            c10252z0.f30457p0 = c0017i0;
            c10252z0.f30458q0 = c3847l0;
            c10252z0.f30459r0 = c3847l1;
            this.f80K0 = c10252z0;
            this.f73D0 = c0022l.f118i.m4578e(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f74E0 = c0022l.f118i.m4578e(LegacyCameraSurfaceCleanupQuirk.class);
            C0006D c0006d = new C0006D(this, str);
            this.f70A0 = c0006d;
            C3032c c3032c = new C3032c(this, 1);
            synchronized (c3793b.f11466b) {
                AbstractC4941g.m5559R("Camera is already registered: " + this, !c3793b.f11469e.containsKey(this));
                c3793b.f11469e.put(this, new C3791A(executorC4836i, c3032c, c0006d));
            }
            c0710q.f2058a.mo1485q(executorC4836i, c0006d);
            this.f87R0 = new C0023L0(context, str, c0710q, new C2685e());
        } catch (C0694a e10) {
            throw new C3165q(e10);
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m88x(int i10) {
        if (i10 == 0) {
            return "ERROR_NONE";
        }
        if (i10 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i10 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i10 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i10 != 4) {
            return i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    /* JADX INFO: renamed from: y */
    public static String m89y(C0017I0 c0017i0) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        c0017i0.getClass();
        sb2.append(c0017i0.hashCode());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: z */
    public static String m90z(AbstractC3174u0 abstractC3174u0) {
        return abstractC3174u0.m4012f() + abstractC3174u0.hashCode();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m91A() {
        int i10;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f83N0) {
            try {
                i10 = this.f71B0.f5617o0 == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C21585H c21585h = this.f90Y;
        c21585h.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) c21585h.f68345o0).entrySet()) {
            if (((C3796C0) entry.getValue()).f11476e) {
                arrayList2.add((C3796C0) entry.getValue());
            }
        }
        for (C3796C0 c3796c0 : DesugarCollections.unmodifiableCollection(arrayList2)) {
            List list = c3796c0.f11475d;
            if (list == null || list.get(0) != EnumC3804G0.f11512r0) {
                if (c3796c0.f11474c == null || c3796c0.f11475d == null) {
                    AbstractC8072d6.m8492i("Camera2CameraImpl", "Invalid stream spec or capture types in " + c3796c0);
                    return false;
                }
                C3865u0 c3865u0 = c3796c0.f11472a;
                InterfaceC3800E0 interfaceC3800E0 = c3796c0.f11473b;
                for (AbstractC3810L abstractC3810L : c3865u0.m4591b()) {
                    C0023L0 c0023l0 = this.f87R0;
                    int inputFormat = interfaceC3800E0.getInputFormat();
                    C3838h c3838hM4571b = C3838h.m4571b(i10, inputFormat, abstractC3810L.f11533h, c0023l0.m157i(inputFormat));
                    int inputFormat2 = interfaceC3800E0.getInputFormat();
                    Size size = abstractC3810L.f11533h;
                    C3836g c3836g = c3796c0.f11474c;
                    arrayList.add(new C3824a(c3838hM4571b, inputFormat2, size, c3836g.f11607b, c3796c0.f11475d, c3836g.f11609d, interfaceC3800E0.mo43i()));
                }
            }
        }
        this.f78I0.getClass();
        HashMap map = new HashMap();
        C0017I0 c0017i0 = this.f78I0;
        map.put((C0015H0) c0017i0.f66o0, Collections.singletonList((Size) c0017i0.f67p0));
        try {
            this.f87R0.m155g(i10, arrayList, map, false, false);
            m126v("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e10) {
            m126v("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public final C0087s0 m92B() {
        C0087s0 c0087s0;
        synchronized (this.f83N0) {
            c0087s0 = new C0087s0(this.f86Q0, this.f98u0.f118i, false);
        }
        return c0087s0;
    }

    /* JADX INFO: renamed from: C */
    public final void m93C(boolean z6) {
        if (!z6) {
            this.f97t0.f62e.f50b = -1L;
        }
        this.f97t0.m52a();
        this.f88S0.m16637k();
        m126v("Opening camera.", null);
        m97G(8);
        try {
            this.f91Z.f2058a.mo1484l(this.f98u0.f110a, this.f92o0, m125u());
        } catch (C0694a e10) {
            m126v("Unable to open camera due to " + e10.getMessage(), null);
            if (e10.f2017Y == 10001) {
                m98H(3, new C3141e(7, e10), true);
                return;
            }
            C15384c c15384c = this.f88S0;
            if (((C0018J) c15384c.f47968o0).f89T0 != 8) {
                ((C0018J) c15384c.f47968o0).m126v("Don't need the onError timeout handler.", null);
                return;
            }
            ((C0018J) c15384c.f47968o0).m126v("Camera waiting for onError.", null);
            c15384c.m16637k();
            c15384c.f47967Z = new C5311e(c15384c);
        } catch (SecurityException e11) {
            m126v("Unable to open camera due to " + e11.getMessage(), null);
            m97G(7);
            this.f97t0.m53b();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m94D() {
        int i10 = 0;
        AbstractC4941g.m5559R(null, this.f89T0 == 9);
        C3863t0 c3863t0M21926m = this.f90Y.m21926m();
        if (!c3863t0M21926m.f11673k || !c3863t0M21926m.f11672j) {
            m126v("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.f72C0.m4465e(this.f99v0.getId(), this.f71B0.m3074i(this.f99v0.getId()))) {
            m126v("Unable to create capture session in camera operating mode = " + this.f71B0.f5617o0, null);
            return;
        }
        HashMap map = new HashMap();
        Collection<C3865u0> collectionM21927n = this.f90Y.m21927n();
        Collection collectionM21928q = this.f90Y.m21928q();
        C3828c c3828c = AbstractC0021K0.f107a;
        ArrayList arrayList = new ArrayList(collectionM21928q);
        for (C3865u0 c3865u0 : collectionM21927n) {
            C3835f0 c3835f0 = c3865u0.f11683g.f11483b;
            C3828c c3828c2 = AbstractC0021K0.f107a;
            if (c3835f0.f11604Y.containsKey(c3828c2) && c3865u0.m4591b().size() != 1) {
                AbstractC8072d6.m8487d("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(c3865u0.m4591b().size())));
                break;
            }
            if (c3865u0.f11683g.f11483b.f11604Y.containsKey(c3828c2)) {
                int i11 = 0;
                for (C3865u0 c3865u1 : collectionM21927n) {
                    if (((InterfaceC3800E0) arrayList.get(i11)).mo31D() == EnumC3804G0.f11512r0) {
                        AbstractC4941g.m5559R("MeteringRepeating should contain a surface", !c3865u1.m4591b().isEmpty());
                        map.put((AbstractC3810L) c3865u1.m4591b().get(0), 1L);
                    } else if (c3865u1.f11683g.f11483b.f11604Y.containsKey(c3828c2) && !c3865u1.m4591b().isEmpty()) {
                        map.put((AbstractC3810L) c3865u1.m4591b().get(0), (Long) c3865u1.f11683g.f11483b.mo39b(c3828c2));
                    }
                    i11++;
                }
                break;
            }
        }
        C0087s0 c0087s0 = this.f101x0;
        synchronized (c0087s0.f339a) {
            c0087s0.f350l = map;
        }
        C0087s0 c0087s1 = this.f101x0;
        C3865u0 c3865u0M4589b = c3863t0M21926m.m4589b();
        CameraDevice cameraDevice = this.f99v0;
        cameraDevice.getClass();
        C10252z0 c10252z0 = this.f80K0;
        InterfaceFutureC13608b interfaceFutureC13608bM289m = c0087s1.m289m(c3865u0M4589b, cameraDevice, new C0033Q0((C3847l0) c10252z0.f30458q0, (C3847l0) c10252z0.f30459r0, (C0017I0) c10252z0.f30457p0, (ExecutorC4836i) c10252z0.f30454Y, (ScheduledExecutorServiceC4831d) c10252z0.f30455Z, (Handler) c10252z0.f30456o0));
        C15026j c15026j = new C15026j();
        c15026j.f46725Z = this;
        c15026j.f46724Y = c0087s1;
        interfaceFutureC13608bM289m.mo5766a(new RunnableC5228j(interfaceFutureC13608bM289m, i10, c15026j), this.f92o0);
    }

    /* JADX INFO: renamed from: E */
    public final void m95E() {
        if (this.f78I0 != null) {
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f78I0.getClass();
            sb2.append(this.f78I0.hashCode());
            String string = sb2.toString();
            C21585H c21585h = this.f90Y;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c21585h.f68345o0;
            if (linkedHashMap.containsKey(string)) {
                C3796C0 c3796c0 = (C3796C0) linkedHashMap.get(string);
                c3796c0.f11476e = false;
                if (!c3796c0.f11477f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.f78I0.getClass();
            sb3.append(this.f78I0.hashCode());
            String string2 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c21585h.f68345o0;
            if (linkedHashMap2.containsKey(string2)) {
                C3796C0 c3796c1 = (C3796C0) linkedHashMap2.get(string2);
                c3796c1.f11477f = false;
                if (!c3796c1.f11476e) {
                    linkedHashMap2.remove(string2);
                }
            }
            C0017I0 c0017i0 = this.f78I0;
            c0017i0.getClass();
            AbstractC8072d6.m8486c("MeteringRepeating", "MeteringRepeating clear!");
            C3162o0 c3162o0 = (C3162o0) c0017i0.f64Y;
            if (c3162o0 != null) {
                c3162o0.mo4507a();
            }
            c0017i0.f64Y = null;
            this.f78I0 = null;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m96F() {
        C3865u0 c3865u0;
        AbstractC4941g.m5559R(null, this.f101x0 != null);
        m126v("Resetting Capture Session", null);
        C0087s0 c0087s0 = this.f101x0;
        synchronized (c0087s0.f339a) {
            c3865u0 = c0087s0.f344f;
        }
        List listM283e = c0087s0.m283e();
        C0087s0 c0087s0M92B = m92B();
        this.f101x0 = c0087s0M92B;
        c0087s0M92B.m291o(c3865u0);
        this.f101x0.m287k(listM283e);
        if (AbstractC0010F.m24h(this.f89T0) != 8) {
            m126v("Skipping Capture Session state check due to current camera state: " + AbstractC0010F.m25i(this.f89T0) + " and previous session status: " + c0087s0.m285i(), null);
        } else if (this.f73D0 && c0087s0.m285i()) {
            m126v("Close camera before creating new session", null);
            m97G(6);
        }
        if (this.f74E0 && c0087s0.m285i()) {
            m126v("ConfigAndClose is required when close the camera.", null);
            this.f75F0 = true;
        }
        c0087s0.m281a();
        InterfaceFutureC13608b interfaceFutureC13608bM290n = c0087s0.m290n();
        m126v("Releasing session in state ".concat(AbstractC0010F.m23g(this.f89T0)), null);
        this.f102y0.put(c0087s0, interfaceFutureC13608bM290n);
        interfaceFutureC13608bM290n.mo5766a(new RunnableC5228j(interfaceFutureC13608bM290n, 0, new C11248s(this, 1, c0087s0)), AbstractC8577W2.m9240b());
    }

    /* JADX INFO: renamed from: G */
    public final void m97G(int i10) {
        m98H(i10, null, true);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX INFO: renamed from: H */
    public final void m98H(int i10, C3141e c3141e, boolean z6) {
        EnumC3868w enumC3868w;
        EnumC3868w enumC3868w2;
        C3791A c3791aM4462a;
        HashMap map = null;
        m126v("Transitioning camera internal state: " + AbstractC0010F.m25i(this.f89T0) + " --> " + AbstractC0010F.m25i(i10), null);
        if (AbstractC8447A3.m9051c()) {
            AbstractC8447A3.m9052e(AbstractC0010F.m24h(i10), "CX:C2State[" + this + "]");
            if (c3141e != null) {
                this.f103z0++;
            }
            if (this.f103z0 > 0) {
                AbstractC8447A3.m9052e(c3141e != null ? c3141e.f9444a : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this.f89T0 = i10;
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                enumC3868w = EnumC3868w.RELEASED;
                break;
            case 1:
                enumC3868w = EnumC3868w.RELEASING;
                break;
            case 2:
                enumC3868w = EnumC3868w.CLOSED;
                break;
            case 3:
                enumC3868w = EnumC3868w.PENDING_OPEN;
                break;
            case 4:
            case 5:
                enumC3868w = EnumC3868w.CLOSING;
                break;
            case 6:
            case 7:
                enumC3868w = EnumC3868w.OPENING;
                break;
            case 8:
                enumC3868w = EnumC3868w.OPEN;
                break;
            case 9:
                enumC3868w = EnumC3868w.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: ".concat(AbstractC0010F.m25i(i10)));
        }
        C3793B c3793b = this.f72C0;
        synchronized (c3793b.f11466b) {
            try {
                int i11 = c3793b.f11470f;
                if (enumC3868w == EnumC3868w.RELEASED) {
                    C3791A c3791a = (C3791A) c3793b.f11469e.remove(this);
                    if (c3791a != null) {
                        c3793b.m4463b();
                        enumC3868w2 = c3791a.f11459a;
                    } else {
                        enumC3868w2 = null;
                    }
                } else {
                    C3791A c3791a2 = (C3791A) c3793b.f11469e.get(this);
                    AbstractC4941g.m5558Q(c3791a2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    EnumC3868w enumC3868w3 = c3791a2.f11459a;
                    c3791a2.f11459a = enumC3868w;
                    EnumC3868w enumC3868w4 = EnumC3868w.OPENING;
                    if (enumC3868w == enumC3868w4) {
                        AbstractC4941g.m5559R("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", enumC3868w.f11694Y || enumC3868w3 == enumC3868w4);
                    }
                    if (enumC3868w3 != enumC3868w) {
                        C3793B.m4461c(this, enumC3868w);
                        c3793b.m4463b();
                    }
                    enumC3868w2 = enumC3868w3;
                }
                if (enumC3868w2 != enumC3868w) {
                    if (c3793b.f11468d.f5617o0 == 2 && enumC3868w == EnumC3868w.CONFIGURED) {
                        String strM3074i = c3793b.f11468d.m3074i(mo122r().mo137b());
                        if (strM3074i != null) {
                            c3791aM4462a = c3793b.m4462a(strM3074i);
                        } else {
                            c3791aM4462a = null;
                        }
                    } else {
                        c3791aM4462a = null;
                    }
                    if (i11 < 1 && c3793b.f11470f > 0) {
                        map = new HashMap();
                        for (Map.Entry entry : c3793b.f11469e.entrySet()) {
                            if (((C3791A) entry.getValue()).f11459a == EnumC3868w.PENDING_OPEN) {
                                map.put((InterfaceC3153k) entry.getKey(), (C3791A) entry.getValue());
                            }
                        }
                    } else if (enumC3868w == EnumC3868w.PENDING_OPEN && c3793b.f11470f > 0) {
                        map = new HashMap();
                        map.put(this, (C3791A) c3793b.f11469e.get(this));
                    }
                    if (map != null && !z6) {
                        map.remove(this);
                    }
                    if (map != null) {
                        for (C3791A c3791a3 : map.values()) {
                            c3791a3.getClass();
                            try {
                                c3791a3.f11460b.execute(new RunnableC0000A(c3791a3.f11462d, 23));
                            } catch (RejectedExecutionException e10) {
                                AbstractC8072d6.m8488e("CameraStateRegistry", "Unable to notify camera to open.", e10);
                            }
                        }
                    }
                    if (c3791aM4462a != null) {
                        try {
                            c3791aM4462a.f11460b.execute(new RunnableC0000A(c3791aM4462a.f11461c, 24));
                        } catch (RejectedExecutionException e11) {
                            AbstractC8072d6.m8488e("CameraStateRegistry", "Unable to notify camera to configure.", e11);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((C11069E) this.f94q0.f47967Z).m12124k(new C3823Z(enumC3868w));
        this.f95r0.m12505I(enumC3868w, c3141e);
    }

    /* JADX INFO: renamed from: I */
    public final ArrayList m99I(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it.next();
            boolean z6 = this.f77H0;
            String strM90z = m90z(abstractC3174u0);
            Class<?> cls = abstractC3174u0.getClass();
            C3865u0 c3865u0 = z6 ? abstractC3174u0.f9572m : abstractC3174u0.f9573n;
            InterfaceC3800E0 interfaceC3800E0 = abstractC3174u0.f9565f;
            C3836g c3836g = abstractC3174u0.f9566g;
            arrayList2.add(new C0054c(strM90z, cls, c3865u0, interfaceC3800E0, c3836g != null ? c3836g.f11606a : null, c3836g, abstractC3174u0.m4009b() == null ? null : C7729c.m7990F(abstractC3174u0)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: J */
    public final void m100J(ArrayList arrayList) {
        Size size;
        boolean zIsEmpty = this.f90Y.m21927n().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0054c c0054c = (C0054c) it.next();
            if (!this.f90Y.m21931u(c0054c.f251a)) {
                C21585H c21585h = this.f90Y;
                String str = c0054c.f251a;
                C3865u0 c3865u0 = c0054c.f253c;
                InterfaceC3800E0 interfaceC3800E0 = c0054c.f254d;
                C3836g c3836g = c0054c.f256f;
                ArrayList arrayList3 = c0054c.f257g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c21585h.f68345o0;
                C3796C0 c3796c0 = (C3796C0) linkedHashMap.get(str);
                if (c3796c0 == null) {
                    c3796c0 = new C3796C0(c3865u0, interfaceC3800E0, c3836g, arrayList3);
                    linkedHashMap.put(str, c3796c0);
                }
                c3796c0.f11476e = true;
                c21585h.m21921B(str, c3865u0, interfaceC3800E0, c3836g, arrayList3);
                arrayList2.add(c0054c.f251a);
                if (c0054c.f252b == C3142e0.class && (size = c0054c.f255e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        m126v("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (zIsEmpty) {
            this.f96s0.m309p(true);
            C0088t c0088t = this.f96s0;
            synchronized (c0088t.f370o0) {
                c0088t.f357A0++;
            }
        }
        m117m();
        m104N();
        m103M();
        m96F();
        if (this.f89T0 == 9) {
            m94D();
        } else {
            int iM24h = AbstractC0010F.m24h(this.f89T0);
            if (iM24h == 2 || iM24h == 3) {
                m101K(false);
            } else if (iM24h != 4) {
                m126v("open() ignored due to being in state: ".concat(AbstractC0010F.m25i(this.f89T0)), null);
            } else {
                m97G(7);
                if (!this.f102y0.isEmpty() && !this.f76G0 && this.f100w0 == 0) {
                    AbstractC4941g.m5559R("Camera Device should be open if session close is not complete", this.f99v0 != null);
                    m97G(9);
                    m94D();
                }
            }
        }
        if (rational != null) {
            this.f96s0.f374s0.f27e = rational;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m101K(boolean z6) {
        m126v("Attempting to force open the camera.", null);
        if (this.f72C0.m4464d(this)) {
            m93C(z6);
        } else {
            m126v("No cameras available. Waiting for available camera before opening camera.", null);
            m97G(4);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m102L(boolean z6) {
        m126v("Attempting to open the camera.", null);
        if (this.f70A0.f20b && this.f72C0.m4464d(this)) {
            m93C(z6);
        } else {
            m126v("No cameras available. Waiting for available camera before opening camera.", null);
            m97G(4);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m103M() {
        C21585H c21585h = this.f90Y;
        c21585h.getClass();
        C3863t0 c3863t0 = new C3863t0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) c21585h.f68345o0).entrySet()) {
            C3796C0 c3796c0 = (C3796C0) entry.getValue();
            if (c3796c0.f11477f && c3796c0.f11476e) {
                String str = (String) entry.getKey();
                c3863t0.m4588a(c3796c0.f11472a);
                arrayList.add(str);
            }
        }
        AbstractC8072d6.m8486c("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) c21585h.f68344Z));
        boolean z6 = c3863t0.f11673k && c3863t0.f11672j;
        C0088t c0088t = this.f96s0;
        if (!z6) {
            c0088t.f365I0 = 1;
            c0088t.f374s0.f35m = 1;
            c0088t.f380y0.f283a = 1;
            this.f101x0.m291o(c0088t.m301e());
            return;
        }
        int i10 = c3863t0.m4589b().f11683g.f11484c;
        c0088t.f365I0 = i10;
        c0088t.f374s0.f35m = i10;
        c0088t.f380y0.f283a = i10;
        c3863t0.m4588a(c0088t.m301e());
        this.f101x0.m291o(c3863t0.m4589b());
    }

    /* JADX INFO: renamed from: N */
    public final void m104N() {
        Iterator it = this.f90Y.m21928q().iterator();
        boolean zMo38Q = false;
        while (it.hasNext()) {
            zMo38Q |= ((InterfaceC3800E0) it.next()).mo38Q();
        }
        this.f96s0.f378w0.f232c = zMo38Q;
    }

    @Override // p228J.InterfaceC3870x, p178H.InterfaceC3153k
    /* JADX INFO: renamed from: a */
    public final InterfaceC3866v mo105a() {
        return mo122r();
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: b */
    public final InterfaceC3833e0 mo106b() {
        return this.f94q0;
    }

    @Override // p178H.InterfaceC3153k
    /* JADX INFO: renamed from: c */
    public final InterfaceC3864u mo107c() {
        return mo111g();
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: d */
    public final boolean mo108d() {
        return ((C0022L) mo105a()).mo141f() == 0;
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: e */
    public final void mo109e(AbstractC3174u0 abstractC3174u0) {
        abstractC3174u0.getClass();
        this.f92o0.execute(new RunnableC0074m(this, 5, m90z(abstractC3174u0)));
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: f */
    public final void mo110f(C13288c c13288c) {
        if (c13288c == null) {
            c13288c = AbstractC3860s.f11670a;
        }
        c13288c.m14918X();
        this.f82M0 = c13288c;
        synchronized (this.f83N0) {
        }
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: g */
    public final InterfaceC3864u mo111g() {
        return this.f96s0;
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: h */
    public final InterfaceC3856q mo112h() {
        return this.f82M0;
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: i */
    public final void mo113i(boolean z6) {
        this.f92o0.execute(new RunnableC0098y(this, z6, 0));
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: j */
    public final void mo114j(AbstractC3174u0 abstractC3174u0) {
        abstractC3174u0.getClass();
        this.f92o0.execute(new RunnableC0096x(this, m90z(abstractC3174u0), this.f77H0 ? abstractC3174u0.f9572m : abstractC3174u0.f9573n, abstractC3174u0.f9565f, abstractC3174u0.f9566g, abstractC3174u0.m4009b() == null ? null : C7729c.m7990F(abstractC3174u0), 0));
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: k */
    public final void mo115k(AbstractC3174u0 abstractC3174u0) {
        this.f92o0.execute(new RunnableC0002B(this, m90z(abstractC3174u0), this.f77H0 ? abstractC3174u0.f9572m : abstractC3174u0.f9573n, abstractC3174u0.f9565f, abstractC3174u0.f9566g, abstractC3174u0.m4009b() == null ? null : C7729c.m7990F(abstractC3174u0), 0));
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: l */
    public final void mo116l(AbstractC3174u0 abstractC3174u0) {
        abstractC3174u0.getClass();
        this.f92o0.execute(new RunnableC0002B(this, m90z(abstractC3174u0), this.f77H0 ? abstractC3174u0.f9572m : abstractC3174u0.f9573n, abstractC3174u0.f9565f, abstractC3174u0.f9566g, abstractC3174u0.m4009b() == null ? null : C7729c.m7990F(abstractC3174u0), 1));
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: n */
    public final void mo118n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(m99I(arrayList2));
        for (AbstractC3174u0 abstractC3174u0 : new ArrayList(arrayList2)) {
            String strM90z = m90z(abstractC3174u0);
            HashSet hashSet = this.f81L0;
            if (hashSet.contains(strM90z)) {
                abstractC3174u0.mo3963t();
                hashSet.remove(strM90z);
            }
        }
        this.f92o0.execute(new RunnableC0094w(this, arrayList3, 0));
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: o */
    public final void mo119o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        C0088t c0088t = this.f96s0;
        synchronized (c0088t.f370o0) {
            c0088t.f357A0++;
        }
        for (AbstractC3174u0 abstractC3174u0 : new ArrayList(arrayList2)) {
            String strM90z = m90z(abstractC3174u0);
            HashSet hashSet = this.f81L0;
            if (!hashSet.contains(strM90z)) {
                hashSet.add(strM90z);
                abstractC3174u0.mo4020s();
                abstractC3174u0.mo3962q();
            }
        }
        try {
            this.f92o0.execute(new RunnableC0094w(this, new ArrayList(m99I(arrayList2)), 1));
        } catch (RejectedExecutionException e10) {
            m126v("Unable to attach use cases.", e10);
            c0088t.m298b();
        }
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean mo120p() {
        return true;
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: q */
    public final void mo121q(boolean z6) {
        this.f77H0 = z6;
    }

    @Override // p228J.InterfaceC3870x
    /* JADX INFO: renamed from: r */
    public final InterfaceC3866v mo122r() {
        return this.f98u0;
    }

    /* JADX INFO: renamed from: s */
    public final void m123s() {
        ArrayList<C3799E> arrayList;
        AbstractC4941g.m5559R("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + AbstractC0010F.m25i(this.f89T0) + " (error: " + m88x(this.f100w0) + Separators.RPAREN, this.f89T0 == 5 || this.f89T0 == 2 || (this.f89T0 == 7 && this.f100w0 != 0));
        m96F();
        C0087s0 c0087s0 = this.f101x0;
        synchronized (c0087s0.f339a) {
            try {
                if (c0087s0.f340b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(c0087s0.f340b);
                    c0087s0.f340b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (C3799E c3799e : arrayList) {
                Iterator it = c3799e.f11486e.iterator();
                while (it.hasNext()) {
                    ((AbstractC3842j) it.next()).mo7a(c3799e.m4503a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m124t() {
        AbstractC4941g.m5559R(null, this.f89T0 == 2 || this.f89T0 == 5);
        AbstractC4941g.m5559R(null, this.f102y0.isEmpty());
        if (!this.f75F0) {
            m127w();
            return;
        }
        if (this.f76G0) {
            m126v("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.f70A0.f20b) {
            this.f75F0 = false;
            m127w();
            m126v("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            m126v("Open camera to configAndClose", null);
            C10145l c10145lM17947b = AbstractC16347a.m17947b(new C0092v(this, 1));
            this.f76G0 = true;
            c10145lM17947b.f30070Z.mo5766a(new RunnableC0000A(this, 0), this.f92o0);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f98u0.f110a);
    }

    /* JADX INFO: renamed from: u */
    public final CameraDevice.StateCallback m125u() {
        ArrayList arrayList = new ArrayList(this.f90Y.m21926m().m4589b().f11679c);
        arrayList.add((C0073l0) this.f79J0.f69r0);
        arrayList.add(this.f97t0);
        return AbstractC2359a.m3442a(arrayList);
    }

    /* JADX INFO: renamed from: v */
    public final void m126v(String str, Throwable th2) {
        String strM11055m = AbstractC10763a.m11055m("{", toString(), "} ", str);
        String strM8491h = AbstractC8072d6.m8491h("Camera2CameraImpl");
        if (AbstractC8072d6.m8490g(3, strM8491h)) {
            Log.d(strM8491h, strM11055m, th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m127w() {
        AbstractC4941g.m5559R(null, this.f89T0 == 2 || this.f89T0 == 5);
        AbstractC4941g.m5559R(null, this.f102y0.isEmpty());
        this.f99v0 = null;
        if (this.f89T0 == 5) {
            m97G(3);
            return;
        }
        this.f91Z.f2058a.mo1486r(this.f70A0);
        m97G(1);
    }

    /* JADX INFO: renamed from: m */
    public final void m117m() {
        Size size;
        C21585H c21585h = this.f90Y;
        C3865u0 c3865u0M4589b = c21585h.m21926m().m4589b();
        C3799E c3799e = c3865u0M4589b.f11683g;
        int size2 = DesugarCollections.unmodifiableList(c3799e.f11482a).size();
        int size3 = c3865u0M4589b.m4591b().size();
        if (c3865u0M4589b.m4591b().isEmpty()) {
            return;
        }
        if (!DesugarCollections.unmodifiableList(c3799e.f11482a).isEmpty()) {
            if (size3 == 1 && size2 == 1) {
                m95E();
                return;
            }
            if (size2 >= 2) {
                m95E();
                return;
            }
            if (this.f78I0 != null && !m91A()) {
                m95E();
                return;
            }
            AbstractC8072d6.m8486c("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size3 + ", CaptureConfig Surfaces: " + size2);
            return;
        }
        if (this.f78I0 == null) {
            C0703j c0703j = this.f98u0.f111b;
            C0092v c0092v = new C0092v(this, 2);
            C0089t0 c0089t0 = this.f85P0;
            C0017I0 c0017i0 = new C0017I0();
            C2226e c2226e = new C2226e();
            Size size4 = null;
            c0017i0.f69r0 = null;
            c0017i0.f66o0 = new C0015H0();
            c0017i0.f68q0 = c0092v;
            Size[] sizeArrM12604E = c0703j.m1477b().m12604E(34);
            if (sizeArrM12604E != null) {
                if (c2226e.f6814a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && IGDwkYw.JOWjlYWXLRGSG.equalsIgnoreCase(Build.MODEL)) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size5 : sizeArrM12604E) {
                        if (C2226e.f6813c.compare(size5, C2226e.f6812b) >= 0) {
                            arrayList.add(size5);
                        }
                    }
                    sizeArrM12604E = (Size[]) arrayList.toArray(new Size[0]);
                }
                List listAsList = Arrays.asList(sizeArrM12604E);
                Collections.sort(listAsList, new C0013G0(0));
                Size sizeM320e = c0089t0.m320e();
                long jMin = Math.min(((long) sizeM320e.getWidth()) * ((long) sizeM320e.getHeight()), 307200L);
                int length = sizeArrM12604E.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Size size6 = sizeArrM12604E[i10];
                        Size size7 = size4;
                        long width = ((long) size6.getWidth()) * ((long) size6.getHeight());
                        if (width != jMin) {
                            if (width > jMin) {
                                if (size7 != null) {
                                    size = size7;
                                    break;
                                }
                            } else {
                                i10++;
                                size4 = size6;
                            }
                        } else {
                            size = size6;
                            break;
                        }
                    }
                    size = (Size) listAsList.get(0);
                    break;
                }
            } else {
                AbstractC8072d6.m8487d("MeteringRepeating", "Can not get output size list.");
                size = new Size(0, 0);
            }
            c0017i0.f67p0 = size;
            AbstractC8072d6.m8486c("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
            c0017i0.f65Z = c0017i0.m76l();
            this.f78I0 = c0017i0;
        }
        if (!m91A()) {
            AbstractC8072d6.m8487d("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        C0017I0 c0017i1 = this.f78I0;
        if (c0017i1 != null) {
            String strM89y = m89y(c0017i1);
            C0017I0 c0017i2 = this.f78I0;
            C3865u0 c3865u0 = (C3865u0) c0017i2.f65Z;
            EnumC3804G0 enumC3804G0 = EnumC3804G0.f11512r0;
            List listSingletonList = Collections.singletonList(enumC3804G0);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c21585h.f68345o0;
            C3796C0 c3796c0 = (C3796C0) linkedHashMap.get(strM89y);
            C0015H0 c0015h0 = (C0015H0) c0017i2.f66o0;
            if (c3796c0 == null) {
                c3796c0 = new C3796C0(c3865u0, c0015h0, null, listSingletonList);
                linkedHashMap.put(strM89y, c3796c0);
            }
            c3796c0.f11476e = true;
            c21585h.m21921B(strM89y, c3865u0, c0015h0, null, listSingletonList);
            C0017I0 c0017i3 = this.f78I0;
            C3865u0 c3865u1 = (C3865u0) c0017i3.f65Z;
            List listSingletonList2 = Collections.singletonList(enumC3804G0);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c21585h.f68345o0;
            C3796C0 c3796c1 = (C3796C0) linkedHashMap2.get(strM89y);
            if (c3796c1 == null) {
                c3796c1 = new C3796C0(c3865u1, (C0015H0) c0017i3.f66o0, null, listSingletonList2);
                linkedHashMap2.put(strM89y, c3796c1);
            }
            c3796c1.f11477f = true;
        }
    }
}
