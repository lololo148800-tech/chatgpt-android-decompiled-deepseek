package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.l */
/* JADX INFO: loaded from: classes.dex */
public final class C19483l {

    /* JADX INFO: renamed from: a */
    public final String f61893a;

    public C19483l(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61893a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19483l) && AbstractC16544l.m18089b(this.f61893a, ((C19483l) obj).f61893a);
    }

    public final int hashCode() {
        return this.f61893a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61893a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
