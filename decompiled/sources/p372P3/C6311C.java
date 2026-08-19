package p372P3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: P3.C */
/* JADX INFO: loaded from: classes.dex */
public final class C6311C {

    /* JADX INFO: renamed from: c */
    public static final C6311C f20443c = new C6311C(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f20444a;

    /* JADX INFO: renamed from: b */
    public final long f20445b;

    public C6311C(long j10, long j11) {
        this.f20444a = j10;
        this.f20445b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6311C.class != obj.getClass()) {
            return false;
        }
        C6311C c6311c = (C6311C) obj;
        return this.f20444a == c6311c.f20444a && this.f20445b == c6311c.f20445b;
    }

    public final int hashCode() {
        return (((int) this.f20444a) * 31) + ((int) this.f20445b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f20444a);
        sb2.append(", position=");
        return AbstractC10763a.m11050h(this.f20445b, "]", sb2);
    }
}
