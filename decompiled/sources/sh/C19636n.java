package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C19636n {

    /* JADX INFO: renamed from: a */
    public final String f62278a;

    /* JADX INFO: renamed from: b */
    public final Integer f62279b;

    public C19636n(Integer num, String str) {
        this.f62278a = str;
        this.f62279b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19636n)) {
            return false;
        }
        C19636n c19636n = (C19636n) obj;
        return AbstractC16544l.m18089b(this.f62278a, c19636n.f62278a) && AbstractC16544l.m18089b(this.f62279b, c19636n.f62279b);
    }

    public final int hashCode() {
        int iHashCode = this.f62278a.hashCode() * 31;
        Integer num = this.f62279b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
