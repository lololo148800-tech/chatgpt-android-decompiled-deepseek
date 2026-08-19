package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p278L0.C4893t;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: l0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C16678H implements InterfaceC16658A0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f53419a;

    /* JADX INFO: renamed from: b */
    public final C4893t f53420b = new C4893t(this, 1);

    /* JADX INFO: renamed from: c */
    public final C14292k0 f53421c = new C14292k0();

    /* JADX WARN: Multi-variable type inference failed */
    public C16678H(InterfaceC1436k interfaceC1436k) {
        this.f53419a = (AbstractC16546n) interfaceC1436k;
    }

    @Override // p860l0.InterfaceC16658A0
    /* JADX INFO: renamed from: a */
    public final Object mo5517a(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        Object objM1183l = AbstractC0575H.m1183l(new C16675G(this, enumC14284g0, interfaceC1439n, null), interfaceC18770c);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
    }
}
