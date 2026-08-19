package p084D4;

import android.os.Parcel;
import android.os.Parcelable;
import p021Aj.C0516a;

/* JADX INFO: renamed from: D4.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1885I implements Parcelable {
    public static final Parcelable.Creator<C1885I> CREATOR = new C0516a(15);

    /* JADX INFO: renamed from: Y */
    public int f5497Y;

    /* JADX INFO: renamed from: Z */
    public int f5498Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f5499o0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5497Y);
        parcel.writeInt(this.f5498Z);
        parcel.writeInt(this.f5499o0 ? 1 : 0);
    }
}
