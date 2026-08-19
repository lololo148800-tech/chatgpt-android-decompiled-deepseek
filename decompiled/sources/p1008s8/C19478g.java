package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C19478g {

    /* JADX INFO: renamed from: a */
    public final String f61875a;

    public C19478g(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61875a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19478g) && AbstractC16544l.m18089b(this.f61875a, ((C19478g) obj).f61875a);
    }

    public final int hashCode() {
        return this.f61875a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61875a, Separators.RPAREN, new StringBuilder("Session(id="));
    }
}
