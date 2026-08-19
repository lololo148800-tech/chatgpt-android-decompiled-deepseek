package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.math.BigInteger;
import p817j$.time.DateTimeException;
import p817j$.time.temporal.InterfaceC15635o;

/* JADX INFO: renamed from: j$.time.format.k */
/* JADX INFO: loaded from: classes4.dex */
class C15591k implements InterfaceC15586f {

    /* JADX INFO: renamed from: f */
    static final long[] f48671f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a */
    final InterfaceC15635o f48672a;

    /* JADX INFO: renamed from: b */
    final int f48673b;

    /* JADX INFO: renamed from: c */
    final int f48674c;

    /* JADX INFO: renamed from: d */
    private final EnumC15579F f48675d;

    /* JADX INFO: renamed from: e */
    final int f48676e;

    /* JADX INFO: renamed from: b */
    long mo17063b(C15605y c15605y, long j10) {
        return j10;
    }

    C15591k(InterfaceC15635o interfaceC15635o, int i10, int i11, EnumC15579F enumC15579F) {
        this.f48672a = interfaceC15635o;
        this.f48673b = i10;
        this.f48674c = i11;
        this.f48675d = enumC15579F;
        this.f48676e = 0;
    }

    protected C15591k(InterfaceC15635o interfaceC15635o, int i10, int i11, EnumC15579F enumC15579F, int i12) {
        this.f48672a = interfaceC15635o;
        this.f48673b = i10;
        this.f48674c = i11;
        this.f48675d = enumC15579F;
        this.f48676e = i12;
    }

    /* JADX INFO: renamed from: e */
    C15591k mo17057e() {
        if (this.f48676e == -1) {
            return this;
        }
        return new C15591k(this.f48672a, this.f48673b, this.f48674c, this.f48675d, -1);
    }

