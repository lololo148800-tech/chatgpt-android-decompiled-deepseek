package p571X9;

/* JADX INFO: renamed from: X9.I4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9149I4 {

    /* JADX INFO: renamed from: a */
    public final String f27927a;

    public C9149I4(String str) {
        this.f27927a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9149I4) {
            if (this.f27927a.equals(((C9149I4) obj).f27927a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27927a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f27927a, ", enableFirelog=true, firelogEventType=1}", new StringBuilder("MLKitLoggingOptions{libraryName="));
    }
}
