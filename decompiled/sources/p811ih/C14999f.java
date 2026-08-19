package p811ih;

import mm.C17296C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: ih.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14999f implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46687Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f46688Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18418a f46689o0;

    public /* synthetic */ C14999f(InterfaceC2184i interfaceC2184i, C18418a c18418a, int i10) {
        this.f46687Y = i10;
        this.f46688Z = interfaceC2184i;
        this.f46689o0 = c18418a;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        switch (this.f46687Y) {
            case 0:
                Object objMo3141d = this.f46688Z.mo3141d(new C14998e(interfaceC2186j, this.f46689o0, 0), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            default:
                Object objMo3141d2 = this.f46688Z.mo3141d(new C14998e(interfaceC2186j, this.f46689o0, 1), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
        }
    }
}
