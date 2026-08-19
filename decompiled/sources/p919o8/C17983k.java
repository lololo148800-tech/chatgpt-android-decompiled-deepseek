package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C17983k {

    /* JADX INFO: renamed from: a */
    public final C17986l f57402a;

    /* JADX INFO: renamed from: b */
    public final int f57403b;

    public C17983k(C17986l c17986l, int i10) {
        AbstractC14376f.m15825D(i10, "source");
        this.f57402a = c17986l;
        this.f57403b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17983k)) {
            return false;
        }
        C17983k c17983k = (C17983k) obj;
        return this.f57402a.equals(c17983k.f57402a) && this.f57403b == c17983k.f57403b;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f57403b) + (this.f57402a.f57429a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f57402a + ", source=" + AbstractC17962d.m19614E(this.f57403b) + Separators.RPAREN;
    }
}
