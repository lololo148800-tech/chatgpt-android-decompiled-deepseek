package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17988l1 {

    /* JADX INFO: renamed from: e */
    public static final String[] f57431e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f57432a;

    /* JADX INFO: renamed from: b */
    public final String f57433b;

    /* JADX INFO: renamed from: c */
    public final String f57434c;

    /* JADX INFO: renamed from: d */
    public final Map f57435d;

    public C17988l1(String str, String str2, String str3, Map map) {
        this.f57432a = str;
        this.f57433b = str2;
        this.f57434c = str3;
        this.f57435d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17988l1)) {
            return false;
        }
        C17988l1 c17988l1 = (C17988l1) obj;
        return AbstractC16544l.m18089b(this.f57432a, c17988l1.f57432a) && AbstractC16544l.m18089b(this.f57433b, c17988l1.f57433b) && AbstractC16544l.m18089b(this.f57434c, c17988l1.f57434c) && AbstractC16544l.m18089b(this.f57435d, c17988l1.f57435d);
    }

    public final int hashCode() {
        String str = this.f57432a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57433b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57434c;
        return this.f57435d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f57432a + ", name=" + this.f57433b + ", email=" + this.f57434c + ", additionalProperties=" + this.f57435d + Separators.RPAREN;
    }
}
