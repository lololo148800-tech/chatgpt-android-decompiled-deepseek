package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: zj.Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22134Y0 implements Parcelable {
    public static final Parcelable.Creator<C22134Y0> CREATOR = new C22132X0(0);

    /* JADX INFO: renamed from: Y */
    public final String f69970Y;

    /* JADX INFO: renamed from: Z */
    public final String f69971Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f69972o0;

    public C22134Y0(String countryName, String countryCode, ArrayList arrayList) {
        AbstractC16544l.m18094g(countryName, "countryName");
        AbstractC16544l.m18094g(countryCode, "countryCode");
        this.f69970Y = countryName;
        this.f69971Z = countryCode;
        this.f69972o0 = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22134Y0)) {
            return false;
        }
        C22134Y0 c22134y0 = (C22134Y0) obj;
        return AbstractC16544l.m18089b(this.f69970Y, c22134y0.f69970Y) && AbstractC16544l.m18089b(this.f69971Z, c22134y0.f69971Z) && this.f69972o0.equals(c22134y0.f69972o0);
    }

    public final int hashCode() {
        return this.f69972o0.hashCode() + AbstractC0168G.m527p(this.f69970Y.hashCode() * 31, 31, this.f69971Z);
    }

    public final String toString() {
        return "IdConfigForCountry(countryName=" + this.f69970Y + ", countryCode=" + this.f69971Z + ", ids=" + this.f69972o0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f69970Y);
        out.writeString(this.f69971Z);
        ArrayList arrayList = this.f69972o0;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C22130W0) it.next()).writeToParcel(out, i10);
        }
    }
}
