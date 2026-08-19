package p523V9;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: V9.t6 */
/* JADX INFO: loaded from: classes.dex */
public final class C8200t6 {

    /* JADX INFO: renamed from: a */
    public final String f25644a;

    public C8200t6(String str) {
        this.f25644a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8200t6) {
            if (this.f25644a.equals(((C8200t6) obj).f25644a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f25644a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f25644a, ", enableFirelog=true, firelogEventType=1}", new StringBuilder("MLKitLoggingOptions{libraryName="));
    }
}
