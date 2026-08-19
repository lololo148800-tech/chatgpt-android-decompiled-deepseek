package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1107xh.EnumC21238b;

/* JADX INFO: renamed from: uh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C20277m {

    /* JADX INFO: renamed from: a */
    public final EnumC21238b f64116a;

    /* JADX INFO: renamed from: b */
    public final List f64117b;

    /* JADX INFO: renamed from: c */
    public final List f64118c;

    public C20277m(EnumC21238b enumC21238b, List list, List list2) {
        this.f64116a = enumC21238b;
        this.f64117b = list;
        this.f64118c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20277m)) {
            return false;
        }
        C20277m c20277m = (C20277m) obj;
        return this.f64116a == c20277m.f64116a && AbstractC16544l.m18089b(this.f64117b, c20277m.f64117b) && AbstractC16544l.m18089b(this.f64118c, c20277m.f64118c);
    }

    public final int hashCode() {
        int iHashCode = this.f64116a.hashCode() * 31;
        List list = this.f64117b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f64118c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
