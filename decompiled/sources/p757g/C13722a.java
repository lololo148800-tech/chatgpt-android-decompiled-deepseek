package p757g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p1070w.BinderC20692a;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13722a implements InterfaceC13724c {

    /* JADX INFO: renamed from: a */
    public IBinder f43286a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f43286a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15207d(BinderC20692a binderC20692a) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(binderC20692a);
            this.f43286a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15208i(BinderC20692a binderC20692a, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(binderC20692a);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f43286a.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15209k() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeLong(0L);
            this.f43286a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
