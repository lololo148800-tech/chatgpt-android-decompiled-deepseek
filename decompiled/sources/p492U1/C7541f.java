package p492U1;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: U1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7541f {

    /* JADX INFO: renamed from: a */
    public final long f23895a;

    /* JADX INFO: renamed from: a */
    public static String m7875a(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return Separators.LPAREN + ((Object) C7540e.m7874b(Float.intBitsToFloat((int) (j10 >> 32)))) + ", " + ((Object) C7540e.m7874b(Float.intBitsToFloat((int) (j10 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7541f) {
            return this.f23895a == ((C7541f) obj).f23895a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23895a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m7875a(this.f23895a);
    }
}
