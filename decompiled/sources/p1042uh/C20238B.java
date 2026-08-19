package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C20238B {

    /* JADX INFO: renamed from: a */
    public final List f64032a;

    public C20238B(List list) {
        this.f64032a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20238B) && AbstractC16544l.m18089b(this.f64032a, ((C20238B) obj).f64032a);
    }

    public final int hashCode() {
        List list = this.f64032a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
