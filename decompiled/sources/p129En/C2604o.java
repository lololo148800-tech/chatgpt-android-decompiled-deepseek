package p129En;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1440o;
import p077Cn.EnumC1733a;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C2604o extends AbstractC2598i {

    /* JADX INFO: renamed from: q0 */
    public final AbstractC19694j f8073q0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2604o(InterfaceC1440o interfaceC1440o, InterfaceC2184i interfaceC2184i, InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        super(i10, enumC1733a, interfaceC2184i, interfaceC18776i);
        this.f8073q0 = (AbstractC19694j) interfaceC1440o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.o, sm.j] */
    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: h */
    public final AbstractC2596g mo3254h(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return new C2604o(this.f8073q0, this.f8053p0, interfaceC18776i, i10, enumC1733a);
    }

    @Override // p129En.AbstractC2598i
    /* JADX INFO: renamed from: l */
    public final Object mo3616l(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objM1183l = AbstractC0575H.m1183l(new C2603n(this, interfaceC2186j, null), interfaceC18770c);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
    }
}
