package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;

/* JADX INFO: renamed from: zj.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C22106K implements Parcelable {
    public static final Parcelable.Creator<C22106K> CREATOR = new C21006a(14);

    /* JADX INFO: renamed from: Y */
    public final Date f69873Y;

    /* JADX INFO: renamed from: Z */
    public final Date f69874Z;

    public C22106K(Date date, Date date2) {
        this.f69873Y = date;
        this.f69874Z = date2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22106K)) {
            return false;
        }
        C22106K c22106k = (C22106K) obj;
        return AbstractC16544l.m18089b(this.f69873Y, c22106k.f69873Y) && AbstractC16544l.m18089b(this.f69874Z, c22106k.f69874Z);
    }

    public final int hashCode() {
        Date date = this.f69873Y;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.f69874Z;
        return iHashCode + (date2 != null ? date2.hashCode() : 0);
    }

    public final String toString() {
        return "GovernmentIdDetails(dateOfBirth=" + this.f69873Y + ", expirationDate=" + this.f69874Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeSerializable(this.f69873Y);
        out.writeSerializable(this.f69874Z);
    }
}
