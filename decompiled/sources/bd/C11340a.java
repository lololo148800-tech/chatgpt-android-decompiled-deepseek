package bd;

import p492U1.C7545j;
import p758g0.C13756d;

/* JADX INFO: renamed from: bd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11340a {

    /* JADX INFO: renamed from: a */
    public final C13756d f34281a;

    /* JADX INFO: renamed from: b */
    public long f34282b;

    public C11340a(C13756d c13756d, long j10) {
        this.f34281a = c13756d;
        this.f34282b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11340a)) {
            return false;
        }
        C11340a c11340a = (C11340a) obj;
        return this.f34281a.equals(c11340a.f34281a) && C7545j.m7886a(this.f34282b, c11340a.f34282b);
    }

    public final int hashCode() {
        return C7545j.m7889d(this.f34282b) + (this.f34281a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
