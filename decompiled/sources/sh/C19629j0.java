package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19629j0 {

    /* JADX INFO: renamed from: a */
    public final C19633l0 f62259a;

    /* JADX INFO: renamed from: b */
    public final List f62260b;

    public C19629j0(C19633l0 c19633l0, List list) {
        this.f62259a = c19633l0;
        this.f62260b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19629j0)) {
            return false;
        }
        C19629j0 c19629j0 = (C19629j0) obj;
        return AbstractC16544l.m18089b(this.f62259a, c19629j0.f62259a) && AbstractC16544l.m18089b(this.f62260b, c19629j0.f62260b);
    }

    public final int hashCode() {
        int iHashCode = this.f62259a.hashCode() * 31;
        List list = this.f62260b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
