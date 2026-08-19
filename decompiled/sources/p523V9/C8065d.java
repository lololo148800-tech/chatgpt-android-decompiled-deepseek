package p523V9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p139F9.BinderC2679b;
import p333N9.AbstractC5680a;

/* JADX INFO: renamed from: V9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8065d extends AbstractC5680a implements InterfaceC8081f {
    /* JADX INFO: renamed from: s */
    public final C8057c m8473s(BinderC2679b binderC2679b, C8049b c8049b) {
        C8057c c8057c;
        Parcel parcelM6116m = m6116m();
        AbstractC7840A.m8088a(parcelM6116m, binderC2679b);
        parcelM6116m.writeInt(1);
        c8049b.writeToParcel(parcelM6116m, 0);
        Parcel parcelM6117n = m6117n(parcelM6116m, 1);
        IBinder strongBinder = parcelM6117n.readStrongBinder();
        if (strongBinder == null) {
            c8057c = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c8057c = iInterfaceQueryLocalInterface instanceof C8057c ? (C8057c) iInterfaceQueryLocalInterface : new C8057c(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 3);
        }
        parcelM6117n.recycle();
        return c8057c;
    }
}