    /* JADX INFO: renamed from: f */
    C15591k mo17058f(int i10) {
        int i11 = this.f48676e + i10;
        return new C15591k(this.f48672a, this.f48673b, this.f48674c, this.f48675d, i11);
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        InterfaceC15635o interfaceC15635o = this.f48672a;
        Long lM17105e = c15605y.m17105e(interfaceC15635o);
        if (lM17105e == null) {
            return false;
        }
        long jMo17063b = mo17063b(c15605y, lM17105e.longValue());
        C15576C c15576cM17102b = c15605y.m17102b();
        String string = jMo17063b == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jMo17063b));
        int length = string.length();
        int i10 = this.f48674c;
        if (length > i10) {
            throw new DateTimeException("Field " + interfaceC15635o + " cannot be printed as the value " + jMo17063b + " exceeds the maximum print width of " + i10);
        }
        c15576cM17102b.getClass();
        int i11 = this.f48673b;
        EnumC15579F enumC15579F = this.f48675d;
        if (jMo17063b >= 0) {
            int i12 = AbstractC15583c.f48661a[enumC15579F.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && jMo17063b >= f48671f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = AbstractC15583c.f48661a[enumC15579F.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append('-');
            } else if (i13 == 4) {
                throw new DateTimeException("Field " + interfaceC15635o + " cannot be printed as the value " + jMo17063b + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - string.length(); i14++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    /* JADX INFO: renamed from: c */
    boolean mo17056c(C15603w c15603w) {
        int i10 = this.f48676e;
        return i10 == -1 || (i10 > 0 && this.f48673b == this.f48674c && this.f48675d == EnumC15579F.NOT_NEGATIVE);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
    /* JADX WARN: Code duplicated, block: B:107:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0171  */
    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        BigInteger bigIntegerDivide;
        long j10;
        long j11;
        int length = charSequence.length();
        if (i10 == length) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        c15603w.m17087g().getClass();
        int i13 = this.f48674c;
        EnumC15579F enumC15579F = this.f48675d;
        int i14 = this.f48673b;
        int i15 = 0;
        if (cCharAt == '+') {
            if (!enumC15579F.m17050m(true, c15603w.m17092l(), i14 == i13)) {
                return ~i10;
            }
            i11 = i10 + 1;
            z10 = true;
            z6 = false;
        } else {
            c15603w.m17087g().getClass();
            if (cCharAt == '-') {
                if (!enumC15579F.m17050m(false, c15603w.m17092l(), i14 == i13)) {
                    return ~i10;
                }
                i11 = i10 + 1;
                z6 = true;
                z10 = false;
            } else {
                if (enumC15579F == EnumC15579F.ALWAYS && c15603w.m17092l()) {
                    return ~i10;
                }
                i11 = i10;
                z6 = false;
                z10 = false;
            }
        }
        int i16 = (c15603w.m17092l() || mo17056c(c15603w)) ? i14 : 1;
        int i17 = i11 + i16;
        if (i17 > length) {
            return ~i11;
        }
        if (!c15603w.m17092l() && !mo17056c(c15603w)) {
            i13 = 9;
        }
        int i18 = this.f48676e;
        int iMax = Math.max(i18, 0) + i13;
        while (true) {
            BigInteger bigIntegerAdd = null;
            if (i15 >= 2) {
                i12 = i11;
                bigIntegerDivide = null;
                j10 = 0;
                break;
            }
            int iMin = Math.min(iMax + i11, length);
            int i19 = i11;
            long j12 = 0;
            while (i19 < iMin) {
                int i20 = i19 + 1;
                int iM17011a = c15603w.m17087g().m17011a(charSequence.charAt(i19));
                if (iM17011a < 0) {
                    if (i19 >= i17) {
                        break;
                    }
                    return ~i11;
                }
                if (i20 - i11 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j12);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iM17011a));
                } else {
                    j12 = (j12 * 10) + ((long) iM17011a);
                }
                iMin = iMin;
                i19 = i20;
            }
            if (i18 <= 0 || i15 != 0) {
                i12 = i19;
                bigIntegerDivide = bigIntegerAdd;
                j10 = j12;
                break;
            }
            iMax = Math.max(i16, (i19 - i11) - i18);
            i15++;
        }
        if (z6) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && c15603w.m17092l()) {
                    return ~(i11 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j10 == 0 && c15603w.m17092l()) {
                    return ~(i11 - 1);
                }
                j11 = -j10;
            }
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i12--;
                }
                return mo17064d(c15603w, bigIntegerDivide.longValue(), i11, i12);
            }
            return mo17064d(c15603w, j11, i11, i12);
        }
        if (enumC15579F == EnumC15579F.EXCEEDS_PAD && c15603w.m17092l()) {
            int i21 = i12 - i11;
            if (z10) {
                if (i21 <= i14) {
                    return ~(i11 - 1);
                }
            } else if (i21 > i14) {
                return ~i11;
            }
        }
        j11 = j10;
        if (bigIntegerDivide != null) {
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i12--;
            }
            return mo17064d(c15603w, bigIntegerDivide.longValue(), i11, i12);
        }
        return mo17064d(c15603w, j11, i11, i12);
    }

    /* JADX INFO: renamed from: d */
    int mo17064d(C15603w c15603w, long j10, int i10, int i11) {
        return c15603w.m17095o(this.f48672a, j10, i10, i11);
    }

    public String toString() {
        int i10 = this.f48674c;
        InterfaceC15635o interfaceC15635o = this.f48672a;
        EnumC15579F enumC15579F = this.f48675d;
        int i11 = this.f48673b;
        if (i11 == 1 && i10 == 19 && enumC15579F == EnumC15579F.NORMAL) {
            return "Value(" + interfaceC15635o + Separators.RPAREN;
        }
        if (i11 == i10 && enumC15579F == EnumC15579F.NOT_NEGATIVE) {
            return "Value(" + interfaceC15635o + Separators.COMMA + i11 + Separators.RPAREN;
        }
        return "Value(" + interfaceC15635o + Separators.COMMA + i11 + Separators.COMMA + i10 + Separators.COMMA + enumC15579F + Separators.RPAREN;
    }
}
