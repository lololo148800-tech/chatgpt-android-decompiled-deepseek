package p936p0;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10457o;
import p635a1.InterfaceC10459q;
import p860l0.InterfaceC16736e1;

/* JADX INFO: renamed from: p0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C18275o implements InterfaceC10457o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58329Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC16736e1 f58330Z;

    public /* synthetic */ C18275o(InterfaceC16736e1 interfaceC16736e1, int i10) {
        this.f58329Y = i10;
        this.f58330Z = interfaceC16736e1;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        switch (this.f58329Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        int i10 = this.f58329Y;
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        switch (this.f58329Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return interfaceC1439n.invoke(obj, this);
    }
}
