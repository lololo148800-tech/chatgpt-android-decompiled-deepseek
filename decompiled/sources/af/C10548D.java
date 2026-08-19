package af;

import bf.C11349D;
import bf.C11364T;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;

/* JADX INFO: renamed from: af.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C10548D implements InterfaceC10551G {

    /* JADX INFO: renamed from: a */
    public final C11364T f31312a;

    /* JADX INFO: renamed from: b */
    public final C11349D f31313b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10548D)) {
            return false;
        }
        C10548D c10548d = (C10548D) obj;
        return AbstractC16544l.m18089b(this.f31312a, c10548d.f31312a) && AbstractC16544l.m18089b(this.f31313b, c10548d.f31313b);
    }

    public final int hashCode() {
        return this.f31313b.hashCode() + (this.f31312a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C10548D(C11364T categoryInfo, C11349D c11349d) {
        AbstractC16544l.m18094g(categoryInfo, "categoryInfo");
        AbstractC16544l.m18094g(c11349d, nkFZpTrMPpn.hpfxNlbnQNXHg);
        this.f31312a = categoryInfo;
        this.f31313b = c11349d;
    }
}
