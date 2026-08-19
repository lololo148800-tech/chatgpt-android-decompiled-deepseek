package p010A8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: A8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0407j {

    /* JADX INFO: renamed from: e */
    public static final String[] f1349e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f1350a;

    /* JADX INFO: renamed from: b */
    public final String f1351b;

    /* JADX INFO: renamed from: c */
    public final String f1352c;

    /* JADX INFO: renamed from: d */
    public final Map f1353d;

    public C0407j(String str, String str2, String str3, Map map) {
        this.f1350a = str;
        this.f1351b = str2;
        this.f1352c = str3;
        this.f1353d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0407j)) {
            return false;
        }
        C0407j c0407j = (C0407j) obj;
        return AbstractC16544l.m18089b(this.f1350a, c0407j.f1350a) && AbstractC16544l.m18089b(this.f1351b, c0407j.f1351b) && AbstractC16544l.m18089b(this.f1352c, c0407j.f1352c) && AbstractC16544l.m18089b(this.f1353d, c0407j.f1353d);
    }

    public final int hashCode() {
        String str = this.f1350a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1351b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1352c;
        return this.f1353d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f1350a + ", name=" + this.f1351b + ", email=" + this.f1352c + ", additionalProperties=" + this.f1353d + Separators.RPAREN;
    }
}
