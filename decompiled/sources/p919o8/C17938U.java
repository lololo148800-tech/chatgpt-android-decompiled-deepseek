package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: o8.U */
/* JADX INFO: loaded from: classes.dex */
public final class C17938U {

    /* JADX INFO: renamed from: a */
    public final EnumC17963d0 f57174a;

    /* JADX INFO: renamed from: b */
    public final int f57175b;

    public /* synthetic */ C17938U(int i10, int i11) {
        this((EnumC17963d0) null, (i11 & 2) != 0 ? 0 : i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17938U)) {
            return false;
        }
        C17938U c17938u = (C17938U) obj;
        return this.f57174a == c17938u.f57174a && this.f57175b == c17938u.f57175b;
    }

    public final int hashCode() {
        EnumC17963d0 enumC17963d0 = this.f57174a;
        int iHashCode = (enumC17963d0 == null ? 0 : enumC17963d0.hashCode()) * 31;
        int i10 = this.f57175b;
        return iHashCode + (i10 != 0 ? AbstractC0010F.m24h(i10) : 0);
    }

    public final String toString() {
        return "DdSession(plan=" + this.f57174a + ", sessionPrecondition=" + AbstractC17962d.m19620K(this.f57175b) + Separators.RPAREN;
    }

    public C17938U(EnumC17963d0 enumC17963d0, int i10) {
        this.f57174a = enumC17963d0;
        this.f57175b = i10;
    }
}
