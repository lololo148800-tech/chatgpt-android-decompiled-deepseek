package p103Dn;

import p077Cn.EnumC1733a;
import p129En.InterfaceC2614y;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Dn.y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2217y0 implements InterfaceC2149O0, InterfaceC2184i, InterfaceC2614y {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2213w0 f6797Y;

    public C2217y0(InterfaceC2213w0 interfaceC2213w0) {
        this.f6797Y = interfaceC2213w0;
    }

    @Override // p129En.InterfaceC2614y
    /* JADX INFO: renamed from: b */
    public final InterfaceC2184i mo3229b(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || enumC1733a != EnumC1733a.f4962Z) ? AbstractC2124C.m3225x(this, interfaceC18776i, i10, enumC1733a) : this;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        return this.f6797Y.mo3141d(interfaceC2186j, interfaceC18770c);
    }

    @Override // p103Dn.InterfaceC2149O0
    public final Object getValue() {
        return this.f6797Y.getValue();
    }
}
