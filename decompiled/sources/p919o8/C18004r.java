package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: o8.r */
/* JADX INFO: loaded from: classes.dex */
public final class C18004r {

    /* JADX INFO: renamed from: a */
    public final EnumC18028z f57484a;

    /* JADX INFO: renamed from: b */
    public final int f57485b;

    public C18004r(EnumC18028z enumC18028z, int i10) {
        this.f57484a = enumC18028z;
        this.f57485b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18004r)) {
            return false;
        }
        C18004r c18004r = (C18004r) obj;
        return this.f57484a == c18004r.f57484a && this.f57485b == c18004r.f57485b;
    }

    public final int hashCode() {
        EnumC18028z enumC18028z = this.f57484a;
        int iHashCode = (enumC18028z == null ? 0 : enumC18028z.hashCode()) * 31;
        int i10 = this.f57485b;
        return iHashCode + (i10 != 0 ? AbstractC0010F.m24h(i10) : 0);
    }

    public final String toString() {
        return "DdSession(plan=" + this.f57484a + ", sessionPrecondition=" + AbstractC17962d.m19635Z(this.f57485b) + Separators.RPAREN;
    }
}
