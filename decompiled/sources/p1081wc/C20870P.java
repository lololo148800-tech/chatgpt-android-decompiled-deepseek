package p1081wc;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: wc.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C20870P {

    /* JADX INFO: renamed from: a */
    public final AbstractC20892k f66439a;

    /* JADX INFO: renamed from: b */
    public final Map f66440b;

    public C20870P(AbstractC20892k abstractC20892k, Map map) {
        this.f66439a = abstractC20892k;
        this.f66440b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20870P)) {
            return false;
        }
        C20870P c20870p = (C20870P) obj;
        return AbstractC16544l.m18089b(this.f66439a, c20870p.f66439a) && AbstractC16544l.m18089b(this.f66440b, c20870p.f66440b);
    }

    public final int hashCode() {
        return this.f66440b.hashCode() + (this.f66439a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
