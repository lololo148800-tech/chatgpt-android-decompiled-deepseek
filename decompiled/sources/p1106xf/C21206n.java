package p1106xf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p269Kh.C4676c;

/* JADX INFO: renamed from: xf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C21206n implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final C4676c f67441a;

    public C21206n(C4676c c4676c) {
        this.f67441a = c4676c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21206n) && AbstractC16544l.m18089b(this.f67441a, ((C21206n) obj).f67441a);
    }

    public final int hashCode() {
        C4676c c4676c = this.f67441a;
        if (c4676c == null) {
            return 0;
        }
        return c4676c.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
