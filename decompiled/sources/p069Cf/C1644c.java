package p069Cf;

import fo.C13711h;
import java.util.List;
import p002A0.C0130g;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21708o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p525Vb.C8258a;
import p635a1.AbstractC10458p;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p759g1.C13803e;
import p773h0.C14322z0;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Cf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1644c extends AbstractC10458p implements InterfaceC21708o, InterfaceC21681a0 {

    /* JADX INFO: renamed from: A0 */
    public final C6002f0 f4652A0;

    /* JADX INFO: renamed from: B0 */
    public final C6002f0 f4653B0;

    /* JADX INFO: renamed from: C0 */
    public final C13756d f4654C0;

    /* JADX INFO: renamed from: D0 */
    public final C13756d f4655D0;

    /* JADX INFO: renamed from: z0 */
    public final C6002f0 f4656z0;

    public C1644c(C14322z0 c14322z0, long j10, long j11) {
        C5975S c5975s = C5975S.f19448r0;
        this.f4656z0 = C5997d.m6430Q(c14322z0, c5975s);
        this.f4652A0 = C5997d.m6430Q(new C14365u(j10), c5975s);
        this.f4653B0 = C5997d.m6430Q(new C14365u(j11), c5975s);
        this.f4654C0 = AbstractC13758e.m15236a(0.0f);
        this.f4655D0 = AbstractC13758e.m15236a(0.0f);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        mo2488j0();
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        c21660f.m22080a();
        float fFloatValue = ((Number) this.f4654C0.m15224e()).floatValue();
        C16037b c16037b = c21660f.f68674Y;
        if (fFloatValue > 0.0f) {
            float fMo7864b0 = c21660f.mo7864b0(8);
            C6002f0 c6002f0 = this.f4652A0;
            AbstractC14376f.m15849o(c21660f, C8258a.m8895i(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(fFloatValue, ((C14365u) c6002f0.getValue()).f45062a)), new C14365u(C14365u.m15774b(0.0f, ((C14365u) c6002f0.getValue()).f45062a))), 0.0f, fMo7864b0, 10), 0L, AbstractC8112i6.m8603a(fMo7864b0, C13803e.m15331c(c16037b.f49479Z.m15202x())), 0.0f, null, 0, 122);
        }
        float fFloatValue2 = ((Number) this.f4655D0.m15224e()).floatValue();
        if (fFloatValue2 > 0.0f) {
            float fMo7864b1 = c21660f.mo7864b0(32);
            C6002f0 c6002f1 = this.f4653B0;
            List listM19382k = AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.0f, ((C14365u) c6002f1.getValue()).f45062a)), new C14365u(C14365u.m15774b(fFloatValue2, ((C14365u) c6002f1.getValue()).f45062a)));
            float fM15333e = C13803e.m15333e(c16037b.f49479Z.m15202x()) - fMo7864b1;
            C13711h c13711h = c16037b.f49479Z;
            AbstractC14376f.m15849o(c21660f, C8258a.m8895i(listM19382k, fM15333e, C13803e.m15333e(c13711h.m15202x()), 8), AbstractC8088f6.m8536b(C13803e.m15333e(c13711h.m15202x()) - fMo7864b1, 0.0f), AbstractC8112i6.m8603a(fMo7864b1, C13803e.m15331c(c13711h.m15202x())), 0.0f, null, 0, 120);
        }
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        AbstractC21690f.m22214s(this, new C0130g(this, 13));
    }
}
