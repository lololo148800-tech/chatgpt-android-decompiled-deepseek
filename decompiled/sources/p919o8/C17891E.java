package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.E */
/* JADX INFO: loaded from: classes.dex */
public final class C17891E {

    /* JADX INFO: renamed from: e */
    public static final String[] f57015e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f57016a;

    /* JADX INFO: renamed from: b */
    public final String f57017b;

    /* JADX INFO: renamed from: c */
    public final String f57018c;

    /* JADX INFO: renamed from: d */
    public final Map f57019d;

    public C17891E(String str, String str2, String str3, Map map) {
        this.f57016a = str;
        this.f57017b = str2;
        this.f57018c = str3;
        this.f57019d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17891E)) {
            return false;
        }
        C17891E c17891e = (C17891E) obj;
        return AbstractC16544l.m18089b(this.f57016a, c17891e.f57016a) && AbstractC16544l.m18089b(this.f57017b, c17891e.f57017b) && AbstractC16544l.m18089b(this.f57018c, c17891e.f57018c) && AbstractC16544l.m18089b(this.f57019d, c17891e.f57019d);
    }

    public final int hashCode() {
        String str = this.f57016a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57017b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57018c;
        return this.f57019d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f57016a + ", name=" + this.f57017b + ", email=" + this.f57018c + ", additionalProperties=" + this.f57019d + Separators.RPAREN;
    }
}
