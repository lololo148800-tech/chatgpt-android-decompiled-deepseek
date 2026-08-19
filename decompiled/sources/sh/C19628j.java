package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C19628j implements InterfaceC19622g {

    /* JADX INFO: renamed from: a */
    public final String f62255a;

    /* JADX INFO: renamed from: b */
    public final C19637o f62256b;

    /* JADX INFO: renamed from: c */
    public final C19638p f62257c;

    /* JADX INFO: renamed from: d */
    public final C19636n f62258d;

    public C19628j(String __typename, C19637o c19637o, C19638p c19638p, C19636n c19636n) {
        AbstractC16544l.m18094g(__typename, "__typename");
        this.f62255a = __typename;
        this.f62256b = c19637o;
        this.f62257c = c19638p;
        this.f62258d = c19636n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19628j)) {
            return false;
        }
        C19628j c19628j = (C19628j) obj;
        return AbstractC16544l.m18089b(this.f62255a, c19628j.f62255a) && AbstractC16544l.m18089b(this.f62256b, c19628j.f62256b) && AbstractC16544l.m18089b(this.f62257c, c19628j.f62257c) && AbstractC16544l.m18089b(this.f62258d, c19628j.f62258d);
    }

    public final int hashCode() {
        int iHashCode = this.f62255a.hashCode() * 31;
        C19637o c19637o = this.f62256b;
        int iHashCode2 = (iHashCode + (c19637o == null ? 0 : c19637o.hashCode())) * 31;
        C19638p c19638p = this.f62257c;
        return this.f62258d.hashCode() + ((iHashCode2 + (c19638p != null ? c19638p.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
