package p1098x5;

import kotlin.jvm.internal.AbstractC16544l;
import p138F8.vJO.anhfj;
import p523V9.AbstractC7870D5;

/* JADX INFO: renamed from: x5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C21129h {

    /* JADX INFO: renamed from: c */
    public static final C21129h f67131c;

    /* JADX INFO: renamed from: a */
    public final AbstractC7870D5 f67132a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7870D5 f67133b;

    static {
        C21123b c21123b = C21123b.f67119b;
        f67131c = new C21129h(c21123b, c21123b);
    }

    public C21129h(AbstractC7870D5 abstractC7870D5, AbstractC7870D5 abstractC7870D6) {
        this.f67132a = abstractC7870D5;
        this.f67133b = abstractC7870D6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21129h)) {
            return false;
        }
        C21129h c21129h = (C21129h) obj;
        return AbstractC16544l.m18089b(this.f67132a, c21129h.f67132a) && AbstractC16544l.m18089b(this.f67133b, c21129h.f67133b);
    }

    public final int hashCode() {
        return this.f67133b.hashCode() + (this.f67132a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f67132a + anhfj.dNBbCZz + this.f67133b + ')';
    }
}
