package p919o8;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p379Pb.LVf.efyhmdM;

/* JADX INFO: renamed from: o8.B */
/* JADX INFO: loaded from: classes.dex */
public final class C17882B {

    /* JADX INFO: renamed from: a */
    public final long f56990a;

    public C17882B(long j10) {
        this.f56990a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17882B) && this.f56990a == ((C17882B) obj).f56990a;
    }

    public final int hashCode() {
        long j10 = this.f56990a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f56990a, efyhmdM.hfIUawIAJX, new StringBuilder("Resource(count="));
    }
}
