package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C18043G extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57593a;

    public C18043G(String literal) {
        AbstractC16544l.m18094g(literal, "literal");
        this.f57593a = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18043G) && AbstractC16544l.m18089b(this.f57593a, ((C18043G) obj).f57593a);
    }

    public final int hashCode() {
        return this.f57593a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57593a, Separators.RPAREN, new StringBuilder("AstText(literal="));
    }
}
