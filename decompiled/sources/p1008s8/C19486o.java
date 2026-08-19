package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.o */
/* JADX INFO: loaded from: classes.dex */
public final class C19486o {

    /* JADX INFO: renamed from: a */
    public final String f61900a;

    public C19486o(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61900a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19486o) && AbstractC16544l.m18089b(this.f61900a, ((C19486o) obj).f61900a);
    }

    public final int hashCode() {
        return this.f61900a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61900a, Separators.RPAREN, new StringBuilder("Session(id="));
    }
}
