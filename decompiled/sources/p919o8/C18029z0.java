package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18029z0 {

    /* JADX INFO: renamed from: a */
    public final String f57547a;

    /* JADX INFO: renamed from: b */
    public final long f57548b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57549c;

    public C18029z0(String str, long j10, Boolean bool) {
        this.f57547a = str;
        this.f57548b = j10;
        this.f57549c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18029z0)) {
            return false;
        }
        C18029z0 c18029z0 = (C18029z0) obj;
        return AbstractC16544l.m18089b(this.f57547a, c18029z0.f57547a) && this.f57548b == c18029z0.f57548b && AbstractC16544l.m18089b(this.f57549c, c18029z0.f57549c);
    }

    public final int hashCode() {
        String str = this.f57547a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f57548b;
        int i10 = ((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Boolean bool = this.f57549c;
        return i10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "LongTask(id=" + this.f57547a + ", duration=" + this.f57548b + ", isFrozenFrame=" + this.f57549c + Separators.RPAREN;
    }
}
