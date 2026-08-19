package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C18070z extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57632a;

    public C18070z(String delimiter) {
        AbstractC16544l.m18094g(delimiter, "delimiter");
        this.f57632a = delimiter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18070z) && AbstractC16544l.m18089b(this.f57632a, ((C18070z) obj).f57632a);
    }

    public final int hashCode() {
        return this.f57632a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57632a, Separators.RPAREN, new StringBuilder("AstStrongEmphasis(delimiter="));
    }
}
