package p422R7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: R7.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6824i {

    /* JADX INFO: renamed from: e */
    public static final String[] f21889e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f21890a;

    /* JADX INFO: renamed from: b */
    public final String f21891b;

    /* JADX INFO: renamed from: c */
    public final String f21892c;

    /* JADX INFO: renamed from: d */
    public final Map f21893d;

    public C6824i(String str, String str2, String str3, Map map) {
        this.f21890a = str;
        this.f21891b = str2;
        this.f21892c = str3;
        this.f21893d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6824i)) {
            return false;
        }
        C6824i c6824i = (C6824i) obj;
        return AbstractC16544l.m18089b(this.f21890a, c6824i.f21890a) && AbstractC16544l.m18089b(this.f21891b, c6824i.f21891b) && AbstractC16544l.m18089b(this.f21892c, c6824i.f21892c) && AbstractC16544l.m18089b(this.f21893d, c6824i.f21893d);
    }

    public final int hashCode() {
        String str = this.f21890a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21891b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21892c;
        return this.f21893d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f21890a + ", name=" + this.f21891b + ", email=" + this.f21892c + ", additionalProperties=" + this.f21893d + Separators.RPAREN;
    }
}
