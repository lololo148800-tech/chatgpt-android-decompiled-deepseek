package p129En;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p008A6.C0384d;
import p025An.AbstractC0575H;
import p066Cc.C1625b;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1758z;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p153Fn.AbstractC2923a;
import p972qm.C18771d;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: En.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2598i extends AbstractC2596g {

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC2184i f8053p0;

    public AbstractC2598i(int i10, EnumC1733a enumC1733a, InterfaceC2184i interfaceC2184i, InterfaceC18776i interfaceC18776i) {
        super(interfaceC18776i, i10, enumC1733a);
        this.f8053p0 = interfaceC2184i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // p129En.AbstractC2596g, p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objMo3141d;
        C17296C c17296c = C17296C.f55119a;
        if (this.f8048Z == -3) {
            InterfaceC18776i context = interfaceC18770c.getContext();
            Boolean bool = Boolean.FALSE;
            C0384d c0384d = new C0384d(2);
            InterfaceC18776i interfaceC18776i = this.f8047Y;
            InterfaceC18776i interfaceC18776iPlus = !((Boolean) interfaceC18776i.fold(bool, c0384d)).booleanValue() ? context.plus(interfaceC18776i) : AbstractC0575H.m1188q(context, interfaceC18776i, false);
            if (AbstractC16544l.m18089b(interfaceC18776iPlus, context)) {
                objMo3141d = mo3616l(interfaceC2186j, interfaceC18770c);
                if (objMo3141d != EnumC19250a.f61036Y) {
                    return c17296c;
                }
            } else {
                C18771d c18771d = C18771d.f59681Y;
                if (AbstractC16544l.m18089b(interfaceC18776iPlus.get(c18771d), context.get(c18771d))) {
                    InterfaceC18776i context2 = interfaceC18770c.getContext();
                    if (!(interfaceC2186j instanceof C2586F) && !(interfaceC2186j instanceof C2581A)) {
                        interfaceC2186j = new C1625b(interfaceC2186j, context2);
                    }
                    objMo3141d = AbstractC2592c.m3615c(interfaceC18776iPlus, interfaceC2186j, AbstractC2923a.m3741o(interfaceC18776iPlus), new C2597h(this, null), interfaceC18770c);
                    if (objMo3141d != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                } else {
                    objMo3141d = super.mo3141d(interfaceC2186j, interfaceC18770c);
                    if (objMo3141d != EnumC19250a.f61036Y) {
                        return c17296c;
                    }
                }
            }
        } else {
            objMo3141d = super.mo3141d(interfaceC2186j, interfaceC18770c);
            if (objMo3141d != EnumC19250a.f61036Y) {
                return c17296c;
            }
        }
        return objMo3141d;
    }

    @Override // p129En.AbstractC2596g
    /* JADX INFO: renamed from: g */
    public final Object mo3253g(InterfaceC1758z interfaceC1758z, InterfaceC18770c interfaceC18770c) {
        Object objMo3616l = mo3616l(new C2586F(interfaceC1758z), interfaceC18770c);
        return objMo3616l == EnumC19250a.f61036Y ? objMo3616l : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo3616l(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c);

    @Override // p129En.AbstractC2596g
    public final String toString() {
        return this.f8053p0 + " -> " + super.toString();
    }
}
