package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: S9.M */
/* JADX INFO: loaded from: classes.dex */
public final class C7044M {

    /* JADX INFO: renamed from: a */
    public final String f22501a;

    /* JADX INFO: renamed from: b */
    public final char[] f22502b;

    /* JADX INFO: renamed from: c */
    public final int f22503c;

    /* JADX INFO: renamed from: d */
    public final int f22504d;

    /* JADX INFO: renamed from: e */
    public final int f22505e;

    /* JADX INFO: renamed from: f */
    public final int f22506f;

    /* JADX INFO: renamed from: g */
    public final byte[] f22507g;

    /* JADX INFO: renamed from: h */
    public final boolean f22508h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7044M(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c9 = cArr[i10];
            if (!(c9 < 128)) {
                throw new IllegalArgumentException(AbstractC7057a.m7459d("Non-ASCII character: %s", Character.valueOf(c9)));
            }
            if (!(bArr[c9] == -1)) {
                throw new IllegalArgumentException(AbstractC7057a.m7459d("Duplicate character: %s", Character.valueOf(c9)));
            }
            bArr[c9] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7044M) {
            C7044M c7044m = (C7044M) obj;
            if (this.f22508h == c7044m.f22508h && Arrays.equals(this.f22502b, c7044m.f22502b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22502b) + (true != this.f22508h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f22501a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    public C7044M(String str, char[] cArr, byte[] bArr, boolean z6) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i10;
        this.f22501a = str;
        cArr.getClass();
        this.f22502b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (AbstractC7048Q.f22514a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f22504d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i11 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f22505e = i11;
                        this.f22506f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f22503c = length - 1;
                        this.f22507g = bArr;
                        zArr = new boolean[i11];
                        for (i10 = 0; i10 < this.f22506f; i10++) {
                            zArr[AbstractC7057a.m7456a(i10 * 8, this.f22504d, RoundingMode.CEILING)] = true;
                        }
                        this.f22508h = z6;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f22504d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i12 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f22505e = i12;
                        this.f22506f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f22503c = length - 1;
                        this.f22507g = bArr;
                        zArr = new boolean[i12];
                        while (i10 < this.f22506f) {
                            zArr[AbstractC7057a.m7456a(i10 * 8, this.f22504d, RoundingMode.CEILING)] = true;
                        }
                        this.f22508h = z6;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f22504d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i13 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f22505e = i13;
                        this.f22506f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f22503c = length - 1;
                        this.f22507g = bArr;
                        zArr = new boolean[i13];
                        while (i10 < this.f22506f) {
                            zArr[AbstractC7057a.m7456a(i10 * 8, this.f22504d, RoundingMode.CEILING)] = true;
                        }
                        this.f22508h = z6;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
