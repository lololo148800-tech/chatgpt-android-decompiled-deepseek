package p1156zj;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.View;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p003A1.AbstractC0168G;
import p021Aj.C0519d;
import p769gj.C14182x;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14161c;

/* JADX INFO: renamed from: zj.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C22194t implements InterfaceC14161c {

    /* JADX INFO: renamed from: A0 */
    public final int f70318A0;

    /* JADX INFO: renamed from: B0 */
    public View f70319B0;

    /* JADX INFO: renamed from: C0 */
    public final C14182x f70320C0;

    /* JADX INFO: renamed from: Y */
    public final List f70321Y;

    /* JADX INFO: renamed from: Z */
    public final String f70322Z;

    /* JADX INFO: renamed from: o0 */
    public final String f70323o0;

    /* JADX INFO: renamed from: p0 */
    public final String f70324p0;

    /* JADX INFO: renamed from: q0 */
    public final String f70325q0;

    /* JADX INFO: renamed from: r0 */
    public final C17280a f70326r0;

    /* JADX INFO: renamed from: s0 */
    public final C22095E0 f70327s0;

    /* JADX INFO: renamed from: t0 */
    public final C22093D0 f70328t0;

    /* JADX INFO: renamed from: u0 */
    public final C22097F0 f70329u0;

    /* JADX INFO: renamed from: v0 */
    public final C0519d f70330v0;

    /* JADX INFO: renamed from: w0 */
    public final String f70331w0;

    /* JADX INFO: renamed from: x0 */
    public final C22093D0 f70332x0;

    /* JADX INFO: renamed from: y0 */
    public final StepStyles.GovernmentIdStepStyle f70333y0;

    /* JADX INFO: renamed from: z0 */
    public final UiComponentConfig.RemoteImage f70334z0;

    public C22194t(List captureOptions, String str, String str2, String cameraText, String uploadButtonText, C17280a navigationState, C22095E0 c22095e0, C22093D0 c22093d0, C22097F0 c22097f0, C0519d c0519d, String str3, C22093D0 c22093d1, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, UiComponentConfig.RemoteImage remoteImage, int i10) {
        AbstractC16544l.m18094g(captureOptions, "captureOptions");
        AbstractC16544l.m18094g(cameraText, "cameraText");
        AbstractC16544l.m18094g(uploadButtonText, "uploadButtonText");
        AbstractC16544l.m18094g(navigationState, "navigationState");
        this.f70321Y = captureOptions;
        this.f70322Z = str;
        this.f70323o0 = str2;
        this.f70324p0 = cameraText;
        this.f70325q0 = uploadButtonText;
        this.f70326r0 = navigationState;
        this.f70327s0 = c22095e0;
        this.f70328t0 = c22093d0;
        this.f70329u0 = c22097f0;
        this.f70330v0 = c0519d;
        this.f70331w0 = str3;
        this.f70332x0 = c22093d1;
        this.f70333y0 = governmentIdStepStyle;
        this.f70334z0 = remoteImage;
        this.f70318A0 = i10;
        this.f70320C0 = new C14182x(AbstractC16526C.f51263a.mo5693b(C22194t.class), C22182p.f70248Y, new C22191s(this));
    }

    @Override // p769gj.InterfaceC14161c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14147A mo1134a() {
        return this.f70320C0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22194t)) {
            return false;
        }
        C22194t c22194t = (C22194t) obj;
        return AbstractC16544l.m18089b(this.f70321Y, c22194t.f70321Y) && this.f70322Z.equals(c22194t.f70322Z) && this.f70323o0.equals(c22194t.f70323o0) && AbstractC16544l.m18089b(this.f70324p0, c22194t.f70324p0) && AbstractC16544l.m18089b(this.f70325q0, c22194t.f70325q0) && AbstractC16544l.m18089b(this.f70326r0, c22194t.f70326r0) && this.f70327s0.equals(c22194t.f70327s0) && this.f70328t0.equals(c22194t.f70328t0) && this.f70329u0.equals(c22194t.f70329u0) && this.f70330v0.equals(c22194t.f70330v0) && AbstractC16544l.m18089b(this.f70331w0, c22194t.f70331w0) && this.f70332x0.equals(c22194t.f70332x0) && AbstractC16544l.m18089b(this.f70333y0, c22194t.f70333y0) && AbstractC16544l.m18089b(this.f70334z0, c22194t.f70334z0) && this.f70318A0 == c22194t.f70318A0;
    }

    public final int hashCode() {
        int iHashCode = (this.f70330v0.hashCode() + ((this.f70329u0.hashCode() + ((this.f70328t0.hashCode() + ((this.f70327s0.hashCode() + ((this.f70326r0.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f70321Y.hashCode() * 31, 31, this.f70322Z), 31, this.f70323o0), 31, this.f70324p0), 31, this.f70325q0)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f70331w0;
        int iHashCode2 = (this.f70332x0.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.f70333y0;
        int iHashCode3 = (iHashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
        UiComponentConfig.RemoteImage remoteImage = this.f70334z0;
        return ((iHashCode3 + (remoteImage != null ? remoteImage.hashCode() : 0)) * 31) + this.f70318A0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChooseCaptureMethodView(captureOptions=");
        sb2.append(this.f70321Y);
        sb2.append(", title=");
        sb2.append(this.f70322Z);
        sb2.append(", body=");
        sb2.append(this.f70323o0);
        sb2.append(", cameraText=");
        sb2.append(this.f70324p0);
        sb2.append(", uploadButtonText=");
        sb2.append(this.f70325q0);
        sb2.append(", navigationState=");
        sb2.append(this.f70326r0);
        sb2.append(", onCameraCaptureClick=");
        sb2.append(this.f70327s0);
        sb2.append(", onUploadClick=");
        sb2.append(this.f70328t0);
        sb2.append(", onBack=");
        sb2.append(this.f70329u0);
        sb2.append(", onCancel=");
        sb2.append(this.f70330v0);
        sb2.append(", error=");
        sb2.append(this.f70331w0);
        sb2.append(", onErrorDismissed=");
        sb2.append(this.f70332x0);
        sb2.append(", styles=");
        sb2.append(this.f70333y0);
        sb2.append(", pictographAsset=");
        sb2.append(this.f70334z0);
        sb2.append(", localAsset=");
        return AbstractC10763a.m11056n(sb2, this.f70318A0, Separators.RPAREN);
    }
}
