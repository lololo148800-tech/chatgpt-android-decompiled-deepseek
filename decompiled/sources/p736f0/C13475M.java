package p736f0;

import p492U1.C7545j;
import p758g0.C13756d;

/* JADX INFO: renamed from: f0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C13475M {

    /* JADX INFO: renamed from: a */
    public final C13756d f42637a;

    /* JADX INFO: renamed from: b */
    public long f42638b;

    public C13475M(C13756d c13756d, long j10) {
        this.f42637a = c13756d;
        this.f42638b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13475M)) {
            return false;
        }
        C13475M c13475m = (C13475M) obj;
        return this.f42637a.equals(c13475m.f42637a) && C7545j.m7886a(this.f42638b, c13475m.f42638b);
    }

    public final int hashCode() {
        return C7545j.m7889d(this.f42638b) + (this.f42637a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f42637a + ", startSize=" + ((Object) C7545j.m7890e(this.f42638b)) + ')';
    }
}
