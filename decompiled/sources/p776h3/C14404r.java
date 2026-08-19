package p776h3;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p637a3.InterfaceC10496m;
import p637a3.InterfaceC10497n;
import p672c3.C11627r;
import p884m3.AbstractC17148g;

/* JADX INFO: renamed from: h3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C14404r implements InterfaceC10496m {

    /* JADX INFO: renamed from: a */
    public final AbstractC17148g f45151a;

    public C14404r(AbstractC17148g abstractC17148g) {
        this.f45151a = abstractC17148g;
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
