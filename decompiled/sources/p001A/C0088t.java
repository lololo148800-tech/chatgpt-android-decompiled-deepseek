package p001A;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.lifecycle.C11069E;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p028B.C0703j;
import p1009s9.C19506i;
import p105E.C2222a;
import p109E3.C2292p;
import p1138z.C21572a;
import p1139z0.C21585H;
import p155G.C2949a;
import p155G.C2951c;
import p155G.C2953e;
import p167Gb.C3032c;
import p178H.C3131Y;
import p178H.C3132Z;
import p178H.C3150i0;
import p178H.C3162o0;
import p178H.C3175v;
import p178H.C3179x;
import p178H.InterfaceC3122O;
import p178H.InterfaceC3127U;
import p228J.AbstractC3810L;
import p228J.C3796C0;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3829c0;
import p228J.C3835f0;
import p228J.C3847l0;
import p228J.C3857q0;
import p228J.C3865u0;
import p228J.C3875z0;
import p228J.EnumC3803G;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3854p;
import p228J.InterfaceC3864u;
import p253K.C4493d;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.C5231m;
import p301M.InterfaceC5219a;
import p301M.RunnableC5220b;
import p326N.C5560b;
import p477Tb.C7296c;
import p514V.C7730d;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p658b5.C11242m;
import p720e6.C13287b;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;
import p960q9.C18655i;

