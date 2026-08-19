package p492U1;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: U1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7543h {

    /* JADX INFO: renamed from: a */
    public final long f23897a;

    /* JADX INFO: renamed from: a */
    public static long m7879a(int i10, int i11, int i12, long j10) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (j10 & 4294967295L);
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m7880b(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: c */
    public static final long m7881c(long j10, long j11) {
        return (((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public static final long m7882d(long j10, long j11) {
        return (((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static String m7883e(long j10) {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return AbstractC12107L1.m13826q(sb2, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7543h) {
            return this.f23897a == ((C7543h) obj).f23897a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23897a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m7883e(this.f23897a);
    }
}
