package p1045ul;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC16544l;
import p817j$.util.DesugarTimeZone;
import p874lj.C17057a;

/* JADX INFO: renamed from: ul.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20384a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f64469a = DesugarTimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: a */
    public static final C20387d m21047a(int i10, int i11, int i12, int i13, EnumC20389f month, int i14) {
        AbstractC16544l.m18094g(month, "month");
        Calendar calendar = Calendar.getInstance(f64469a, Locale.ROOT);
        AbstractC16544l.m18091d(calendar);
        calendar.set(1, i14);
        calendar.set(2, month.ordinal());
        calendar.set(5, i13);
        calendar.set(11, i12);
        calendar.set(12, i11);
        calendar.set(13, i10);
        calendar.set(14, 0);
        return m21049c(calendar, null);
    }

    /* JADX INFO: renamed from: b */
    public static C20387d m21048b() {
        Calendar calendar = Calendar.getInstance(f64469a, Locale.ROOT);
        AbstractC16544l.m18091d(calendar);
        return m21049c(calendar, null);
    }

    /* JADX INFO: renamed from: c */
    public static final C20387d m21049c(Calendar calendar, Long l4) {
        if (l4 != null) {
            calendar.setTimeInMillis(l4.longValue());
        }
        int i10 = calendar.get(16) + calendar.get(15);
        int i11 = calendar.get(13);
        int i12 = calendar.get(12);
        int i13 = calendar.get(11);
        int i14 = (calendar.get(7) + 5) % 7;
        EnumC20390g.f64485Z.getClass();
        EnumC20390g enumC20390g = (EnumC20390g) EnumC20390g.f64487p0.get(i14);
        int i15 = calendar.get(5);
        int i16 = calendar.get(6);
        C17057a c17057a = EnumC20389f.f64481Z;
        int i17 = calendar.get(2);
        c17057a.getClass();
        return new C20387d(i11, i12, i13, enumC20390g, i15, i16, (EnumC20389f) EnumC20389f.f64483p0.get(i17), calendar.get(1), calendar.getTimeInMillis() + ((long) i10));
    }
}
