package p1113xn;

import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3508g;

/* JADX INFO: renamed from: xn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C21316j {

    /* JADX INFO: renamed from: a */
    public final String f67751a;

    /* JADX INFO: renamed from: b */
    public final C3508g f67752b;

    public C21316j(String str, C3508g c3508g) {
        this.f67751a = str;
        this.f67752b = c3508g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21316j)) {
            return false;
        }
        C21316j c21316j = (C21316j) obj;
        return AbstractC16544l.m18089b(this.f67751a, c21316j.f67751a) && AbstractC16544l.m18089b(this.f67752b, c21316j.f67752b);
    }

    public final int hashCode() {
        return this.f67752b.hashCode() + (this.f67751a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f67751a + ", range=" + this.f67752b + ')';
    }
}
