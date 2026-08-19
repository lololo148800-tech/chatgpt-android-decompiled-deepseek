package p949pj;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p548Wd.p549VF.zakks;

/* JADX INFO: renamed from: pj.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C18440M implements Parcelable {
    public static final Parcelable.Creator<C18440M> CREATOR = new C18461e(9);

    /* JADX INFO: renamed from: Y */
    public final double f58830Y;

    /* JADX INFO: renamed from: Z */
    public final double f58831Z;

    /* JADX INFO: renamed from: o0 */
    public final double f58832o0;

    /* JADX INFO: renamed from: p0 */
    public final int f58833p0;

    public C18440M(double d10, double d11, double d12, int i10) {
        this.f58830Y = d10;
        this.f58831Z = d11;
        this.f58832o0 = d12;
        this.f58833p0 = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18440M)) {
            return false;
        }
        C18440M c18440m = (C18440M) obj;
        return Double.compare(this.f58830Y, c18440m.f58830Y) == 0 && Double.compare(this.f58831Z, c18440m.f58831Z) == 0 && Double.compare(this.f58832o0, c18440m.f58832o0) == 0 && this.f58833p0 == c18440m.f58833p0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f58830Y);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f58831Z);
        int i10 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f58832o0);
        return ((i10 + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31) + this.f58833p0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeDouble(this.f58830Y);
        out.writeDouble(this.f58831Z);
        out.writeDouble(this.f58832o0);
        out.writeInt(this.f58833p0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageLightCondition(luminosity=");
        sb2.append(this.f58830Y);
        sb2.append(", rmsContrast=");
        sb2.append(this.f58831Z);
        sb2.append(", lowHighContrast=");
        sb2.append(this.f58832o0);
        sb2.append(", sampleSize=");
        return AbstractC10763a.m11056n(sb2, this.f58833p0, zakks.scAzfpMFJph);
    }
}
