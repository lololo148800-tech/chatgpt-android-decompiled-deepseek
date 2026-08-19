package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19633l0 {

    /* JADX INFO: renamed from: a */
    public final Object f62270a;

    /* JADX INFO: renamed from: b */
    public final boolean f62271b;

    public C19633l0(Object obj, boolean z6) {
        this.f62270a = obj;
        this.f62271b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19633l0)) {
            return false;
        }
        C19633l0 c19633l0 = (C19633l0) obj;
        return AbstractC16544l.m18089b(this.f62270a, c19633l0.f62270a) && this.f62271b == c19633l0.f62271b;
    }

    public final int hashCode() {
        Object obj = this.f62270a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + (this.f62271b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
