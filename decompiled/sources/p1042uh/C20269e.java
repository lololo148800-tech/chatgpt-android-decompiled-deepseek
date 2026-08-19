package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20269e {

    /* JADX INFO: renamed from: a */
    public final Object f64101a;

    /* JADX INFO: renamed from: b */
    public final boolean f64102b;

    public C20269e(Object obj, boolean z6) {
        this.f64101a = obj;
        this.f64102b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20269e)) {
            return false;
        }
        C20269e c20269e = (C20269e) obj;
        return AbstractC16544l.m18089b(this.f64101a, c20269e.f64101a) && this.f64102b == c20269e.f64102b;
    }

    public final int hashCode() {
        Object obj = this.f64101a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + (this.f64102b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
