package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C18059o extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final String f57613a;

    public C18059o(String literal) {
        AbstractC16544l.m18094g(literal, "literal");
        this.f57613a = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18059o) && AbstractC16544l.m18089b(this.f57613a, ((C18059o) obj).f57613a);
    }

    public final int hashCode() {
        return this.f57613a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57613a, Separators.RPAREN, new StringBuilder("AstIndentedCodeBlock(literal="));
    }
}
