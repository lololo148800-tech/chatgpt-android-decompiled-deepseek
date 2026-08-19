package p817j$.time.chrono;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import p817j$.time.DateTimeException;
import p817j$.time.LocalDate;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: j$.time.chrono.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C15568x implements InterfaceC15556l, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C15568x f48604d;

    /* JADX INFO: renamed from: e */
    private static final C15568x[] f48605e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a */
    private final transient int f48606a;

    /* JADX INFO: renamed from: b */
    private final transient LocalDate f48607b;

    /* JADX INFO: renamed from: c */
    private final transient String f48608c;

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16957i(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo16771o(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16953e(this, (EnumC15621a) interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long mo16773u(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16954f(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object mo16774y(TemporalQuery temporalQuery) {
        return AbstractC15551g.m16961m(this, temporalQuery);
    }

    static {
        C15568x c15568x = new C15568x(-1, LocalDate.m16800of(1868, 1, 1), "Meiji");
        f48604d = c15568x;
        f48605e = new C15568x[]{c15568x, new C15568x(0, LocalDate.m16800of(1912, 7, 30), "Taisho"), new C15568x(1, LocalDate.m16800of(1926, 12, 25), "Showa"), new C15568x(2, LocalDate.m16800of(1989, 1, 8), "Heisei"), new C15568x(3, LocalDate.m16800of(2019, 5, 1), "Reiwa")};
    }

    /* JADX INFO: renamed from: l */
    static C15568x m16994l() {
        C15568x[] c15568xArr = f48605e;
        return c15568xArr[c15568xArr.length - 1];
    }

    /* JADX INFO: renamed from: z */
    static long m16997z() {
        int year = 1000000000 - m16994l().f48607b.getYear();
        C15568x[] c15568xArr = f48605e;
        int year2 = c15568xArr[0].f48607b.getYear();
        for (int i10 = 1; i10 < c15568xArr.length; i10++) {
            C15568x c15568x = c15568xArr[i10];
            year = Math.min(year, (c15568x.f48607b.getYear() - year2) + 1);
            year2 = c15568x.f48607b.getYear();
        }
        return year;
    }

    /* JADX INFO: renamed from: x */
    static long m16996x() {
        long jM17174f = EnumC15621a.DAY_OF_YEAR.mo17142m().m17174f();
        for (C15568x c15568x : f48605e) {
            jM17174f = Math.min(jM17174f, (c15568x.f48607b.mo16805L() - c15568x.f48607b.m16807T()) + 1);
            if (c15568x.m17000t() != null) {
                jM17174f = Math.min(jM17174f, c15568x.m17000t().f48607b.m16807T() - 1);
            }
        }
        return jM17174f;
    }

    private C15568x(int i10, LocalDate localDate, String str) {
        this.f48606a = i10;
        this.f48607b = localDate;
        this.f48608c = str;
    }

    /* JADX INFO: renamed from: p */
    final LocalDate m16999p() {
        return this.f48607b;
    }

    /* JADX INFO: renamed from: v */
    public static C15568x m16995v(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            C15568x[] c15568xArr = f48605e;
            if (i11 < c15568xArr.length) {
                return c15568xArr[i11];
            }
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(getValue(), EnumC15621a.ERA);
    }

    /* JADX INFO: renamed from: D */
    public static C15568x[] m16992D() {
        C15568x[] c15568xArr = f48605e;
        return (C15568x[]) Arrays.copyOf(c15568xArr, c15568xArr.length);
    }

    /* JADX INFO: renamed from: g */
    static C15568x m16993g(LocalDate localDate) {
        if (localDate.m16809W(C15567w.f48600d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        C15568x[] c15568xArr = f48605e;
        for (int length = c15568xArr.length - 1; length >= 0; length--) {
            C15568x c15568x = c15568xArr[length];
            if (localDate.compareTo((ChronoLocalDate) c15568x.f48607b) >= 0) {
                return c15568x;
            }
        }
        return null;
    }

    @Override // p817j$.time.chrono.InterfaceC15556l
    public final int getValue() {
        return this.f48606a;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        EnumC15621a enumC15621a = EnumC15621a.ERA;
        if (interfaceC15635o != enumC15621a) {
            return AbstractC15632l.m17158d(this, interfaceC15635o);
        }
        return C15565u.f48598d.mo16916H(enumC15621a);
    }

    /* JADX INFO: renamed from: t */
    final C15568x m17000t() {
        if (this == m16994l()) {
            return null;
        }
        return m16995v(this.f48606a + 1);
    }

    public final String toString() {
        return this.f48608c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15539D((byte) 5, this);
    }

    /* JADX INFO: renamed from: G */
    final void m16998G(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f48606a);
    }
}
