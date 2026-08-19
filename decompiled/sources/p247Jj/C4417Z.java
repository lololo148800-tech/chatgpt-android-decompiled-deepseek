package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1044uj.C20362t;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Jj.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4417Z extends AbstractC4433h0 implements InterfaceC4396M0 {
    public static final Parcelable.Creator<C4417Z> CREATOR = new C4416Y();

    /* JADX INFO: renamed from: A0 */
    public final String f14328A0;

    /* JADX INFO: renamed from: B0 */
    public final C20362t f14329B0;

    /* JADX INFO: renamed from: C0 */
    public final NextStep.Document.AssetConfig f14330C0;

    /* JADX INFO: renamed from: D0 */
    public final String f14331D0;

    /* JADX INFO: renamed from: u0 */
    public final String f14332u0;

    /* JADX INFO: renamed from: v0 */
    public final String f14333v0;

    /* JADX INFO: renamed from: w0 */
    public final AbstractC4413V0 f14334w0;

    /* JADX INFO: renamed from: x0 */
    public final StepStyles.DocumentStepStyle f14335x0;

    /* JADX INFO: renamed from: y0 */
    public final NextStep.CancelDialog f14336y0;

    /* JADX INFO: renamed from: z0 */
    public final NextStep.Document f14337z0;

    public C4417Z(String inquiryId, String sessionToken, AbstractC4413V0 abstractC4413V0, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document documentStep, String fromComponent, C20362t pages, NextStep.Document.AssetConfig assetConfig, String fromStep) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(documentStep, "documentStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(pages, "pages");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        this.f14332u0 = inquiryId;
        this.f14333v0 = sessionToken;
        this.f14334w0 = abstractC4413V0;
        this.f14335x0 = documentStepStyle;
        this.f14336y0 = cancelDialog;
        this.f14337z0 = documentStep;
        this.f14328A0 = fromComponent;
        this.f14329B0 = pages;
        this.f14330C0 = assetConfig;
        this.f14331D0 = fromStep;
    }

    /* JADX INFO: renamed from: g */
    public static C4417Z m5193g(C4417Z c4417z, AbstractC4413V0 abstractC4413V0) {
        String inquiryId = c4417z.f14332u0;
        String sessionToken = c4417z.f14333v0;
        StepStyles.DocumentStepStyle documentStepStyle = c4417z.f14335x0;
        NextStep.CancelDialog cancelDialog = c4417z.f14336y0;
        NextStep.Document documentStep = c4417z.f14337z0;
        String fromComponent = c4417z.f14328A0;
        C20362t pages = c4417z.f14329B0;
        NextStep.Document.AssetConfig assetConfig = c4417z.f14330C0;
        String fromStep = c4417z.f14331D0;
        c4417z.getClass();
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(documentStep, "documentStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(pages, "pages");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        return new C4417Z(inquiryId, sessionToken, abstractC4413V0, documentStepStyle, cancelDialog, documentStep, fromComponent, pages, assetConfig, fromStep);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: a */
    public final String mo5190a() {
        return this.f14332u0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: b */
    public final NextStep.CancelDialog mo5194b() {
        return this.f14336y0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: c */
    public final String mo5195c() {
        return this.f14331D0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: e */
    public final String mo5191e() {
        return this.f14333v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4417Z)) {
            return false;
        }
        C4417Z c4417z = (C4417Z) obj;
        return AbstractC16544l.m18089b(this.f14332u0, c4417z.f14332u0) && AbstractC16544l.m18089b(this.f14333v0, c4417z.f14333v0) && AbstractC16544l.m18089b(this.f14334w0, c4417z.f14334w0) && AbstractC16544l.m18089b(this.f14335x0, c4417z.f14335x0) && AbstractC16544l.m18089b(this.f14336y0, c4417z.f14336y0) && AbstractC16544l.m18089b(this.f14337z0, c4417z.f14337z0) && AbstractC16544l.m18089b(this.f14328A0, c4417z.f14328A0) && AbstractC16544l.m18089b(this.f14329B0, c4417z.f14329B0) && AbstractC16544l.m18089b(this.f14330C0, c4417z.f14330C0) && AbstractC16544l.m18089b(this.f14331D0, c4417z.f14331D0);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: f */
    public final AbstractC4413V0 mo5192f() {
        return this.f14334w0;
    }

    @Override // p247Jj.AbstractC4433h0, p247Jj.InterfaceC4396M0
    public final StepStyle getStyles() {
        return this.f14335x0;
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f14332u0.hashCode() * 31, 31, this.f14333v0);
        AbstractC4413V0 abstractC4413V0 = this.f14334w0;
        int iHashCode = (iM527p + (abstractC4413V0 == null ? 0 : abstractC4413V0.hashCode())) * 31;
        StepStyles.DocumentStepStyle documentStepStyle = this.f14335x0;
        int iHashCode2 = (iHashCode + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
        NextStep.CancelDialog cancelDialog = this.f14336y0;
        int iHashCode3 = (this.f14329B0.hashCode() + AbstractC0168G.m527p((this.f14337z0.hashCode() + ((iHashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31)) * 31, 31, this.f14328A0)) * 31;
        NextStep.Document.AssetConfig assetConfig = this.f14330C0;
        return this.f14331D0.hashCode() + ((iHashCode3 + (assetConfig != null ? assetConfig.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentStepRunning(inquiryId=");
        sb2.append(this.f14332u0);
        sb2.append(", sessionToken=");
        sb2.append(this.f14333v0);
        sb2.append(", transitionStatus=");
        sb2.append(this.f14334w0);
        sb2.append(", styles=");
        sb2.append(this.f14335x0);
        sb2.append(", cancelDialog=");
        sb2.append(this.f14336y0);
        sb2.append(", documentStep=");
        sb2.append(this.f14337z0);
        sb2.append(", fromComponent=");
        sb2.append(this.f14328A0);
        sb2.append(", pages=");
        sb2.append(this.f14329B0);
        sb2.append(", assetConfig=");
        sb2.append(this.f14330C0);
        sb2.append(", fromStep=");
        return AbstractC9306j0.m9891j(this.f14331D0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14332u0);
        out.writeString(this.f14333v0);
        out.writeParcelable(this.f14334w0, i10);
        out.writeParcelable(this.f14335x0, i10);
        out.writeParcelable(this.f14336y0, i10);
        out.writeParcelable(this.f14337z0, i10);
        out.writeString(this.f14328A0);
        out.writeParcelable(this.f14329B0, i10);
        out.writeParcelable(this.f14330C0, i10);
        out.writeString(this.f14331D0);
    }
}
