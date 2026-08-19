package tc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: tc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19837b {

    /* JADX INFO: renamed from: a */
    public final long f62906a;

    /* JADX INFO: renamed from: b */
    public final Long f62907b;

    public C19837b(long j10, Long l4) {
        this.f62906a = j10;
        this.f62907b = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19837b)) {
            return false;
        }
        C19837b c19837b = (C19837b) obj;
        return this.f62906a == c19837b.f62906a && AbstractC16544l.m18089b(this.f62907b, c19837b.f62907b);
    }

    public final int hashCode() {
        long j10 = this.f62906a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        Long l4 = this.f62907b;
        return i10 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        return "KronosTime(posixTimeMs=" + this.f62906a + ", timeSinceLastNtpSyncMs=" + this.f62907b + Separators.RPAREN;
    }
}
