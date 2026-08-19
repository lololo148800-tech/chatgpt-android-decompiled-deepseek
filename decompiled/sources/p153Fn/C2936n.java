package p153Fn;

import p025An.AbstractC0563B;
import p025An.AbstractC0579J;
import p025An.C0624m;
import p025An.InterfaceC0585M;
import p025An.InterfaceC0595V;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Fn.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C2936n extends AbstractC0563B implements InterfaceC0585M {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0585M f8798Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC0563B f8799o0;

    /* JADX INFO: renamed from: p0 */
    public final String f8800p0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2936n(AbstractC0563B abstractC0563B, String str) {
        InterfaceC0585M interfaceC0585M = abstractC0563B instanceof InterfaceC0585M ? (InterfaceC0585M) abstractC0563B : null;
        this.f8798Z = interfaceC0585M == null ? AbstractC0579J.f1812a : interfaceC0585M;
        this.f8799o0 = abstractC0563B;
        this.f8800p0 = str;
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: S */
    public final InterfaceC0595V mo1199S(long j10, Runnable runnable, InterfaceC18776i interfaceC18776i) {
        return this.f8798Z.mo1199S(j10, runnable, interfaceC18776i);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        this.f8799o0.mo872V0(interfaceC18776i, runnable);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: W0 */
    public final void mo1142W0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        this.f8799o0.mo1142W0(interfaceC18776i, runnable);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: X0 */
    public final boolean mo1143X0(InterfaceC18776i interfaceC18776i) {
        return this.f8799o0.mo1143X0(interfaceC18776i);
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: k */
    public final void mo1211k(long j10, C0624m c0624m) {
        this.f8798Z.mo1211k(j10, c0624m);
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        return this.f8800p0;
    }
}
