package p357Oa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p334Na.BinderC5699f;

/* JADX INFO: renamed from: Oa.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6152e implements InterfaceC6154g, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f20037a;

    public C6152e(IBinder iBinder) {
        this.f20037a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20037a;
    }

    @Override // p357Oa.InterfaceC6154g
    /* JADX INFO: renamed from: f */
    public final void mo6713f(String str, Bundle bundle, BinderC5699f binderC5699f) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = AbstractC6151d.f20036a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC5699f);
        try {
            this.f20037a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
