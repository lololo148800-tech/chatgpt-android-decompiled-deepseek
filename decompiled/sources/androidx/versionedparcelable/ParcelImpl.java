package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p263K9.C4576X;
import p373P4.C6346b;
import p373P4.InterfaceC6347c;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C4576X(10);

    /* JADX INFO: renamed from: Y */
    public final InterfaceC6347c f33690Y;

    public ParcelImpl(Parcel parcel) {
        this.f33690Y = new C6346b(parcel).m6966g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new C6346b(parcel).m6968i(this.f33690Y);
    }
}
