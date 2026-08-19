package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p149Fj.C2880n;
import p174Gk.uSfJ.HpucjswO;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: zj.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22156g0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22156g0> CREATOR = new C21006a(19);

    /* JADX INFO: renamed from: Z */
    public final C22130W0 f70050Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70051o0;

    /* JADX INFO: renamed from: p0 */
    public final C22139a1 f70052p0;

    /* JADX INFO: renamed from: q0 */
    public final List f70053q0;

    /* JADX INFO: renamed from: r0 */
    public final int f70054r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC22180o0 f70055s0;

    /* JADX INFO: renamed from: t0 */
    public final C2880n f70056t0;

    /* JADX INFO: renamed from: u0 */
    public final long f70057u0;

    /* JADX INFO: renamed from: v0 */
    public final boolean f70058v0;

    public C22156g0(C22130W0 id2, List list, C22139a1 currentPart, List list2, int i10, AbstractC22180o0 abstractC22180o0, C2880n c2880n, long j10, boolean z6) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(currentPart, "currentPart");
        this.f70050Z = id2;
        this.f70051o0 = list;
        this.f70052p0 = currentPart;
        this.f70053q0 = list2;
        this.f70054r0 = i10;
        this.f70055s0 = abstractC22180o0;
        this.f70056t0 = c2880n;
        this.f70057u0 = j10;
        this.f70058v0 = z6;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70055s0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70052p0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22156g0)) {
            return false;
        }
        C22156g0 c22156g0 = (C22156g0) obj;
        return AbstractC16544l.m18089b(this.f70050Z, c22156g0.f70050Z) && AbstractC16544l.m18089b(this.f70051o0, c22156g0.f70051o0) && AbstractC16544l.m18089b(this.f70052p0, c22156g0.f70052p0) && AbstractC16544l.m18089b(this.f70053q0, c22156g0.f70053q0) && this.f70054r0 == c22156g0.f70054r0 && AbstractC16544l.m18089b(this.f70055s0, c22156g0.f70055s0) && AbstractC16544l.m18089b(this.f70056t0, c22156g0.f70056t0) && this.f70057u0 == c22156g0.f70057u0 && this.f70058v0 == c22156g0.f70058v0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70054r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70053q0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70051o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM15858x = (AbstractC14376f.m15858x(this.f70053q0, (this.f70052p0.f69986Y.hashCode() + AbstractC14376f.m15858x(this.f70051o0, this.f70050Z.hashCode() * 31, 31)) * 31, 31) + this.f70054r0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70055s0;
        int iHashCode = (iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31;
        C2880n c2880n = this.f70056t0;
        int iHashCode2 = c2880n != null ? c2880n.hashCode() : 0;
        long j10 = this.f70057u0;
        int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z6 = this.f70058v0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return i10 + r6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70050Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70051o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeParcelable(this.f70052p0, i10);
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70053q0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70054r0);
        out.writeParcelable(this.f70055s0, i10);
        C2880n c2880n = this.f70056t0;
        if (c2880n == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2880n.writeToParcel(out, i10);
        }
        out.writeLong(this.f70057u0);
        out.writeInt(this.f70058v0 ? 1 : 0);
    }

    public final String toString() {
        return "FinalizeLocalVideoCapture(id=" + this.f70050Z + ", uploadingIds=" + this.f70051o0 + ", currentPart=" + this.f70052p0 + ", parts=" + this.f70053q0 + ", partIndex=" + this.f70054r0 + ", backState=" + this.f70055s0 + ", governmentIdRequestArguments=" + this.f70056t0 + HpucjswO.QFlZavXWQ + this.f70057u0 + ", isDelayComplete=" + this.f70058v0 + Separators.RPAREN;
    }
}
