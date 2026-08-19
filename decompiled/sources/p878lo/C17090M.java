package p878lo;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: lo.M */
/* JADX INFO: loaded from: classes2.dex */
public final class C17090M implements Parcelable {
    public static final Parcelable.Creator<C17090M> CREATOR = new C17089L(1);

    /* JADX INFO: renamed from: Y */
    public final long f54618Y;

    /* JADX INFO: renamed from: Z */
    public final long f54619Z;

    /* JADX INFO: renamed from: o0 */
    public final long f54620o0;

    public C17090M(long j10, long j11, long j12) {
        this.f54618Y = j10;
        this.f54619Z = j11;
        this.f54620o0 = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17090M)) {
            return false;
        }
        C17090M c17090m = (C17090M) obj;
        return this.f54618Y == c17090m.f54618Y && this.f54619Z == c17090m.f54619Z && this.f54620o0 == c17090m.f54620o0;
    }

    public final int hashCode() {
        long j10 = this.f54618Y;
        long j11 = this.f54619Z;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f54620o0;
        return i10 + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StateRestorerInfo(viewportSize=");
        sb2.append(this.f54618Y);
        sb2.append(", contentOffsetAtViewportCenter=");
        sb2.append(this.f54619Z);
        sb2.append(", finalZoomFactor=");
        return AbstractC10763a.m11050h(this.f54620o0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeLong(this.f54618Y);
        out.writeLong(this.f54619Z);
        out.writeLong(this.f54620o0);
    }
}
