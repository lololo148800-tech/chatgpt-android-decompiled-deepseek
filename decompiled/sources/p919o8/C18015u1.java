package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18015u1 {

    /* JADX INFO: renamed from: a */
    public final C18018v1 f57509a;

    /* JADX INFO: renamed from: b */
    public final int f57510b;

    public C18015u1(C18018v1 c18018v1, int i10) {
        AbstractC14376f.m15825D(i10, "source");
        this.f57509a = c18018v1;
        this.f57510b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18015u1)) {
            return false;
        }
        C18015u1 c18015u1 = (C18015u1) obj;
        return this.f57509a.equals(c18015u1.f57509a) && this.f57510b == c18015u1.f57510b;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f57510b) + (this.f57509a.f57514a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f57509a + ", source=" + AbstractC17976h1.m19681p(this.f57510b) + Separators.RPAREN;
    }
}
