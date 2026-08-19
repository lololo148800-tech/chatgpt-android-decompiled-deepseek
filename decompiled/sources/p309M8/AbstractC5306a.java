package p309M8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: M8.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5306a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f17479a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a */
    public static void m5840a(long j10, byte[] bArr, int i10, int i11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) >>> 2;
        Arrays.fill(bArr, i10, (i11 - 16) + i10 + iNumberOfLeadingZeros, (byte) 48);
        for (int i12 = 0; i12 < 16 - iNumberOfLeadingZeros; i12++) {
            bArr[((i10 + i11) - 1) - i12] = f17479a[(int) (15 & j10)];
            j10 >>>= 4;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m5841b(String str) {
        int i10;
        int length = str.length();
        if (length > 0) {
            int i11 = 0;
            if (str.charAt(0) != '-') {
                if (length <= 18) {
                    return Long.parseLong(str);
                }
                if (length <= 20) {
                    int i12 = 0;
                    long j10 = 0;
                    while (true) {
                        i10 = length - 1;
                        if (i11 >= i10) {
                            break;
                        }
                        int iDigit = Character.digit(str.charAt(i11), 10);
                        i12 |= iDigit;
                        j10 = (j10 * 10) + ((long) iDigit);
                        i11++;
                    }
                    int iDigit2 = Character.digit(str.charAt(i10), 10);
                    if ((i12 | iDigit2) >= 0) {
                        if (j10 <= 1844674407370955161L) {
                            long j11 = j10 * 10;
                            long j12 = ((long) iDigit2) + j11;
                            if (j11 < 0 && j12 >= 0) {
                                throw new NumberFormatException(AbstractC10763a.m11054l("String value ", str, " exceeds range of unsigned long."));
                            }
                            return j12;
                        }
                        throw new NumberFormatException(AbstractC10763a.m11054l("String value ", str, " exceeds range of unsigned long."));
                    }
                    throw new NumberFormatException("Illegal character in ".concat(str));
                }
                throw new NumberFormatException(AbstractC10763a.m11054l("String value ", str, " exceeds range of unsigned long."));
            }
            throw new NumberFormatException(AbstractC10763a.m11054l(TfazcFv.sWpuw, str, Separators.DOT));
        }
        throw new NumberFormatException("Empty input string");
    }
}
