package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p149Fj.C2880n;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22174m0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22174m0> CREATOR = new C21006a(24);

    /* JADX INFO: renamed from: Z */
    public final C22130W0 f70207Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70208o0;

    /* JADX INFO: renamed from: p0 */
    public final C22139a1 f70209p0;

    /* JADX INFO: renamed from: q0 */
    public final List f70210q0;

    /* JADX INFO: renamed from: r0 */
    public final int f70211r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC22180o0 f70212s0;

    /* JADX INFO: renamed from: t0 */
    public final C2880n f70213t0;

    /* JADX INFO: renamed from: u0 */
    public final String f70214u0;

    /* JADX INFO: renamed from: v0 */
    public final C18428A f70215v0;

    public C22174m0(C22130W0 id2, List list, C22139a1 currentPart, List list2, int i10, AbstractC22180o0 abstractC22180o0, C2880n c2880n, String str, C18428A cameraProperties) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f70207Z = id2;
        this.f70208o0 = list;
        this.f70209p0 = currentPart;
        this.f70210q0 = list2;
        this.f70211r0 = i10;
        this.f70212s0 = abstractC22180o0;
        this.f70213t0 = c2880n;
        this.f70214u0 = str;
        this.f70215v0 = cameraProperties;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70212s0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70209p0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22174m0)) {
            return false;
        }
        C22174m0 c22174m0 = (C22174m0) obj;
        return AbstractC16544l.m18089b(this.f70207Z, c22174m0.f70207Z) && AbstractC16544l.m18089b(this.f70208o0, c22174m0.f70208o0) && AbstractC16544l.m18089b(this.f70209p0, c22174m0.f70209p0) && AbstractC16544l.m18089b(this.f70210q0, c22174m0.f70210q0) && this.f70211r0 == c22174m0.f70211r0 && AbstractC16544l.m18089b(this.f70212s0, c22174m0.f70212s0) && AbstractC16544l.m18089b(this.f70213t0, c22174m0.f70213t0) && AbstractC16544l.m18089b(this.f70214u0, c22174m0.f70214u0) && AbstractC16544l.m18089b(this.f70215v0, c22174m0.f70215v0);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70211r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70210q0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70208o0;
    }

    public final int hashCode() {
        int iM15858x = (AbstractC14376f.m15858x(this.f70210q0, (this.f70209p0.f69986Y.hashCode() + AbstractC14376f.m15858x(this.f70208o0, this.f70207Z.hashCode() * 31, 31)) * 31, 31) + this.f70211r0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70212s0;
        int iHashCode = (iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31;
        C2880n c2880n = this.f70213t0;
        int iHashCode2 = (iHashCode + (c2880n == null ? 0 : c2880n.hashCode())) * 31;
        String str = this.f70214u0;
        return this.f70215v0.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Submit(id=" + this.f70207Z + ", uploadingIds=" + this.f70208o0 + ", currentPart=" + this.f70209p0 + ", parts=" + this.f70210q0 + ", partIndex=" + this.f70211r0 + ", backState=" + this.f70212s0 + ", governmentIdRequestArguments=" + this.f70213t0 + ", webRtcObjectId=" + this.f70214u0 + ", cameraProperties=" + this.f70215v0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70207Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70208o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeParcelable(this.f70209p0, i10);
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70210q0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70211r0);
        out.writeParcelable(this.f70212s0, i10);
        C2880n c2880n = this.f70213t0;
        if (c2880n == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2880n.writeToParcel(out, i10);
        }
        out.writeString(this.f70214u0);
        out.writeParcelable(this.f70215v0, i10);
    }
}
