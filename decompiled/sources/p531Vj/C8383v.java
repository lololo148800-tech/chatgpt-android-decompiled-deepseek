package p531Vj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C8383v {

    /* JADX INFO: renamed from: a */
    public final EnumC8332B f26083a;

    /* JADX INFO: renamed from: b */
    public final String f26084b;

    /* JADX INFO: renamed from: c */
    public final String f26085c;

    /* JADX INFO: renamed from: d */
    public final String f26086d;

    /* JADX INFO: renamed from: e */
    public final String f26087e;

    /* JADX INFO: renamed from: f */
    public final StepStyle f26088f;

    public C8383v(EnumC8332B enumC8332B, String str, String str2, String str3, String str4, StepStyle stepStyle) {
        this.f26083a = enumC8332B;
        this.f26084b = str;
        this.f26085c = str2;
        this.f26086d = str3;
        this.f26087e = str4;
        this.f26088f = stepStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8383v)) {
            return false;
        }
        C8383v c8383v = (C8383v) obj;
        return this.f26083a == c8383v.f26083a && AbstractC16544l.m18089b(this.f26084b, c8383v.f26084b) && AbstractC16544l.m18089b(this.f26085c, c8383v.f26085c) && AbstractC16544l.m18089b(this.f26086d, c8383v.f26086d) && AbstractC16544l.m18089b(this.f26087e, c8383v.f26087e) && AbstractC16544l.m18089b(this.f26088f, c8383v.f26088f);
    }

    public final int hashCode() {
        int iHashCode = this.f26083a.hashCode() * 31;
        String str = this.f26084b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26085c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26086d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26087e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StepStyle stepStyle = this.f26088f;
        return iHashCode5 + (stepStyle != null ? stepStyle.hashCode() : 0);
    }

    public final String toString() {
        return "Props(feature=" + this.f26083a + ", requestFeatureTitle=" + this.f26084b + ", requestFeatureRationale=" + this.f26085c + ", requestFeatureModalPositiveButton=" + this.f26086d + ", requestFeatureModalNegativeButton=" + this.f26087e + ", styles=" + this.f26088f + Separators.RPAREN;
    }
}
