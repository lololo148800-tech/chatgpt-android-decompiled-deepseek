package mm;

import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7966P5;

/* JADX INFO: renamed from: mm.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C17321x implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final long f55153Y;

    public /* synthetic */ C17321x(long j10) {
        this.f55153Y = j10;
    }

    /* JADX INFO: renamed from: a */
    public static int m18981a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public static String m18982b(long j10) {
        if (j10 >= 0) {
            AbstractC7966P5.m8254b(10);
            String string = Long.toString(j10, 10);
            AbstractC16544l.m18093f(string, "toString(...)");
            return string;
        }
        long j11 = 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        AbstractC7966P5.m8254b(10);
        String string2 = Long.toString(j12, 10);
        AbstractC16544l.m18093f(string2, "toString(...)");
        AbstractC7966P5.m8254b(10);
        String string3 = Long.toString(j13, 10);
        AbstractC16544l.m18093f(string3, "toString(...)");
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((C17321x) obj).f55153Y;
        long j11 = this.f55153Y ^ Long.MIN_VALUE;
        long j12 = j10 ^ Long.MIN_VALUE;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17321x) {
            return this.f55153Y == ((C17321x) obj).f55153Y;
        }
        return false;
    }

    public final int hashCode() {
        return m18981a(this.f55153Y);
    }

    public final String toString() {
        return m18982b(this.f55153Y);
    }
}
