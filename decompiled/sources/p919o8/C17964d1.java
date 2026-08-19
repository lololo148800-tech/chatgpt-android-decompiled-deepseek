package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: o8.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17964d1 {

    /* JADX INFO: renamed from: a */
    public final String f57337a;

    /* JADX INFO: renamed from: b */
    public final String f57338b;

    /* JADX INFO: renamed from: c */
    public final int f57339c;

    public C17964d1(int i10, String str, String str2) {
        this.f57337a = str;
        this.f57338b = str2;
        this.f57339c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17964d1)) {
            return false;
        }
        C17964d1 c17964d1 = (C17964d1) obj;
        return AbstractC16544l.m18089b(this.f57337a, c17964d1.f57337a) && AbstractC16544l.m18089b(this.f57338b, c17964d1.f57338b) && this.f57339c == c17964d1.f57339c;
    }

    public final int hashCode() {
        String str = this.f57337a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57338b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i10 = this.f57339c;
        return iHashCode2 + (i10 != 0 ? AbstractC0010F.m24h(i10) : 0);
    }

    public final String toString() {
        return "Provider(domain=" + this.f57337a + ", name=" + this.f57338b + ", type=" + AbstractC17962d.m19632W(this.f57339c) + Separators.RPAREN;
    }
}
