package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17925P0 {

    /* JADX INFO: renamed from: a */
    public final C17928Q0 f57138a;

    /* JADX INFO: renamed from: b */
    public final int f57139b;

    public C17925P0(C17928Q0 c17928q0, int i10) {
        AbstractC14376f.m15825D(i10, "source");
        this.f57138a = c17928q0;
        this.f57139b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17925P0)) {
            return false;
        }
        C17925P0 c17925p0 = (C17925P0) obj;
        return this.f57138a.equals(c17925p0.f57138a) && this.f57139b == c17925p0.f57139b;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f57139b) + (this.f57138a.f57142a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f57138a + ", source=" + AbstractC17976h1.m19680o(this.f57139b) + Separators.RPAREN;
    }
}
