package p344Nl;

import mm.C17296C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p129En.AbstractC2592c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Nl.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5819A implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18988Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i[] f18989Z;

    public /* synthetic */ C5819A(InterfaceC2184i[] interfaceC2184iArr, int i10) {
        this.f18988Y = i10;
        this.f18989Z = interfaceC2184iArr;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        switch (this.f18988Y) {
            case 0:
                InterfaceC2184i[] interfaceC2184iArr = this.f18989Z;
                Object objM3613a = AbstractC2592c.m3613a(new C5853y(interfaceC2184iArr, 0), new C5854z(3, null, 0), interfaceC2186j, interfaceC18770c, interfaceC2184iArr);
                return objM3613a == EnumC19250a.f61036Y ? objM3613a : C17296C.f55119a;
            default:
                InterfaceC2184i[] interfaceC2184iArr2 = this.f18989Z;
                Object objM3613a2 = AbstractC2592c.m3613a(new C5853y(interfaceC2184iArr2, 1), new C5854z(3, null, 1), interfaceC2186j, interfaceC18770c, interfaceC2184iArr2);
                return objM3613a2 == EnumC19250a.f61036Y ? objM3613a2 : C17296C.f55119a;
        }
    }
}
