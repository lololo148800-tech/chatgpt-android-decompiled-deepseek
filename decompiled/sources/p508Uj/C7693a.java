package p508Uj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Uj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7693a implements Parcelable {
    public static final Parcelable.Creator<C7693a> CREATOR = new C4576X(15);

    /* JADX INFO: renamed from: Y */
    public final String f24231Y;

    /* JADX INFO: renamed from: Z */
    public final Date f24232Z;

    /* JADX INFO: renamed from: o0 */
    public final Date f24233o0;

    public C7693a(String passportNumber, Date expirationDate, Date dateOfBirth) {
        AbstractC16544l.m18094g(passportNumber, "passportNumber");
        AbstractC16544l.m18094g(expirationDate, "expirationDate");
        AbstractC16544l.m18094g(dateOfBirth, "dateOfBirth");
        this.f24231Y = passportNumber;
        this.f24232Z = expirationDate;
        this.f24233o0 = dateOfBirth;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7693a)) {
            return false;
        }
        C7693a c7693a = (C7693a) obj;
        return AbstractC16544l.m18089b(this.f24231Y, c7693a.f24231Y) && AbstractC16544l.m18089b(this.f24232Z, c7693a.f24232Z) && AbstractC16544l.m18089b(this.f24233o0, c7693a.f24233o0);
    }

    public final int hashCode() {
        return this.f24233o0.hashCode() + ((this.f24232Z.hashCode() + (this.f24231Y.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MrzKey(passportNumber=" + this.f24231Y + ", expirationDate=" + this.f24232Z + ", dateOfBirth=" + this.f24233o0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f24231Y);
        out.writeSerializable(this.f24232Z);
        out.writeSerializable(this.f24233o0);
    }
}
