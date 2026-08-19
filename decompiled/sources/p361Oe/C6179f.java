package p361Oe;

import mm.C17296C;
import p086D6.C1970n;
import p086D6.C1971o;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Oe.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6179f implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20127Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1970n f20128Z;

    public /* synthetic */ C6179f(C1970n c1970n, int i10) {
        this.f20127Y = i10;
        this.f20128Z = c1970n;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        switch (this.f20127Y) {
            case 0:
                Object objMo3141d = this.f20128Z.mo3141d(new C1971o(interfaceC2186j, 17), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            default:
                Object objMo3141d2 = this.f20128Z.mo3141d(new C1971o(interfaceC2186j, 26), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
        }
    }
}
