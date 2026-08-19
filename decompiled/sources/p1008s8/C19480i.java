package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C19480i {

    /* JADX INFO: renamed from: a */
    public final String f61882a;

    public C19480i(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61882a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19480i) && AbstractC16544l.m18089b(this.f61882a, ((C19480i) obj).f61882a);
    }

    public final int hashCode() {
        return this.f61882a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61882a, Separators.RPAREN, new StringBuilder("View(id="));
    }
}
