package lk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p718e4.C13280a;

/* JADX INFO: renamed from: lk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17062e implements Parcelable {
    public static final Parcelable.Creator<C17062e> CREATOR = new C13280a(16);

    /* JADX INFO: renamed from: o0 */
    public static final C17062e f54533o0 = new C17062e(EnumC17058a.f54523o0, EnumC17061d.f54531Z);

    /* JADX INFO: renamed from: Y */
    public final EnumC17058a f54534Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC17061d f54535Z;

    public C17062e(EnumC17058a gpsCollectionRequirement, EnumC17061d gpsPrecisionRequirement) {
        AbstractC16544l.m18094g(gpsCollectionRequirement, "gpsCollectionRequirement");
        AbstractC16544l.m18094g(gpsPrecisionRequirement, "gpsPrecisionRequirement");
        this.f54534Y = gpsCollectionRequirement;
        this.f54535Z = gpsPrecisionRequirement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17062e)) {
            return false;
        }
        C17062e c17062e = (C17062e) obj;
        return this.f54534Y == c17062e.f54534Y && this.f54535Z == c17062e.f54535Z;
    }

    public final int hashCode() {
        return this.f54535Z.hashCode() + (this.f54534Y.hashCode() * 31);
    }

    public final String toString() {
        return "InquirySessionConfig(gpsCollectionRequirement=" + this.f54534Y + ", gpsPrecisionRequirement=" + this.f54535Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f54534Y.writeToParcel(out, i10);
        this.f54535Z.writeToParcel(out, i10);
    }
}
