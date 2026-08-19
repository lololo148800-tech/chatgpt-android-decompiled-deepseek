package p943p7;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: p7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18303a {

    /* JADX INFO: renamed from: a */
    public final long f58424a;

    /* JADX INFO: renamed from: b */
    public final boolean f58425b;

    /* JADX INFO: renamed from: c */
    public final long f58426c;

    public C18303a(long j10, long j11, boolean z6) {
        this.f58424a = j10;
        this.f58425b = z6;
        this.f58426c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18303a)) {
            return false;
        }
        C18303a c18303a = (C18303a) obj;
        return this.f58424a == c18303a.f58424a && this.f58425b == c18303a.f58425b && this.f58426c == c18303a.f58426c;
    }

    public final int hashCode() {
        long j10 = this.f58424a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        int i11 = this.f58425b ? 1231 : 1237;
        long j11 = this.f58426c;
        return ((i10 + i11) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "BatchClosedMetadata(lastTimeWasUsedInMs=" + this.f58424a + ", forcedNew=" + this.f58425b + ", eventsCount=" + this.f58426c + Separators.RPAREN;
    }
}
