package p110E4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: E4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2306d implements IInterface {

    /* JADX INFO: renamed from: a */
    public IBinder f7156a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7156a;
    }

    /* JADX INFO: renamed from: d */
    public final void m3390d(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f7156a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
