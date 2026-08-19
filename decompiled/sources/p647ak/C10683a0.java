package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: ak.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10683a0 extends AbstractC10712k0 implements InterfaceC10715m {
    public static final Parcelable.Creator<C10683a0> CREATOR = new C8343M(22);

    /* JADX INFO: renamed from: Y */
    public final boolean f31726Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f31727Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC10712k0 f31728o0;

    /* JADX INFO: renamed from: p0 */
    public final C17689w f31729p0 = C17689w.f56480Y;

    public C10683a0(boolean z6, boolean z10, AbstractC10712k0 abstractC10712k0) {
        this.f31726Y = z6;
        this.f31727Z = z10;
        this.f31728o0 = abstractC10712k0;
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        List listMo11009c;
        Parcelable parcelable = this.f31728o0;
        InterfaceC10715m interfaceC10715m = parcelable instanceof InterfaceC10715m ? (InterfaceC10715m) parcelable : null;
        return (interfaceC10715m == null || (listMo11009c = interfaceC10715m.mo11009c()) == null) ? C17689w.f56480Y : listMo11009c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10683a0)) {
            return false;
        }
        C10683a0 c10683a0 = (C10683a0) obj;
        return this.f31726Y == c10683a0.f31726Y && this.f31727Z == c10683a0.f31727Z && AbstractC16544l.m18089b(this.f31728o0, c10683a0.f31728o0);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: g */
    public final EnumC10723q mo11012g() {
        return (EnumC10723q) AbstractC17680n.m19343S(mo11009c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        boolean z6 = this.f31726Y;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        boolean z10 = this.f31727Z;
        int i11 = (i10 + (z10 ? 1 : z10)) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31728o0;
        return i11 + (abstractC10712k0 == null ? 0 : abstractC10712k0.hashCode());
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31728o0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31729p0;
    }

    public final String toString() {
        return "RestartCamera(hasRequestedCameraPermissions=" + this.f31726Y + ", hasRequestedAudioPermissions=" + this.f31727Z + ", backState=" + this.f31728o0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f31726Y ? 1 : 0);
        out.writeInt(this.f31727Z ? 1 : 0);
        out.writeParcelable(this.f31728o0, i10);
    }
}
