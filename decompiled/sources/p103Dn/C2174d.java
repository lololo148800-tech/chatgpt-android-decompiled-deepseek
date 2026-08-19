package p103Dn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p077Cn.C1743k;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1730B;
import p077Cn.InterfaceC1758z;
import p129En.AbstractC2596g;
import p129En.C2586F;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Dn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2174d extends AbstractC2596g {
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: p0 */
    public final C1743k f6660p0;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C2174d.class, "consumed$volatile");
    }

    public /* synthetic */ C2174d(C1743k c1743k) {
        this(c1743k, C18777j.f59682Y, -3, EnumC1733a.f4961Y);
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: c */
    public final String mo3255c() {
        return "channel=" + this.f6660p0;
    }

    @Override // p129En.AbstractC2596g, p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        C17296C c17296c = C17296C.f55119a;
        if (this.f8048Z == -3) {
            Object objM3218q = AbstractC2124C.m3218q(interfaceC2186j, this.f6660p0, false, interfaceC18770c);
            return objM3218q == EnumC19250a.f61036Y ? objM3218q : c17296c;
        }
        Object objMo3141d = super.mo3141d(interfaceC2186j, interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : c17296c;
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: g */
    public final Object mo3253g(InterfaceC1758z interfaceC1758z, InterfaceC18770c interfaceC18770c) throws Throwable {
        Object objM3218q = AbstractC2124C.m3218q(new C2586F(interfaceC1758z), this.f6660p0, false, interfaceC18770c);
        return objM3218q == EnumC19250a.f61036Y ? objM3218q : C17296C.f55119a;
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: h */
    public final AbstractC2596g mo3254h(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return new C2174d(this.f6660p0, interfaceC18776i, i10, enumC1733a);
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: j */
    public final InterfaceC2184i mo3256j() {
        return new C2174d(this.f6660p0);
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: k */
    public final InterfaceC1730B mo3257k(InterfaceC0571F interfaceC0571F) {
        return this.f8048Z == -3 ? this.f6660p0 : super.mo3257k(interfaceC0571F);
    }

    public C2174d(C1743k c1743k, InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        super(interfaceC18776i, i10, enumC1733a);
        this.f6660p0 = c1743k;
    }
}
