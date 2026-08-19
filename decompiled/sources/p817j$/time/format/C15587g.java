package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.g */
/* JADX INFO: loaded from: classes4.dex */
final class C15587g extends C15591k {

    /* JADX INFO: renamed from: g */
    private final boolean f48665g;

    C15587g(EnumC15621a enumC15621a, int i10, int i11, boolean z6) {
        this(enumC15621a, i10, i11, z6, 0);
        Objects.requireNonNull(enumC15621a, "field");
        if (!enumC15621a.mo17142m().m17175g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + enumC15621a);
        }
        if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
    }

    C15587g(InterfaceC15635o interfaceC15635o, int i10, int i11, boolean z6, int i12) {
        super(interfaceC15635o, i10, i11, EnumC15579F.NOT_NEGATIVE, i12);
        this.f48665g = z6;
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: e */
    final C15591k mo17057e() {
        if (this.f48676e == -1) {
            return this;
        }
        return new C15587g(this.f48672a, this.f48673b, this.f48674c, this.f48665g, -1);
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: f */
    final C15591k mo17058f(int i10) {
        return new C15587g(this.f48672a, this.f48673b, this.f48674c, this.f48665g, this.f48676e + i10);
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: c */
    final boolean mo17056c(C15603w c15603w) {
        return c15603w.m17092l() && this.f48673b == this.f48674c && !this.f48665g;
    }

    @Override // p817j$.time.format.C15591k, p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        InterfaceC15635o interfaceC15635o = this.f48672a;
        Long lM17105e = c15605y.m17105e(interfaceC15635o);
        if (lM17105e == null) {
            return false;
        }
        C15576C c15576cM17102b = c15605y.m17102b();
        long jLongValue = lM17105e.longValue();
        C15637q c15637qMo17142m = interfaceC15635o.mo17142m();
        c15637qMo17142m.m17171b(jLongValue, interfaceC15635o);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c15637qMo17142m.m17173e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c15637qMo17142m.m17172d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z6 = this.f48665g;
        int i10 = this.f48673b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f48674c), roundingMode).toPlainString().substring(2);
            c15576cM17102b.getClass();
            if (z6) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i10 <= 0) {
            return true;
        }
        if (z6) {
            c15576cM17102b.getClass();
            sb2.append('.');
        }
        for (int i11 = 0; i11 < i10; i11++) {
            c15576cM17102b.getClass();
            sb2.append('0');
        }
        return true;
    }

    @Override // p817j$.time.format.C15591k, p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        int i11 = (c15603w.m17092l() || mo17056c(c15603w)) ? this.f48673b : 0;
        int i12 = (c15603w.m17092l() || mo17056c(c15603w)) ? this.f48674c : 9;
        int length = charSequence.length();
        if (i10 == length) {
            return i11 > 0 ? ~i10 : i10;
        }
        if (this.f48665g) {
            char cCharAt = charSequence.charAt(i10);
            c15603w.m17087g().getClass();
            if (cCharAt != '.') {
                return i11 > 0 ? ~i10 : i10;
            }
            i10++;
        }
        int i13 = i10;
        int i14 = i11 + i13;
        if (i14 > length) {
            return ~i13;
        }
        int iMin = Math.min(i12 + i13, length);
        int i15 = 0;
        int i16 = i13;
        while (i16 < iMin) {
            int i17 = i16 + 1;
            int iM17011a = c15603w.m17087g().m17011a(charSequence.charAt(i16));
            if (iM17011a < 0) {
                if (i17 >= i14) {
                    break;
                }
                return ~i13;
            }
            i15 = (i15 * 10) + iM17011a;
            i16 = i17;
        }
        BigDecimal bigDecimalMovePointLeft = new BigDecimal(i15).movePointLeft(i16 - i13);
        C15637q c15637qMo17142m = this.f48672a.mo17142m();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c15637qMo17142m.m17173e());
        return c15603w.m17095o(this.f48672a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c15637qMo17142m.m17172d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i13, i16);
    }

    @Override // p817j$.time.format.C15591k
    public final String toString() {
        return "Fraction(" + this.f48672a + Separators.COMMA + this.f48673b + Separators.COMMA + this.f48674c + (this.f48665g ? ",DecimalPoint" : "") + Separators.RPAREN;
    }
}
