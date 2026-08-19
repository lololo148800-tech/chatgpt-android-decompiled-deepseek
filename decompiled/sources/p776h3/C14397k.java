package p776h3;

import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: h3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C14397k implements InterfaceC10492i {

    /* JADX INFO: renamed from: a */
    public InterfaceC10497n f45138a = C10495l.f31097a;

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C14397k c14397k = new C14397k();
        c14397k.f45138a = this.f45138a;
        return c14397k;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f45138a;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f45138a = interfaceC10497n;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.f45138a + ')';
    }
}
