package p878lo;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: lo.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C17091N implements Parcelable {
    public static final Parcelable.Creator<C17091N> CREATOR = new C17089L(0);

    /* JADX INFO: renamed from: Y */
    public final long f54621Y;

    /* JADX INFO: renamed from: Z */
    public final float f54622Z;

    /* JADX INFO: renamed from: o0 */
    public final long f54623o0;

    /* JADX INFO: renamed from: p0 */
    public final C17090M f54624p0;

    public C17091N(long j10, float f10, long j11, C17090M c17090m) {
        this.f54621Y = j10;
        this.f54622Z = f10;
        this.f54623o0 = j11;
        this.f54624p0 = c17090m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17091N)) {
            return false;
        }
        C17091N c17091n = (C17091N) obj;
        return this.f54621Y == c17091n.f54621Y && Float.compare(this.f54622Z, c17091n.f54622Z) == 0 && this.f54623o0 == c17091n.f54623o0 && AbstractC16544l.m18089b(this.f54624p0, c17091n.f54624p0);
    }

    public final int hashCode() {
        long j10 = this.f54621Y;
        int iM13819j = AbstractC12107L1.m13819j(this.f54622Z, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
        long j11 = this.f54623o0;
        int i10 = (iM13819j + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        C17090M c17090m = this.f54624p0;
        return i10 + (c17090m == null ? 0 : c17090m.hashCode());
    }

    public final String toString() {
        return "ZoomableSavedState(userOffset=" + this.f54621Y + ", userZoom=" + this.f54622Z + ", centroid=" + this.f54623o0 + ", stateAdjusterInfo=" + this.f54624p0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeLong(this.f54621Y);
        out.writeFloat(this.f54622Z);
        out.writeLong(this.f54623o0);
        C17090M c17090m = this.f54624p0;
        if (c17090m == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c17090m.writeToParcel(out, i10);
        }
    }
}
