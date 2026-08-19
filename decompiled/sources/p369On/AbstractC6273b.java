package p369On;

import com.revenuecat.purchases.common.UtilsKt;
import com.statsig.androidsdk.ErrorBoundaryKt;

/* JADX INFO: renamed from: On.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6273b {

    /* JADX INFO: renamed from: a */
    public static final int[] f20376a = {1, 10, 100, 1000, ErrorBoundaryKt.SAMPLING_RATE, 100000, UtilsKt.MICROS_MULTIPLIER, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: a */
    public static final boolean m6754a(char c9) {
        return '0' <= c9 && c9 < ':';
    }

    /* JADX INFO: renamed from: b */
    public static final long m6755b(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: c */
    public static final long m6756c(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j11 != Long.MIN_VALUE) | (j10 >= 0)) {
                long j12 = j10 * j11;
                if (j10 == 0 || j12 / j10 == j11) {
                    return j12;
                }
            }
        }
        throw new ArithmeticException();
    }
}
