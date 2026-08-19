package p1060v9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C20501s implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f65098a;

    public C20501s(IBinder iBinder) {
        this.f65098a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f65098a;
    }

    /* JADX INFO: renamed from: d */
    public final void m21149d(BinderC20504v binderC20504v, C20487e c20487e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(binderC20504v);
            parcelObtain.writeInt(1);
            C18658l.m20035a(c20487e, parcelObtain, 0);
            this.f65098a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
