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

/* JADX INFO: renamed from: j$.time.chrono.H */
/* JADX INFO: loaded from: classes4.dex */
public final class C15543H extends AbstractC15547c {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a */
    private final transient LocalDate f48554a;

    C15543H(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f48554a = localDate;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16812a() {
        return C15541F.f48552d;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C15541F.f48552d.getClass();
        return this.f48554a.hashCode() ^ 146118545;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: B */
    public final InterfaceC15556l mo16801B() {
        return m16927U() >= 1 ? EnumC15544I.f48555BE : EnumC15544I.BEFORE_BE;
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
        int i10 = AbstractC15542G.f48553a[enumC15621a.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f48554a.mo16772r(interfaceC15635o);
        }
        if (i10 != 4) {
            return C15541F.f48552d.mo16916H(enumC15621a);
        }
        C15637q c15637qMo17142m = EnumC15621a.YEAR.mo17142m();
        return C15637q.m17168j(1L, m16927U() <= 0 ? (-(c15637qMo17142m.m17173e() + 543)) + 1 : 543 + c15637qMo17142m.m17172d());
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            int i10 = AbstractC15542G.f48553a[((EnumC15621a) interfaceC15635o).ordinal()];
            if (i10 == 4) {
                int iM16927U = m16927U();
                if (iM16927U < 1) {
                    iM16927U = 1 - iM16927U;
                }
                return iM16927U;
            }
            LocalDate localDate = this.f48554a;
            if (i10 == 5) {
                return ((((long) m16927U()) * 12) + ((long) localDate.getMonthValue())) - 1;
            }
            if (i10 == 6) {
                return m16927U();
            }
            if (i10 != 7) {
                return localDate.mo16773u(interfaceC15635o);
            }
            return m16927U() < 1 ? 0 : 1;
        }
        return interfaceC15635o.mo17144q(this);
    }

    /* JADX INFO: renamed from: U */
    private int m16927U() {
        return this.f48554a.getYear() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C15543H mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        int iM17170a;
        int i10;
        if (interfaceC15635o instanceof EnumC15621a) {
            EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
            if (mo16773u(enumC15621a) == j10) {
                return this;
            }
            int[] iArr = AbstractC15542G.f48553a;
            int i11 = iArr[enumC15621a.ordinal()];
            LocalDate localDate = this.f48554a;
            if (i11 == 4) {
                iM17170a = C15541F.f48552d.mo16916H(enumC15621a).m17170a(j10, enumC15621a);
                i10 = iArr[enumC15621a.ordinal()];
                if (i10 != 4) {
                    if (m16927U() < 1) {
                        iM17170a = 1 - iM17170a;
                    }
                    return m16928W(localDate.m16820k0(iM17170a - 543));
                }
                if (i10 != 6) {
                    return m16928W(localDate.m16820k0(iM17170a - 543));
                }
                if (i10 == 7) {
                    return m16928W(localDate.m16820k0((-542) - m16927U()));
                }
            } else {
                if (i11 == 5) {
                    C15541F.f48552d.mo16916H(enumC15621a).m17171b(j10, enumC15621a);
                    return m16928W(localDate.plusMonths(j10 - (((((long) m16927U()) * 12) + ((long) localDate.getMonthValue())) - 1)));
                }
                if (i11 == 6 || i11 == 7) {
                    iM17170a = C15541F.f48552d.mo16916H(enumC15621a).m17170a(j10, enumC15621a);
                    i10 = iArr[enumC15621a.ordinal()];
                    if (i10 != 4) {
                        if (m16927U() < 1) {
                            iM17170a = 1 - iM17170a;
                        }
                        return m16928W(localDate.m16820k0(iM17170a - 543));
                    }
                    if (i10 != 6) {
                        return m16928W(localDate.m16820k0(iM17170a - 543));
                    }
                    if (i10 == 7) {
                        return m16928W(localDate.m16820k0((-542) - m16927U()));
                    }
                }
            }
            return m16928W(localDate.mo16787d(j10, interfaceC15635o));
        }
        return (C15543H) super.mo16787d(j10, interfaceC15635o);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: k */
    public final ChronoLocalDate mo16790q(TemporalAdjuster temporalAdjuster) {
        return (C15543H) super.mo16790q(temporalAdjuster);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (C15543H) super.mo16790q(localDate);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: E */
    public final ChronoLocalDate mo16802E(TemporalAmount temporalAmount) {
        return (C15543H) super.mo16802E(temporalAmount);
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: T */
    final ChronoLocalDate mo16912T(long j10) {
        return m16928W(this.f48554a.m16816g0(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: S */
    final ChronoLocalDate mo16911S(long j10) {
        return m16928W(this.f48554a.plusMonths(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: R */
    final ChronoLocalDate mo16910R(long j10) {
        return m16928W(this.f48554a.m16814e0(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final ChronoLocalDate mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15543H) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15543H) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: J */
    public final ChronoLocalDate mo16789m(long j10, TemporalUnit temporalUnit) {
        return (C15543H) super.mo16789m(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return (C15543H) super.mo16789m(j10, chronoUnit);
    }

    /* JADX INFO: renamed from: W */
    private C15543H m16928W(LocalDate localDate) {
        return localDate.equals(this.f48554a) ? this : new C15543H(localDate);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f48554a.toEpochDay();
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15543H) {
            return this.f48554a.equals(((C15543H) obj).f48554a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15539D((byte) 8, this);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: w */
    public final ChronoLocalDateTime mo16822w(LocalTime localTime) {
        return C15549e.m16942Q(this, localTime);
    }
}
