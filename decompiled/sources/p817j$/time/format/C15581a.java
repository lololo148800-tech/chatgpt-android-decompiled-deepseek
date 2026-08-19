package p817j$.time.format;

import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: j$.time.format.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15581a implements TemporalQuery {
    @Override // p817j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = DateTimeFormatterBuilder.f48640j;
        ZoneId zoneId = (ZoneId) temporalAccessor.mo16774y(AbstractC15632l.m17166l());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
