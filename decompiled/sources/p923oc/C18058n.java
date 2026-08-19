package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18058n extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57611a;

    /* JADX INFO: renamed from: b */
    public final String f57612b;

    public C18058n(String str, String destination) {
        AbstractC16544l.m18094g(destination, "destination");
        this.f57611a = str;
        this.f57612b = destination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18058n)) {
            return false;
        }
        C18058n c18058n = (C18058n) obj;
        return AbstractC16544l.m18089b(this.f57611a, c18058n.f57611a) && AbstractC16544l.m18089b(this.f57612b, c18058n.f57612b);
    }

    public final int hashCode() {
        return this.f57612b.hashCode() + (this.f57611a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstImage(title=");
        sb2.append(this.f57611a);
        sb2.append(", destination=");
        return AbstractC9306j0.m9891j(this.f57612b, Separators.RPAREN, sb2);
    }
}
