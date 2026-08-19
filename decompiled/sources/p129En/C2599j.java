package p129En;

import mm.C17296C;
import p025An.AbstractC0563B;
import p077Cn.EnumC1733a;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: En.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C2599j extends AbstractC2598i {
    public C2599j(InterfaceC2184i interfaceC2184i, AbstractC0563B abstractC0563B, int i10, EnumC1733a enumC1733a, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? EnumC1733a.f4961Y : enumC1733a, interfaceC2184i, (i11 & 2) != 0 ? C18777j.f59682Y : abstractC0563B);
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: h */
    public final AbstractC2596g mo3254h(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return new C2599j(i10, enumC1733a, this.f8053p0, interfaceC18776i);
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: j */
    public final InterfaceC2184i mo3256j() {
        return this.f8053p0;
    }

    @Override // p129En.AbstractC2598i
    /* JADX INFO: renamed from: l */
    public final Object mo3616l(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objMo3141d = this.f8053p0.mo3141d(interfaceC2186j, interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }
}
