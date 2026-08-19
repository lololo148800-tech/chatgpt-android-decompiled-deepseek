package p1139z0;

import p003A1.InterfaceC0258i1;
import p080D0.C1837w0;
import p1071w0.C20750g0;
import p1140z1.AbstractC21678Y;
import p1140z1.InterfaceC21702l;
import p1140z1.InterfaceC21710p;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: z0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C21587J extends AbstractC10458p implements InterfaceC0258i1, InterfaceC21702l, InterfaceC21710p {

    /* JADX INFO: renamed from: A0 */
    public C20750g0 f68349A0;

    /* JADX INFO: renamed from: B0 */
    public C1837w0 f68350B0;

    /* JADX INFO: renamed from: C0 */
    public final C6002f0 f68351C0 = C5997d.m6430Q(null, C5975S.f19448r0);

    /* JADX INFO: renamed from: z0 */
    public C21611e f68352z0;

    public C21587J(C21611e c21611e, C20750g0 c20750g0, C1837w0 c1837w0) {
        this.f68352z0 = c21611e;
        this.f68349A0 = c20750g0;
        this.f68350B0 = c1837w0;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        C21611e c21611e = this.f68352z0;
        if (c21611e.f68452a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        c21611e.f68452a = this;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        this.f68352z0.m21950k(this);
    }

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        this.f68351C0.setValue(abstractC21678Y);
    }
}