/* JADX INFO: renamed from: A.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0088t implements InterfaceC3864u {

    /* JADX INFO: renamed from: A0 */
    public int f357A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC3122O f358B0;

    /* JADX INFO: renamed from: C0 */
    public volatile boolean f359C0;

    /* JADX INFO: renamed from: D0 */
    public volatile int f360D0;

    /* JADX INFO: renamed from: E0 */
    public final C3032c f361E0;

    /* JADX INFO: renamed from: F0 */
    public final C2222a f362F0;

    /* JADX INFO: renamed from: G0 */
    public final AtomicLong f363G0;

    /* JADX INFO: renamed from: H0 */
    public volatile InterfaceFutureC13608b f364H0;

    /* JADX INFO: renamed from: I0 */
    public int f365I0;

    /* JADX INFO: renamed from: J0 */
    public long f366J0;

    /* JADX INFO: renamed from: K0 */
    public final C0082q f367K0;

    /* JADX INFO: renamed from: Y */
    public final C0084r f368Y;

    /* JADX INFO: renamed from: Z */
    public final ExecutorC4836i f369Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f370o0 = new Object();

    /* JADX INFO: renamed from: p0 */
    public final C0703j f371p0;

    /* JADX INFO: renamed from: q0 */
    public final C7296c f372q0;

    /* JADX INFO: renamed from: r0 */
    public final C3857q0 f373r0;

    /* JADX INFO: renamed from: s0 */
    public final C0007D0 f374s0;

    /* JADX INFO: renamed from: t0 */
    public final C0042V0 f375t0;

    /* JADX INFO: renamed from: u0 */
    public final C0036S0 f376u0;

    /* JADX INFO: renamed from: v0 */
    public final C0095w0 f377v0;

    /* JADX INFO: renamed from: w0 */
    public final C0048Y0 f378w0;

    /* JADX INFO: renamed from: x0 */
    public final C2951c f379x0;

    /* JADX INFO: renamed from: y0 */
    public final C0063g0 f380y0;

    /* JADX INFO: renamed from: z0 */
    public final C18655i f381z0;

    public C0088t(C0703j c0703j, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, ExecutorC4836i executorC4836i, C7296c c7296c, C3847l0 c3847l0) {
        C3857q0 c3857q0 = new C3857q0();
        this.f373r0 = c3857q0;
        this.f357A0 = 0;
        this.f359C0 = false;
        this.f360D0 = 2;
        this.f363G0 = new AtomicLong(0L);
        this.f364H0 = C5231m.f16977o0;
        this.f365I0 = 1;
        this.f366J0 = 0L;
        C0082q c0082q = new C0082q();
        c0082q.f328b = new HashSet();
        c0082q.f329c = new ArrayMap();
        this.f367K0 = c0082q;
        this.f371p0 = c0703j;
        this.f372q0 = c7296c;
        this.f369Z = executorC4836i;
        this.f381z0 = new C18655i(executorC4836i);
        C0084r c0084r = new C0084r(executorC4836i);
        this.f368Y = c0084r;
        c3857q0.f11656b.f283a = this.f365I0;
        c3857q0.f11656b.m242b(new C0077n0(c0084r));
        c3857q0.f11656b.m242b(c0082q);
        this.f377v0 = new C0095w0(this, executorC4836i);
        this.f374s0 = new C0007D0(this, scheduledExecutorServiceC4831d, executorC4836i, c3847l0);
        this.f375t0 = new C0042V0(this, c0703j, executorC4836i);
        this.f376u0 = new C0036S0(this, c0703j, executorC4836i);
        this.f378w0 = new C0048Y0(c0703j);
        this.f361E0 = new C3032c(c3847l0);
        this.f362F0 = new C2222a(0, c3847l0);
        this.f379x0 = new C2951c(this, executorC4836i);
        this.f380y0 = new C0063g0(this, c0703j, c3847l0, executorC4836i, scheduledExecutorServiceC4831d);
    }

    /* JADX INFO: renamed from: h */
    public static int m292h(C0703j c0703j, int i10) {
        int[] iArr = (int[]) c0703j.m1476a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m293m(iArr, i10)) {
            return i10;
        }
        return m293m(iArr, 1) ? 1 : 0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m293m(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m294n(TotalCaptureResult totalCaptureResult, long j10) {
        Long l4;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C3875z0) && (l4 = (Long) ((C3875z0) tag).f11718a.get("CameraControlSessionUpdateId")) != null && l4.longValue() >= j10;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: C */
    public final void mo295C(InterfaceC3805H interfaceC3805H) {
        C2951c c2951c = this.f379x0;
        C19506i c19506iM3779b = C2953e.m3777c(interfaceC3805H).m3779b();
        synchronized (c2951c.f8831e) {
            C7730d c7730d = c2951c.f8832f;
            c7730d.getClass();
            EnumC3803G enumC3803G = EnumC3803G.f11505p0;
            for (C3828c c3828c : c19506iM3779b.mo44k()) {
                c7730d.f24380Z.m4560t(c3828c, enumC3803G, c19506iM3779b.mo39b(c3828c));
            }
        }
        AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C2949a(c2951c, 0))).mo5766a(new RunnableC0068j(0), AbstractC8577W2.m9240b());
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: E */
    public final void mo296E(C3857q0 c3857q0) throws Exception {
        boolean zIsEmpty;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        C0048Y0 c0048y0 = this.f378w0;
        C11242m c11242m = c0048y0.f231b;
        while (true) {
            synchronized (c11242m.f34019Z) {
                zIsEmpty = ((ArrayDeque) c11242m.f34018Y).isEmpty();
            }
            if (zIsEmpty) {
                break;
            } else {
                ((InterfaceC3127U) c11242m.m12618w()).close();
            }
        }
        C3162o0 c3162o0 = c0048y0.f238i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (c3162o0 != null) {
            C3150i0 c3150i0 = c0048y0.f236g;
            if (c3150i0 != null) {
                AbstractC5229k.m5780d(c3162o0.f11530e).mo5766a(new RunnableC0046X0(c3150i0, 0), AbstractC8577W2.m9243e());
                c0048y0.f236g = null;
            }
            c3162o0.mo4507a();
            c0048y0.f238i = null;
        }
        ImageWriter imageWriter = c0048y0.f239j;
        if (imageWriter != null) {
            imageWriter.close();
            c0048y0.f239j = null;
        }
        if (c0048y0.f232c) {
            c3857q0.f11656b.f283a = 1;
            return;
        }
        if (c0048y0.f235f) {
            c3857q0.f11656b.f283a = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) c0048y0.f230a.m1476a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            AbstractC8072d6.m8487d("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i10 : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i10);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new C4493d(true));
                    map.put(Integer.valueOf(i10), inputSizes[0]);
                }
            }
        }
        if (c0048y0.f234e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) c0048y0.f230a.m1476a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i11 : validOutputFormatsForInput) {
                if (i11 == 256) {
                    Size size = (Size) map.get(34);
                    C3132Z c3132z = new C3132Z(size.getWidth(), size.getHeight(), 34, 9);
                    c0048y0.f237h = c3132z.f9420Z;
                    c0048y0.f236g = new C3150i0(c3132z);
                    c3132z.mo347p(new C0072l(c0048y0, 10), AbstractC8577W2.m9242d());
                    C3162o0 c3162o1 = new C3162o0(c0048y0.f236g.getSurface(), new Size(c0048y0.f236g.getWidth(), c0048y0.f236g.getHeight()), 34);
                    c0048y0.f238i = c3162o1;
                    C3150i0 c3150i1 = c0048y0.f236g;
                    InterfaceFutureC13608b interfaceFutureC13608bM5780d = AbstractC5229k.m5780d(c3162o1.f11530e);
                    Objects.requireNonNull(c3150i1);
                    interfaceFutureC13608bM5780d.mo5766a(new RunnableC0046X0(c3150i1, 0), AbstractC8577W2.m9243e());
                    c3857q0.m4585b(c0048y0.f238i, C3175v.f9575d, -1);
                    C3131Y c3131y = c0048y0.f237h;
                    c3857q0.f11656b.m242b(c3131y);
                    ArrayList arrayList = c3857q0.f11659e;
                    if (!arrayList.contains(c3131y)) {
                        arrayList.add(c3131y);
                    }
                    C0069j0 c0069j0 = new C0069j0(c0048y0, 2);
                    ArrayList arrayList2 = c3857q0.f11658d;
                    if (!arrayList2.contains(c0069j0)) {
                        arrayList2.add(c0069j0);
                    }
                    c3857q0.f11661g = new InputConfiguration(c0048y0.f236g.getWidth(), c0048y0.f236g.getHeight(), c0048y0.f236g.mo343j());
                    return;
                }
            }
        }
        c3857q0.f11656b.f283a = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m297a(InterfaceC0086s interfaceC0086s) {
        ((HashSet) this.f368Y.f335b).add(interfaceC0086s);
    }

    /* JADX INFO: renamed from: b */
    public final void m298b() {
        synchronized (this.f370o0) {
            try {
                int i10 = this.f357A0;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f357A0 = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: c */
    public final InterfaceFutureC13608b mo299c(boolean z6) {
        InterfaceFutureC13608b interfaceFutureC13608bM17947b;
        if (!m306k()) {
            return new C5231m(new C2292p("Camera is not active."), 1);
        }
        C0036S0 c0036s0 = this.f376u0;
        if (c0036s0.f187Y) {
            C0036S0.m188e((C11069E) c0036s0.f191q0, Integer.valueOf(z6 ? 1 : 0));
            interfaceFutureC13608bM17947b = AbstractC16347a.m17947b(new C0099y0(c0036s0, z6, 1));
        } else {
            AbstractC8072d6.m8486c("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            interfaceFutureC13608bM17947b = new C5231m(new IllegalStateException("No flash unit"), 1);
        }
        return AbstractC5229k.m5780d(interfaceFutureC13608bM17947b);
    }

    /* JADX INFO: renamed from: d */
    public final void m300d(boolean z6) {
        this.f359C0 = z6;
        if (!z6) {
            C0063g0 c0063g0 = new C0063g0();
            c0063g0.f283a = this.f365I0;
            c0063g0.f285c = true;
            C3825a0 c3825a0M4558d = C3825a0.m4558d();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            c3825a0M4558d.m4561x(C21572a.m21847d0(key), Integer.valueOf(m292h(this.f371p0, 1)));
            c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.FLASH_MODE), 0);
            c0063g0.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
            m312s(Collections.singletonList(c0063g0.m244d()));
        }
        m313t();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final C3865u0 m301e() {
        int i10;
        int[] iArr;
        C0095w0 c0095w0;
        C3857q0 c3857q0 = this.f373r0;
        c3857q0.f11656b.f283a = this.f365I0;
        C7730d c7730d = new C7730d();
        int i11 = 1;
        c7730d.m7996a(CaptureRequest.CONTROL_MODE, 1);
        C0007D0 c0007d0 = this.f374s0;
        int i12 = 3;
        if (c0007d0.f29g) {
            i10 = 1;
        } else {
            i10 = c0007d0.f35m != 3 ? 4 : 3;
        }
        c7730d.m7996a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(c0007d0.f23a.m304i(i10)));
        MeteringRectangle[] meteringRectangleArr = c0007d0.f37o;
        if (meteringRectangleArr.length != 0) {
            c7730d.m7996a(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = c0007d0.f38p;
        if (meteringRectangleArr2.length != 0) {
            c7730d.m7996a(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = c0007d0.f39q;
        if (meteringRectangleArr3.length != 0) {
            c7730d.m7996a(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        Range range = (Range) this.f361E0.f9127Z;
        if (range != null) {
            c7730d.m7996a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
        ((InterfaceC0040U0) this.f375t0.f209r0).mo203n(c7730d);
        int i13 = this.f374s0.f41s ? 5 : 1;
        if (!this.f359C0) {
            int i14 = this.f360D0;
            if (i14 == 0) {
                C2222a c2222a = this.f362F0;
                if (c2222a.f6805a || c2222a.f6806b) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
            } else if (i14 != 1) {
                if (i14 == 2) {
                    i12 = 1;
                }
            }
            c7730d.m7996a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m292h(this.f371p0, i12)));
            CaptureRequest.Key key = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.f371p0.m1476a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!m293m(iArr, 1) && !m293m(iArr, 1))) {
                i11 = 0;
            }
            c7730d.m7996a(key, Integer.valueOf(i11));
            c0095w0 = this.f377v0;
            c0095w0.getClass();
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            synchronized (((C13287b) c0095w0.f411o0).f42000Z) {
            }
            c7730d.m7996a(key2, 0);
            this.f379x0.m3774a(c7730d);
            C21572a c21572a = new C21572a(C3835f0.m4568a(c7730d.f24380Z), 8);
            C0063g0 c0063g0 = c3857q0.f11656b;
            c0063g0.getClass();
            c0063g0.f287e = C3825a0.m4559o(c21572a);
            ((C3829c0) this.f373r0.f11656b.f289g).f11718a.put("CameraControlSessionUpdateId", Long.valueOf(this.f366J0));
            return this.f373r0.m4586c();
        }
        c7730d.m7996a(CaptureRequest.FLASH_MODE, 2);
        i12 = i13;
        c7730d.m7996a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m292h(this.f371p0, i12)));
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.f371p0.m1476a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i11 = 0;
        } else {
            i11 = 0;
        }
        c7730d.m7996a(key3, Integer.valueOf(i11));
        c0095w0 = this.f377v0;
        c0095w0.getClass();
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        synchronized (((C13287b) c0095w0.f411o0).f42000Z) {
            c7730d.m7996a(key4, 0);
            this.f379x0.m3774a(c7730d);
            C21572a c21572a2 = new C21572a(C3835f0.m4568a(c7730d.f24380Z), 8);
            C0063g0 c0063g1 = c3857q0.f11656b;
            c0063g1.getClass();
            c0063g1.f287e = C3825a0.m4559o(c21572a2);
            ((C3829c0) this.f373r0.f11656b.f289g).f11718a.put("CameraControlSessionUpdateId", Long.valueOf(this.f366J0));
            return this.f373r0.m4586c();
        }
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: f */
    public final InterfaceFutureC13608b mo302f(C3179x c3179x) {
        if (!m306k()) {
            return new C5231m(new C2292p("Camera is not active."), 1);
        }
        C0007D0 c0007d0 = this.f374s0;
        c0007d0.getClass();
        return AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C0100z(c0007d0, 3, c3179x)));
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: g */
    public final InterfaceFutureC13608b mo303g(float f10) {
        InterfaceFutureC13608b c5231m;
        C5560b c5560bM5950e;
        if (!m306k()) {
            return new C5231m(new C2292p("Camera is not active."), 1);
        }
        C0042V0 c0042v0 = this.f375t0;
        synchronized (((C0044W0) c0042v0.f207p0)) {
            try {
                ((C0044W0) c0042v0.f207p0).m231e(f10);
                c5560bM5950e = C5560b.m5950e((C0044W0) c0042v0.f207p0);
            } catch (IllegalArgumentException e10) {
                c5231m = new C5231m(e10, 1);
            }
        }
        c0042v0.m218l(c5560bM5950e);
        c5231m = AbstractC16347a.m17947b(new C0100z(c0042v0, 5, c5560bM5950e));
        return AbstractC5229k.m5780d(c5231m);
    }

    /* JADX INFO: renamed from: i */
    public final int m304i(int i10) {
        int[] iArr = (int[]) this.f371p0.m1476a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m293m(iArr, i10)) {
            return i10;
        }
        if (m293m(iArr, 4)) {
            return 4;
        }
        return m293m(iArr, 1) ? 1 : 0;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: j */
    public final Rect mo305j() {
        Rect rect = (Rect) this.f371p0.m1476a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m306k() {
        int i10;
        synchronized (this.f370o0) {
            i10 = this.f357A0;
        }
        return i10 > 0;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: l */
    public final void mo307l(int i10) {
        if (!m306k()) {
            AbstractC8072d6.m8492i("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f360D0 = i10;
        AbstractC8072d6.m8486c("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f360D0);
        C0048Y0 c0048y0 = this.f378w0;
        boolean z6 = true;
        if (this.f360D0 != 1 && this.f360D0 != 0) {
            z6 = false;
        }
        c0048y0.f233d = z6;
        this.f364H0 = AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C0072l(this, 0)));
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: o */
    public final InterfaceFutureC13608b mo308o(final ArrayList arrayList, final int i10, final int i11) {
        if (!m306k()) {
            AbstractC8072d6.m8492i("Camera2CameraControlImp", "Camera is not active.");
            return new C5231m(new C2292p("Camera is not active."), 1);
        }
        final int i12 = this.f360D0;
        C5222d c5222dM5765c = C5222d.m5765c(AbstractC5229k.m5780d(this.f364H0));
        InterfaceC5219a interfaceC5219a = new InterfaceC5219a() { // from class: A.h
            @Override // p301M.InterfaceC5219a
            public final InterfaceFutureC13608b apply(Object obj) {
                C0063g0 c0063g0 = this.f291Y.f380y0;
                int i13 = i11;
                int i14 = i10;
                int i15 = i12;
                C0047Y c0047yM245e = c0063g0.m245e(i14, i15, i13);
                C5222d c5222dM5765c2 = C5222d.m5765c(c0047yM245e.m232a(i15));
                C0039U c0039u = new C0039U(c0047yM245e, i15, arrayList);
                c5222dM5765c2.getClass();
                ExecutorC4836i executorC4836i = c0047yM245e.f222b;
                RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c5222dM5765c2, c0039u, executorC4836i);
                runnableC5220bM5782f.mo5766a(new RunnableC0000A(c0047yM245e, 3), executorC4836i);
                return AbstractC5229k.m5780d(runnableC5220bM5782f);
            }
        };
        ExecutorC4836i executorC4836i = this.f369Z;
        c5222dM5765c.getClass();
        return AbstractC5229k.m5782f(c5222dM5765c, interfaceC5219a, executorC4836i);
    }

    /* JADX INFO: renamed from: p */
    public final void m309p(boolean z6) {
        C5560b c5560bM5950e;
        AbstractC8072d6.m8486c("Camera2CameraControlImp", "setActive: isActive = " + z6);
        C0007D0 c0007d0 = this.f374s0;
        if (z6 != c0007d0.f26d) {
            c0007d0.f26d = z6;
            if (!c0007d0.f26d) {
                c0007d0.m11b();
            }
        }
        C0042V0 c0042v0 = this.f375t0;
        if (c0042v0.f204Y != z6) {
            c0042v0.f204Y = z6;
            if (!z6) {
                synchronized (((C0044W0) c0042v0.f207p0)) {
                    ((C0044W0) c0042v0.f207p0).m231e(1.0f);
                    c5560bM5950e = C5560b.m5950e((C0044W0) c0042v0.f207p0);
                }
                c0042v0.m218l(c5560bM5950e);
                ((InterfaceC0040U0) c0042v0.f209r0).mo204p();
                ((C0088t) c0042v0.f205Z).m313t();
            }
        }
        C0036S0 c0036s0 = this.f376u0;
        if (c0036s0.f188Z != z6) {
            c0036s0.f188Z = z6;
            if (!z6) {
                if (c0036s0.f189o0) {
                    c0036s0.f189o0 = false;
                    ((C0088t) c0036s0.f190p0).m300d(false);
                    C0036S0.m188e((C11069E) c0036s0.f191q0, 0);
                }
                C10142i c10142i = (C10142i) c0036s0.f193s0;
                if (c10142i != null) {
                    c10142i.m10748b(new C2292p("Camera is not active."));
                    c0036s0.f193s0 = null;
                }
            }
        }
        this.f377v0.m358B(z6);
        C2951c c2951c = this.f379x0;
        c2951c.getClass();
        c2951c.f8830d.execute(new RunnableC0098y(c2951c, z6, 2));
        if (z6) {
            return;
        }
        this.f358B0 = null;
        ((AtomicInteger) this.f381z0.f59414Z).set(0);
        AbstractC8072d6.m8486c("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: q */
    public final InterfaceFutureC13608b mo310q(final int i10, final int i11) {
        if (!m306k()) {
            AbstractC8072d6.m8492i("Camera2CameraControlImp", "Camera is not active.");
            return new C5231m(new C2292p("Camera is not active."), 1);
        }
        final int i12 = this.f360D0;
        C5222d c5222dM5765c = C5222d.m5765c(AbstractC5229k.m5780d(this.f364H0));
        InterfaceC5219a interfaceC5219a = new InterfaceC5219a() { // from class: A.k
            @Override // p301M.InterfaceC5219a
            public final InterfaceFutureC13608b apply(Object obj) {
                C0063g0 c0063g0 = this.f305Y.f380y0;
                int i13 = i11;
                int i14 = i10;
                int i15 = i12;
                return AbstractC5229k.m5779c(new C0037T(c0063g0.m245e(i14, i15, i13), (ExecutorC4836i) c0063g0.f289g, i15));
            }
        };
        ExecutorC4836i executorC4836i = this.f369Z;
        c5222dM5765c.getClass();
        return AbstractC5229k.m5782f(c5222dM5765c, interfaceC5219a, executorC4836i);
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: r */
    public final InterfaceC3805H mo311r() {
        C21572a c21572a;
        C2951c c2951c = this.f379x0;
        synchronized (c2951c.f8831e) {
            C7730d c7730d = c2951c.f8832f;
            c7730d.getClass();
            c21572a = new C21572a(C3835f0.m4568a(c7730d.f24380Z), 8);
        }
        return c21572a;
    }

    /* JADX INFO: renamed from: t */
    public final long m313t() {
        this.f366J0 = this.f363G0.getAndIncrement();
        ((C0018J) this.f372q0.f23104Z).m103M();
        return this.f366J0;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: u */
    public final void mo314u(InterfaceC3122O interfaceC3122O) {
        this.f358B0 = interfaceC3122O;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: x */
    public final void mo315x() {
        C2951c c2951c = this.f379x0;
        synchronized (c2951c.f8831e) {
            c2951c.f8832f = new C7730d();
        }
        AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C2949a(c2951c, 1))).mo5766a(new RunnableC0068j(0), AbstractC8577W2.m9240b());
    }

    /* JADX INFO: renamed from: s */
    public final void m312s(List list) {
        int iM4505c;
        int iM4504b;
        InterfaceC3854p interfaceC3854p;
        C7296c c7296c = this.f372q0;
        c7296c.getClass();
        list.getClass();
        C0018J c0018j = (C0018J) c7296c.f23104Z;
        c0018j.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3799E c3799e = (C3799E) it.next();
            HashSet hashSet = new HashSet();
            C3825a0.m4558d();
            ArrayList arrayList2 = new ArrayList();
            C3829c0.m4566a();
            hashSet.addAll(c3799e.f11482a);
            C3825a0 c3825a0M4559o = C3825a0.m4559o(c3799e.f11483b);
            arrayList2.addAll(c3799e.f11486e);
            ArrayMap arrayMap = new ArrayMap();
            C3875z0 c3875z0 = c3799e.f11488g;
            for (String str : c3875z0.f11718a.keySet()) {
                arrayMap.put(str, c3875z0.f11718a.get(str));
            }
            C3829c0 c3829c0 = new C3829c0(arrayMap);
            InterfaceC3854p interfaceC3854p2 = (c3799e.f11484c != 5 || (interfaceC3854p = c3799e.f11489h) == null) ? null : interfaceC3854p;
            if (DesugarCollections.unmodifiableList(c3799e.f11482a).isEmpty() && c3799e.f11487f) {
                if (hashSet.isEmpty()) {
                    C21585H c21585h = c0018j.f90Y;
                    c21585h.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) c21585h.f68345o0).entrySet()) {
                        C3796C0 c3796c0 = (C3796C0) entry.getValue();
                        if (c3796c0.f11477f && c3796c0.f11476e) {
                            arrayList3.add(((C3796C0) entry.getValue()).f11472a);
                        }
                    }
                    Iterator it2 = DesugarCollections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        C3799E c3799e2 = ((C3865u0) it2.next()).f11683g;
                        List listUnmodifiableList = DesugarCollections.unmodifiableList(c3799e2.f11482a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (c3799e2.m4504b() != 0 && (iM4504b = c3799e2.m4504b()) != 0) {
                                c3825a0M4559o.m4561x(InterfaceC3800E0.f11494H, Integer.valueOf(iM4504b));
                            }
                            if (c3799e2.m4505c() != 0 && (iM4505c = c3799e2.m4505c()) != 0) {
                                c3825a0M4559o.m4561x(InterfaceC3800E0.f11495J, Integer.valueOf(iM4505c));
                            }
                            Iterator it3 = listUnmodifiableList.iterator();
                            while (it3.hasNext()) {
                                hashSet.add((AbstractC3810L) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        AbstractC8072d6.m8492i("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                } else {
                    AbstractC8072d6.m8492i("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            C3835f0 c3835f0M4568a = C3835f0.m4568a(c3825a0M4559o);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            C3875z0 c3875z1 = C3875z0.f11717b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = c3829c0.f11718a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new C3799E(arrayList4, c3835f0M4568a, c3799e.f11484c, c3799e.f11485d, arrayList5, c3799e.f11487f, new C3875z0(arrayMap2), interfaceC3854p2));
        }
        c0018j.m126v(tpXhEMGxfXFVSh.pooCpfAfwe, null);
        c0018j.f101x0.m287k(arrayList);
    }
}
