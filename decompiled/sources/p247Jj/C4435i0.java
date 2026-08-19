package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Jj.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4435i0 implements InterfaceC4441l0 {
    public static final Parcelable.Creator<C4435i0> CREATOR = new C2566j(26);

    /* JADX INFO: renamed from: Y */
    public final String f14437Y;

    /* JADX INFO: renamed from: Z */
    public final String f14438Z;

    /* JADX INFO: renamed from: o0 */
    public final StepStyle f14439o0;

    /* JADX INFO: renamed from: p0 */
    public final String f14440p0;

    /* JADX INFO: renamed from: q0 */
    public final String f14441q0;

    /* JADX INFO: renamed from: r0 */
    public final String f14442r0;

    /* JADX INFO: renamed from: s0 */
    public final String f14443s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f14444t0;

    public C4435i0(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z6) {
        this.f14437Y = str;
        this.f14438Z = str2;
        this.f14439o0 = stepStyle;
        this.f14440p0 = str3;
        this.f14441q0 = str4;
        this.f14442r0 = str5;
        this.f14443s0 = str6;
        this.f14444t0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.InterfaceC4441l0
    /* JADX INFO: renamed from: e */
    public final String mo5201e() {
        return this.f14438Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4435i0)) {
            return false;
        }
        C4435i0 c4435i0 = (C4435i0) obj;
        return AbstractC16544l.m18089b(this.f14437Y, c4435i0.f14437Y) && AbstractC16544l.m18089b(this.f14438Z, c4435i0.f14438Z) && AbstractC16544l.m18089b(this.f14439o0, c4435i0.f14439o0) && AbstractC16544l.m18089b(this.f14440p0, c4435i0.f14440p0) && AbstractC16544l.m18089b(this.f14441q0, c4435i0.f14441q0) && AbstractC16544l.m18089b(this.f14442r0, c4435i0.f14442r0) && AbstractC16544l.m18089b(this.f14443s0, c4435i0.f14443s0) && this.f14444t0 == c4435i0.f14444t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    public final int hashCode() {
        String str = this.f14437Y;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14438Z;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StepStyle stepStyle = this.f14439o0;
        int iHashCode3 = (iHashCode2 + (stepStyle == null ? 0 : stepStyle.hashCode())) * 31;
        String str3 = this.f14440p0;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14441q0;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14442r0;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14443s0;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z6 = this.f14444t0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode7 + r6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cancel(inquiryId=");
        sb2.append(this.f14437Y);
        sb2.append(", sessionToken=");
        sb2.append(this.f14438Z);
        sb2.append(", styles=");
        sb2.append(this.f14439o0);
        sb2.append(", title=");
        sb2.append(this.f14440p0);
        sb2.append(", message=");
        sb2.append(this.f14441q0);
        sb2.append(", resumeButtonText=");
        sb2.append(this.f14442r0);
        sb2.append(", cancelButtonText=");
        sb2.append(this.f14443s0);
        sb2.append(", force=");
        return AbstractC14376f.m15823B(sb2, this.f14444t0, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14437Y);
        out.writeString(this.f14438Z);
        out.writeParcelable(this.f14439o0, i10);
        out.writeString(this.f14440p0);
        out.writeString(this.f14441q0);
        out.writeString(this.f14442r0);
        out.writeString(this.f14443s0);
        out.writeInt(this.f14444t0 ? 1 : 0);
    }
}
