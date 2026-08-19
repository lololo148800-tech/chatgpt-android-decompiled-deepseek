package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10689c0 extends AbstractC10712k0 implements InterfaceC10715m {
    public static final Parcelable.Creator<C10689c0> CREATOR = new C8343M(24);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f31744Y;

    /* JADX INFO: renamed from: Z */
    public final List f31745Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f31746o0;

    /* JADX INFO: renamed from: p0 */
    public final C18428A f31747p0;

    /* JADX INFO: renamed from: q0 */
    public final long f31748q0;

    /* JADX INFO: renamed from: r0 */
    public final AbstractC10712k0 f31749r0;

    public C10689c0(ArrayList arrayList, List list, boolean z6, C18428A cameraProperties, long j10, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31744Y = arrayList;
        this.f31745Z = list;
        this.f31746o0 = z6;
        this.f31747p0 = cameraProperties;
        this.f31748q0 = j10;
        this.f31749r0 = abstractC10712k0;
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31745Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10689c0)) {
            return false;
        }
        C10689c0 c10689c0 = (C10689c0) obj;
        return this.f31744Y.equals(c10689c0.f31744Y) && this.f31745Z.equals(c10689c0.f31745Z) && this.f31746o0 == c10689c0.f31746o0 && AbstractC16544l.m18089b(this.f31747p0, c10689c0.f31747p0) && this.f31748q0 == c10689c0.f31748q0 && AbstractC16544l.m18089b(this.f31749r0, c10689c0.f31749r0);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: g */
    public final EnumC10723q mo11012g() {
        return (EnumC10723q) AbstractC17680n.m19343S(mo11009c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f31745Z, this.f31744Y.hashCode() * 31, 31);
        boolean z6 = this.f31746o0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int iHashCode = (this.f31747p0.hashCode() + ((iM15858x + r6) * 31)) * 31;
        long j10 = this.f31748q0;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31749r0;
        return i10 + (abstractC10712k0 == null ? 0 : abstractC10712k0.hashCode());
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31749r0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31744Y;
    }

    public final String toString() {
        return "ShowPoseHint(selfies=" + this.f31744Y + ", posesNeeded=" + this.f31745Z + ", autoCaptureSupported=" + this.f31746o0 + ", cameraProperties=" + this.f31747p0 + ", startSelfieTimestamp=" + this.f31748q0 + ", backState=" + this.f31749r0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        ArrayList arrayList = this.f31744Y;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i10);
        }
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31745Z, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s.next()).name());
        }
        out.writeInt(this.f31746o0 ? 1 : 0);
        out.writeParcelable(this.f31747p0, i10);
        out.writeLong(this.f31748q0);
        out.writeParcelable(this.f31749r0, i10);
    }
}
