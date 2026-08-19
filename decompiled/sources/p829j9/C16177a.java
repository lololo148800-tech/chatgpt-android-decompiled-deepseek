package p829j9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p498U8.AbstractC7570a;

/* JADX INFO: renamed from: j9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16177a implements InterfaceC16179c, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f50220a;

    public C16177a(IBinder iBinder) {
        this.f50220a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f50220a;
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m17788d(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i10 = AbstractC7570a.f23973a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.f50220a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
                parcelObtain2.recycle();
                return bundle2;
            } catch (RuntimeException e10) {
                parcelObtain2.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
