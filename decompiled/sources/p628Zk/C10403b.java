package p628Zk;

import kotlin.jvm.internal.AbstractC16544l;
import p857kl.C16464l;

/* JADX INFO: renamed from: Zk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10403b {

    /* JADX INFO: renamed from: a */
    public final C16464l f30827a;

    /* JADX INFO: renamed from: b */
    public final long f30828b;

    public C10403b(C16464l c16464l, long j10) {
        this.f30827a = c16464l;
        this.f30828b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10403b)) {
            return false;
        }
        C10403b c10403b = (C10403b) obj;
        return AbstractC16544l.m18089b(this.f30827a, c10403b.f30827a) && this.f30828b == c10403b.f30828b;
    }

    public final int hashCode() {
        int iHashCode = this.f30827a.hashCode() * 31;
        long j10 = this.f30828b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "CookieWithTimestamp(cookie=" + this.f30827a + ", createdAt=" + this.f30828b + ')';
    }
}
