package p001A;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import p1009s9.C19506i;
import p109E3.C2292p;
import p1138z.C21572a;
import p178H.C3134a0;
import p228J.C3825a0;
import p228J.C3835f0;
import p228J.C3847l0;
import p228J.EnumC3803G;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.C5231m;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.DesugarCollections;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0007D0 {

    /* JADX INFO: renamed from: u */
    public static final MeteringRectangle[] f22u = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a */
    public final C0088t f23a;

    /* JADX INFO: renamed from: b */
    public final ExecutorC4836i f24b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorServiceC4831d f25c;

    /* JADX INFO: renamed from: f */
    public final C19506i f28f;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f31i;

    /* JADX INFO: renamed from: j */
    public ScheduledFuture f32j;

    /* JADX INFO: renamed from: o */
    public MeteringRectangle[] f37o;

    /* JADX INFO: renamed from: p */
    public MeteringRectangle[] f38p;

    /* JADX INFO: renamed from: q */
    public MeteringRectangle[] f39q;

    /* JADX INFO: renamed from: r */
    public C10142i f40r;

    /* JADX INFO: renamed from: s */
    public boolean f41s;

    /* JADX INFO: renamed from: t */
    public C0001A0 f42t;

    /* JADX INFO: renamed from: d */
    public volatile boolean f26d = false;

    /* JADX INFO: renamed from: e */
    public volatile Rational f27e = null;

    /* JADX INFO: renamed from: g */
    public boolean f29g = false;

    /* JADX INFO: renamed from: h */
    public Integer f30h = 0;

    /* JADX INFO: renamed from: k */
    public long f33k = 0;

    /* JADX INFO: renamed from: l */
    public boolean f34l = false;

    /* JADX INFO: renamed from: m */
    public int f35m = 1;

    /* JADX INFO: renamed from: n */
    public C0003B0 f36n = null;

    public C0007D0(C0088t c0088t, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, ExecutorC4836i executorC4836i, C3847l0 c3847l0) {
        MeteringRectangle[] meteringRectangleArr = f22u;
        this.f37o = meteringRectangleArr;
        this.f38p = meteringRectangleArr;
        this.f39q = meteringRectangleArr;
        this.f40r = null;
        this.f41s = false;
        this.f42t = null;
        this.f23a = c0088t;
        this.f24b = executorC4836i;
        this.f25c = scheduledExecutorServiceC4831d;
        this.f28f = new C19506i(c3847l0, 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m10a(boolean z6, boolean z10) {
        if (this.f26d) {
            C0063g0 c0063g0 = new C0063g0();
            c0063g0.f285c = true;
            c0063g0.f283a = this.f35m;
            C3825a0 c3825a0M4558d = C3825a0.m4558d();
            if (z6) {
                c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z10) {
                c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            c0063g0.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
            this.f23a.m312s(Collections.singletonList(c0063g0.m244d()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11b() {
        C0088t c0088t = this.f23a;
        ((HashSet) c0088t.f368Y.f335b).remove(null);
        ((HashSet) c0088t.f368Y.f335b).remove(this.f36n);
        C10142i c10142i = this.f40r;
        if (c10142i != null) {
            c10142i.m10748b(new C2292p("Cancelled by cancelFocusAndMetering()"));
            this.f40r = null;
        }
        ScheduledFuture scheduledFuture = this.f31i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f31i = null;
        }
        ScheduledFuture scheduledFuture2 = this.f32j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f32j = null;
        }
        if (this.f37o.length > 0) {
            m10a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f22u;
        this.f37o = meteringRectangleArr;
        this.f38p = meteringRectangleArr;
        this.f39q = meteringRectangleArr;
        this.f29g = false;
        c0088t.m313t();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceFutureC13608b m12c(boolean z6) {
        int i10 = Build.VERSION.SDK_INT;
        C5231m c5231m = C5231m.f16977o0;
        if (i10 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return c5231m;
        }
        if (C0088t.m292h(this.f23a.f371p0, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return c5231m;
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return AbstractC16347a.m17947b(new C0099y0(this, z6, 0));
    }

    /* JADX INFO: renamed from: d */
    public final List m13d(List list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3134a0 c3134a0 = (C3134a0) it.next();
            if (arrayList.size() == i10) {
                break;
            }
            float f10 = c3134a0.f9435a;
            if (f10 >= 0.0f && f10 <= 1.0f) {
                float f11 = c3134a0.f9436b;
                if (f11 >= 0.0f && f11 <= 1.0f) {
                    Rational rational3 = c3134a0.f9437c;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i11 == 1 && ((C3847l0) this.f28f.f61960Z).m4578e(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f10, f11) : new PointF(f10, f11);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * 0.15f)) / 2;
                    int iHeight2 = ((int) (0.15f * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                    rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                    rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                    rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final void m14e(C10142i c10142i) {
        AbstractC8072d6.m8486c("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f26d) {
            c10142i.m10748b(new C2292p("Camera is not active."));
            return;
        }
        C0063g0 c0063g0 = new C0063g0();
        c0063g0.f283a = this.f35m;
        c0063g0.f285c = true;
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        c0063g0.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
        c0063g0.m242b(new C0045X(c10142i, 1));
        this.f23a.m312s(Collections.singletonList(c0063g0.m244d()));
    }

    /* JADX INFO: renamed from: f */
    public final void m15f(boolean z6) {
        if (this.f26d) {
            C0063g0 c0063g0 = new C0063g0();
            c0063g0.f283a = this.f35m;
            c0063g0.f285c = true;
            C3825a0 c3825a0M4558d = C3825a0.m4558d();
            c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z6) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer numValueOf = Integer.valueOf(C0088t.m292h(this.f23a.f371p0, 1));
                c3825a0M4558d.m4560t(C21572a.m21847d0(key), EnumC3803G.f11503Z, numValueOf);
            }
            c0063g0.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
            c0063g0.m242b(new C0005C0(0));
            this.f23a.m312s(Collections.singletonList(c0063g0.m244d()));
        }
    }
}
