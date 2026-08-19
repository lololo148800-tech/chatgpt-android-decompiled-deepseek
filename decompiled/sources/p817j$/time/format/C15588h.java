package p817j$.time.format;

import com.statsig.androidsdk.ErrorBoundaryKt;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.LocalDateTime;
import p817j$.time.ZoneOffset;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.format.h */
/* JADX INFO: loaded from: classes4.dex */
final class C15588h implements InterfaceC15586f {
    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        Long lM17105e = c15605y.m17105e(EnumC15621a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorM17104d = c15605y.m17104d();
        EnumC15621a enumC15621a = EnumC15621a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorM17104d.mo16770f(enumC15621a) ? Long.valueOf(c15605y.m17104d().mo16773u(enumC15621a)) : null;
        int i10 = 0;
        if (lM17105e == null) {
            return false;
        }
        long jLongValue = lM17105e.longValue();
        int iM17139P = enumC15621a.m17139P(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j10 = jLongValue - 253402300800L;
            long jM16750n = AbstractC15529a.m16750n(j10, 315569520000L) + 1;
            LocalDateTime localDateTimeM16826W = LocalDateTime.m16826W(AbstractC15529a.m16749m(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jM16750n > 0) {
                sb2.append('+');
                sb2.append(jM16750n);
            }
            sb2.append(localDateTimeM16826W);
            if (localDateTimeM16826W.m16832S() == 0) {
                sb2.append(":00");
            }
        } else {
            long j11 = jLongValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime localDateTimeM16826W2 = LocalDateTime.m16826W(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(localDateTimeM16826W2);
            if (localDateTimeM16826W2.m16832S() == 0) {
                sb2.append(":00");
            }
            if (j12 < 0) {
                if (localDateTimeM16826W2.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb2.insert(length, j12);
                } else {
                    sb2.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (iM17139P > 0) {
            sb2.append('.');
            int i11 = 100000000;
            while (true) {
                if (iM17139P <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = iM17139P / i11;
                sb2.append((char) (i12 + 48));
                iM17139P -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m17029a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.m17032e('T');
        EnumC15621a enumC15621a = EnumC15621a.HOUR_OF_DAY;
        dateTimeFormatterBuilder.m17040n(enumC15621a, 2);
        dateTimeFormatterBuilder.m17032e(':');
        EnumC15621a enumC15621a2 = EnumC15621a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.m17040n(enumC15621a2, 2);
        dateTimeFormatterBuilder.m17032e(':');
        EnumC15621a enumC15621a3 = EnumC15621a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.m17040n(enumC15621a3, 2);
        EnumC15621a enumC15621a4 = EnumC15621a.NANO_OF_SECOND;
        int i13 = 0;
        dateTimeFormatterBuilder.m17030b(enumC15621a4, 0, 9, true);
        dateTimeFormatterBuilder.m17032e('Z');
        C15585e c15585eM17025e = dateTimeFormatterBuilder.toFormatter().m17025e();
        C15603w c15603wM17085d = c15603w.m17085d();
        int iMo17054o = c15585eM17025e.mo17054o(c15603wM17085d, charSequence, i10);
        if (iMo17054o < 0) {
            return iMo17054o;
        }
        long jLongValue = c15603wM17085d.m17090j(EnumC15621a.YEAR).longValue();
        int iIntValue = c15603wM17085d.m17090j(EnumC15621a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = c15603wM17085d.m17090j(EnumC15621a.DAY_OF_MONTH).intValue();
        int iIntValue3 = c15603wM17085d.m17090j(enumC15621a).intValue();
        int iIntValue4 = c15603wM17085d.m17090j(enumC15621a2).intValue();
        Long lM17090j = c15603wM17085d.m17090j(enumC15621a3);
        Long lM17090j2 = c15603wM17085d.m17090j(enumC15621a4);
        int iIntValue5 = lM17090j != null ? lM17090j.intValue() : 0;
        int iIntValue6 = lM17090j2 != null ? lM17090j2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i11 = 0;
            i12 = iIntValue5;
            i13 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            c15603w.m17096p();
            i11 = iIntValue3;
            i12 = 59;
        } else {
            i11 = iIntValue3;
            i12 = iIntValue5;
        }
        try {
            return c15603w.m17095o(enumC15621a4, iIntValue6, i10, c15603w.m17095o(EnumC15621a.INSTANT_SECONDS, AbstractC15529a.m16751o(jLongValue / 10000, 315569520000L) + AbstractC15551g.m16962n(LocalDateTime.m16829of(((int) jLongValue) % ErrorBoundaryKt.SAMPLING_RATE, iIntValue, iIntValue2, i11, iIntValue4, i12, 0).m16836Y(i13), ZoneOffset.UTC), i10, iMo17054o));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
