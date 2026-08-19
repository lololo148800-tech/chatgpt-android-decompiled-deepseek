package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.utils.p651oZ.HhJS;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p021Aj.C0517b;
import p775h2.AbstractC14376f;
import p882m1.clb.WGTYqNchEpHca;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Jj.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4421b0 extends AbstractC4433h0 implements InterfaceC4396M0 {
    public static final Parcelable.Creator<C4421b0> CREATOR = new C4419a0();

    /* JADX INFO: renamed from: A0 */
    public final List f14340A0;

    /* JADX INFO: renamed from: B0 */
    public final String f14341B0;

    /* JADX INFO: renamed from: C0 */
    public final String f14342C0;

    /* JADX INFO: renamed from: D0 */
    public final boolean f14343D0;

    /* JADX INFO: renamed from: E0 */
    public final boolean f14344E0;

    /* JADX INFO: renamed from: F0 */
    public final NextStep.GovernmentId.Localizations f14345F0;

    /* JADX INFO: renamed from: G0 */
    public final List f14346G0;

    /* JADX INFO: renamed from: H0 */
    public final List f14347H0;

    /* JADX INFO: renamed from: I0 */
    public final int f14348I0;

    /* JADX INFO: renamed from: J0 */
    public final long f14349J0;

    /* JADX INFO: renamed from: K0 */
    public final String f14350K0;

    /* JADX INFO: renamed from: L0 */
    public final String f14351L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f14352M0;

    /* JADX INFO: renamed from: N0 */
    public final List f14353N0;

    /* JADX INFO: renamed from: O0 */
    public final List f14354O0;

    /* JADX INFO: renamed from: P0 */
    public final String f14355P0;

    /* JADX INFO: renamed from: Q0 */
    public final NextStep.GovernmentId.AssetConfig f14356Q0;

    /* JADX INFO: renamed from: R0 */
    public final C0517b f14357R0;

    /* JADX INFO: renamed from: S0 */
    public final StyleElements.Axis f14358S0;

    /* JADX INFO: renamed from: T0 */
    public final PendingPageTextPosition f14359T0;

    /* JADX INFO: renamed from: U0 */
    public final boolean f14360U0;

    /* JADX INFO: renamed from: u0 */
    public final String f14361u0;

    /* JADX INFO: renamed from: v0 */
    public final String f14362v0;

    /* JADX INFO: renamed from: w0 */
    public final AbstractC4413V0 f14363w0;

    /* JADX INFO: renamed from: x0 */
    public final StepStyles.GovernmentIdStepStyle f14364x0;

    /* JADX INFO: renamed from: y0 */
    public final NextStep.CancelDialog f14365y0;

    /* JADX INFO: renamed from: z0 */
    public final String f14366z0;

    public C4421b0(String inquiryId, String sessionToken, AbstractC4413V0 abstractC4413V0, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String countryCode, List list, String fromComponent, String fromStep, boolean z6, boolean z10, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i10, long j10, String fieldKeyDocument, String fieldKeyIdClass, boolean z11, List list4, List list5, String str, NextStep.GovernmentId.AssetConfig assetConfig, C0517b autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition, boolean z12) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(countryCode, "countryCode");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(localizations, "localizations");
        AbstractC16544l.m18094g(fieldKeyDocument, "fieldKeyDocument");
        AbstractC16544l.m18094g(fieldKeyIdClass, "fieldKeyIdClass");
        AbstractC16544l.m18094g(autoClassificationConfig, "autoClassificationConfig");
        AbstractC16544l.m18094g(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f14361u0 = inquiryId;
        this.f14362v0 = sessionToken;
        this.f14363w0 = abstractC4413V0;
        this.f14364x0 = governmentIdStepStyle;
        this.f14365y0 = cancelDialog;
        this.f14366z0 = countryCode;
        this.f14340A0 = list;
        this.f14341B0 = fromComponent;
        this.f14342C0 = fromStep;
        this.f14343D0 = z6;
        this.f14344E0 = z10;
        this.f14345F0 = localizations;
        this.f14346G0 = list2;
        this.f14347H0 = list3;
        this.f14348I0 = i10;
        this.f14349J0 = j10;
        this.f14350K0 = fieldKeyDocument;
        this.f14351L0 = fieldKeyIdClass;
        this.f14352M0 = z11;
        this.f14353N0 = list4;
        this.f14354O0 = list5;
        this.f14355P0 = str;
        this.f14356Q0 = assetConfig;
        this.f14357R0 = autoClassificationConfig;
        this.f14358S0 = reviewCaptureButtonsAxis;
        this.f14359T0 = pendingPageTextVerticalPosition;
        this.f14360U0 = z12;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: a */
    public final String mo5190a() {
        return this.f14361u0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: b */
    public final NextStep.CancelDialog mo5194b() {
        return this.f14365y0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: c */
    public final String mo5195c() {
        return this.f14342C0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: e */
    public final String mo5191e() {
        return this.f14362v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4421b0)) {
            return false;
        }
        C4421b0 c4421b0 = (C4421b0) obj;
        return AbstractC16544l.m18089b(this.f14361u0, c4421b0.f14361u0) && AbstractC16544l.m18089b(this.f14362v0, c4421b0.f14362v0) && AbstractC16544l.m18089b(this.f14363w0, c4421b0.f14363w0) && AbstractC16544l.m18089b(this.f14364x0, c4421b0.f14364x0) && AbstractC16544l.m18089b(this.f14365y0, c4421b0.f14365y0) && AbstractC16544l.m18089b(this.f14366z0, c4421b0.f14366z0) && AbstractC16544l.m18089b(this.f14340A0, c4421b0.f14340A0) && AbstractC16544l.m18089b(this.f14341B0, c4421b0.f14341B0) && AbstractC16544l.m18089b(this.f14342C0, c4421b0.f14342C0) && this.f14343D0 == c4421b0.f14343D0 && this.f14344E0 == c4421b0.f14344E0 && AbstractC16544l.m18089b(this.f14345F0, c4421b0.f14345F0) && AbstractC16544l.m18089b(this.f14346G0, c4421b0.f14346G0) && AbstractC16544l.m18089b(this.f14347H0, c4421b0.f14347H0) && this.f14348I0 == c4421b0.f14348I0 && this.f14349J0 == c4421b0.f14349J0 && AbstractC16544l.m18089b(this.f14350K0, c4421b0.f14350K0) && AbstractC16544l.m18089b(this.f14351L0, c4421b0.f14351L0) && this.f14352M0 == c4421b0.f14352M0 && AbstractC16544l.m18089b(this.f14353N0, c4421b0.f14353N0) && AbstractC16544l.m18089b(this.f14354O0, c4421b0.f14354O0) && AbstractC16544l.m18089b(this.f14355P0, c4421b0.f14355P0) && AbstractC16544l.m18089b(this.f14356Q0, c4421b0.f14356Q0) && AbstractC16544l.m18089b(this.f14357R0, c4421b0.f14357R0) && this.f14358S0 == c4421b0.f14358S0 && this.f14359T0 == c4421b0.f14359T0 && this.f14360U0 == c4421b0.f14360U0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: f */
    public final AbstractC4413V0 mo5192f() {
        return this.f14363w0;
    }

    @Override // p247Jj.AbstractC4433h0, p247Jj.InterfaceC4396M0
    public final StepStyle getStyles() {
        return this.f14364x0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f14361u0.hashCode() * 31, 31, this.f14362v0);
        AbstractC4413V0 abstractC4413V0 = this.f14363w0;
        int iHashCode = (iM527p + (abstractC4413V0 == null ? 0 : abstractC4413V0.hashCode())) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.f14364x0;
        int iHashCode2 = (iHashCode + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
        NextStep.CancelDialog cancelDialog = this.f14365y0;
        int iM527p2 = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC14376f.m15858x(this.f14340A0, AbstractC0168G.m527p((iHashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31, 31, this.f14366z0), 31), 31, this.f14341B0), 31, this.f14342C0);
        boolean z6 = this.f14343D0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iM527p2 + r6) * 31;
        boolean z10 = this.f14344E0;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode3 = (this.f14345F0.hashCode() + ((i10 + r10) * 31)) * 31;
        List list = this.f14346G0;
        int iM15858x = (AbstractC14376f.m15858x(this.f14347H0, (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31) + this.f14348I0) * 31;
        long j10 = this.f14349J0;
        int iM527p3 = AbstractC0168G.m527p(AbstractC0168G.m527p((iM15858x + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f14350K0), 31, this.f14351L0);
        boolean z11 = this.f14352M0;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iM15858x2 = AbstractC14376f.m15858x(this.f14354O0, AbstractC14376f.m15858x(this.f14353N0, (iM527p3 + r11) * 31, 31), 31);
        String str = this.f14355P0;
        int iHashCode4 = (iM15858x2 + (str == null ? 0 : str.hashCode())) * 31;
        NextStep.GovernmentId.AssetConfig assetConfig = this.f14356Q0;
        int iHashCode5 = (this.f14359T0.hashCode() + ((this.f14358S0.hashCode() + ((this.f14357R0.hashCode() + ((iHashCode4 + (assetConfig != null ? assetConfig.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        boolean z12 = this.f14360U0;
        return iHashCode5 + (z12 ? 1 : z12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GovernmentIdStepRunning(inquiryId=");
        sb2.append(this.f14361u0);
        sb2.append(", sessionToken=");
        sb2.append(this.f14362v0);
        sb2.append(", transitionStatus=");
        sb2.append(this.f14363w0);
        sb2.append(", styles=");
        sb2.append(this.f14364x0);
        sb2.append(", cancelDialog=");
        sb2.append(this.f14365y0);
        sb2.append(", countryCode=");
        sb2.append(this.f14366z0);
        sb2.append(", enabledIdClasses=");
        sb2.append(this.f14340A0);
        sb2.append(", fromComponent=");
        sb2.append(this.f14341B0);
        sb2.append(", fromStep=");
        sb2.append(this.f14342C0);
        sb2.append(", backStepEnabled=");
        sb2.append(this.f14343D0);
        sb2.append(", cancelButtonEnabled=");
        sb2.append(this.f14344E0);
        sb2.append(", localizations=");
        sb2.append(this.f14345F0);
        sb2.append(", localizationOverrides=");
        sb2.append(this.f14346G0);
        sb2.append(", enabledCaptureOptionsNativeMobile=");
        sb2.append(this.f14347H0);
        sb2.append(", imageCaptureCount=");
        sb2.append(this.f14348I0);
        sb2.append(", manualCaptureButtonDelayMs=");
        sb2.append(this.f14349J0);
        sb2.append(", fieldKeyDocument=");
        sb2.append(this.f14350K0);
        sb2.append(", fieldKeyIdClass=");
        sb2.append(this.f14351L0);
        sb2.append(", shouldSkipReviewScreen=");
        sb2.append(this.f14352M0);
        sb2.append(", enabledCaptureFileTypes=");
        sb2.append(this.f14353N0);
        sb2.append(", videoCaptureMethods=");
        sb2.append(this.f14354O0);
        sb2.append(", webRtcJwt=");
        sb2.append(this.f14355P0);
        sb2.append(", assetConfig=");
        sb2.append(this.f14356Q0);
        sb2.append(", autoClassificationConfig=");
        sb2.append(this.f14357R0);
        sb2.append(", reviewCaptureButtonsAxis=");
        sb2.append(this.f14358S0);
        sb2.append(", pendingPageTextVerticalPosition=");
        sb2.append(this.f14359T0);
        sb2.append(", audioEnabled=");
        return AbstractC14376f.m15823B(sb2, this.f14360U0, Separators.RPAREN);
    }

    /* JADX INFO: renamed from: g */
    public static C4421b0 m5196g(C4421b0 c4421b0, AbstractC4413V0 abstractC4413V0) {
        String inquiryId = c4421b0.f14361u0;
        String sessionToken = c4421b0.f14362v0;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = c4421b0.f14364x0;
        NextStep.CancelDialog cancelDialog = c4421b0.f14365y0;
        String countryCode = c4421b0.f14366z0;
        List enabledIdClasses = c4421b0.f14340A0;
        String fromComponent = c4421b0.f14341B0;
        String fromStep = c4421b0.f14342C0;
        boolean z6 = c4421b0.f14343D0;
        boolean z10 = c4421b0.f14344E0;
        NextStep.GovernmentId.Localizations localizations = c4421b0.f14345F0;
        List list = c4421b0.f14346G0;
        List enabledCaptureOptionsNativeMobile = c4421b0.f14347H0;
        int i10 = c4421b0.f14348I0;
        long j10 = c4421b0.f14349J0;
        String str = c4421b0.f14350K0;
        String fieldKeyIdClass = c4421b0.f14351L0;
        boolean z11 = c4421b0.f14352M0;
        List enabledCaptureFileTypes = c4421b0.f14353N0;
        List videoCaptureMethods = c4421b0.f14354O0;
        String str2 = c4421b0.f14355P0;
        NextStep.GovernmentId.AssetConfig assetConfig = c4421b0.f14356Q0;
        C0517b autoClassificationConfig = c4421b0.f14357R0;
        StyleElements.Axis reviewCaptureButtonsAxis = c4421b0.f14358S0;
        PendingPageTextPosition pendingPageTextVerticalPosition = c4421b0.f14359T0;
        boolean z12 = c4421b0.f14360U0;
        c4421b0.getClass();
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(countryCode, "countryCode");
        AbstractC16544l.m18094g(enabledIdClasses, "enabledIdClasses");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(localizations, "localizations");
        AbstractC16544l.m18094g(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
        AbstractC16544l.m18094g(str, HhJS.rgWsMiIAJwGnWQP);
        AbstractC16544l.m18094g(fieldKeyIdClass, "fieldKeyIdClass");
        AbstractC16544l.m18094g(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        AbstractC16544l.m18094g(videoCaptureMethods, "videoCaptureMethods");
        AbstractC16544l.m18094g(autoClassificationConfig, "autoClassificationConfig");
        AbstractC16544l.m18094g(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        return new C4421b0(inquiryId, sessionToken, abstractC4413V0, governmentIdStepStyle, cancelDialog, countryCode, enabledIdClasses, fromComponent, fromStep, z6, z10, localizations, list, enabledCaptureOptionsNativeMobile, i10, j10, str, fieldKeyIdClass, z11, enabledCaptureFileTypes, videoCaptureMethods, str2, assetConfig, autoClassificationConfig, reviewCaptureButtonsAxis, pendingPageTextVerticalPosition, z12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC16544l.m18094g(parcel, WGTYqNchEpHca.ixkSEqhp);
        parcel.writeString(this.f14361u0);
        parcel.writeString(this.f14362v0);
        parcel.writeParcelable(this.f14363w0, i10);
        parcel.writeParcelable(this.f14364x0, i10);
        parcel.writeParcelable(this.f14365y0, i10);
        parcel.writeString(this.f14366z0);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f14340A0, parcel);
        while (itM19536s.hasNext()) {
            parcel.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        parcel.writeString(this.f14341B0);
        parcel.writeString(this.f14342C0);
        parcel.writeInt(this.f14343D0 ? 1 : 0);
        parcel.writeInt(this.f14344E0 ? 1 : 0);
        parcel.writeParcelable(this.f14345F0, i10);
        List list = this.f14346G0;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i10);
            }
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f14347H0, parcel);
        while (itM19536s2.hasNext()) {
            parcel.writeString(((CaptureOptionNativeMobile) itM19536s2.next()).name());
        }
        parcel.writeInt(this.f14348I0);
        parcel.writeLong(this.f14349J0);
        parcel.writeString(this.f14350K0);
        parcel.writeString(this.f14351L0);
        parcel.writeInt(this.f14352M0 ? 1 : 0);
        Iterator itM19536s3 = AbstractC17792x.m19536s(this.f14353N0, parcel);
        while (itM19536s3.hasNext()) {
            parcel.writeString(((NextStep.GovernmentId.CaptureFileType) itM19536s3.next()).name());
        }
        Iterator itM19536s4 = AbstractC17792x.m19536s(this.f14354O0, parcel);
        while (itM19536s4.hasNext()) {
            parcel.writeString(((NextStep.GovernmentId.VideoCaptureMethod) itM19536s4.next()).name());
        }
        parcel.writeString(this.f14355P0);
        parcel.writeParcelable(this.f14356Q0, i10);
        parcel.writeParcelable(this.f14357R0, i10);
        parcel.writeString(this.f14358S0.name());
        parcel.writeString(this.f14359T0.name());
        parcel.writeInt(this.f14360U0 ? 1 : 0);
    }
}
