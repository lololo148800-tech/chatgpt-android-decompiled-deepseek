package p817j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.Clock;
import p817j$.time.DateTimeException;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.ZoneId;
import p817j$.time.format.EnumC15578E;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.chrono.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15570z extends AbstractC15545a implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final C15570z f48610d = new C15570z();
    private static final long serialVersionUID = 1039765215346859963L;

    private C15570z() {
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    public final String getId() {
        return "Minguo";
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: N */
    public final InterfaceC15556l mo16920N(int i10) {
        if (i10 == 0) {
            return EnumC15538C.BEFORE_ROC;
        }
        if (i10 == 1) {
            return EnumC15538C.ROC;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: t */
    public final String mo16925t() {
        return "roc";
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: D */
    public final ChronoLocalDate mo16914D(int i10, int i11, int i12) {
        return new C15537B(LocalDate.m16800of(i10 + 1911, i11, i12));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: v */
    public final ChronoLocalDate mo16926v(int i10, int i11) {
        return new C15537B(LocalDate.m16798c0(i10 + 1911, i11));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: l */
    public final ChronoLocalDate mo16922l(long j10) {
        return new C15537B(LocalDate.ofEpochDay(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15545a
    /* JADX INFO: renamed from: o */
    public final ChronoLocalDate mo16923o() {
        return new C15537B(LocalDate.m16792R(LocalDate.m16796a0(Clock.systemDefaultZone())));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: p */
    public final ChronoLocalDate mo16924p(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C15537B) {
            return (C15537B) temporalAccessor;
        }
        return new C15537B(LocalDate.m16792R(temporalAccessor));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: M */
    public final boolean mo16919M(long j10) {
        return C15562r.f48594d.mo16919M(j10 + 1911);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: g */
    public final int mo16921g(InterfaceC15556l interfaceC15556l, int i10) {
        if (interfaceC15556l instanceof EnumC15538C) {
            return interfaceC15556l == EnumC15538C.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: K */
    public final List mo16918K() {
        return AbstractC15529a.m16747k(EnumC15538C.values());
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: H */
    public final C15637q mo16916H(EnumC15621a enumC15621a) {
        int i10 = AbstractC15569y.f48609a[enumC15621a.ordinal()];
        if (i10 == 1) {
            C15637q c15637qMo17142m = EnumC15621a.PROLEPTIC_MONTH.mo17142m();
            return C15637q.m17168j(c15637qMo17142m.m17173e() - 22932, c15637qMo17142m.m17172d() - 22932);
        }
        if (i10 == 2) {
            C15637q c15637qMo17142m2 = EnumC15621a.YEAR.mo17142m();
            return C15637q.m17169k(1L, c15637qMo17142m2.m17172d() - 1911, (-c15637qMo17142m2.m17173e()) + 1912);
        }
        if (i10 == 3) {
            C15637q c15637qMo17142m3 = EnumC15621a.YEAR.mo17142m();
            return C15637q.m17168j(c15637qMo17142m3.m17173e() - 1911, c15637qMo17142m3.m17172d() - 1911);
        }
        return enumC15621a.mo17142m();
    }

    @Override // p817j$.time.chrono.AbstractC15545a, p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: G */
    public final ChronoLocalDate mo16915G(Map map, EnumC15578E enumC15578E) {
        return (C15537B) super.mo16915G(map, enumC15578E);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: I */
    public final ChronoZonedDateTime mo16917I(Instant instant, ZoneId zoneId) {
        return C15554j.m16967Q(this, instant, zoneId);
    }

    Object writeReplace() {
        return new C15539D((byte) 1, this);
    }
}
