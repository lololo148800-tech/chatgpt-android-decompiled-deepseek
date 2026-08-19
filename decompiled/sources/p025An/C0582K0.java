package p025An;

import mm.C17309l;
import p153Fn.AbstractC2923a;
import p153Fn.C2939q;
import p972qm.C18771d;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0582K0 extends C2939q {

    /* JADX INFO: renamed from: q0 */
    public final ThreadLocal f1814q0;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0582K0(InterfaceC18770c interfaceC18770c, InterfaceC18776i interfaceC18776i) {
        C0584L0 c0584l0 = C0584L0.f1815Y;
        super(interfaceC18770c, interfaceC18776i.get(c0584l0) == null ? interfaceC18776i.plus(c0584l0) : interfaceC18776i);
        this.f1814q0 = new ThreadLocal();
        if (interfaceC18770c.getContext().get(C18771d.f59681Y) instanceof AbstractC0563B) {
            return;
        }
        Object objM3742p = AbstractC2923a.m3742p(interfaceC18776i, null);
        AbstractC2923a.m3735i(interfaceC18776i, objM3742p);
        m1209n0(interfaceC18776i, objM3742p);
    }

    @Override // p153Fn.C2939q
    /* JADX INFO: renamed from: k0 */
    public final void mo1206k0() {
        m1208m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m1207l0() {
        boolean z6 = this.threadLocalIsSet && this.f1814q0.get() == null;
        this.f1814q0.remove();
        return !z6;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1208m0() {
        if (this.threadLocalIsSet) {
            C17309l c17309l = (C17309l) this.f1814q0.get();
            if (c17309l != null) {
                AbstractC2923a.m3735i((InterfaceC18776i) c17309l.f55136Y, c17309l.f55137Z);
            }
            this.f1814q0.remove();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1209n0(InterfaceC18776i interfaceC18776i, Object obj) {
        this.threadLocalIsSet = true;
        this.f1814q0.set(new C17309l(interfaceC18776i, obj));
    }

    @Override // p153Fn.C2939q, p025An.C0641u0
    /* JADX INFO: renamed from: s */
    public final void mo1210s(Object obj) {
        m1208m0();
        Object objM1159G = AbstractC0575H.m1159G(obj);
        InterfaceC18770c interfaceC18770c = this.f8802p0;
        InterfaceC18776i context = interfaceC18770c.getContext();
        Object objM3742p = AbstractC2923a.m3742p(context, null);
        C0582K0 c0582k0M1167O = objM3742p != AbstractC2923a.f8763d ? AbstractC0575H.m1167O(interfaceC18770c, context, objM3742p) : null;
        try {
            interfaceC18770c.resumeWith(objM1159G);
        } finally {
            if (c0582k0M1167O == null || c0582k0M1167O.m1207l0()) {
                AbstractC2923a.m3735i(context, objM3742p);
            }
        }
    }
}
