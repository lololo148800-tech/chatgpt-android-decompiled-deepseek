package p278L0;

import mm.C17296C;
import p041Be.C1217J;
import p049Bm.InterfaceC1439n;
import p658b5.C11246q;
import p773h0.EnumC14284g0;
import p860l0.C16789w0;
import p860l0.InterfaceC16658A0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: L0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4894u implements InterfaceC16658A0 {

    /* JADX INFO: renamed from: a */
    public final C4893t f15950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11246q f15951b;

    public C4894u(C11246q c11246q) {
        this.f15951b = c11246q;
        this.f15950a = new C4893t(c11246q, 0);
    }

    @Override // p860l0.InterfaceC16658A0
    /* JADX INFO: renamed from: a */
    public final Object mo5517a(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) throws Throwable {
        Object objM12633c = this.f15951b.m12633c(enumC14284g0, new C1217J(this, (C16789w0) interfaceC1439n, null, 2), (AbstractC19687c) interfaceC18770c);
        return objM12633c == EnumC19250a.f61036Y ? objM12633c : C17296C.f55119a;
    }
}
