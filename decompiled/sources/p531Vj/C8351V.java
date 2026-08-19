package p531Vj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Vj.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8351V {

    /* JADX INFO: renamed from: a */
    public final EnumC8334D f26006a;

    /* JADX INFO: renamed from: b */
    public final boolean f26007b;

    /* JADX INFO: renamed from: c */
    public final String f26008c;

    /* JADX INFO: renamed from: d */
    public final String f26009d;

    /* JADX INFO: renamed from: e */
    public final String f26010e;

    /* JADX INFO: renamed from: f */
    public final String f26011f;

    /* JADX INFO: renamed from: g */
    public final String f26012g;

    /* JADX INFO: renamed from: h */
    public final String f26013h;

    /* JADX INFO: renamed from: i */
    public final String f26014i;

    /* JADX INFO: renamed from: j */
    public final String f26015j;

    /* JADX INFO: renamed from: k */
    public final StepStyle f26016k;

    public C8351V(EnumC8334D enumC8334D, boolean z6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyle stepStyle) {
        this.f26006a = enumC8334D;
        this.f26007b = z6;
        this.f26008c = str;
        this.f26009d = str2;
        this.f26010e = str3;
        this.f26011f = str4;
        this.f26012g = str5;
        this.f26013h = str6;
        this.f26014i = str7;
        this.f26015j = str8;
        this.f26016k = stepStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8351V)) {
            return false;
        }
        C8351V c8351v = (C8351V) obj;
        return this.f26006a == c8351v.f26006a && this.f26007b == c8351v.f26007b && AbstractC16544l.m18089b(this.f26008c, c8351v.f26008c) && AbstractC16544l.m18089b(this.f26009d, c8351v.f26009d) && AbstractC16544l.m18089b(this.f26010e, c8351v.f26010e) && AbstractC16544l.m18089b(this.f26011f, c8351v.f26011f) && AbstractC16544l.m18089b(this.f26012g, c8351v.f26012g) && AbstractC16544l.m18089b(this.f26013h, c8351v.f26013h) && AbstractC16544l.m18089b(this.f26014i, c8351v.f26014i) && AbstractC16544l.m18089b(this.f26015j, c8351v.f26015j) && AbstractC16544l.m18089b(this.f26016k, c8351v.f26016k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        int iHashCode = this.f26006a.hashCode() * 31;
        boolean z6 = this.f26007b;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode + r6) * 31, 31, this.f26008c), 31, this.f26009d), 31, this.f26010e);
        String str = this.f26011f;
        int iHashCode2 = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26012g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26013h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26014i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26015j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StepStyle stepStyle = this.f26016k;
        return iHashCode6 + (stepStyle != null ? stepStyle.hashCode() : 0);
    }

    public final String toString() {
        return "Props(permission=" + this.f26006a + ", optional=" + this.f26007b + ", title=" + this.f26008c + ", rationale=" + this.f26009d + ", rationaleWhenPermanentlyDenied=" + this.f26010e + ", positiveButtonText=" + this.f26011f + ", negativeButtonText=" + this.f26012g + ", gpsFeatureTitle=" + this.f26013h + ", gpsFeatureRationale=" + this.f26014i + ", gpsFeatureModalNegativeButton=" + this.f26015j + ", styles=" + this.f26016k + Separators.RPAREN;
    }
}
