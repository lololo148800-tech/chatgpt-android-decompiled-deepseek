package p084D4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p021Aj.C0516a;

/* JADX INFO: renamed from: D4.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1945v0 implements Parcelable {
    public static final Parcelable.Creator<C1945v0> CREATOR = new C0516a(16);

    /* JADX INFO: renamed from: Y */
    public int f5748Y;

    /* JADX INFO: renamed from: Z */
    public int f5749Z;

    /* JADX INFO: renamed from: o0 */
    public int[] f5750o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f5751p0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f5748Y + ", mGapDir=" + this.f5749Z + ", mHasUnwantedGapAfter=" + this.f5751p0 + ", mGapPerSpan=" + Arrays.toString(this.f5750o0) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5748Y);
        parcel.writeInt(this.f5749Z);
        parcel.writeInt(this.f5751p0 ? 1 : 0);
        int[] iArr = this.f5750o0;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f5750o0);
        }
    }
}
