package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17978i0 {

    /* JADX INFO: renamed from: e */
    public static final String[] f57385e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f57386a;

    /* JADX INFO: renamed from: b */
    public final String f57387b;

    /* JADX INFO: renamed from: c */
    public final String f57388c;

    /* JADX INFO: renamed from: d */
    public final Map f57389d;

    public C17978i0(String str, String str2, String str3, Map map) {
        this.f57386a = str;
        this.f57387b = str2;
        this.f57388c = str3;
        this.f57389d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17978i0)) {
            return false;
        }
        C17978i0 c17978i0 = (C17978i0) obj;
        return AbstractC16544l.m18089b(this.f57386a, c17978i0.f57386a) && AbstractC16544l.m18089b(this.f57387b, c17978i0.f57387b) && AbstractC16544l.m18089b(this.f57388c, c17978i0.f57388c) && AbstractC16544l.m18089b(this.f57389d, c17978i0.f57389d);
    }

    public final int hashCode() {
        String str = this.f57386a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57387b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57388c;
        return this.f57389d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f57386a + ", name=" + this.f57387b + ", email=" + this.f57388c + ", additionalProperties=" + this.f57389d + Separators.RPAREN;
    }
}
