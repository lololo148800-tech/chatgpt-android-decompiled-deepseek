package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20282r {

    /* JADX INFO: renamed from: a */
    public final C20287w f64133a;

    public C20282r(C20287w c20287w) {
        this.f64133a = c20287w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20282r) && AbstractC16544l.m18089b(this.f64133a, ((C20282r) obj).f64133a);
    }

    public final int hashCode() {
        C20287w c20287w = this.f64133a;
        if (c20287w == null) {
            return 0;
        }
        return c20287w.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
