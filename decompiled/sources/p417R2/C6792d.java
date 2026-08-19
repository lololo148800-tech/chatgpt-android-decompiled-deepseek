package p417R2;

import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p351O2.C6084G;
import p351O2.InterfaceC6094h;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: R2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6792d implements InterfaceC6094h {

    /* JADX INFO: renamed from: a */
    public final C6084G f21800a;

    public C6792d(C6084G c6084g) {
        this.f21800a = c6084g;
    }

    @Override // p351O2.InterfaceC6094h
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo6650a() {
        return this.f21800a.f19814d;
    }

    @Override // p351O2.InterfaceC6094h
    /* JADX INFO: renamed from: b */
    public final Object mo6651b(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        return this.f21800a.mo6651b(new C6791c(interfaceC1439n, null), interfaceC18770c);
    }
}
