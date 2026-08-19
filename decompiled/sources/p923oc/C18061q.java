package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18061q extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57614a;

    /* JADX INFO: renamed from: b */
    public final String f57615b;

    public C18061q(String destination, String str) {
        AbstractC16544l.m18094g(destination, "destination");
        this.f57614a = destination;
        this.f57615b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18061q)) {
            return false;
        }
        C18061q c18061q = (C18061q) obj;
        return AbstractC16544l.m18089b(this.f57614a, c18061q.f57614a) && AbstractC16544l.m18089b(this.f57615b, c18061q.f57615b);
    }

    public final int hashCode() {
        return this.f57615b.hashCode() + (this.f57614a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstLink(destination=");
        sb2.append(this.f57614a);
        sb2.append(", title=");
        return AbstractC9306j0.m9891j(this.f57615b, Separators.RPAREN, sb2);
    }
}
