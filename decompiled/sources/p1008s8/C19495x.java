package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.x */
/* JADX INFO: loaded from: classes.dex */
public final class C19495x {

    /* JADX INFO: renamed from: a */
    public final String f61928a;

    public C19495x(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61928a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19495x) && AbstractC16544l.m18089b(this.f61928a, ((C19495x) obj).f61928a);
    }

    public final int hashCode() {
        return this.f61928a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61928a, Separators.RPAREN, new StringBuilder("Session(id="));
    }
}
