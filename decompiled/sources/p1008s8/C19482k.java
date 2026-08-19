package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C19482k {

    /* JADX INFO: renamed from: a */
    public final String f61892a;

    public C19482k(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61892a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19482k) && AbstractC16544l.m18089b(this.f61892a, ((C19482k) obj).f61892a);
    }

    public final int hashCode() {
        return this.f61892a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61892a, Separators.RPAREN, new StringBuilder("Action(id="));
    }
}
