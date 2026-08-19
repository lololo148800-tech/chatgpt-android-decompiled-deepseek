package p817j$.time.format;

import java.util.Locale;
import p817j$.time.DateTimeException;
import p817j$.time.ZoneId;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.y */
/* JADX INFO: loaded from: classes4.dex */
final class C15605y {

    /* JADX INFO: renamed from: a */
    private TemporalAccessor f48723a;

    /* JADX INFO: renamed from: b */
    private DateTimeFormatter f48724b;

    /* JADX INFO: renamed from: c */
    private int f48725c;

    C15605y(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        InterfaceC15555k interfaceC15555kM17022a = dateTimeFormatter.m17022a();
        if (interfaceC15555kM17022a != null) {
            InterfaceC15555k interfaceC15555k = (InterfaceC15555k) temporalAccessor.mo16774y(AbstractC15632l.m17159e());
            ZoneId zoneId = (ZoneId) temporalAccessor.mo16774y(AbstractC15632l.m17166l());
            ChronoLocalDate chronoLocalDateMo16924p = null;
            interfaceC15555kM17022a = Objects.equals(interfaceC15555kM17022a, interfaceC15555k) ? null : interfaceC15555kM17022a;
            Objects.equals(null, zoneId);
            if (interfaceC15555kM17022a != null) {
                InterfaceC15555k interfaceC15555k2 = interfaceC15555kM17022a != null ? interfaceC15555kM17022a : interfaceC15555k;
                if (interfaceC15555kM17022a != null) {
                    if (temporalAccessor.mo16770f(EnumC15621a.EPOCH_DAY)) {
                        chronoLocalDateMo16924p = interfaceC15555k2.mo16924p(temporalAccessor);
                    } else if (interfaceC15555kM17022a != C15562r.f48594d || interfaceC15555k != null) {
                        for (EnumC15621a enumC15621a : EnumC15621a.values()) {
                            if (enumC15621a.mo17138A() && temporalAccessor.mo16770f(enumC15621a)) {
                                throw new DateTimeException("Unable to apply override chronology '" + interfaceC15555kM17022a + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new C15604x(chronoLocalDateMo16924p, temporalAccessor, interfaceC15555k2, zoneId);
            }
        }
        this.f48723a = temporalAccessor;
        this.f48724b = dateTimeFormatter;
    }

    /* JADX INFO: renamed from: d */
    final TemporalAccessor m17104d() {
        return this.f48723a;
    }

    /* JADX INFO: renamed from: c */
    final Locale m17103c() {
        return this.f48724b.m17024c();
    }

    /* JADX INFO: renamed from: b */
    final C15576C m17102b() {
        return this.f48724b.m17023b();
    }

    /* JADX INFO: renamed from: g */
    final void m17107g() {
        this.f48725c++;
    }

    /* JADX INFO: renamed from: a */
    final void m17101a() {
        this.f48725c--;
    }

    /* JADX INFO: renamed from: f */
    final Object m17106f(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.f48723a;
        Object objMo16774y = temporalAccessor.mo16774y(temporalQuery);
        if (objMo16774y != null || this.f48725c != 0) {
            return objMo16774y;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    /* JADX INFO: renamed from: e */
    final Long m17105e(InterfaceC15635o interfaceC15635o) {
        int i10 = this.f48725c;
        TemporalAccessor temporalAccessor = this.f48723a;
        if (i10 <= 0 || temporalAccessor.mo16770f(interfaceC15635o)) {
            return Long.valueOf(temporalAccessor.mo16773u(interfaceC15635o));
        }
        return null;
    }

    public final String toString() {
        return this.f48723a.toString();
    }
}
