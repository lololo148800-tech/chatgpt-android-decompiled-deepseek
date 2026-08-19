package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17933S0 {

    /* JADX INFO: renamed from: a */
    public final C17936T0 f57152a;

    /* JADX INFO: renamed from: b */
    public final C17916M0 f57153b;

    /* JADX INFO: renamed from: c */
    public final String f57154c;

    /* JADX INFO: renamed from: d */
    public final String f57155d;

    /* JADX INFO: renamed from: e */
    public final String f57156e;

    /* JADX INFO: renamed from: f */
    public final Number f57157f;

    /* JADX INFO: renamed from: g */
    public final Boolean f57158g;

    public C17933S0(C17936T0 c17936t0, C17916M0 c17916m0, String str, String str2, String str3, Number number, Boolean bool) {
        this.f57152a = c17936t0;
        this.f57153b = c17916m0;
        this.f57154c = str;
        this.f57155d = str2;
        this.f57156e = str3;
        this.f57157f = number;
        this.f57158g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17933S0)) {
            return false;
        }
        C17933S0 c17933s0 = (C17933S0) obj;
        return AbstractC16544l.m18089b(this.f57152a, c17933s0.f57152a) && AbstractC16544l.m18089b(this.f57153b, c17933s0.f57153b) && AbstractC16544l.m18089b(this.f57154c, c17933s0.f57154c) && AbstractC16544l.m18089b(this.f57155d, c17933s0.f57155d) && AbstractC16544l.m18089b(this.f57156e, c17933s0.f57156e) && AbstractC16544l.m18089b(this.f57157f, c17933s0.f57157f) && AbstractC16544l.m18089b(this.f57158g, c17933s0.f57158g);
    }

    public final int hashCode() {
        C17936T0 c17936t0 = this.f57152a;
        int iHashCode = (c17936t0 == null ? 0 : c17936t0.hashCode()) * 31;
        C17916M0 c17916m0 = this.f57153b;
        int iHashCode2 = (iHashCode + (c17916m0 == null ? 0 : c17916m0.hashCode())) * 31;
        String str = this.f57154c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57155d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57156e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Number number = this.f57157f;
        int iHashCode6 = (iHashCode5 + (number == null ? 0 : number.hashCode())) * 31;
        Boolean bool = this.f57158g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Dd(session=" + this.f57152a + ", configuration=" + this.f57153b + ", browserSdkVersion=" + this.f57154c + ", spanId=" + this.f57155d + ", traceId=" + this.f57156e + ", rulePsr=" + this.f57157f + ", discarded=" + this.f57158g + Separators.RPAREN;
    }
}
