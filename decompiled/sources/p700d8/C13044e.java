package p700d8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: d8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13044e {

    /* JADX INFO: renamed from: a */
    public final String f41453a;

    /* JADX INFO: renamed from: b */
    public final long f41454b;

    public C13044e(long j10, String str) {
        this.f41453a = str;
        this.f41454b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13044e)) {
            return false;
        }
        C13044e c13044e = (C13044e) obj;
        return AbstractC16544l.m18089b(this.f41453a, c13044e.f41453a) && this.f41454b == c13044e.f41454b;
    }

    public final int hashCode() {
        int iHashCode = this.f41453a.hashCode() * 31;
        long j10 = this.f41454b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "View(viewId=" + this.f41453a + ", documentVersion=" + this.f41454b + Separators.RPAREN;
    }
}
