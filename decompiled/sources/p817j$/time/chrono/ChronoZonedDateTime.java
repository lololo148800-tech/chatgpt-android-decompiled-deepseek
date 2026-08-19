package p817j$.time.chrono;

import p817j$.time.Instant;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.temporal.Temporal;

/* JADX INFO: loaded from: classes4.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    /* JADX INFO: renamed from: C */
    ChronoLocalDateTime mo16894C();

    /* JADX INFO: renamed from: O */
    long mo16895O();

    /* JADX INFO: renamed from: a */
    InterfaceC15555k mo16900a();

    /* JADX INFO: renamed from: b */
    LocalTime mo16901b();

    /* JADX INFO: renamed from: c */
    ChronoLocalDate mo16902c();

    /* JADX INFO: renamed from: h */
    ZoneOffset mo16903h();

    /* JADX INFO: renamed from: i */
    ChronoZonedDateTime mo16904i(ZoneId zoneId);

    boolean isAfter(ChronoZonedDateTime<?> chronoZonedDateTime);

    /* JADX INFO: renamed from: j */
    ChronoZonedDateTime mo16905j(ZoneId zoneId);

    /* JADX INFO: renamed from: s */
    ZoneId mo16906s();

    Instant toInstant();
}
