package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C19634m implements InterfaceC19622g {

    /* JADX INFO: renamed from: a */
    public final String f62272a;

    /* JADX INFO: renamed from: b */
    public final C19637o f62273b;

    /* JADX INFO: renamed from: c */
    public final C19638p f62274c;

    /* JADX INFO: renamed from: d */
    public final C19636n f62275d;

    public C19634m(String __typename, C19637o c19637o, C19638p c19638p, C19636n c19636n) {
        AbstractC16544l.m18094g(__typename, "__typename");
        this.f62272a = __typename;
        this.f62273b = c19637o;
        this.f62274c = c19638p;
        this.f62275d = c19636n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19634m)) {
            return false;
        }
        C19634m c19634m = (C19634m) obj;
        return AbstractC16544l.m18089b(this.f62272a, c19634m.f62272a) && AbstractC16544l.m18089b(this.f62273b, c19634m.f62273b) && AbstractC16544l.m18089b(this.f62274c, c19634m.f62274c) && AbstractC16544l.m18089b(this.f62275d, c19634m.f62275d);
    }

    public final int hashCode() {
        int iHashCode = this.f62272a.hashCode() * 31;
        C19637o c19637o = this.f62273b;
        int iHashCode2 = (this.f62274c.hashCode() + ((iHashCode + (c19637o == null ? 0 : c19637o.hashCode())) * 31)) * 31;
        C19636n c19636n = this.f62275d;
        return iHashCode2 + (c19636n != null ? c19636n.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
