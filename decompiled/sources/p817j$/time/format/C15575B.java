package p817j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.B */
/* JADX INFO: loaded from: classes4.dex */
class C15575B {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentHashMap f48617a = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b */
    private static final Comparator f48618b = new C15606z();

    /* JADX INFO: renamed from: c */
    private static final C15575B f48619c = new C15575B();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f48620d = 0;

    /* JADX INFO: renamed from: d */
    static C15575B m17006d() {
        return f48619c;
    }

    /* JADX INFO: renamed from: f */
    public String mo17008f(InterfaceC15635o interfaceC15635o, long j10, TextStyle textStyle, Locale locale) {
        Object objM17004b = m17004b(interfaceC15635o, locale);
        if (objM17004b instanceof C15574A) {
            return ((C15574A) objM17004b).m17001a(j10, textStyle);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String mo17007e(InterfaceC15555k interfaceC15555k, InterfaceC15635o interfaceC15635o, long j10, TextStyle textStyle, Locale locale) {
        if (interfaceC15555k == C15562r.f48594d || !(interfaceC15635o instanceof EnumC15621a)) {
            return mo17008f(interfaceC15635o, j10, textStyle, locale);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Iterator mo17010h(InterfaceC15635o interfaceC15635o, TextStyle textStyle, Locale locale) {
        Object objM17004b = m17004b(interfaceC15635o, locale);
        if (objM17004b instanceof C15574A) {
            return ((C15574A) objM17004b).m17002b(textStyle);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public Iterator mo17009g(InterfaceC15555k interfaceC15555k, InterfaceC15635o interfaceC15635o, TextStyle textStyle, Locale locale) {
        if (interfaceC15555k == C15562r.f48594d || !(interfaceC15635o instanceof EnumC15621a)) {
            return mo17010h(interfaceC15635o, textStyle, locale);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static String m17005c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* JADX INFO: renamed from: b */
    private static Object m17004b(InterfaceC15635o interfaceC15635o, Locale locale) {
        Object c15574a;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(interfaceC15635o, locale);
        ConcurrentHashMap concurrentHashMap = f48617a;
        V v2 = concurrentHashMap.get(simpleImmutableEntry);
        if (v2 != 0) {
            return v2;
        }
        HashMap map = new HashMap();
        int i10 = 0;
        if (interfaceC15635o == EnumC15621a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i10 < eras.length) {
                if (!eras[i10].isEmpty()) {
                    long j10 = i10;
                    map2.put(Long.valueOf(j10), eras[i10]);
                    map3.put(Long.valueOf(j10), m17005c(eras[i10]));
                }
                i10++;
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            c15574a = new C15574A(map);
        } else if (interfaceC15635o == EnumC15621a.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            AbstractC15529a.m16743g(map, dateFormatSymbols2, locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] months = dateFormatSymbols2.getMonths();
            for (int i11 = 0; i11 < months.length; i11++) {
                if (!months[i11].isEmpty()) {
                    long j11 = ((long) i11) + 1;
                    map4.put(Long.valueOf(j11), months[i11]);
                    map5.put(Long.valueOf(j11), m17005c(months[i11]));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.NARROW, map5);
            }
            HashMap map6 = new HashMap();
            String[] shortMonths = dateFormatSymbols2.getShortMonths();
            while (i10 < shortMonths.length) {
                if (!shortMonths[i10].isEmpty()) {
                    map6.put(Long.valueOf(((long) i10) + 1), shortMonths[i10]);
                }
                i10++;
            }
            if (!map6.isEmpty()) {
                map.put(TextStyle.SHORT, map6);
            }
            c15574a = new C15574A(map);
        } else if (interfaceC15635o == EnumC15621a.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            AbstractC15529a.m16742f(map, dateFormatSymbols3, locale);
            HashMap map7 = new HashMap();
            String[] weekdays = dateFormatSymbols3.getWeekdays();
            map7.put(1L, weekdays[2]);
            map7.put(2L, weekdays[3]);
            map7.put(3L, weekdays[4]);
            map7.put(4L, weekdays[5]);
            map7.put(5L, weekdays[6]);
            map7.put(6L, weekdays[7]);
            map7.put(7L, weekdays[1]);
            map.put(TextStyle.FULL, map7);
            HashMap map8 = new HashMap();
            map8.put(1L, m17005c(weekdays[2]));
            map8.put(2L, m17005c(weekdays[3]));
            map8.put(3L, m17005c(weekdays[4]));
            map8.put(4L, m17005c(weekdays[5]));
            map8.put(5L, m17005c(weekdays[6]));
            map8.put(6L, m17005c(weekdays[7]));
            map8.put(7L, m17005c(weekdays[1]));
            map.put(TextStyle.NARROW, map8);
            HashMap map9 = new HashMap();
            String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
            map9.put(1L, shortWeekdays[2]);
            map9.put(2L, shortWeekdays[3]);
            map9.put(3L, shortWeekdays[4]);
            map9.put(4L, shortWeekdays[5]);
            map9.put(5L, shortWeekdays[6]);
            map9.put(6L, shortWeekdays[7]);
            map9.put(7L, shortWeekdays[1]);
            map.put(TextStyle.SHORT, map9);
            c15574a = new C15574A(map);
        } else if (interfaceC15635o == EnumC15621a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
            HashMap map10 = new HashMap();
            HashMap map11 = new HashMap();
            String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
            while (i10 < amPmStrings.length) {
                if (!amPmStrings[i10].isEmpty()) {
                    long j12 = i10;
                    map10.put(Long.valueOf(j12), amPmStrings[i10]);
                    map11.put(Long.valueOf(j12), m17005c(amPmStrings[i10]));
                }
                i10++;
            }
            if (!map10.isEmpty()) {
                map.put(TextStyle.FULL, map10);
                map.put(TextStyle.SHORT, map10);
                map.put(TextStyle.NARROW, map11);
            }
            c15574a = new C15574A(map);
        } else {
            c15574a = "";
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, c15574a);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
