package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C19603T {

    /* JADX INFO: renamed from: a */
    public final C19605V f62217a;

    /* JADX INFO: renamed from: b */
    public final List f62218b;

    public C19603T(C19605V c19605v, List list) {
        this.f62217a = c19605v;
        this.f62218b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19603T)) {
            return false;
        }
        C19603T c19603t = (C19603T) obj;
        return AbstractC16544l.m18089b(this.f62217a, c19603t.f62217a) && AbstractC16544l.m18089b(this.f62218b, c19603t.f62218b);
    }

    public final int hashCode() {
        int iHashCode = this.f62217a.hashCode() * 31;
        List list = this.f62218b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
