package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p100Dk.AbstractC2099z;
import p100Dk.C2096w;
import p100Dk.C2097x;
import p100Dk.C2098y;
import p523V9.AbstractC8215v5;

/* JADX INFO: renamed from: Bk.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1417x0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3792Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1360X0 f3793Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1383g0 f3794o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1417x0(C1360X0 c1360x0, C1383g0 c1383g0, int i10) {
        super(1);
        this.f3792Y = i10;
        this.f3793Z = c1360x0;
        this.f3794o0 = c1383g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3792Y) {
            case 0:
                InterfaceC1367a1 it = (InterfaceC1367a1) obj;
                AbstractC16544l.m18094g(it, "it");
                boolean zEquals = it.equals(C1362Y0.f3610a);
                C1360X0 c1360x0 = this.f3793Z;
                if (zEquals) {
                    return AbstractC8215v5.m8839a(c1360x0, C1363Z.f3616s0);
                }
                if (it instanceof C1364Z0) {
                    return AbstractC8215v5.m8839a(c1360x0, new C1415w0(it, c1360x0, this.f3794o0));
                }
                throw new C0644w();
            default:
                AbstractC2099z it2 = (AbstractC2099z) obj;
                AbstractC16544l.m18094g(it2, "it");
                boolean z6 = it2 instanceof C2096w;
                C1383g0 c1383g0 = this.f3794o0;
                C1360X0 c1360x1 = this.f3793Z;
                if (z6) {
                    return AbstractC8215v5.m8839a(c1360x1, new C1356V0(c1383g0, it2));
                }
                if (it2 instanceof C2097x) {
                    return AbstractC8215v5.m8839a(c1360x1, new C1358W0(it2, c1383g0, c1360x1));
                }
                if (it2 instanceof C2098y) {
                    return AbstractC8215v5.m8839a(c1360x1, C1363Z.f3619v0);
                }
                throw new C0644w();
        }
    }
}
