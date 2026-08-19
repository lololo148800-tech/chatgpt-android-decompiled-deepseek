package p124Ei;

import p086D6.C1971o;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p787he.C14462S;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Ei.W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2484W0 implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7735Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2153Q0 f7736Z;

    public /* synthetic */ C2484W0(C2153Q0 c2153q0, int i10) {
        this.f7735Y = i10;
        this.f7736Z = c2153q0;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        switch (this.f7735Y) {
            case 0:
                this.f7736Z.mo3141d(new C1971o(interfaceC2186j, 4), interfaceC18770c);
                break;
            case 1:
                this.f7736Z.mo3141d(new C1971o(interfaceC2186j, 22), interfaceC18770c);
                break;
            case 2:
                this.f7736Z.mo3141d(new C14462S(interfaceC2186j, 2), interfaceC18770c);
                break;
            case 3:
                this.f7736Z.mo3141d(new C14462S(interfaceC2186j, 5), interfaceC18770c);
                break;
            case 4:
                this.f7736Z.mo3141d(new C14462S(interfaceC2186j, 6), interfaceC18770c);
                break;
            default:
                this.f7736Z.mo3141d(new C14462S(interfaceC2186j, 9), interfaceC18770c);
                break;
        }
        return EnumC19250a.f61036Y;
    }
}
