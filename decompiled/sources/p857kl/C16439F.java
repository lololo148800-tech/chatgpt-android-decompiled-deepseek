package p857kl;

/* JADX INFO: renamed from: kl.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C16439F {

    /* JADX INFO: renamed from: d */
    public static final C16439F f50993d = new C16439F("HTTP", 2, 0);

    /* JADX INFO: renamed from: e */
    public static final C16439F f50994e = new C16439F("HTTP", 1, 1);

    /* JADX INFO: renamed from: f */
    public static final C16439F f50995f = new C16439F("HTTP", 1, 0);

    /* JADX INFO: renamed from: g */
    public static final C16439F f50996g = new C16439F("SPDY", 3, 0);

    /* JADX INFO: renamed from: h */
    public static final C16439F f50997h = new C16439F("QUIC", 1, 0);

    /* JADX INFO: renamed from: a */
    public final String f50998a;

    /* JADX INFO: renamed from: b */
    public final int f50999b;

    /* JADX INFO: renamed from: c */
    public final int f51000c;

    public C16439F(String str, int i10, int i11) {
        this.f50998a = str;
        this.f50999b = i10;
        this.f51000c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16439F)) {
            return false;
        }
        C16439F c16439f = (C16439F) obj;
        return this.f50998a.equals(c16439f.f50998a) && this.f50999b == c16439f.f50999b && this.f51000c == c16439f.f51000c;
    }

    public final int hashCode() {
        return (((this.f50998a.hashCode() * 31) + this.f50999b) * 31) + this.f51000c;
    }

    public final String toString() {
        return this.f50998a + '/' + this.f50999b + '.' + this.f51000c;
    }
}
