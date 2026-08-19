package p817j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.AbstractC15534b;
import p817j$.time.LocalDate;
import p817j$.time.LocalTime;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalAmount;
import p817j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C15560p extends AbstractC15547c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a */
    private final transient C15558n f48588a;

    /* JADX INFO: renamed from: b */
    private final transient int f48589b;

    /* JADX INFO: renamed from: c */
    private final transient int f48590c;

    /* JADX INFO: renamed from: d */
    private final transient int f48591d;

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16812a() {
        return this.f48588a;
    }

    /* JADX INFO: renamed from: V */
    static C15560p m16981V(C15558n c15558n, int i10, int i11, int i12) {
        return new C15560p(c15558n, i10, i11, i12);
    }

    /* JADX INFO: renamed from: W */
    static C15560p m16982W(C15558n c15558n, long j10) {
        return new C15560p(c15558n, j10);
    }

    private C15560p(C15558n c15558n, int i10, int i11, int i12) {
        c15558n.m16976V(i10, i11, i12);
        this.f48588a = c15558n;
        this.f48589b = i10;
        this.f48590c = i11;
        this.f48591d = i12;
    }

    private C15560p(C15558n c15558n, long j10) {
        int[] iArrM16977W = c15558n.m16977W((int) j10);
        this.f48588a = c15558n;
        this.f48589b = iArrM16977W[0];
        this.f48590c = iArrM16977W[1];
        this.f48591d = iArrM16977W[2];
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: B */
    public final InterfaceC15556l mo16801B() {
        return EnumC15561q.f48592AH;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: L */
    public final int mo16805L() {
        return this.f48588a.m16979Y(this.f48589b);
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
        int i10 = AbstractC15559o.f48587a[enumC15621a.ordinal()];
        C15558n c15558n = this.f48588a;
        if (i10 == 1) {
            return C15637q.m17168j(1L, c15558n.m16978X(this.f48589b, this.f48590c));
        }
        if (i10 != 2) {
            return i10 != 3 ? c15558n.mo16916H(enumC15621a) : C15637q.m17168j(1L, 5L);
        }
        return C15637q.m17168j(1L, mo16805L());
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17144q(this);
        }
        int i10 = AbstractC15559o.f48587a[((EnumC15621a) interfaceC15635o).ordinal()];
        int i11 = this.f48590c;
        int i12 = this.f48591d;
        int i13 = this.f48589b;
        switch (i10) {
            case 1:
                return i12;
            case 2:
                return m16980U();
            case 3:
                return ((i12 - 1) / 7) + 1;
            case 4:
                return ((int) AbstractC15529a.m16749m(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((i12 - 1) % 7) + 1;
            case 6:
                return ((m16980U() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((m16980U() - 1) / 7) + 1;
            case 9:
                return i11;
            case 10:
                return ((((long) i13) * 12) + ((long) i11)) - 1;
            case 11:
                return i13;
            case 12:
                return i13;
            case 13:
                return i13 <= 1 ? 0 : 1;
            default:
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C15560p mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return (C15560p) super.mo16787d(j10, interfaceC15635o);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        C15558n c15558n = this.f48588a;
        c15558n.mo16916H(enumC15621a).m17171b(j10, enumC15621a);
        int i10 = (int) j10;
        int i11 = AbstractC15559o.f48587a[enumC15621a.ordinal()];
        int i12 = this.f48591d;
        int i13 = this.f48590c;
        int i14 = this.f48589b;
        switch (i11) {
            case 1:
                return m16983Z(i14, i13, i10);
            case 2:
                return mo16910R(Math.min(i10, mo16805L()) - m16980U());
            case 3:
                return mo16910R((j10 - mo16773u(EnumC15621a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return mo16910R(j10 - ((long) (((int) AbstractC15529a.m16749m(toEpochDay() + 3, 7)) + 1)));
            case 5:
                return mo16910R(j10 - mo16773u(EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return mo16910R(j10 - mo16773u(EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C15560p(c15558n, j10);
            case 8:
                return mo16910R((j10 - mo16773u(EnumC15621a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return m16983Z(i14, i10, i12);
            case 10:
                return mo16911S(j10 - (((((long) i14) * 12) + ((long) i13)) - 1));
            case 11:
                if (i14 < 1) {
                    i10 = 1 - i10;
                }
                return m16983Z(i10, i13, i12);
            case 12:
                return m16983Z(i10, i13, i12);
            case 13:
                return m16983Z(1 - i14, i13, i12);
            default:
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
    }

    /* JADX INFO: renamed from: Z */
    private C15560p m16983Z(int i10, int i11, int i12) {
        C15558n c15558n = this.f48588a;
        int iM16978X = c15558n.m16978X(i10, i11);
        if (i12 > iM16978X) {
            i12 = iM16978X;
        }
        return new C15560p(c15558n, i10, i11, i12);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: k */
    public final ChronoLocalDate mo16790q(TemporalAdjuster temporalAdjuster) {
        return (C15560p) super.mo16790q(temporalAdjuster);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (C15560p) super.mo16790q(localDate);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: E */
    public final ChronoLocalDate mo16802E(TemporalAmount temporalAmount) {
        return (C15560p) super.mo16802E(temporalAmount);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f48588a.m16976V(this.f48589b, this.f48590c, this.f48591d);
    }

    /* JADX INFO: renamed from: U */
    private int m16980U() {
        return this.f48588a.m16975U(this.f48589b, this.f48590c) + this.f48591d;
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: F */
    public final boolean mo16803F() {
        return this.f48588a.mo16919M(this.f48589b);
    }

    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: T */
    final ChronoLocalDate mo16912T(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f48589b) + ((long) ((int) j10));
        int i10 = (int) j11;
        if (j11 == i10) {
            return m16983Z(i10, this.f48590c, this.f48591d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C15560p mo16911S(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f48589b) * 12) + ((long) (this.f48590c - 1)) + j10;
        return m16983Z(this.f48588a.m16974R(AbstractC15529a.m16750n(j11, 12L)), ((int) AbstractC15529a.m16749m(j11, 12L)) + 1, this.f48591d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p817j$.time.chrono.AbstractC15547c
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C15560p mo16910R(long j10) {
        return new C15560p(this.f48588a, toEpochDay() + j10);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final ChronoLocalDate mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15560p) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal mo16788e(long j10, TemporalUnit temporalUnit) {
        return (C15560p) super.mo16788e(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: J */
    public final ChronoLocalDate mo16789m(long j10, TemporalUnit temporalUnit) {
        return (C15560p) super.mo16789m(j10, temporalUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return (C15560p) super.mo16789m(j10, chronoUnit);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15560p)) {
            return false;
        }
        C15560p c15560p = (C15560p) obj;
        return this.f48589b == c15560p.f48589b && this.f48590c == c15560p.f48590c && this.f48591d == c15560p.f48591d && this.f48588a.equals(c15560p.f48588a);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int iHashCode = this.f48588a.getId().hashCode();
        int i10 = this.f48589b;
        return (iHashCode ^ (i10 & (-2048))) ^ (((i10 << 11) + (this.f48590c << 6)) + this.f48591d);
    }

    @Override // p817j$.time.chrono.AbstractC15547c, p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: w */
    public final ChronoLocalDateTime mo16822w(LocalTime localTime) {
        return C15549e.m16942Q(this, localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15539D((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f48588a);
        objectOutput.writeInt(AbstractC15632l.m17155a(this, EnumC15621a.YEAR));
        objectOutput.writeByte(AbstractC15632l.m17155a(this, EnumC15621a.MONTH_OF_YEAR));
        objectOutput.writeByte(AbstractC15632l.m17155a(this, EnumC15621a.DAY_OF_MONTH));
    }
}
