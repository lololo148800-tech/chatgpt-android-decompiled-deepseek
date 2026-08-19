package p326N;

import p228J.C3830d;

/* JADX INFO: renamed from: N.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5559a {

    /* JADX INFO: renamed from: a */
    public final String f18023a;

    /* JADX INFO: renamed from: b */
    public final C3830d f18024b;

    public C5559a(String str, C3830d c3830d) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f18023a = str;
        if (c3830d == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f18024b = c3830d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5559a)) {
            return false;
        }
        C5559a c5559a = (C5559a) obj;
        return this.f18023a.equals(c5559a.f18023a) && this.f18024b.equals(c5559a.f18024b);
    }

    public final int hashCode() {
        return ((this.f18023a.hashCode() ^ 1000003) * 1000003) ^ this.f18024b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f18023a + ", cameraConfigId=" + this.f18024b + "}";
    }
}
