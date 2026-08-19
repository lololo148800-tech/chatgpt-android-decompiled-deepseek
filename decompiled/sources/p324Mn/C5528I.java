package p324Mn;

import p817j$.time.ZoneOffset;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: Mn.I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5528I implements TemporalQuery {
    @Override // p817j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return ZoneOffset.from(temporalAccessor);
    }
}
