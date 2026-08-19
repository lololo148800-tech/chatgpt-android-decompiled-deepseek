package p156G1;

import p049Bm.InterfaceC1436k;
import p1140z1.InterfaceC21701k0;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: G1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2956c extends AbstractC10458p implements InterfaceC21701k0 {

    /* JADX INFO: renamed from: A0 */
    public final boolean f8841A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC1436k f8842B0;

    /* JADX INFO: renamed from: z0 */
    public boolean f8843z0;

    public C2956c(boolean z6, boolean z10, InterfaceC1436k interfaceC1436k) {
        this.f8843z0 = z6;
        this.f8841A0 = z10;
        this.f8842B0 = interfaceC1436k;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        this.f8842B0.invoke(c2963j);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final boolean mo425E() {
        return this.f8841A0;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final boolean mo432u0() {
        return this.f8843z0;
    }
}
