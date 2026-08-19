package p531Vj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Vj.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8331A implements Parcelable {
    public static final Parcelable.Creator<C8331A> CREATOR = new C4576X(27);

    /* JADX INFO: renamed from: Y */
    public final EnumC8332B f25972Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC8333C f25973Z;

    public C8331A(EnumC8332B feature, EnumC8333C result) {
        AbstractC16544l.m18094g(feature, "feature");
        AbstractC16544l.m18094g(result, "result");
        this.f25972Y = feature;
        this.f25973Z = result;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8331A)) {
            return false;
        }
        C8331A c8331a = (C8331A) obj;
        return this.f25972Y == c8331a.f25972Y && this.f25973Z == c8331a.f25973Z;
    }

    public final int hashCode() {
        return this.f25973Z.hashCode() + (this.f25972Y.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceFeatureState(feature=" + this.f25972Y + ", result=" + this.f25973Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f25972Y.name());
        out.writeString(this.f25973Z.name());
    }
}
