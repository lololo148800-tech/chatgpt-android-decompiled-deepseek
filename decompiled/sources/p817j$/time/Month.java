package p817j$.time;

import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.C15562r;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Month implements TemporalAccessor, TemporalAdjuster {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;

    /* JADX INFO: renamed from: a */
    private static final Month[] f48528a;

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ Month[] f48529b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f48529b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        f48529b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f48528a = values();
    }

    /* JADX INFO: renamed from: S */
    public static Month m16866S(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i10);
        }
        return f48528a[i10 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return interfaceC15635o == EnumC15621a.MONTH_OF_YEAR;
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.MONTH_OF_YEAR) {
            return interfaceC15635o.mo17142m();
        }
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.MONTH_OF_YEAR) {
            return getValue();
        }
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (interfaceC15635o instanceof EnumC15621a) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        return interfaceC15635o.mo17144q(this);
    }

    /* JADX INFO: renamed from: T */
    public final Month m16870T() {
        return f48528a[((((int) 1) + 12) + ordinal()) % 12];
    }

    /* JADX INFO: renamed from: Q */
    public final int m16868Q(boolean z6) {
        int i10 = AbstractC15608h.f48728a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return z6 ? 29 : 28;
    }

    /* JADX INFO: renamed from: R */
    public final int m16869R() {
        int i10 = AbstractC15608h.f48728a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    /* JADX INFO: renamed from: P */
    public final int m16867P(boolean z6) {
        switch (AbstractC15608h.f48728a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z6 ? 1 : 0) + 91;
            case 3:
                return (z6 ? 1 : 0) + 152;
            case 4:
                return (z6 ? 1 : 0) + 244;
            case 5:
                return (z6 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z6 ? 1 : 0) + 60;
            case 8:
                return (z6 ? 1 : 0) + 121;
            case 9:
                return (z6 ? 1 : 0) + 182;
            case 10:
                return (z6 ? 1 : 0) + 213;
            case 11:
                return (z6 ? 1 : 0) + 274;
            default:
                return (z6 ? 1 : 0) + 335;
        }
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return C15562r.f48594d;
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.MONTHS;
        }
        return AbstractC15632l.m17157c(this, temporalQuery);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        if (!AbstractC15551g.m16964p(temporal).equals(C15562r.f48594d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.mo16787d(getValue(), EnumC15621a.MONTH_OF_YEAR);
    }
}
