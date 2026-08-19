package p637a3;

import p776h3.C14393g;

/* JADX INFO: renamed from: a3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10493j implements InterfaceC10492i {

    /* JADX INFO: renamed from: b */
    public C10484a f31091b;

    /* JADX INFO: renamed from: c */
    public C10499p f31092c;

    /* JADX INFO: renamed from: a */
    public InterfaceC10497n f31090a = C10495l.f31097a;

    /* JADX INFO: renamed from: d */
    public int f31093d = 1;

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C10493j c10493j = new C10493j();
        c10493j.f31090a = this.f31090a;
        c10493j.f31091b = this.f31091b;
        c10493j.f31092c = this.f31092c;
        c10493j.f31093d = this.f31093d;
        return c10493j;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f31090a;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f31090a = interfaceC10497n;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f31090a + ", provider=" + this.f31091b + ", colorFilterParams=" + this.f31092c + ", contentScale=" + ((Object) C14393g.m15896b(this.f31093d)) + ')';
    }
}
