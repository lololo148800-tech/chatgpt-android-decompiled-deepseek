package p773h0;

import p025An.AbstractC0575H;
import p1140z1.C21660F;
import p1140z1.InterfaceC21708o;
import p635a1.AbstractC10458p;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: h0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C14248C extends AbstractC10458p implements InterfaceC21708o {

    /* JADX INFO: renamed from: A0 */
    public boolean f44711A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f44712B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f44713C0;

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC17406l f44714z0;

    public C14248C(InterfaceC17406l interfaceC17406l) {
        this.f44714z0 = interfaceC17406l;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        AbstractC0575H.m1156D(m10935y0(), null, null, new C14247B(this, null), 3);
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        c21660f.m22080a();
        boolean z6 = this.f44711A0;
        C16037b c16037b = c21660f.f68674Y;
        if (z6) {
            AbstractC14376f.m15850p(c21660f, C14365u.m15774b(0.3f, C14365u.f45052b), 0L, c16037b.f49479Z.m15202x(), 0.0f, 122);
        } else if (this.f44712B0 || this.f44713C0) {
            AbstractC14376f.m15850p(c21660f, C14365u.m15774b(0.1f, C14365u.f45052b), 0L, c16037b.f49479Z.m15202x(), 0.0f, 122);
        }
    }
}
