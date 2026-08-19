package p570X8;

import java.util.ArrayList;

/* JADX INFO: renamed from: X8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9081i extends AbstractC9087o {

    /* JADX INFO: renamed from: a */
    public final ArrayList f27836a;

    public C9081i(ArrayList arrayList) {
        this.f27836a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9087o)) {
            return false;
        }
        return this.f27836a.equals(((C9081i) ((AbstractC9087o) obj)).f27836a);
    }

    public final int hashCode() {
        return this.f27836a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f27836a + "}";
    }
}
