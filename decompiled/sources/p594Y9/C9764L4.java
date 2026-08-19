package p594Y9;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Y9.L4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9764L4 {

    /* JADX INFO: renamed from: a */
    public final String f29289a;

    public C9764L4(String str) {
        this.f29289a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9764L4) {
            if (this.f29289a.equals(((C9764L4) obj).f29289a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29289a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f29289a, ", enableFirelog=true, firelogEventType=1}", new StringBuilder("MLKitLoggingOptions{libraryName="));
    }
}
