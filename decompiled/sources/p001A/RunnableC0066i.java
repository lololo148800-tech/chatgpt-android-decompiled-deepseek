package p001A;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.C11069E;
import bb.AbstractC11278C;
import bb.C11294T;
import bb.C11333z;
import com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import com.revenuecat.purchases.interfaces.Callback;
import io.sentry.C15134J0;
import io.sentry.C15138K1;
import io.sentry.C15144M1;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC15303q;
import io.sentry.android.replay.viewhierarchy.AbstractC15316d;
import io.sentry.cache.C15332f;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.protocol.C15447t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.CameraXSession;
import livekit.org.webrtc.EglRenderer;
import livekit.org.webrtc.ExecutorC17035e;
import livekit.org.webrtc.VideoFileRenderer;
import livekit.org.webrtc.VideoFrame;
import p028B.C0700g;
import p049Bm.InterfaceC1436k;
import p057C3.C1526D;
import p057C3.C1539Q;
import p057C3.C1546Y;
import p083D3.C1868f;
import p1016t3.C19762L;
import p1053v3.p1054lN.IGDwkYw;
import p109E3.C2292p;
import p1139z0.C21585H;
import p117Eb.AbstractServiceC2377g;
import p133F3.C2658d;
import p178H.C3112E;
import p178H.C3130X;
import p178H.C3163p;
import p178H.C3170s0;
import p178H.C3179x;
import p228J.AbstractC3812N;
import p228J.AbstractC3842j;
import p228J.C3822Y;
import p232J3.C4249u;
import p232J3.C4253y;
import p277L.ScheduledExecutorServiceC4831d;
import p279L1.VOxZ.sVoFrD;
import p301M.RunnableC5220b;
import p310M9.C5311e;
import p326N.C5560b;
import p414R.C6771e;
import p414R.C6778l;
import p439S.C6974e;
import p444S4.C7011q;
import p468T2.C7219k;
import p468T2.C7225q;
import p468T2.C7226r;
import p468T2.InterfaceC7217i;
import p470T4.C7241f;
import p470T4.InterfaceC7238c;
import p470T4.RunnableC7256u;
import p482Tg.C7448e;
import p523V9.AbstractC7873E0;
import p523V9.AbstractC8072d6;
import p543W8.C8442c;
import p561X.C8990d;
import p561X.C9003q;
import p561X.SurfaceHolderCallbackC9002p;
import p571X9.AbstractC9166L3;
import p571X9.AbstractC9172M3;
import p571X9.AbstractC9306j0;
import p588Y2.C9614S;
import p588Y2.C9620d;
import p588Y2.C9624h;
import p593Y8.C9681h;
import p593Y8.C9682i;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p616Z8.InterfaceC10260h;
import p658b5.C11239j;
import p658b5.C11242m;
import p697d5.C13027j;
import p701d9.C13046a;
import p720e6.C13288c;
import p745f9.C13589g;
import p746fa.C13599h;
import p826j6.AbstractC16148b;

