package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: I1.O */
/* JADX INFO: loaded from: classes.dex */
public final class C3584O {

    /* JADX INFO: renamed from: a */
    public final String f10914a;

    public C3584O(String str) {
        this.f10914a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3584O) {
            return AbstractC16544l.m18089b(this.f10914a, ((C3584O) obj).f10914a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10914a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f10914a, ')');
    }
}
