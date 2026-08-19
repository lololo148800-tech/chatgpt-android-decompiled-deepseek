package p988rc;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: rc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18916d {

    /* JADX INFO: renamed from: a */
    public final long f60358a;

    public C18916d(long j10) {
        this.f60358a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18916d) && this.f60358a == ((C18916d) obj).f60358a;
    }

    public final int hashCode() {
        long j10 = this.f60358a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f60358a, Separators.RPAREN, new StringBuilder("MarkdownAnimationState(lastAnimationStartMs="));
    }
}
