package p053C;

import android.hardware.camera2.params.OutputConfiguration;
import p817j$.util.Objects;

/* JADX INFO: renamed from: C.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1479n {

    /* JADX INFO: renamed from: a */
    public final OutputConfiguration f3891a;

    /* JADX INFO: renamed from: b */
    public long f3892b = 1;

    public C1479n(OutputConfiguration outputConfiguration) {
        this.f3891a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1479n)) {
            return false;
        }
        C1479n c1479n = (C1479n) obj;
        return Objects.equals(this.f3891a, c1479n.f3891a) && this.f3892b == c1479n.f3892b;
    }

    public final int hashCode() {
        int iHashCode = this.f3891a.hashCode() ^ 31;
        int i10 = (iHashCode << 5) - iHashCode;
        long j10 = this.f3892b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ i10;
    }
}
