package p178H;

/* JADX INFO: renamed from: H.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3141e {

    /* JADX INFO: renamed from: a */
    public final int f9444a;

    /* JADX INFO: renamed from: b */
    public final Throwable f9445b;

    public C3141e(int i10, Throwable th2) {
        this.f9444a = i10;
        this.f9445b = th2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3141e)) {
            return false;
        }
        C3141e c3141e = (C3141e) obj;
        if (this.f9444a == c3141e.f9444a) {
            Throwable th2 = c3141e.f9445b;
            Throwable th3 = this.f9445b;
            if (th3 == null) {
                if (th2 == null) {
                    return true;
                }
            } else if (th3.equals(th2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f9444a ^ 1000003) * 1000003;
        Throwable th2 = this.f9445b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f9444a + ", cause=" + this.f9445b + "}";
    }
}
