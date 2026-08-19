package p286L9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: L9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4964b implements InterfaceC4966d, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f16193a;

    public C4964b(IBinder iBinder) {
        this.f16193a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16193a;
    }

    /* JADX INFO: renamed from: d */
    public final Parcel m5609d(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f16193a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
