package p001A;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.view.PreviewView;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.google.firebase.messaging.FirebaseMessaging;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C15126G1;
import io.sentry.C15132I1;
import io.sentry.C15135J1;
import io.sentry.C15347d1;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15129H1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15141L1;
import io.sentry.InterfaceC15167U1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C15211c;
import io.sentry.android.core.C15216g;
import io.sentry.android.core.RunnableC15210b;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.hints.InterfaceC15362a;
import io.sentry.protocol.C15436i;
import io.sentry.protocol.C15441n;
import io.sentry.protocol.C15447t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p028B.RunnableC0696c;
import p053C.C1473h;
import p053C.C1474i;
import p053C.C1487v;
import p102Dm.AbstractC2119a;
import p1138z.C21572a;
import p117Eb.C2380j;
import p117Eb.C2391u;
import p117Eb.C2393w;
import p178H.C3151j;
import p178H.C3170s0;
import p178H.C3175v;
import p178H.InterfaceC3168r0;
import p228J.AbstractC3810L;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3829c0;
import p228J.C3832e;
import p228J.C3835f0;
import p228J.C3865u0;
import p228J.C3875z0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p277L.ExecutorC4836i;
import p301M.C5222d;
import p301M.C5231m;
import p301M.InterfaceC5219a;
import p301M.RunnableC5228j;
import p414R.C6771e;
import p439S.C6974e;
import p522V8.C7836c;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8158o4;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8656j3;
import p561X.AbstractC8995i;
import p561X.C8989c;
import p561X.C9003q;
import p561X.EnumC8994h;
import p593Y8.C9681h;
import p593Y8.C9682i;
import p593Y8.C9685l;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.C10147n;
import p610Z1.InterfaceC10143j;
import p615Z6.C10252z0;
import p658b5.C11238i;
import p663b9.C11262a;
import p663b9.C11263b;
import p663b9.C11265d;
import p663b9.C11266e;
import p663b9.C11267f;
import p663b9.C11268g;
import p663b9.EnumC11264c;
import p701d9.C13046a;
import p720e6.C13287b;
import p745f9.C13583a;
import p745f9.C13584b;
import p745f9.C13589g;
import p745f9.InterfaceC13587e;
import p746fa.C13606o;
import p746fa.InterfaceC13598g;
import p747fb.InterfaceFutureC13608b;
import p767g9.InterfaceC13831b;
import p791hj.C14522e;
import p805i9.AbstractC14950a;
import p817j$.util.DesugarCollections;
import p817j$.util.concurrent.ConcurrentHashMap;
import p832jb.C16187g;
import p960q9.C18655i;

