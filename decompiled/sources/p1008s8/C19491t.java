package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.t */
/* JADX INFO: loaded from: classes.dex */
public final class C19491t {

    /* JADX INFO: renamed from: a */
    public final String f61919a;

    public C19491t(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61919a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19491t) && AbstractC16544l.m18089b(this.f61919a, ((C19491t) obj).f61919a);
    }

    public final int hashCode() {
        return this.f61919a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61919a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
