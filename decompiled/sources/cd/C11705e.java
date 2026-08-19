package cd;

import p492U1.C7543h;

/* JADX INFO: renamed from: cd.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C11705e {

    /* JADX INFO: renamed from: a */
    public final boolean f35513a;

    /* JADX INFO: renamed from: b */
    public final long f35514b;

    public C11705e(boolean z6, long j10) {
        this.f35513a = z6;
        this.f35514b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11705e)) {
            return false;
        }
        C11705e c11705e = (C11705e) obj;
        return this.f35513a == c11705e.f35513a && C7543h.m7880b(this.f35514b, c11705e.f35514b);
    }

    public final int hashCode() {
        int i10 = this.f35513a ? 1231 : 1237;
        long j10 = this.f35514b;
        return ((int) (j10 ^ (j10 >>> 32))) + (i10 * 31);
    }

    public final String toString() {
        return "█";
    }
}
