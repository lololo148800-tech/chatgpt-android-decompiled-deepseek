package p588Y2;

import android.os.Parcel;
import android.os.Parcelable;
import p531Vj.C8343M;

/* JADX INFO: renamed from: Y2.F */
/* JADX INFO: loaded from: classes.dex */
public final class C9602F implements Parcelable {
    public static final Parcelable.Creator<C9602F> CREATOR = new C8343M(9);

    /* JADX INFO: renamed from: Y */
    public String f28898Y;

    /* JADX INFO: renamed from: Z */
    public int f28899Z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28898Y);
        parcel.writeInt(this.f28899Z);
    }
}
