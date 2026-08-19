package p228J;

import ac.C10539a;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import cc.C11696a;
import cc.C11699d;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1060v9.AbstractC20502t;
import p1140z1.AbstractC21675V;
import p1140z1.C21674U;
import p139F9.BinderC2679b;
import p165G9.C3016b;
import p165G9.C3020f;
import p301M.AbstractC5229k;
import p301M.C5231m;
import p392Q0.C6546d;
import p401Qb.C6584a;
import p501Ub.AbstractC7606h;
import p523V9.AbstractC7897H0;
import p523V9.AbstractC7972Q3;
import p571X9.AbstractBinderC9399y3;
import p571X9.AbstractC9365t;
import p571X9.C9127F0;
import p571X9.C9134G1;
import p571X9.C9135G2;
import p571X9.C9173M4;
import p571X9.C9226V4;
import p571X9.C9279e3;
import p571X9.EnumC9363s3;
import p571X9.EnumC9369t3;
import p571X9.InterfaceC9219U3;
import p635a1.AbstractC10443a;
import p635a1.InterfaceC10457o;
import p704dc.AbstractC13066g;
import p704dc.C13065f;
import p704dc.InterfaceC13061b;

/* JADX INFO: renamed from: J.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3827b0 implements InterfaceC3833e0, InterfaceC13061b {

    /* JADX INFO: renamed from: Y */
    public boolean f11587Y;

    /* JADX INFO: renamed from: Z */
    public int f11588Z;

    /* JADX INFO: renamed from: o0 */
    public Object f11589o0;

    /* JADX INFO: renamed from: p0 */
    public Object f11590p0;

    /* JADX INFO: renamed from: q0 */
    public Object f11591q0;

    /* JADX INFO: renamed from: r0 */
    public Object f11592r0;

    @Override // p704dc.InterfaceC13061b
    /* JADX INFO: renamed from: a */
    public Pair mo189a(C10539a c10539a) throws C6584a {
        C9127F0[] c9127f0ArrM9674s;
        if (((C9135G2) this.f11592r0) == null) {
            mo191c();
        }
        C9135G2 c9135g2 = (C9135G2) this.f11592r0;
        if (c9135g2 == null) {
            throw new C6584a("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        try {
            C9226V4 c9226v4 = new C9226V4(c10539a.f31257d, c10539a.f31258e, 0, SystemClock.elapsedRealtime(), AbstractC7897H0.m8194b(c10539a.f31259f));
            if (c10539a.f31260g != 35 || this.f11588Z < 201500000) {
                BinderC2679b binderC2679b = new BinderC2679b(AbstractC7972Q3.m8260a(c10539a));
                Parcel parcelM6116m = c9135g2.m6116m();
                AbstractC9365t.m9950a(parcelM6116m, binderC2679b);
                parcelM6116m.writeInt(1);
                c9226v4.writeToParcel(parcelM6116m, 0);
                Parcel parcelM6117n = c9135g2.m6117n(parcelM6116m, 1);
                C9127F0[] c9127f0Arr = (C9127F0[]) parcelM6117n.createTypedArray(C9127F0.CREATOR);
                parcelM6117n.recycle();
                c9127f0ArrM9674s = c9127f0Arr;
            } else {
                Image.Plane[] planeArrM10980a = c10539a.m10980a();
                AbstractC20502t.m21157h(planeArrM10980a);
                c9127f0ArrM9674s = c9135g2.m9674s(new BinderC2679b(planeArrM10980a[0].getBuffer()), new BinderC2679b(planeArrM10980a[1].getBuffer()), new BinderC2679b(planeArrM10980a[2].getBuffer()), planeArrM10980a[0].getPixelStride(), planeArrM10980a[1].getPixelStride(), planeArrM10980a[2].getPixelStride(), planeArrM10980a[0].getRowStride(), planeArrM10980a[1].getRowStride(), planeArrM10980a[2].getRowStride(), c9226v4);
            }
            ArrayList arrayList = new ArrayList();
            for (C9127F0 c9127f0 : c9127f0ArrM9674s) {
                arrayList.add(new C11696a(c9127f0));
            }
            ((C11699d) this.f11590p0).getClass();
            AtomicBoolean atomicBoolean = C13065f.f41499j;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C11696a) it.next()).f35481b = -1;
            }
            return new Pair(arrayList, null);
        } catch (RemoteException e10) {
            throw new C6584a(13, e10, "Failed to detect with legacy face detector");
        }
    }

    @Override // p704dc.InterfaceC13061b
    /* JADX INFO: renamed from: b */
    public void mo190b() {
        C9135G2 c9135g2 = (C9135G2) this.f11592r0;
        if (c9135g2 != null) {
            try {
                c9135g2.m6118o(c9135g2.m6116m(), 3);
            } catch (RemoteException e10) {
                AbstractC15256t.m16466d("LegacyFaceDelegate", "Failed to release legacy face detector.", e10);
            }
            this.f11592r0 = null;
        }
    }

    @Override // p704dc.InterfaceC13061b
    /* JADX INFO: renamed from: c */
    public boolean mo191c() throws C6584a {
        InterfaceC9219U3 c9279e3;
        int i10;
        int i11 = 4;
        Context context = (Context) this.f11589o0;
        C11699d c11699d = (C11699d) this.f11590p0;
        boolean z6 = false;
        if (((C9135G2) this.f11592r0) != null) {
            return false;
        }
        try {
            IBinder iBinderM3872b = C3020f.m3866c(context, C3020f.f9095b, "com.google.android.gms.vision.dynamite").m3872b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
            int i12 = AbstractBinderC9399y3.f28357b;
            if (iBinderM3872b == null) {
                c9279e3 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderM3872b.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                c9279e3 = iInterfaceQueryLocalInterface instanceof InterfaceC9219U3 ? (InterfaceC9219U3) iInterfaceQueryLocalInterface : new C9279e3(iBinderM3872b, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
            }
            BinderC2679b binderC2679b = new BinderC2679b(context);
            c11699d.getClass();
            if (((C9135G2) this.f11592r0) == null) {
                int i13 = c11699d.f35492a;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException(AbstractC10763a.m11048f(i13, "Invalid landmark type: "));
                    }
                    i10 = 1;
                }
                this.f11592r0 = ((C9279e3) c9279e3).m9848s(binderC2679b, new C9134G1(0, i10, 0, false, false, c11699d.f35493b));
            }
            if (((C9135G2) this.f11592r0) == null && !this.f11587Y) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                AbstractC7606h.m7953a(context, "barcode");
                this.f11587Y = true;
            }
            EnumC9363s3 enumC9363s3 = EnumC9363s3.NO_ERROR;
            AtomicReference atomicReference = AbstractC13066g.f41507a;
            ((C9173M4) this.f11591q0).m9726b(new C0095w0(z6, enumC9363s3, i11), EnumC9369t3.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (C3016b e10) {
            throw new C6584a(13, e10, "Failed to load deprecated vision dynamite module.");
        } catch (RemoteException e11) {
            throw new C6584a(13, e11, "Failed to create legacy face detector.");
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m4562d(int i10, int i11) {
        C6546d c6546d = (C6546d) this.f11590p0;
        int i12 = this.f11588Z;
        InterfaceC10457o interfaceC10457o = (InterfaceC10457o) c6546d.f21182Y[i10 + i12];
        InterfaceC10457o interfaceC10457o2 = (InterfaceC10457o) ((C6546d) this.f11591q0).f21182Y[i12 + i11];
        C21674U c21674u = AbstractC21675V.f68780a;
        return AbstractC16544l.m18089b(interfaceC10457o, interfaceC10457o2) || AbstractC10443a.m10920a(interfaceC10457o, interfaceC10457o2);
    }

    @Override // p228J.InterfaceC3833e0
    /* JADX INFO: renamed from: e */
    public void mo4563e(Executor executor, InterfaceC3831d0 interfaceC3831d0) {
        RunnableC3869w0 runnableC3869w0;
        synchronized (this.f11589o0) {
            RunnableC3869w0 runnableC3869w1 = (RunnableC3869w0) ((HashMap) this.f11591q0).remove(interfaceC3831d0);
            if (runnableC3869w1 != null) {
                runnableC3869w1.f11698o0.set(false);
                ((CopyOnWriteArraySet) this.f11592r0).remove(runnableC3869w1);
            }
            runnableC3869w0 = new RunnableC3869w0((AtomicReference) this.f11590p0, executor, interfaceC3831d0);
            ((HashMap) this.f11591q0).put(interfaceC3831d0, runnableC3869w0);
            ((CopyOnWriteArraySet) this.f11592r0).add(runnableC3869w0);
        }
        runnableC3869w0.m4592a(0);
    }

    /* JADX INFO: renamed from: f */
    public C5231m m4564f() {
        Object obj = ((AtomicReference) this.f11590p0).get();
        if (!(obj instanceof AbstractC3834f)) {
            return AbstractC5229k.m5779c(obj);
        }
        ((AbstractC3834f) obj).getClass();
        return new C5231m(null, 1);
    }

    @Override // p228J.InterfaceC3833e0
    /* JADX INFO: renamed from: i */
    public void mo4565i(InterfaceC3831d0 interfaceC3831d0) {
        synchronized (this.f11589o0) {
            RunnableC3869w0 runnableC3869w0 = (RunnableC3869w0) ((HashMap) this.f11591q0).remove(interfaceC3831d0);
            if (runnableC3869w0 != null) {
                runnableC3869w0.f11698o0.set(false);
                ((CopyOnWriteArraySet) this.f11592r0).remove(runnableC3869w0);
            }
        }
    }
}
