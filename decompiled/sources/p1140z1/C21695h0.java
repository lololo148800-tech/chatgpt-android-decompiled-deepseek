package p1140z1;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.InterfaceC21058L;

/* JADX INFO: renamed from: z1.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21695h0 implements InterfaceC21689e0 {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC21058L f68862Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC21668N f68863Z;

    public C21695h0(InterfaceC21058L interfaceC21058L, AbstractC21668N abstractC21668N) {
        this.f68862Y = interfaceC21058L;
        this.f68863Z = abstractC21668N;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21695h0)) {
            return false;
        }
        C21695h0 c21695h0 = (C21695h0) obj;
        return AbstractC16544l.m18089b(this.f68862Y, c21695h0.f68862Y) && AbstractC16544l.m18089b(this.f68863Z, c21695h0.f68863Z);
    }

    public final int hashCode() {
        return this.f68863Z.hashCode() + (this.f68862Y.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f68862Y + ", placeable=" + this.f68863Z + ')';
    }

    @Override // p1140z1.InterfaceC21689e0
    /* JADX INFO: renamed from: u */
    public final boolean mo874u() {
        return this.f68863Z.mo22120h0().mo21522h();
    }
}
