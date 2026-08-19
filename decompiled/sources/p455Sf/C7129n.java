package p455Sf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.C22072w1;

/* JADX INFO: renamed from: Sf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C7129n implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final C22072w1 f22685a;

    public C7129n(C22072w1 c22072w1) {
        this.f22685a = c22072w1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7129n) && AbstractC16544l.m18089b(this.f22685a, ((C7129n) obj).f22685a);
    }

    public final int hashCode() {
        C22072w1 c22072w1 = this.f22685a;
        if (c22072w1 == null) {
            return 0;
        }
        return c22072w1.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
