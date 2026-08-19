package p001A;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p028B.RunnableC0704k;
import p117Eb.C2392v;
import p178H.C3162o0;
import p178H.C3175v;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3829c0;
import p228J.C3832e;
import p228J.C3835f0;
import p228J.C3847l0;
import p228J.C3865u0;
import p228J.C3875z0;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.C5225g;
import p301M.RunnableC5220b;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p615Z6.C10252z0;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0004C extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f16b;

    /* JADX INFO: renamed from: c */
    public final Object f17c;

    public C0004C(ExecutorC4836i executorC4836i, CameraDevice.StateCallback stateCallback) {
        this.f17c = executorC4836i;
        this.f16b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f15a) {
            case 0:
                ((C0018J) this.f17c).m126v("openCameraConfigAndClose camera closed", null);
                ((C10142i) this.f16b).m10747a(null);
                break;
            default:
                ((ExecutorC4836i) this.f17c).execute(new RunnableC0704k(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f15a) {
            case 0:
                ((C0018J) this.f17c).m126v("openCameraConfigAndClose camera disconnected", null);
                ((C10142i) this.f16b).m10747a(null);
                break;
            default:
                ((ExecutorC4836i) this.f17c).execute(new RunnableC0704k(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f15a) {
            case 0:
                ((C0018J) this.f17c).m126v("openCameraConfigAndClose camera error " + i10, null);
                ((C10142i) this.f16b).m10747a(null);
                break;
            default:
                ((ExecutorC4836i) this.f17c).execute(new RunnableC0078o(this, cameraDevice, i10, 3));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Object obj = this.f17c;
        switch (this.f15a) {
            case 0:
                C0018J c0018j = (C0018J) obj;
                c0018j.m126v("openCameraConfigAndClose camera opened", null);
                C0087s0 c0087s0 = new C0087s0(c0018j.f86Q0, new C3847l0(Collections.emptyList()), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                C3162o0 c3162o0 = new C3162o0(surface);
                AbstractC5229k.m5780d(c3162o0.f11530e).mo5766a(new RunnableC0074m(surface, 3, surfaceTexture), AbstractC8577W2.m9240b());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                C3825a0 c3825a0M4558d = C3825a0.m4558d();
                ArrayList arrayList = new ArrayList();
                C3829c0 c3829c0M4566a = C3829c0.m4566a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C3175v c3175v = C3175v.f9575d;
                C2392v c2392vM4567a = C3832e.m4567a(c3162o0);
                c2392vM4567a.f7440r0 = c3175v;
                linkedHashSet.add(c2392vM4567a.m3556m());
                c0018j.m126v("Start configAndClose.", null);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                C3835f0 c3835f0M4568a = C3835f0.m4568a(c3825a0M4558d);
                ArrayList arrayList10 = new ArrayList(arrayList);
                C3875z0 c3875z0 = C3875z0.f11717b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = c3829c0M4566a.f11718a;
                for (Iterator it = arrayMap2.keySet().iterator(); it.hasNext(); it = it) {
                    String str = (String) it.next();
                    arrayMap.put(str, arrayMap2.get(str));
                }
                C3865u0 c3865u0 = new C3865u0(arrayList5, arrayList6, arrayList7, arrayList8, new C3799E(arrayList9, c3835f0M4568a, 1, false, arrayList10, false, new C3875z0(arrayMap), null), null, null, null);
                C10252z0 c10252z0 = c0018j.f80K0;
                ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d = (ScheduledExecutorServiceC4831d) c10252z0.f30455Z;
                C0017I0 c0017i0 = (C0017I0) c10252z0.f30457p0;
                ExecutorC4836i executorC4836i = (ExecutorC4836i) c10252z0.f30454Y;
                C5222d c5222dM5765c = C5222d.m5765c(AbstractC16347a.m17947b(new C5225g(c0087s0.m289m(c3865u0, cameraDevice, new C0033Q0((C3847l0) c10252z0.f30458q0, (C3847l0) c10252z0.f30459r0, c0017i0, executorC4836i, scheduledExecutorServiceC4831d, (Handler) c10252z0.f30456o0)), 0)));
                C0100z c0100z = new C0100z(c0087s0, 0, c3162o0);
                c5222dM5765c.getClass();
                ExecutorC4836i executorC4836i2 = c0018j.f92o0;
                RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c5222dM5765c, c0100z, executorC4836i2);
                Objects.requireNonNull(cameraDevice);
                runnableC5220bM5782f.mo5766a(new RunnableC0000A(cameraDevice, 1), executorC4836i2);
                break;
            default:
                ((ExecutorC4836i) obj).execute(new RunnableC0704k(this, cameraDevice, 2));
                break;
        }
    }

    public C0004C(C0018J c0018j, C10142i c10142i) {
        this.f17c = c0018j;
        this.f16b = c10142i;
    }
}
