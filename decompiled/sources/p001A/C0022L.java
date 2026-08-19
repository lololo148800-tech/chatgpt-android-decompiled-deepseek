package p001A;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.lifecycle.AbstractC11067C;
import androidx.lifecycle.C11069E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p028B.C0703j;
import p028B.C0710q;
import p155G.C2952d;
import p178H.C3139d;
import p228J.AbstractC3842j;
import p228J.C3847l0;
import p228J.InterfaceC3866v;
import p277L.ExecutorC4828a;
import p283L5.AbstractC4941g;
import p326N.C5560b;
import p523V9.AbstractC8054b4;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8102h4;
import p544W9.AbstractC8470E2;
import p571X9.AbstractC9306j0;
import p817j$.util.Objects;

/* JADX INFO: renamed from: A.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0022L implements InterfaceC3866v {

    /* JADX INFO: renamed from: a */
    public final String f110a;

    /* JADX INFO: renamed from: b */
    public final C0703j f111b;

    /* JADX INFO: renamed from: c */
    public final C2952d f112c;

    /* JADX INFO: renamed from: e */
    public C0088t f114e;

    /* JADX INFO: renamed from: g */
    public final C0020K f116g;

    /* JADX INFO: renamed from: i */
    public final C3847l0 f118i;

    /* JADX INFO: renamed from: d */
    public final Object f113d = new Object();

    /* JADX INFO: renamed from: f */
    public C0020K f115f = null;

    /* JADX INFO: renamed from: h */
    public ArrayList f117h = null;

    public C0022L(C0710q c0710q, String str) {
        str.getClass();
        this.f110a = str;
        C0703j c0703jM1481b = c0710q.m1481b(str);
        this.f111b = c0703jM1481b;
        C2952d c2952d = new C2952d();
        c2952d.f8834a = this;
        this.f112c = c2952d;
        this.f118i = AbstractC8054b4.m8446b(c0703jM1481b);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            AbstractC8072d6.m8492i("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
        }
        this.f116g = new C0020K(new C3139d(5, null));
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: a */
    public final int mo136a() {
        return mo143h(0);
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: b */
    public final String mo137b() {
        return this.f110a;
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: c */
    public final InterfaceC3866v mo138c() {
        return this;
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: d */
    public final void mo139d(ExecutorC4828a executorC4828a, C0082q c0082q) {
        synchronized (this.f113d) {
            try {
                C0088t c0088t = this.f114e;
                if (c0088t != null) {
                    c0088t.f369Z.execute(new RunnableC0066i(c0088t, executorC4828a, c0082q, 0));
                } else {
                    if (this.f117h == null) {
                        this.f117h = new ArrayList();
                    }
                    this.f117h.add(new Pair(c0082q, executorC4828a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: e */
    public final void mo140e(AbstractC3842j abstractC3842j) {
        synchronized (this.f113d) {
            try {
                C0088t c0088t = this.f114e;
                if (c0088t != null) {
                    c0088t.f369Z.execute(new RunnableC0074m(c0088t, 1, abstractC3842j));
                    return;
                }
                ArrayList arrayList = this.f117h;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC3842j) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: f */
    public final int mo141f() {
        Integer num = (Integer) this.f111b.m1476a(CameraCharacteristics.LENS_FACING);
        AbstractC4941g.m5554M("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: g */
    public final String mo142g() {
        Integer num = (Integer) this.f111b.m1476a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: h */
    public final int mo143h(int i10) {
        Integer num = (Integer) this.f111b.m1476a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return AbstractC8470E2.m9101b(AbstractC8470E2.m9102c(i10), num.intValue(), 1 == mo141f());
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: i */
    public final boolean mo144i() {
        C0703j c0703j = this.f111b;
        Objects.requireNonNull(c0703j);
        return AbstractC8102h4.m8579b(new C0072l(c0703j, 1));
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: j */
    public final C3847l0 mo145j() {
        return this.f118i;
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: k */
    public final List mo146k(int i10) {
        Size[] sizeArrM12604E = this.f111b.m1477b().m12604E(i10);
        return sizeArrM12604E != null ? Arrays.asList(sizeArrM12604E) : Collections.emptyList();
    }

    @Override // p228J.InterfaceC3866v
    /* JADX INFO: renamed from: l */
    public final AbstractC11067C mo147l() {
        synchronized (this.f113d) {
            try {
                C0088t c0088t = this.f114e;
                if (c0088t != null) {
                    C0020K c0020k = this.f115f;
                    if (c0020k != null) {
                        return c0020k;
                    }
                    return (C11069E) c0088t.f375t0.f208q0;
                }
                if (this.f115f == null) {
                    InterfaceC0040U0 interfaceC0040U0M206f = C0042V0.m206f(this.f111b);
                    C0044W0 c0044w0 = new C0044W0(interfaceC0040U0M206f.mo200e(), interfaceC0040U0M206f.mo201g());
                    c0044w0.m231e(1.0f);
                    this.f115f = new C0020K(C5560b.m5950e(c0044w0));
                }
                return this.f115f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m148m(C0088t c0088t) {
        String strM11048f;
        synchronized (this.f113d) {
            try {
                this.f114e = c0088t;
                C0020K c0020k = this.f115f;
                if (c0020k != null) {
                    c0020k.m132l((C11069E) c0088t.f375t0.f208q0);
                }
                ArrayList<Pair> arrayList = this.f117h;
                if (arrayList != null) {
                    for (Pair pair : arrayList) {
                        C0088t c0088t2 = this.f114e;
                        Executor executor = (Executor) pair.second;
                        AbstractC3842j abstractC3842j = (AbstractC3842j) pair.first;
                        c0088t2.getClass();
                        c0088t2.f369Z.execute(new RunnableC0066i(c0088t2, executor, abstractC3842j, 0));
                    }
                    this.f117h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Integer num = (Integer) this.f111b.m1476a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            strM11048f = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iIntValue == 1) {
            strM11048f = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iIntValue == 2) {
            strM11048f = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iIntValue != 3) {
            strM11048f = iIntValue != 4 ? AbstractC10763a.m11048f(iIntValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else {
            strM11048f = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        }
        String strM9889h = AbstractC9306j0.m9889h("Device Level: ", strM11048f);
        String strM8491h = AbstractC8072d6.m8491h("Camera2CameraInfo");
        if (AbstractC8072d6.m8490g(4, strM8491h)) {
            Log.i(strM8491h, strM9889h);
        }
    }
}
