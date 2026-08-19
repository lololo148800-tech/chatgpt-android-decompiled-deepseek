package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p016Ae.C0439a;
import p571X9.AbstractC9227W;
import p817j$.time.DateTimeException;
import p817j$.time.ZoneOffset;
import p817j$.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: Mn.K */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5530K {

    /* JADX INFO: renamed from: a */
    public static final C17314q f17983a = AbstractC9227W.m9800c(C5529J.f17981p0);

    /* JADX INFO: renamed from: b */
    public static final C17314q f17984b = AbstractC9227W.m9800c(C5529J.f17980o0);

    /* JADX INFO: renamed from: c */
    public static final C17314q f17985c = AbstractC9227W.m9800c(C5529J.f17979Z);

    /* JADX INFO: renamed from: a */
    public static final C5527H m5927a(Integer num, Integer num2, Integer num3) {
        C5527H c5527h;
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                AbstractC16544l.m18093f(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                c5527h = new C5527H(zoneOffsetOfHoursMinutesSeconds);
            } else if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                AbstractC16544l.m18093f(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                c5527h = new C5527H(zoneOffsetOfHoursMinutesSeconds2);
            } else {
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
                AbstractC16544l.m18093f(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
                c5527h = new C5527H(zoneOffsetOfTotalSeconds);
            }
            return c5527h;
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C5527H m5928b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new C5527H((ZoneOffset) dateTimeFormatter.parse(str, new C5528I()));
        } catch (DateTimeException e10) {
            throw new C0439a(e10);
        }
    }
}
