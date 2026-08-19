package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C19630k implements InterfaceC19622g {

    /* JADX INFO: renamed from: a */
    public final String f62261a;

    /* JADX INFO: renamed from: b */
    public final C19637o f62262b;

    /* JADX INFO: renamed from: c */
    public final C19638p f62263c;

    /* JADX INFO: renamed from: d */
    public final C19636n f62264d;

    public C19630k(String __typename, C19637o c19637o, C19638p c19638p, C19636n c19636n) {
        AbstractC16544l.m18094g(__typename, "__typename");
        this.f62261a = __typename;
        this.f62262b = c19637o;
        this.f62263c = c19638p;
        this.f62264d = c19636n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19630k)) {
            return false;
        }
        C19630k c19630k = (C19630k) obj;
        return AbstractC16544l.m18089b(this.f62261a, c19630k.f62261a) && AbstractC16544l.m18089b(this.f62262b, c19630k.f62262b) && AbstractC16544l.m18089b(this.f62263c, c19630k.f62263c) && AbstractC16544l.m18089b(this.f62264d, c19630k.f62264d);
    }

    public final int hashCode() {
        int iHashCode = (this.f62262b.hashCode() + (this.f62261a.hashCode() * 31)) * 31;
        C19638p c19638p = this.f62263c;
        int iHashCode2 = (iHashCode + (c19638p == null ? 0 : c19638p.hashCode())) * 31;
        C19636n c19636n = this.f62264d;
        return iHashCode2 + (c19636n != null ? c19636n.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
