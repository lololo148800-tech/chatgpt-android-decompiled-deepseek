package p594Y9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p139F9.BinderC2679b;
import p333N9.AbstractC5680a;

/* JADX INFO: renamed from: Y9.U4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9817U4 extends AbstractC5680a implements InterfaceC9829W4 {
    /* JADX INFO: renamed from: s */
    public final C9811T4 m10456s(BinderC2679b binderC2679b) {
        C9811T4 c9811t4;
        Parcel parcelM6116m = m6116m();
        AbstractC9986w.m10629a(parcelM6116m, binderC2679b);
        Parcel parcelM6117n = m6117n(parcelM6116m, 1);
        IBinder strongBinder = parcelM6117n.readStrongBinder();
        if (strongBinder == null) {
            c9811t4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            c9811t4 = iInterfaceQueryLocalInterface instanceof C9811T4 ? (C9811T4) iInterfaceQueryLocalInterface : new C9811T4(strongBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer", 5);
        }
        parcelM6117n.recycle();
        return c9811t4;
    }
}
