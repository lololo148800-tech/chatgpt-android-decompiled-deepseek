package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C19605V {

    /* JADX INFO: renamed from: a */
    public final Object f62221a;

    /* JADX INFO: renamed from: b */
    public final boolean f62222b;

    public C19605V(Object obj, boolean z6) {
        this.f62221a = obj;
        this.f62222b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19605V)) {
            return false;
        }
        C19605V c19605v = (C19605V) obj;
        return AbstractC16544l.m18089b(this.f62221a, c19605v.f62221a) && this.f62222b == c19605v.f62222b;
    }

    public final int hashCode() {
        Object obj = this.f62221a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + (this.f62222b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
