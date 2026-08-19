package p1156zj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p003A1.AbstractC0168G;
import p021Aj.C0519d;
import p769gj.C14182x;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14161c;
import p775h2.AbstractC14376f;
import p864l5.InterfaceC16818e;

/* JADX INFO: renamed from: zj.i1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22163i1 implements InterfaceC14161c {

    /* JADX INFO: renamed from: A0 */
    public final C22093D0 f70090A0;

    /* JADX INFO: renamed from: B0 */
    public final StepStyles.GovernmentIdStepStyle f70091B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f70092C0;

    /* JADX INFO: renamed from: D0 */
    public final C14182x f70093D0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC16818e f70094Y;

    /* JADX INFO: renamed from: Z */
    public final String f70095Z;

    /* JADX INFO: renamed from: o0 */
    public final String f70096o0;

    /* JADX INFO: renamed from: p0 */
    public final String f70097p0;

    /* JADX INFO: renamed from: q0 */
    public final String f70098q0;

    /* JADX INFO: renamed from: r0 */
    public final String f70099r0;

    /* JADX INFO: renamed from: s0 */
    public final String f70100s0;

    /* JADX INFO: renamed from: t0 */
    public final String f70101t0;

    /* JADX INFO: renamed from: u0 */
    public final C17280a f70102u0;

    /* JADX INFO: renamed from: v0 */
    public final C22095E0 f70103v0;

    /* JADX INFO: renamed from: w0 */
    public final C22097F0 f70104w0;

    /* JADX INFO: renamed from: x0 */
    public final C22097F0 f70105x0;

    /* JADX INFO: renamed from: y0 */
    public final C0519d f70106y0;

    /* JADX INFO: renamed from: z0 */
    public final String f70107z0;

    public C22163i1(InterfaceC16818e imageLoader, String str, String str2, String confirmButtonText, String chooseNewPhotoText, String fileToReviewPath, String fileMimeType, String str3, C17280a navigationState, C22095E0 c22095e0, C22097F0 c22097f0, C22097F0 c22097f1, C0519d c0519d, String str4, C22093D0 c22093d0, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z6) {
        AbstractC16544l.m18094g(imageLoader, "imageLoader");
        AbstractC16544l.m18094g(confirmButtonText, "confirmButtonText");
        AbstractC16544l.m18094g(chooseNewPhotoText, "chooseNewPhotoText");
        AbstractC16544l.m18094g(fileToReviewPath, "fileToReviewPath");
        AbstractC16544l.m18094g(fileMimeType, "fileMimeType");
        AbstractC16544l.m18094g(navigationState, "navigationState");
        this.f70094Y = imageLoader;
        this.f70095Z = str;
        this.f70096o0 = str2;
        this.f70097p0 = confirmButtonText;
        this.f70098q0 = chooseNewPhotoText;
        this.f70099r0 = fileToReviewPath;
        this.f70100s0 = fileMimeType;
        this.f70101t0 = str3;
        this.f70102u0 = navigationState;
        this.f70103v0 = c22095e0;
        this.f70104w0 = c22097f0;
        this.f70105x0 = c22097f1;
        this.f70106y0 = c0519d;
        this.f70107z0 = str4;
        this.f70090A0 = c22093d0;
        this.f70091B0 = governmentIdStepStyle;
        this.f70092C0 = z6;
        this.f70093D0 = new C14182x(AbstractC16526C.f51263a.mo5693b(C22163i1.class), C22151e1.f70032Y, new C22160h1(this));
    }

    @Override // p769gj.InterfaceC14161c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14147A mo1134a() {
        return this.f70093D0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22163i1)) {
            return false;
        }
        C22163i1 c22163i1 = (C22163i1) obj;
        return AbstractC16544l.m18089b(this.f70094Y, c22163i1.f70094Y) && this.f70095Z.equals(c22163i1.f70095Z) && this.f70096o0.equals(c22163i1.f70096o0) && AbstractC16544l.m18089b(this.f70097p0, c22163i1.f70097p0) && AbstractC16544l.m18089b(this.f70098q0, c22163i1.f70098q0) && AbstractC16544l.m18089b(this.f70099r0, c22163i1.f70099r0) && AbstractC16544l.m18089b(this.f70100s0, c22163i1.f70100s0) && AbstractC16544l.m18089b(this.f70101t0, c22163i1.f70101t0) && AbstractC16544l.m18089b(this.f70102u0, c22163i1.f70102u0) && this.f70103v0.equals(c22163i1.f70103v0) && this.f70104w0.equals(c22163i1.f70104w0) && this.f70105x0.equals(c22163i1.f70105x0) && this.f70106y0.equals(c22163i1.f70106y0) && AbstractC16544l.m18089b(this.f70107z0, c22163i1.f70107z0) && this.f70090A0.equals(c22163i1.f70090A0) && AbstractC16544l.m18089b(this.f70091B0, c22163i1.f70091B0) && this.f70092C0 == c22163i1.f70092C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f70094Y.hashCode() * 31, 31, this.f70095Z), 31, this.f70096o0), 31, this.f70097p0), 31, this.f70098q0), 31, this.f70099r0), 31, this.f70100s0);
        String str = this.f70101t0;
        int iHashCode = (this.f70106y0.hashCode() + ((this.f70105x0.hashCode() + ((this.f70104w0.hashCode() + ((this.f70103v0.hashCode() + ((this.f70102u0.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f70107z0;
        int iHashCode2 = (this.f70090A0.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.f70091B0;
        int iHashCode3 = (iHashCode2 + (governmentIdStepStyle != null ? governmentIdStepStyle.hashCode() : 0)) * 31;
        boolean z6 = this.f70092C0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode3 + r6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReviewSelectedImageView(imageLoader=");
        sb2.append(this.f70094Y);
        sb2.append(", title=");
        sb2.append(this.f70095Z);
        sb2.append(", body=");
        sb2.append(this.f70096o0);
        sb2.append(", confirmButtonText=");
        sb2.append(this.f70097p0);
        sb2.append(", chooseNewPhotoText=");
        sb2.append(this.f70098q0);
        sb2.append(", fileToReviewPath=");
        sb2.append(this.f70099r0);
        sb2.append(", fileMimeType=");
        sb2.append(this.f70100s0);
        sb2.append(", fileName=");
        sb2.append(this.f70101t0);
        sb2.append(", navigationState=");
        sb2.append(this.f70102u0);
        sb2.append(", onUsePhotoClick=");
        sb2.append(this.f70103v0);
        sb2.append(", onChooseNewPhotoClick=");
        sb2.append(this.f70104w0);
        sb2.append(", onBack=");
        sb2.append(this.f70105x0);
        sb2.append(", onCancel=");
        sb2.append(this.f70106y0);
        sb2.append(", error=");
        sb2.append(this.f70107z0);
        sb2.append(", onErrorDismissed=");
        sb2.append(this.f70090A0);
        sb2.append(", styles=");
        sb2.append(this.f70091B0);
        sb2.append(", isAutoClassifying=");
        return AbstractC14376f.m15823B(sb2, this.f70092C0, Separators.RPAREN);
    }
}
