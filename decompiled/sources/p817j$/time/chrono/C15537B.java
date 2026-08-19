package p817j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p817j$.time.AbstractC15534b;
import p817j$.time.LocalDate;
import p817j$.time.LocalTime;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalAmount;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.B */
/* JADX INFO: loaded from: classes4.dex */
public final class C15537B extends AbstractC15547c {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a */
    private final transient LocalDate f48547a;

    C15537B(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f48547a = localDate;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16812a() {
        return C15570z.f48610d;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C15570z.f48610d.getClass();
        return this.f48547a.hashCode() ^ (-1990173233);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: B */
    public final InterfaceC15556l mo16801B() {
        return m16908U() >= 1 ? EnumC15538C.ROC : EnumC15538C.BEFORE_ROC;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17147y(this);
        }
        if (!AbstractC15551g.m16956h(this, interfaceC15635o)) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        int i10 = AbstractC15536A.f48546a[enumC15621a.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f48547a.mo16772r(interfaceC15635o);
        }
        if (i10 != 4) {
            return C15570z.f48610d.mo16916H(enumC15621a);
        }
        C15637q c15637qMo17142m = EnumC15621a.YEAR.mo17142m();
        return C15637q.m17168j(1L, m16908U() <= 0 ? (-c15637qMo17142m.m17173e()) + 1912 : c15637qMo17142m.m17172d() - 1911);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            int i10 = AbstractC15536A.f48546a[((EnumC15621a) interfaceC15635o).ordinal()];
            if (i10 == 4) {
                int iM16908U = m16908U();
                if (iM16908U < 1) {
                    iM16908U = 1 - iM16908U;
                }
                return iM16908U;
            }
            LocalDate localDate = this.f48547a;
            if (i10 == 5) {
                return ((((long) m16908U()) * 12) + ((long) localDate.getMonthValue())) - 1;
            }
            if (i10 == 6) {
                return m16908U();
            }
            if (i10 != 7) {
                return localDate.mo16773u(interfaceC15635o);
            }
            return m16908U() < 1 ? 0 : 1;
        }
        return interfaceC15635o.mo17144q(this);
    }

    /* JADX INFO: renamed from: U */
    private int m16908U() {
        return this.f48547a.getYear() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C15537B mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        int iM17170a;
        int i10;
        int i11;
        if (interfaceC15635o instanceof EnumC15621a) {
            EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
            if (mo16773u(enumC15621a) == j10) {
                return this;
            }
            int[] iArr = AbstractC15536A.f48546a;
            int i12 = iArr[enumC15621a.ordinal()];
            LocalDate localDate = this.f48547a;
            if (i12 == 4) {
                iM17170a = C15570z.f48610d.mo16916H(enumC15621a).m17170a(j10, enumC15621a);
                i10 = iArr[enumC15621a.ordinal()];
                if (i10 != 4) {
                    if (m16908U() >= 1) {
                        i11 = iM17170a + 1911;
                    } else {
                        i11 = 1912 - iM17170a;
                    }
                    return m16909W(localDate.m16820k0(i11));
                }
                if (i10 != 6) {
                    return m16909W(localDate.m16820k0(iM17170a + 1911));
                }
                if (i10 == 7) {
                    return m16909W(localDate.m16820k0(1912 - m16908U()));
                }
            } else {
                if (i12 == 5) {
                    C15570z.f48610d.mo16916H(enumC15621a).m17171b(j10, enumC15621a);
                    return m16909W(localDate.plusMonths(j10 - (((((long) m16908U()) * 12) + ((long) localDate.getMonthValue())) - 1)));
                }
                if (i12 == 6 || i12 == 7) {
                    iM17170a = C15570z.f48610d.mo16916H(enumC15621a).m17170a(j10, enumC15621a);
                    i10 = iArr[enumC15621a.ordinal()];
                    if (i10 != 4) {
                        if (m16908U() >= 1) {
                            i11 = iM17170a + 1911;
                        } else {
                            i11 = 1912 - iM17170a;
                        }
                        return m16909W(localDate.m16820k0(i11));
                    }
                    if (i10 != 6) {
                        return m16909W(localDate.m16820k0(iM17170a + 1911));
                    }
                    if (i10 == 7) {
                        return m16909W(localDate.m16820k0(1912 - m16908U()));
                    }
                }
            }
            return m16909W(localDate.mo16787d(j10, interfaceC15635o));
        }
        return (C15537B) super.mo16787d(j10, interfaceC15635o);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: k */
    public final ChronoLocalDate mo16790q(TemporalAdjuster temporalAdjuster) {
        return (C15537B) super.mo16790q(temporalAdjuster);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (C15537B) super.mo16790q(localDate);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: E */
    public final ChronoLocalDate mo16802E(TemporalAmount temporalAmount) {
        return (C15537B) super.mo16802E(temporalAmount);
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: T */
    final ChronoLocalDate mo16912T(long j10) {
        return m16909W(this.f48547a.m16816g0(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: S */
    final ChronoLocalDate mo16911S(long j10) {
        return m16909W(this.f48547a.plusMonths(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: R */
    final ChronoLocalDate mo16910R(long j10) {
        return m16909W(this.f48547a.m16814e0(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final ChronoLocalDate mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15537B) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15537B) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: J */
    public final ChronoLocalDate mo16789m(long j10, TemporalUnit temporalUnit) {
        return (C15537B) super.mo16789m(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return (C15537B) super.mo16789m(j10, chronoUnit);
    }

    /* JADX INFO: renamed from: W */
    private C15537B m16909W(LocalDate localDate) {
        return localDate.equals(this.f48547a) ? this : new C15537B(localDate);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f48547a.toEpochDay();
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15537B) {
            return this.f48547a.equals(((C15537B) obj).f48547a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15539D((byte) 7, this);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: w */
    public final ChronoLocalDateTime mo16822w(LocalTime localTime) {
        return C15549e.m16942Q(this, localTime);
    }
}
