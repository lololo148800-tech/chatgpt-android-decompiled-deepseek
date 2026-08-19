package p500Ua;

import android.os.Parcel;
import android.os.Parcelable;
import p263K9.C4576X;

/* JADX INFO: renamed from: Ua.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7592a implements Parcelable {
    public static final Parcelable.Creator<AbstractC7592a> CREATOR = new C4576X(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C7593b c7593b = (C7593b) this;
        parcel.writeParcelable(c7593b.f24015Y, 0);
        parcel.writeInt(c7593b.f24016Z ? 1 : 0);
    }
}
