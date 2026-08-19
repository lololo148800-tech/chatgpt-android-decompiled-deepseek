package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C18434G implements Parcelable {
    public static final Parcelable.Creator<C18434G> CREATOR = new C18461e(7);

    /* JADX INFO: renamed from: Y */
    public final Date f58804Y;

    /* JADX INFO: renamed from: Z */
    public final Date f58805Z;

    public C18434G(Date dateOfBirth, Date expirationDate) {
        AbstractC16544l.m18094g(dateOfBirth, "dateOfBirth");
        AbstractC16544l.m18094g(expirationDate, "expirationDate");
        this.f58804Y = dateOfBirth;
        this.f58805Z = expirationDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18434G)) {
            return false;
        }
        C18434G c18434g = (C18434G) obj;
        return AbstractC16544l.m18089b(this.f58804Y, c18434g.f58804Y) && AbstractC16544l.m18089b(this.f58805Z, c18434g.f58805Z);
    }

    public final int hashCode() {
        return this.f58805Z.hashCode() + (this.f58804Y.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedTexts(dateOfBirth=" + this.f58804Y + ", expirationDate=" + this.f58805Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeSerializable(this.f58804Y);
        out.writeSerializable(this.f58805Z);
    }
}
