package p044Bh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bh.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1299l {
    public static final C1298k Companion = new C1298k();

    /* JADX INFO: renamed from: a */
    public final C1297j f3434a;

    public /* synthetic */ C1299l(int i10, C1297j c1297j) {
        if (1 == (i10 & 1)) {
            this.f3434a = c1297j;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C1294g.f3431a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1299l) && AbstractC16544l.m18089b(this.f3434a, ((C1299l) obj).f3434a);
    }

    public final int hashCode() {
        return this.f3434a.f3433a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C1299l(String playIntegrityToken) {
        AbstractC16544l.m18094g(playIntegrityToken, "playIntegrityToken");
        this.f3434a = new C1297j(playIntegrityToken);
    }
}
