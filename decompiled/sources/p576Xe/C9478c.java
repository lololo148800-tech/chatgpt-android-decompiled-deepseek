package p576Xe;

import mm.C17296C;
import p086D6.C1970n;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Xe.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9478c implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1970n f28527Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f28528Z;

    public C9478c(C1970n c1970n, boolean z6) {
        this.f28527Y = c1970n;
        this.f28528Z = z6;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objMo3141d = this.f28527Y.mo3141d(new C9477b(interfaceC2186j, this.f28528Z), interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }
}
