package ai;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p228J.AbstractC3794B0;
import p324Mn.AbstractC5530K;
import p324Mn.C5521B;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5527H;
import p324Mn.C5549s;
import p324Mn.C5551u;
import p324Mn.C5554x;
import p523V9.AbstractC8128k6;
import p544W9.AbstractC8519M3;
import p817j$.time.DayOfWeek;
import p817j$.time.Instant;
import p817j$.time.LocalDateTime;
import p817j$.time.Month;
import p817j$.time.ZoneOffset;
import p817j$.time.format.DateTimeFormatter;
import p817j$.time.format.FormatStyle;
import p817j$.time.format.TextStyle;

/* JADX INFO: renamed from: ai.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10620k {

    /* JADX INFO: renamed from: a */
    public static final int f31511a;

    /* JADX INFO: renamed from: b */
    public static final DateTimeFormatter f31512b;

    /* JADX INFO: renamed from: c */
    public static final DateTimeFormatter f31513c;

    /* JADX INFO: renamed from: d */
    public static final DateTimeFormatter f31514d;

    /* JADX INFO: renamed from: e */
    public static final DateTimeFormatter f31515e;

    /* JADX INFO: renamed from: f */
    public static final DateTimeFormatter f31516f;

    static {
        C21554a c21554a = C21555b.f68260Z;
        C5525F.Companion.getClass();
        C5525F c5525fM5924a = C5524E.m5924a();
        C5551u.Companion.getClass();
        Instant instantM4501z = AbstractC3794B0.m4501z("instant(...)");
        new C5551u(instantM4501z);
        ZoneOffset offset = c5525fM5924a.f17977a.getRules().getOffset(instantM4501z);
        new C5527H(offset);
        f31511a = ((int) C21555b.m21841k(AbstractC8128k6.m8644j(offset.getTotalSeconds(), EnumC21557d.SECONDS), EnumC21557d.MINUTES)) * (-1);
        f31512b = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        f31513c = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter.ofPattern("MMMM yyyy");
        f31514d = DateTimeFormatter.ofPattern("h:mm a");
        f31515e = DateTimeFormatter.ofPattern("MMMM d");
        f31516f = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    }

    /* JADX INFO: renamed from: a */
    public static final String m10985a(C5551u c5551u) {
        AbstractC16544l.m18094g(c5551u, "<this>");
        C5525F.Companion.getClass();
        String str = f31512b.format(AbstractC8519M3.m9187a(c5551u, C5524E.m5924a()).f17975Y);
        AbstractC16544l.m18093f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static final String m10986b(C5521B c5521b) {
        String str = f31515e.format(c5521b.f17975Y);
        AbstractC16544l.m18093f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static final String m10987c(C5521B c5521b) {
        String str = f31516f.format(c5521b.f17975Y);
        AbstractC16544l.m18093f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static final String m10988d(C5551u c5551u, C5521B nowLocal, C5521B yesterdayLocal, String today, String yesterday) {
        AbstractC16544l.m18094g(c5551u, "<this>");
        AbstractC16544l.m18094g(nowLocal, "nowLocal");
        AbstractC16544l.m18094g(yesterdayLocal, "yesterdayLocal");
        AbstractC16544l.m18094g(today, "today");
        AbstractC16544l.m18094g(yesterday, "yesterday");
        C5525F.Companion.getClass();
        C5521B c5521bM9187a = AbstractC8519M3.m9187a(c5551u, C5524E.m5924a());
        if (m10993i(nowLocal, c5521bM9187a)) {
            return today;
        }
        if (m10993i(yesterdayLocal, c5521bM9187a)) {
            return yesterday;
        }
        return nowLocal.f17975Y.getYear() == c5521bM9187a.f17975Y.getYear() ? m10986b(c5521bM9187a) : m10987c(c5521bM9187a);
    }

    /* JADX INFO: renamed from: e */
    public static final String m10989e(C5521B c5521b) {
        String str = f31514d.format(c5521b.f17975Y);
        AbstractC16544l.m18093f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static final String m10990f(C5551u c5551u, Locale locale, Double d10) {
        C5525F c5549s;
        AbstractC16544l.m18094g(c5551u, "<this>");
        AbstractC16544l.m18094g(locale, "locale");
        if (d10 == null) {
            C5525F.Companion.getClass();
            c5549s = C5524E.m5924a();
        } else {
            c5549s = new C5549s(AbstractC5530K.m5927a(null, null, Integer.valueOf((int) d10.doubleValue())));
        }
        return m10991g(AbstractC8519M3.m9187a(c5551u, c5549s), locale);
    }

    /* JADX INFO: renamed from: g */
    public static final String m10991g(C5521B c5521b, Locale locale) {
        AbstractC16544l.m18094g(locale, "locale");
        DayOfWeek dayOfWeek = c5521b.f17975Y.getDayOfWeek();
        AbstractC16544l.m18093f(dayOfWeek, "getDayOfWeek(...)");
        String displayName = dayOfWeek.getDisplayName(TextStyle.FULL, locale);
        AbstractC16544l.m18093f(displayName, "getDisplayName(...)");
        return displayName;
    }

    /* JADX INFO: renamed from: h */
    public static final C5554x m10992h() {
        C5551u.Companion.getClass();
        C5551u c5551u = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        C5525F.Companion.getClass();
        return AbstractC8519M3.m9187a(c5551u, C5524E.m5924a()).m5923a();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m10993i(C5521B c5521b, C5521B c5521b2) {
        int year = c5521b.f17975Y.getYear();
        LocalDateTime localDateTime = c5521b2.f17975Y;
        if (year == localDateTime.getYear()) {
            LocalDateTime localDateTime2 = c5521b.f17975Y;
            Month month = localDateTime2.getMonth();
            AbstractC16544l.m18093f(month, "getMonth(...)");
            Month month2 = localDateTime.getMonth();
            AbstractC16544l.m18093f(month2, "getMonth(...)");
            if (month == month2 && localDateTime2.getDayOfMonth() == localDateTime.getDayOfMonth()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final int m10994j(C5554x c5554x, C5551u c5551u) {
        AbstractC16544l.m18094g(c5554x, "<this>");
        C5525F.Companion.getClass();
        return AbstractC8519M3.m9187a(c5551u, C5524E.m5924a()).f17975Y.getYear() - c5554x.f18006Y.getYear();
    }
}
