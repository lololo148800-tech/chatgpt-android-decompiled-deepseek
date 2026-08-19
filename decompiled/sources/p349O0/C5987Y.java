package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: O0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C5987Y {

    /* JADX INFO: renamed from: a */
    public final String f19464a;

    public C5987Y(String str) {
        this.f19464a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5987Y) && AbstractC16544l.m18089b(this.f19464a, ((C5987Y) obj).f19464a);
    }

    public final int hashCode() {
        return this.f19464a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("OpaqueKey(key="), this.f19464a, ')');
    }
}
