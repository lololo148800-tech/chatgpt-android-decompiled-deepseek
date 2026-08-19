package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C19602S {

    /* JADX INFO: renamed from: a */
    public final C19604U f62216a;

    public C19602S(C19604U c19604u) {
        this.f62216a = c19604u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19602S) && AbstractC16544l.m18089b(this.f62216a, ((C19602S) obj).f62216a);
    }

    public final int hashCode() {
        C19604U c19604u = this.f62216a;
        if (c19604u == null) {
            return 0;
        }
        return c19604u.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
