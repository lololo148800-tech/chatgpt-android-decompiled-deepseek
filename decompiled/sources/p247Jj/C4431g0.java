package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Jj.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4431g0 extends AbstractC4433h0 implements InterfaceC4396M0 {
    public static final Parcelable.Creator<C4431g0> CREATOR = new C4429f0();

    /* JADX INFO: renamed from: A0 */
    public final String f14411A0;

    /* JADX INFO: renamed from: B0 */
    public final String f14412B0;

    /* JADX INFO: renamed from: C0 */
    public final List f14413C0;

    /* JADX INFO: renamed from: D0 */
    public final boolean f14414D0;

    /* JADX INFO: renamed from: E0 */
    public final boolean f14415E0;

    /* JADX INFO: renamed from: F0 */
    public final boolean f14416F0;

    /* JADX INFO: renamed from: G0 */
    public final Map f14417G0;

    /* JADX INFO: renamed from: H0 */
    public final String f14418H0;

    /* JADX INFO: renamed from: I0 */
    public final List f14419I0;

    /* JADX INFO: renamed from: J0 */
    public final C17062e f14420J0;

    /* JADX INFO: renamed from: u0 */
    public final String f14421u0;

    /* JADX INFO: renamed from: v0 */
    public final String f14422v0;

    /* JADX INFO: renamed from: w0 */
    public final AbstractC4413V0 f14423w0;

    /* JADX INFO: renamed from: x0 */
    public final StepStyles.UiStepStyle f14424x0;

    /* JADX INFO: renamed from: y0 */
    public final NextStep.CancelDialog f14425y0;

    /* JADX INFO: renamed from: z0 */
    public final NextStep.C12890Ui.Localizations f14426z0;

    public C4431g0(String inquiryId, String sessionToken, AbstractC4413V0 abstractC4413V0, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.C12890Ui.Localizations localizations, String str, String stepName, List list, boolean z6, boolean z10, boolean z11, Map map, String clientSideKey, List list2, C17062e c17062e) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(clientSideKey, "clientSideKey");
        AbstractC16544l.m18094g(c17062e, MMVKXkcLpuHFDi.qxHKrddxe);
        this.f14421u0 = inquiryId;
        this.f14422v0 = sessionToken;
        this.f14423w0 = abstractC4413V0;
        this.f14424x0 = uiStepStyle;
        this.f14425y0 = cancelDialog;
        this.f14426z0 = localizations;
        this.f14411A0 = str;
        this.f14412B0 = stepName;
        this.f14413C0 = list;
        this.f14414D0 = z6;
        this.f14415E0 = z10;
        this.f14416F0 = z11;
        this.f14417G0 = map;
        this.f14418H0 = clientSideKey;
        this.f14419I0 = list2;
        this.f14420J0 = c17062e;
    }

    /* JADX INFO: renamed from: g */
    public static C4431g0 m5200g(C4431g0 c4431g0, AbstractC4413V0 abstractC4413V0) {
        String inquiryId = c4431g0.f14421u0;
        String sessionToken = c4431g0.f14422v0;
        StepStyles.UiStepStyle uiStepStyle = c4431g0.f14424x0;
        NextStep.CancelDialog cancelDialog = c4431g0.f14425y0;
        NextStep.C12890Ui.Localizations localizations = c4431g0.f14426z0;
        String str = c4431g0.f14411A0;
        String stepName = c4431g0.f14412B0;
        List components = c4431g0.f14413C0;
        boolean z6 = c4431g0.f14414D0;
        boolean z10 = c4431g0.f14415E0;
        boolean z11 = c4431g0.f14416F0;
        Map fields = c4431g0.f14417G0;
        String clientSideKey = c4431g0.f14418H0;
        List list = c4431g0.f14419I0;
        C17062e inquirySessionConfig = c4431g0.f14420J0;
        c4431g0.getClass();
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(components, "components");
        AbstractC16544l.m18094g(fields, "fields");
        AbstractC16544l.m18094g(clientSideKey, "clientSideKey");
        AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
        return new C4431g0(inquiryId, sessionToken, abstractC4413V0, uiStepStyle, cancelDialog, localizations, str, stepName, components, z6, z10, z11, fields, clientSideKey, list, inquirySessionConfig);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: a */
    public final String mo5190a() {
        return this.f14421u0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: b */
    public final NextStep.CancelDialog mo5194b() {
        return this.f14425y0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: c */
    public final String mo5195c() {
        return this.f14412B0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: d */
    public final C17062e mo5198d() {
        return this.f14420J0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: e */
    public final String mo5191e() {
        return this.f14422v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4431g0)) {
            return false;
        }
        C4431g0 c4431g0 = (C4431g0) obj;
        return AbstractC16544l.m18089b(this.f14421u0, c4431g0.f14421u0) && AbstractC16544l.m18089b(this.f14422v0, c4431g0.f14422v0) && AbstractC16544l.m18089b(this.f14423w0, c4431g0.f14423w0) && AbstractC16544l.m18089b(this.f14424x0, c4431g0.f14424x0) && AbstractC16544l.m18089b(this.f14425y0, c4431g0.f14425y0) && AbstractC16544l.m18089b(this.f14426z0, c4431g0.f14426z0) && AbstractC16544l.m18089b(this.f14411A0, c4431g0.f14411A0) && AbstractC16544l.m18089b(this.f14412B0, c4431g0.f14412B0) && AbstractC16544l.m18089b(this.f14413C0, c4431g0.f14413C0) && this.f14414D0 == c4431g0.f14414D0 && this.f14415E0 == c4431g0.f14415E0 && this.f14416F0 == c4431g0.f14416F0 && AbstractC16544l.m18089b(this.f14417G0, c4431g0.f14417G0) && AbstractC16544l.m18089b(this.f14418H0, c4431g0.f14418H0) && AbstractC16544l.m18089b(this.f14419I0, c4431g0.f14419I0) && AbstractC16544l.m18089b(this.f14420J0, c4431g0.f14420J0);
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: f */
    public final AbstractC4413V0 mo5192f() {
        return this.f14423w0;
    }

    @Override // p247Jj.AbstractC4433h0, p247Jj.InterfaceC4396M0
    public final StepStyle getStyles() {
        return this.f14424x0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f14421u0.hashCode() * 31, 31, this.f14422v0);
        AbstractC4413V0 abstractC4413V0 = this.f14423w0;
        int iHashCode = (iM527p + (abstractC4413V0 == null ? 0 : abstractC4413V0.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.f14424x0;
        int iHashCode2 = (iHashCode + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
        NextStep.CancelDialog cancelDialog = this.f14425y0;
        int iHashCode3 = (iHashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
        NextStep.C12890Ui.Localizations localizations = this.f14426z0;
        int iHashCode4 = (iHashCode3 + (localizations == null ? 0 : localizations.hashCode())) * 31;
        String str = this.f14411A0;
        int iM15858x = AbstractC14376f.m15858x(this.f14413C0, AbstractC0168G.m527p((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f14412B0), 31);
        boolean z6 = this.f14414D0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iM15858x + r6) * 31;
        boolean z10 = this.f14415E0;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f14416F0;
        int iM527p2 = AbstractC0168G.m527p(AbstractC20734X.m21250u((i11 + (z11 ? 1 : z11)) * 31, 31, this.f14417G0), 31, this.f14418H0);
        List list = this.f14419I0;
        return this.f14420J0.hashCode() + ((iM527p2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14421u0);
        out.writeString(this.f14422v0);
        out.writeParcelable(this.f14423w0, i10);
        out.writeParcelable(this.f14424x0, i10);
        out.writeParcelable(this.f14425y0, i10);
        out.writeParcelable(this.f14426z0, i10);
        out.writeString(this.f14411A0);
        out.writeString(this.f14412B0);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f14413C0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeInt(this.f14414D0 ? 1 : 0);
        out.writeInt(this.f14415E0 ? 1 : 0);
        out.writeInt(this.f14416F0 ? 1 : 0);
        Map map = this.f14417G0;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeParcelable((Parcelable) entry.getValue(), i10);
        }
        out.writeString(this.f14418H0);
        List list = this.f14419I0;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i10);
            }
        }
        out.writeParcelable(this.f14420J0, i10);
    }

    public final String toString() {
        return "UiStepRunning(inquiryId=" + this.f14421u0 + ", sessionToken=" + this.f14422v0 + ", transitionStatus=" + this.f14423w0 + ", styles=" + this.f14424x0 + ", cancelDialog=" + this.f14425y0 + tpXhEMGxfXFVSh.sRvcVGJxroRua + this.f14426z0 + ", inquiryStatus=" + this.f14411A0 + ", stepName=" + this.f14412B0 + ", components=" + this.f14413C0 + ", backStepEnabled=" + this.f14414D0 + ", cancelButtonEnabled=" + this.f14415E0 + ", finalStep=" + this.f14416F0 + ", fields=" + this.f14417G0 + ", clientSideKey=" + this.f14418H0 + ", serverComponentErrors=" + this.f14419I0 + ", inquirySessionConfig=" + this.f14420J0 + Separators.RPAREN;
    }
}
