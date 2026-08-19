package p478Tc;

import mm.C17296C;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7543h;
import p571X9.AbstractC9101A4;
import p759g1.C13800b;
import p894n0.C17409o;
import p894n0.InterfaceC17405k;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Tc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7299c implements InterfaceC17406l {

    /* JADX INFO: renamed from: a */
    public final C6002f0 f23108a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f23109b;

    /* JADX INFO: renamed from: c */
    public final C2127D0 f23110c;

    public C7299c() {
        C6002f0 c6002f0M6430Q = C5997d.m6430Q(null, C5975S.f19448r0);
        this.f23108a = c6002f0M6430Q;
        this.f23109b = c6002f0M6430Q;
        this.f23110c = AbstractC2124C.m3203b(0, 16, EnumC1733a.f4962Z, 1);
    }

    @Override // p894n0.InterfaceC17406l
    /* JADX INFO: renamed from: a */
    public final boolean mo7767a(InterfaceC17405k interfaceC17405k) {
        m7770d(interfaceC17405k);
        return this.f23110c.mo3231f(interfaceC17405k);
    }

    @Override // p894n0.InterfaceC17406l
    /* JADX INFO: renamed from: b */
    public final C2127D0 mo7768b() {
        return this.f23110c;
    }

    @Override // p894n0.InterfaceC17406l
    /* JADX INFO: renamed from: c */
    public final Object mo7769c(InterfaceC17405k interfaceC17405k, InterfaceC18770c interfaceC18770c) {
        m7770d(interfaceC17405k);
        Object objMo395a = this.f23110c.mo395a(interfaceC17405k, interfaceC18770c);
        return objMo395a == EnumC19250a.f61036Y ? objMo395a : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: d */
    public final void m7770d(InterfaceC17405k interfaceC17405k) {
        if (interfaceC17405k instanceof C17409o) {
            long j10 = ((C17409o) interfaceC17405k).f55604a;
            this.f23108a.setValue(new C7543h(AbstractC9101A4.m9631a((int) C13800b.m15306g(j10), (int) C13800b.m15307h(j10))));
        }
    }
}
