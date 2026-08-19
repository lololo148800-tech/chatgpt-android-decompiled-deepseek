package p736f0;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21066U;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: f0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13490h implements InterfaceC21066U {

    /* JADX INFO: renamed from: Y */
    public final C6002f0 f42703Y;

    public C13490h(boolean z6) {
        this.f42703Y = C5997d.m6430Q(Boolean.valueOf(z6), C5975S.f19448r0);
    }

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

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p1095x1.InterfaceC21066U
    /* JADX INFO: renamed from: b */
    public final Object mo10940b(InterfaceC7537b interfaceC7537b, Object obj) {
        return this;
    }
}
