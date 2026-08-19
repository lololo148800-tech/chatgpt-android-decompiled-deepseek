package p178H;

import p001A.AbstractC0010F;

/* JADX INFO: renamed from: H.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3139d {

    /* JADX INFO: renamed from: a */
    public final int f9442a;

    /* JADX INFO: renamed from: b */
    public final C3141e f9443b;

    public C3139d(int i10, C3141e c3141e) {
        if (i10 == 0) {
            throw new NullPointerException("Null type");
        }
        this.f9442a = i10;
        this.f9443b = c3141e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3139d)) {
            return false;
        }
        C3139d c3139d = (C3139d) obj;
        if (AbstractC0010F.m17a(this.f9442a, c3139d.f9442a)) {
            C3141e c3141e = c3139d.f9443b;
            C3141e c3141e2 = this.f9443b;
            if (c3141e2 == null) {
                if (c3141e == null) {
                    return true;
                }
            } else if (c3141e2.equals(c3141e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM24h = (AbstractC0010F.m24h(this.f9442a) ^ 1000003) * 1000003;
        C3141e c3141e = this.f9443b;
        return iM24h ^ (c3141e == null ? 0 : c3141e.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CameraState{type=");
        int i10 = this.f9442a;
        if (i10 == 1) {
            str = "PENDING_OPEN";
        } else if (i10 == 2) {
            str = "OPENING";
        } else if (i10 == 3) {
            str = "OPEN";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "CLOSED";
        } else {
            str = "CLOSING";
        }
        sb2.append(str);
        sb2.append(", error=");
        sb2.append(this.f9443b);
        sb2.append("}");
        return sb2.toString();
    }
}
