package p1140z1;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10457o;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: z1.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21672S implements InterfaceC10457o {
    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC10458p mo11196a();

    /* JADX INFO: renamed from: i */
    public abstract void mo11197i(AbstractC10458p abstractC10458p);

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }
}
