package p817j$.time.temporal;

import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.Duration;

/* JADX INFO: renamed from: j$.time.temporal.h */
/* JADX INFO: loaded from: classes4.dex */
enum EnumC15628h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a */
    private final String f48763a;

    static {
        Duration duration = Duration.f48512c;
    }

    EnumC15628h(String str) {
        this.f48763a = str;
    }

    @Override // p817j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: o */
    public final Temporal mo17137o(Temporal temporal, long j10) {
        int i10 = AbstractC15622b.f48759a[ordinal()];
        if (i10 == 1) {
            InterfaceC15635o interfaceC15635o = AbstractC15629i.f48766c;
            return temporal.mo16787d(AbstractC15529a.m16745i(temporal.mo16771o(interfaceC15635o), j10), interfaceC15635o);
        }
        if (i10 == 2) {
            return temporal.mo16788e(j10 / 4, ChronoUnit.YEARS).mo16788e((j10 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // p817j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: m */
    public final long mo17136m(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int i10 = AbstractC15622b.f48759a[ordinal()];
        if (i10 == 1) {
            InterfaceC15635o interfaceC15635o = AbstractC15629i.f48766c;
            return AbstractC15529a.m16752p(temporal2.mo16773u(interfaceC15635o), temporal.mo16773u(interfaceC15635o));
        }
        if (i10 == 2) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f48763a;
    }
}
