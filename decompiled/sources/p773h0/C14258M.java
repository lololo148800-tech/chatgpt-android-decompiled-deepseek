package p773h0;

import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21707n0;
import p1140z1.InterfaceC21710p;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: h0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C14258M extends AbstractC10458p implements InterfaceC21707n0, InterfaceC21710p {

    /* JADX INFO: renamed from: B0 */
    public static final C14294l0 f44745B0 = new C14294l0(5);

    /* JADX INFO: renamed from: A0 */
    public AbstractC21678Y f44746A0;

    /* JADX INFO: renamed from: z0 */
    public boolean f44747z0;

    /* JADX INFO: renamed from: K0 */
    public final C14259N m15556K0() {
        if (!this.f30972y0) {
            return null;
        }
        InterfaceC21707n0 interfaceC21707n0M22205j = AbstractC21690f.m22205j(this, C14259N.f44748A0);
        if (interfaceC21707n0M22205j instanceof C14259N) {
            return (C14259N) interfaceC21707n0M22205j;
        }
        return null;
    }

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        C14259N c14259nM15556K0;
        this.f44746A0 = abstractC21678Y;
        if (this.f44747z0) {
            if (!abstractC21678Y.mo22159J0().f30972y0) {
                C14259N c14259nM15556K1 = m15556K0();
                if (c14259nM15556K1 != null) {
                    c14259nM15556K1.m15557K0(null);
                    return;
                }
                return;
            }
            AbstractC21678Y abstractC21678Y2 = this.f44746A0;
            if (abstractC21678Y2 == null || !abstractC21678Y2.mo22159J0().f30972y0 || (c14259nM15556K0 = m15556K0()) == null) {
                return;
            }
            c14259nM15556K0.m15557K0(this.f44746A0);
        }
    }

    @Override // p1140z1.InterfaceC21707n0
    /* JADX INFO: renamed from: o */
    public final Object mo14727o() {
        return f44745B0;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
