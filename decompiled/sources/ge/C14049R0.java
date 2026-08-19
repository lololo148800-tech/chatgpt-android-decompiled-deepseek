package ge;

import mm.C17296C;
import p086D6.C1970n;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: ge.R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14049R0 implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44163Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1970n f44164Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14053T0 f44165o0;

    public /* synthetic */ C14049R0(C1970n c1970n, C14053T0 c14053t0, int i10) {
        this.f44163Y = i10;
        this.f44164Z = c1970n;
        this.f44165o0 = c14053t0;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        switch (this.f44163Y) {
            case 0:
                Object objMo3141d = this.f44164Z.mo3141d(new C14048Q0(interfaceC2186j, this.f44165o0, 0), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            default:
                Object objMo3141d2 = this.f44164Z.mo3141d(new C14048Q0(interfaceC2186j, this.f44165o0, 1), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
        }
    }
}