/* JADX INFO: renamed from: A.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0066i implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f297Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f298Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f299o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f300p0;

    public /* synthetic */ RunnableC0066i(C13046a c13046a, C9682i c9682i, C8990d c8990d, C9681h c9681h) {
        this.f297Y = 21;
        this.f298Z = c13046a;
        this.f299o0 = c9682i;
        this.f300p0 = c9681h;
    }

    /* JADX INFO: renamed from: a */
    private final void m246a() {
        C13288c c13288c = (C13288c) this.f298Z;
        AbstractC9172M3 abstractC9172M3 = (AbstractC9172M3) this.f299o0;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f300p0;
        c13288c.getClass();
        try {
            C7226r c7226rM9716a = AbstractC9166L3.m9716a((Context) c13288c.f42001Y);
            if (c7226rM9716a == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            C7225q c7225q = (C7225q) ((InterfaceC7217i) c7226rM9716a.f5518b);
            synchronized (c7225q.f22920p0) {
                c7225q.f22922r0 = threadPoolExecutor;
            }
            ((InterfaceC7217i) c7226rM9716a.f5518b).mo7608x(new C7219k(abstractC9172M3, threadPoolExecutor));
        } catch (Throwable th2) {
            abstractC9172M3.mo7603a(th2);
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m247b() {
        boolean zBooleanValue;
        C7241f c7241f = (C7241f) this.f298Z;
        C13027j c13027j = (C13027j) this.f299o0;
        RunnableC7256u runnableC7256u = (RunnableC7256u) this.f300p0;
        c7241f.getClass();
        try {
            zBooleanValue = ((Boolean) c13027j.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        synchronized (c7241f.f22971k) {
            try {
                C11239j c11239jM8151b = AbstractC7873E0.m8151b(runnableC7256u.f23013o0);
                String str = c11239jM8151b.f34012a;
                if (c7241f.m7644d(str) == runnableC7256u) {
                    c7241f.m7642b(str);
                }
                C7011q.m7408d().m7410a(C7241f.f22960l, C7241f.class.getSimpleName() + Separators.f31991SP + str + " executed; reschedule = " + zBooleanValue);
                Iterator it = c7241f.f22970j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7238c) it.next()).mo7639d(c11239jM8151b, zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ RunnableC0066i(Object obj, Object obj2, Object obj3, int i10) {
        this.f297Y = i10;
        this.f298Z = obj;
        this.f299o0 = obj2;
        this.f300p0 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v45, types: [J3.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [A.B0, A.s] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, mm.i] */
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
    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        Rational rational;
        final long jM313t;
        C5560b c5560bM5950e;
        switch (this.f297Y) {
            case 0:
                C0082q c0082q = ((C0088t) this.f298Z).f367K0;
                HashSet hashSet = (HashSet) c0082q.f328b;
                AbstractC3842j abstractC3842j = (AbstractC3842j) this.f300p0;
                hashSet.add(abstractC3842j);
                ((ArrayMap) c0082q.f329c).put(abstractC3842j, (Executor) this.f299o0);
                return;
            case 1:
                C0057d0 c0057d0 = (C0057d0) this.f298Z;
                c0057d0.getClass();
                AbstractC8072d6.m8486c("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                c0057d0.f269d.mo3954a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (C0053b0) ((AtomicReference) this.f299o0).get());
                ((C10142i) this.f300p0).m10747a(null);
                return;
            case 2:
                final C0007D0 c0007d0 = (C0007D0) this.f298Z;
                C10142i c10142i = (C10142i) this.f299o0;
                C3179x c3179x = (C3179x) this.f300p0;
                if (!c0007d0.f26d) {
                    c10142i.m10748b(new C2292p("Camera is not active."));
                    return;
                }
                Rect rectMo202l = ((InterfaceC0040U0) c0007d0.f23a.f375t0.f209r0).mo202l();
                if (c0007d0.f27e != null) {
                    rational = c0007d0.f27e;
                } else {
                    Rect rectMo202l2 = ((InterfaceC0040U0) c0007d0.f23a.f375t0.f209r0).mo202l();
                    rational = new Rational(rectMo202l2.width(), rectMo202l2.height());
                }
                List list = (List) c3179x.f9587Z;
                Integer num = (Integer) c0007d0.f23a.f371p0.m1476a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                List listM13d = c0007d0.m13d(list, num == null ? 0 : num.intValue(), rational, rectMo202l, 1);
                List list2 = (List) c3179x.f9588o0;
                Integer num2 = (Integer) c0007d0.f23a.f371p0.m1476a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                List listM13d2 = c0007d0.m13d(list2, num2 == null ? 0 : num2.intValue(), rational, rectMo202l, 2);
                List list3 = (List) c3179x.f9589p0;
                Integer num3 = (Integer) c0007d0.f23a.f371p0.m1476a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                List listM13d3 = c0007d0.m13d(list3, num3 == null ? 0 : num3.intValue(), rational, rectMo202l, 4);
                if (listM13d.isEmpty() && listM13d2.isEmpty() && listM13d3.isEmpty()) {
                    c10142i.m10748b(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                    return;
                }
                ((HashSet) c0007d0.f23a.f368Y.f335b).remove(c0007d0.f36n);
                C10142i c10142i2 = c0007d0.f40r;
                if (c10142i2 != null) {
                    c10142i2.m10748b(new C2292p("Cancelled by another startFocusAndMetering()"));
                    c0007d0.f40r = null;
                }
                ((HashSet) c0007d0.f23a.f368Y.f335b).remove(null);
                ScheduledFuture scheduledFuture = c0007d0.f31i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    c0007d0.f31i = null;
                }
                c0007d0.f40r = c10142i;
                MeteringRectangle[] meteringRectangleArr = C0007D0.f22u;
                MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listM13d.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listM13d2.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listM13d3.toArray(meteringRectangleArr);
                C0003B0 c0003b0 = c0007d0.f36n;
                C0088t c0088t = c0007d0.f23a;
                ((HashSet) c0088t.f368Y.f335b).remove(c0003b0);
                ScheduledFuture scheduledFuture2 = c0007d0.f31i;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                    c0007d0.f31i = null;
                }
                ScheduledFuture scheduledFuture3 = c0007d0.f32j;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(true);
                    c0007d0.f32j = null;
                }
                c0007d0.f37o = meteringRectangleArr2;
                c0007d0.f38p = meteringRectangleArr3;
                c0007d0.f39q = meteringRectangleArr4;
                if (meteringRectangleArr2.length > 0) {
                    c0007d0.f29g = true;
                    c0007d0.f34l = false;
                    jM313t = c0088t.m313t();
                    c0007d0.m15f(true);
                } else {
                    c0007d0.f29g = false;
                    c0007d0.f34l = true;
                    jM313t = c0088t.m313t();
                }
                c0007d0.f30h = 0;
                final boolean z6 = c0088t.m304i(1) == 1;
                ?? r6 = new InterfaceC0086s() { // from class: A.B0
                    @Override // p001A.InterfaceC0086s
                    /* JADX INFO: renamed from: b */
                    public final boolean mo3b(TotalCaptureResult totalCaptureResult) {
                        C0007D0 c0007d1 = c0007d0;
                        c0007d1.getClass();
                        Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (c0007d1.f37o.length > 0) {
                            if (!z6 || num4 == null) {
                                c0007d1.f34l = true;
                            } else if (c0007d1.f30h.intValue() == 3 && (num4.intValue() == 4 || num4.intValue() == 5)) {
                                c0007d1.f34l = true;
                            }
                        }
                        if (!c0007d1.f34l || !C0088t.m294n(totalCaptureResult, jM313t)) {
                            if (c0007d1.f30h.equals(num4) || num4 == null) {
                                return false;
                            }
                            c0007d1.f30h = num4;
                            return false;
                        }
                        ScheduledFuture scheduledFuture4 = c0007d1.f32j;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(true);
                            c0007d1.f32j = null;
                        }
                        C10142i c10142i3 = c0007d1.f40r;
                        if (c10142i3 != null) {
                            c10142i3.m10747a(new C3130X(1));
                            c0007d1.f40r = null;
                        }
                        return true;
                    }
                };
                c0007d0.f36n = r6;
                c0088t.m297a(r6);
                long j10 = c0007d0.f33k + 1;
                c0007d0.f33k = j10;
                RunnableC0097x0 runnableC0097x0 = new RunnableC0097x0(c0007d0, j10, 1);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d = c0007d0.f25c;
                c0007d0.f32j = scheduledExecutorServiceC4831d.schedule(runnableC0097x0, 5000L, timeUnit);
                long j11 = c3179x.f9586Y;
                if (j11 > 0) {
                    c0007d0.f31i = scheduledExecutorServiceC4831d.schedule(new RunnableC0097x0(c0007d0, j10, 2), j11, timeUnit);
                    return;
                }
                return;
            case 3:
                C0042V0 c0042v0 = (C0042V0) this.f298Z;
                C10142i c10142i3 = (C10142i) this.f299o0;
                C5560b c5560b = (C5560b) this.f300p0;
                if (c0042v0.f204Y) {
                    ((InterfaceC0040U0) c0042v0.f209r0).mo199d(c5560b.f18025a, c10142i3);
                    ((C0088t) c0042v0.f205Z).m313t();
                    return;
                }
                synchronized (((C0044W0) c0042v0.f207p0)) {
                    ((C0044W0) c0042v0.f207p0).m231e(1.0f);
                    c5560bM5950e = C5560b.m5950e((C0044W0) c0042v0.f207p0);
                    break;
                }
                c0042v0.m218l(c5560bM5950e);
                c10142i3.m10748b(new C2292p("Camera is not active."));
                return;
            case 4:
                ((CameraCaptureSession.StateCallback) ((C0700g) this.f298Z).f2041b).onSurfacePrepared((CameraCaptureSession) this.f299o0, (Surface) this.f300p0);
                return;
            case 5:
                C1539Q c1539q = (C1539Q) this.f298Z;
                c1539q.getClass();
                C11294T c11294tM12768j = ((C11333z) this.f299o0).m12768j();
                C1868f c1868f = c1539q.f4203c;
                AbstractC3812N abstractC3812N = c1868f.f5370s0;
                abstractC3812N.getClass();
                C0017I0 c0017i0 = c1868f.f5367p0;
                c0017i0.getClass();
                c0017i0.f65Z = AbstractC11278C.m12691t(c11294tM12768j);
                if (!c11294tM12768j.isEmpty()) {
                    c0017i0.f68q0 = (C4253y) c11294tM12768j.get(0);
                    C4253y c4253y = (C4253y) this.f300p0;
                    c4253y.getClass();
                    c0017i0.f69r0 = c4253y;
                }
                if (((C4253y) c0017i0.f67p0) == null) {
                    c0017i0.f67p0 = C0017I0.m60n(abstractC3812N, (AbstractC11278C) c0017i0.f65Z, (C4253y) c0017i0.f68q0, (C19762L) c0017i0.f64Y);
                }
                c0017i0.m67F(((C1526D) abstractC3812N).m2239Y());
                return;
            case 6:
                C1868f c1868f2 = (C1868f) ((C1546Y) ((C21585H) this.f298Z).f68345o0).f4245i;
                Pair pair = (Pair) this.f299o0;
                c1868f2.mo2750H(((Integer) pair.first).intValue(), (C4253y) pair.second, (C4249u) this.f300p0);
                return;
            case 7:
                C0095w0 c0095w0 = (C0095w0) this.f298Z;
                c0095w0.getClass();
                Log.d("RequestMonitor", "RequestListener " + ((C0084r) this.f299o0) + " done " + c0095w0);
                ((List) c0095w0.f411o0).remove((C10145l) this.f300p0);
                return;
            case 8:
                Intent intent = (Intent) this.f299o0;
                C13599h c13599h = (C13599h) this.f300p0;
                AbstractServiceC2377g abstractServiceC2377g = (AbstractServiceC2377g) this.f298Z;
                abstractServiceC2377g.getClass();
                try {
                    abstractServiceC2377g.mo3475b(intent);
                    return;
                } finally {
                    c13599h.m15114b(null);
                }
            case 9:
                C11069E c11069e = (C11069E) ((C15384c) this.f298Z).f47967Z;
                C3822Y c3822y = (C3822Y) this.f299o0;
                if (c3822y != null) {
                    c11069e.mo12121i(c3822y);
                }
                c11069e.m12120f((C3822Y) this.f300p0);
                return;
            case 10:
                C2658d c2658d = (C2658d) this.f298Z;
                this.f299o0.mo2750H(c2658d.f8168a, c2658d.f8169b, (C4249u) this.f300p0);
                return;
            case 11:
                GoogleDeviceIdentifiersFetcher.getDeviceIdentifiers$lambda$0((GoogleDeviceIdentifiersFetcher) this.f298Z, (Application) this.f299o0, (InterfaceC1436k) this.f300p0);
                return;
            case 12:
                if (((C6771e) this.f298Z).f21732v0) {
                    ((Runnable) this.f299o0).run();
                    return;
                } else {
                    ((Runnable) this.f300p0).run();
                    return;
                }
            case 13:
                ((C11242m) this.f298Z).m12615t((C6778l) this.f299o0, (Map.Entry) this.f300p0);
                return;
            case 14:
                if (((C6974e) this.f298Z).f22298r0) {
                    ((Runnable) this.f299o0).run();
                    return;
                } else {
                    ((Runnable) this.f300p0).run();
                    return;
                }
            case 15:
                m246a();
                return;
            case 16:
                m247b();
                return;
            case 17:
                SurfaceHolderCallbackC9002p surfaceHolderCallbackC9002p = ((C9003q) this.f298Z).f27472f;
                surfaceHolderCallbackC9002p.m9590a();
                boolean z10 = surfaceHolderCallbackC9002p.f27469s0;
                C3170s0 c3170s0 = (C3170s0) this.f299o0;
                if (z10) {
                    surfaceHolderCallbackC9002p.f27469s0 = false;
                    c3170s0.m4001c();
                    c3170s0.f9542i.m10747a(null);
                    return;
                }
                surfaceHolderCallbackC9002p.f27464Z = c3170s0;
                surfaceHolderCallbackC9002p.f27466p0 = (C0083q0) this.f300p0;
                Size size = c3170s0.f9535b;
                surfaceHolderCallbackC9002p.f27463Y = size;
                surfaceHolderCallbackC9002p.f27468r0 = false;
                if (surfaceHolderCallbackC9002p.m9591b()) {
                    return;
                }
                AbstractC8072d6.m8486c(IGDwkYw.QptxG, sVoFrD.SSXUJrJJAXoNWKM);
                surfaceHolderCallbackC9002p.f27470t0.f27471e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                return;
            case 18:
                ArrayList arrayList = (ArrayList) this.f298Z;
                C9614S c9614s = (C9614S) this.f299o0;
                AbstractC16544l.m18094g((C9624h) this.f300p0, "this$0");
                if (arrayList.contains(c9614s)) {
                    arrayList.remove(c9614s);
                    View view = c9614s.f28950c.f33135Q0;
                    int i10 = c9614s.f28948a;
                    AbstractC16544l.m18093f(view, "view");
                    AbstractC9306j0.m9884c(view, i10);
                    return;
                }
                return;
            case 19:
                C9624h this$0 = (C9624h) this.f298Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                C9620d animationInfo = (C9620d) this.f300p0;
                AbstractC16544l.m18094g(animationInfo, "$animationInfo");
                this$0.f29003a.endViewTransition((View) this.f299o0);
                animationInfo.m770d();
                return;
            case 20:
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2((AbstractC16148b) this.f298Z, (AtomicBoolean) this.f299o0, (Callback) this.f300p0);
                return;
            case 21:
                C9682i c9682i = (C9682i) this.f299o0;
                String str = c9682i.f29188a;
                C9681h c9681h = (C9681h) this.f300p0;
                C13046a c13046a = (C13046a) this.f298Z;
                c13046a.getClass();
                Logger logger = C13046a.f41460f;
                try {
                    InterfaceC10260h interfaceC10260hM10859a = c13046a.f41463c.m10859a(str);
                    if (interfaceC10260hM10859a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((C13589g) c13046a.f41465e).m15108P(new C0083q0(c13046a, c9682i, ((C8442c) interfaceC10260hM10859a).m9044a(c9681h), 8));
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    return;
                }
            case 22:
                Bitmap bitmap = (Bitmap) this.f298Z;
                ViewTreeObserverOnDrawListenerC15303q this$1 = (ViewTreeObserverOnDrawListenerC15303q) this.f299o0;
                AbstractC16544l.m18094g(this$1, "this$0");
                AbstractC15316d abstractC15316d = (AbstractC15316d) this.f300p0;
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix((Matrix) this$1.f47809v0.getValue());
                abstractC15316d.m16522a(new C7448e(this$1, bitmap, canvas, 27));
                Bitmap screenshot = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                ReplayIntegration replayIntegration = this$1.f47804q0;
                AbstractC16544l.m18093f(screenshot, "screenshot");
                replayIntegration.m16492T(screenshot);
                Bitmap bitmap2 = this$1.f47812y0;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this$1.f47812y0 = screenshot;
                this$1.f47810w0.set(false);
                bitmap.recycle();
                return;
            case 23:
                Runnable task = (Runnable) this.f298Z;
                AbstractC16544l.m18094g(task, "$task");
                C15524y1 options = (C15524y1) this.f299o0;
                AbstractC16544l.m18094g(options, "$options");
                String taskName = (String) this.f300p0;
                AbstractC16544l.m18094g(taskName, "$taskName");
                try {
                    task.run();
                    return;
                } catch (Throwable th2) {
                    options.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to execute task ".concat(taskName), th2);
                    return;
                }
            case 24:
                C15332f c15332f = (C15332f) this.f298Z;
                C15138K1 c15138k1 = (C15138K1) this.f299o0;
                if (c15138k1 != null) {
                    c15332f.m16549j(c15138k1, "trace.json");
                    return;
                }
                c15332f.getClass();
                C5311e c5311e = ((C15134J0) this.f300p0).f47129q;
                C15138K1 c15138k2 = new C15138K1((C15447t) c5311e.f17484Z, (C15144M1) c5311e.f17485o0, "default", null, null);
                c15138k2.f47152u0 = "auto";
                c15332f.m16549j(c15138k2, "trace.json");
                return;
            case 25:
                CameraXSession.openCamera$lambda$12((CameraXSession) this.f298Z, (RunnableC5220b) this.f299o0, (ExecutorC17035e) this.f300p0);
                return;
            case 26:
                CameraXSession.openCamera$lambda$12$lambda$11((CameraXSession) this.f298Z, (C3163p) this.f299o0, (C3112E) this.f300p0);
                return;
            case 27:
                ((EglRenderer) this.f298Z).lambda$removeFrameListener$2((CountDownLatch) this.f299o0, (EglRenderer.FrameListener) this.f300p0);
                return;
            default:
                ((VideoFileRenderer) this.f298Z).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f299o0, (VideoFrame) this.f300p0);
                return;
        }
    }
}
