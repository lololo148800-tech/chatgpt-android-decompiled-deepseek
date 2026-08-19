package p676c7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p909nm.C17690x;

/* JADX INFO: renamed from: c7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C11688g {

    /* JADX INFO: renamed from: e */
    public static final String[] f35451e = {ParameterNames.f31999ID, DiagnosticsEntry.NAME_KEY, "email"};

    /* JADX INFO: renamed from: a */
    public final String f35452a;

    /* JADX INFO: renamed from: b */
    public final String f35453b;

    /* JADX INFO: renamed from: c */
    public final String f35454c;

    /* JADX INFO: renamed from: d */
    public final Map f35455d;

    public C11688g(String str, String str2, String str3, Map additionalProperties) {
        AbstractC16544l.m18094g(additionalProperties, "additionalProperties");
        this.f35452a = str;
        this.f35453b = str2;
        this.f35454c = str3;
        this.f35455d = additionalProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11688g)) {
            return false;
        }
        C11688g c11688g = (C11688g) obj;
        return AbstractC16544l.m18089b(this.f35452a, c11688g.f35452a) && AbstractC16544l.m18089b(this.f35453b, c11688g.f35453b) && AbstractC16544l.m18089b(this.f35454c, c11688g.f35454c) && AbstractC16544l.m18089b(this.f35455d, c11688g.f35455d);
    }

    public final int hashCode() {
        String str = this.f35452a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f35453b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35454c;
        return this.f35455d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UserInfo(id=" + this.f35452a + tpXhEMGxfXFVSh.qxmEUhEMgMrdi + this.f35453b + ", email=" + this.f35454c + ", additionalProperties=" + this.f35455d + Separators.RPAREN;
    }

    public /* synthetic */ C11688g() {
        this(null, null, null, C17690x.f56481Y);
    }
}
