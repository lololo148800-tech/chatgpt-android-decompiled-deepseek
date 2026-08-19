package p817j$.time.chrono;

import java.util.List;
import java.util.Map;
import p817j$.time.Instant;
import p817j$.time.ZoneId;
import p817j$.time.format.EnumC15578E;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.chrono.k */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15555k extends Comparable {
    /* JADX INFO: renamed from: D */
    ChronoLocalDate mo16914D(int i10, int i11, int i12);

    /* JADX INFO: renamed from: G */
    ChronoLocalDate mo16915G(Map map, EnumC15578E enumC15578E);

    /* JADX INFO: renamed from: H */
    C15637q mo16916H(EnumC15621a enumC15621a);

    /* JADX INFO: renamed from: I */
    ChronoZonedDateTime mo16917I(Instant instant, ZoneId zoneId);

    /* JADX INFO: renamed from: K */
    List mo16918K();

    /* JADX INFO: renamed from: M */
    boolean mo16919M(long j10);

    /* JADX INFO: renamed from: N */
    InterfaceC15556l mo16920N(int i10);

    boolean equals(Object obj);

    /* JADX INFO: renamed from: g */
    int mo16921g(InterfaceC15556l interfaceC15556l, int i10);

    String getId();

    int hashCode();

    /* JADX INFO: renamed from: l */
    ChronoLocalDate mo16922l(long j10);

    /* JADX INFO: renamed from: p */
    ChronoLocalDate mo16924p(TemporalAccessor temporalAccessor);

    /* JADX INFO: renamed from: t */
    String mo16925t();

    String toString();

    /* JADX INFO: renamed from: v */
    ChronoLocalDate mo16926v(int i10, int i11);

    /* JADX INFO: renamed from: x */
    ChronoZonedDateTime mo16936x(Temporal temporal);

    /* JADX INFO: renamed from: z */
    ChronoLocalDateTime mo16938z(Temporal temporal);
}
