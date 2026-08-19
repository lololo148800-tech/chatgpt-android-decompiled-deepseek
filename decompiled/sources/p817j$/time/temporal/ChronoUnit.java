package p817j$.time.temporal;

import p817j$.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a */
    private final String f48755a;

    static {
        Duration duration = Duration.f48512c;
        Duration.m16777u(Long.MAX_VALUE, 999999999L);
    }

    ChronoUnit(String str) {
        this.f48755a = str;
    }

    @Override // p817j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: o */
    public final Temporal mo17137o(Temporal temporal, long j10) {
        return temporal.mo16788e(j10, this);
    }

    @Override // p817j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: m */
    public final long mo17136m(Temporal temporal, Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f48755a;
    }
}