/* JADX INFO: renamed from: A.q0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0083q0 implements InterfaceC5219a, InterfaceC13598g, InterfaceC10143j, InterfaceC3168r0, InterfaceC13831b, InterfaceC13587e, InterfaceC15141L1 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f330Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f331Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f332o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f333p0;

    public /* synthetic */ C0083q0(C10145l c10145l, ExecutorC4836i executorC4836i, List list) {
        this.f330Y = 2;
        this.f331Z = c10145l;
        this.f332o0 = executorC4836i;
        this.f333p0 = list;
    }

    @Override // p767g9.InterfaceC13831b
    /* JADX INFO: renamed from: a */
    public Object mo197a() {
        C13046a c13046a = (C13046a) this.f331Z;
        C13589g c13589g = (C13589g) c13046a.f41464d;
        c13589g.getClass();
        C9682i c9682i = (C9682i) this.f332o0;
        C9681h c9681h = (C9681h) this.f333p0;
        String strM8719d = AbstractC8158o4.m8719d("SQLiteEventStore");
        if (Log.isLoggable(strM8719d, 3)) {
            Log.d(strM8719d, "Storing event with priority=" + c9682i.f29190c + ", name=" + c9681h.f29182a + " for destination " + c9682i.f29188a);
        }
        ((Long) c13589g.m15110k(new C0083q0(c13589g, c9681h, c9682i, 9))).getClass();
        c13046a.f41461a.m14938a(c9682i, 1, false);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x014b A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:4:0x001c, B:10:0x002b, B:11:0x003f, B:15:0x0045, B:16:0x004b, B:18:0x0051, B:19:0x0066, B:20:0x00c7, B:22:0x00cd, B:23:0x00e5, B:25:0x00f7, B:27:0x00fb, B:28:0x0107, B:29:0x0121, B:31:0x0127, B:33:0x0135, B:35:0x013d, B:39:0x014b, B:41:0x015d, B:44:0x0175, B:45:0x0181, B:47:0x01a0, B:49:0x01a4, B:50:0x01ad, B:51:0x01ce, B:53:0x01d4, B:54:0x01e4, B:56:0x0203, B:57:0x0208, B:58:0x0210, B:61:0x0213, B:62:0x0219, B:64:0x021b, B:65:0x0230), top: B:71:0x001c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x015d A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:4:0x001c, B:10:0x002b, B:11:0x003f, B:15:0x0045, B:16:0x004b, B:18:0x0051, B:19:0x0066, B:20:0x00c7, B:22:0x00cd, B:23:0x00e5, B:25:0x00f7, B:27:0x00fb, B:28:0x0107, B:29:0x0121, B:31:0x0127, B:33:0x0135, B:35:0x013d, B:39:0x014b, B:41:0x015d, B:44:0x0175, B:45:0x0181, B:47:0x01a0, B:49:0x01a4, B:50:0x01ad, B:51:0x01ce, B:53:0x01d4, B:54:0x01e4, B:56:0x0203, B:57:0x0208, B:58:0x0210, B:61:0x0213, B:62:0x0219, B:64:0x021b, B:65:0x0230), top: B:71:0x001c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0172  */
    /* JADX WARN: Code duplicated, block: B:64:0x021b A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:4:0x001c, B:10:0x002b, B:11:0x003f, B:15:0x0045, B:16:0x004b, B:18:0x0051, B:19:0x0066, B:20:0x00c7, B:22:0x00cd, B:23:0x00e5, B:25:0x00f7, B:27:0x00fb, B:28:0x0107, B:29:0x0121, B:31:0x0127, B:33:0x0135, B:35:0x013d, B:39:0x014b, B:41:0x015d, B:44:0x0175, B:45:0x0181, B:47:0x01a0, B:49:0x01a4, B:50:0x01ad, B:51:0x01ce, B:53:0x01d4, B:54:0x01e4, B:56:0x0203, B:57:0x0208, B:58:0x0210, B:61:0x0213, B:62:0x0219, B:64:0x021b, B:65:0x0230), top: B:71:0x001c, inners: #0 }] */
    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        InterfaceFutureC13608b c5231m;
        InputConfiguration inputConfiguration;
        CameraDevice cameraDevice;
        C1474i c1474iM284f;
        String str;
        int i10 = 1;
        C0087s0 c0087s0 = (C0087s0) this.f331Z;
        C3865u0 c3865u0 = (C3865u0) this.f332o0;
        CameraDevice cameraDevice2 = (CameraDevice) this.f333p0;
        List list = (List) obj;
        synchronized (c0087s0.f339a) {
            try {
                int iM24h = AbstractC0010F.m24h(c0087s0.f347i);
                if (iM24h == 0 || iM24h == 1) {
                    c5231m = new C5231m(new IllegalStateException("openCaptureSession() should not be possible in state: ".concat(AbstractC0010F.m26j(c0087s0.f347i))), 1);
                } else if (iM24h == 2) {
                    c0087s0.f345g.clear();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        c0087s0.f345g.put((AbstractC3810L) c0087s0.f346h.get(i11), (Surface) list.get(i11));
                    }
                    c0087s0.f347i = 4;
                    AbstractC8072d6.m8486c("CaptureSession", "Opening capture session.");
                    C0085r0 c0085r0 = new C0085r0(2, Arrays.asList(c0087s0.f341c, new C0085r0(1, c3865u0.f11680d)));
                    C3799E c3799e = c3865u0.f11683g;
                    C21572a c21572a = new C21572a(c3799e.f11483b, 8);
                    HashSet hashSet = new HashSet();
                    C3825a0.m4558d();
                    ArrayList arrayList = new ArrayList();
                    C3829c0.m4566a();
                    hashSet.addAll(c3799e.f11482a);
                    C3825a0 c3825a0M4559o = C3825a0.m4559o(c3799e.f11483b);
                    int i12 = c3799e.f11484c;
                    arrayList.addAll(c3799e.f11486e);
                    boolean z6 = c3799e.f11487f;
                    ArrayMap arrayMap = new ArrayMap();
                    C3875z0 c3875z0 = c3799e.f11488g;
                    for (Iterator it = c3875z0.f11718a.keySet().iterator(); it.hasNext(); it = it) {
                        String str2 = (String) it.next();
                        arrayMap.put(str2, c3875z0.f11718a.get(str2));
                    }
                    C3829c0 c3829c0 = new C3829c0(arrayMap);
                    boolean z10 = c3799e.f11485d;
                    HashMap map = new HashMap();
                    if (c0087s0.f356r && Build.VERSION.SDK_INT >= 35) {
                        map = C0087s0.m278c(C0087s0.m280h(c3865u0.f11677a), c0087s0.f345g);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    String str3 = (String) ((InterfaceC3805H) c21572a.f61960Z).mo36M(C21572a.f68310u0, null);
                    Iterator it2 = c3865u0.f11677a.iterator();
                    while (it2.hasNext()) {
                        C3832e c3832e = (C3832e) it2.next();
                        Iterator it3 = it2;
                        if (c0087s0.f356r) {
                            cameraDevice = cameraDevice2;
                            c1474iM284f = Build.VERSION.SDK_INT >= 35 ? (C1474i) map.get(c3832e) : null;
                            if (c1474iM284f == null) {
                                c1474iM284f = c0087s0.m284f(c3832e, c0087s0.f345g, str3);
                                str = str3;
                                if (c0087s0.f350l.containsKey(c3832e.f11597a)) {
                                    c1474iM284f.f3883a.mo2122j(((Long) c0087s0.f350l.get(c3832e.f11597a)).longValue());
                                }
                                arrayList2.add(c1474iM284f);
                                z10 = z10;
                                it2 = it3;
                                str3 = str;
                                cameraDevice2 = cameraDevice;
                            } else {
                                str = str3;
                            }
                            arrayList2.add(c1474iM284f);
                            z10 = z10;
                            it2 = it3;
                            str3 = str;
                            cameraDevice2 = cameraDevice;
                        } else {
                            cameraDevice = cameraDevice2;
                        }
                        if (c1474iM284f == null) {
                            c1474iM284f = c0087s0.m284f(c3832e, c0087s0.f345g, str3);
                            str = str3;
                            if (c0087s0.f350l.containsKey(c3832e.f11597a)) {
                                c1474iM284f.f3883a.mo2122j(((Long) c0087s0.f350l.get(c3832e.f11597a)).longValue());
                            }
                            arrayList2.add(c1474iM284f);
                            z10 = z10;
                            it2 = it3;
                            str3 = str;
                            cameraDevice2 = cameraDevice;
                        } else {
                            str = str3;
                        }
                        arrayList2.add(c1474iM284f);
                        z10 = z10;
                        it2 = it3;
                        str3 = str;
                        cameraDevice2 = cameraDevice;
                    }
                    CameraDevice cameraDevice3 = cameraDevice2;
                    boolean z11 = z10;
                    ArrayList arrayListM279g = C0087s0.m279g(arrayList2);
                    C0033Q0 c0033q0 = c0087s0.f342d;
                    c0033q0.f166f = c0085r0;
                    C1487v c1487v = new C1487v(arrayListM279g, c0033q0.f164d, new C0069j0(c0033q0, 1));
                    if (c3865u0.f11683g.f11484c == 5 && (inputConfiguration = c3865u0.f11684h) != null) {
                        c1487v.f3907a.mo2124b(C1473h.m2112a(inputConfiguration));
                    }
                    try {
                        ArrayList arrayList3 = new ArrayList(hashSet);
                        C3835f0 c3835f0M4568a = C3835f0.m4568a(c3825a0M4559o);
                        ArrayList arrayList4 = new ArrayList(arrayList);
                        C3875z0 c3875z1 = C3875z0.f11717b;
                        ArrayMap arrayMap2 = new ArrayMap();
                        for (String str4 : c3829c0.f11718a.keySet()) {
                            arrayMap2.put(str4, c3829c0.f11718a.get(str4));
                        }
                        CaptureRequest captureRequestM3190d = AbstractC2119a.m3190d(new C3799E(arrayList3, c3835f0M4568a, i12, z11, arrayList4, z6, new C3875z0(arrayMap2), null), cameraDevice3, c0087s0.f355q);
                        if (captureRequestM3190d != null) {
                            c1487v.f3907a.mo2130h(captureRequestM3190d);
                        }
                        c5231m = c0087s0.f342d.m180p(cameraDevice3, c1487v, c0087s0.f346h);
                    } catch (CameraAccessException e10) {
                        c5231m = new C5231m(e10, 1);
                    }
                } else if (iM24h != 4) {
                    c5231m = new C5231m(new CancellationException("openCaptureSession() not execute in state: ".concat(AbstractC0010F.m26j(c0087s0.f347i))), i10);
                } else {
                    c5231m = new C5231m(new IllegalStateException("openCaptureSession() should not be possible in state: ".concat(AbstractC0010F.m26j(c0087s0.f347i))), 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5231m;
    }

    @Override // p178H.InterfaceC3168r0
    /* JADX INFO: renamed from: c */
    public void mo268c(C3151j c3151j) {
        AbstractC8995i abstractC8995i;
        C13287b c13287b = (C13287b) this.f331Z;
        c13287b.getClass();
        AbstractC8072d6.m8486c("PreviewView", "Preview transformation info updated. " + c3151j);
        boolean z6 = ((InterfaceC3870x) this.f332o0).mo122r().mo141f() == 0;
        PreviewView previewView = (PreviewView) c13287b.f42000Z;
        C8989c c8989c = previewView.f32350r0;
        Size size = ((C3170s0) this.f333p0).f9535b;
        c8989c.getClass();
        AbstractC8072d6.m8486c("PreviewTransform", "Transformation info set: " + c3151j + Separators.f31991SP + size + Separators.f31991SP + z6);
        c8989c.f27428b = c3151j.f9482a;
        c8989c.f27429c = c3151j.f9483b;
        int i10 = c3151j.f9484c;
        c8989c.f27431e = i10;
        c8989c.f27427a = size;
        c8989c.f27432f = z6;
        c8989c.f27433g = c3151j.f9485d;
        c8989c.f27430d = c3151j.f9486e;
        if (i10 == -1 || ((abstractC8995i = previewView.f32348p0) != null && (abstractC8995i instanceof C9003q))) {
            previewView.f32351s0 = true;
        } else {
            previewView.f32351s0 = false;
        }
        previewView.m11194a();
    }

    @Override // io.sentry.InterfaceC15141L1
    /* JADX INFO: renamed from: d */
    public void mo269d(C15135J1 c15135j1) {
        C15211c c15211cM16019l;
        int i10;
        int i11 = 1;
        C15126G1 c15126g1 = (C15126G1) this.f331Z;
        InterfaceC15141L1 interfaceC15141L1 = (InterfaceC15141L1) this.f332o0;
        AtomicReference atomicReference = (AtomicReference) this.f333p0;
        if (interfaceC15141L1 != null) {
            c15126g1.getClass();
            interfaceC15141L1.mo269d(c15135j1);
        }
        C15216g c15216g = c15126g1.f47092r.f47224t0;
        if (c15216g != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) c15216g.f47470a;
            WeakReference weakReference = (WeakReference) c15216g.f47471b;
            String str = (String) c15216g.f47472c;
            activityLifecycleIntegration.getClass();
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                C14522e c14522e = activityLifecycleIntegration.f47272C0;
                C15447t c15447t = c15126g1.f47075a;
                synchronized (c14522e) {
                    if (c14522e.m16027u()) {
                        RunnableC15210b runnableC15210b = new RunnableC15210b(c14522e, activity, i11);
                        C15211c c15211c = null;
                        c14522e.m16031y(runnableC15210b, null);
                        C15211c c15211c2 = (C15211c) ((WeakHashMap) c14522e.f45764p0).remove(activity);
                        if (c15211c2 != null && (c15211cM16019l = c14522e.m16019l()) != null) {
                            c15211c = new C15211c(c15211cM16019l.f47456a - c15211c2.f47456a, c15211cM16019l.f47457b - c15211c2.f47457b, c15211cM16019l.f47458c - c15211c2.f47458c);
                        }
                        if (c15211c != null && ((i10 = c15211c.f47456a) != 0 || c15211c.f47457b != 0 || c15211c.f47458c != 0)) {
                            C15436i c15436i = new C15436i(Integer.valueOf(i10), "none");
                            C15436i c15436i2 = new C15436i(Integer.valueOf(c15211c.f47457b), "none");
                            C15436i c15436i3 = new C15436i(Integer.valueOf(c15211c.f47458c), "none");
                            HashMap map = new HashMap();
                            map.put("frames_total", c15436i);
                            map.put("frames_slow", c15436i2);
                            map.put("frames_frozen", c15436i3);
                            ((ConcurrentHashMap) c14522e.f45763o0).put(c15447t, map);
                        }
                    }
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f47276p0;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        InterfaceC15167U1 interfaceC15167U1 = c15126g1.f47091q;
        if (interfaceC15167U1 != null) {
            atomicReference.set(interfaceC15167U1.mo16352n(c15126g1));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m270e(C15132I1 c15132i1) {
        ConcurrentHashMap concurrentHashMap;
        C11238i c11238i = (C11238i) this.f331Z;
        if (c15132i1 == null) {
            ((C15524y1) c11238i.f34008Y).getLogger().mo16298o(EnumC15375i1.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        c11238i.getClass();
        C15347d1 c15347d1 = (C15347d1) this.f332o0;
        String strMo16462e = null;
        EnumC15129H1 enumC15129H1 = c15347d1.m16575d() != null ? EnumC15129H1.Crashed : null;
        boolean z6 = EnumC15129H1.Crashed == enumC15129H1 || c15347d1.m16576e();
        C15441n c15441n = c15347d1.f47197p0;
        String str = (c15441n == null || (concurrentHashMap = c15441n.f48186r0) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) c15347d1.f47197p0.f48186r0.get("user-agent");
        Object objM9088b = AbstractC8465D3.m9088b((C15516w) this.f333p0);
        if (objM9088b instanceof InterfaceC15362a) {
            strMo16462e = ((InterfaceC15362a) objM9088b).mo16462e();
            enumC15129H1 = EnumC15129H1.Abnormal;
        }
        if (!c15132i1.m16303c(enumC15129H1, str, z6, strMo16462e) || c15132i1.f47105s0 == EnumC15129H1.Ok) {
            return;
        }
        c15132i1.m16302b(AbstractC8656j3.m9340h());
    }

    /* JADX INFO: renamed from: f */
    public void m271f() {
        C0042V0 c0042v0;
        AtomicReference atomicReference = ((PreviewView) ((C13287b) this.f331Z).f42000Z).f32353u0;
        do {
            c0042v0 = (C0042V0) this.f332o0;
            if (atomicReference.compareAndSet(c0042v0, null)) {
                c0042v0.m219m(EnumC8994h.f27446Y);
                break;
            }
        } while (atomicReference.get() == c0042v0);
        C5222d c5222d = (C5222d) c0042v0.f209r0;
        if (c5222d != null) {
            c5222d.cancel(false);
            c0042v0.f209r0 = null;
        }
        ((InterfaceC3870x) this.f333p0).mo106b().mo4565i(c0042v0);
    }

    @Override // p746fa.InterfaceC13598g
    /* JADX INFO: renamed from: z */
    public C13606o mo272z(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f331Z;
        String str = (String) this.f332o0;
        C2393w c2393w = (C2393w) this.f333p0;
        String str2 = (String) obj;
        C13287b c13287bM13706c = FirebaseMessaging.m13706c(firebaseMessaging.f36853b);
        C16187g c16187g = firebaseMessaging.f36852a;
        c16187g.m17794a();
        String strM17795c = "[DEFAULT]".equals(c16187g.f50236b) ? "" : c16187g.m17795c();
        String strM3494b = firebaseMessaging.f36859h.m3494b();
        synchronized (c13287bM13706c) {
            String strM3569a = C2393w.m3569a(str2, System.currentTimeMillis(), strM3494b);
            if (strM3569a != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c13287bM13706c.f42000Z).edit();
                editorEdit.putString(strM17795c + "|T|" + str + "|*", strM3569a);
                editorEdit.commit();
            }
        }
        if (c2393w == null || !str2.equals(c2393w.f7442a)) {
            C16187g c16187g2 = firebaseMessaging.f36852a;
            c16187g2.m17794a();
            if ("[DEFAULT]".equals(c16187g2.f50236b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    c16187g2.m17794a();
                    sb2.append(c16187g2.f50236b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C2380j(firebaseMessaging.f36853b).m3478b(intent);
            }
        }
        return AbstractC7854B5.m8117e(str2);
    }

    public /* synthetic */ C0083q0(Object obj, Object obj2, Object obj3, int i10) {
        this.f330Y = i10;
        this.f331Z = obj;
        this.f332o0 = obj2;
        this.f333p0 = obj3;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        switch (this.f330Y) {
            case 2:
                C10145l c10145l = (C10145l) this.f331Z;
                RunnableC0000A runnableC0000A = new RunnableC0000A(c10145l, 25);
                ExecutorC4836i executorC4836i = (ExecutorC4836i) this.f332o0;
                C10147n c10147n = c10142i.f30066c;
                if (c10147n != null) {
                    c10147n.mo5766a(runnableC0000A, executorC4836i);
                }
                c10145l.mo5766a(new RunnableC5228j(c10145l, 0, new C18655i(c10142i, 9)), executorC4836i);
                return "surfaceList[" + ((List) this.f333p0) + "]";
            case 3:
                C6771e c6771e = (C6771e) this.f331Z;
                c6771e.getClass();
                c6771e.m7204d(new RunnableC0696c(c6771e, (C3175v) this.f332o0, (Map) this.f333p0, c10142i, 4), new RunnableC0068j(0));
                return "Init GlRenderer";
            case 4:
                C6974e c6974e = (C6974e) this.f331Z;
                c6974e.getClass();
                c6974e.m7336d(new RunnableC0696c(c6974e, (C3175v) this.f332o0, (Map) this.f333p0, c10142i, 5), new RunnableC0068j(0));
                return "Init GlRenderer";
            default:
                ((C0042V0) this.f331Z).getClass();
                InterfaceC3866v interfaceC3866v = (InterfaceC3866v) this.f332o0;
                C0082q c0082q = new C0082q(c10142i, interfaceC3866v);
                ((ArrayList) this.f333p0).add(c0082q);
                interfaceC3866v.mo139d(AbstractC8577W2.m9240b(), c0082q);
                return YladLSetV.dEOU;
        }
    }

    @Override // p745f9.InterfaceC13587e
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo22420apply(Object obj) {
        long jInsert;
        C7836c c7836c;
        C13589g c13589g;
        C7836c c7836c2;
        EnumC11264c enumC11264c;
        EnumC11264c enumC11264c2;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        EnumC11264c enumC11264c3 = EnumC11264c.CACHE_FULL;
        int i13 = 2;
        Object obj2 = this.f333p0;
        int i14 = 0;
        Object obj3 = this.f332o0;
        Object obj4 = this.f331Z;
        int i15 = 1;
        switch (this.f330Y) {
            case 9:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C13589g c13589g2 = (C13589g) obj4;
                long jSimpleQueryForLong = c13589g2.m15109a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c13589g2.m15109a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C13583a c13583a = c13589g2.f42953p0;
                long j10 = c13583a.f42939a;
                C9681h c9681h = (C9681h) obj3;
                String str = c9681h.f29182a;
                if (jSimpleQueryForLong >= j10) {
                    c13589g2.m15107E(1L, enumC11264c3, str);
                    return -1L;
                }
                C9682i c9682i = (C9682i) obj2;
                Long lM15106e = C13589g.m15106e(sQLiteDatabase, c9682i);
                if (lM15106e != null) {
                    jInsert = lM15106e.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c9682i.f29188a);
                    contentValues.put("priority", Integer.valueOf(AbstractC14950a.m16111a(c9682i.f29190c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c9682i.f29189b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                C9685l c9685l = c9681h.f29184c;
                byte[] bArr2 = c9685l.f29199b;
                int length = bArr2.length;
                int i16 = c13583a.f42943e;
                boolean z6 = length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c9681h.f29185d));
                contentValues2.put("uptime_ms", Long.valueOf(c9681h.f29186e));
                contentValues2.put(lZYtIbClQJm.Tqiw, c9685l.f29198a.f24730a);
                contentValues2.put("code", c9681h.f29183b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z6));
                contentValues2.put("payload", z6 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z6) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i16));
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(c9681h.f29187f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(DiagnosticsEntry.NAME_KEY, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 10:
                Cursor cursor = (Cursor) obj;
                C13589g c13589g3 = (C13589g) obj4;
                c13589g3.getClass();
                while (cursor.moveToNext()) {
                    long j11 = cursor.getLong(0);
                    int i18 = cursor.getInt(7) != 0 ? i15 : 0;
                    C10252z0 c10252z0 = new C10252z0();
                    c10252z0.f30459r0 = new HashMap();
                    String string = cursor.getString(i15);
                    if (string != null) {
                        c10252z0.f30454Y = string;
                        c10252z0.f30457p0 = Long.valueOf(cursor.getLong(i13));
                        c10252z0.f30458q0 = Long.valueOf(cursor.getLong(3));
                        if (i18 != 0) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                c7836c2 = C13589g.f42949r0;
                            } else {
                                c7836c2 = new C7836c(string2);
                            }
                            c10252z0.f30456o0 = new C9685l(c7836c2, cursor.getBlob(5));
                            c13589g = c13589g3;
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                c7836c = C13589g.f42949r0;
                            } else {
                                c7836c = new C7836c(string3);
                            }
                            Cursor cursorQuery = c13589g3.m15109a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j11)}, null, null, "sequence_num");
                            try {
                                ArrayList arrayList = new ArrayList();
                                int length2 = 0;
                                while (cursorQuery.moveToNext()) {
                                    byte[] blob = cursorQuery.getBlob(0);
                                    arrayList.add(blob);
                                    length2 += blob.length;
                                }
                                byte[] bArr3 = new byte[length2];
                                int i19 = 0;
                                int length3 = 0;
                                while (i19 < arrayList.size()) {
                                    byte[] bArr4 = (byte[]) arrayList.get(i19);
                                    ArrayList arrayList2 = arrayList;
                                    C13589g c13589g4 = c13589g3;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i19++;
                                    arrayList = arrayList2;
                                    c13589g3 = c13589g4;
                                }
                                c13589g = c13589g3;
                                cursorQuery.close();
                                c10252z0.f30456o0 = new C9685l(c7836c, bArr3);
                            } catch (Throwable th2) {
                                cursorQuery.close();
                                throw th2;
                            }
                        }
                        if (!cursor.isNull(6)) {
                            c10252z0.f30455Z = Integer.valueOf(cursor.getInt(6));
                        }
                        ((ArrayList) obj3).add(new C13584b(j11, (C9682i) obj2, c10252z0.m10846f()));
                        c13589g3 = c13589g;
                        i13 = 2;
                        i15 = 1;
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                C13589g c13589g5 = (C13589g) obj4;
                c13589g5.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i14);
                        int i20 = cursor2.getInt(1);
                        EnumC11264c enumC11264c4 = EnumC11264c.REASON_UNKNOWN;
                        if (i20 != 0) {
                            if (i20 == 1) {
                                enumC11264c4 = EnumC11264c.MESSAGE_TOO_OLD;
                            } else if (i20 == 2) {
                                enumC11264c = enumC11264c3;
                                enumC11264c2 = enumC11264c;
                            } else if (i20 == i12) {
                                enumC11264c4 = EnumC11264c.PAYLOAD_TOO_BIG;
                            } else if (i20 == i11) {
                                enumC11264c4 = EnumC11264c.MAX_RETRIES_REACHED;
                            } else if (i20 == i10) {
                                enumC11264c4 = EnumC11264c.INVALID_PAYLOD;
                            } else if (i20 == 6) {
                                enumC11264c4 = EnumC11264c.SERVER_ERROR;
                            } else {
                                AbstractC8158o4.m8716a(Integer.valueOf(i20), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                            enumC11264c2 = enumC11264c3;
                            enumC11264c = enumC11264c4;
                        } else {
                            enumC11264c2 = enumC11264c3;
                            enumC11264c = enumC11264c4;
                        }
                        long j12 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C11265d(j12, enumC11264c));
                        enumC11264c3 = enumC11264c2;
                        i10 = 5;
                        i11 = 4;
                        i12 = 3;
                        i14 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            C2391u c2391u = (C2391u) obj2;
                            if (it.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                int i21 = C11266e.f34132c;
                                new ArrayList();
                                ((ArrayList) c2391u.f7431p0).add(new C11266e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                            } else {
                                long time = c13589g5.f42951Z.getTime();
                                SQLiteDatabase sQLiteDatabaseM15109a = c13589g5.m15109a();
                                sQLiteDatabaseM15109a.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = sQLiteDatabaseM15109a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        C11268g c11268g = new C11268g(cursorRawQuery.getLong(0), time);
                                        cursorRawQuery.close();
                                        sQLiteDatabaseM15109a.setTransactionSuccessful();
                                        sQLiteDatabaseM15109a.endTransaction();
                                        c2391u.f7430o0 = c11268g;
                                        c2391u.f7432q0 = new C11263b(new C11267f(c13589g5.m15109a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c13589g5.m15109a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C13583a.f42938f.f42939a));
                                        c2391u.f7429Z = (String) c13589g5.f42954q0.get();
                                        return new C11262a((C11268g) c2391u.f7430o0, DesugarCollections.unmodifiableList((ArrayList) c2391u.f7431p0), (C11263b) c2391u.f7432q0, (String) c2391u.f7429Z);
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    sQLiteDatabaseM15109a.endTransaction();
                                    throw th4;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
