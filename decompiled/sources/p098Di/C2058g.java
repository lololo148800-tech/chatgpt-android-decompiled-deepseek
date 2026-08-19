package p098Di;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Di.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2058g implements InterfaceC2061j {

    /* JADX INFO: renamed from: a */
    public final String f6280a;

    /* JADX INFO: renamed from: b */
    public final boolean f6281b;

    public C2058g(String route, boolean z6) {
        AbstractC16544l.m18094g(route, "route");
        this.f6280a = route;
        this.f6281b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2058g)) {
            return false;
        }
        C2058g c2058g = (C2058g) obj;
        return AbstractC16544l.m18089b(this.f6280a, c2058g.f6280a) && this.f6281b == c2058g.f6281b;
    }

    public final int hashCode() {
        return (this.f6280a.hashCode() * 31) + (this.f6281b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
