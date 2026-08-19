package p985r9;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: r9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18897g implements Parcelable {
    public static final Parcelable.Creator<C18897g> CREATOR = new C18893c(1);

    /* JADX INFO: renamed from: Y */
    public final Messenger f60244Y;

    public C18897g(IBinder iBinder) {
        this.f60244Y = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f60244Y;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C18897g) obj).f60244Y;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f60244Y;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f60244Y;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
