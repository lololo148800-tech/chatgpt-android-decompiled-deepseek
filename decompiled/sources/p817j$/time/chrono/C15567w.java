package p817j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p817j$.time.AbstractC15534b;
import p817j$.time.DateTimeException;
import p817j$.time.LocalDate;
import p817j$.time.LocalTime;
import p817j$.time.temporal.C15634n;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalAmount;
import p817j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C15567w extends AbstractC15547c {

    /* JADX INFO: renamed from: d */
    static final LocalDate f48600d = LocalDate.m16800of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a */
    private final transient LocalDate f48601a;

    /* JADX INFO: renamed from: b */
    private transient C15568x f48602b;

    /* JADX INFO: renamed from: c */
    private transient int f48603c;

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: B */
    public final InterfaceC15556l mo16801B() {
        return this.f48602b;
    }

    C15567w(LocalDate localDate) {
        if (localDate.m16809W(f48600d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        C15568x c15568xM16993g = C15568x.m16993g(localDate);
        this.f48602b = c15568xM16993g;
        this.f48603c = (localDate.getYear() - c15568xM16993g.m16999p().getYear()) + 1;
        this.f48601a = localDate;
    }

    C15567w(C15568x c15568x, int i10, LocalDate localDate) {
        if (localDate.m16809W(f48600d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f48602b = c15568x;
        this.f48603c = i10;
        this.f48601a = localDate;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16812a() {
        return C15565u.f48598d;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C15565u.f48598d.getClass();
        return this.f48601a.hashCode() ^ (-688086063);
    }

    /* JADX INFO: renamed from: U */
    public final C15568x m16988U() {
        return this.f48602b;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: L */
    public final int mo16805L() {
        int iMo16805L;
        C15568x c15568x = this.f48602b;
        C15568x c15568xM17000t = c15568x.m17000t();
        LocalDate localDate = this.f48601a;
        if (c15568xM17000t != null && c15568xM17000t.m16999p().getYear() == localDate.getYear()) {
            iMo16805L = c15568xM17000t.m16999p().m16807T() - 1;
        } else {
            iMo16805L = localDate.mo16805L();
        }
        return this.f48603c == 1 ? iMo16805L - (c15568x.m16999p().m16807T() - 1) : iMo16805L;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate, p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC15635o == EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC15635o == EnumC15621a.ALIGNED_WEEK_OF_MONTH || interfaceC15635o == EnumC15621a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).mo17138A();
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17147y(this);
        }
        if (!mo16770f(interfaceC15635o)) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        int i10 = AbstractC15566v.f48599a[enumC15621a.ordinal()];
        if (i10 == 1) {
            return C15637q.m17168j(1L, this.f48601a.m16810X());
        }
        if (i10 == 2) {
            return C15637q.m17168j(1L, mo16805L());
        }
        if (i10 != 3) {
            return C15565u.f48598d.mo16916H(enumC15621a);
        }
        C15568x c15568x = this.f48602b;
        int year = c15568x.m16999p().getYear();
        C15568x c15568xM17000t = c15568x.m17000t();
        return c15568xM17000t != null ? C15637q.m17168j(1L, (c15568xM17000t.m16999p().getYear() - year) + 1) : C15637q.m17168j(1L, 999999999 - year);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17144q(this);
        }
        int i10 = AbstractC15566v.f48599a[((EnumC15621a) interfaceC15635o).ordinal()];
        int i11 = this.f48603c;
        C15568x c15568x = this.f48602b;
        LocalDate localDate = this.f48601a;
        switch (i10) {
            case 2:
                return i11 == 1 ? (localDate.m16807T() - c15568x.m16999p().m16807T()) + 1 : localDate.m16807T();
            case 3:
                return i11;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
            case 8:
                return c15568x.getValue();
            default:
                return localDate.mo16773u(interfaceC15635o);
        }
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C15567w mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
            if (mo16773u(enumC15621a) == j10) {
                return this;
            }
            int[] iArr = AbstractC15566v.f48599a;
            int i10 = iArr[enumC15621a.ordinal()];
            LocalDate localDate = this.f48601a;
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                C15565u c15565u = C15565u.f48598d;
                int iM17170a = c15565u.mo16916H(enumC15621a).m17170a(j10, enumC15621a);
                int i11 = iArr[enumC15621a.ordinal()];
                if (i11 == 3) {
                    return m16987X(localDate.m16820k0(c15565u.mo16921g(this.f48602b, iM17170a)));
                }
                if (i11 == 8) {
                    return m16987X(localDate.m16820k0(c15565u.mo16921g(C15568x.m16995v(iM17170a), this.f48603c)));
                }
                if (i11 == 9) {
                    return m16987X(localDate.m16820k0(iM17170a));
                }
            }
            return m16987X(localDate.mo16787d(j10, interfaceC15635o));
        }
        return (C15567w) super.mo16787d(j10, interfaceC15635o);
    }

    /* JADX INFO: renamed from: Y */
    public final C15567w m16991Y(C15634n c15634n) {
        return (C15567w) super.mo16790q(c15634n);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: k */
    public final ChronoLocalDate mo16790q(TemporalAdjuster temporalAdjuster) {
        return (C15567w) super.mo16790q(temporalAdjuster);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (C15567w) super.mo16790q(localDate);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: E */
    public final ChronoLocalDate mo16802E(TemporalAmount temporalAmount) {
        return (C15567w) super.mo16802E(temporalAmount);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: w */
    public final ChronoLocalDateTime mo16822w(LocalTime localTime) {
        return C15549e.m16942Q(this, localTime);
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: T */
    final ChronoLocalDate mo16912T(long j10) {
        return m16987X(this.f48601a.m16816g0(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: S */
    final ChronoLocalDate mo16911S(long j10) {
        return m16987X(this.f48601a.plusMonths(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: R */
    final ChronoLocalDate mo16910R(long j10) {
        return m16987X(this.f48601a.m16814e0(j10));
    }

    /* JADX INFO: renamed from: V */
    public final C15567w m16989V(long j10, ChronoUnit chronoUnit) {
        return (C15567w) super.mo16788e(j10, (TemporalUnit) chronoUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final ChronoLocalDate mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15567w) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15567w) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: J */
    public final ChronoLocalDate mo16789m(long j10, TemporalUnit temporalUnit) {
        return (C15567w) super.mo16789m(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return (C15567w) super.mo16789m(j10, chronoUnit);
    }

    /* JADX INFO: renamed from: X */
    private C15567w m16987X(LocalDate localDate) {
        return localDate.equals(this.f48601a) ? this : new C15567w(localDate);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f48601a.toEpochDay();
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15567w) {
            return this.f48601a.equals(((C15567w) obj).f48601a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15539D((byte) 4, this);
    }
}
