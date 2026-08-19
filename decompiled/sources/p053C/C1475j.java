package p053C;

import android.hardware.camera2.params.OutputConfiguration;
import p817j$.util.Objects;

/* JADX INFO: renamed from: C.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1475j {

    /* JADX INFO: renamed from: a */
    public final OutputConfiguration f3884a;

    /* JADX INFO: renamed from: b */
    public String f3885b;

    /* JADX INFO: renamed from: c */
    public boolean f3886c;

    /* JADX INFO: renamed from: d */
    public long f3887d = 1;

    public C1475j(OutputConfiguration outputConfiguration) {
        this.f3884a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1475j)) {
            return false;
        }
        C1475j c1475j = (C1475j) obj;
        return Objects.equals(this.f3884a, c1475j.f3884a) && this.f3886c == c1475j.f3886c && this.f3887d == c1475j.f3887d && Objects.equals(this.f3885b, c1475j.f3885b);
    }

    public final int hashCode() {
        int iHashCode = this.f3884a.hashCode() ^ 31;
        int i10 = (this.f3886c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i11 = (i10 << 5) - i10;
        String str = this.f3885b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
        int i12 = (iHashCode2 << 5) - iHashCode2;
        long j10 = this.f3887d;
        return ((int) (j10 ^ (j10 >>> 32))) ^ i12;
    }
}
