package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: ak.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10701g0 extends AbstractC10712k0 implements InterfaceC10715m {
    public static final Parcelable.Creator<C10701g0> CREATOR = new C8343M(28);

    /* JADX INFO: renamed from: Y */
    public final boolean f31801Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f31802Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC10712k0 f31803o0;

    /* JADX INFO: renamed from: p0 */
    public final List f31804p0;

    /* JADX INFO: renamed from: q0 */
    public final C17689w f31805q0 = C17689w.f56480Y;

    public C10701g0(boolean z6, boolean z10, AbstractC10712k0 abstractC10712k0, List list) {
        this.f31801Y = z6;
        this.f31802Z = z10;
        this.f31803o0 = abstractC10712k0;
        this.f31804p0 = list;
    }

    /* JADX INFO: renamed from: l */
    public static C10701g0 m11026l(C10701g0 c10701g0, boolean z6, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c10701g0.f31801Y;
        }
        if ((i10 & 2) != 0) {
            z10 = c10701g0.f31802Z;
        }
        AbstractC10712k0 abstractC10712k0 = c10701g0.f31803o0;
        List posesNeeded = c10701g0.f31804p0;
        c10701g0.getClass();
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        return new C10701g0(z6, z10, abstractC10712k0, posesNeeded);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31804p0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10701g0)) {
            return false;
        }
        C10701g0 c10701g0 = (C10701g0) obj;
        return this.f31801Y == c10701g0.f31801Y && this.f31802Z == c10701g0.f31802Z && AbstractC16544l.m18089b(this.f31803o0, c10701g0.f31803o0) && AbstractC16544l.m18089b(this.f31804p0, c10701g0.f31804p0);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: g */
    public final EnumC10723q mo11012g() {
        return (EnumC10723q) AbstractC17680n.m19343S(mo11009c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        boolean z6 = this.f31801Y;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        boolean z10 = this.f31802Z;
        int i11 = (i10 + (z10 ? 1 : z10)) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31803o0;
        return this.f31804p0.hashCode() + ((i11 + (abstractC10712k0 == null ? 0 : abstractC10712k0.hashCode())) * 31);
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31803o0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31805q0;
    }

    public final String toString() {
        return "WaitForCameraFeed(hasRequestedCameraPermissions=" + this.f31801Y + ", hasRequestedAudioPermissions=" + this.f31802Z + ", backState=" + this.f31803o0 + ", posesNeeded=" + this.f31804p0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f31801Y ? 1 : 0);
        out.writeInt(this.f31802Z ? 1 : 0);
        out.writeParcelable(this.f31803o0, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31804p0, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s.next()).name());
        }
    }
}
