package p397Q5;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Q5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6579h {

    /* JADX INFO: renamed from: c */
    public static final C6579h f21264c;

    /* JADX INFO: renamed from: a */
    public final InterfaceC6574c f21265a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6574c f21266b;

    static {
        C6573b c6573b = C6573b.f21257a;
        f21264c = new C6579h(c6573b, c6573b);
    }

    public C6579h(InterfaceC6574c interfaceC6574c, InterfaceC6574c interfaceC6574c2) {
        this.f21265a = interfaceC6574c;
        this.f21266b = interfaceC6574c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6579h)) {
            return false;
        }
        C6579h c6579h = (C6579h) obj;
        return AbstractC16544l.m18089b(this.f21265a, c6579h.f21265a) && AbstractC16544l.m18089b(this.f21266b, c6579h.f21266b);
    }

    public final int hashCode() {
        return this.f21266b.hashCode() + (this.f21265a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f21265a + ", height=" + this.f21266b + ')';
    }
}
