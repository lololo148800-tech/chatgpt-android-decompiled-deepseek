package p386Pk;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Pk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6451c {

    /* JADX INFO: renamed from: a */
    public final String f20930a;

    public C6451c(String str) {
        this.f20930a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6451c) && AbstractC16544l.m18089b(this.f20930a, ((C6451c) obj).f20930a);
    }

    public final int hashCode() {
        return this.f20930a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("Scm(url="), this.f20930a, ')');
    }
}
