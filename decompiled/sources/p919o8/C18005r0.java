package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18005r0 {

    /* JADX INFO: renamed from: a */
    public final C18008s0 f57486a;

    /* JADX INFO: renamed from: b */
    public final int f57487b;

    public C18005r0(C18008s0 c18008s0, int i10) {
        AbstractC14376f.m15825D(i10, "source");
        this.f57486a = c18008s0;
        this.f57487b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18005r0)) {
            return false;
        }
        C18005r0 c18005r0 = (C18005r0) obj;
        return this.f57486a.equals(c18005r0.f57486a) && this.f57487b == c18005r0.f57487b;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f57487b) + (this.f57486a.f57494a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f57486a + ", source=" + AbstractC17962d.m19625P(this.f57487b) + Separators.RPAREN;
    }
}
