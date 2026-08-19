package p817j$.time.chrono;

import p817j$.time.LocalTime;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalAmount;
import p817j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes4.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    /* JADX INFO: renamed from: B */
    InterfaceC15556l mo16801B();

    /* JADX INFO: renamed from: E */
    ChronoLocalDate mo16802E(TemporalAmount temporalAmount);

    /* JADX INFO: renamed from: F */
    boolean mo16803F();

    /* JADX INFO: renamed from: J */
    ChronoLocalDate mo16789m(long j10, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: L */
    int mo16805L();

    /* JADX INFO: renamed from: a */
    InterfaceC15555k mo16812a();

    int compareTo(ChronoLocalDate chronoLocalDate);

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    ChronoLocalDate mo16787d(long j10, InterfaceC15635o interfaceC15635o);

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    ChronoLocalDate mo16788e(long j10, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    boolean mo16770f(InterfaceC15635o interfaceC15635o);

    int hashCode();

    /* JADX INFO: renamed from: k */
    ChronoLocalDate mo16790q(TemporalAdjuster temporalAdjuster);

    long toEpochDay();

    String toString();

    @Override // p817j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: w */
    ChronoLocalDateTime mo16822w(LocalTime localTime);
}
