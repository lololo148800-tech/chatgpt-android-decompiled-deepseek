package p588Y2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p531Vj.C8343M;

/* JADX INFO: renamed from: Y2.K */
/* JADX INFO: loaded from: classes.dex */
public final class C9607K implements Parcelable {
    public static final Parcelable.Creator<C9607K> CREATOR = new C8343M(10);

    /* JADX INFO: renamed from: Y */
    public ArrayList f28906Y;

    /* JADX INFO: renamed from: Z */
    public ArrayList f28907Z;

    /* JADX INFO: renamed from: o0 */
    public C9618b[] f28908o0;

    /* JADX INFO: renamed from: p0 */
    public int f28909p0;

    /* JADX INFO: renamed from: q0 */
    public String f28910q0;

    /* JADX INFO: renamed from: r0 */
    public ArrayList f28911r0;

    /* JADX INFO: renamed from: s0 */
    public ArrayList f28912s0;

    /* JADX INFO: renamed from: t0 */
    public ArrayList f28913t0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f28906Y);
        parcel.writeStringList(this.f28907Z);
        parcel.writeTypedArray(this.f28908o0, i10);
        parcel.writeInt(this.f28909p0);
        parcel.writeString(this.f28910q0);
        parcel.writeStringList(this.f28911r0);
        parcel.writeTypedList(this.f28912s0);
        parcel.writeTypedList(this.f28913t0);
    }
}
