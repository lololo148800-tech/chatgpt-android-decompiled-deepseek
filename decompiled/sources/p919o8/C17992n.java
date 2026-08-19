package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.n */
/* JADX INFO: loaded from: classes.dex */
public final class C17992n {

    /* JADX INFO: renamed from: a */
    public final long f57440a;

    public C17992n(long j10) {
        this.f57440a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17992n) && this.f57440a == ((C17992n) obj).f57440a;
    }

    public final int hashCode() {
        long j10 = this.f57440a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57440a, Separators.RPAREN, new StringBuilder("Crash(count="));
    }
}
