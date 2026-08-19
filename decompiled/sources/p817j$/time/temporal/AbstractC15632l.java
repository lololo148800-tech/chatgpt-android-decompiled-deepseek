package p817j$.time.temporal;

import p817j$.time.AbstractC15534b;
import p817j$.time.DateTimeException;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.temporal.l */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC15632l {

    /* JADX INFO: renamed from: a */
    static final TemporalQuery f48773a = new C15634n(1);

    /* JADX INFO: renamed from: b */
    static final TemporalQuery f48774b = new C15634n(2);

    /* JADX INFO: renamed from: c */
    static final TemporalQuery f48775c = new C15634n(3);

    /* JADX INFO: renamed from: d */
    static final TemporalQuery f48776d = new C15634n(4);

    /* JADX INFO: renamed from: e */
    static final TemporalQuery f48777e = new C15634n(5);

    /* JADX INFO: renamed from: f */
    static final TemporalQuery f48778f = new C15634n(6);

    /* JADX INFO: renamed from: g */
    static final TemporalQuery f48779g = new C15634n(7);

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m17162h(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return 0;
        }
        return (((i10 ^ 7) >> 31) | 1) > 0 ? i11 : i11 + 7;
    }

    /* JADX INFO: renamed from: l */
    public static TemporalQuery m17166l() {
        return f48773a;
    }

    /* JADX INFO: renamed from: d */
    public static C15637q m17158d(TemporalAccessor temporalAccessor, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            Objects.requireNonNull(interfaceC15635o, "field");
            return interfaceC15635o.mo17147y(temporalAccessor);
        }
        if (temporalAccessor.mo16770f(interfaceC15635o)) {
            return ((EnumC15621a) interfaceC15635o).mo17142m();
        }
        throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
    }

    /* JADX INFO: renamed from: e */
    public static TemporalQuery m17159e() {
        return f48774b;
    }

    /* JADX INFO: renamed from: a */
    public static int m17155a(TemporalAccessor temporalAccessor, InterfaceC15635o interfaceC15635o) {
        C15637q c15637qMo16772r = temporalAccessor.mo16772r(interfaceC15635o);
        if (!c15637qMo16772r.m17176h()) {
            throw new C15636p("Invalid field " + interfaceC15635o + " for get() method, use getLong() instead");
        }
        long jMo16773u = temporalAccessor.mo16773u(interfaceC15635o);
        if (c15637qMo16772r.m17177i(jMo16773u)) {
            return (int) jMo16773u;
        }
        throw new DateTimeException("Invalid value for " + interfaceC15635o + " (valid values " + c15637qMo16772r + "): " + jMo16773u);
    }

    /* JADX INFO: renamed from: j */
    public static TemporalQuery m17164j() {
        return f48775c;
    }

    /* JADX INFO: renamed from: k */
    public static TemporalQuery m17165k() {
        return f48777e;
    }

    /* JADX INFO: renamed from: i */
    public static TemporalQuery m17163i() {
        return f48776d;
    }

    /* JADX INFO: renamed from: c */
    public static Object m17157c(TemporalAccessor temporalAccessor, TemporalQuery temporalQuery) {
        if (temporalQuery == f48773a || temporalQuery == f48774b || temporalQuery == f48775c) {
            return null;
        }
        return temporalQuery.queryFrom(temporalAccessor);
    }

    /* JADX INFO: renamed from: f */
    public static TemporalQuery m17160f() {
        return f48778f;
    }

    /* JADX INFO: renamed from: g */
    public static TemporalQuery m17161g() {
        return f48779g;
    }

    /* JADX INFO: renamed from: b */
    public static Temporal m17156b(Temporal temporal, long j10, TemporalUnit temporalUnit) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            temporal = temporal.mo16788e(Long.MAX_VALUE, temporalUnit);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return temporal.mo16788e(j11, temporalUnit);
    }
}
