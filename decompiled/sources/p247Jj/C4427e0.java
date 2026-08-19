package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import p003A1.AbstractC0168G;
import p125Ej.C2566j;

/* JADX INFO: renamed from: Jj.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4427e0 extends AbstractC4433h0 {
    public static final Parcelable.Creator<C4427e0> CREATOR = new C2566j(25);

    /* JADX INFO: renamed from: u0 */
    public final String f14390u0;

    /* JADX INFO: renamed from: v0 */
    public final AbstractC4413V0 f14391v0;

    /* JADX INFO: renamed from: w0 */
    public final String f14392w0;

    /* JADX INFO: renamed from: x0 */
    public final StepStyle f14393x0;

    /* JADX INFO: renamed from: y0 */
    public final boolean f14394y0;

    /* JADX INFO: renamed from: z0 */
    public final C17062e f14395z0;

    public C4427e0(String str, String str2, StepStyle stepStyle, C17062e c17062e) {
        this(str, new C4407S0(), str2, stepStyle, true, c17062e);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: a */
    public final String mo5190a() {
        return this.f14392w0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: d */
    public final C17062e mo5198d() {
        return this.f14395z0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: e */
    public final String mo5191e() {
        return this.f14390u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4427e0)) {
            return false;
        }
        C4427e0 c4427e0 = (C4427e0) obj;
        return AbstractC16544l.m18089b(this.f14390u0, c4427e0.f14390u0) && AbstractC16544l.m18089b(this.f14391v0, c4427e0.f14391v0) && AbstractC16544l.m18089b(this.f14392w0, c4427e0.f14392w0) && AbstractC16544l.m18089b(this.f14393x0, c4427e0.f14393x0) && this.f14394y0 == c4427e0.f14394y0 && AbstractC16544l.m18089b(this.f14395z0, c4427e0.f14395z0);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: f */
    public final AbstractC4413V0 mo5192f() {
        return this.f14391v0;
    }

    @Override // p247Jj.AbstractC4433h0, p247Jj.InterfaceC4396M0
    public final StepStyle getStyles() {
        return this.f14393x0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final int hashCode() {
        int iHashCode = this.f14390u0.hashCode() * 31;
        AbstractC4413V0 abstractC4413V0 = this.f14391v0;
        int iM527p = AbstractC0168G.m527p((iHashCode + (abstractC4413V0 == null ? 0 : abstractC4413V0.hashCode())) * 31, 31, this.f14392w0);
        StepStyle stepStyle = this.f14393x0;
        int iHashCode2 = (iM527p + (stepStyle != null ? stepStyle.hashCode() : 0)) * 31;
        boolean z6 = this.f14394y0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return this.f14395z0.hashCode() + ((iHashCode2 + r6) * 31);
    }

    public final String toString() {
        return "ShowLoadingSpinner(sessionToken=" + this.f14390u0 + ", transitionStatus=" + this.f14391v0 + ", inquiryId=" + this.f14392w0 + ", styles=" + this.f14393x0 + ", useBasicSpinner=" + this.f14394y0 + ", inquirySessionConfig=" + this.f14395z0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14390u0);
        out.writeParcelable(this.f14391v0, i10);
        out.writeString(this.f14392w0);
        out.writeParcelable(this.f14393x0, i10);
        out.writeInt(this.f14394y0 ? 1 : 0);
        out.writeParcelable(this.f14395z0, i10);
    }

    public C4427e0(String sessionToken, AbstractC4413V0 abstractC4413V0, String inquiryId, StepStyle stepStyle, boolean z6, C17062e inquirySessionConfig) {
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
        this.f14390u0 = sessionToken;
        this.f14391v0 = abstractC4413V0;
        this.f14392w0 = inquiryId;
        this.f14393x0 = stepStyle;
        this.f14394y0 = z6;
        this.f14395z0 = inquirySessionConfig;
    }
}
