package p817j$.time.temporal;

import p817j$.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public interface Temporal extends TemporalAccessor {
    /* JADX INFO: renamed from: d */
    Temporal mo16787d(long j10, InterfaceC15635o interfaceC15635o);

    /* JADX INFO: renamed from: e */
    Temporal mo16788e(long j10, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: m */
    Temporal mo16789m(long j10, ChronoUnit chronoUnit);

    /* JADX INFO: renamed from: q */
    Temporal mo16790q(LocalDate localDate);

    long until(Temporal temporal, TemporalUnit temporalUnit);
}
