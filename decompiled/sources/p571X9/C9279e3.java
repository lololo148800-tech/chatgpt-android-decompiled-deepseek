package p571X9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p139F9.BinderC2679b;
import p333N9.AbstractC5680a;

/* JADX INFO: renamed from: X9.e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C9279e3 extends AbstractC5680a implements InterfaceC9219U3 {
    /* JADX INFO: renamed from: s */
    public final C9135G2 m9848s(BinderC2679b binderC2679b, C9134G1 c9134g1) {
        C9135G2 c9135g2;
        Parcel parcelM6116m = m6116m();
        AbstractC9365t.m9950a(parcelM6116m, binderC2679b);
        parcelM6116m.writeInt(1);
        c9134g1.writeToParcel(parcelM6116m, 0);
        Parcel parcelM6117n = m6117n(parcelM6116m, 1);
        IBinder strongBinder = parcelM6117n.readStrongBinder();
        if (strongBinder == null) {
            c9135g2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            c9135g2 = iInterfaceQueryLocalInterface instanceof C9135G2 ? (C9135G2) iInterfaceQueryLocalInterface : new C9135G2(strongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 4);
        }
        parcelM6117n.recycle();
        return c9135g2;
    }
}
