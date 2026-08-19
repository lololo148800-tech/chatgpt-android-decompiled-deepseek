package p1013t0;

import io.sentry.android.replay.capture.C15272c;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p1095x1.InterfaceC21098s;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21707n0;
import p1140z1.InterfaceC21717v;
import p635a1.AbstractC10458p;
import p759g1.C13801c;
import p860l0.C16672F;
import p874lj.C17057a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: t0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C19721i extends AbstractC10458p implements InterfaceC19713a, InterfaceC21717v, InterfaceC21707n0 {

    /* JADX INFO: renamed from: B0 */
    public static final C17057a f62432B0 = new C17057a(5);

    /* JADX INFO: renamed from: A0 */
    public boolean f62433A0;

    /* JADX INFO: renamed from: z0 */
    public C16672F f62434z0;

    /* JADX INFO: renamed from: K0 */
    public static final C13801c m20666K0(C19721i c19721i, AbstractC21678Y abstractC21678Y, InterfaceC1426a interfaceC1426a) {
        C13801c c13801c;
        if (!c19721i.f30972y0 || !c19721i.f62433A0) {
            return null;
        }
        AbstractC21678Y abstractC21678YM22216u = AbstractC21690f.m22216u(c19721i);
        if (!abstractC21678Y.mo22159J0().f30972y0) {
            abstractC21678Y = null;
        }
        if (abstractC21678Y == null || (c13801c = (C13801c) interfaceC1426a.invoke()) == null) {
            return null;
        }
        return c13801c.m15326m(abstractC21678YM22216u.mo21528y(abstractC21678Y, false).m15320g());
    }

    @Override // p1013t0.InterfaceC19713a
    /* JADX INFO: renamed from: h0 */
    public final Object mo20664h0(AbstractC21678Y abstractC21678Y, InterfaceC1426a interfaceC1426a, AbstractC19687c abstractC19687c) {
        Object objM1183l = AbstractC0575H.m1183l(new C19720h(this, abstractC21678Y, interfaceC1426a, new C15272c(this, abstractC21678Y, interfaceC1426a), null), abstractC19687c);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: l0 */
    public final void mo11280l0(InterfaceC21098s interfaceC21098s) {
        this.f62433A0 = true;
    }

    @Override // p1140z1.InterfaceC21707n0
    /* JADX INFO: renamed from: o */
    public final Object mo14727o() {
        return f62432B0;
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo11281q(long j10) {
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
