package p576Xe;

import mm.C17296C;
import p086D6.C1970n;
import p086D6.C1971o;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p787he.C14462S;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Xe.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9501z implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28607Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1970n f28608Z;

    public /* synthetic */ C9501z(C1970n c1970n, int i10) {
        this.f28607Y = i10;
        this.f28608Z = c1970n;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        switch (this.f28607Y) {
            case 0:
                Object objMo3141d = this.f28608Z.mo3141d(new C1971o(interfaceC2186j, 23), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            case 1:
                Object objMo3141d2 = this.f28608Z.mo3141d(new C14462S(interfaceC2186j, 4), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
            case 2:
                Object objMo3141d3 = this.f28608Z.mo3141d(new C14462S(interfaceC2186j, 8), interfaceC18770c);
                return objMo3141d3 == EnumC19250a.f61036Y ? objMo3141d3 : C17296C.f55119a;
            case 3:
                Object objMo3141d4 = this.f28608Z.mo3141d(new C14462S(interfaceC2186j, 10), interfaceC18770c);
                return objMo3141d4 == EnumC19250a.f61036Y ? objMo3141d4 : C17296C.f55119a;
            default:
                Object objMo3141d5 = this.f28608Z.mo3141d(new C14462S(interfaceC2186j, 12), interfaceC18770c);
                return objMo3141d5 == EnumC19250a.f61036Y ? objMo3141d5 : C17296C.f55119a;
        }
    }
}
