package p692d0;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: d0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C12970i {

    /* JADX INFO: renamed from: a */
    public final long f41180a;

    /* JADX INFO: renamed from: a */
    public static long m14660a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12970i) {
            return this.f41180a == ((C12970i) obj).f41180a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f41180a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        long j10 = this.f41180a;
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return AbstractC12107L1.m13826q(sb2, (int) (j10 & 4294967295L), ')');
    }
}
