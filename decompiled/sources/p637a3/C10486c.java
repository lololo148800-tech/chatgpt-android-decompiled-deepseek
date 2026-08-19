package p637a3;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p672c3.C11627r;
import p776h3.C14393g;

/* JADX INFO: renamed from: a3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10486c implements InterfaceC10496m {

    /* JADX INFO: renamed from: a */
    public final C10484a f31067a;

    /* JADX INFO: renamed from: b */
    public final int f31068b;

    /* JADX INFO: renamed from: c */
    public final C10487d f31069c;

    public C10486c(C10484a c10484a, int i10, C10487d c10487d) {
        this.f31067a = c10484a;
        this.f31068b = i10;
        this.f31069c = c10487d;
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: a */
    public final boolean mo10951a(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC10497n mo10952b(InterfaceC10497n interfaceC10497n) {
        return AbstractC9306j0.m9883b(this, interfaceC10497n);
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: c */
    public final boolean mo10953c() {
        C11627r.f35235p0.invoke(this);
        return Boolean.TRUE.booleanValue();
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: j */
    public final Object mo10954j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    public final String toString() {
        return "BackgroundModifier(colorFilter=" + this.f31069c + ", imageProvider=" + this.f31067a + ", contentScale=" + ((Object) C14393g.m15896b(this.f31068b)) + ')';
    }
}
