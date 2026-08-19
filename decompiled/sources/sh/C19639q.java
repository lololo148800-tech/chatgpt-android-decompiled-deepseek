package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19639q implements InterfaceC19622g {

    /* JADX INFO: renamed from: a */
    public final String f62284a;

    /* JADX INFO: renamed from: b */
    public final C19637o f62285b;

    /* JADX INFO: renamed from: c */
    public final C19638p f62286c;

    /* JADX INFO: renamed from: d */
    public final C19636n f62287d;

    public C19639q(String __typename, C19637o c19637o, C19638p c19638p, C19636n c19636n) {
        AbstractC16544l.m18094g(__typename, "__typename");
        this.f62284a = __typename;
        this.f62285b = c19637o;
        this.f62286c = c19638p;
        this.f62287d = c19636n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19639q)) {
            return false;
        }
        C19639q c19639q = (C19639q) obj;
        return AbstractC16544l.m18089b(this.f62284a, c19639q.f62284a) && AbstractC16544l.m18089b(this.f62285b, c19639q.f62285b) && AbstractC16544l.m18089b(this.f62286c, c19639q.f62286c) && AbstractC16544l.m18089b(this.f62287d, c19639q.f62287d);
    }

    public final int hashCode() {
        int iHashCode = this.f62284a.hashCode() * 31;
        C19637o c19637o = this.f62285b;
        int iHashCode2 = (iHashCode + (c19637o == null ? 0 : c19637o.hashCode())) * 31;
        C19638p c19638p = this.f62286c;
        int iHashCode3 = (iHashCode2 + (c19638p == null ? 0 : c19638p.hashCode())) * 31;
        C19636n c19636n = this.f62287d;
        return iHashCode3 + (c19636n != null ? c19636n.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
