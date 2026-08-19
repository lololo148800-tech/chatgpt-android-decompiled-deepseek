package p103Dn;

import java.util.Iterator;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1757y;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1730B;
import p077Cn.InterfaceC1758z;
import p129En.AbstractC2596g;
import p129En.C2586F;
import p129En.C2595f;
import p129En.C2605p;
import p523V9.AbstractC8017W3;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.e */
/* JADX INFO: loaded from: classes2.dex */
public class C2176e extends AbstractC2596g {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f6663p0 = 0;

    /* JADX INFO: renamed from: q0 */
    public final Object f6664q0;

    public C2176e(Iterable iterable, InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        super(interfaceC18776i, i10, enumC1733a);
        this.f6664q0 = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.n, sm.j] */
    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: g */
    public Object mo3253g(InterfaceC1758z interfaceC1758z, InterfaceC18770c interfaceC18770c) {
        switch (this.f6663p0) {
            case 0:
                Object objInvoke = ((AbstractC19694j) this.f6664q0).invoke(interfaceC1758z, interfaceC18770c);
                return objInvoke == EnumC19250a.f61036Y ? objInvoke : C17296C.f55119a;
            default:
                C2586F c2586f = new C2586F(interfaceC1758z);
                Iterator it = ((Iterable) this.f6664q0).iterator();
                while (it.hasNext()) {
                    AbstractC0575H.m1156D(interfaceC1758z, null, null, new C2605p((InterfaceC2184i) it.next(), c2586f, null), 3);
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.n, sm.j] */
    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: h */
    public AbstractC2596g mo3254h(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        switch (this.f6663p0) {
            case 0:
                return new C2176e((InterfaceC1439n) this.f6664q0, interfaceC18776i, i10, enumC1733a);
            default:
                return new C2176e((Iterable) this.f6664q0, interfaceC18776i, i10, enumC1733a);
        }
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: k */
    public InterfaceC1730B mo3257k(InterfaceC0571F interfaceC0571F) {
        switch (this.f6663p0) {
            case 1:
                InterfaceC1439n c2595f = new C2595f(this, null);
                EnumC1733a enumC1733a = EnumC1733a.f4961Y;
                EnumC0573G enumC0573G = EnumC0573G.f1790Y;
                C1757y c1757y = new C1757y(AbstractC0575H.m1157E(interfaceC0571F, this.f8047Y), AbstractC8017W3.m8337a(this.f8048Z, 4, enumC1733a), true, true);
                c1757y.m1226i0(enumC0573G, c1757y, c2595f);
                return c1757y;
            default:
                return super.mo3257k(interfaceC0571F);
        }
    }

    @Override // p129En.AbstractC2596g
    public String toString() {
        switch (this.f6663p0) {
            case 0:
                return "block[" + ((AbstractC19694j) this.f6664q0) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2176e(InterfaceC1439n interfaceC1439n, InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        super(interfaceC18776i, i10, enumC1733a);
        this.f6664q0 = (AbstractC19694j) interfaceC1439n;
    }
}
