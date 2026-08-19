package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oc.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C18069y extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final String f57631a;

    public C18069y(String delimiter) {
        AbstractC16544l.m18094g(delimiter, "delimiter");
        this.f57631a = delimiter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18069y) && AbstractC16544l.m18089b(this.f57631a, ((C18069y) obj).f57631a);
    }

    public final int hashCode() {
        return this.f57631a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57631a, Separators.RPAREN, new StringBuilder("AstStrikethrough(delimiter="));
    }
}
