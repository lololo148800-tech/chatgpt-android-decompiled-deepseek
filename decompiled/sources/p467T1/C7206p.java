package p467T1;

import p492U1.C7548m;
import p571X9.AbstractC9119D4;

/* JADX INFO: renamed from: T1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7206p {

    /* JADX INFO: renamed from: c */
    public static final C7206p f22874c = new C7206p(AbstractC9119D4.m9650c(0), AbstractC9119D4.m9650c(0));

    /* JADX INFO: renamed from: a */
    public final long f22875a;

    /* JADX INFO: renamed from: b */
    public final long f22876b;

    public C7206p(long j10, long j11) {
        this.f22875a = j10;
        this.f22876b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7206p)) {
            return false;
        }
        C7206p c7206p = (C7206p) obj;
        return C7548m.m7893a(this.f22875a, c7206p.f22875a) && C7548m.m7893a(this.f22876b, c7206p.f22876b);
    }

    public final int hashCode() {
        return C7548m.m7896d(this.f22876b) + (C7548m.m7896d(this.f22875a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C7548m.m7897e(this.f22875a)) + ", restLine=" + ((Object) C7548m.m7897e(this.f22876b)) + ')';
    }
}
