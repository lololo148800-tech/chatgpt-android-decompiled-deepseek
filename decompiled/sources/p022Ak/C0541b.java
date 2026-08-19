package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0541b implements Parcelable {
    public static final Parcelable.Creator<C0541b> CREATOR = new C0516a(2);

    /* JADX INFO: renamed from: Y */
    public final Date f1719Y;

    /* JADX INFO: renamed from: Z */
    public final Date f1720Z;

    public C0541b(Date date, Date date2) {
        this.f1719Y = date;
        this.f1720Z = date2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0541b)) {
            return false;
        }
        C0541b c0541b = (C0541b) obj;
        return AbstractC16544l.m18089b(this.f1719Y, c0541b.f1719Y) && AbstractC16544l.m18089b(this.f1720Z, c0541b.f1720Z);
    }

    public final int hashCode() {
        Date date = this.f1719Y;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.f1720Z;
        return iHashCode + (date2 != null ? date2.hashCode() : 0);
    }

    public final String toString() {
        return "CollectedGovernmentIdDetails(dateOfBirth=" + this.f1719Y + ", expirationDate=" + this.f1720Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeSerializable(this.f1719Y);
        out.writeSerializable(this.f1720Z);
    }
}
