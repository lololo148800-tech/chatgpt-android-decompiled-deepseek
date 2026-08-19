package p1044uj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17689w;
import p960q9.C18658l;

/* JADX INFO: renamed from: uj.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20331d0 extends AbstractC20337g0 {
    public static final Parcelable.Creator<C20331d0> CREATOR = new C18658l(19);

    /* JADX INFO: renamed from: o0 */
    public final EnumC20327b0 f64282o0;

    /* JADX INFO: renamed from: p0 */
    public final EnumC20335f0 f64283p0;

    /* JADX INFO: renamed from: q0 */
    public final String f64284q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f64285r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20331d0(EnumC20327b0 captureState, EnumC20335f0 uploadState, String str, boolean z6) {
        super(captureState, C17689w.f56480Y);
        AbstractC16544l.m18094g(captureState, "captureState");
        AbstractC16544l.m18094g(uploadState, "uploadState");
        this.f64282o0 = captureState;
        this.f64283p0 = uploadState;
        this.f64284q0 = str;
        this.f64285r0 = z6;
    }

    /* JADX INFO: renamed from: i */
    public static C20331d0 m21037i(C20331d0 c20331d0, EnumC20327b0 captureState, EnumC20335f0 uploadState, String str, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            captureState = c20331d0.f64282o0;
        }
        if ((i10 & 2) != 0) {
            uploadState = c20331d0.f64283p0;
        }
        if ((i10 & 4) != 0) {
            str = c20331d0.f64284q0;
        }
        if ((i10 & 8) != 0) {
            z6 = c20331d0.f64285r0;
        }
        c20331d0.getClass();
        AbstractC16544l.m18094g(captureState, "captureState");
        AbstractC16544l.m18094g(uploadState, "uploadState");
        return new C20331d0(captureState, uploadState, str, z6);
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: d */
    public final EnumC20327b0 mo21033d() {
        return this.f64282o0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20331d0)) {
            return false;
        }
        C20331d0 c20331d0 = (C20331d0) obj;
        return this.f64282o0 == c20331d0.f64282o0 && this.f64283p0 == c20331d0.f64283p0 && AbstractC16544l.m18089b(this.f64284q0, c20331d0.f64284q0) && this.f64285r0 == c20331d0.f64285r0;
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: f */
    public final String mo21034f() {
        return this.f64284q0;
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: h */
    public final EnumC20335f0 mo21036h() {
        return this.f64283p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f64283p0.hashCode() + (this.f64282o0.hashCode() * 31)) * 31;
        String str = this.f64284q0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z6 = this.f64285r0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode2 + r6;
    }

    public final String toString() {
        return "Start(captureState=" + this.f64282o0 + ", uploadState=" + this.f64283p0 + ", documentId=" + this.f64284q0 + ", shouldShowUploadOptionsDialog=" + this.f64285r0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f64282o0.name());
        out.writeString(this.f64283p0.name());
        out.writeString(this.f64284q0);
        out.writeInt(this.f64285r0 ? 1 : 0);
    }
}
