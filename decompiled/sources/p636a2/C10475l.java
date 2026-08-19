package p636a2;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21100u;

/* JADX INFO: renamed from: a2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10475l implements InterfaceC21100u {

    /* JADX INFO: renamed from: Y */
    public final C10469f f31023Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1436k f31024Z;

    /* JADX INFO: renamed from: o0 */
    public final Integer f31025o0;

    public C10475l(C10469f ref, InterfaceC1436k constrain) {
        AbstractC16544l.m18094g(ref, "ref");
        AbstractC16544l.m18094g(constrain, "constrain");
        this.f31023Y = ref;
        this.f31024Z = constrain;
        this.f31025o0 = ref.f31005a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10475l) {
            C10475l c10475l = (C10475l) obj;
            if (this.f31023Y.f31005a.equals(c10475l.f31023Y.f31005a) && AbstractC16544l.m18089b(this.f31024Z, c10475l.f31024Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31024Z.hashCode() + (this.f31023Y.f31005a.hashCode() * 31);
    }

    @Override // p1095x1.InterfaceC21100u
    /* JADX INFO: renamed from: t */
    public final Object mo10939t() {
        return this.f31025o0;
    }
}
