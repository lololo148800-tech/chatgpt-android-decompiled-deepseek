package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.s */
/* JADX INFO: loaded from: classes.dex */
public final class C19490s {

    /* JADX INFO: renamed from: a */
    public final String f61918a;

    public C19490s(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61918a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19490s) && AbstractC16544l.m18089b(this.f61918a, ((C19490s) obj).f61918a);
    }

    public final int hashCode() {
        return this.f61918a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61918a, Separators.RPAREN, new StringBuilder("Action(id="));
    }
}
