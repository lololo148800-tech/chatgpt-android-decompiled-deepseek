package p053C;

import android.hardware.camera2.params.OutputConfiguration;
import p817j$.util.Objects;

/* JADX INFO: renamed from: C.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1477l {

    /* JADX INFO: renamed from: a */
    public final OutputConfiguration f3888a;

    /* JADX INFO: renamed from: b */
    public String f3889b;

    /* JADX INFO: renamed from: c */
    public long f3890c = 1;

    public C1477l(OutputConfiguration outputConfiguration) {
        this.f3888a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1477l)) {
            return false;
        }
        C1477l c1477l = (C1477l) obj;
        return Objects.equals(this.f3888a, c1477l.f3888a) && this.f3890c == c1477l.f3890c && Objects.equals(this.f3889b, c1477l.f3889b);
    }

    public final int hashCode() {
        int iHashCode = this.f3888a.hashCode() ^ 31;
        int i10 = (iHashCode << 5) - iHashCode;
        String str = this.f3889b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
        int i11 = (iHashCode2 << 5) - iHashCode2;
        long j10 = this.f3890c;
        return ((int) (j10 ^ (j10 >>> 32))) ^ i11;
    }
}
