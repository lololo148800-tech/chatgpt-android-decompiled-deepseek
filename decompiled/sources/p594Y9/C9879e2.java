package p594Y9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p139F9.BinderC2679b;
import p333N9.AbstractC5680a;

/* JADX INFO: renamed from: Y9.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C9879e2 extends AbstractC5680a implements InterfaceC9880e3 {
    /* JADX INFO: renamed from: s */
    public final C9713D1 m10533s(BinderC2679b binderC2679b, C9835X4 c9835x4) {
        C9713D1 c9713d1;
        Parcel parcelM6116m = m6116m();
        AbstractC9986w.m10629a(parcelM6116m, binderC2679b);
        parcelM6116m.writeInt(1);
        c9835x4.writeToParcel(parcelM6116m, 0);
        Parcel parcelM6117n = m6117n(parcelM6116m, 1);
        IBinder strongBinder = parcelM6117n.readStrongBinder();
        if (strongBinder == null) {
            c9713d1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            c9713d1 = iInterfaceQueryLocalInterface instanceof C9713D1 ? (C9713D1) iInterfaceQueryLocalInterface : new C9713D1(strongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", 5);
        }
        parcelM6117n.recycle();
        return c9713d1;
    }
}
