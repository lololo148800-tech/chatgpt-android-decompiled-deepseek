package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.q */
/* JADX INFO: loaded from: classes.dex */
public final class C19488q {

    /* JADX INFO: renamed from: a */
    public final String f61906a;

    public C19488q(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61906a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19488q) && AbstractC16544l.m18089b(this.f61906a, ((C19488q) obj).f61906a);
    }

    public final int hashCode() {
        return this.f61906a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61906a, Separators.RPAREN, new StringBuilder("View(id="));
    }
}
