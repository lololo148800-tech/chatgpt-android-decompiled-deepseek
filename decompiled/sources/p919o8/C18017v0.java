package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: o8.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18017v0 {

    /* JADX INFO: renamed from: a */
    public final EnumC17889D0 f57512a;

    /* JADX INFO: renamed from: b */
    public final int f57513b;

    public C18017v0(EnumC17889D0 enumC17889D0, int i10) {
        this.f57512a = enumC17889D0;
        this.f57513b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18017v0)) {
            return false;
        }
        C18017v0 c18017v0 = (C18017v0) obj;
        return this.f57512a == c18017v0.f57512a && this.f57513b == c18017v0.f57513b;
    }

    public final int hashCode() {
        EnumC17889D0 enumC17889D0 = this.f57512a;
        int iHashCode = (enumC17889D0 == null ? 0 : enumC17889D0.hashCode()) * 31;
        int i10 = this.f57513b;
        return iHashCode + (i10 != 0 ? AbstractC0010F.m24h(i10) : 0);
    }

    public final String toString() {
        return "DdSession(plan=" + this.f57512a + ", sessionPrecondition=" + AbstractC17962d.m19626Q(this.f57513b) + Separators.RPAREN;
    }
}
