package p817j$.com.android.tools.p818r8;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.format.TextStyle;
import p817j$.util.Objects;
import p817j$.util.function.C15715b;
import p817j$.util.function.C15718e;
import p817j$.util.function.C15719f;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.com.android.tools.r8.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC15529a {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m16744h(long j10) {
        int i10 = (int) j10;
        if (j10 == i10) {
            return i10;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ long m16745i(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ AbstractMap.SimpleImmutableEntry m16746j(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ List m16747k(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m16748l(Unsafe unsafe, Object obj, long j10, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j10, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j10) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ long m16749m(long j10, long j11) {
        long j12 = j10 % j11;
        if (j12 == 0) {
            return 0L;
        }
        return (((j10 ^ j11) >> 63) | 1) > 0 ? j12 : j12 + j11;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ long m16750n(long j10, long j11) {
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (((j10 ^ j11) >> 63) | 1) < 0) ? j12 - 1 : j12;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ long m16751o(long j10, long j11) {
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

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ long m16752p(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j11 ^ j10) >= 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: g */
    public static void m16743g(HashMap map, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (int i10 = 1; i10 <= length; i10++) {
            String strM16741e = m16741e(i10, "LLLL", locale);
            long j10 = i10;
            linkedHashMap.put(Long.valueOf(j10), strM16741e);
            linkedHashMap2.put(Long.valueOf(j10), strM16741e.substring(0, Character.charCount(strM16741e.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j10), m16741e(i10, "LLL", locale));
        }
        if (length > 0) {
            map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
            map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
            map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    /* JADX INFO: renamed from: a */
    public static C15715b m16737a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return AbstractC15529a.m16737a(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d10) {
                doubleConsumer.accept(d10);
                doubleConsumer2.accept(d10);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    /* JADX INFO: renamed from: b */
    public static C15718e m16738b(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return AbstractC15529a.m16738b(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                intConsumer.accept(i10);
                intConsumer2.accept(i10);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    /* JADX INFO: renamed from: c */
    public static C15719f m16739c(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return AbstractC15529a.m16739c(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j10) {
                longConsumer.accept(j10);
                longConsumer2.accept(j10);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    private static String m16741e(int i10, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, i10, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: f */
    public static void m16742f(HashMap map, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getWeekdays().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (int i10 = 1; i10 <= length; i10++) {
            String strM16740d = m16740d(i10, "cccc", locale);
            long j10 = i10;
            linkedHashMap.put(Long.valueOf(j10), strM16740d);
            linkedHashMap2.put(Long.valueOf(j10), strM16740d.substring(0, Character.charCount(strM16740d.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j10), m16740d(i10, "ccc", locale));
        }
        if (length > 0) {
            map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
            map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
            map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m16740d(int i10, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, i10, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }
}
