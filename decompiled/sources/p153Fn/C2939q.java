package p153Fn;

import p025An.AbstractC0575H;
import p025An.AbstractC0600a;
import p523V9.AbstractC8154o0;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: Fn.q */
/* JADX INFO: loaded from: classes2.dex */
public class C2939q extends AbstractC0600a implements InterfaceC19688d {

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC18770c f8802p0;

    public C2939q(InterfaceC18770c interfaceC18770c, InterfaceC18776i interfaceC18776i) {
        super(interfaceC18776i, true, true);
        this.f8802p0 = interfaceC18770c;
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: N */
    public final boolean mo1297N() {
        return true;
    }

    @Override // sm.InterfaceC19688d
    public final InterfaceC19688d getCallerFrame() {
        InterfaceC18770c interfaceC18770c = this.f8802p0;
        if (interfaceC18770c instanceof InterfaceC19688d) {
            return (InterfaceC19688d) interfaceC18770c;
        }
        return null;
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: r */
    public void mo1213r(Object obj) {
        AbstractC2923a.m3736j(AbstractC0575H.m1159G(obj), AbstractC8154o0.m8714e(this.f8802p0));
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: s */
    public void mo1210s(Object obj) {
        this.f8802p0.resumeWith(AbstractC0575H.m1159G(obj));
    }

    /* JADX INFO: renamed from: k0 */
    public void mo1206k0() {
    }
}
