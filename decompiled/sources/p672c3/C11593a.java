package p672c3;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p637a3.InterfaceC10496m;
import p637a3.InterfaceC10497n;
import p776h3.C14389c;

/* JADX INFO: renamed from: c3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11593a implements InterfaceC10496m {

    /* JADX INFO: renamed from: a */
    public final C14389c f35077a;

    public C11593a(C14389c c14389c) {
        this.f35077a = c14389c;
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
}
