package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Jj.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4425d0 extends AbstractC4433h0 implements InterfaceC4396M0 {
    public static final Parcelable.Creator<C4425d0> CREATOR = new C4423c0();

    /* JADX INFO: renamed from: A0 */
    public final String f14368A0;

    /* JADX INFO: renamed from: B0 */
    public final String f14369B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f14370C0;

    /* JADX INFO: renamed from: D0 */
    public final boolean f14371D0;

    /* JADX INFO: renamed from: E0 */
    public final String f14372E0;

    /* JADX INFO: renamed from: F0 */
    public final boolean f14373F0;

    /* JADX INFO: renamed from: G0 */
    public final boolean f14374G0;

    /* JADX INFO: renamed from: H0 */
    public final NextStep.Selfie.Localizations f14375H0;

    /* JADX INFO: renamed from: I0 */
    public final List f14376I0;

    /* JADX INFO: renamed from: J0 */
    public final List f14377J0;

    /* JADX INFO: renamed from: K0 */
    public final NextStep.Selfie.AssetConfig f14378K0;

    /* JADX INFO: renamed from: L0 */
    public final String f14379L0;

    /* JADX INFO: renamed from: M0 */
    public final List f14380M0;

    /* JADX INFO: renamed from: N0 */
    public final PendingPageTextPosition f14381N0;

    /* JADX INFO: renamed from: O0 */
    public final boolean f14382O0;

    /* JADX INFO: renamed from: u0 */
    public final String f14383u0;

    /* JADX INFO: renamed from: v0 */
    public final String f14384v0;

    /* JADX INFO: renamed from: w0 */
    public final AbstractC4413V0 f14385w0;

    /* JADX INFO: renamed from: x0 */
    public final StepStyles.SelfieStepStyle f14386x0;

    /* JADX INFO: renamed from: y0 */
    public final NextStep.CancelDialog f14387y0;

    /* JADX INFO: renamed from: z0 */
    public final NextStep.Selfie.CaptureMethod f14388z0;

    public C4425d0(String inquiryId, String sessionToken, AbstractC4413V0 abstractC4413V0, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod selfieType, String fromComponent, String fromStep, boolean z6, boolean z10, String fieldKeySelfie, boolean z11, boolean z12, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str, List list3, PendingPageTextPosition pendingPageTextVerticalPosition, boolean z13) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(selfieType, "selfieType");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fieldKeySelfie, "fieldKeySelfie");
        AbstractC16544l.m18094g(localizations, "localizations");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f14383u0 = inquiryId;
        this.f14384v0 = sessionToken;
        this.f14385w0 = abstractC4413V0;
        this.f14386x0 = selfieStepStyle;
        this.f14387y0 = cancelDialog;
        this.f14388z0 = selfieType;
        this.f14368A0 = fromComponent;
        this.f14369B0 = fromStep;
        this.f14370C0 = z6;
        this.f14371D0 = z10;
        this.f14372E0 = fieldKeySelfie;
        this.f14373F0 = z11;
        this.f14374G0 = z12;
        this.f14375H0 = localizations;
        this.f14376I0 = list;
        this.f14377J0 = list2;
        this.f14378K0 = assetConfig;
        this.f14379L0 = str;
        this.f14380M0 = list3;
        this.f14381N0 = pendingPageTextVerticalPosition;
        this.f14382O0 = z13;
    }

    /* JADX INFO: renamed from: g */
    public static C4425d0 m5197g(C4425d0 c4425d0, AbstractC4413V0 abstractC4413V0) {
        String inquiryId = c4425d0.f14383u0;
        String sessionToken = c4425d0.f14384v0;
        StepStyles.SelfieStepStyle selfieStepStyle = c4425d0.f14386x0;
        NextStep.CancelDialog cancelDialog = c4425d0.f14387y0;
        NextStep.Selfie.CaptureMethod selfieType = c4425d0.f14388z0;
        String fromComponent = c4425d0.f14368A0;
        String fromStep = c4425d0.f14369B0;
        boolean z6 = c4425d0.f14370C0;
        boolean z10 = c4425d0.f14371D0;
        String fieldKeySelfie = c4425d0.f14372E0;
        boolean z11 = c4425d0.f14373F0;
        boolean z12 = c4425d0.f14374G0;
        NextStep.Selfie.Localizations localizations = c4425d0.f14375H0;
        List enabledCaptureFileTypes = c4425d0.f14376I0;
        List videoCaptureMethods = c4425d0.f14377J0;
        NextStep.Selfie.AssetConfig assetConfig = c4425d0.f14378K0;
        String str = c4425d0.f14379L0;
        List list = c4425d0.f14380M0;
        PendingPageTextPosition pendingPageTextVerticalPosition = c4425d0.f14381N0;
        boolean z13 = c4425d0.f14382O0;
        c4425d0.getClass();
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(selfieType, "selfieType");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fieldKeySelfie, "fieldKeySelfie");
        AbstractC16544l.m18094g(localizations, "localizations");
        AbstractC16544l.m18094g(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        AbstractC16544l.m18094g(videoCaptureMethods, "videoCaptureMethods");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        return new C4425d0(inquiryId, sessionToken, abstractC4413V0, selfieStepStyle, cancelDialog, selfieType, fromComponent, fromStep, z6, z10, fieldKeySelfie, z11, z12, localizations, enabledCaptureFileTypes, videoCaptureMethods, assetConfig, str, list, pendingPageTextVerticalPosition, z13);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: a */
    public final String mo5190a() {
        return this.f14383u0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: b */
    public final NextStep.CancelDialog mo5194b() {
        return this.f14387y0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: c */
    public final String mo5195c() {
        return this.f14369B0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: e */
    public final String mo5191e() {
        return this.f14384v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4425d0)) {
            return false;
        }
        C4425d0 c4425d0 = (C4425d0) obj;
        return AbstractC16544l.m18089b(this.f14383u0, c4425d0.f14383u0) && AbstractC16544l.m18089b(this.f14384v0, c4425d0.f14384v0) && AbstractC16544l.m18089b(this.f14385w0, c4425d0.f14385w0) && AbstractC16544l.m18089b(this.f14386x0, c4425d0.f14386x0) && AbstractC16544l.m18089b(this.f14387y0, c4425d0.f14387y0) && this.f14388z0 == c4425d0.f14388z0 && AbstractC16544l.m18089b(this.f14368A0, c4425d0.f14368A0) && AbstractC16544l.m18089b(this.f14369B0, c4425d0.f14369B0) && this.f14370C0 == c4425d0.f14370C0 && this.f14371D0 == c4425d0.f14371D0 && AbstractC16544l.m18089b(this.f14372E0, c4425d0.f14372E0) && this.f14373F0 == c4425d0.f14373F0 && this.f14374G0 == c4425d0.f14374G0 && AbstractC16544l.m18089b(this.f14375H0, c4425d0.f14375H0) && AbstractC16544l.m18089b(this.f14376I0, c4425d0.f14376I0) && AbstractC16544l.m18089b(this.f14377J0, c4425d0.f14377J0) && AbstractC16544l.m18089b(this.f14378K0, c4425d0.f14378K0) && AbstractC16544l.m18089b(this.f14379L0, c4425d0.f14379L0) && AbstractC16544l.m18089b(this.f14380M0, c4425d0.f14380M0) && this.f14381N0 == c4425d0.f14381N0 && this.f14382O0 == c4425d0.f14382O0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: f */
    public final AbstractC4413V0 mo5192f() {
        return this.f14385w0;
    }

    @Override // p247Jj.AbstractC4433h0, p247Jj.InterfaceC4396M0
    public final StepStyle getStyles() {
        return this.f14386x0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f14383u0.hashCode() * 31, 31, this.f14384v0);
        AbstractC4413V0 abstractC4413V0 = this.f14385w0;
        int iHashCode = (iM527p + (abstractC4413V0 == null ? 0 : abstractC4413V0.hashCode())) * 31;
        StepStyles.SelfieStepStyle selfieStepStyle = this.f14386x0;
        int iHashCode2 = (iHashCode + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31;
        NextStep.CancelDialog cancelDialog = this.f14387y0;
        int iM527p2 = AbstractC0168G.m527p(AbstractC0168G.m527p((this.f14388z0.hashCode() + ((iHashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31)) * 31, 31, this.f14368A0), 31, this.f14369B0);
        boolean z6 = this.f14370C0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iM527p2 + r6) * 31;
        boolean z10 = this.f14371D0;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM527p3 = AbstractC0168G.m527p((i10 + r10) * 31, 31, this.f14372E0);
        boolean z11 = this.f14373F0;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iM527p3 + r11) * 31;
        boolean z12 = this.f14374G0;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int iM15858x = AbstractC14376f.m15858x(this.f14377J0, AbstractC14376f.m15858x(this.f14376I0, (this.f14375H0.hashCode() + ((i11 + r12) * 31)) * 31, 31), 31);
        NextStep.Selfie.AssetConfig assetConfig = this.f14378K0;
        int iHashCode3 = (iM15858x + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31;
        String str = this.f14379L0;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f14380M0;
        int iHashCode5 = (this.f14381N0.hashCode() + ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31)) * 31;
        boolean z13 = this.f14382O0;
        return iHashCode5 + (z13 ? 1 : z13);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14383u0);
        out.writeString(this.f14384v0);
        out.writeParcelable(this.f14385w0, i10);
        out.writeParcelable(this.f14386x0, i10);
        out.writeParcelable(this.f14387y0, i10);
        out.writeString(this.f14388z0.name());
        out.writeString(this.f14368A0);
        out.writeString(this.f14369B0);
        out.writeInt(this.f14370C0 ? 1 : 0);
        out.writeInt(this.f14371D0 ? 1 : 0);
        out.writeString(this.f14372E0);
        out.writeInt(this.f14373F0 ? 1 : 0);
        out.writeInt(this.f14374G0 ? 1 : 0);
        out.writeParcelable(this.f14375H0, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f14376I0, out);
        while (itM19536s.hasNext()) {
            out.writeString(((NextStep.Selfie.CaptureFileType) itM19536s.next()).name());
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f14377J0, out);
        while (itM19536s2.hasNext()) {
            out.writeString(((NextStep.Selfie.VideoCaptureMethod) itM19536s2.next()).name());
        }
        out.writeParcelable(this.f14378K0, i10);
        out.writeString(this.f14379L0);
        List list = this.f14380M0;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((NextStep.Selfie.SelfiePose) it.next()).name());
            }
        }
        out.writeString(this.f14381N0.name());
        out.writeInt(this.f14382O0 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelfieStepRunning(inquiryId=");
        sb2.append(this.f14383u0);
        sb2.append(", sessionToken=");
        sb2.append(this.f14384v0);
        sb2.append(", transitionStatus=");
        sb2.append(this.f14385w0);
        sb2.append(MMVKXkcLpuHFDi.aoouxGT);
        sb2.append(this.f14386x0);
        sb2.append(", cancelDialog=");
        sb2.append(this.f14387y0);
        sb2.append(", selfieType=");
        sb2.append(this.f14388z0);
        sb2.append(", fromComponent=");
        sb2.append(this.f14368A0);
        sb2.append(", fromStep=");
        sb2.append(this.f14369B0);
        sb2.append(", backStepEnabled=");
        sb2.append(this.f14370C0);
        sb2.append(", cancelButtonEnabled=");
        sb2.append(this.f14371D0);
        sb2.append(", fieldKeySelfie=");
        sb2.append(this.f14372E0);
        sb2.append(", requireStrictSelfieCapture=");
        sb2.append(this.f14373F0);
        sb2.append(", skipPromptPage=");
        sb2.append(this.f14374G0);
        sb2.append(", localizations=");
        sb2.append(this.f14375H0);
        sb2.append(", enabledCaptureFileTypes=");
        sb2.append(this.f14376I0);
        sb2.append(", videoCaptureMethods=");
        sb2.append(this.f14377J0);
        sb2.append(", assetConfig=");
        sb2.append(this.f14378K0);
        sb2.append(", webRtcJwt=");
        sb2.append(this.f14379L0);
        sb2.append(", orderedPoses=");
        sb2.append(this.f14380M0);
        sb2.append(", pendingPageTextVerticalPosition=");
        sb2.append(this.f14381N0);
        sb2.append(", audioEnabled=");
        return AbstractC14376f.m15823B(sb2, this.f14382O0, Separators.RPAREN);
    }
}
