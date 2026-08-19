package p647ak;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p523V9.AbstractC8162p0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: ak.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10730t0 {

    /* JADX INFO: renamed from: a */
    public final String f31883a;

    /* JADX INFO: renamed from: b */
    public final String f31884b;

    /* JADX INFO: renamed from: c */
    public final String f31885c;

    /* JADX INFO: renamed from: d */
    public final String f31886d;

    /* JADX INFO: renamed from: e */
    public final boolean f31887e;

    /* JADX INFO: renamed from: f */
    public final boolean f31888f;

    /* JADX INFO: renamed from: g */
    public final String f31889g;

    /* JADX INFO: renamed from: h */
    public final boolean f31890h;

    /* JADX INFO: renamed from: i */
    public final boolean f31891i;

    /* JADX INFO: renamed from: j */
    public final C10728s0 f31892j;

    /* JADX INFO: renamed from: k */
    public final AbstractC8162p0 f31893k;

    /* JADX INFO: renamed from: l */
    public final List f31894l;

    /* JADX INFO: renamed from: m */
    public final String f31895m;

    /* JADX INFO: renamed from: n */
    public final String f31896n;

    /* JADX INFO: renamed from: o */
    public final String f31897o;

    /* JADX INFO: renamed from: p */
    public final String f31898p;

    /* JADX INFO: renamed from: q */
    public final String f31899q;

    /* JADX INFO: renamed from: r */
    public final String f31900r;

    /* JADX INFO: renamed from: s */
    public final String f31901s;

    /* JADX INFO: renamed from: t */
    public final String f31902t;

    /* JADX INFO: renamed from: u */
    public final StepStyles.SelfieStepStyle f31903u;

    /* JADX INFO: renamed from: v */
    public final VideoCaptureConfig f31904v;

    /* JADX INFO: renamed from: w */
    public final NextStep.Selfie.AssetConfig f31905w;

    /* JADX INFO: renamed from: x */
    public final PendingPageTextPosition f31906x;

    public C10730t0(String sessionToken, String inquiryId, String fromComponent, String fromStep, boolean z6, boolean z10, String fieldKeySelfie, boolean z11, boolean z12, C10728s0 c10728s0, AbstractC8162p0 abstractC8162p0, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyles.SelfieStepStyle selfieStepStyle, VideoCaptureConfig videoCaptureConfig, NextStep.Selfie.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextVerticalPosition) {
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fieldKeySelfie, "fieldKeySelfie");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f31883a = sessionToken;
        this.f31884b = inquiryId;
        this.f31885c = fromComponent;
        this.f31886d = fromStep;
        this.f31887e = z6;
        this.f31888f = z10;
        this.f31889g = fieldKeySelfie;
        this.f31890h = z11;
        this.f31891i = z12;
        this.f31892j = c10728s0;
        this.f31893k = abstractC8162p0;
        this.f31894l = list;
        this.f31895m = str;
        this.f31896n = str2;
        this.f31897o = str3;
        this.f31898p = str4;
        this.f31899q = str5;
        this.f31900r = str6;
        this.f31901s = str7;
        this.f31902t = str8;
        this.f31903u = selfieStepStyle;
        this.f31904v = videoCaptureConfig;
        this.f31905w = assetConfig;
        this.f31906x = pendingPageTextVerticalPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10730t0)) {
            return false;
        }
        C10730t0 c10730t0 = (C10730t0) obj;
        return AbstractC16544l.m18089b(this.f31883a, c10730t0.f31883a) && AbstractC16544l.m18089b(this.f31884b, c10730t0.f31884b) && AbstractC16544l.m18089b(this.f31885c, c10730t0.f31885c) && AbstractC16544l.m18089b(this.f31886d, c10730t0.f31886d) && this.f31887e == c10730t0.f31887e && this.f31888f == c10730t0.f31888f && AbstractC16544l.m18089b(this.f31889g, c10730t0.f31889g) && this.f31890h == c10730t0.f31890h && this.f31891i == c10730t0.f31891i && AbstractC16544l.m18089b(this.f31892j, c10730t0.f31892j) && AbstractC16544l.m18089b(this.f31893k, c10730t0.f31893k) && AbstractC16544l.m18089b(this.f31894l, c10730t0.f31894l) && AbstractC16544l.m18089b(this.f31895m, c10730t0.f31895m) && AbstractC16544l.m18089b(this.f31896n, c10730t0.f31896n) && AbstractC16544l.m18089b(this.f31897o, c10730t0.f31897o) && AbstractC16544l.m18089b(this.f31898p, c10730t0.f31898p) && AbstractC16544l.m18089b(this.f31899q, c10730t0.f31899q) && AbstractC16544l.m18089b(this.f31900r, c10730t0.f31900r) && AbstractC16544l.m18089b(this.f31901s, c10730t0.f31901s) && AbstractC16544l.m18089b(this.f31902t, c10730t0.f31902t) && AbstractC16544l.m18089b(this.f31903u, c10730t0.f31903u) && AbstractC16544l.m18089b(this.f31904v, c10730t0.f31904v) && AbstractC16544l.m18089b(this.f31905w, c10730t0.f31905w) && this.f31906x == c10730t0.f31906x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f31883a.hashCode() * 31, 31, this.f31884b), 31, this.f31885c), 31, this.f31886d);
        boolean z6 = this.f31887e;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iM527p + r6) * 31;
        boolean z10 = this.f31888f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM527p2 = AbstractC0168G.m527p((i10 + r10) * 31, 31, this.f31889g);
        boolean z11 = this.f31890h;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iM527p2 + r11) * 31;
        boolean z12 = this.f31891i;
        int iM15858x = AbstractC14376f.m15858x(this.f31894l, (this.f31893k.hashCode() + ((this.f31892j.hashCode() + ((i11 + (z12 ? 1 : z12)) * 31)) * 31)) * 31, 31);
        String str = this.f31895m;
        int iHashCode = (iM15858x + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f31896n;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31897o;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31898p;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f31899q;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f31900r;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f31901s;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f31902t;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        StepStyles.SelfieStepStyle selfieStepStyle = this.f31903u;
        return this.f31906x.hashCode() + ((this.f31905w.hashCode() + ((this.f31904v.hashCode() + ((iHashCode8 + (selfieStepStyle != null ? selfieStepStyle.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Input(sessionToken=" + this.f31883a + ", inquiryId=" + this.f31884b + ", fromComponent=" + this.f31885c + ", fromStep=" + this.f31886d + ", backStepEnabled=" + this.f31887e + ", cancelButtonEnabled=" + this.f31888f + ", fieldKeySelfie=" + this.f31889g + ", requireStrictSelfieCapture=" + this.f31890h + ", skipPromptPage=" + this.f31891i + ", strings=" + this.f31892j + ", selfieType=" + this.f31893k + ", orderedPoses=" + this.f31894l + ", cameraPermissionsTitle=" + this.f31895m + ", cameraPermissionsRationale=" + this.f31896n + ", cameraPermissionsModalPositiveButton=" + this.f31897o + ", cameraPermissionsModalNegativeButton=" + this.f31898p + ", microphonePermissionsTitle=" + this.f31899q + ", microphonePermissionsRationale=" + this.f31900r + ", microphonePermissionsModalPositiveButton=" + this.f31901s + ", microphonePermissionsModalNegativeButton=" + this.f31902t + ", styles=" + this.f31903u + ", videoCaptureConfig=" + this.f31904v + ", assetConfig=" + this.f31905w + ", pendingPageTextVerticalPosition=" + this.f31906x + Separators.RPAREN;
    }
}
