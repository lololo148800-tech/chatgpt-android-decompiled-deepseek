package p001A;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.javax.sip.C10808o;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p007A5.C0376k;
import p053C.AbstractC1467b;
import p053C.C1474i;
import p053C.C1483r;
import p053C.InterfaceC1468c;
import p102Dm.AbstractC2119a;
import p105E.C2222a;
import p178H.C3175v;
import p225Im.AbstractC3751J;
import p228J.AbstractC3810L;
import p228J.AbstractC3842j;
import p228J.C3799E;
import p228J.C3832e;
import p228J.C3847l0;
import p228J.C3865u0;
import p228J.InterfaceC3854p;
import p277L.ExecutorC4836i;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.C5231m;
import p301M.RunnableC5220b;
import p301M.RunnableC5228j;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p720e6.C13287b;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.DesugarCollections;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0087s0 {

    /* JADX INFO: renamed from: d */
    public C0033Q0 f342d;

    /* JADX INFO: renamed from: e */
    public C0033Q0 f343e;

    /* JADX INFO: renamed from: f */
    public C3865u0 f344f;

    /* JADX INFO: renamed from: i */
    public int f347i;

    /* JADX INFO: renamed from: j */
    public C10145l f348j;

    /* JADX INFO: renamed from: k */
    public C10142i f349k;

    /* JADX INFO: renamed from: o */
    public final C0095w0 f353o;

    /* JADX INFO: renamed from: p */
    public final C13287b f354p;

    /* JADX INFO: renamed from: q */
    public final C2222a f355q;

    /* JADX INFO: renamed from: r */
    public final boolean f356r;

    /* JADX INFO: renamed from: a */
    public final Object f339a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayList f340b = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final HashMap f345g = new HashMap();

    /* JADX INFO: renamed from: h */
    public List f346h = Collections.emptyList();

    /* JADX INFO: renamed from: l */
    public HashMap f350l = new HashMap();

    /* JADX INFO: renamed from: m */
    public final C0376k f351m = new C0376k(2);

    /* JADX INFO: renamed from: n */
    public final C0376k f352n = new C0376k(3);

    /* JADX INFO: renamed from: c */
    public final C0085r0 f341c = new C0085r0(this);

    public C0087s0(C13287b c13287b, C3847l0 c3847l0, boolean z6) {
        this.f347i = 1;
        this.f347i = 2;
        this.f354p = c13287b;
        this.f353o = new C0095w0(c3847l0.m4578e(CaptureNoResponseQuirk.class));
        this.f355q = new C2222a(2, c3847l0);
        this.f356r = z6;
    }

    /* JADX INFO: renamed from: b */
    public static C0024M m277b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback c0024m;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3842j abstractC3842j = (AbstractC3842j) it.next();
            if (abstractC3842j == null) {
                c0024m = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                AbstractC3751J.m4445j(abstractC3842j, arrayList2);
                c0024m = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new C0024M(arrayList2);
            }
            arrayList.add(c0024m);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C0024M(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static HashMap m278c(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get(num)).iterator();
            if (it.hasNext()) {
                SurfaceUtil.m11191a((Surface) map2.get(((C3832e) it.next()).f11597a));
                AbstractC0079o0.m266b();
                throw null;
            }
            AbstractC8072d6.m8487d("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
        }
        return map3;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m279g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1474i c1474i = (C1474i) it.next();
            if (!arrayList2.contains(c1474i.f3883a.mo2116e())) {
                arrayList2.add(c1474i.f3883a.mo2116e());
                arrayList3.add(c1474i);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: h */
    public static HashMap m280h(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3832e c3832e = (C3832e) it.next();
            if (c3832e.f11600d > 0 && c3832e.f11598b.isEmpty()) {
                int i10 = c3832e.f11600d;
                List arrayList2 = (List) map.get(Integer.valueOf(i10));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i10), arrayList2);
                }
                arrayList2.add(c3832e);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public final void m281a() {
        synchronized (this.f339a) {
            try {
                int iM24h = AbstractC0010F.m24h(this.f347i);
                if (iM24h == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(AbstractC0010F.m26j(this.f347i)));
                }
                if (iM24h == 1) {
                    this.f347i = 8;
                } else if (iM24h == 2) {
                    AbstractC4941g.m5558Q(this.f342d, "The Opener shouldn't null in state:".concat(AbstractC0010F.m26j(this.f347i)));
                    this.f342d.m185u();
                    this.f347i = 8;
                } else if (iM24h == 3 || iM24h == 4) {
                    AbstractC4941g.m5558Q(this.f342d, "The Opener shouldn't null in state:".concat(AbstractC0010F.m26j(this.f347i)));
                    this.f342d.m185u();
                    this.f347i = 6;
                    this.f353o.m360D();
                    this.f344f = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m282d() {
        if (this.f347i == 8) {
            AbstractC8072d6.m8486c("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f347i = 8;
        this.f343e = null;
        C10142i c10142i = this.f349k;
        if (c10142i != null) {
            c10142i.m10747a(null);
            this.f349k = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final List m283e() {
        List listUnmodifiableList;
        synchronized (this.f339a) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.f340b);
        }
        return listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX INFO: renamed from: f */
    public final C1474i m284f(C3832e c3832e, HashMap map, String str) {
        long jLongValue;
        Surface surface = (Surface) map.get(c3832e.f11597a);
        AbstractC4941g.m5558Q(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C1474i c1474i = new C1474i(c3832e.f11600d, surface);
        C1483r c1483r = c1474i.f3883a;
        if (str != null) {
            c1483r.mo2119i(str);
        } else {
            c1483r.mo2119i(null);
        }
        int i10 = c3832e.f11599c;
        if (i10 == 0) {
            c1483r.mo2121h(1);
        } else if (i10 == 1) {
            c1483r.mo2121h(2);
        }
        List list = c3832e.f11598b;
        if (!list.isEmpty()) {
            c1483r.mo2113b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((AbstractC3810L) it.next());
                AbstractC4941g.m5558Q(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c1483r.mo2120a(surface2);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            C13287b c13287b = this.f354p;
            c13287b.getClass();
            AbstractC4941g.m5559R("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i11 >= 33);
            DynamicRangeProfiles dynamicRangeProfilesMo2109b = ((InterfaceC1468c) c13287b.f42000Z).mo2109b();
            if (dynamicRangeProfilesMo2109b == null) {
                jLongValue = 1;
            } else {
                C3175v c3175v = c3832e.f11601e;
                Long lM2107a = AbstractC1467b.m2107a(c3175v, dynamicRangeProfilesMo2109b);
                if (lM2107a == null) {
                    AbstractC8072d6.m8487d("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c3175v);
                    jLongValue = 1;
                } else {
                    jLongValue = lM2107a.longValue();
                }
            }
        } else {
            jLongValue = 1;
        }
        c1483r.mo2118g(jLongValue);
        return c1474i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m285i() {
        boolean z6;
        synchronized (this.f339a) {
            int i10 = this.f347i;
            z6 = i10 == 5 || i10 == 4;
        }
        return z6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public final void m286j(ArrayList arrayList) {
        InterfaceC3854p interfaceC3854p;
        synchronized (this.f339a) {
            try {
                if (this.f347i != 5) {
                    AbstractC8072d6.m8486c("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    C0084r c0084r = new C0084r(1);
                    ArrayList arrayList2 = new ArrayList();
                    AbstractC8072d6.m8486c("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    boolean z6 = false;
                    while (it.hasNext()) {
                        C3799E c3799e = (C3799E) it.next();
                        if (!DesugarCollections.unmodifiableList(c3799e.f11482a).isEmpty()) {
                            Iterator it2 = DesugarCollections.unmodifiableList(c3799e.f11482a).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (c3799e.f11484c == 2) {
                                        z6 = true;
                                    }
                                    C0063g0 c0063g0 = new C0063g0(c3799e);
                                    if (c3799e.f11484c == 5 && (interfaceC3854p = c3799e.f11489h) != null) {
                                        c0063g0.f290h = interfaceC3854p;
                                    }
                                    C3865u0 c3865u0 = this.f344f;
                                    if (c3865u0 != null) {
                                        c0063g0.m243c(c3865u0.f11683g.f11483b);
                                    }
                                    c0063g0.m243c(c3799e.f11483b);
                                    C3799E c3799eM244d = c0063g0.m244d();
                                    C0033Q0 c0033q0 = this.f343e;
                                    c0033q0.f167g.getClass();
                                    CaptureRequest captureRequestM3189c = AbstractC2119a.m3189c(c3799eM244d, ((CameraCaptureSession) ((C15384c) c0033q0.f167g.f32040Z).f47967Z).getDevice(), this.f345g, false, this.f355q);
                                    if (captureRequestM3189c != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it3 = c3799e.f11486e.iterator();
                                        while (it3.hasNext()) {
                                            AbstractC3751J.m4445j((AbstractC3842j) it3.next(), arrayList3);
                                        }
                                        c0084r.m273a(captureRequestM3189c, arrayList3);
                                        arrayList2.add(captureRequestM3189c);
                                        break;
                                    }
                                    AbstractC8072d6.m8486c("CaptureSession", "Skipping issuing request without surface.");
                                    return;
                                }
                                AbstractC3810L abstractC3810L = (AbstractC3810L) it2.next();
                                if (!this.f345g.containsKey(abstractC3810L)) {
                                    AbstractC8072d6.m8486c("CaptureSession", "Skipping capture request with invalid surface: " + abstractC3810L);
                                    break;
                                }
                            }
                        } else {
                            AbstractC8072d6.m8486c("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        AbstractC8072d6.m8486c("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return;
                    }
                    if (this.f351m.m1016i(arrayList2, z6)) {
                        C0033Q0 c0033q1 = this.f343e;
                        AbstractC4941g.m5558Q(c0033q1.f167g, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((C15384c) c0033q1.f167g.f32040Z).f47967Z).stopRepeating();
                        c0084r.f336c = new C0081p0(this);
                    }
                    if (this.f352n.m1014g(arrayList2, z6)) {
                        c0084r.m273a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new C0024M(this)));
                    }
                    this.f343e.m173i(arrayList2, c0084r);
                } catch (CameraAccessException e10) {
                    AbstractC8072d6.m8487d("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m287k(List list) {
        synchronized (this.f339a) {
            try {
                switch (AbstractC0010F.m24h(this.f347i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(AbstractC0010F.m26j(this.f347i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f340b.addAll(list);
                        break;
                    case 4:
                        this.f340b.addAll(list);
                        this.f353o.m371h().mo5766a(new RunnableC0000A(this, 5), AbstractC8577W2.m9240b());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m288l(C3865u0 c3865u0) {
        synchronized (this.f339a) {
            try {
                if (c3865u0 == null) {
                    AbstractC8072d6.m8486c("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return;
                }
                if (this.f347i != 5) {
                    AbstractC8072d6.m8486c("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return;
                }
                C3799E c3799e = c3865u0.f11683g;
                if (DesugarCollections.unmodifiableList(c3799e.f11482a).isEmpty()) {
                    AbstractC8072d6.m8486c("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        C0033Q0 c0033q0 = this.f343e;
                        AbstractC4941g.m5558Q(c0033q0.f167g, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((C15384c) c0033q0.f167g.f32040Z).f47967Z).stopRepeating();
                    } catch (CameraAccessException e10) {
                        AbstractC8072d6.m8487d("CaptureSession", "Unable to access camera: " + e10.getMessage());
                        Thread.dumpStack();
                    }
                    return;
                }
                try {
                    AbstractC8072d6.m8486c("CaptureSession", "Issuing request for session.");
                    C0033Q0 c0033q1 = this.f343e;
                    c0033q1.f167g.getClass();
                    CaptureRequest captureRequestM3189c = AbstractC2119a.m3189c(c3799e, ((CameraCaptureSession) ((C15384c) c0033q1.f167g.f32040Z).f47967Z).getDevice(), this.f345g, true, this.f355q);
                    if (captureRequestM3189c == null) {
                        AbstractC8072d6.m8486c("CaptureSession", "Skipping issuing empty request for session.");
                        return;
                    } else {
                        this.f343e.m182r(captureRequestM3189c, this.f353o.m368e(m277b(c3799e.f11486e, new CameraCaptureSession.CaptureCallback[0])));
                        return;
                    }
                } catch (CameraAccessException e11) {
                    AbstractC8072d6.m8487d("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                    return;
                }
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceFutureC13608b m289m(C3865u0 c3865u0, CameraDevice cameraDevice, C0033Q0 c0033q0) {
        synchronized (this.f339a) {
            try {
                if (AbstractC0010F.m24h(this.f347i) != 1) {
                    AbstractC8072d6.m8487d("CaptureSession", "Open not allowed in state: ".concat(AbstractC0010F.m26j(this.f347i)));
                    return new C5231m(new IllegalStateException("open() should not allow the state: ".concat(AbstractC0010F.m26j(this.f347i))), 1);
                }
                this.f347i = 3;
                ArrayList arrayList = new ArrayList(c3865u0.m4591b());
                this.f346h = arrayList;
                this.f342d = c0033q0;
                C5222d c5222dM5765c = C5222d.m5765c(c0033q0.m183s(arrayList));
                C0083q0 c0083q0 = new C0083q0(this, c3865u0, cameraDevice, 0);
                ExecutorC4836i executorC4836i = this.f342d.f164d;
                c5222dM5765c.getClass();
                RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c5222dM5765c, c0083q0, executorC4836i);
                C10808o c10808o = new C10808o(this, 1);
                runnableC5220bM5782f.mo5766a(new RunnableC5228j(runnableC5220bM5782f, 0, c10808o), this.f342d.f164d);
                return AbstractC5229k.m5780d(runnableC5220bM5782f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceFutureC13608b m290n() {
        synchronized (this.f339a) {
            try {
                switch (AbstractC0010F.m24h(this.f347i)) {
                    case 0:
                        throw new IllegalStateException("release() should not be possible in state: ".concat(AbstractC0010F.m26j(this.f347i)));
                    case 2:
                        AbstractC4941g.m5558Q(this.f342d, "The Opener shouldn't null in state:".concat(AbstractC0010F.m26j(this.f347i)));
                        this.f342d.m185u();
                    case 1:
                        this.f347i = 8;
                        return C5231m.f16977o0;
                    case 4:
                    case 5:
                        C0033Q0 c0033q0 = this.f343e;
                        if (c0033q0 != null) {
                            c0033q0.m174j();
                            break;
                        }
                    case 3:
                        this.f347i = 7;
                        this.f353o.m360D();
                        AbstractC4941g.m5558Q(this.f342d, "The Opener shouldn't null in state:".concat(AbstractC0010F.m26j(this.f347i)));
                        if (this.f342d.m185u()) {
                            m282d();
                            return C5231m.f16977o0;
                        }
                    case 6:
                        if (this.f348j == null) {
                            this.f348j = AbstractC16347a.m17947b(new C0081p0(this));
                        }
                        return this.f348j;
                    default:
                        return C5231m.f16977o0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m291o(C3865u0 c3865u0) {
        synchronized (this.f339a) {
            try {
                switch (AbstractC0010F.m24h(this.f347i)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(AbstractC0010F.m26j(this.f347i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f344f = c3865u0;
                        break;
                    case 4:
                        this.f344f = c3865u0;
                        if (c3865u0 == null) {
                            return;
                        }
                        if (!this.f345g.keySet().containsAll(c3865u0.m4591b())) {
                            AbstractC8072d6.m8487d("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            AbstractC8072d6.m8486c("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            m288l(this.f344f);
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
