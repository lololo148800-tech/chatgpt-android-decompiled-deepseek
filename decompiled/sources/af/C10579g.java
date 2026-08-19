package af;

import bf.C11385m;
import bf.C11386n;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: af.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10579g implements InterfaceC10581i {

    /* JADX INFO: renamed from: a */
    public final C11386n f31423a;

    static {
        C11385m c11385m = C11386n.Companion;
    }

    public C10579g(C11386n social) {
        AbstractC16544l.m18094g(social, "social");
        this.f31423a = social;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10579g) && AbstractC16544l.m18089b(this.f31423a, ((C10579g) obj).f31423a);
    }

    public final int hashCode() {
        return this.f31423a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
