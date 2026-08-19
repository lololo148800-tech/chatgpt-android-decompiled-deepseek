package p773h0;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21660F;
import p492U1.C7550o;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14332J;
import p774h1.C14330H;
import p774h1.InterfaceC14339Q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: h0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14294l0 implements InterfaceC14268X, InterfaceC14300o0, InterfaceC14339Q {

    /* JADX INFO: renamed from: Z */
    public static final C14294l0 f44877Z = new C14294l0(0);

    /* JADX INFO: renamed from: o0 */
    public static final C14294l0 f44878o0 = new C14294l0(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44879Y;

    public /* synthetic */ C14294l0(int i10) {
        this.f44879Y = i10;
    }

    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: a */
    public InterfaceC10459q mo15579a() {
        return C10456n.f30959Y;
    }

    @Override // p773h0.InterfaceC14268X
    /* JADX INFO: renamed from: b */
    public void mo4225b(C21660F c21660f) {
        c21660f.m22080a();
    }

    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: c */
    public boolean mo15580c() {
        return false;
    }

    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: d */
    public long mo15581d(long j10, int i10, InterfaceC1436k interfaceC1436k) {
        return ((C13800b) interfaceC1436k.invoke(new C13800b(j10))).f43584a;
    }

    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: e */
    public Object mo15582e(long j10, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        Object objInvoke = interfaceC1439n.invoke(new C7550o(j10), interfaceC18770c);
        return objInvoke == EnumC19250a.f61036Y ? objInvoke : C17296C.f55119a;
    }

    @Override // p774h1.InterfaceC14339Q
    /* JADX INFO: renamed from: o */
    public AbstractC14332J mo4178o(long j10, EnumC7546k enumC7546k, InterfaceC7537b interfaceC7537b) {
        switch (this.f44879Y) {
            case 3:
                float fMo7866k0 = interfaceC7537b.mo7866k0(AbstractC14319y.f44945a);
                return new C14330H(new C13801c(0.0f, -fMo7866k0, C13803e.m15333e(j10), C13803e.m15331c(j10) + fMo7866k0));
            default:
                float fMo7866k1 = interfaceC7537b.mo7866k0(AbstractC14319y.f44945a);
                return new C14330H(new C13801c(-fMo7866k1, 0.0f, C13803e.m15333e(j10) + fMo7866k1, C13803e.m15331c(j10)));
        }
    }
}
