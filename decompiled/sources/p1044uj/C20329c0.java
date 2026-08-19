package p1044uj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;
import p960q9.C18658l;

/* JADX INFO: renamed from: uj.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20329c0 extends AbstractC20337g0 {
    public static final Parcelable.Creator<C20329c0> CREATOR = new C18658l(18);

    /* JADX INFO: renamed from: o0 */
    public final List f64274o0;

    /* JADX INFO: renamed from: p0 */
    public final String f64275p0;

    /* JADX INFO: renamed from: q0 */
    public final EnumC20327b0 f64276q0;

    /* JADX INFO: renamed from: r0 */
    public final EnumC20335f0 f64277r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC20340i f64278s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f64279t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f64280u0;

    /* JADX INFO: renamed from: v0 */
    public final String f64281v0;

    public /* synthetic */ C20329c0(List list, String str, EnumC20327b0 enumC20327b0, EnumC20335f0 enumC20335f0, boolean z6, String str2, int i10) {
        this(list, str, (i10 & 4) != 0 ? EnumC20327b0.f64267Y : enumC20327b0, (i10 & 8) != 0 ? EnumC20335f0.f64296Y : enumC20335f0, null, (i10 & 32) != 0 ? false : z6, false, (i10 & 128) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: i */
    public static C20329c0 m21032i(C20329c0 c20329c0, List list, EnumC20327b0 enumC20327b0, EnumC20335f0 enumC20335f0, AbstractC20340i abstractC20340i, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            list = c20329c0.f64274o0;
        }
        List documents = list;
        String str = c20329c0.f64275p0;
        if ((i10 & 4) != 0) {
            enumC20327b0 = c20329c0.f64276q0;
        }
        EnumC20327b0 captureState = enumC20327b0;
        if ((i10 & 8) != 0) {
            enumC20335f0 = c20329c0.f64277r0;
        }
        EnumC20335f0 uploadState = enumC20335f0;
        if ((i10 & 16) != 0) {
            abstractC20340i = c20329c0.f64278s0;
        }
        AbstractC20340i abstractC20340i2 = abstractC20340i;
        boolean z10 = (i10 & 32) != 0 ? c20329c0.f64279t0 : false;
        if ((i10 & 64) != 0) {
            z6 = c20329c0.f64280u0;
        }
        boolean z11 = z6;
        String str2 = (i10 & 128) != 0 ? c20329c0.f64281v0 : null;
        c20329c0.getClass();
        AbstractC16544l.m18094g(documents, "documents");
        AbstractC16544l.m18094g(captureState, "captureState");
        AbstractC16544l.m18094g(uploadState, "uploadState");
        return new C20329c0(documents, str, captureState, uploadState, abstractC20340i2, z10, z11, str2);
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: d */
    public final EnumC20327b0 mo21033d() {
        return this.f64276q0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20329c0)) {
            return false;
        }
        C20329c0 c20329c0 = (C20329c0) obj;
        return AbstractC16544l.m18089b(this.f64274o0, c20329c0.f64274o0) && AbstractC16544l.m18089b(this.f64275p0, c20329c0.f64275p0) && this.f64276q0 == c20329c0.f64276q0 && this.f64277r0 == c20329c0.f64277r0 && AbstractC16544l.m18089b(this.f64278s0, c20329c0.f64278s0) && this.f64279t0 == c20329c0.f64279t0 && this.f64280u0 == c20329c0.f64280u0 && AbstractC16544l.m18089b(this.f64281v0, c20329c0.f64281v0);
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: f */
    public final String mo21034f() {
        return this.f64275p0;
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: g */
    public final List mo21035g() {
        return this.f64274o0;
    }

    @Override // p1044uj.AbstractC20337g0
    /* JADX INFO: renamed from: h */
    public final EnumC20335f0 mo21036h() {
        return this.f64277r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        int iHashCode = this.f64274o0.hashCode() * 31;
        String str = this.f64275p0;
        int iHashCode2 = (this.f64277r0.hashCode() + ((this.f64276q0.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        AbstractC20340i abstractC20340i = this.f64278s0;
        int iHashCode3 = (iHashCode2 + (abstractC20340i == null ? 0 : abstractC20340i.hashCode())) * 31;
        boolean z6 = this.f64279t0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode3 + r6) * 31;
        boolean z10 = this.f64280u0;
        int i11 = (i10 + (z10 ? 1 : z10)) * 31;
        String str2 = this.f64281v0;
        return i11 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ReviewCaptures(documents=" + this.f64274o0 + ", documentId=" + this.f64275p0 + ", captureState=" + this.f64276q0 + ", uploadState=" + this.f64277r0 + ", documentFileToDelete=" + this.f64278s0 + ", reloadingFromPreviousSession=" + this.f64279t0 + ", shouldShowUploadOptionsDialog=" + this.f64280u0 + ", error=" + this.f64281v0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f64274o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeString(this.f64275p0);
        out.writeString(this.f64276q0.name());
        out.writeString(this.f64277r0.name());
        out.writeParcelable(this.f64278s0, i10);
        out.writeInt(this.f64279t0 ? 1 : 0);
        out.writeInt(this.f64280u0 ? 1 : 0);
        out.writeString(this.f64281v0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20329c0(List list, String str, EnumC20327b0 captureState, EnumC20335f0 uploadState, AbstractC20340i abstractC20340i, boolean z6, boolean z10, String str2) {
        super(captureState, list);
        AbstractC16544l.m18094g(captureState, "captureState");
        AbstractC16544l.m18094g(uploadState, "uploadState");
        this.f64274o0 = list;
        this.f64275p0 = str;
        this.f64276q0 = captureState;
        this.f64277r0 = uploadState;
        this.f64278s0 = abstractC20340i;
        this.f64279t0 = z6;
        this.f64280u0 = z10;
        this.f64281v0 = str2;
    }
}
