package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import p463Sn.C7158k;
import p559Wn.InterfaceC8975g;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.chrono.ChronoLocalDateTime;

/* JADX INFO: renamed from: Mn.B */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7158k.class)
public final class C5521B implements Comparable<C5521B> {
    public static final C5556z Companion = new C5556z();

    /* JADX INFO: renamed from: Y */
    public final LocalDateTime f17975Y;

    static {
        LocalDateTime MIN = LocalDateTime.MIN;
        AbstractC16544l.m18093f(MIN, "MIN");
        new C5521B(MIN);
        LocalDateTime MAX = LocalDateTime.MAX;
        AbstractC16544l.m18093f(MAX, "MAX");
        new C5521B(MAX);
    }

    public C5521B(LocalDateTime value) {
        AbstractC16544l.m18094g(value, "value");
        this.f17975Y = value;
    }

    /* JADX INFO: renamed from: a */
    public final C5554x m5923a() {
        LocalDate localDateMo16841c = this.f17975Y.mo16841c();
        AbstractC16544l.m18093f(localDateMo16841c, "toLocalDate(...)");
        return new C5554x(localDateMo16841c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5521B c5521b) {
        C5521B other = c5521b;
        AbstractC16544l.m18094g(other, "other");
        return this.f17975Y.compareTo((ChronoLocalDateTime<?>) other.f17975Y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5521B) {
                if (AbstractC16544l.m18089b(this.f17975Y, ((C5521B) obj).f17975Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17975Y.hashCode();
    }

    public final String toString() {
        String string = this.f17975Y.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
