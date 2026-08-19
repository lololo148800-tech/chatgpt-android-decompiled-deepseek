package p672c3;

import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: c3.B */
/* JADX INFO: loaded from: classes.dex */
public final class C11564B implements InterfaceC10492i {

    /* JADX INFO: renamed from: a */
    public InterfaceC10497n f34964a = C10495l.f31097a;

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C11564B c11564b = new C11564B();
        c11564b.f34964a = this.f34964a;
        return c11564b;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f34964a;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f34964a = interfaceC10497n;
    }
}
