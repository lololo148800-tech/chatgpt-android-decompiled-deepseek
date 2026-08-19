package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20266c {

    /* JADX INFO: renamed from: a */
    public final C20269e f64096a;

    /* JADX INFO: renamed from: b */
    public final List f64097b;

    public C20266c(C20269e c20269e, List list) {
        this.f64096a = c20269e;
        this.f64097b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20266c)) {
            return false;
        }
        C20266c c20266c = (C20266c) obj;
        return AbstractC16544l.m18089b(this.f64096a, c20266c.f64096a) && AbstractC16544l.m18089b(this.f64097b, c20266c.f64097b);
    }

    public final int hashCode() {
        int iHashCode = this.f64096a.hashCode() * 31;
        List list = this.f64097b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
