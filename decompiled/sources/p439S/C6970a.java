package p439S;

import p465T.C7166b;

/* JADX INFO: renamed from: S.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6970a {

    /* JADX INFO: renamed from: a */
    public final C7166b f22281a;

    /* JADX INFO: renamed from: b */
    public final C7166b f22282b;

    public C6970a(C7166b c7166b, C7166b c7166b2) {
        this.f22281a = c7166b;
        this.f22282b = c7166b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6970a)) {
            return false;
        }
        C6970a c6970a = (C6970a) obj;
        return this.f22281a.equals(c6970a.f22281a) && this.f22282b.equals(c6970a.f22282b);
    }

    public final int hashCode() {
        return ((this.f22281a.hashCode() ^ 1000003) * 1000003) ^ this.f22282b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f22281a + ", secondaryOutConfig=" + this.f22282b + "}";
    }
}
