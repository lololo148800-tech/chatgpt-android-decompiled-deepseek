package p588Y2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p531Vj.C8343M;

/* JADX INFO: renamed from: Y2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9619c implements Parcelable {
    public static final Parcelable.Creator<C9619c> CREATOR = new C8343M(8);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f28989Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f28990Z;

    public C9619c(Parcel parcel) {
        this.f28989Y = parcel.createStringArrayList();
        this.f28990Z = parcel.createTypedArrayList(C9618b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f28989Y);
        parcel.writeTypedList(this.f28990Z);
    }
}
