package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18052h extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57601a;

    public C18052h(String delimiter) {
        AbstractC16544l.m18094g(delimiter, "delimiter");
        this.f57601a = delimiter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18052h) && AbstractC16544l.m18089b(this.f57601a, ((C18052h) obj).f57601a);
    }

    public final int hashCode() {
        return this.f57601a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57601a, Separators.RPAREN, new StringBuilder("AstEmphasis(delimiter="));
    }
}
