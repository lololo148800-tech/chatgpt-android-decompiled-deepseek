package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p463Sn.C7156i;
import p523V9.AbstractC8128k6;
import p559Wn.InterfaceC8975g;
import p817j$.time.DateTimeException;
import p817j$.time.Instant;

/* JADX INFO: renamed from: Mn.u */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7156i.class)
public final class C5551u implements Comparable<C5551u> {
    public static final C5550t Companion = new C5550t();

    /* JADX INFO: renamed from: Z */
    public static final C5551u f18000Z;

    /* JADX INFO: renamed from: o0 */
    public static final C5551u f18001o0;

    /* JADX INFO: renamed from: p0 */
    public static final C5551u f18002p0;

    /* JADX INFO: renamed from: q0 */
    public static final C5551u f18003q0;

    /* JADX INFO: renamed from: Y */
    public final Instant f18004Y;

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        AbstractC16544l.m18093f(instantOfEpochSecond, "ofEpochSecond(...)");
        f18000Z = new C5551u(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        AbstractC16544l.m18093f(instantOfEpochSecond2, "ofEpochSecond(...)");
        f18001o0 = new C5551u(instantOfEpochSecond2);
        Instant MIN = Instant.MIN;
        AbstractC16544l.m18093f(MIN, "MIN");
        f18002p0 = new C5551u(MIN);
        Instant MAX = Instant.MAX;
        AbstractC16544l.m18093f(MAX, "MAX");
        f18003q0 = new C5551u(MAX);
    }

    public C5551u(Instant value) {
        AbstractC16544l.m18094g(value, "value");
        this.f18004Y = value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C5551u other) {
        AbstractC16544l.m18094g(other, "other");
        return this.f18004Y.compareTo(other.f18004Y);
    }

    /* JADX INFO: renamed from: b */
    public final long m5946b(C5551u other) {
        AbstractC16544l.m18094g(other, "other");
        C21554a c21554a = C21555b.f68260Z;
        Instant instant = this.f18004Y;
        long epochSecond = instant.getEpochSecond();
        Instant instant2 = other.f18004Y;
        return C21555b.m21839i(AbstractC8128k6.m8645k(epochSecond - instant2.getEpochSecond(), EnumC21557d.SECONDS), AbstractC8128k6.m8644j(instant.getNano() - instant2.getNano(), EnumC21557d.NANOSECONDS));
    }

    /* JADX INFO: renamed from: c */
    public final C5551u m5947c(long j10) throws Exception {
        C21554a c21554a = C21555b.f68260Z;
        try {
            Instant instantPlusNanos = this.f18004Y.plusSeconds(C21555b.m21841k(j10, EnumC21557d.SECONDS)).plusNanos(C21555b.m21836f(j10));
            AbstractC16544l.m18093f(instantPlusNanos, "plusNanos(...)");
            return new C5551u(instantPlusNanos);
        } catch (Exception e10) {
            if ((e10 instanceof ArithmeticException) || (e10 instanceof DateTimeException)) {
                return j10 > 0 ? f18003q0 : f18002p0;
            }
            throw e10;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5551u) {
                if (AbstractC16544l.m18089b(this.f18004Y, ((C5551u) obj).f18004Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18004Y.hashCode();
    }

    public final String toString() {
        String string = this.f18004Y.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
