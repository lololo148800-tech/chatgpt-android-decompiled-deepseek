package p817j$.time.chrono;

import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;

/* JADX INFO: loaded from: classes4.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    /* JADX INFO: renamed from: a */
    InterfaceC15555k mo16838a();

    /* JADX INFO: renamed from: b */
    LocalTime mo16840b();

    /* JADX INFO: renamed from: c */
    ChronoLocalDate mo16841c();

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    /* JADX INFO: renamed from: n */
    ChronoZonedDateTime mo16845n(ZoneId zoneId);
}
