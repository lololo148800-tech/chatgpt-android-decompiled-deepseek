package p001A;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p007A5.C0376k;
import p028B.C0703j;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p105E.C2222a;
import p228J.AbstractC3807I;
import p228J.AbstractC3842j;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3829c0;
import p228J.C3835f0;
import p228J.C3847l0;
import p228J.C3875z0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3854p;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p477Tb.C7296c;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8102h4;
import p658b5.C11241l;

/* JADX INFO: renamed from: A.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0063g0 {

    /* JADX INFO: renamed from: a */
    public int f283a;

    /* JADX INFO: renamed from: b */
    public boolean f284b;

    /* JADX INFO: renamed from: c */
    public boolean f285c;

    /* JADX INFO: renamed from: d */
    public final Object f286d;

    /* JADX INFO: renamed from: e */
    public Object f287e;

    /* JADX INFO: renamed from: f */
    public final Object f288f;

    /* JADX INFO: renamed from: g */
    public final Object f289g;

    /* JADX INFO: renamed from: h */
    public Object f290h;

    public C0063g0(C0088t c0088t, C0703j c0703j, C3847l0 c3847l0, ExecutorC4836i executorC4836i, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d) {
        this.f283a = 1;
        this.f286d = c0088t;
        Integer num = (Integer) c0703j.m1476a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f285c = num != null && num.intValue() == 2;
        this.f289g = executorC4836i;
        this.f290h = scheduledExecutorServiceC4831d;
        this.f288f = c3847l0;
        this.f287e = new C0376k(4, c3847l0);
        this.f284b = AbstractC8102h4.m8579b(new C0072l(c0703j, 1));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX INFO: renamed from: f */
    public static boolean m239f(TotalCaptureResult totalCaptureResult, boolean z6) {
        char c9;
        char c10 = 6;
        if (totalCaptureResult == null) {
            return false;
        }
        C11241l c11241l = new C11241l(C3875z0.f11717b, totalCaptureResult);
        Set set = AbstractC3807I.f11515a;
        boolean z10 = c11241l.m12587F() == 2 || c11241l.m12587F() == 1 || AbstractC3807I.f11515a.contains(c11241l.mo4352w());
        Integer num = (Integer) ((TotalCaptureResult) c11241l.f34017Z).get(CaptureResult.CONTROL_AE_MODE);
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                c9 = 2;
            } else if (iIntValue == 1) {
                c9 = 3;
            } else if (iIntValue == 2) {
                c9 = 4;
            } else if (iIntValue == 3) {
                c9 = 5;
            } else if (iIntValue == 4) {
                c9 = 6;
            } else if (iIntValue == 5 && Build.VERSION.SDK_INT >= 28) {
                c9 = 7;
            } else {
                c9 = 1;
            }
        } else {
            c9 = 1;
        }
        boolean z11 = c9 == 2;
        boolean z12 = !z6 ? !(z11 || AbstractC3807I.f11517c.contains(c11241l.mo4350q())) : !(z11 || AbstractC3807I.f11518d.contains(c11241l.mo4350q()));
        Integer num2 = (Integer) ((TotalCaptureResult) c11241l.f34017Z).get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            switch (num2.intValue()) {
                case 0:
                    c10 = 2;
                    break;
                case 1:
                    c10 = 3;
                    break;
                case 2:
                    c10 = 4;
                    break;
                case 3:
                    c10 = 5;
                    break;
                case 4:
                    break;
                case 5:
                    c10 = 7;
                    break;
                case 6:
                    c10 = '\b';
                    break;
                case 7:
                    c10 = '\t';
                    break;
                case 8:
                    c10 = '\n';
                    break;
                default:
                    c10 = 1;
                    break;
            }
        } else {
            c10 = 1;
        }
        boolean z13 = c10 == 2 || AbstractC3807I.f11516b.contains(c11241l.mo4348l());
        AbstractC8072d6.m8486c("ConvergenceUtils", "checkCaptureResult, AE=" + c11241l.mo4350q() + " AF =" + c11241l.mo4352w() + " AWB=" + c11241l.mo4348l());
        return z10 && z12 && z13;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m240g(int i10, TotalCaptureResult totalCaptureResult) {
        AbstractC8072d6.m8486c("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            AbstractC8072d6.m8486c("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            if (i10 != 3) {
                throw new AssertionError(i10);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m241a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m242b((AbstractC3842j) it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m242b(AbstractC3842j abstractC3842j) {
        ArrayList arrayList = (ArrayList) this.f288f;
        if (arrayList.contains(abstractC3842j)) {
            return;
        }
        arrayList.add(abstractC3842j);
    }

    /* JADX INFO: renamed from: c */
    public void m243c(InterfaceC3805H interfaceC3805H) {
        for (C3828c c3828c : interfaceC3805H.mo44k()) {
            C3825a0 c3825a0 = (C3825a0) this.f287e;
            c3825a0.getClass();
            try {
                c3825a0.mo39b(c3828c);
            } catch (IllegalArgumentException unused) {
            }
            ((C3825a0) this.f287e).m4560t(c3828c, interfaceC3805H.mo42h(c3828c), interfaceC3805H.mo39b(c3828c));
        }
    }

    /* JADX INFO: renamed from: d */
    public C3799E m244d() {
        ArrayList arrayList = new ArrayList((HashSet) this.f286d);
        C3835f0 c3835f0M4568a = C3835f0.m4568a((C3825a0) this.f287e);
        int i10 = this.f283a;
        boolean z6 = this.f284b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f288f);
        boolean z10 = this.f285c;
        C3875z0 c3875z0 = C3875z0.f11717b;
        ArrayMap arrayMap = new ArrayMap();
        C3829c0 c3829c0 = (C3829c0) this.f289g;
        for (String str : c3829c0.f11718a.keySet()) {
            arrayMap.put(str, c3829c0.f11718a.get(str));
        }
        return new C3799E(arrayList, c3835f0M4568a, i10, z6, arrayList2, z10, new C3875z0(arrayMap), (InterfaceC3854p) this.f290h);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX INFO: renamed from: e */
    public C0047Y m245e(int i10, int i11, int i12) {
        boolean z6;
        C3847l0 c3847l0 = (C3847l0) this.f288f;
        C2222a c2222a = new C2222a(1, c3847l0);
        C0047Y c0047y = new C0047Y(this.f283a, (ExecutorC4836i) this.f289g, (ScheduledExecutorServiceC4831d) this.f290h, (C0088t) this.f286d, this.f285c, c2222a);
        ArrayList arrayList = c0047y.f228h;
        C0088t c0088t = (C0088t) this.f286d;
        if (i10 == 0) {
            arrayList.add(new C0035S(c0088t));
        }
        if (i11 != 3) {
            if (this.f284b) {
                boolean z10 = ((C0376k) this.f287e).f1278Z;
                if (z10 || this.f283a == 3 || i12 == 1) {
                    if (z10) {
                        z6 = false;
                    } else {
                        int i13 = ((AtomicInteger) c0088t.f381z0.f59414Z).get();
                        AbstractC8072d6.m8486c("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + i13);
                        if (i13 > 0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                    }
                    arrayList.add(new C0061f0((C0088t) this.f286d, i11, (ExecutorC4836i) this.f289g, (ScheduledExecutorServiceC4831d) this.f290h, z6));
                } else {
                    arrayList.add(new C0032Q(c0088t, i11, c2222a));
                }
            }
            StringBuilder sbM21e = AbstractC0010F.m21e("createPipeline: captureMode = ", i10, ", flashMode = ", i11, ", flashType = ");
            sbM21e.append(i12);
            sbM21e.append(QzvfuIgrngtl.ReZWXd);
            sbM21e.append(arrayList);
            AbstractC8072d6.m8486c("Camera2CapturePipeline", sbM21e.toString());
            return c0047y;
        }
        arrayList.add(new C0057d0(c0088t, (ExecutorC4836i) this.f289g, (ScheduledExecutorServiceC4831d) this.f290h, new C7296c(c3847l0)));
        StringBuilder sbM21e2 = AbstractC0010F.m21e("createPipeline: captureMode = ", i10, ", flashMode = ", i11, ", flashType = ");
        sbM21e2.append(i12);
        sbM21e2.append(QzvfuIgrngtl.ReZWXd);
        sbM21e2.append(arrayList);
        AbstractC8072d6.m8486c("Camera2CapturePipeline", sbM21e2.toString());
        return c0047y;
    }

    public C0063g0() {
        this.f286d = new HashSet();
        this.f287e = C3825a0.m4558d();
        this.f283a = -1;
        this.f284b = false;
        this.f288f = new ArrayList();
        this.f285c = false;
        this.f289g = C3829c0.m4566a();
    }

    public C0063g0(C3799E c3799e) {
        HashSet hashSet = new HashSet();
        this.f286d = hashSet;
        this.f287e = C3825a0.m4558d();
        this.f283a = -1;
        this.f284b = false;
        ArrayList arrayList = new ArrayList();
        this.f288f = arrayList;
        this.f285c = false;
        this.f289g = C3829c0.m4566a();
        hashSet.addAll(c3799e.f11482a);
        this.f287e = C3825a0.m4559o(c3799e.f11483b);
        this.f283a = c3799e.f11484c;
        arrayList.addAll(c3799e.f11486e);
        this.f285c = c3799e.f11487f;
        ArrayMap arrayMap = new ArrayMap();
        C3875z0 c3875z0 = c3799e.f11488g;
        for (String str : c3875z0.f11718a.keySet()) {
            arrayMap.put(str, c3875z0.f11718a.get(str));
        }
        this.f289g = new C3829c0(arrayMap);
        this.f284b = c3799e.f11485d;
    }
}
