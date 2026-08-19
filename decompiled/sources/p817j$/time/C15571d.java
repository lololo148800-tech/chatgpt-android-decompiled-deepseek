package p817j$.time;

import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: j$.time.d */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15571d implements TemporalQuery {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48611a;

    @Override // p817j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.f48611a) {
            case 0:
                return LocalDate.m16792R(temporalAccessor);
            case 1:
                return LocalDateTime.m16824Q(temporalAccessor);
            case 2:
                return LocalTime.m16847Q(temporalAccessor);
            default:
                return ZonedDateTime.m16889P(temporalAccessor);
        }
    }
}
