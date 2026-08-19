package p201Hn;

import p025An.AbstractC0563B;
import p153Fn.AbstractC2923a;
import p153Fn.C2936n;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Hn.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C3523l extends AbstractC0563B {

    /* JADX INFO: renamed from: Z */
    public static final C3523l f10647Z = new C3523l();

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        C3516e.f10635o0.f10637Z.m4214e(runnable, true, false);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: W0 */
    public final void mo1142W0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        C3516e.f10635o0.f10637Z.m4214e(runnable, true, true);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: Y0 */
    public final AbstractC0563B mo1144Y0(int i10, String str) {
        AbstractC2923a.m3729c(i10);
        if (i10 >= AbstractC3522k.f10644d) {
            return str != null ? new C2936n(this, str) : this;
        }
        return super.mo1144Y0(i10, str);
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        return "Dispatchers.IO";
    }
}
