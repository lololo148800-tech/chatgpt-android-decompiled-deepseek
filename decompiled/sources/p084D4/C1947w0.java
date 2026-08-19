package p084D4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p021Aj.C0516a;

/* JADX INFO: renamed from: D4.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1947w0 implements Parcelable {
    public static final Parcelable.Creator<C1947w0> CREATOR = new C0516a(17);

    /* JADX INFO: renamed from: Y */
    public int f5756Y;

    /* JADX INFO: renamed from: Z */
    public int f5757Z;

    /* JADX INFO: renamed from: o0 */
    public int f5758o0;

    /* JADX INFO: renamed from: p0 */
    public int[] f5759p0;

    /* JADX INFO: renamed from: q0 */
    public int f5760q0;

    /* JADX INFO: renamed from: r0 */
    public int[] f5761r0;

    /* JADX INFO: renamed from: s0 */
    public ArrayList f5762s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f5763t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f5764u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f5765v0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5756Y);
        parcel.writeInt(this.f5757Z);
        parcel.writeInt(this.f5758o0);
        if (this.f5758o0 > 0) {
            parcel.writeIntArray(this.f5759p0);
        }
        parcel.writeInt(this.f5760q0);
        if (this.f5760q0 > 0) {
            parcel.writeIntArray(this.f5761r0);
        }
        parcel.writeInt(this.f5763t0 ? 1 : 0);
        parcel.writeInt(this.f5764u0 ? 1 : 0);
        parcel.writeInt(this.f5765v0 ? 1 : 0);
        parcel.writeList(this.f5762s0);
    }
}
