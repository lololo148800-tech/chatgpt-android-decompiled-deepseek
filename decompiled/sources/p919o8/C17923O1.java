package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.O1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17923O1 {

    /* JADX INFO: renamed from: a */
    public final Long f57133a;

    /* JADX INFO: renamed from: b */
    public final Long f57134b;

    /* JADX INFO: renamed from: c */
    public final Long f57135c;

    public C17923O1(Long l4, Long l10, Long l11) {
        this.f57133a = l4;
        this.f57134b = l10;
        this.f57135c = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17923O1)) {
            return false;
        }
        C17923O1 c17923o1 = (C17923O1) obj;
        return AbstractC16544l.m18089b(this.f57133a, c17923o1.f57133a) && AbstractC16544l.m18089b(this.f57134b, c17923o1.f57134b) && AbstractC16544l.m18089b(this.f57135c, c17923o1.f57135c);
    }

    public final int hashCode() {
        Long l4 = this.f57133a;
        int iHashCode = (l4 == null ? 0 : l4.hashCode()) * 31;
        Long l10 = this.f57134b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f57135c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayStats(recordsCount=" + this.f57133a + ", segmentsCount=" + this.f57134b + ", segmentsTotalRawSize=" + this.f57135c + Separators.RPAREN;
    }
}
