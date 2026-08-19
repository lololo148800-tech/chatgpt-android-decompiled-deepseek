package p044Bh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bh.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1297j {
    public static final C1296i Companion = new C1296i();

    /* JADX INFO: renamed from: a */
    public final String f3433a;

    public /* synthetic */ C1297j(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f3433a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C1295h.f3432a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1297j) && AbstractC16544l.m18089b(this.f3433a, ((C1297j) obj).f3433a);
    }

    public final int hashCode() {
        return this.f3433a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C1297j(String playIntegrityToken) {
        AbstractC16544l.m18094g(playIntegrityToken, "playIntegrityToken");
        this.f3433a = playIntegrityToken;
    }
}
