package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17934S1 {

    /* JADX INFO: renamed from: e */
    public static final String[] f57159e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f57160a;

    /* JADX INFO: renamed from: b */
    public final String f57161b;

    /* JADX INFO: renamed from: c */
    public final String f57162c;

    /* JADX INFO: renamed from: d */
    public final Map f57163d;

    public C17934S1(String str, String str2, String str3, Map map) {
        this.f57160a = str;
        this.f57161b = str2;
        this.f57162c = str3;
        this.f57163d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17934S1)) {
            return false;
        }
        C17934S1 c17934s1 = (C17934S1) obj;
        return AbstractC16544l.m18089b(this.f57160a, c17934s1.f57160a) && AbstractC16544l.m18089b(this.f57161b, c17934s1.f57161b) && AbstractC16544l.m18089b(this.f57162c, c17934s1.f57162c) && AbstractC16544l.m18089b(this.f57163d, c17934s1.f57163d);
    }

    public final int hashCode() {
        String str = this.f57160a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57161b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57162c;
        return this.f57163d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f57160a + ", name=" + this.f57161b + ", email=" + this.f57162c + ", additionalProperties=" + this.f57163d + Separators.RPAREN;
    }
}
