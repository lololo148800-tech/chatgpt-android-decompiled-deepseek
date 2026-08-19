package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p125Ej.C2566j;

/* JADX INFO: renamed from: Jj.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C4412V extends AbstractC4433h0 {
    public static final Parcelable.Creator<C4412V> CREATOR = new C2566j(22);

    /* JADX INFO: renamed from: u0 */
    public final String f14313u0;

    /* JADX INFO: renamed from: v0 */
    public final String f14314v0;

    /* JADX INFO: renamed from: w0 */
    public final AbstractC4413V0 f14315w0;

    /* JADX INFO: renamed from: x0 */
    public final String f14316x0;

    /* JADX INFO: renamed from: y0 */
    public final Map f14317y0;

    public C4412V(String inquiryId, String sessionToken, AbstractC4413V0 abstractC4413V0, String str, Map fields) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(fields, "fields");
        this.f14313u0 = inquiryId;
        this.f14314v0 = sessionToken;
        this.f14315w0 = abstractC4413V0;
        this.f14316x0 = str;
        this.f14317y0 = fields;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: a */
    public final String mo5190a() {
        return this.f14313u0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: e */
    public final String mo5191e() {
        return this.f14314v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4412V)) {
            return false;
        }
        C4412V c4412v = (C4412V) obj;
        return AbstractC16544l.m18089b(this.f14313u0, c4412v.f14313u0) && AbstractC16544l.m18089b(this.f14314v0, c4412v.f14314v0) && AbstractC16544l.m18089b(this.f14315w0, c4412v.f14315w0) && AbstractC16544l.m18089b(this.f14316x0, c4412v.f14316x0) && AbstractC16544l.m18089b(this.f14317y0, c4412v.f14317y0);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: f */
    public final AbstractC4413V0 mo5192f() {
        return this.f14315w0;
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f14313u0.hashCode() * 31, 31, this.f14314v0);
        AbstractC4413V0 abstractC4413V0 = this.f14315w0;
        int iHashCode = (iM527p + (abstractC4413V0 == null ? 0 : abstractC4413V0.hashCode())) * 31;
        String str = this.f14316x0;
        return this.f14317y0.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Complete(inquiryId=" + this.f14313u0 + ", sessionToken=" + this.f14314v0 + ", transitionStatus=" + this.f14315w0 + ", inquiryStatus=" + this.f14316x0 + ", fields=" + this.f14317y0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14313u0);
        out.writeString(this.f14314v0);
        out.writeParcelable(this.f14315w0, i10);
        out.writeString(this.f14316x0);
        Map map = this.f14317y0;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeParcelable((Parcelable) entry.getValue(), i10);
        }
    }
}
