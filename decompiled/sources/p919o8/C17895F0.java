package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17895F0 {

    /* JADX INFO: renamed from: e */
    public static final String[] f57029e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f57030a;

    /* JADX INFO: renamed from: b */
    public final String f57031b;

    /* JADX INFO: renamed from: c */
    public final String f57032c;

    /* JADX INFO: renamed from: d */
    public final Map f57033d;

    public C17895F0(String str, String str2, String str3, Map map) {
        this.f57030a = str;
        this.f57031b = str2;
        this.f57032c = str3;
        this.f57033d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17895F0)) {
            return false;
        }
        C17895F0 c17895f0 = (C17895F0) obj;
        return AbstractC16544l.m18089b(this.f57030a, c17895f0.f57030a) && AbstractC16544l.m18089b(this.f57031b, c17895f0.f57031b) && AbstractC16544l.m18089b(this.f57032c, c17895f0.f57032c) && AbstractC16544l.m18089b(this.f57033d, c17895f0.f57033d);
    }

    public final int hashCode() {
        String str = this.f57030a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57031b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57032c;
        return this.f57033d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f57030a + ", name=" + this.f57031b + ", email=" + this.f57032c + ", additionalProperties=" + this.f57033d + Separators.RPAREN;
    }
}
