package p842k0;

import p523V9.AbstractC8088f6;
import p759g1.C13800b;

/* JADX INFO: renamed from: k0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16303l extends AbstractC16304m {

    /* JADX INFO: renamed from: a */
    public final long f50512a;

    public C16303l(long j10) {
        this.f50512a = j10;
        if (!AbstractC8088f6.m8538d(j10)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16303l)) {
            return false;
        }
        return C13800b.m15303d(this.f50512a, ((C16303l) obj).f50512a);
    }

    public final int hashCode() {
        return C13800b.m15308i(this.f50512a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) C13800b.m15313n(this.f50512a)) + ')';
    }
}
