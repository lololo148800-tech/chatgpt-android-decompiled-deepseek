package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: o8.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17966e0 {

    /* JADX INFO: renamed from: a */
    public final String f57345a;

    /* JADX INFO: renamed from: b */
    public final String f57346b;

    /* JADX INFO: renamed from: c */
    public final int f57347c;

    public C17966e0(int i10, String str, String str2) {
        this.f57345a = str;
        this.f57346b = str2;
        this.f57347c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17966e0)) {
            return false;
        }
        C17966e0 c17966e0 = (C17966e0) obj;
        return AbstractC16544l.m18089b(this.f57345a, c17966e0.f57345a) && AbstractC16544l.m18089b(this.f57346b, c17966e0.f57346b) && this.f57347c == c17966e0.f57347c;
    }

    public final int hashCode() {
        String str = this.f57345a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57346b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i10 = this.f57347c;
        return iHashCode2 + (i10 != 0 ? AbstractC0010F.m24h(i10) : 0);
    }

    public final String toString() {
        return "Provider(domain=" + this.f57345a + ", name=" + this.f57346b + ", type=" + AbstractC17962d.m19619J(this.f57347c) + Separators.RPAREN;
    }
}
