package p001A;

import ac.C10539a;
import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import androidx.lifecycle.C11069E;
import cc.C11696a;
import cc.C11699d;
import io.sentry.android.core.AbstractC15256t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p028B.C0703j;
import p109E3.C2292p;
import p139F9.BinderC2679b;
import p165G9.C3016b;
import p165G9.C3020f;
import p165G9.InterfaceC3019e;
import p277L.ExecutorC4836i;
import p379Pb.LVf.efyhmdM;
import p401Qb.C6584a;
import p501Ub.AbstractC7606h;
import p523V9.AbstractC7897H0;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC8102h4;
import p523V9.AbstractC8199t5;
import p544W9.AbstractC8488H2;
import p571X9.AbstractBinderC9232W4;
import p571X9.AbstractC9365t;
import p571X9.C9173M4;
import p571X9.C9202R4;
import p571X9.C9208S4;
import p571X9.C9214T4;
import p571X9.C9220U4;
import p571X9.EnumC9363s3;
import p571X9.EnumC9369t3;
import p571X9.InterfaceC9238X4;
import p610Z1.C10142i;
import p664bc.C11337d;
import p704dc.AbstractC13066g;
import p704dc.C13065f;
import p704dc.InterfaceC13061b;

/* JADX INFO: renamed from: A.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0036S0 implements InterfaceC13061b {

    /* JADX INFO: renamed from: Y */
    public boolean f187Y;

    /* JADX INFO: renamed from: Z */
    public boolean f188Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f189o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f190p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f191q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f192r0;

    /* JADX INFO: renamed from: s0 */
    public Object f193s0;

    public C0036S0(Context context, C11699d c11699d, C9173M4 c9173m4) {
        this.f190p0 = context;
        this.f191q0 = c11699d;
        this.f192r0 = c9173m4;
    }

    /* JADX INFO: renamed from: e */
    public static void m188e(C11069E c11069e, Integer num) {
        if (AbstractC8488H2.m9141b()) {
            c11069e.mo12122j(num);
        } else {
            c11069e.m12124k(num);
        }
    }

    @Override // p704dc.InterfaceC13061b
    /* JADX INFO: renamed from: a */
    public Pair mo189a(C10539a c10539a) throws C6584a {
        ArrayList arrayList;
        C10539a c10539a2 = c10539a;
        if (((C9214T4) this.f193s0) == null) {
            mo191c();
        }
        if (!this.f187Y) {
            try {
                C9214T4 c9214t4 = (C9214T4) this.f193s0;
                if (c9214t4 != null) {
                    c9214t4.m6118o(c9214t4.m6116m(), 1);
                }
                this.f187Y = true;
            } catch (RemoteException e10) {
                throw new C6584a(13, e10, "Failed to init face detector.");
            }
        }
        C9214T4 c9214t5 = (C9214T4) this.f193s0;
        if (c9214t5 != null) {
            if (c10539a2.f31260g == -1) {
                ByteBuffer byteBufferM8260a = AbstractC7972Q3.m8260a(c10539a);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i10 = c10539a2.f31257d;
                int i11 = c10539a2.f31258e;
                int i12 = c10539a2.f31259f;
                C10539a c10539a3 = new C10539a(byteBufferM8260a, i10, i11, i12);
                C10539a.m10979c(17, 3, jElapsedRealtime, i11, i10, byteBufferM8260a.limit(), i12);
                c10539a2 = c10539a3;
            }
            int i13 = c10539a2.f31260g;
            int i14 = c10539a2.f31257d;
            int i15 = c10539a2.f31258e;
            int iM8194b = AbstractC7897H0.m8194b(c10539a2.f31259f);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            BinderC2679b binderC2679bM12776a = C11337d.m12776a(c10539a2);
            try {
                Parcel parcelM6116m = c9214t5.m6116m();
                AbstractC9365t.m9950a(parcelM6116m, binderC2679bM12776a);
                parcelM6116m.writeInt(1);
                int iM8811j = AbstractC8199t5.m8811j(parcelM6116m, 20293);
                AbstractC8199t5.m8813l(parcelM6116m, 1, 4);
                parcelM6116m.writeInt(i13);
                AbstractC8199t5.m8813l(parcelM6116m, 2, 4);
                parcelM6116m.writeInt(i14);
                AbstractC8199t5.m8813l(parcelM6116m, 3, 4);
                parcelM6116m.writeInt(i15);
                AbstractC8199t5.m8813l(parcelM6116m, 4, 4);
                parcelM6116m.writeInt(iM8194b);
                AbstractC8199t5.m8813l(parcelM6116m, 5, 8);
                parcelM6116m.writeLong(jElapsedRealtime2);
                AbstractC8199t5.m8812k(parcelM6116m, iM8811j);
                Parcel parcelM6117n = c9214t5.m6117n(parcelM6116m, 3);
                ArrayList arrayListCreateTypedArrayList = parcelM6117n.createTypedArrayList(C9208S4.CREATOR);
                parcelM6117n.recycle();
                arrayList = new ArrayList();
                Iterator it = arrayListCreateTypedArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C11696a((C9208S4) it.next()));
                }
                ((C11699d) this.f191q0).getClass();
                AtomicBoolean atomicBoolean = C13065f.f41499j;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C11696a) it2.next()).f35481b = -1;
                }
            } catch (RemoteException e11) {
                throw new C6584a(13, e11, "Failed to run face detector.");
            }
        } else {
            arrayList = null;
        }
        return new Pair(arrayList, null);
    }

    @Override // p704dc.InterfaceC13061b
    /* JADX INFO: renamed from: b */
    public void mo190b() {
        try {
            C9214T4 c9214t4 = (C9214T4) this.f193s0;
            if (c9214t4 != null) {
                c9214t4.m6118o(c9214t4.m6116m(), 2);
                this.f193s0 = null;
            }
        } catch (RemoteException e10) {
            AbstractC15256t.m16466d("DecoupledFaceDelegate", "Failed to release face detector.", e10);
        }
        this.f187Y = false;
    }

    @Override // p704dc.InterfaceC13061b
    /* JADX INFO: renamed from: c */
    public boolean mo191c() throws C6584a {
        int i10 = 4;
        if (((C9214T4) this.f193s0) != null) {
            return this.f188Z;
        }
        Context context = (Context) this.f190p0;
        int iM3865a = C3020f.m3865a(context, "com.google.mlkit.dynamite.face");
        EnumC9369t3 enumC9369t3 = EnumC9369t3.ON_DEVICE_FACE_LOAD;
        C9173M4 c9173m4 = (C9173M4) this.f192r0;
        if (iM3865a > 0) {
            this.f188Z = true;
            try {
                m194g();
            } catch (C3016b e10) {
                throw new C6584a(13, e10, "Failed to load the bundled face module.");
            } catch (RemoteException e11) {
                throw new C6584a(13, e11, "Failed to create thick face detector.");
            }
        } else {
            this.f188Z = false;
            try {
                m194g();
            } catch (C3016b e12) {
                if (!this.f189o0) {
                    AbstractC7606h.m7953a(context, "face");
                    this.f189o0 = true;
                }
                boolean z6 = this.f188Z;
                EnumC9363s3 enumC9363s3 = EnumC9363s3.OPTIONAL_MODULE_NOT_AVAILABLE;
                AtomicReference atomicReference = AbstractC13066g.f41507a;
                c9173m4.m9726b(new C0095w0(z6, enumC9363s3, i10), enumC9369t3);
                throw new C6584a(14, e12, "Waiting for the face module to be downloaded. Please wait.");
            } catch (RemoteException e13) {
                boolean z10 = this.f188Z;
                EnumC9363s3 enumC9363s4 = EnumC9363s3.OPTIONAL_MODULE_INIT_ERROR;
                AtomicReference atomicReference2 = AbstractC13066g.f41507a;
                c9173m4.m9726b(new C0095w0(z10, enumC9363s4, i10), enumC9369t3);
                throw new C6584a(13, e13, "Failed to create thin face detector.");
            }
        }
        boolean z11 = this.f188Z;
        EnumC9363s3 enumC9363s5 = EnumC9363s3.NO_ERROR;
        AtomicReference atomicReference3 = AbstractC13066g.f41507a;
        c9173m4.m9726b(new C0095w0(z11, enumC9363s5, i10), enumC9369t3);
        return this.f188Z;
    }

    /* JADX INFO: renamed from: d */
    public void m192d(C10142i c10142i, boolean z6) {
        if (!this.f187Y) {
            if (c10142i != null) {
                c10142i.m10748b(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z10 = this.f188Z;
        C11069E c11069e = (C11069E) this.f191q0;
        if (!z10) {
            m188e(c11069e, 0);
            if (c10142i != null) {
                c10142i.m10748b(new C2292p("Camera is not active."));
                return;
            }
            return;
        }
        this.f189o0 = z6;
        ((C0088t) this.f190p0).m300d(z6);
        m188e(c11069e, Integer.valueOf(z6 ? 1 : 0));
        C10142i c10142i2 = (C10142i) this.f193s0;
        if (c10142i2 != null) {
            c10142i2.m10748b(new C2292p("There is a new enableTorch being set"));
        }
        this.f193s0 = c10142i;
    }

    /* JADX INFO: renamed from: f */
    public C9214T4 m193f(InterfaceC3019e interfaceC3019e, String str, String str2, C9202R4 c9202r4) {
        IInterface c9220u4;
        Context context = (Context) this.f190p0;
        IBinder iBinderM3872b = C3020f.m3866c(context, interfaceC3019e, str).m3872b(str2);
        int i10 = AbstractBinderC9232W4.f28025b;
        C9214T4 c9214t4 = null;
        if (iBinderM3872b == null) {
            c9220u4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderM3872b.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
            c9220u4 = iInterfaceQueryLocalInterface instanceof InterfaceC9238X4 ? (InterfaceC9238X4) iInterfaceQueryLocalInterface : new C9220U4(iBinderM3872b, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator", 4);
        }
        BinderC2679b binderC2679b = new BinderC2679b(context);
        C9220U4 c9220u5 = (C9220U4) c9220u4;
        Parcel parcelM6116m = c9220u5.m6116m();
        AbstractC9365t.m9950a(parcelM6116m, binderC2679b);
        parcelM6116m.writeInt(1);
        c9202r4.writeToParcel(parcelM6116m, 0);
        Parcel parcelM6117n = c9220u5.m6117n(parcelM6116m, 1);
        IBinder strongBinder = parcelM6117n.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            c9214t4 = iInterfaceQueryLocalInterface2 instanceof C9214T4 ? (C9214T4) iInterfaceQueryLocalInterface2 : new C9214T4(strongBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector", 4);
        }
        parcelM6117n.recycle();
        return c9214t4;
    }

    public C0036S0(C0088t c0088t, C0703j c0703j, ExecutorC4836i executorC4836i) {
        this.f190p0 = c0088t;
        this.f192r0 = executorC4836i;
        this.f187Y = AbstractC8102h4.m8579b(new C0072l(c0703j, 1));
        this.f191q0 = new C11069E(0);
        c0088t.m297a(new InterfaceC0086s() { // from class: A.R0
            @Override // p001A.InterfaceC0086s
            /* JADX INFO: renamed from: b */
            public final boolean mo3b(TotalCaptureResult totalCaptureResult) {
                C0036S0 c0036s0 = this.f184a;
                if (((C10142i) c0036s0.f193s0) != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == c0036s0.f189o0) {
                        ((C10142i) c0036s0.f193s0).m10747a(null);
                        c0036s0.f193s0 = null;
                    }
                }
                return false;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m194g() {
        C11699d c11699d = (C11699d) this.f191q0;
        c11699d.getClass();
        if (((C9214T4) this.f193s0) == null) {
            C9202R4 c9202r4 = new C9202R4(1, c11699d.f35492a, 1, 1, false, c11699d.f35493b);
            this.f193s0 = this.f188Z ? m193f(C3020f.f9096c, efyhmdM.MHJMEoOFPsIktf, "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", c9202r4) : m193f(C3020f.f9095b, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", c9202r4);
        }
    }
}
