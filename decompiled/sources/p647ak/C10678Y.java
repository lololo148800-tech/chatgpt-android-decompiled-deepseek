package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10678Y extends AbstractC10712k0 {
    public static final Parcelable.Creator<C10678Y> CREATOR = new C8343M(20);

    /* JADX INFO: renamed from: Y */
    public final List f31708Y;

    /* JADX INFO: renamed from: Z */
    public final long f31709Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f31710o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f31711p0;

    /* JADX INFO: renamed from: q0 */
    public final C18428A f31712q0;

    /* JADX INFO: renamed from: r0 */
    public final long f31713r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC10712k0 f31714s0;

    public C10678Y(List list, long j10, boolean z6, boolean z10, C18428A cameraProperties, long j11, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31708Y = list;
        this.f31709Z = j10;
        this.f31710o0 = z6;
        this.f31711p0 = z10;
        this.f31712q0 = cameraProperties;
        this.f31713r0 = j11;
        this.f31714s0 = abstractC10712k0;
    }

    /* JADX INFO: renamed from: l */
    public static C10678Y m11017l(C10678Y c10678y, ArrayList arrayList, boolean z6, boolean z10, int i10) {
        List list = arrayList;
        if ((i10 & 1) != 0) {
            list = c10678y.f31708Y;
        }
        List selfies = list;
        if ((i10 & 4) != 0) {
            z6 = c10678y.f31710o0;
        }
        boolean z11 = z6;
        if ((i10 & 8) != 0) {
            z10 = c10678y.f31711p0;
        }
        AbstractC16544l.m18094g(selfies, "selfies");
        C18428A cameraProperties = c10678y.f31712q0;
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        return new C10678Y(selfies, c10678y.f31709Z, z11, z10, cameraProperties, c10678y.f31713r0, c10678y.f31714s0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10678Y)) {
            return false;
        }
        C10678Y c10678y = (C10678Y) obj;
        return AbstractC16544l.m18089b(this.f31708Y, c10678y.f31708Y) && this.f31709Z == c10678y.f31709Z && this.f31710o0 == c10678y.f31710o0 && this.f31711p0 == c10678y.f31711p0 && AbstractC16544l.m18089b(this.f31712q0, c10678y.f31712q0) && this.f31713r0 == c10678y.f31713r0 && AbstractC16544l.m18089b(this.f31714s0, c10678y.f31714s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final int hashCode() {
        int iHashCode = this.f31708Y.hashCode() * 31;
        long j10 = this.f31709Z;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z6 = this.f31710o0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i11 = (i10 + r6) * 31;
        boolean z10 = this.f31711p0;
        int iHashCode2 = (this.f31712q0.hashCode() + ((i11 + (z10 ? 1 : z10)) * 31)) * 31;
        long j11 = this.f31713r0;
        int i12 = (iHashCode2 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31714s0;
        return i12 + (abstractC10712k0 == null ? 0 : abstractC10712k0.hashCode());
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31714s0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31708Y;
    }

    public final String toString() {
        return "FinalizeLocalVideoCapture(selfies=" + this.f31708Y + ", minDurationMs=" + this.f31709Z + ", isDelayComplete=" + this.f31710o0 + ", isFinalizeComplete=" + this.f31711p0 + ", cameraProperties=" + this.f31712q0 + ", startSelfieTimestamp=" + this.f31713r0 + ", backState=" + this.f31714s0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31708Y, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeLong(this.f31709Z);
        out.writeInt(this.f31710o0 ? 1 : 0);
        out.writeInt(this.f31711p0 ? 1 : 0);
        out.writeParcelable(this.f31712q0, i10);
        out.writeLong(this.f31713r0);
        out.writeParcelable(this.f31714s0, i10);
    }
}
