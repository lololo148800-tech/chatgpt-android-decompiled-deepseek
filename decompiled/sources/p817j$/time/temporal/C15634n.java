package p817j$.time.temporal;

import p817j$.time.LocalDate;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.chrono.InterfaceC15555k;

/* JADX INFO: renamed from: j$.time.temporal.n */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15634n implements TemporalQuery, TemporalAdjuster {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48782a;

    public /* synthetic */ C15634n(int i10) {
        this.f48782a = i10;
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public Temporal mo16768A(Temporal temporal) {
        EnumC15621a enumC15621a = EnumC15621a.DAY_OF_MONTH;
        return temporal.mo16787d(temporal.mo16772r(enumC15621a).m17172d(), enumC15621a);
    }

    @Override // p817j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.f48782a) {
            case 1:
                return (ZoneId) temporalAccessor.mo16774y(AbstractC15632l.f48773a);
            case 2:
                return (InterfaceC15555k) temporalAccessor.mo16774y(AbstractC15632l.f48774b);
            case 3:
                return (TemporalUnit) temporalAccessor.mo16774y(AbstractC15632l.f48775c);
            case 4:
                EnumC15621a enumC15621a = EnumC15621a.OFFSET_SECONDS;
                if (temporalAccessor.mo16770f(enumC15621a)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.mo16771o(enumC15621a));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.mo16774y(AbstractC15632l.f48773a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.mo16774y(AbstractC15632l.f48776d);
            case 6:
                EnumC15621a enumC15621a2 = EnumC15621a.EPOCH_DAY;
                if (temporalAccessor.mo16770f(enumC15621a2)) {
                    return LocalDate.ofEpochDay(temporalAccessor.mo16773u(enumC15621a2));
                }
                return null;
            default:
                EnumC15621a enumC15621a3 = EnumC15621a.NANO_OF_DAY;
                if (temporalAccessor.mo16770f(enumC15621a3)) {
                    return LocalTime.m16850W(temporalAccessor.mo16773u(enumC15621a3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f48782a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
