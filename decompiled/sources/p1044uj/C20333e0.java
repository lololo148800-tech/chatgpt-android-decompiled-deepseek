package p1044uj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;
import p960q9.C18658l;

/* JADX INFO: renamed from: uj.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20333e0 extends AbstractC20337g0 {
    public static final Parcelable.Creator<C20333e0> CREATOR = new C18658l(20);

    /* JADX INFO: renamed from: o0 */
    public final List f64289o0;

    /* JADX INFO: renamed from: p0 */
    public final String f64290p0;

    /* JADX INFO: renamed from: q0 */
    public final EnumC20335f0 f64291q0;

    /* JADX INFO: renamed from: r0 */
    public final String f64292r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20333e0(List documents, String str, EnumC20335f0 uploadState, String str2) {
        super(EnumC20327b0.f64267Y, documents);
        AbstractC16544l.m18094g(documents, "documents");
        AbstractC16544l.m18094g(uploadState, "uploadState");
        this.f64289o0 = documents;
        this.f64290p0 = str;
        this.f64291q0 = uploadState;
        this.f64292r0 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20333e0)) {
            return false;
        }
        C20333e0 c20333e0 = (C20333e0) obj;
        return AbstractC16544l.m18089b(this.f64289o0, c20333e0.f64289o0) && AbstractC16544l.m18089b(this.f64290p0, c20333e0.f64290p0) && this.f64291q0 == c20333e0.f64291q0 && AbstractC16544l.m18089b(this.f64292r0, c20333e0.f64292r0);
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: f */
    public final String mo21034f() {
        return this.f64290p0;
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: g */
    public final List mo21035g() {
        return this.f64289o0;
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: h */
    public final EnumC20335f0 mo21036h() {
        return this.f64291q0;
    }

    public final int hashCode() {
        int iHashCode = this.f64289o0.hashCode() * 31;
        String str = this.f64290p0;
        int iHashCode2 = (this.f64291q0.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f64292r0;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "UploadDocument(documents=" + this.f64289o0 + ", documentId=" + this.f64290p0 + ", uploadState=" + this.f64291q0 + ", error=" + this.f64292r0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f64289o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeString(this.f64290p0);
        out.writeString(this.f64291q0.name());
        out.writeString(this.f64292r0);
    }
}
