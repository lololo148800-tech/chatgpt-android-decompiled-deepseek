package p817j$.time.temporal;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.DateTimeException;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.format.EnumC15578E;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.j */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC15630j implements InterfaceC15635o {
    public static final EnumC15630j JULIAN_DAY;
    public static final EnumC15630j MODIFIED_JULIAN_DAY;
    public static final EnumC15630j RATA_DIE;

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ EnumC15630j[] f48768d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a */
    private final transient String f48769a;

    /* JADX INFO: renamed from: b */
    private final transient C15637q f48770b;

    /* JADX INFO: renamed from: c */
    private final transient long f48771c;

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: A */
    public final boolean mo17138A() {
        return true;
    }

    public static EnumC15630j valueOf(String str) {
        return (EnumC15630j) Enum.valueOf(EnumC15630j.class, str);
    }

    public static EnumC15630j[] values() {
        return (EnumC15630j[]) f48768d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        EnumC15630j enumC15630j = new EnumC15630j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = enumC15630j;
        EnumC15630j enumC15630j2 = new EnumC15630j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = enumC15630j2;
        EnumC15630j enumC15630j3 = new EnumC15630j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = enumC15630j3;
        f48768d = new EnumC15630j[]{enumC15630j, enumC15630j2, enumC15630j3};
    }

    private EnumC15630j(String str, int i10, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j10) {
        super(str, i10);
        this.f48769a = str2;
        this.f48770b = C15637q.m17168j((-365243219162L) + j10, 365241780471L + j10);
        this.f48771c = j10;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: m */
    public final C15637q mo17142m() {
        return this.f48770b;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: r */
    public final boolean mo17145r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo16770f(EnumC15621a.EPOCH_DAY);
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: y */
    public final C15637q mo17147y(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.mo16770f(EnumC15621a.EPOCH_DAY)) {
            throw new DateTimeException("Unsupported field: " + this);
        }
        return this.f48770b;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: q */
    public final long mo17144q(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo16773u(EnumC15621a.EPOCH_DAY) + this.f48771c;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: u */
    public final Temporal mo17146u(Temporal temporal, long j10) {
        if (!this.f48770b.m17177i(j10)) {
            throw new DateTimeException("Invalid value: " + this.f48769a + Separators.f31991SP + j10);
        }
        return temporal.mo16787d(AbstractC15529a.m16752p(j10, this.f48771c), EnumC15621a.EPOCH_DAY);
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: o */
    public final TemporalAccessor mo17143o(HashMap map, TemporalAccessor temporalAccessor, EnumC15578E enumC15578E) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        InterfaceC15555k interfaceC15555kM16964p = AbstractC15551g.m16964p(temporalAccessor);
        EnumC15578E enumC15578E2 = EnumC15578E.LENIENT;
        long j10 = this.f48771c;
        if (enumC15578E == enumC15578E2) {
            return interfaceC15555kM16964p.mo16922l(AbstractC15529a.m16752p(jLongValue, j10));
        }
        this.f48770b.m17171b(jLongValue, this);
        return interfaceC15555kM16964p.mo16922l(jLongValue - j10);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f48769a;
    }
}
