package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import p463Sn.C7157j;
import p559Wn.InterfaceC8975g;
import p817j$.time.DateTimeException;
import p817j$.time.LocalDate;
import p817j$.time.chrono.ChronoLocalDate;

/* JADX INFO: renamed from: Mn.x */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7157j.class)
public final class C5554x implements Comparable<C5554x> {
    public static final C5552v Companion = new C5552v();

    /* JADX INFO: renamed from: Y */
    public final LocalDate f18006Y;

    static {
        LocalDate MIN = LocalDate.MIN;
        AbstractC16544l.m18093f(MIN, "MIN");
        new C5554x(MIN);
        LocalDate MAX = LocalDate.MAX;
        AbstractC16544l.m18093f(MAX, "MAX");
        new C5554x(MAX);
    }

    public C5554x(LocalDate value) {
        AbstractC16544l.m18094g(value, "value");
        this.f18006Y = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5554x c5554x) {
        C5554x other = c5554x;
        AbstractC16544l.m18094g(other, "other");
        return this.f18006Y.compareTo((ChronoLocalDate) other.f18006Y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5554x) {
                if (AbstractC16544l.m18089b(this.f18006Y, ((C5554x) obj).f18006Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18006Y.hashCode();
    }

    public final String toString() {
        String string = this.f18006Y.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5554x(int i10, int i11, int i12) {
        try {
            LocalDate localDateM16800of = LocalDate.m16800of(i10, i11, i12);
            AbstractC16544l.m18091d(localDateM16800of);
            this(localDateM16800of);
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
