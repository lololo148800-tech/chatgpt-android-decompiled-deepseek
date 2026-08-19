package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.P */
/* JADX INFO: loaded from: classes.dex */
public final class C17924P {

    /* JADX INFO: renamed from: a */
    public final C17927Q f57136a;

    /* JADX INFO: renamed from: b */
    public final int f57137b;

    public C17924P(C17927Q c17927q, int i10) {
        AbstractC14376f.m15825D(i10, "source");
        this.f57136a = c17927q;
        this.f57137b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17924P)) {
            return false;
        }
        C17924P c17924p = (C17924P) obj;
        return this.f57136a.equals(c17924p.f57136a) && this.f57137b == c17924p.f57137b;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f57137b) + (this.f57136a.f57141a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f57136a + ", source=" + AbstractC17962d.m19615F(this.f57137b) + Separators.RPAREN;
    }
}
