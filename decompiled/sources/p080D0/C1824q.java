package p080D0;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: D0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1824q {

    /* JADX INFO: renamed from: a */
    public final C1822p f5257a;

    /* JADX INFO: renamed from: b */
    public final C1822p f5258b;

    /* JADX INFO: renamed from: c */
    public final boolean f5259c;

    public C1824q(C1822p c1822p, C1822p c1822p2, boolean z6) {
        this.f5257a = c1822p;
        this.f5258b = c1822p2;
        this.f5259c = z6;
    }

    /* JADX INFO: renamed from: a */
    public static C1824q m2653a(C1824q c1824q, C1822p c1822p, C1822p c1822p2, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            c1822p = c1824q.f5257a;
        }
        if ((i10 & 2) != 0) {
            c1822p2 = c1824q.f5258b;
        }
        if ((i10 & 4) != 0) {
            z6 = c1824q.f5259c;
        }
        c1824q.getClass();
        return new C1824q(c1822p, c1822p2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1824q)) {
            return false;
        }
        C1824q c1824q = (C1824q) obj;
        return AbstractC16544l.m18089b(this.f5257a, c1824q.f5257a) && AbstractC16544l.m18089b(this.f5258b, c1824q.f5258b) && this.f5259c == c1824q.f5259c;
    }

    public final int hashCode() {
        return ((this.f5258b.hashCode() + (this.f5257a.hashCode() * 31)) * 31) + (this.f5259c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f5257a);
        sb2.append(", end=");
        sb2.append(this.f5258b);
        sb2.append(", handlesCrossed=");
        return AbstractC3794B0.m4499x(sb2, this.f5259c, ')');
    }
}
