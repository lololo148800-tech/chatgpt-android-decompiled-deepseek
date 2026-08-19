package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18057m extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57610a;

    public C18057m(String literal) {
        AbstractC16544l.m18094g(literal, "literal");
        this.f57610a = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18057m) && AbstractC16544l.m18089b(this.f57610a, ((C18057m) obj).f57610a);
    }

    public final int hashCode() {
        return this.f57610a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57610a, Separators.RPAREN, new StringBuilder("AstHtmlInline(literal="));
    }
}
