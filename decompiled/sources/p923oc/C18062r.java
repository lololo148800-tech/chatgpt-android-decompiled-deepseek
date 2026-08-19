package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C18062r extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final String f57616a;

    /* JADX INFO: renamed from: b */
    public final String f57617b;

    /* JADX INFO: renamed from: c */
    public final String f57618c;

    public C18062r(String label, String destination, String str) {
        AbstractC16544l.m18094g(label, "label");
        AbstractC16544l.m18094g(destination, "destination");
        this.f57616a = label;
        this.f57617b = destination;
        this.f57618c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18062r)) {
            return false;
        }
        C18062r c18062r = (C18062r) obj;
        return AbstractC16544l.m18089b(this.f57616a, c18062r.f57616a) && AbstractC16544l.m18089b(this.f57617b, c18062r.f57617b) && AbstractC16544l.m18089b(this.f57618c, c18062r.f57618c);
    }

    public final int hashCode() {
        return this.f57618c.hashCode() + AbstractC0168G.m527p(this.f57616a.hashCode() * 31, 31, this.f57617b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstLinkReferenceDefinition(label=");
        sb2.append(this.f57616a);
        sb2.append(", destination=");
        sb2.append(this.f57617b);
        sb2.append(", title=");
        return AbstractC9306j0.m9891j(this.f57618c, Separators.RPAREN, sb2);
    }
}
