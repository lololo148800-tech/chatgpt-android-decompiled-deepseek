package p475T9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: T9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7290m implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f23096a;

    public C7290m(IBinder iBinder) {
        this.f23096a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23096a;
    }

    /* JADX INFO: renamed from: d */
    public final void m7743d(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f23096a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
