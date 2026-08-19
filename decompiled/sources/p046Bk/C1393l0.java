package p046Bk;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import p003A1.AbstractC0168G;
import p138F8.vJO.anhfj;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Bk.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1393l0 {

    /* JADX INFO: renamed from: a */
    public final String f3707a;

    /* JADX INFO: renamed from: b */
    public final String f3708b;

    /* JADX INFO: renamed from: c */
    public final List f3709c;

    /* JADX INFO: renamed from: d */
    public final String f3710d;

    /* JADX INFO: renamed from: e */
    public final boolean f3711e;

    /* JADX INFO: renamed from: f */
    public final boolean f3712f;

    /* JADX INFO: renamed from: g */
    public final boolean f3713g;

    /* JADX INFO: renamed from: h */
    public final C17062e f3714h;

    /* JADX INFO: renamed from: i */
    public final String f3715i;

    /* JADX INFO: renamed from: j */
    public final String f3716j;

    /* JADX INFO: renamed from: k */
    public final String f3717k;

    /* JADX INFO: renamed from: l */
    public final String f3718l;

    /* JADX INFO: renamed from: m */
    public final String f3719m;

    /* JADX INFO: renamed from: n */
    public final String f3720n;

    /* JADX INFO: renamed from: o */
    public final String f3721o;

    /* JADX INFO: renamed from: p */
    public final StepStyles.UiStepStyle f3722p;

    /* JADX INFO: renamed from: q */
    public final List f3723q;

    public C1393l0(String sessionToken, String inquiryId, List components, String stepName, boolean z6, boolean z10, boolean z11, C17062e inquirySessionConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, StepStyles.UiStepStyle uiStepStyle, List list) {
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(components, "components");
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
        this.f3707a = sessionToken;
        this.f3708b = inquiryId;
        this.f3709c = components;
        this.f3710d = stepName;
        this.f3711e = z6;
        this.f3712f = z10;
        this.f3713g = z11;
        this.f3714h = inquirySessionConfig;
        this.f3715i = str;
        this.f3716j = str2;
        this.f3717k = str3;
        this.f3718l = str4;
        this.f3719m = str5;
        this.f3720n = str6;
        this.f3721o = str7;
        this.f3722p = uiStepStyle;
        this.f3723q = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1393l0)) {
            return false;
        }
        C1393l0 c1393l0 = (C1393l0) obj;
        return AbstractC16544l.m18089b(this.f3707a, c1393l0.f3707a) && AbstractC16544l.m18089b(this.f3708b, c1393l0.f3708b) && AbstractC16544l.m18089b(this.f3709c, c1393l0.f3709c) && AbstractC16544l.m18089b(this.f3710d, c1393l0.f3710d) && this.f3711e == c1393l0.f3711e && this.f3712f == c1393l0.f3712f && this.f3713g == c1393l0.f3713g && AbstractC16544l.m18089b(this.f3714h, c1393l0.f3714h) && AbstractC16544l.m18089b(this.f3715i, c1393l0.f3715i) && AbstractC16544l.m18089b(this.f3716j, c1393l0.f3716j) && AbstractC16544l.m18089b(this.f3717k, c1393l0.f3717k) && AbstractC16544l.m18089b(this.f3718l, c1393l0.f3718l) && AbstractC16544l.m18089b(this.f3719m, c1393l0.f3719m) && AbstractC16544l.m18089b(this.f3720n, c1393l0.f3720n) && AbstractC16544l.m18089b(this.f3721o, c1393l0.f3721o) && AbstractC16544l.m18089b(this.f3722p, c1393l0.f3722p) && AbstractC16544l.m18089b(this.f3723q, c1393l0.f3723q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC14376f.m15858x(this.f3709c, AbstractC0168G.m527p(this.f3707a.hashCode() * 31, 31, this.f3708b), 31), 31, this.f3710d);
        boolean z6 = this.f3711e;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iM527p + r6) * 31;
        boolean z10 = this.f3712f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f3713g;
        int iHashCode = (this.f3714h.hashCode() + ((i11 + (z11 ? 1 : z11)) * 31)) * 31;
        String str = this.f3715i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3716j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3717k;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3718l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3719m;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f3720n;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f3721o;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.f3722p;
        int iHashCode9 = (iHashCode8 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
        List list = this.f3723q;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Input(sessionToken=" + this.f3707a + ", inquiryId=" + this.f3708b + ", components=" + this.f3709c + ", stepName=" + this.f3710d + ", backStepEnabled=" + this.f3711e + ", cancelButtonEnabled=" + this.f3712f + ", finalStep=" + this.f3713g + ", inquirySessionConfig=" + this.f3714h + anhfj.CbbLDBwLedRNT + this.f3715i + ", gpsPermissionsRationale=" + this.f3716j + ", gpsPermissionsModalPositiveButton=" + this.f3717k + ", gpsPermissionsModalNegativeButton=" + this.f3718l + ", gpsFeatureTitle=" + this.f3719m + ", gpsFeatureRationale=" + this.f3720n + ", gpsFeatureModalPositiveButton=" + this.f3721o + ", styles=" + this.f3722p + ", serverComponentErrors=" + this.f3723q + Separators.RPAREN;
    }
}
