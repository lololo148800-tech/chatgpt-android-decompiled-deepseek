package p247Jj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Jj.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4445n0 implements InterfaceC4447o0 {

    /* JADX INFO: renamed from: a */
    public final String f14470a;

    /* JADX INFO: renamed from: b */
    public final String f14471b;

    /* JADX INFO: renamed from: c */
    public final String f14472c;

    /* JADX INFO: renamed from: d */
    public final String f14473d;

    /* JADX INFO: renamed from: e */
    public final String f14474e;

    /* JADX INFO: renamed from: f */
    public final Map f14475f;

    /* JADX INFO: renamed from: g */
    public final String f14476g;

    /* JADX INFO: renamed from: h */
    public final StaticInquiryTemplate f14477h;

    /* JADX INFO: renamed from: i */
    public final boolean f14478i;

    /* JADX INFO: renamed from: j */
    public final EnumC4458u f14479j;

    /* JADX INFO: renamed from: k */
    public final Integer f14480k;

    /* JADX INFO: renamed from: l */
    public final boolean f14481l = false;

    public C4445n0(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, boolean z6, EnumC4458u enumC4458u, Integer num) {
        this.f14470a = str;
        this.f14471b = str2;
        this.f14472c = str3;
        this.f14473d = str4;
        this.f14474e = str5;
        this.f14475f = map;
        this.f14476g = str6;
        this.f14477h = staticInquiryTemplate;
        this.f14478i = z6;
        this.f14479j = enumC4458u;
        this.f14480k = num;
    }

    @Override // p247Jj.InterfaceC4447o0
    /* JADX INFO: renamed from: a */
    public final EnumC4458u mo5202a() {
        return this.f14479j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4445n0)) {
            return false;
        }
        C4445n0 c4445n0 = (C4445n0) obj;
        return AbstractC16544l.m18089b(this.f14470a, c4445n0.f14470a) && AbstractC16544l.m18089b(this.f14471b, c4445n0.f14471b) && AbstractC16544l.m18089b(this.f14472c, c4445n0.f14472c) && AbstractC16544l.m18089b(this.f14473d, c4445n0.f14473d) && AbstractC16544l.m18089b(this.f14474e, c4445n0.f14474e) && AbstractC16544l.m18089b(this.f14475f, c4445n0.f14475f) && AbstractC16544l.m18089b(this.f14476g, c4445n0.f14476g) && AbstractC16544l.m18089b(this.f14477h, c4445n0.f14477h) && this.f14478i == c4445n0.f14478i && this.f14479j == c4445n0.f14479j && AbstractC16544l.m18089b(this.f14480k, c4445n0.f14480k) && this.f14481l == c4445n0.f14481l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final int hashCode() {
        String str = this.f14470a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14471b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14472c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14473d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14474e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.f14475f;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.f14476g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        StaticInquiryTemplate staticInquiryTemplate = this.f14477h;
        int iHashCode8 = (iHashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31;
        boolean z6 = this.f14478i;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int iHashCode9 = (this.f14479j.hashCode() + ((iHashCode8 + r6) * 31)) * 31;
        Integer num = this.f14480k;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z10 = this.f14481l;
        return iHashCode10 + (z10 ? 1 : z10);
    }

    @Override // p247Jj.InterfaceC4447o0
    public final boolean isCancelled() {
        return this.f14481l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TemplateProps(templateId=");
        sb2.append(this.f14470a);
        sb2.append(", templateVersion=");
        sb2.append(this.f14471b);
        sb2.append(", accountId=");
        sb2.append(this.f14472c);
        sb2.append(", referenceId=");
        sb2.append(this.f14473d);
        sb2.append(", environmentId=");
        sb2.append(this.f14474e);
        sb2.append(", fields=");
        sb2.append(this.f14475f);
        sb2.append(", themeSetId=");
        sb2.append(this.f14476g);
        sb2.append(", staticInquiryTemplate=");
        sb2.append(this.f14477h);
        sb2.append(", shouldAutoFallback=");
        sb2.append(this.f14478i);
        sb2.append(", environment=");
        sb2.append(this.f14479j);
        sb2.append(ahZQMZ.VdNlQIU);
        sb2.append(this.f14480k);
        sb2.append(", isCancelled=");
        return AbstractC14376f.m15823B(sb2, this.f14481l, Separators.RPAREN);
    }
}
