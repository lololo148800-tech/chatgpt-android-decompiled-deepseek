package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.z */
/* JADX INFO: loaded from: classes.dex */
public final class C19497z {

    /* JADX INFO: renamed from: a */
    public final String f61935a;

    public C19497z(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f61935a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19497z) && AbstractC16544l.m18089b(this.f61935a, ((C19497z) obj).f61935a);
    }

    public final int hashCode() {
        return this.f61935a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61935a, Separators.RPAREN, new StringBuilder("View(id="));
    }
}
