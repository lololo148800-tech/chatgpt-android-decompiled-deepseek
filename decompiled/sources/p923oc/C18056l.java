package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18056l extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final String f57609a;

    public C18056l(String literal) {
        AbstractC16544l.m18094g(literal, "literal");
        this.f57609a = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18056l) && AbstractC16544l.m18089b(this.f57609a, ((C18056l) obj).f57609a);
    }

    public final int hashCode() {
        return this.f57609a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57609a, Separators.RPAREN, new StringBuilder("AstHtmlBlock(literal="));
    }
}
