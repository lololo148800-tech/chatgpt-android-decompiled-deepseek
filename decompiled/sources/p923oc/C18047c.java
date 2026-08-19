package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18047c extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57597a;

    public C18047c(String literal) {
        AbstractC16544l.m18094g(literal, "literal");
        this.f57597a = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18047c) && AbstractC16544l.m18089b(this.f57597a, ((C18047c) obj).f57597a);
    }

    public final int hashCode() {
        return this.f57597a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57597a, Separators.RPAREN, new StringBuilder("AstCode(literal="));
    }
}
