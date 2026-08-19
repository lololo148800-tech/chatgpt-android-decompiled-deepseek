package p204I1;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: I1.J */
/* JADX INFO: loaded from: classes.dex */
public final class C3579J {

    /* JADX INFO: renamed from: a */
    public final C3573D f10898a;

    /* JADX INFO: renamed from: b */
    public final C3573D f10899b;

    /* JADX INFO: renamed from: c */
    public final C3573D f10900c;

    /* JADX INFO: renamed from: d */
    public final C3573D f10901d;

    public C3579J(C3573D c3573d, C3573D c3573d2, C3573D c3573d3, C3573D c3573d4) {
        this.f10898a = c3573d;
        this.f10899b = c3573d2;
        this.f10900c = c3573d3;
        this.f10901d = c3573d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3579J)) {
            return false;
        }
        C3579J c3579j = (C3579J) obj;
        return AbstractC16544l.m18089b(this.f10898a, c3579j.f10898a) && AbstractC16544l.m18089b(this.f10899b, c3579j.f10899b) && AbstractC16544l.m18089b(this.f10900c, c3579j.f10900c) && AbstractC16544l.m18089b(this.f10901d, c3579j.f10901d);
    }

    public final int hashCode() {
        C3573D c3573d = this.f10898a;
        int iHashCode = (c3573d != null ? c3573d.hashCode() : 0) * 31;
        C3573D c3573d2 = this.f10899b;
        int iHashCode2 = (iHashCode + (c3573d2 != null ? c3573d2.hashCode() : 0)) * 31;
        C3573D c3573d3 = this.f10900c;
        int iHashCode3 = (iHashCode2 + (c3573d3 != null ? c3573d3.hashCode() : 0)) * 31;
        C3573D c3573d4 = this.f10901d;
        return iHashCode3 + (c3573d4 != null ? c3573d4.hashCode() : 0);
    }
}
