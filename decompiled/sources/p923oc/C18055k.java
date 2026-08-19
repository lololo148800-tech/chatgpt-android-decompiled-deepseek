package p923oc;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: oc.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18055k extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final int f57608a;

    public C18055k(int i10) {
        this.f57608a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18055k) && this.f57608a == ((C18055k) obj).f57608a;
    }

    public final int hashCode() {
        return this.f57608a;
    }

    public final String toString() {
        return AbstractC10763a.m11056n(new StringBuilder("AstHeading(level="), this.f57608a, Separators.RPAREN);
    }
}
